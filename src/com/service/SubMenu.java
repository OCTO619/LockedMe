package com.service;

import java.util.Scanner;

public class SubMenu {
	public void showFileOperations(Scanner sc) {
		Scanner s=new Scanner(System.in);
		 int choice;
		while(true) {
			 System.out.println("\nFile Operations:\n1:Add file\n2: Search file\n3: Delete file\n4: Return to menu");
			 System.out.print("Enter your choice: ");
			 choice = s.nextInt();
	            sc.nextLine();  
	            switch(choice) {
	            case 1: 
	            	addFile(s);
	                break;
	            case 2:
	            	searchFile(s);
	                break;
	            case 3:
	            	deleteFile(s);
	                break;
	            case 4:
	            	 System.out.println("returning to menu");
	            return;
	            default:System.out.println("Invalid choice.");
	            }  		
		}
	}
}
