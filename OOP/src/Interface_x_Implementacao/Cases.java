package Interface_x_Implementacao;

public class Cases {

	public interface IRepositorio {
		void adicionar();
	}
	
	public class Repositorio implements IRepositorio {
		
		@Override
		public void adicionar() {
			System.out.println("add rep");
		}	
	}
	
	public class RepositorioFake implements IRepositorio {

		@Override
		public void adicionar() {
			System.out.println("add rep fake");
		}
	}
	
	public class UsoImplementacao {
		public void processo() {
			Repositorio rep = new Repositorio();
			rep.adicionar();
		}
	}
	
	public class UsoAbstracao {
		private IRepositorio repo;
		
		public UsoAbstracao(IRepositorio repo) {
			this.repo = repo;
		}
		
		public void processo() {
			repo.adicionar();
		}
	}
	
	public static void main(String args[]) {
		Cases c = new Cases();
		UsoImplementacao repoImp = c.new UsoImplementacao();
		repoImp.processo();
		
		UsoAbstracao repoAbstracao = c.new UsoAbstracao(c.new Repositorio());
		repoAbstracao.processo();
		
		UsoAbstracao repoAbstracaoFake = c.new UsoAbstracao(c.new RepositorioFake());
		repoAbstracaoFake.processo();
		
	}
	
	
	
}
