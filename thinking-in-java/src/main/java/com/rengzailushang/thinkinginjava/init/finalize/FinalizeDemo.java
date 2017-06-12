package com.rengzailushang.thinkinginjava.init.finalize;

public class FinalizeDemo {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.setStatus(true);
		//tank = null; //取消对象引用与对象的关联，GC才会对对象进行回收
		System.gc();
	}
}

class Tank {
	boolean isFull;

	public void setStatus(boolean isFull) {
		this.isFull = isFull;
	}

	protected void finalize() {
		// super.finalize();
		if (isFull) {
			System.out.println("It is full now.");
		}
		System.out.println("execute finalize method.");
	}
}
