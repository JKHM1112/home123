package com.ezen.ex06;

import java.util.function.Consumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		// 1개
		Consumer<String> c = s -> System.out.println(s);

		c.accept("comsumer!!");

		c.accept("java consumer");
		// 2개                  <String>,int
		ObjIntConsumer<String> c2 = (s, i) -> System.out.println(i + ", " + s);

		int n = 1;

		c2.accept("toy", n++);
		c2.accept("robot", n++);
		c2.accept("box", n++);
		// 2개                    <String>,double
		ObjDoubleConsumer<String> c3 = (s, d) -> System.out.println(d + ", " + s);

		double d = 1.1;
		c3.accept("toy", d++);
		c3.accept("robot", d++);
		c3.accept("box", d++);
	}
}
