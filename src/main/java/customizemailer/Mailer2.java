package customizemailer;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import utils.Listener;

@SuppressWarnings({ "unused" })
public class Mailer2 extends Listener {
	static String suiteName;
	public static String platform;
	private static String releaseVersion = System.getProperty("release");
	private static String testType = System.getProperty("testType");

	/**
	 * Method to parse the mail content
	 *
	 * @throws Exception
	 */
	public static void execute(String name) throws Exception {
		platform = System.getProperty("platformName");
		suiteName = name;
		String[] path = { System.getProperty("user.dir") + File.separator + "test-output" + File.separator
				+ "ExtentReport" + File.separator + "ExtentReport" + ".html" };
		String[] to = { "raja@gmail.com"," "};

		String[] cc = {};
		String[] bcc = {};
		Mailer2.sendMail("your Mail Id", "Your App Password", "smtp.gmail.com", "465", "true", "true", false,
				"javax.net.ssl.SSLSocketFactory", "false", to, cc, bcc, "RMS Automation Report",
				"Attached html file and xls file contains the test result status", path);
	}

	/**
	 * Method to send the mail
	 *
	 * @author 
	 * @throws Exception
	 */
	public static boolean sendMail(String userName, String passWord, String host, String port, String starttls,
			String auth, boolean debug, String socketFactoryClass, String fallback, String[] to, String[] cc,
			String[] bcc, String subject, String text, String[] attachmentPath) {
		// Object Instantiation of a properties file.
		Properties props = new Properties();
		props.put("mail.smtp.user", userName);
		props.put("mail.smtp.host", host);
		if (!"".equals(port)) {
			props.put("mail.smtp.port", port);
		}
		if (!"".equals(starttls)) {
			props.put("mail.smtp.starttls.enable", starttls);
			props.put("mail.smtp.auth", auth);
		}
		if (debug) {
			props.put("mail.smtp.debug", "true");
		} else {
			props.put("mail.smtp.debug", "false");
		}
		if (!"".equals(port)) {
			props.put("mail.smtp.socketFactory.port", port);
		}
		if (!"".equals(socketFactoryClass)) {
			props.put("mail.smtp.socketFactory.class", socketFactoryClass);
		}
		if (!"".equals(fallback)) {
			props.put("mail.smtp.socketFactory.fallback", fallback);
		}
		try {
			Session session = Session.getDefaultInstance(props, null);
			session.setDebug(debug);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(userName));
			msg.setSubject(subject);
			Multipart multipart = new MimeMultipart();
			if (attachmentPath != null && attachmentPath.length > 0) {
				for (String filePath : attachmentPath) {
					{
						MimeBodyPart attachPart = new MimeBodyPart();
						try {
							attachPart.attachFile(filePath);
						} catch (IOException ex) {
							ex.printStackTrace();
						}
						multipart.addBodyPart(attachPart);
					}
				}
			}
			BodyPart htmlBodyPart = new MimeBodyPart();
			String htmlMessageAsString = "<p>Hi Team,</p><p>Please find below the summary of the automation results: </p><p><u><h4>Summary Report</h4></u></p><body>"
					+ "<table cellspacing=0 cellpadding=3 border=1>" + "<tr>"
					+ "<th style=background-color:#dddddd >Test Suite</th>"
					+ "<th style=background-color:#80ed6f>Passed</th>"
					+ "<th style=background-color:#f55838 >Failed</th>"
					+ "<th style=background-color:#FFFF00>Skipped</th>" + "</tr>" + "<tr>" + "<td><b>" + subject
					+ "</b></td>" + "<td>" + Listener.Testcase_passed + "</td>" + "<td>" + Listener.Testcase_failed
					+ "</td>" + "<td>" + Listener.Testcase_skipped + "</td>" + "</tr>" + "<tr>"
					+ "<td><b>Total</b></td>" + "<td>" + Listener.Testcase_passed + "</td>" + "<td>"
					+ Listener.Testcase_failed + "</td>" + "<td>" + Listener.Testcase_skipped + "</td>" + "</tr>"
					+ "</table>"
					+ "</body><p>Attached file contains the detailed test results (pls. download it & open in a browser).</p><p></p><p></p><p></p><p>Regards,  </p><p> QA  </p>";
			htmlBodyPart.setContent(htmlMessageAsString, "text/html");
			multipart.addBodyPart(htmlBodyPart);
			msg.setContent(multipart);
			for (int i = 0; i < to.length; i++) {
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
			}
			for (int i = 0; i < cc.length; i++) {
				msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));
			}
			for (int i = 0; i < bcc.length; i++) {
				msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
			}
			msg.saveChanges();
			Transport transport = session.getTransport("smtp");
			transport.connect(host, userName, passWord);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			return true;
		} catch (Exception mex) {
			mex.printStackTrace();
			return false;
		}
	}
}