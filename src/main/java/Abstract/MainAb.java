package Abstract;
abstract class A{
	int a;
	int b;
	int c;
	A(){
		System.out.println("I am constructor");
	}
	void add() {
		
	}
	abstract void display();
}
class B extends A{
	void display() {
	System.out.println("I am abstact method Implemented from Class A");
	}
	
}
public class MainAb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new B();
		obj1.display();
	}

}
