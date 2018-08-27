import java.util.Scanner;
import Learner.Boy;

public class Student {
  	Scanner input = new Scanner(System.in);
	private String name;
	private String surname;
	private double mark;

	public Student() {

	}

	public Student(String name, String surname, double mark){
		this.name = name;
		this.surname = surname;
		this.mark = mark;
	}

	public void setName(){
		this.name = input.next();
	}

	public String getName(){
		return this.name;
	}

	public void setSurname(){
		this.surname = input.next();
	}

	public String getSurname(){
		return this.surname;
	}

	public void setMark(){
		this.mark = input.nextDouble();
	}

	public double getMark(){
		return this.mark;
	}

	public String StudentInfo(){
		return "Fullname: " + getName() + " "
			+ getSurname();
	}
	public static void main(String[] args) {
		Student learner = new Student();
		System.out.print("What is the Student's Name: ");
		learner.setName();
		System.out.print("Surname: ");
		learner.setSurname();

		Boy aBoy = new Boy((learner.getName() + " " +
				    learner.getSurname()),
				    165,65
		);


		System.out.println(learner.StudentInfo());
		System.out.println(aBoy.getName() + " is " + aBoy.vetting());
	}
}

