package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import util.Alpha;
import util.VT100;

public class MapExample5 {

	//A-Z까지 만들어내면 26개. 무작위로 만들어내면 4배는 돌아야 한다. 그렇게 하면 A-Z까지 다 채워진다고 가정할 수 있다. 이게 완성되기까지 A는 몇 번 반복해서 나왔을까.
	public static void main(String[] args) throws InterruptedException {
		
		var map = new HashMap<Alpha, List<Alpha>>();
		
		
		for(;;) {
		
			var alpha = new Alpha();
			
			if(map.containsKey(alpha)) {
				var list = map.get(alpha);
				list.add(alpha);
				map.put(alpha, list); // 계속 출현하는 것은 알파객체는 리스트에 저장한다.  
			}else 
				map.put(alpha,new ArrayList<Alpha>()); // 처음 출현하는 알파객체는 컨테이너를 만들어서 넣어준다. 
			
		
			
		if(map.size()==800)
			break;
		}
		
		VT100.clearScreen();
		
	
		for(var e :map.entrySet()) {
			var key = e.getKey();
			key.show();
			var value = e.getValue(); //list 
			
			if(value.size()>0)
			   value.get(value.size()-1).show(1,42);
			
			else
				key.show(1,42);  //0이면  키만 있다는 의미. 그럼 그 키 객체가 출현해야 한다. 
		
			Thread.sleep(100);
		}
		
		VT100.reset();
		
	}

}
