package com.example;

import java.util.HashMap;
import java.util.Random;

import util.Alpha;
import util.VT100;

public class MapExample3 {

	//A-Z까지 만들어내면 26개. 무작위로 만들어내면 4배는 돌아야 한다. 그렇게 하면 A-Z까지 다 채워진다고 가정할 수 있다. 이게 완성되기까지 A는 몇 번 반복해서 나왔을까.
	public static void main(String[] args) {
		
		var map = new HashMap<Alpha, Integer>();
		
		
		for(;;) {
		
			var alpha = new Alpha();
			
			if(map.containsKey(alpha)) {
				int count= map.get(alpha);
				count++;
				map.put(alpha, count); // 계속 출현하는 것은 알파객체가 저장되는 게 아니라 count만 늘린다. 
			}else 
				map.put(alpha,1); // 알파객체는 처음 이 때만 저장된다. 
			
		
			
		if(map.size()==800)
			break;
		}
		
		//System.out.println(map);
		
		VT100.clearScreen();
		
		for(var e :map.entrySet()) {
			//System.out.println(e.getKey()+"="+e.getValue());
			e.getKey().show();
		}
		
		VT100.reset();
	}

}
