package com.lec.ex17_access_class.field.pkg1;

public class A {
	
	public  int field1;
		    int field2; // default
	private int field3;
	
	public  void method1() {}
		    void method2() {} // default
	private void method3() {}
	
	public A() {
		// 필드
		field1 = 10;
		field2 = 10;
		field3 = 10;
		
		// 메서드
		method1();
		method2();
		method3();
	}
}














