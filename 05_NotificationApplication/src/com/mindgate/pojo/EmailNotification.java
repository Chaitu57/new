package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EmailNotification implements Notification{

		public void sendNotification(String to,String message)
		{
			System.out.println("sending Email Notification");
			System.out.println("To ::"+ to);
			System.out.println("Email::"+message);
		}
	}


