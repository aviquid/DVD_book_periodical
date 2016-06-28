package com.training.firstassign;

public class FindDvd {
public static void find(Dvd[] bks,int key){
		
		for(Dvd bk:bks)
		{
			if(bk.getDvdnumber()==key)
			{
			System.out.println(bk.getTitle());
			System.out.println(bk.getRunningTime());
			System.out.println(bk.getDvdnumber());
			}
	}
}
}
