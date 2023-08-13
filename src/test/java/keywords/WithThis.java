package keywords;

public class WithThis {
	int id;
	String name;
	String city;
	WithThis(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	void show() {
		System.out.println(id+"  "+name+"  "+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithThis ts=new WithThis(1,"ABC","HYD");
		ts.show();
		

	}

}
