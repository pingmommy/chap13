package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class RandomE {
	
	//1. list에 1-100까지의 숫자가 모두 들어가는 코드 (중복 o, 몇번 반복했는지 확인 ) 
	public static void main2(String[] args) {
		var list = new ArrayList<Integer>();
		Random r = new Random();

		
		// 리스트에 값을 넣는 코드 
		for(;;) {
			
		    list.add(r.nextInt(1, 101));
		    boolean b= true;
			for(int j =1;j<=100;j++) {
				if (!list.contains(j)) {
					b=false;				
				} 
		}if (b) {
			break;
		}
			}
		
		System.out.println(list);	
		System.out.println(list.size());										    		    
		
	}	 
		    
			
		
		
	
	
	//2. list에 1-100까지 모두 들어가는데, 중복x
	//리스트 정렬까지 (sort(익명구현객체))
	public static void main(String[] args) {
		
		var list = new ArrayList<Integer>();
		Random r = new Random();

		
		for(;;) {
			
			int r2 = r.nextInt(1,101);
			
			if(!list.contains(r2)) {
				
				list.add(r2);
			}
		
			
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		});
		
		if(list.size()==100) {
			break;
		}
		
		}
		System.out.println(list);
		
	}

}
