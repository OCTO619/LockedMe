package com.main;

import java.util.Scanner;
import com.service.FileManager;
import com.service.SubMenu;


public class LockedMeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		FileManager fm=new FileManager();
		SubMenu sm=new SubMenu(fm);
		System.out.println("  Welcome to LockedMe.com");
        System.out.println("  Developer: Ishita Singh");
       
        String con="";
        int choice;
        do {
        	try {
            System.out.println("\nMain Menu:\n1: View Files in Ascending Order\n2: File Operations\n3: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                	fm.listOfFiles();
                    break;
                case 2:
                		sm.showFileOperations(sc);
                    break;

                case 3:
                	System.out.println("Exiting LockedMe.com...");
                    sc.close();
                    System.exit(0);
               default:
                    System.out.println("Invalid choice. Try again.");
            }
        	}catch(Exception e) {
        		System.out.println("Invalid input! Please enter a number (1–3).");
                sc.nextLine();
        	}
        System.out.println("do you want to continue(y/n)");
		con = sc.next();
        	}		while(con.equalsIgnoreCase("y"));
	System.out.println("Thank you!");
        sc.close();
	}

}
