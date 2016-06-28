package com.training.firstassign;

public class FindPeriod {
public static void find(Periodicals[] bks,int key){
	
		for(Periodicals bk:bks)
		{
			if(bk.getVolume()==key)
			{
			System.out.println(bk.getAuthor());
			System.out.println(bk.getTitle());
			System.out.println(bk.getVolume());
	}
		}
}
}
