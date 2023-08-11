package com.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class listAddPerfomanceExample {

	public static void main(String[] args) {

		// ArrayList
		
		var list1 =new ArrayList<Integer>();
		
		var start = LocalTime.now();
		for(int i =0; i<200_000;i++) {
			list1.add(0, i);
		}
		var end = LocalTime.now();
		System.out.println("list1.add:"+ Duration.between(start, end));
		
		
		start = LocalTime.now();
		for(int i =0; i<200_000;i++) {
			list1.get(i);
		}
		end = LocalTime.now();
		System.out.println("list1.get:"+ Duration.between(start, end));
		
		
		start = LocalTime.now();
		for(int i =0; i<200_000;i++) {
			list1.set(i,i+1);
		}
		end = LocalTime.now();
		System.out.println("list1.set:"+ Duration.between(start, end));
		
		
		start = LocalTime.now();
		for(int i =0; i<200_000;i++) {
			list1.remove(0);
		}
		end = LocalTime.now();
		System.out.println("list1.remove:"+ Duration.between(start, end));
		
		
		
		//Linked List
		
		var list2 = new LinkedList<Integer>();

		var start2 = LocalTime.now();
		for(int i =0; i<200_000;i++) {
			list2.add(0, i);
		}
		var end2 = LocalTime.now();
		System.out.println("list2.add:"+ Duration.between(start2, end2));


		 start2 = LocalTime.now();
		for(int i =0; i<200_000;i++) {
			list2.get(i);
		}
		end2 = LocalTime.now();
		System.out.println("list2.get:"+ Duration.between(start2, end2));
		
		
		start2 = LocalTime.now();
		for(int i =0; i<200_000;i++) {
				list2.set(i,i+1);
		}
		end2 = LocalTime.now();
		System.out.println("list2.set:"+ Duration.between(start2, end2));
		
		 start2 = LocalTime.now();
	     for(int i =0; i<200_000;i++) {
				list2.remove(0);
		  }
		 end2 = LocalTime.now();
		 System.out.println("list2.remove:"+ Duration.between(start2, end2));
			
			
		
	}

}
