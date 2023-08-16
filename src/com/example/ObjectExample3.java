package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


// 해시코드는 같은 값을 주면 같은 해시코드값이 나와야 한다. 그렇지만 값이 다르더라도 해시코드값이 같은 수 있다.  
// 해시코드를 쓰면 빠르게 값을 찾을 수 있다.(도서관의 대분류 or 중분류의 개념.) 
// equals()는 두 개의 객체가 같은지 다른지 비교하고 판단한다. 

public class ObjectExample3 {

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
			//return super.hashCode(); >> 부모가 정의해 놓은 메소드 : 메모리주소를 반환.(부모는 모른다. 자식클래스가 어떤 필드를 갖게 될 지)
		    return Objects.hash(a,b);
		} // 해당 클래스가 가진 필드값을 기반으로 올바른 해시코드값을 반환.
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		// 해시코드를 재정의하지 않으면 a1 a2의 해시코드값이 다르다. 해시코드의 기본메커니즘은 같은 값이 주어지면 같은 해시코드여야 한다. 그러므로 
		// a1 a2는 같은 해시코드값을 가져야 한다. 
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		var d1 = new Date(100,1,1);
		var d2 = new Date(100,1,1);
		
		// 인스턴스 d1d2의 해시코드가 같다. Date 클래스에서 해시코드 함수를 재정의했다는 뜻 
		//System.out.println(d1.hashCode());
		//System.out.println(d2.hashCode());
		
		
		//인스턴스 now1, now2의 해시코드가 같다. localDate 클래스에서 해시코드 함수를 재정의했기 때문. 
		var now1 = LocalDate.of(2023, 8, 16);
		var now2 = LocalDate.of(2023, 8, 16);
		//System.out.println(now1.hashCode());
		//System.out.println(now2.hashCode());
	
	
	}

}
