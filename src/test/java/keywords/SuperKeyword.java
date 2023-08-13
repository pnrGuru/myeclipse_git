package keywords;
class SuperParent{
	String name;
	SuperParent(String name){
		this.name=name;
	}
	void gaurdian() {
		System.out.println("supermethod");
	}
}

public class SuperKeyword extends SuperParent {
	int x;
	SuperKeyword(String name,int x){
		super(name);
		this.x=x;
	}
	void display() {
		super.gaurdian();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyword key=new SuperKeyword("Nutan",3);
		key.display();
		
		

	}

}
