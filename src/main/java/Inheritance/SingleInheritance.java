package Inheritance;
class Animal{
	
	void sound() {
		System.out.println("I am an Animal");
		
	}
}
class Dog extends Animal{
	
	
	
}
 class SingleInheritance{

	 
	public static void main(String[] args) {
		
Animal obj1=new Dog();
obj1.sound();
	}

}
