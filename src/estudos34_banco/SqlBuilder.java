package estudos34_banco;

import java.sql.*;

public class SqlBuilder {
	
	private static final String DRIVER = "jdbc";
	private static final String DB = "mysql";
	private static final String HOST = "localhost";
	private static final String IP = "3306";
	private static final String DATABASE = "banco";
	private static final String TIMEZONE = "?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	Connection cn;
	SqlBuilder() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.getConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado!");
		} catch (SQLException e) {
			System.out.println("Algo deu errado na conexão com o banco de dados!");
		}
		
	}
	
	private void getConnection() throws SQLException {

		cn = DriverManager.getConnection(
						SqlBuilder.DRIVER + ":" +
						SqlBuilder.DB + "://" +
						SqlBuilder.HOST + ":" +
						SqlBuilder.IP + "/" +
						SqlBuilder.DATABASE + 
						SqlBuilder.TIMEZONE,
						SqlBuilder.USER,
						SqlBuilder.PASSWORD);
		
	}
	
	public void getMovies() {
		
		try {
			Statement stmt = cn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from filmes");
			
			while(rs.next()) {
				System.out.println(rs.getObject(1) + "---" + 
								   rs.getObject(2) + '\t' +
								   rs.getObject(3) + '\t' +
								   rs.getObject(4) + '\t' +
								   rs.getObject(5) + '\t' +
								   rs.getObject(6));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void insertMovies(Filme f) {
		
		try {
			
		Statement stmt = cn.createStatement();
		
		stmt.executeUpdate("INSERT INTO filmes(arquivo,"
												+ "descricao,"
												+ "sinopse,"
												+ "ano,"
												+ "genero)"
									+ "Values('" + f.getArquivo() + "','"
												+ f.getDescricao() + "','"
												+ f.getSinopse() + "',"
												+ f.getAno() + ",'"
												+ f.getGenero() + "')");
		
		System.out.println("Filme inserido!");

		} catch (Exception ex) {
			System.out.println("Não foi possivel buscar os filmes do banco de dados!");
		}
	}
	
	public void updateMovie(Filme f) {
		
		try {
			Statement stmt = cn.createStatement();
			
			stmt.executeUpdate("UPDATE FILMES SET arquivo = '" + f.getArquivo()
													+ "', descricao = '" + f.getDescricao()
													+ "', sinopse = '" + f.getSinopse()
													+ "', ano = " + f.getAno()
													+ ", genero = '" + f.getGenero() + "'"
															+ "WHERE id = " + f.getId() + ";");
			
			System.out.println("Filme alterado!");

		} catch (Exception e) {
			
			System.out.println("Não foi possivel alterar o filme do banco de dados");

		}
		
		
	}
	
	public Filme getMovie(int id) {
		
		try {
			Filme f = null;
			Statement stmt = cn.createStatement();
			
			ResultSet count = stmt.executeQuery("SELECT count(*) FROM filmes WHERE id = " + id);
			int num = 0;
			
			while(count.next()) {
				num = count.getInt(1);
			}
			
			if(num != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM filmes WHERE id = " + id);
				
				while (rs.next()) {
					
					f = new Filme(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(5), rs.getString(4), rs.getString(6));
					return f;				
				}
			} else {
				System.out.println("O filme com este ID não existe no banco de dados");
			}
			
			
		} catch (Exception e) {
			System.out.println("Não foi possível buscar o filme no banco de dados!");
		}	
		return null;
	}
	
	public Filme deleteMovie(int id) {
		
		try {
			Filme f = null;
			Statement stmt = cn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM filmes WHERE id = " + id);

			if(rs != null) {
				
				stmt.executeUpdate("DELETE FROM filmes WHERE id = " + id);
				System.out.println("Filme deletado!");

			} else {
				System.out.println("O filme com este ID não existe no banco de dados");
			}
			

			return f;		
		} catch (Exception e) {
			System.out.println("Não foi possível buscar o filme no banco de dados!");
		}	
		return null;
	}
		
}

