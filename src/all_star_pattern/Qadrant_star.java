package all_star_pattern;

public class Qadrant_star {
	public static void main(String[] args) {
		
	
	int n=5;
	for(int i=1;i<=n;i++) {
	
		for(int j=i;j<=n;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}

	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print(" *");
		}
		for(int j=i;j<=n;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}

	
	//if you want to remove same row then take only < sign instead of <= in for loop of row
	//if you want to remove same column then take only < sign instead of <= in for loop of column as below
System.out.println("--------------------------------------------");



for(int i=1;i<n;i++) {//here we remove = sign to remove row

	for(int j=i;j<=n;j++) {
		System.out.print("  ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(" *");
	}
	for(int j=1;j<i;j++) {//here we remove = sign to remove column
		System.out.print(" *");
	}
	System.out.println();
}

for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("  ");
	}
	for(int j=i;j<=n;j++) {
		System.out.print(" *");
	}
	for(int j=i;j<n;j++) {//here we remove = sign to remove column
		System.out.print(" *");
	}
	System.out.println();
}

}
}