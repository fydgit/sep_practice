package TD;

import java.util.ArrayList;

public class For_loop2 {

	public static void main(String[] args) {
		
	//print even value 0 to 25
		 for(int k=0;k<=25; k=k+2) {
				System.out.println("EVEN NUMBER= "+ k );
			    }
		 
		//print odd value 0 to 25 
		for(int i=1;i<=25;i=i+2) {
			System.out.println("odd number= "+ i);
		}
		
		//print "i am student from NextTech" 5 time
		
	String sen= "i am student from NextTech";
	for(int i=0; i<5; i=i+1) {
		System.out.println(sen);
	}
	
	/*enhenced forloop syntax
	for (Datatype a:variable) {
		System.out.println();*/
	
	ArrayList<String>Dola=new ArrayList<String>();
	Dola.add("sun");
	Dola.add("moon");
	
	for(String name:Dola) {
		System.out.println(name);
	}
	}

}
