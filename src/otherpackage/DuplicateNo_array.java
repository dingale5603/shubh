package otherpackage;
//duplicate no in array
public class DuplicateNo_array {
	public static void main(String[] args) {
		int arry[]= {3,36,3456,65,364,36};
	
  		for(int i=0;i<=arry.length-1;i++) {
	       for(int j=i+1;j<=arry.length-1;j++) {
			  if(arry[i]==arry[j]) {
				System.out.println("duplicate no in array: "+arry[i]);
				}
			}
		}
		
	}

	}


