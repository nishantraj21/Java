class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();// Create an object of the Calculator class
    //  Class_Name object_name = new Class_Name();

        int sum = calc.add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);
    }
    
}
