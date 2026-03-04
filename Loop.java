public class Loop {
    public static void main(String[] args) {
        //Print numbers 1 to 5 using for loop
        int i;
        System.out.print("For Loop:");
        for(i=1;i<=5;i++)
        {
            System.out.print(" "+i);
        }

        //Print numbers 1 to 5 using while loop
        i = 1;
        System.out.println("");
        System.out.print("While Loop:");
        while(i<=5)
        {
            System.out.print(" "+i);
            i++;
        }

        //Print numbers 1 to 5 using do-while loop
        i = 1;
        System.out.println("");
        System.out.print("Do-While Loop:");
        do{
            System.out.print(" "+i);
            i++;
        }while(i<=5);
    }
}
