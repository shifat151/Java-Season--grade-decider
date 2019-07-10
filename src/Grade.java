import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int grade=sc.nextInt();
		if(grade>=80&&grade<=100){
			System.out.println("You have got A+");
		}
		else if(grade>=75&&grade<=79){
			System.out.println("You have got A");
		}
		else if(grade>=70&&grade<=74){
			System.out.println("You have got A-");
		}
		else if(grade>=65&&grade<=69){
			System.out.println("You have got B+");
		}
		else if(grade>=60&&grade<=64){
			System.out.println("You have got B");
		}
		else if(grade>=55&&grade<=59){
			System.out.println("You have got B-");
		}
		
		else if(grade>=50&&grade<=54){
			System.out.println("You have got C+");
		}
		
		else if(grade>=45&&grade<=49){
			System.out.println("You have got C");
			
		}
		else if(grade>=40&&grade<=44){
			System.out.println("You have got D");
		}
		else{
			System.out.println("You have got F");
		}
		
			

	}

}
