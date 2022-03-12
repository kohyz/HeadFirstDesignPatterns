package impl;

import inter.QuackBehaviour;

public class NoQuackImpl implements QuackBehaviour {

	public void quack() {
		System.out.println("I cannot quack.");
	}
}
