package finalpack;

class Child{
	final String fname;//must be intialized 
	
	void modify() {
		
		System.out.println(fname);
	}
}
public class FinalOnlySubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj1=new Child();
//obj1.fname="Abc";
obj1.modify();


	}

}
