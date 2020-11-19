package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		//로또 번호 중복 없이 출력하기
		int[] lotto;
		lotto = new int[6];
		/*
		lotto[0] = (int)(Math.random()*45)+1;
		lotto[1] = (int)(Math.random()*45)+1;
		lotto[2] = (int)(Math.random()*45)+1;
		lotto[3] = (int)(Math.random()*45)+1;
		lotto[4] = (int)(Math.random()*45)+1;
		lotto[5] = (int)(Math.random()*45)+1;
		*/
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;//i가 위 변수 숫자를 해줌
			
			for(int j=0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "\t");	
		}
	}
}
