package com.ezen.ex06;

class Counter {
	int count = 0;

	synchronized/* 다 쓰고 난 다음에 접근해라 이것아 순서대로 */ public void increment() {
		count++;
		System.out.println("1111");
	}

	synchronized public void decrement() {
		count--;
		System.out.println("2222");
	}

	synchronized int getcount() {
		return count;
	}

}

public class MutualAccess {

	public static Counter cnt = new Counter();

	public static void main(String[] args) throws Exception {

		Runnable task1 = () -> { // Runnable 구현한 인스턴스 생성
			for (int i = 0; i < 1000; i++)
				cnt.increment();
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 1000; i++)
				cnt.decrement();
		};

		Thread t1 = new Thread(task1); // Thread 인스턴스 생성
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();
		t1.join(); // t1이 참조하는 쓰레드 종료까지 대기
		t2.join();

		System.out.println(cnt.getcount());

	}
}
