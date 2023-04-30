package Heranca_x_Composicao;

import Heranca.Pessoa;

public class Cases2 {

	public interface IRepositorio<T> {
		void adicionar(T obj);
		void excluir(T obj);
	}
	
	public interface IRepositorioPessoa {
		void adicionar(Pessoa obj);
	}
	
	public class Repositorio<T> implements IRepositorio<T> {

		@Override
		public void adicionar(T obj) {
			
		}

		@Override
		public void excluir(T obj) {
			
		}	
	}
	
	public class RepositorioHerancaPessoa extends Repositorio<Pessoa> implements IRepositorioPessoa{
		
	}
	
	public class RepositorioComposicaoPessoa implements IRepositorioPessoa {

		private IRepositorio<Pessoa> repositorioPessoa;
		
		public RepositorioComposicaoPessoa(IRepositorio<Pessoa> repositorioPessoa) {
			this.repositorioPessoa = repositorioPessoa;
		}
		
		@Override
		public void adicionar(Pessoa obj) {
			this.repositorioPessoa.adicionar(obj);
		}
	}
	
	public static void main(String[] args) {
		Cases2 c = new Cases2();
		RepositorioHerancaPessoa repoH = c.new RepositorioHerancaPessoa();
		repoH.adicionar(new Pessoa());
		repoH.excluir(new Pessoa());
		
		RepositorioComposicaoPessoa repoC = c.new RepositorioComposicaoPessoa(c.new Repositorio<Pessoa>());
		repoC.adicionar(new Pessoa());		
	}
	
	
}
