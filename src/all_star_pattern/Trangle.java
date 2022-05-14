package all_star_pattern;

public class Trangle {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for (int j=1;j<i;j++) {//here = remove to remove extra column
	
			System.out.print("*");
		}
		for (int j=1;j<=i;j++) {
			System.out.print("*");
		}
      System.out.println();
	}
}
}
