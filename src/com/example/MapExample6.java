package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import util.Alpha;
import util.VT100;

public class MapExample6 {

	static class AlphaState extends Alpha{
		//2개의 기능이 필요함
		
		void printPosition() {
			VT100.reset();
			System.out.printf("[%02d %02d]",line,column);
		}
		
		void printChar() {
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
			VT100.reset();
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		var map = new HashMap<AlphaState, List<AlphaState>>();
		
		
		for(;;) {
		
			var alpha = new AlphaState();
			
			if(map.containsKey(alpha)) {
				var list = map.get(alpha);
				list.add(alpha);
				map.put(alpha, list); // 계속 출현하는 것은 알파객체는 리스트에 저장한다.  
			}else 
				map.put(alpha,new ArrayList<AlphaState>()); // 처음 출현하는 알파객체는 컨테이너를 만들어서 넣어준다. 
			
		    if(map.size()==800)
			    break;
		}
		
		VT100.clearScreen();
		
	 //람다식에서는 추상메소드때문에 예외를 던질 수 없다. 추상메소드의 시그니처가 달라짐. 
		map.forEach((k,v)-> {
			k.printPosition();
			k.printChar();
			
			v.forEach(alpha ->{
				alpha.printChar();
			});
			System.out.println();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		VT100.reset();
		System.out.println("end");
	}

}
