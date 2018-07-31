package emailSender;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class sendEmail {
	
	private static void sendEmail(PojoEmail objEmail)   {
        SimpleEmail email = new SimpleEmail(); // cria um novo objeto email
        email.setHostName("smtp.gmail.com");//troca o nome do host smtp
        email.setSmtpPort(465); // porta de acordo com o host smtp
        try {
            email.addTo(objEmail.getEmailDestinatario()); // destinatario do email
        } catch (EmailException e) {
            e.printStackTrace();
        }
        try {
            email.setFrom("e-mail@mail.com", "Title"); // remetente
        } catch (EmailException e) {
            e.printStackTrace();
        }
        email.setSubject(objEmail.getAssunto()); // assunto do email
        try {
            email.setMsg(objEmail.getMensagem()); // mensagem do email
        } catch (EmailException e) {
            e.printStackTrace();
        }
        email.setSSL(true);
        email.setAuthentication("e-mail@mail.com", "password"); // email e senha do remetente
        try {
            email.send(); // envia o email
            System.out.println("Successfully sent to "+objEmail.getEmailDestinatario());
        } catch (EmailException e) {
            e.printStackTrace();
        }  
    }

	public void Spam(PojoEmail objEmail) {
		sendEmail(objEmail);	
	}
}


