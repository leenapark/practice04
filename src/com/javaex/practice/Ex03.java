package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		//아래 코드의 출력값을 예상하고 코드로 확인하기
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
			
			/*예상해보기
			 * intA의 값은 3, 6, 9 이다
			 * intB의 값은 intA를 공유한다
			 * intB의 [0] = 20; [2] = 10; 이란 값을 따로 줌
			 * 예상 intA[i] 출력값: 3, 6, 9 
			 * 틀린 이유
			 * intB는 다른 메모리를 준 게 아니라 intA를 공유하고 있기 때문에 intB or intA를 바꿔주면 값이 바뀐다
			 * */
		}
	}
}
