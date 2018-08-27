import java.util.Scanner;

public class Circle{
	private int radius;

	public Circle(int radius){
		this.radius = radius;
	}

	public int getRadius(){
		return this.radius;
	}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	}
}

class Sphere extends Circle{
	private String color;

	public Sphere(int radius, String color){
		super(radius);
		this.color = color;
	}

	public void show(){
		System.out.println("Sphere Radius: " + super.getRadius()
				+  "Sphere Color: " + this.color

		);
	}

}

class Cylinder extends Circle{
	private int height;

	public Cylinder(int radius, int height){
		super(radius);
		this.height = height;
	}

	public void show(){
		System.out.println("Cylinder Radius: " + super.getRadius()
				+  "Cylinder Color: " + this.height

		);
	}
}
