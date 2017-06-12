package com.rengzailushang.thinkinginjava.init.thisdemo;

public class ThisDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.eat(new Apple());
	}
}

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		// remove peel
		return apple;
	}
}