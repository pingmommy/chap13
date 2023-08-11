package com.example;

import java.util.ArrayList;

public class ArrayListMethodExample {

	public static void main(String[] args) {
		
		var list = new ArrayList<Integer>();
		
		//list에 값 넣기 : add (Create)
		list.add(10);
		list.add(20);
		
		// 원하는 인덱스에 값 넣기 
		list.add(0, 30);
		System.out.println(list); // ->[30,10,20]
		
		
		// 값 바꾸기 (Update)
		list.set(1, 40);
		System.out.println(list); // ->[30,40,20]
	
		//값 조회하기 (Retrieve)
		System.out.println(list.get(2));
		
		// 값 삭제하기 (Delete)
		list.remove(1);
		System.out.println(list); // ->[30,20]
		list.remove(Integer.valueOf(20));
		System.out.println(list); // ->[30]
		
	
	//1-100 랜덤하게 만들어 낸다 Math.random()*100 
	
	}

}
