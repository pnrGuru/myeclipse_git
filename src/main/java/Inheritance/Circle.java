package Inheritance;
class Operation{
	public  int square(int n) {
		return n*n;
		
	}
}

public class Circle {
	Operation op; // RemoteWebdriver driver;
	double pi=3.14;
	double area(int radius) {
		op=new Operation();
		int r=op.square(radius);
		return pi*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle();
double result=c.area(7);
System.out.println(result);//
	}

}

