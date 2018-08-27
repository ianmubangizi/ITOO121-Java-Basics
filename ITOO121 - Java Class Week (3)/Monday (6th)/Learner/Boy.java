package Learner;
import java.util.Scanner;

public class Boy{
	Scanner input = new Scanner(System.in);
	private String name;
	private double height;
        private double weight;

	public Boy(){

	}

	public Boy(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void setName(){
		this.name = input.next();
	}

	public String getName(){
		return this.name;
	}

	public void setHeight(){
		this.height = height;
	}

	public double getHeight(){
		return this.height;
	}

	public void setWeight(){
		this.weight = weight;
	}

	public double getWeight(){
		return this.weight;
	}
	public double bmiCalc(){
		return weight/(height*height);
	}

	public String vetting(){
		if(bmiCalc() < 18.5)
			return "Under Weight";
		if(bmiCalc() < 24.9)
			return "Healthly";
		if(bmiCalc() < 29.9)
			return "Over Weight";
		else
			return "Obeise?";
	}
}


