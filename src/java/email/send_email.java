package email;
import java.util.*; 
import javax.mail.*; 
import javax.mail.PasswordAuthentication;
import javax.mail.internet.*;
public class send_email {
	public static void sendMail(String text, String nom, String email, String subject) throws Exception {
		final String username = "zineb.elbekri@etu.uae.ac.ma";
		final String password = "Zineb@elbekri/1";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(username, password);
			}
		  });
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("zineb.elbekri@etu.uae.ac.ma"));
			message.setRecipient(Message.RecipientType.TO,
			new InternetAddress("zineb.elbekri@etu.uae.ac.ma"));
			message.setSubject(subject);
			message.setText("Name: "+nom+"\nE-Mail: "+email+"\nMessage: \n"+text);
			Transport.send(message);
			//System.out.println("Done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
        
        

}
