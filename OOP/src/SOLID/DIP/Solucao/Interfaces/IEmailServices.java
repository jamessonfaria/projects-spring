package SOLID.DIP.Solucao.Interfaces;

public interface IEmailServices {
	public void enviar(String de, String para, String assunto, String mensagem, String senha);
}
