package com.example;

import java.util.HashSet;

import util.Alpha;
import util.VT100;

public class AlpharectExample2 {

	public static void main(String[] args) {

		var set = new HashSet<Alpha>();
		
		int count =0;
		
		for(;;) {
			count++;
			var alpha = new Alpha();
			set.add(alpha);
			
			if(set.size() ==800)
				break;
		}
		
		VT100.clearScreen();
		
		for(var alpha:set) {
			alpha.show();
		}
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("end... count ="+count);
		
		
	}

}
