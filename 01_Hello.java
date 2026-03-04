class Hello
{
    public static void main(String a[])
    {
        int num1 = 12;
        int num2 = 44;
        int sum = num1 + num2;
        System.out.println("Hello World");
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        //data conversion --> lower to higher
        byte b = 10;
        int i = b; // implicit type casting
        System.out.println("The value of i is: " + i);

        //type casting --> higher to lower
        int x = 100;// If value of x is greater than 127, then value of y will become x%256
        byte y = (byte) x; // explicit type casting
        System.out.println("The value of y is: " + y);
    }
}