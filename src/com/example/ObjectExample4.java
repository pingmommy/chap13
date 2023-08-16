package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;


//hashset이라는 자료구조를 쓰려면 hashcode(), equals()를 반드시 오버라이딩해야 한다. 


// equals()는 두 개의 객체가 같은지 다른지 비교하고 판단한다. 

public class ObjectExample4 {

	//object를 직접적으로 상속
	static class Alpha{
		
		int a ;  // 필드에 기반해서 해시코드 함수를 재정의해야 한다.
		int b;
		
		public Alpha(int a, int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public String toString() {
			return String.format("[%d %d]", a,b);
		}
		
		@Override
		public int hashCode() {
		    return Objects.hash(a,b);
		} 
		
		
		@Override
		public boolean equals(Object obj) { //(매개변수)는 뭐가 올지 모르므로  Object타입으로
			if(obj instanceof Alpha) {
				
				Alpha target = (Alpha)obj;
				
				return a == target.a && b==target.b; 
			}
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		var set = new HashSet<Alpha>(); //<Integer><String> 등의 라이브러리는 이미 재정의가 되어 있어서 바로 쓸 수 있다. 
                                 // Alpha는 내가 정의한 클래스이기 때문에 메소드를 오버라이딩하지 않으면 hashset을 쓸 수 없다.
		
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
	
	
	System.out.println(set); 
	// hashset의 매커니즘대로라면 출력결과는 [10,5] 하나여야 한다. 이처럼 바르게 출력결과가 나오려면 반드시 hashcode와 equals가 재정의되어야 한다.
	// hashcode가 재정의되지 않으면 부모클래스의 메소드가 호출되어 
	
	
	} 
	
	
	public static void main2(String[] args) {
		
		
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(a1==a2); // 참조타입에 대해서는 == 연산자는 주소비교. false
		
		System.out.println(a1.equals(a2)); // 값을 비교. 값이 같은데 false. >> equals를 재정의하지 않았기 때문에>>재정의해서 지금은 true
		
		var now1 = LocalDate.of(2023,8,16);
		var now2 = LocalDate.of(2023,8,16);
		
		
		System.out.println(now1.equals(now2));// LocalDate는 equals()를 재정의해서 true가 나온다. 
		
	
	}

}
