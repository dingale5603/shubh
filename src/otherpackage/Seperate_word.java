package otherpackage;
//separate even index and odd index word from given string
public class Seperate_word {
public static void main(String[] args) {
	String a="my name is deepak";
	String[] ar = a.split(" ");
	for (int i=0;i<=ar.length-1;i=i+2) {
		System.out.println( ar[i]+ ": this is even index word ");
	}
	for (int i=1;i<=ar.length-1;i=i+2) {
		System.out.println(ar[i]+ ": this is odd index word");
	}
}
}
