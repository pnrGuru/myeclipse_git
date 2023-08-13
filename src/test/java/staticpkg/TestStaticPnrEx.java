package staticpkg;
import java.util.*;
class Student {
	String name;
	static String course;
	static String faculty;
	
}

public class TestStaticPnrEx {

	public static void main(String[] args) {
		List<Student>batch264=new ArrayList<Student>();
		Student one=new Student();
		one.name="rekha";
		batch264.add(one);
		
		Student two=new Student();
		two.name="Durga";
		batch264.add(two);
		
		Student three=new Student();
		three.name="nutan";
		batch264.add(three);
		
		
		
		
		

	}

}
