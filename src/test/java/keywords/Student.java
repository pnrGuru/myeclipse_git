package keywords;

class Student
{
 void show()
  {
  System.out.println("You got A+");  
  }
  void marks()
  {
  this.show(); //no need to use this here because compiler does it.  
  }
  void display()
  {
  show(); //compiler act marks() as this.marks()  
  }
  public static void main(String args[])
  {
  Student s = new Student();  
  s.display();
  s.marks();
  }
}
