package staticpkg;

public class TestStaticMethod1 {
	public static int  add(int a,int b) {
		return a+b;
	}
	public int sub(int c, int d) {
		return c-d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=TestStaticMethod1.add(4, 4);
System.out.println(sum);
TestStaticMethod1 obj1=new TestStaticMethod1();
int sub=obj1.sub(8, 3);
System.out.println(sub);


	}

}
