package Classe_x_Objeto;

public class Casa {

	private int tamanhoM2;
	private int andares;
	private long valor;
	private int numeroVagas;
	
	public Casa(int tamanhoM2, int andares, long valor, int numeroVagas) {
		this.tamanhoM2 = tamanhoM2;
		this.andares = andares;
		this.valor = valor;
		this.numeroVagas = numeroVagas;
	}

	public int getTamanhoM2() {
		return tamanhoM2;
	}

	public void setTamanhoM2(int tamanhoM2) {
		this.tamanhoM2 = tamanhoM2;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	@Override
	public String toString() {
		return "Casa [tamanhoM2=" + tamanhoM2 + ", andares=" + andares + ", valor=" + valor + ", numeroVagas="
				+ numeroVagas + "]";
	}

}
