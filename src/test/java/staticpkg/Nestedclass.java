package staticpkg;
class OuterClass{
	int b=40;
	class InnerClass{
		
	}
	static class StaticInnerclass{
		static int a=70;
	
		
	}
}

public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int var=OuterClass.StaticInnerclass.a;
System.out.println(var);

	}

}
