package br.com.jamesson.testespring.cases.gereric;

public class GenericRepository<T> implements IGenericRepository<T> {

	@Override
	public void adicionar(T obj) {
		System.out.println("add gereric...");
	}

}
