package com.example;

/*hashcode() equals() tiString() 에 대한 이해
 * 
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * 
 * 
 * */

/*
 * extends 키워드가 명시되어 있지 않아도 자바의 모든 클래스는 Object를 상속받는다. 
 * Object의 모든 메소드는 모든 클래스가 다 사용가능하다. 
 * 그럼 Object의 메소드를 언제 쓰냐? 
 * 
 * */

public class ObjectExample {

	//object를 직접적으로 상속
	static class A{
		
	}
	
	//object를 간접적으로 상속
	static class B extends A{
		
	}
	
	
	public static void main(String[] args) {

		Object o = new Object();
		
		
		A a = new A();
		a.toString();
		System.out.println(a.toString());
		
		B b = new B();
		System.out.println(b.toString());
		
		
		System.out.println("Hello".toString());
		
		//=> 어떤 객체든 문자열로 반환한다. toString 
		// 부모는 객체가 어떤 값으로 리턴될 지 모른다.  
		/*스트링으로 변환한다.a 모든 인스턴스는 문자열로 변환할 수 있는데 필드에 기반해서 문자로 변환해야 한다. 
		부모가 정의해놓은 투스트링은 자식객체, 인스턴스가 뭔지 모른다(타입이 뭔지..등등 )
		그래서 오브젝트에 있는 대부분의 메소드는 재정의해서 써야 한다. 
		그러므로 클래스를 만들면 투스트링을 재정의해야 한다. */ 
		
		
		
		
	// =>> 클래스 A,B는 어떤 것도 정의, 선언되지 않았지만 메소드를 호출할 수 있는데, 이는 Object를 상속했기 때문이다. 
		
	}

}
