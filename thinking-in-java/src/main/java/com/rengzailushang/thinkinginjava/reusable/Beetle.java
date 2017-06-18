package com.rengzailushang.thinkinginjava.reusable;

/**
 * 继承与初始化
 * 
 * @author rengzailushang
 *
 */
public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		System.out.println("k=" + k);
		System.out.println("j=" + j);
	}

	public static int x2 = printInit("Beelte.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Beetle b = new Beetle();
	}
}

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println("i=" + i + ",j=" + j);
		j = 39;
	}

	public static int x1 = printInit("Insect.x1 initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}