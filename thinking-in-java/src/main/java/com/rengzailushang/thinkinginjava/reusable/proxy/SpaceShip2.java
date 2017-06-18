package com.rengzailushang.thinkinginjava.reusable.proxy;

/**
 * 使用代理建造太空船
 * 
 * @author rengzailushang
 *
 */
public class SpaceShip2 {
	private String name;
	private SpaceShipControls control = new SpaceShipControls();
	public SpaceShip2(String name) {
		this.name = name;
	}
	public void forward(int velocity) {
		control.forward(velocity);
	}
	public void back(int velocity) {
		control.back(velocity);
	}
}
