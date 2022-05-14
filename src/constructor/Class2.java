package constructor;

public class Class2 {
	int j;
	String l;
	
    Class2(){
	Class1.s=56;    //called static variable of class 1 and assign value
	j=63;    //assign value=63
	Class1 p=new Class1();
	System.out.println(p.f);       //6
	Class1.res=(Class1.s+j);          //56+63 =119
}
Class2(int a,String b){         //(63,"pqr");
	j=a;
	l=b;
	Class1.s=63;
}
Class2(String s,int a,int res){     //("abc",96,69)
	l=s;    //abc
	j=a;
	int e=a+res;        //96+69
	System.out.println(e);     //96+69=165
	Class1.u1(136,"Deepak ingale",693);    //output: deepak ingale,829
}
}
