package com.test.Test;

public class Star {

	public static void main(String[] args) {
		// ���̾Ƹ�� ���
		 for(int i = 0; i < 20; i++){
	            for(int j = i; j < 20; j++){
	                System.out.print(" ");
	            }
	            for(int j = 0; j < i; j++){
	                System.out.print("*");
	            }
	            for(int j = 0; j < i-1; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	 
	        // ���̾Ƹ�� �ϴ�
	        for(int i = 0; i < 20; i++){
	            for(int j = 0; j < i; j++){
	                System.out.print(" ");
	            }
	            for(int j = i; j < 20; j++){
	                System.out.print("*");
	            }
	            for(int j = i+1; j < 20; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}