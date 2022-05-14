package super_keyword;

public class Emmidiate_son extends Super_Class{
	public void a1(){
		String surename="ingale";
		System.out.println(super.name);//here super keyword access instance variable of super class
	}
	public void a2() {
		System.out.println("deepak ingale");
		
	}
	
	//concept of super keyword with superclass method
	public void a3() {
		super.mobile();//here super keyword access instance method of super class
		a2();
	}
	
	
	//son_class constructor
	Emmidiate_son(){
		super();//here with the help of super keyword we call superclass constructor
	}
	
	public static void main(String[] args) {
		Emmidiate_son a=new Emmidiate_son();
		a.a1();
		a.a3();
	}

}
