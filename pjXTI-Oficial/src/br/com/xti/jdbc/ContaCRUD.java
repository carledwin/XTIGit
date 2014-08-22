package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {

	
	//inclui conta no banco de dados
	public void criar(Connection con, Conta conta) throws SQLException{
		String sql = "insert into conta values(?,?,?)";
		
		try(PreparedStatement stm = con.prepareStatement(sql);){
			stm.setInt(1, conta.getNumero());
			stm.setString(2, conta.getCliente());
			stm.setDouble(3, conta.getSaldo());	
			stm.executeUpdate();
			
			System.out.println("Cliente: " + conta.getCliente() + " incluido com sucesso!");
		}catch(SQLException e){
			System.out.println("Erro ao tentar realizar a inclusão de uma conta. " + e);
		}
	}
	
	
	//le as contas retornadas do banco de dados
	public List<Conta> ler(Connection con){
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero, cliente, saldo from conta";
		
		try(PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
				while(rs.next()){
					lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
				}
				
				System.out.println("Consulta a contas realizada com sucesso!");
		}catch(SQLException e){
			System.out.println("Erro ao tentar realizar a consulta a tabela conta. " + e);
		}
		return lista;
	}
	
	
	
	//alterar conta no banco de dados
	public void alterar(Connection con, Conta conta) throws SQLException{
		String sql = "update conta set cliente=?, saldo=? where numero=?";
		
		try(PreparedStatement stm = con.prepareStatement(sql);){
			//atentar para a posição do registro, parametro no statement
			stm.setString(1, conta.getCliente()); //parametro 1 cliente
			stm.setDouble(2, conta.getSaldo());	//parametro 2 saldo
			stm.setInt(3, conta.getNumero()); //parametro 3 numero
			stm.executeUpdate();
			
			System.out.println("Cliente: " + conta.getCliente() + " alterado com sucesso!");
		}catch(SQLException e){
			System.out.println("Erro ao tentar alterar uma conta. " + e);
		}
	}
	

	//excluir conta no banco de dados
	public void excluir(Connection con, Conta conta) throws SQLException{
		String sql = "delete conta where numero=?";
		
		try(PreparedStatement stm = con.prepareStatement(sql);){
			//atentar para a posição do registro, parametro no statement
			stm.setInt(1, conta.getNumero()); //parametro 1 numero
			stm.executeUpdate();//executar o comando
			
			System.out.println("Cliente: " + conta.getCliente() + " excluido com sucesso!");
		}catch(SQLException e){
			System.out.println("Erro ao tentar excluir uma conta. " + e);
		}
	}
	
	
	//transferir valores - seguro
	public void transferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException{
		
		//1 verificar se conta de origem tem saldo
		if(origem.getSaldo() >= valor){
			
			//As duas operações devem ser confirmadas somente se ambas forem bem sucedidas
			//caso contrario a operação de saque deve ser desfeita
			
			//caso algum erro ocorra a transação deve ser cancelada, para isto
			//as operações serão colocadas no bloco try 
			
			try{
			//Abrea a TRANSAÇÃO
			//Para tanto é necessario definir que a conexao não será auto-comitada
			con.setAutoCommit(false);//a conexao começa a tratar as operaçoes de forma GLOBAL
			
			//NUNCA EXIBIR O SALDO DA CONTA EM UMA TRANSFERENCIA
			System.out.println("Origem: \n Saldo inicial: " + origem.getSaldo());
			/*SAQUE*/
			origem.setSaldo(origem.getSaldo() - valor); //saldo -= valor
			//alterar no banco de dados
			alterar(con, origem);
			
			
			//Caso ocorra algum erro até este ponto
			//throw new Exception("erro ao tentar realizar o SAQUE");
			
			//simular um erro no meio do caminho
			//int x = 1 / 0; //nenhum numero pode ser dividido por 0.
			
			
			
			//NUNCA EXIBIR O SALDO DA CONTA EM UMA TRANSFERENCIA
			System.out.println("Destino: \n Saldo inicial: " + destino.getSaldo());
			/*DEPOSITO*/
			destino.setSaldo(destino.getSaldo() + valor);
			//alterar valor no banco de dados
			alterar(con, destino);
			
			//confirma a TRANSAÇÃO, ou seja, todas as operações realizadas acima
			con.commit();
			
			System.out.println("Transferencia entre contas realizada com sucesso!");
			System.out.println("Do Cliente: " + origem.getCliente() + " o valor de: " + valor + " Para o Cliente: "+ destino.getCliente());
			
			//NUNCA EXIBIR O SALDO DA CONTA EM UMA TRANSFERENCIA
			System.out.println("Origem: \n Saldo após a transferência: " + origem.getSaldo());
			
			//NUNCA EXIBIR O SALDO DA CONTA EM UMA TRANSFERENCIA
			System.out.println("Destino: \n Saldo após a transferência: " + destino.getSaldo());
			
			}catch(Exception e){
				//desfazer a transação por um erro ocorrido
				con.rollback();
			}
			
		}
	}

	
	public static void main(String[] args) throws SQLException {
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try(Connection con = DriverManager.getConnection(url, "carledwinj", "sa123");){
			ContaCRUD crud = new ContaCRUD();

			Conta conta1 = new Conta(1, "Cliente 1", 123_123.98);
			Conta conta2 = new Conta(2, "Cliente 2", 1225_255.78);
			Conta conta3 = new Conta(3, "Cliente 3", 789_5465.45);
			
			Conta conta4 = new Conta(4, "Cliente 4", 123_123.98);
			Conta conta5 = new Conta(5, "Cliente 5", 1225_255.78);
			Conta conta6 = new Conta(6, "Cliente 6", 789_5465.45);
			
			
			//cria nova conta
			crud.criar(con, conta1);
			crud.criar(con, conta2);
			crud.criar(con, conta3);
			crud.criar(con, conta4);
			crud.criar(con, conta5);
			crud.criar(con, conta6);
			
			
			//ler todas as contas 
			List<Conta> contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta.toString());
			}
			
			//alterar conta
			Conta conta1_alteracao = new Conta(1, "CL 1 alterado", 789_123.98);
			crud.alterar(con, conta1_alteracao);
			
			//excluir conta
			Conta conta2_exclusao = new Conta(2, "Cliente 2", 1225_255.78);
			crud.excluir(con, conta2_exclusao);
			
						
			//ler todas as contas novamente
			List<Conta> contas2 = crud.ler(con);
			for (Conta item_conta2 : contas2) {
				System.out.println(item_conta2.toString());
			}
			
			
			//recuperar contas da lista para realizar a transferencia
			Conta origem = contas2.get(0);
			Conta destino = contas2.get(1);
			
			//transferir valor entre contas
			crud.transferir(con, origem, destino, 500.78);
			
			
			//ler todas as contas novamente
			List<Conta> contas3 = crud.ler(con);
			for (Conta item_conta3 : contas2) {
				System.out.println(item_conta3.toString());
			}
			
			
			/*Resultado
			 *  Origem: 
				 Saldo inicial: 7895465.45
				Cliente: Cliente 3 alterado com sucesso!
				3 , Cliente 3 , 7895465.45
				3 , Cliente 3 , 7894964.67
				Origem: 
				 Saldo após a transferência: 7894964.67
				
				Destino: 
				 Saldo inicial: 123123.98
				Cliente: Cliente 4 alterado com sucesso!
				4 , Cliente 4 , 123123.98
				4 , Cliente 4 , 123624.76
				Destino: 
				 Saldo após a transferência: 123624.76
				
				Transferencia entre contas realizada com sucesso!
				Do Cliente: Cliente 3 o valor de: 500.78 Para o Cliente: Cliente 4

			 */
			
		}catch(SQLException e){
			System.out.println("Erro ao tentar abrir conexão. " + e);
		}
		
	}
}
