package otherpackage;
//find total no of white spaces
public class White_spaces {
public static void main(String[] args) {
	int count=0;
	String a="my name is deepak and i have complete my be from pune univercity";// total 12 space available
	for (int i=0;i<=a.length()-1;i++) {
		char each = a.charAt(i);
		if(each == ' ') {
			 count++;
		}
		
	}
	System.out.println(count);
	
}
}
