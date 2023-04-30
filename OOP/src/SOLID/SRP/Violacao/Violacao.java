package SOLID.SRP.Violacao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Violacao {

	public class Cliente {
		public int clienteId;
		public String nome;
		public String email;
		public String cpf;
		public LocalDate dataCadastro;

		public String adicionarCliente() {
			if (!this.email.contains("@"))
				return "Cliente com em-mail invalido";
			if (this.cpf.length() != 11)
				return "Cliente com cpf invalido";

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pass = "123";

			String sql = "insert into cliente values ('" + this.nome + "','" + this.email + "')";
			Connection conn = null;

			try {
				conn = DriverManager.getConnection(url, user, pass);
				Statement st = (Statement) conn.createStatement();
				st.execute();
				conn.close();

				Properties props = new Properties();
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.port", "465");

				Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("seuemail@gmail.com", "suasenha123");
					}
				});

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("seuemail@gmail.com"));
				// Remetente

				Address[] toUser = InternetAddress // Destinatário(s)
						.parse("seuamigo@gmail.com, seucolega@hotmail.com, seuparente@yahoo.com.br");

				message.setRecipients(Message.RecipientType.TO, toUser);
				message.setSubject("Enviando email com JavaMail");// Assunto
				message.setText("Enviei este email utilizando JavaMail com minha conta GMail!");
				/** Método para enviar a mensagem criada */
				Transport.send(message);
				

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return "Cliente cadastrado com sucesso";

		}
	}

}
