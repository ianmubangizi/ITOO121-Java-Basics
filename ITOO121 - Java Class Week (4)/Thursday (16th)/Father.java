import java.util.Scanner;

public class Father{
	private String surname;

	public Father(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return this.surname;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name;
		String surname;
		double age;

		System.out.print("Enter Name: ");
		name = input.next();
		System.out.print("Enter Surname: ");
		surname = input.next();
		System.out.print("Enter Age: ");
		age = input.nextDouble();

		Son boy = new Son(surname, name, age);
		boy.show();
	}

}


class Son extends Father{
	private String name;
	private double age;

	public Son(String surname, String name, double age){
		super(surname);
		this.name = name;
		this.age =  age;
	}

	public void show(){
		System.out.println("Surname: " + super.getSurname()
				+  "\nName: " + this.name
				+  "\nAge: " + this.age
		);
	}
}
