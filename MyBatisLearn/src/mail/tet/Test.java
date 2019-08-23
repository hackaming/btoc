package mail.tet;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class Test {
	public static void main(String[] argv){
		System.out.println("dd");
	}
	
    public static void eMailTest(){
        Email email = new SimpleEmail();
        email.setHostName("smtp.qq.com");
        email.setSmtpPort(465);
        try {
            //email.setAuthentication("2251275876","Hack4ming");
            DefaultAuthenticator d = new DefaultAuthenticator("2251275876", "Hack2ming");
            email.setAuthenticator(d);
            email.setSSLOnConnect(true);
            email.setFrom("2251275876@qq.com");
            email.setSubject("TestMail");
            email.setMsg("This is a test mail ... :-)");
            email.addTo("84777522@qq.com");
            email.send();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
