package finalpack;
class MyClass {
    final int myFinalVariable;

    MyClass(int value) {
        myFinalVariable = value; // Initialization in the constructor
    }

    void modifyFinalVariable(int newValue) {
        
       //myFinalVariable = newValue; // Error: Cannot assign a value to final variable
    	System.out.println(newValue);
    }

    void display() {
        System.out.println("Value of myFinalVariable: " + myFinalVariable);
    }
}

public class Finalgpt {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        obj.display(); // Output: Value of myFinalVariable: 42
        obj.modifyFinalVariable(100); // Error: Cannot assign a value to final variable
    }
}


