package com.rengzailushang.thinkinginjava.reusable;

public class FinalDemo {

	private final int i=0;
	private final int j;
	
	public FinalDemo(){
		j=i; // 必须在final域定义处或构造方法中进行复制
	}
}
