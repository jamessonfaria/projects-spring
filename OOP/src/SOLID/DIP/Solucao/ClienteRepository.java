package SOLID.DIP.Solucao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import SOLID.DIP.Solucao.Interfaces.IClienteRepository;

public class ClienteRepository implements IClienteRepository {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String pass = "123";
	
	public void adicionarCliente(Cliente cliente) {
		String sql = "insert into cliente values ('" + cliente.nome + "','" + cliente.email + "')";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, pass);
			Statement st = (Statement) conn.createStatement();
			st.execute();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
