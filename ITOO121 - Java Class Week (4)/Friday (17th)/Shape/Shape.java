public abstract class Shape{
	public abstract void draw();
	public void colorMe(){
		System.out.println("Green");
	}
	public static void main(String[] args){
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		circle.draw();
		triangle.draw();
		rectangle.draw();

	}
}

class Circle extends Shape{
	@Override
	public void draw(){
	System.out.println("Circle is");
	super.colorMe();

	};
}
class Triangle extends Shape{
	@Override
	public void draw(){
	System.out.println("Triangle is");
	super.colorMe();

	};

}
class Rectangle extends Shape{
	@Override
	public void draw(){
	System.out.println("Rectangle is");
	super.colorMe();
	};

}

