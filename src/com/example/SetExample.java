package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


/*set의 특징 : 중복저장하지 않는다. 
 HashSet :
 TreeSet :
*/
public class SetExample {
	
	public static void main(String[] args) {
		
		var r = new Random();
		var s = new HashSet<Integer>();
		int c =0;
		
		
		//1-10까지 나오면 무한루프를 종료한다. 
		for(;;) {
			c++;
			int n = r.nextInt(1,11);
			System.out.print(n);
			
			boolean b = false;
			
			s.add(n); //add()메소드를 Array   중복저장하지 않는다. 
			
			if(s.size()==10)
				break;
		}
		System.out.println(s);
		System.out.println(c);
	}

	
	
	//set과 Arraylist의 차이점
	
	public static void main2(String[] args) {

			var list = new ArrayList<Integer>();
			var set = new HashSet<Integer>();
			
			list.add(1);
			list.add(2);
			list.add(1);
			list.add(1);

			set.add(1);
			set.add(1);
			set.add(1);
			set.add(1);
			
			System.out.println(set);
			System.out.println(list);

			
			System.out.println(list.get(1));
		  //System.out.println(set.get(1));

			
			
			
			System.out.println(list.add(1));
			System.out.println(list.add(1));
			System.out.println(list.add(1));
			System.out.println(list.add(1));

			System.out.println(set.add(1));
			System.out.println(set.add(1));
			System.out.println(set.add(1));
			System.out.println(set.add(1));
			
			
	}

}
