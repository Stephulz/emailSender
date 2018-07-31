package emailSender;

public class Main {

	    public static void main(String[] args) {

	        PojoEmail objEmail = new PojoEmail();
	        sendEmail Email = new sendEmail();
	        
	        objEmail.setEmailDestinatario("e-mail@mail.com");
	        objEmail.setAssunto("Assunto");
	        objEmail.setMensagem("Mensagem");
	        Email.Spam(objEmail);

  }
}
