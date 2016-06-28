package com.training.firstassign;

public class Periodicals {

	private String title;
	private String author;
	private int volume;
	
	public Periodicals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Periodicals(String title, String author, int volume) {
		super();
		this.title = title;
		this.author = author;
		this.volume = volume;
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
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
