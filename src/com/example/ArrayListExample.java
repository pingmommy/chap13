package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main2(String[] args) {
		
		var n = new ArrayList<Integer>();
		
		for(int i = 0;i<=10;i++) {
			n.add((int) (Math.random()*10));
		}
		
		System.out.println(n);
		System.out.println(n.size());
		
	}
	
	
	public static void main(String[] args) {

		//배열의 특징 : 한 번 생성되면 크기를 늘리거나 줄일 수 없다. 언어에서 문법으로 지원 
		// 배열은 초기값을 리터럴 형식으로 줄 수 있다. ArrayList는 안 됨. 
		
		
		int[] nums = {1,2,3,4}; 
		// ->배열 nums에 5,6을 저장하고 싶다면? 안 된다. 
		//   연산을 하기 위해 기존의 배열값과 새로운 값이 필요하다면 배열을 새로 만들어서 기존의 배열을 복사하고 값을 추가적으로 넣어야 한다. 
		
		
		int[] nums2 = new int[10];
		// -> nums[] 원소에 5,6을 추가하기 위해 크기가 더 큰 배열을 새로 만듦 
		
		
		System.arraycopy(nums, 0, nums2, 0, nums.length);
		nums2[4]=5;
		nums2[5]=6;
		// -> nums2[]에 nums[]를 복사하고 값을 추가.
		
		for(int i = 0;i<nums2.length;i++) {
			System.out.println(nums2[i]);
		}
		
		System.out.println(Arrays.toString(nums2));
		
	}

}
