package datatypesuses;

public class Datatypescase {
public static void main(String[] args) {
	// 1.declaration:
			String name;
			char grade;
			int rollno;
			float percentage;
			long mobno;                              // for long and float use l and f at end
			

	// 2.initialization
			name= "deepak";
			grade= 'A';
			rollno= 56;
			percentage= 80.65f;
			mobno=9890050562l;

    // 3.usage:
			System.out.println("student name= " +name);
			System.out.println("student grade= " +grade);
			System.out.println("student rollno= "+rollno);
			System.out.println("student percentage= " +percentage);
	        System.out.println("student mobno= " +mobno);
}
}
