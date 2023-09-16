package Code;

class Democlass implements Interface1,Interface2 {


	
	public void code3() {
		System.out.println("hello world");
		
	}

	public void code4() {
		int a=44;
		int b=44;
		int u=a*b;
		System.out.println(u);
		
	}

	public void code1() {
		System.out.println("good morning");
	}

	public void code2() {
		System.out.println("good night");
	}

	}
class main{
public static void main(String[] args) {
	Democlass obj=new Democlass();
	obj.code1();
	obj.code2();
	obj.code3();
	obj.code4();
	
}
}