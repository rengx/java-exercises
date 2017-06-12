package com.rengzailushang.thinkinginjava.init.overload;

/**
 * 
 * 重载 
 * 基本类型的重载，基本类型能从一个“较小”的类型自动提升至一个“较大”的类型。
 * char略有不同，如果找不恰好接收char参数的方法，会提升为int
 * 
 * @author rengzailushang
 *
 */
public class OverloadDemo {

	public void f1(char x) {
		System.out.print("f1(char)");
	}

	public void f1(byte x) {
		System.out.print("f1(byte)");
	}

	public void f1(short x) {
		System.out.print("f1(short)");
	}

	public void f2(short x) {
		System.out.print("f2(short)");
	}

	public void f2(int x) {
		System.out.print("f2(int)");
	}

	public void f3(int x) {
		System.out.print("f3(int)");
	}

	public void testChar() {
		char c = 'x';
		System.out.print("char:");
		f1(c);
		f2(c);
		f3(c);
		System.out.println();
	}

	public void testByte() {
		byte c = 0;
		System.out.print("byte:");
		f1(c);
		f2(c);
		f3(c);
		System.out.println();
	}

	public static void main(String[] args) {
		OverloadDemo demo = new OverloadDemo();
		demo.testChar();
		demo.testByte();
	}
}
