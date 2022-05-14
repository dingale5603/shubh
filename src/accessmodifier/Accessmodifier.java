package accessmodifier;
       // their are 4 type of access modifier 
           // 1. private= access only in that class
           //2. public = access any where
           //3. default =access from different class but not access from different package
           //4. protected= access from different class and access from different package as well but need to do inheritance operation 
public class Accessmodifier {
	public static void main(String[] args) {
		Timepass2 k=new Timepass2();               //access modifier 'protected' access only from one class to another class
		k.nukri();                                  //also to access 'protected' access modifier from another package use inheritance operation
		Timepass2.nukri1();
		Timepass2.nukri2();
		Timepass2 l=new Timepass2();                    //access modifier 'default' access only from one class to another class
		l.nukri3();                                      //access modifier 'default' not access from one package to another package
		
		
	}

}
