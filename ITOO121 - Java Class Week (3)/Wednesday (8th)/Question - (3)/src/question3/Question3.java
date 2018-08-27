import java.util.Scanner;

public class Question3{
	Scanner input = new Scanner(System.in);
	private final double evaPrice = 2.50;
	private double timeSpent;

	public Question3(){

	}

	public Question3(double time){
		this.timeSpent = time;
	}

	public void setTimeSpent(){
		System.out.print("How much time was spent: ");
		this.timeSpent = input.nextDouble();
	}

	public double getTimeSpent(){
		return this.timeSpent;
	}

	public double grading(){
		double rnPrice = 0;
		switch(getRateCase(getTimeSpent())){
			case 1:
				rnPrice = evaPrice + 20.00;
				break;
			case 2:
				rnPrice = evaPrice + 19.20;
				break;
			case 3:
				rnPrice = evaPrice + 18.20;
				break;
			case 4:
				rnPrice = evaPrice + 17.88;
				break;
			default:
				System.out.println("Not a Busy week");
				break;
		}
		return rnPrice * getTimeSpent();
	}

	public void show(){
		System.out.println("====================================================\n"
				+  "Time Spent was ["+ this.getTimeSpent() +" hours]\n"
				+  "Amount Due: [R"+ this.grading() +"]\n"
				+  "====================================================");
	}

	public int getRateCase(double rate){
		if ((rate > 0) & (rate < 2))
			return 1;
		if (rate < 4.54)
			return 2;
		if ((rate > 4.6) & (rate < 6))
			return 3;
		if (rate > 6)
			return 4;
		else
			return 0;
	}

	public static void main(String[] args){
		Question3 till = new Question3();
		till.setTimeSpent();
		till.show();
	}
}
