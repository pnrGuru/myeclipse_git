package keywords;
class StudentS{
	int roll;
	String name,course;
	float fee;
	StudentS(int roll,String name,String course)
	{
		this.roll=roll;
		this.name=name;
		this.course=course;
		
	}
	StudentS(int roll,String name,String course,float fee){
		this(roll,name,course);
		this.fee=fee;
		
	}
	void display(){
		System.out.println(+roll+"\n "+name+"\n "+course+"\n "+fee);
	}
	
}
public class ThisConstructor {
	

	public static void main(String[] args) {
		StudentS st=new StudentS(2334,"Durga","java",67.44f);
		st.display();
		
		

	}

}
