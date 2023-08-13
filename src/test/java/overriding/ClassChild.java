package overriding;
class Parent{
	void display() {
		System.out.println("I am a parent");
	}
}
public class ClassChild extends Parent {
	void display() {
		System.out.println("I am a child");
	}


	public static void main(String[] args) {
		
		Parent obj=new Parent();
		obj.display();// i am parent
		
		Parent obj2=new ClassChild() ;
		obj2.display();// I am a child
			
		
	}

}
