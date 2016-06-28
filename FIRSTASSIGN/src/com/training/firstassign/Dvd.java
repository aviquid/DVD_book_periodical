package com.training.firstassign;

public class Dvd {

	private String title;
	private int runningTime;
	private int dvdnumber;
	
	public Dvd(String title, int runningTime, int dvdnumber) {
		super();
		this.title = title;
		this.runningTime = runningTime;
		this.dvdnumber = dvdnumber;
	}
	public Dvd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public int getDvdnumber() {
		return dvdnumber;
	}
	public void setDvdnumber(int dvdnumber) {
		this.dvdnumber = dvdnumber;
	}
	
	
	
}
