package com.kook.ch03Project;

public class Ex03_10 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		//1_000_000�� int�̹Ƿ� int + int = int
		long b = 1_000_000 * 1_000_000L;
		//int * long -> long //����

		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}