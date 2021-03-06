package com.ezen.ex05;

public class MakeThreadEx01 {

	public static void main(String[] args) {
		Runnable task = () -> {
			int n1 = 10;
			int n2 = 20;
			String name  = Thread.currentThread().getName();
			
			System.out.println(name + " :" + (n1+n2));
			for(int i =0; i<500; i++)
				System.out.print(name +" : " + i);
		};
		Thread t = new Thread(task);
		t.start();

		for(int i =0; i<500; i++)
			System.out.print("main : " + i);
		
		System.out.print("End : " + Thread.currentThread().getName());
		
		
	}
}