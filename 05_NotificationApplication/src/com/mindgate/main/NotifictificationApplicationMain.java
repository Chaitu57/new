package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.NotificationFactory;
import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSnotification;
import com.mindgate.service.Notification;

public class NotifictificationApplicationMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String to;
		String message;
		int choice;
		 
		System.out.println("1.SMS Notification");
		System.out.println("2.Email Notification");
		System.out.println("3.WhatApp Notification");
		System.out.println("Enter your choice");
		choice=scanner.nextInt();
		
		System.out.println("Enter contact ::");
		to=scanner.next();
		scanner.nextLine();
		System.out.println("Enter message ::");
		message=scanner.nextLine();
		
 Notification notification= NotificationFactory.getNotification(choice);
 notification.sendNotification(to, message);
}
}
