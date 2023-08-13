package methodoverloading;
class MultipleMethods{
	void m1() {
		System.out.println("hi");
		
	}
	int m1(int x) {
		return x;
		
	}
	int m1(int x,int y ) {
		return x+y;
	}
	double m1(double x,double y,double z) {
		return x*y*z;
	}
}

public class MethodOveloadingParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleMethods obj1=new MultipleMethods();
		obj1.m1();//hi
		int op2=obj1.m1(3);
		int op3=obj1.m1(4,5);
		double op4=obj1.m1(3.2,2.1,6.3);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
		
		
		
	}

}
