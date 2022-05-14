package otherpackage;
//find length of each word in string
public class Eachword_length_Str {
public static void main(String[] args) {
	String a="my name is deepak";
	String[] str = a.split(" ");
for (int i=0;i<=str.length-1;i++) {
	System.out.println(str[i]+" = "+str[i].length());
}


}
}

