package interfaces;

interface AllowPrivate{
	void getdisplay();
		
	 boolean add();
	static void display() {
		System.out.println("allow ststic methods with body");
	}
	default void show() {
		System.out.println("allow default methods with body");
		//private();
	}
	//private void private() {
		//System.out.println(" i am private");
	//}
}
public class PrivateMethodInterfaces implements AllowPrivate {
	public boolean add() {
		return true;
	}
	public void getdisplay(){
		System.out.println("I am abstract method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	AllowPrivate obj1=new PrivateMethodInterfaces();
	
	obj1.show();
	AllowPrivate.display();
	obj1.add();
	obj1.getdisplay();
	

}
}
