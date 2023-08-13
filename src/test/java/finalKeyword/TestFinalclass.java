package finalKeyword;
final class ABC{
	void show() {
		System.out.println("iam a final class and i can not be overriden");
	}
}

public class TestFinalclass extends ABC {
	void show() {
		System.out.println("mmmm");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinalclass obj1=new TestFinalclass();
		obj1.show();
	}

}
