package otherpackage;

public class Seperate_char_AND_no {
	public static void main(String[] args) {
		String ifsc="SBIN00393";
		for(int i=0;i<=ifsc.length()-1;i++) {
		char sep = ifsc.charAt(i);
		//System.out.print(sep);
		if(Character.isAlphabetic(sep)==true) {
			System.out.println(ifsc.charAt(i));
		}
	}
		
	}
}

