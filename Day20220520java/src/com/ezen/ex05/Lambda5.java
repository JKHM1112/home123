package com.ezen.ex05;

import java.util.Random;

interface Cenerator {
	int rand();
}

class Abc implements Cenerator{
	@Override
	public int rand() {
		return 0;
	}
}
public class Lambda5 {
	public static void main(String[] args) {
		Cenerator gen = () -> { 
			Random rand = new Random();
			return rand.nextInt(50);
		};
		int num = gen.rand();
		System.out.println(num);

		Cenerator gen1 = () -> { 
			Random rand = new Random();
			return rand.nextInt(50);
		};
		int num1 = gen1.rand();
		System.out.println(num1);
	}
}