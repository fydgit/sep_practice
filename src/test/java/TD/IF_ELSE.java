package TD;

public class IF_ELSE {

	public static void main(String[] args) {
		
	/*	//if statement
		int a=70;
		int b=80;
		
		if(a<b) {    //if statement always true
			System.out.println("true");
		}
		//else if statement
		int time1=14;
		
		if(time>25) {
			System.out.println("good morning");
		}
		else if(time>15) {
			System.out.println("good noon");
		}
		else{
			System.out.println("good night");
		}*/
	
	
		/* time=24, 
		good morning= before 12 pm, 
		good afternoon= after 12 pm, 
		good evening= after 3 pm, 
		good night=after 6pm
		
		print good evening*/
		
		int time=22;
		
		if(time<11) {
			System.out.println("good morning");
		}
		else if(time<14) {
			System.out.println("good afternoon");
		}
		else if(time<17) {
			System.out.println("good evening");
		}
		else {
			System.out.println("Good night");
		}
		
		
/*It is a program of grading system for fail, D grade, 
		C grade, B grade, A grade and A+.*/
		int marks=48;
		
		if(marks>=80 && marks<=100) {
			System.out.println("A+");
		}
		else if(marks>=70 && marks<80){
			System.out.println("A");
		}
		else if(marks>=60 && marks<70){
			System.out.println("B");
		}
		else if(marks>=50 && marks<60){
			System.out.println("C");
		}
		else if(marks>=40 && marks<50){
			System.out.println("D");
		}
		else if(marks<40){
			System.out.println("Fail");
		}
		else {
			System.out.println("invalid");
		}
		
		//It is a program of odd and even number.
		
	}

}







































