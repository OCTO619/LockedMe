package com.model;

public class MyFile {
	private String filename;
	

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "File [filename=" + filename + "]";
	}

	public MyFile(String filename) {
		super();
		this.filename = filename;
	}
	
}
