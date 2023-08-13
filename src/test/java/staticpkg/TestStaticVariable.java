package staticpkg;

public class TestStaticVariable {
	public static int a=20;
	int z=30;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(TestStaticVariable.a);
		TestStaticVariable obj1=new TestStaticVariable();
		System.out.println(obj1.z);
		System.out.println(obj1.a);
		TestStaticVariable obj2=new TestStaticVariable();
		System.out.println(obj2.a);
		
		
		

	}

}
