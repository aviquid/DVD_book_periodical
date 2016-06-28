package com.training.firstassign;

public class Book {

	private String title;
	private String author;
	private int isbnNumber;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int isbnNumber) {
		super();
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
}
