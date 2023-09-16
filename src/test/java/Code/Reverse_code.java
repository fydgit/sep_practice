package Code;

public class Reverse_code {

	public static void main(String[] args) {
		
		
	String a="welcome home";
		String reverse="";
		
		/*//int len=a.length();
		for (int i=a.length()-1;i>=0;i--)
		{
			//reverse=reverse+a.charAt(i);
			reverse=reverse+a.charAt(i);
		}
	//	System.out.println(reverse+ " is the reverse of " + a);		
System.out.println(reverse);*/

/*String name="Dola";
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.length());*/
		
		StringBuffer sb=new StringBuffer(a);
	System.out.println(sb.reverse());
}
}