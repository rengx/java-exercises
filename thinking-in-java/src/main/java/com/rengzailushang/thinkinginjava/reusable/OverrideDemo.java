package com.rengzailushang.thinkinginjava.reusable;

public class OverrideDemo extends BaseClass{

	//@Override
	//void base(String i){} // 基类中必须有可重写的方法，否则编译报错
	
	@Override
	void base(int i){}
}

class BaseClass {
	void base(int i){}
}
