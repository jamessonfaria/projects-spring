package Abstracao;

public abstract class Eletrodomestico {

	private String nome;
	private int voltagem;

	protected Eletrodomestico(String nome, int voltagem) {
		this.setNome(nome);
		this.setVoltagem(voltagem);
	}

	protected abstract void ligar();

	protected abstract void desligar();
	
	protected final void testar() {
		System.out.println("testando equipamento ...");
	}
	
	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
