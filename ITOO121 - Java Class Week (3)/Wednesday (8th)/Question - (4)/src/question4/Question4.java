import java.util.Scanner;

public class Question4{
	Scanner input = new Scanner(System.in);
	private double weight;

	public Question4(){

	}

	public Question4(double weight){
		this.weight = weight;
	}

	public void setWeight(){
		System.out.println("Enter Weight: ");
		this.weight = input.nextDouble();
	}

	public double getWeight(){
		return this.weight;
	}

	public double calculate(){
		return 15.85 + (
			7.5 * this.setRate(
				this.getWeight()
			)
		);
	}

	public void show(){
		System.out.println("Amount Due [R"+ this.calculate() +"]");
	}

	private int setRate(double x){
		int y;
		if (x <= 1.5)
			return 0;
		else
			y = ((int)(x / 0.5)) / 2;
			if ((((x / 0.5)/2) - y) > 0.5)
				return y + 1;
			else
				return y;
	}

	public static void main(String[] args){
		Question4 postbox = new Question4();
		postbox.setWeight();
		postbox.show();
	}
}
