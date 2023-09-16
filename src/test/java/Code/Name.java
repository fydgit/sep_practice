package Code;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Name {

	public static void main(String[] args) {
		
		String before="";
		String after="";
		
		ArrayList <Character> Name =new ArrayList <Character>();
		Name.add('d');
		Name.add('o');
		Name.add('l');
		Name.add('a');
		
		ArrayList <Character> Name1 =new ArrayList <Character>();
		for(char x:Name) {
			before=before+x;
			after=after+x;
		}
System.out.println(after+ " is the reverse of "+before);
System.out.println(Name);
	}

}
