package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExclusaoDePessoas {

	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("A pessoa foi excluida!!!");
		} else {
			System.out.println("Não foi excluida :(");
			
		}
		
		
		entrada.close();
		conexao.close();
		
		
	}
}
