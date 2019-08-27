package com.west;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SendeMailTest {
	public static void main(String [] argv){
		new SendeMailTest().eMailTest();
	}
    public static void eMailTest(){
        Email email = new SimpleEmail();
        email.setHostName("10.164.0.77");
        email.setSmtpPort(25);
        
            try {
                // email.setAuthenticator(new DefaultAuthenticator("xianming.yan", "Hack01ming"));
                email.setSSLOnConnect(false);
                email.setFrom("xianming.yan@west.com");
                email.setSubject("TestMail");
                email.setMsg("Test message");
                email.addTo("xianming.yan@west.com");
                System.out.println(email.getSmtpPort());
                email.send();
                
                System.out.println("Send one time!");
            } catch (Exception e){
                e.printStackTrace();
            }
    }

}