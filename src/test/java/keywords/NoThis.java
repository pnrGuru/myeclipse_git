package keywords;

public class NoThis {
	int number;
	int decimal;
	
	
	NoThis(int number,int decimal){
		this.number=number;
		this.decimal=decimal;
	}
	void show() {
		System.out.println("hi");
	}
	void display() {
		System.out.println(+number+" "+decimal);
	
	this.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
NoThis ts=new NoThis(2,9);
ts.display();

	}

}
