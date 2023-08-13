package others;


interface shape1{
void getArea();
default void getcolor(){
System.out.println("color");
}
abstract void display();
}
class Rectangle2 implements shape1{
	public void getArea() {
		System.out.println("I am implemented from shape interface");
	}

public void display() {
System.out.println("hai");
}
}
public class Classinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 shape1 obj1=new Rectangle2();
		    obj1.getArea();
		    obj1.display();
		    obj1.getcolor();
			
	}
}