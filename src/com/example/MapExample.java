package com.example;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		var map = new HashMap<String, Integer>();
		
		map.put("java", 10000);
		map.put("jsp", 5000);
		map.put("spring", 20000);
		map.put("java", 30000);
		
		System.out.println(map); //toString
		System.out.println(map.size());

		//키로 값을 가져오기
		System.out.println(map.get("java"));
		
		//값도 , 키도 없는 것을 가져오려고 하면 null을 반환함. >> null이라고 키가 없는 게 아님. 값이 null일 수도 있음. 
		System.out.println(map.get("javaScript"));
	
		//키의 존재여부를 조회할 때
		System.out.println(map.containsKey("javaScript"));
		
		System.out.println(map.remove("java"));
		System.out.println(map);
	}

}
