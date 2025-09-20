package com.bit.manipulation;

public class GetSetClear {
	
	public static void getBit(int n,int i) {
		
		if((n & (1<<i)) == 0) { 
			System.out.println("The bit is not set");
		}
		else {
		System.out.println("The bit is set");
		}
		
	}
	
	public static void setBit(int n,int i) {
		
		System.out.println("The number after set operation is " + (n | (1<<i)));
		
	}
	
	public static void clearBit(int n, int i) {
		
		System.out.println("The number after clear operation is " + (n & ~ (1<<i)));

	}
	
	public static void main(String args[]) {
		
		int n = 42;
		int i=2;
		getBit(n,i);
		setBit(n,i);
		clearBit(n,i);
	}

}
