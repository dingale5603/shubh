package otherpackage;
//fibnacchhi
public class Fibonachi {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int num;
	int iter=11;
	for(int i=0;i<iter;i++) {
		num=a+b;
		a=b;
		b=num;
		System.out.print(" "+num);
	}
	
}
}
