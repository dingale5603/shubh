package oops_multilevel_inheritence;

public class Father extends GrandFather {
	public void money() {
		System.out.println("father money");
		System.out.println(super.a);    // super key use when two same variable access from another class
		System.out.println(a);
		System.out.println(b);
	}
	public void home() {
		System.out.println("father home");
	}

}
