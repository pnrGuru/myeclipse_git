
package Inheritance;

class Animal123{
	void eat() {
		System.out.println("I eat food");
	}
}



class Dog123 extends Animal123{
	void sound() {
		System.out.println("Bark");
	}
}

class Puppy extends Dog123{
	void play() {
		System.out.println("playing with ball");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Puppy pup=new Puppy();
pup.eat();
pup.sound();
pup.play();
	}

}
