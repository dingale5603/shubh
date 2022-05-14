package otherpackage;

public class Mobile_no {
	int a= 5;
		public static void a1() {
			long s=8379952705l;
		     int l=0;
			while(s!=0) {
				s=s/10;
				l++;
			}
			if (l==10) {
			System.out.println("mob no valid");
		}   
		else 
			System.out.println("mob no not valid");
		}

		public static void main(String[] args) {
			a1();
	
		}
	}