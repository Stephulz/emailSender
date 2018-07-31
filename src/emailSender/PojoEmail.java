package emailSender;

public class PojoEmail {

	private String EmailDestinatario;
	private String Nome;
	private String Assunto;
	private String Mensagem;
	
	public String getEmailDestinatario() {
		return EmailDestinatario;
	}
	public void setEmailDestinatario(String emailDestinatario) {
		EmailDestinatario = emailDestinatario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getAssunto() {
		return Assunto;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public void setAssunto(String assunto) {
		Assunto = assunto;
	}
	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	
}
