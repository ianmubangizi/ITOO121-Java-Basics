import java.util.Scanner;

/*
*
*
*/
public class Question1{
	Scanner input = new Scanner(System.in);
	private int K;
	private int A;
	private int B;

	public Question1(){
	}

	public Question1(int k , int a, int b){
		this.K = k;
		this.A = a;
		this.B = b;
	}

	public void setK(){
		System.out.print("Enter the Value for K: ");
		this.K = input.nextInt();
	}

	public void setA(){
		System.out.print("Enter the Value for A: ");
		this.A = input.nextInt();
	}

	public void setB(){
		System.out.print("Enter the Value for B: ");
		this.B = input.nextInt();
	}

	public int getK(){
		return this.K;
	}

	public int getA(){
		return this.A;
	}
	public int getB(){
		return this.B;
	}

	public void enterDetails(){
		this.setK();
		this.setA();
		this.setB();
	}

	public double calculate(){
		if(this.getK() == 3)
			return this.getA() * 1.05;
		if(this.getK() == 8)
			return this.getA() - 8;
		if(this.getK() == 7)
			return this.getA() + this.getB();
		else
			return this.getA() * 0.88;
	}

	public void display(){
		this.calculate();
		System.out.println("The Value for A is [" + this.calculate() + "]");
	}

	public static void main(String[] args){
		Question1 item = new Question1();
		item.enterDetails();
		item.display();
	}
}
