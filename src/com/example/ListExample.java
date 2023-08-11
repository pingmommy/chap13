package com.example;

/*List 인터페이스를 상속하고 있는 구현클래스라서 3개의 클래스는 사용법이 비슷하다. */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	
	// var n = 100;  => var문법은 필드에는 사용불가. 로컬변수에만!
	
	
	// 최근에 추가된 편리한 문법 : 변수타입을 명시하지 않고 var로 주면 컴파일러가 값을 보고 추론하여 변수타입을 지정한다. 로컬변수에서만 사용가능하고 필드로는 사용불가. 
	public static void main(String[] args) {
		var num =100;
		var d =10.5;
		var s = "hello";
	}
	
	//var로 선언된 변수에 제너릭값을 넣을 떄는 타입파라미터<>에 타입을 명시해야 한다. 
	public static void main5(String[] args) {
		var a1 = new ArrayList<Integer>();
		var b2 = new Vector<Integer>();
		var c3 = new LinkedList<Integer>();
	}
	
	
	// ArrayList Vector LinkedList는 List를 상속받음. upcasting타입 변수 선언가능 .
	public static void main4(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> b2 = new Vector<Integer>();
		List<Integer> c3 = new LinkedList<Integer>();
	}
	
	public static void main3(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		Vector<Integer> b = new Vector<>();
		LinkedList<Integer> c = new LinkedList<>();
	}
	

	public static void main2(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Vector<Integer> b = new Vector<Integer>();
		LinkedList<Integer> c = new LinkedList<Integer>();
	}
	
	

	

}
