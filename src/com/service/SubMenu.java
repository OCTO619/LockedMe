package com.service;

import java.util.Scanner;
import com.model.MyFile;

public class SubMenu {
	 FileManager fm;
	 public SubMenu(FileManager fm) {
	        this.fm = fm;
	    }
	public void showFileOperations(Scanner sc) {
		
		 Scanner s=new Scanner(System.in);
		 int choice;
		 String result;
		 String filename;
		
		while(true) {
			try {
			 System.out.println("\nFile Operations:\n1: Add file\n2: Search file\n3: Delete file\n4: Return to menu");
			 System.out.print("Enter your choice: ");
			 choice = s.nextInt();
	            
			 	s.nextLine();  
	            switch(choice) {
	            
	            case 1: 
	            	System.out.println("Add File:");
	            	System.out.println("Enter the file name");
				filename = sc.next();
				MyFile f = new MyFile(filename);
				result = fm.addFile(f);
				System.out.println(result);
				break;
				
	            case 2:
	            	System.out.println("Search file:");
	            	System.out.println("Enter the file name");
				filename = sc.next();
				MyFile file=fm.searchFile(filename);
				if(file==null) {
					System.out.println("File not present");
				}else {
					System.out.println(file);  
				}
				break;
	       
	            case 3:
	            	System.out.println("Delete File:");
	            	System.out.println("Enter the filename");
					filename = s.next();
			        result = fm.deleteFile(filename);
			        System.out.println(result);
			        break;
	    
	            case 4:
	            	 System.out.println("returning to menu..");
	            return;
	            default:System.out.println("Invalid choice.");
	            }  
			}catch(Exception e) {
				System.out.println("Invalid input! Please try again.");
                s.nextLine();
			}
		}
	}	
}
