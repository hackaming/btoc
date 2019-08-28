package com.west;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SendeMailTest {
	public static void main(String [] argv){
		new SendeMailTest().eMailTest();
	}
    public static void eMailTest(){
    	Logger logger = Logger.getLogger(SendeMailTest.class);
        Email email = new SimpleEmail();
        email.setHostName("10.164.0.77");
        email.setSmtpPort(25);
        
            try {
                // email.setAuthenticator(new DefaultAuthenticator("xianming.yan", "Hack01ming"));
            	logger.info("start to send the e-mail!");
                email.setSSLOnConnect(false);
                email.setFrom("xianming.yan@west.com");
                email.setSubject("Test");
                email.setMsg("Test");
                email.addTo("APACBridgingInfrastructure@intercallapac.com");
                email.send();
            	logger.info("e-mail send out");
            } catch (Exception e){
                e.printStackTrace();
            }
    }

}
