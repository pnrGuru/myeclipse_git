package Inheritance;
class AParent{
	void display() {
		System.out.println("I am parent");
	}
}
class Bchild extends AParent{
	void study() {
		System.out.println("Studying");
	}
	void display() {
		System.out.println("I am Bchild");
	}
	
}
class Cchild extends AParent{
	void play() {
		System.out.println("playing");
	}
}
public class HirarcInheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bchild obj1= new Bchild();
obj1.study();
obj1.display();// iam bchild
Cchild obj2=new Cchild();
obj2.play();
obj2.display();
	}

}
