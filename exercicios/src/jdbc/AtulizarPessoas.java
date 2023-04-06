package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtulizarPessoas {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);		

		System.out.print("Informe o ID para a ser atualizado: ");
		int ID = entrada.nextInt();
				
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, ID);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é: " + p.getNome());
			entrada.nextLine();
			
			System.out.println("informe o nome: ");
			String novoNome = entrada.nextLine();
			
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, ID);
			stmt.execute();
			
			
			System.out.println("Pessoa atualizada com sucesso!");
			
		}
//		
//		
//		
//		
//		System.out.println("Informe o nome para atualizar: ");
//		String nome = entrada.nextLine();
//		
//		stmt.setString(1, nome);
//		stmt.execute();
//		
		
		
		
		conexao.close();
		entrada.close();
		
	}
}
