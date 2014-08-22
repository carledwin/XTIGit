package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	//throws Exception no metodo main para ignorar os erros que por ventura venha a aparecer
	public static void main(String[] args) throws Exception {

		
		String sql = "select codigo, nome, sexo, email from pessoa";
		
		//protocolodecomunicacao jdbc, 
		//subprotocolodecomunicacao oracle:thin, 
		//nomedoservidor/enderecoIP @localhost ou 127.0.0.1, 
		//portatcp 1521, 
		//nomedobancodedados xe 
		//separador :
		//url informa onde esta o banco de dados
		//String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//antigamente havia a necessidade de informar o drive que seria utilizado
		//Class.forName("oracle.jdbc.OracleDriver");
		
		//atualmente o Driver será descoberto automaticamente
		
		//Conexao será realizada a partir do objeto Connection
		//recuperar a conexao a partir do DriverManager.getConnetion(url, usuario, senha)
		//Connection con = DriverManager.getConnection(url, "carledwinj", "carledwinj123");
		
		//criar um objeto Statement - utilizado para encaminhar requisições ao servidor
		//retorna um PreparedStament
		//prepareStatement tem como parametro o comando que se deseja executar
		//PreparedStatement stm = con.prepareStatement(sql);//muito mais flexivel, retorna um objeto muito mais flexivel
		
								// em relação ao createStatement
		
		//executar o comando
		//stm.executeQuery();//consulta ao banco de dados que sempre irá retornar uma lista de valores
		//stm.executeUpdate();//irá executar inclusão, exclusão ou alteração

		//Retornará um ResultSet - lista de tados proveniente a execução
//		ResultSet rs = stm.executeQuery();
		
		//fecha todos os resources automaticamente
		//try(Connection con = DriverManager.getConnection(url, "system", "123");
		try(Connection con = DriverManager.getConnection(url, "carledwinj", "sa123");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()){
			
			while(rs.next()){
				//captura todos os registros encontrados na columnIndex nome ou numero da coluna
				System.out.print(" Código: " + rs.getString("codigo"));
				System.out.print(" Nome: " + rs.getString("nome"));
				System.out.print(" Sexo: " + rs.getString(3));//a coluna vai de 1 a n
				System.out.println(" Email: " + rs.getString(4));
			}
		}
		
		
		//precisam ser fechados
		//rs.close();
		//con.close();
		//stm.close();
		// melhor utilizar o try, para que o mesmo se encarregue do fechamento dos resources

	}

}
