package otherpackage;

import datatypesuses.Codereuseability;

public class Timepass {
	static int a = 399;
	static int b = 35;
	static int result;
	static float result1;

       public static void both() {
		result = a + b;
		result1 = a - b;
		System.out.println("static addition = " + result);
		System.out.println("static subtraction = "+result1);
	}
	 public void both1() {
		result = a * b;
		result1 = a / b;
		System.out.println("non static multiplication = " + result);
		System.out.println("non static dividation = " + result1);
	}

	public static void main(String[] args) {
		Timepass.both();
		Timepass dsi = new Timepass();
		dsi.both1();
		Codereuseability.additionsubtraction();
		Codereuseability.multiplication();              //here i called static and non static method from previous package (class)     ( codereuseability.java )
		Codereuseability d=new Codereuseability();
		d.dividation();
	}

}
