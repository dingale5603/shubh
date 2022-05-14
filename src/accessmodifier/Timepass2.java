package accessmodifier;

import otherpackage.Timepass;

public class Timepass2 {
	public static void main(String[] args) {
		Timepass.both(); // method calling from previous package and new method output.
		Timepass deep = new Timepass();
		deep.both1();
		Timepass2 u = new Timepass2();
		u.nukri();
		Timepass2.nukri1();
	}
	protected void nukri() {
		System.out.println("method calling from previos pacakge and new non static method output");
		
	}
	protected static void nukri2 () { 
		System.out.println("access modifier 'protected' access only from one class to anoter class");
		System.out.println("also to access protected access modifier from another pacakge use inheritance operation");
	}
	static void nukri1() {
		System.out.println("method calling from previos pacakge and new static method output");
}
	void nukri3() {
		System.out.println("access modifier 'defualt' access only from one class to anoter class");
		System.out.println("access modifier 'default' not access from one pacakge to another package");
	}
}
