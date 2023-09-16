package Javapractice;

//import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Practice1nonstatic {
	
	
//First Class create Non-Static Method with int
	public static void num() {
		int x=33;
		int y=44;
		int z=x*y;
		System.out.println(z);
	}
//*Second Class create Non-Static Method with double
	public static void num2() {
	double a=3.3;
	double b=5.5;
	double c=a*b;
	System.out.println(c);
	}
	
//*Third Class create Non-Static Method with String
	public static void num3() {
		String no="one";
	System.out.println(no);
	}
	
/*Create object of the class & call method for each class 
	Print Result for each class*/
	public static void main(String[] args) {
		/*Practice1nonstatic.num();
		Practice1nonstatic.num2();
		Practice1nonstatic.num3();*/
		
	
		
		
		/*Practice1nonstatic obj=new Practice1nonstatic();
		obj.num();
		obj.num2();
		obj.num3();
		
		//Practice1nonstatic obj2=new Practice1nonstatic();
		//obj2.num2();
		
		//Practice1nonstatic obj3=new Practice1nonstatic();
		//obj3.num3();*/


	}

}
