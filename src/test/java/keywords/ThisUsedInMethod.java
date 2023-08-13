package keywords;

public class ThisUsedInMethod {
    private int value;

    public ThisUsedInMethod(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void doubleValue() {
        this.value *= 2;
    }

    public void performOperationOnInstance(ThisUsedInMethod instance) {
        instance.doubleValue();
    }

    public static void main(String[] args) {
        ThisUsedInMethod obj1 = new ThisUsedInMethod(5);
        obj1.printValue(); // Output: Value: 5

        ThisUsedInMethod obj2 = new ThisUsedInMethod(10);
        obj2.printValue(); // Output: Value: 10

        obj1.performOperationOnInstance(obj1);
        obj1.printValue(); // Output: Value: 10

        obj2.performOperationOnInstance(obj2);
        obj2.printValue(); // Output: Value: 20
    }
}
