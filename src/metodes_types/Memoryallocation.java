package metodes_types;

public class Memoryallocation {
	public static void memory () {
		System.out.println(" in static memory allocation only once ");
	 }
	 public void memory1() {
		 System.out.println(" in non static memory allocation for every object ");
	 }
	 public static void main(String[] args) {
		Memoryallocation s= new Memoryallocation();      // memory allocated for each object  s,t,u. 
		s.memory1();
		Memoryallocation t= new Memoryallocation();
		t.memory1();
		Memoryallocation u= new Memoryallocation();
		u.memory1();
		Memoryallocation.memory();    //memory allocated once only
		Memoryallocation.memory();
		Memoryallocation.memory();
		
	 }
}
