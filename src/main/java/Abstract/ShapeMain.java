package Abstract;

abstract class Shape{
	String color;
	public Shape(String color ) {
		this.color=color;
		
	}
	public void display() {
		System.out.println("Shape");
	}
	abstract double calculateArea();
}

class Rectangle extends Shape{
	 double width;
	 double length;
	 public Rectangle(String color,double width,double length){
		 super(color);
		 this.width=width;
		 this.length=length;
		 
	 }
	 double calculateArea(){
		 return length*width;
		 
	 }
	 
	
}
class Circle extends Shape{
	double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius=radius;
	}
	double calculateArea() {
		return Math.PI*radius*radius;
		
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj1=new Rectangle("red",2.4,5.8);
		obj1.calculateArea();
		System.out.println(obj1.calculateArea());
		
		Shape obj2=new Circle("yellow",3);
		obj2.calculateArea();
		System.out.println(obj2.calculateArea());
	}

}
