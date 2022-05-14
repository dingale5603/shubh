package control_stat;

       //simple if else
       //month
public class If_Elseuse {
	static int month=28;
	
	public static void m1() {

	if (month==31)
	{
		System.out.println("jan,march,may,july,august,oct,dec");
	}else if (month==30)
	{
		System.out.println("april,june,sep,nov");
	}else if(month==29|| month==28)
	{
		System.out.println("feb");	
	}
	else
	{
		System.out.println("not any month");
	}
	}	
	//nested if else
	public static void m2() {
		String username= "abc";
		String password="DSI@13";
		
		if (username=="abc") {
			
			System.out.println("username valid");
			
			if (password=="DSI@134") {
				System.out.println("password valid");
		}else 
			System.out.println("password invalid");
		
		}else {
			System.out.println("username invalid");
		}
		}


	public static void main(String[] args) {
		m1();
		m2();
		
	}
}
