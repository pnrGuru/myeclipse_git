package interfaces;



class Wheel implements Movable,Rollable {
	public boolean move(){
		return true;
	
	}
	public boolean A() {
		return true;
		
		
	}
public boolean roll() {
	return false;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Wheel obj1=new Wheel();
Rollable obj2=new Wheel();

obj1.roll();
System.out.println(obj1.move());
System.out.println(obj1.roll());




	}

}
