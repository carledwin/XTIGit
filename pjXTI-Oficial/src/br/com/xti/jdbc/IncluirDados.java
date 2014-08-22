package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws Exception {
		
		
		//limpar tabela antes de inserir os dados no teste
		//delete from pessoa where codigo > 6;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//permite a inclus�o de um registro por vez
		String sqlUmRegistroPorVez = "insert into pessoa values(7, 'Caio3','M', 'xti3@email.com.br')"; 
		
		
		/* para varios*/ //array de strings
		String[] pessoas = {"Sandra", "Beatriz", "Juliana", "Fatima","Veranda","Tereza","Leila"};
		
		
		/* para varios*/
		
		//permite a inclus�o de um registro por vez - alterando os valores por parametros ?
		String sqlVariosRegistrosPorVez = "insert into pessoa values(?, ?,?,?)";
		
		//Evitar abrir varias conex�es com o banco de dados, pois � muito caro falando de consumo de rede, tempo...
		/*try(Connection con = DriverManager.getConnection(url, "carledwinj", "sa123");
			PreparedStatement stm = con.prepareStatement(sqlVariosRegistrosPorVez);//cada statement � uma nova conex�o com o banco de dados
			){*/
		
		// um try para conex�o 
		try(Connection con = DriverManager.getConnection(url, "carledwinj", "sa123");){
		
							//um try para capturar a exe��o da execu��o do statement
							//cada statement � uma nova conex�o com o banco de dados
							try(PreparedStatement stm = con.prepareStatement(sqlVariosRegistrosPorVez);){
									/* para varios*/
									for (int i = 0; i < pessoas.length; i++) {
										//primeiro parametro - no caso do tipo inteiro e a posi��o de i + quantidade de registros j� registrados na tabela
										stm.setInt(1, i+8);
										//nome da pessoa - segundo campo
										stm.setString(2, pessoas[i]);
										//sexo - terceiro parametro
										stm.setString(3, "F");
										//email - quarto parametro
										stm.setString(4, pessoas[i].toLowerCase() + "@xti.com.br" );
										//inclui as instru��es em um bloco de instru��es a serem executadas
										//para executar somente no final
										stm.addBatch();
									}
									/* final para varios*/
						
								//executa os comandos de - insert, delete, update
								//para executar varias inclus�es por vez aproveitando o mesmo statement 
								stm.executeBatch();
								System.out.println("V�rios registros incluidos com sucesso!");
								
								//executa os comandos de - insert, delete, update
								//para executar uma inclus�o por vez
								//stm.executeUpdate();
								//System.out.println("Um registro incluido com sucesso!");
					}catch(SQLException e){ 
						System.out.println("Erro ao tentar executar o statment" + e);
					}

							
							
					String sqlDeConsulta = "select nome, email from pessoa";
					try(PreparedStatement stm2 = con.prepareStatement(sqlDeConsulta);
						ResultSet rs = stm2.executeQuery();) 
						{
							while(rs.next()){
								System.out.println(rs.getString(1) + " : " + rs.getString(2));
								
							}
						} catch (SQLException e) {
							System.out.println("Erro ao tentar realizar a consulta.");
						}		
							
							
							
							
		}catch(SQLException e){ 
		System.out.println("Erro de Conex�o." + e);
		}
}
}
