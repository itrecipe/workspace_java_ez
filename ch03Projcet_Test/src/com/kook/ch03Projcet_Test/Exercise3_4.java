package com.kook.ch03Projcet_Test;

public class Exercise3_4 {

	public static void main(String[] args) {
		int numOfApples = 130;
		int sizeOfBucket = 10; 
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		
		//int numOfBucket = numOfApples / sizeOfBucket + 1; <- 내 야메코드
		 
		System.out.println("필요한 바구니 개수 : " + numOfBucket);
	}
}
