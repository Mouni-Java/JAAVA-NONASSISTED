package Assignment;
import java.util.Scanner;
public class Calculator {
	public static void main(String [] args) {
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Enter the operator(+,_-,/,*)");
		char op=sc.next().charAt(0);
		double result=0;
	    switch(op) {
	    case '+':
	    	result=a+b;
	    	break;
	    case '-':
	    	result=a-b;
	    	break;
	    case '/':
	    	result=a/b;
	    	break;
	    case '*':
	    	result=a*b;
	    	break;
	    default:
	    	System.out.println("Entered wrong input");
	    	break;
	    }
	    System.out.println("final result is: ");
	    System.out.println(a+" "+op+" "+b+"=" + result);
		
		
	}
}
	

