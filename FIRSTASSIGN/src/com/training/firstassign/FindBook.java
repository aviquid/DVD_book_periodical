package com.training.firstassign;

public class FindBook {

	public static void find(Book[] bks,int key){
		
		for(Book bk:bks)
		{
			if(bk.getIsbnNumber()==key)
			{
			System.out.println(bk.getTitle());
			System.out.println(bk.getAuthor());
			System.out.println(bk.getIsbnNumber());
	}
		}
}
}