package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//5개의 숫자를 입력 받아 평균을 구하는 프로그램을 만드시오
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double average = 0;
		
		int[] no = new int[5];
		no[0] = sc.nextInt();
		no[1] = sc.nextInt();
		no[2] = sc.nextInt();
		no[3] = sc.nextInt();
		no[4] = sc.nextInt();
		
		for(int i=0; i<no.length; i++) {
			sum = no[0]+no[1]+no[2]+no[3]+no[4];
			average = sum/5;
		}
		
		System.out.println("평균은: "+average + " 입니다.");
		
		sc.close();
	}
}
