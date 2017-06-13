package com.rengzailushang.thinkinginjava.init.array;

/**
 * Using array syntax to create variable argument listes.
 *
 */
public class NewVarArgs {

	// 可变参数列表
	static void printArray(Object... args) {
		for (Object o : args) {
			System.out.print(o);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14, 11.11);
		printArray("one", "two");
		// 数组
		printArray(new Integer[] { 1, 2, 3 });
		printArray();
	}
}
