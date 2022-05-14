package selenium_architecture;

public class Runner {
	public static void main(String[] args) {
		
	
	Chrome c=new Chrome();
	c.a1();
	c.a2();
	c.b1();
	c.c1();
	c.d1();
	WebDriver w=new Chrome();
	w.a1();
	w.a2();
	w.b1();
	
	Firefox f=new Firefox();
	f.a1();
	f.a2();
	
}
}
