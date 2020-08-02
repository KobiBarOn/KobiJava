package org.kobi.java;

public class Car {

	int speed; // global variables - initialized automatically

	void drive() {
		int x; // local variables - NOT initialized automatically
		System.out.println(this.speed);
		x = 10; // must initialized manually in order to use/print them
		System.out.println(x);
	}

}
