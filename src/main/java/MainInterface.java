interface A{
	 final int value=10;
	void display();
	void add(int value);
	
}
class B implements A{
	
	public void display() {
		System.out.println(value);
	}
	public void add(int value) {
		System.out.println("value of add method"+value);
	}
}
public class MainInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj1=new B();
obj1.add(6);
System.out.println(obj1.value);


	}

}
