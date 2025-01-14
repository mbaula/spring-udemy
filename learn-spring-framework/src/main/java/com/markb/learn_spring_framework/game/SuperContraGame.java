package com.markb.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Crouch");
	}
	
	public void left() {
		System.out.println("Shield");
	}
	
	public void right() {
		System.out.println("Shoot");
	}

}
