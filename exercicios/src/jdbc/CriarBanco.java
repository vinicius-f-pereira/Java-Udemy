package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "1234";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

		System.out.println("O banco foi criado com sucesso!");

		conexao.close();
	}

}
 