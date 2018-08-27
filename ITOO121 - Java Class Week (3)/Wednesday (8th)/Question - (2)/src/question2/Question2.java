
import java.util.Scanner;

/*
*
*
*/
public class Question2{
	Scanner input = new Scanner(System.in);
	private char marCode;

	public Question2(){

	}

	public Question2(char mc){
		this.marCode = mc;
	}

	public void setMarCode(){
		System.out.print("Enter your marital status\nPossble Codes\n"
				+ "[M] = Married\n[S] = Single\n"
				+ "[D] = Divorced\n[W] = Widowed\n[Enter Code]: "
				);
		this.marCode = input.next().charAt(0);
	}

	public char getMarCode(){
		return this.marCode;
	}

	public String checkStatus(){
		if(this.getMarCode() == ('M' | 'm'))
			return "You are Married";

		if(this.getMarCode() == ('D' | 'd'))
			return "You are Divorced";
		if(this.getMarCode() == ('S' | 's'))
			return "You are Single";
		if(this.getMarCode() == ('W' | 'w'))
			return "You are Widowed";
		else
			return "Looks like there was an input Error";
	}

	public void displayStatus(){
		System.out.println(this.checkStatus());
	}

	public static void main(String[] args){
		Question2 lover = new Question2();
		lover.setMarCode();
		lover.displayStatus();
	}
}
