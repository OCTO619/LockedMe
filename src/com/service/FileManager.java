package com.service;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.model.MyFile;

public class FileManager {
	List<MyFile> listOfFiles = new ArrayList<MyFile>();
	
	public List<MyFile> listFiles() {
		 // case-insensitive file name sorting
		Collections.sort(listOfFiles, Comparator.comparing(f -> f.getFilename().toLowerCase()));

	    System.out.println("Files in ascending order:");
	    for (MyFile file : listOfFiles) {
	        System.out.println(file.getFilename());
	    }

	    return listOfFiles;
		
	}
	public String addFile(MyFile file) {
		for (MyFile f : listOfFiles) {
	        if (f.getFilename().equalsIgnoreCase(file.getFilename())) {
	            return "File name must be unique";
	        }
	    }

	    listOfFiles.add(file);
	    return "File added successfully";
		
	}
	public String deleteFile(String filename) {
		for(MyFile f:listOfFiles) {
			if(f.getFilename().equals(filename)) {
				listOfFiles.remove(f);
				return "File deleted successfully";
			}
		}
		return "File not found";

	}
	public MyFile searchFile(String filename) {
		for(MyFile file:listOfFiles) {
			if(file.getFilename().equals(filename)) {
				return file;
			}
		}
		return null;
	}
}
