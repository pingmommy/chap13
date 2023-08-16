package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;


/*set의 특징 : 중복저장하지 않는다. 
 HashSet :
 TreeSet :
*/
public class SetExample4 {
	static Random r = new Random();
	
	
	static class Alpha{
		
		int line;
		int column;
		public Alpha() {
			line = r.nextInt(1,11); //[1-10]
			column = r.nextInt(1,11); //[1-10]
		}
		
		public Alpha(int line, int column){
			this.line = line;
			this.column = column;
		}
	
		@Override
		public int hashCode() {
			System.out.println("hashcode..");
			return Objects.hash(line,column);
		}
	}
	
	
	// 
	public static void main4(String[] args) {
		var set =  new HashSet<Alpha>(); 
		
		set.add(new Alpha(10,5));
	}
	
	
	public static void main1(String[] args) {
		
		var a1 = new Alpha(10,5);
		var a2 = new Alpha(10,5); // ->> a1, a2는 값이 같은데, hashcode()가 같음. 다르게 하려면?
		                          // Alpha클래스에 뭔가를 해줘야 한다. 
	}
	
	public static void main(String[] args) {
		Integer n1 = 100;
		Integer n2 = 100;
		
		
		
		int h1 =Objects.hash(10,"hello",10.5);
		int h2 =Objects.hash(10,"hello",10.5);
		
		System.out.println(h1);
		System.out.println(h2);
		
		
	}
	
	// insert 'object Alpha' into 'hashset'
	// 무작위의 수가 입력되는데, HashSet 객체에 중복저장되지 않는다. 	
	public static void main2(String[] args) {
		
		var s = new HashSet<Alpha>();
		
		var a1= new Alpha(10,5);
		var a2= new Alpha(10,5);
		
		s.add(a1);
		s.add(a2);
		
		System.out.println(s.size());
		
		//hashcode()다름
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

		//hashcode()같음
		System.out.println(new String("Hello").hashCode());
		System.out.println(new String("Hello").hashCode());
		
	}
	
	//hashmap이 객체를 판단하는 근거는 hash 값. hash()함수는 정수를 리턴한다.  
	// hash값이 다르면 다른 객체로 판단. 

	/*
	 * hash()함수 => hash값 리턴(정수)
	 * 입력값이 같으면 hash값은 같다. 
	 * 하지만 입력값이 다르다고 해서 hash값이 반드시 다른 건 아니다. 
	 * 왜냐면 hash()함수는 입력된 값을 정수로 맵핑해서 리턴하는데, 입력된 값의 크기가 정수의 범위를 넘어설 경우  
	 * 중복되는 정수로 리턴할 수 있기 때문. 
	 * 
	 * 
	 * */
	
			

}
