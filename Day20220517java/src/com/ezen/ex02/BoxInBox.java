package com.ezen.ex02;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}
public class BoxInBox {

	public static void main(String[] args) {
		Box<String> sBox = new Box<>();	//박스가 한겹으로
		sBox.set("Apple");
		
		Box<Box<String>> wBox = new Box<>();	//박스가 두겹으로
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<>();	//박스가 세겹으로
		
		zBox.set(wBox);
		System.out.println(sBox.get());
		System.out.println(wBox.get().get());
		System.out.println(zBox.get().get().get());
		
	}

}
