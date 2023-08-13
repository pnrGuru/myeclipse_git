package staticpkg;
class Staticvariable{
	static int a=20;
	int b=30;
	public int show() {
		return a;
		
	}
}

public class TestSttaicmethod {
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sum=TestSttaicmethod.add(2,3);
		System.out.println(sum);
		double sum2=TestSttaicmethod.add(22, 34, 40);
		System.out.println(sum2);
		//TestSttaicmethod obj1=new TestSttaicmethod();
		//TestSttaicmethod obj2=new TestSttaicmethod();
	//	Staticvariable obj3=new Staticvariable();
		//obj3.a; //a should be accessed in static way
		//obj3.b;//b is non static 
		obj3.show();
		System.out.println(obj3.show());
		
		
		System.out.println(obj1.add(3, 9));
		System.out.println(obj2.add(3, 7));
		

	}

}
