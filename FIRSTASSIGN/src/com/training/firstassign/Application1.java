package com.training.firstassign;

import java.util.*;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("total books");
		int num=sc.nextInt();
		Book[]  bks = new Book[num];
		
		System.out.println("total periods");
		int num1=sc.nextInt();
		Periodicals[] p = new Periodicals[num1];
		
		System.out.println("total dvds");
		int num2=sc.nextInt();
		Dvd[] d = new Dvd[num2];
		 int total=num+num1+num2;
		int i=0,j=0,k=0,l=0;
		int key;
		do{
		System.out.println("enter 1 for book 2 for period 3 for dvd");
		key=sc.nextInt();
		l++;
		if(key==1)
		{
			System.out.println("enter title");
			String title=sc.next();
			System.out.println("enter author");
			String title1=sc.next();
			System.out.println("enter isbn");
			int isbn=sc.nextInt();
			
			bks[i++]=new Book(title,title1,isbn);
		}
		else if(key==2)
		{
			System.out.println("enter title");
			String title=sc.next();
			System.out.println("enter author");
			String title1=sc.next();
			System.out.println("enter volume");
			int volume=sc.nextInt();
			
			p[j++]=new Periodicals(title,title1,volume);
		}
		else
		{
			System.out.println("enter title");
			String title=sc.next();
			System.out.println("enter running time");
			int title1=sc.nextInt();
			System.out.println("enter number");
			int number=sc.nextInt();
			
			d[k++]=new Dvd(title,title1,number);
		}
		}while(l<total);
		
		System.out.println("enter choice and number");
		key=sc.nextInt();
		int key1=sc.nextInt();
		if(key==1)
		FindBook.find(bks,key1);
		else if(key==2)
		FindPeriod.find(p,key1);
		else
		FindDvd.find(d,key1);
	
	}
}
