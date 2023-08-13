package keywords;

public class CallMethodInMethod {
	void display() {
		System.out.println("hi I am 1st method");
	}
	void show() {
		display();
		System.out.println("i am calling display method");
	}
	void visible() {
		this.show();
		this.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethodInMethod obj=new CallMethodInMethod();
		obj.visible();

	}

}
