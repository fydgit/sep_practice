package Javapractice;

public class Ifelse1 {

	public static void main(String[] args) {
		
		/*int time=22;
		
		if(time<8) {
			System.out.println("good morning");
		}
		else if (time<=14) {
			System.out.println("good afternoon");
		}
		else if(time<=18) {
			System.out.println("good evening");
		}
		else {
			System.out.println("good night");
		}*/
		
		int money=9;
		
		double khichuri= 15.25;
		double tehari=20.50;
		double biriany=8;
		double rice=7;
		String item;
		
		if(money>khichuri) {
			item ="khichuri";
			//System.out.println("khichuri");
		}
		else if(money>tehari) {
			//System.out.println("tehari");
			item ="tehari";
		}
		else if(money>biriany) {
			//System.out.println("biriany");
			item ="biriany";
		}
		else if(money>rice) {
			//System.out.println("rice");
			item ="rice";
		}
		else {
			//System.out.println("nothing");
			item="nothing";
		}
		System.out.println("you can get " + item);
	}

}
