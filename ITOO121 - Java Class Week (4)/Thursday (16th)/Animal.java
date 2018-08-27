import  java.util.Scanner;

public class Animal{
	private String zooname;
	private String zooLocation;

	public Animal(String zooname, String Location){
		this.zooname = zooname;
		this.zooLocation = Location;
	}

	public String getZooname(){
		return this.zooname;
	}

	public String getZooLocation(){
		return this.zooLocation;
	}

	public static void main(String[] args){
		String anN, zooN, zooL;
		int age;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Zoo Name: ");
		zooN = input.next();
		System.out.print("Enter Zoo Location: ");
		zooL = input.next();
		System.out.print("Enter Animal Name: ");
		anN = input.next();
		System.out.print("Enter Animal Age: ");
		age = input.nextInt();
		Dog kNine = new Dog(zooN,zooL,anN,age);
		kNine.show();
	}
}

class Dog extends Animal{
	private String animalName;
	private int age;

	public Dog(String zooname,String zoolocation, String animalname, int age){
		super(zooname, zoolocation);
		this.animalName = animalname;
		this.age = age;
	}

	public void show(){
		System.out.println("\nZoo: " + super.getZooname()
				+  "\nLocation: " + super.getZooLocation()
				+  "\nAnimal: " + this.animalName
				+  "\nAge: " + this.age
		);
	}

}
