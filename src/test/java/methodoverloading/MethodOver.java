package methodoverloading;
class MO{
	int add(int x,int y) {
		return x+y;
	}
	//overload the same method
	double add(double a,double b) {
		return a+b;
	}
	void add() {
		System.out.println("i am a method overloaded without any arguments");
		
	}
	
}

public class MethodOver {

	public static void main(String[] args) {
		MO obj1=new MO();
		obj1.add();//i am a method overloaded without any arguments
		
		double print=obj1.add(2.4,5.2);//2.4+5.2=7.6
		int p1=obj1.add(2,5);//7
		System.out.println(print);
		System.out.println(p1);
		
		
		

	}

}
