package keywords;
class PrivateConstructor{
	protected PrivateConstructor() {
		System.out.println("Hi hello");
		
	}
	void display() {
		System.out.println("no");
	}
}
public class WithoutThisKeyword extends PrivateConstructor {
	int id;
	String Name;
	static int j;
	boolean z;
	 WithoutThisKeyword(int id,String name,boolean z){
		 super();
		id=id;
		Name=Name;
		z=z;
		
	}
	WithoutThisKeyword(){
		System.out.println("hi");
		
		
	}
	
	
	void show() {
		System.out.println(id+""+Name+" "+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WithoutThisKeyword t=new WithoutThisKeyword(2334,"Anu",false);
WithoutThisKeyword t2=new WithoutThisKeyword();
WithoutThisKeyword t3=new WithoutThisKeyword();

t.show();//null
System.out.println(t2);
//t.j=3;
//System.out.println(t.j);

	}

}
