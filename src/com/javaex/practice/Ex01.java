package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		//출력 결과 오류 수정
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		//.length --> 배열의 갯수
		/*
		for (int i=0; i<=intArray.length; i++) {
			result = result + intArray[i];
		}
		*/
		//수정
		for(int i=0; i<intArray.length; i++) {//반복 조건에서 .length를 사용할 경우 조건식의 = 을 빼준다
			result = result + intArray[i];
		}
		System.out.println(result);
	}
}
