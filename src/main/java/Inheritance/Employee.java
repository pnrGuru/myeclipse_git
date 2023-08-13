package Inheritance;


	public class Employee {  
		int id;  
		String name;  
		Address address; //has a relation 
		  
		public Employee(int id, String name,Address address) {  
		    this.id = id;  
		    this.name = name;  
		    this.address=address;  
		}  
		  
		void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  //acessing address class varables
		}  
		  
		public static void main(String[] args) {  
			//creating object to the Address class 
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		  
		Employee e=new Employee(111,"varun",address1);  //111,varun,gzb,up,india
		Employee e2=new Employee(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
		} 