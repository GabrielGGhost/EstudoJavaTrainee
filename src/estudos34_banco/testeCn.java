package estudos34_banco;

public class testeCn {
	public static void main(String[] args) {
		
		try {
			SqlBuilder cn = new SqlBuilder();
			
			//Filme f1 = new Filme("", "Drama Total", 2007, "Descri��o b�sica", "Com�dia");
			//Filme f2 = new Filme("", "Pokemon 2000", 2000, "Descri��o b�sica master", "Drama");
			//Filme f3 = new Filme("", "DBZ", 2004, "Descri��o ruim", "Suspense");
			
			Filme f = new Filme();
			//cn.insertMovies(f2);
			f = cn.getMovie(14);
			//f.setDescricao("Filme mudado de nome");
			//cn.updateMovie(f);
			
			//if(f != null) {
			//	cn.deleteMovie(f.getId());
			//}
			//System.out.println(f.getDescricao());
						
			cn.getMovies();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
}
