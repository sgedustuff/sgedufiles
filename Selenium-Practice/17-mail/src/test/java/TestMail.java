import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import utilities.MonitoringMail;
import utilities.MailConfig;

public class TestMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonitoringMail mail = new MonitoringMail();
		try {
			mail.sendMail(MailConfig.server, MailConfig.from, MailConfig.to, MailConfig.subject, MailConfig.messageBody, MailConfig.attachmentPath, MailConfig.attachmentName);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
