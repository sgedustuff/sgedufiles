import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class TestSendingMail {

	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		monitoringMail mail = new monitoringMail();
		mail.sendMail(TestConfig.server, 
				TestConfig.from, 
				TestConfig.to, 
				TestConfig.subject, 
				TestConfig.messageBody, 
				TestConfig.attachmentPath, 
				TestConfig.attachmentName);
		System.out.println("Mail Sent Successfully.");
	}

}
