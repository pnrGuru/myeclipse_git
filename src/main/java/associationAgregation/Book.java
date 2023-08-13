package associationAgregation;

public class Book {
	String name;
	int price;
	
	//author details
	Author autherobj;
	Book(String n,int p,Author autherobj)
		{
			this.name=n;
			this.price=p;
			this.autherobj=autherobj;
			
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author autherobj1=new Author("Durga",16,"USA");
Book b=new Book("pnr book",230,autherobj1);
System.out.println("Book Name: "+b.name);
System.out.println("Book Price: "+b.price);
System.out.println("------------Auther Details----------");
System.out.println("Auther Name: "+b.autherobj.authorname);
System.out.println("Auther Age: "+b.autherobj.age);
System.out.println("Auther place: "+b.autherobj.place);



	}

}
