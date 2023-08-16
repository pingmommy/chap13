package com.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/*hashcode() equals() tiString() 에 대한 이해
 * 
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * 
 * 
 * */



public class ObjectExample2 {

	//object를 직접적으로 상속
	static class Alpha{
		
		int a ;
		int b;
		
		public Alpha(int a, int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public String toString() {
			return String.format("[%d %d]", a,b);
			//return super.toString();
		}
		// 문자열로 반환한 값. : 내가 가진 값을 기반으로 필드에 있는 정보가 무엇인지 문자열로 반환할 수 있어야 한다. 부모가 정의해 놓은 메소드를 그냥 쓰라는 게 아니라 재정의해라
		// 객체의 인스턴스필드는 다 스트링으로 변환할 수 있는데, 투스트링으로 오버라이딩해서 써라. 
	}
	
	
	
	
	public static void main(String[] args) {

		/*이 때 정의해놓은 투스트링은 부모가 정의해 놓은 메소드 
		 * 내가 가지고 있는 정보를 의미있게 리턴하지 않는다. 
		 * 
		 * 부모가 정의해놓은 메소드를 오버라이딩해서 의미있게 쓰란 의미 
		 * */
		
		//println는 주어진 값을 문자열로 출력해야 하기 때문에 객체를 매개변수로 주면 따로 명시하지 않아도 toString을 호출한다.
		
		// 클래스를 만들 때 그 클래스를 문자열로 변환하고자 한다면 투스트링을 재정의해야 한다. 
		// 대부분의 라이브러리들은 다 투스트링이 재정의되어 있다. 
		
		// 배열도 객체지만 투스트링이 재정의되어 있지 않다. 대부분의 라이브러리들은 투스트링을 재정의해서 프린트함수에 그냥 넣으면 
		// 문자열로 원하는 값을 얻을 수 있지만 배열은 라이브러리가 아니라 언어적으로 지원하는 것이기 때문에 투스트링이 재정의되어 있지 않다. 
		
		 var l = new ArrayList<Integer>();
		
		 l.add(10);
		 
		 System.out.println(l);
		 
		 int[] n= {1,2,3};
		 System.out.println(n); // 부모의 투스트링이 호출된다. 
		 
		 //배열의 원소값을 출력하고 싶다면? 1. 인덱스써서 하나씩 출력하든가 2.라이브러리를 써야 한다.(Arrays.toString(n));
		 System.out.println(n[0]);
		 
		 var d = new Date();
		 System.out.println(d);
		 
		 var now = LocalDateTime.now();
		 System.out.println(now.toString());
		 System.out.println(now);
	}

}
