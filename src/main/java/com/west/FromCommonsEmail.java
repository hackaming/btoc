package com.west;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class FromCommonsEmail {
	public static void main(String argv[]){
		Email email = new SimpleEmail();
		email.setHostName("10.164.0.77");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("xianming.yan", "Hack01ming"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("xianming.yan@west.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("xianming.yan@west.com");
			email.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
