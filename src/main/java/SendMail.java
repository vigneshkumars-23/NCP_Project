import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
//
public class SendMail {
	String toemail;
	public SendMail(String toemail)
	{
		this.toemail = toemail;
	}
	public boolean sendEmail()
	{
		boolean test = false;
        String fromEmail = "ncpngo69@gmail.com";
        String password = "00B6329BDC36AB52720FF9583883F3B1AA15";
        try {

            // your host email smtp server details
            Properties pr = new Properties();
            pr.put("mail.smtp.host", "smtp.elasticemail.com");
            pr.put("mail.smtp.port", "465");
            pr.put("mail.smtp.auth", "true");
            pr.put("mail.smtp.starttls.enable", "true");
 
            //get session to authenticate the host email address and password
            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });
            Message mess = new MimeMessage(session);
            mess.setFrom(new InternetAddress(fromEmail));
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(this.toemail));
    		
    		//set email subject
            mess.setSubject("Event Registration Confirmaton");
            
    		//set message text
            mess.setText("You have successfully registered for the event. We hope to see you there!");
            //send the message
            Transport.send(mess);
            
            test=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
	}
}
