package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {
		//double형 배열의 값이 1.2, 3.3, 6.7 일 때 순서대로 입력 후 for문 만들어보기
		
		double[] result = new double[3];
		
		result[0] = 6.7;
		result[1] = 3.3;
		result[2] = 1.2;
		
		for(int i=0; i<result.length; i++) {//i를 int로 줌
			System.out.println(result[i]);
		}
	}
}
