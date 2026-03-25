class Computer {

    public void PlayMusic() {
        System.out.println("Playing music...");
    }
    public String GetMeAPen(int a) {
        if (a == 10)
        {
            return "Here is a pen.";
        }
        if (a > 10)
        {
            return "Here are " + (a-10) + "Rs. and a pen.";
        }
        else
        {
            return "Sorry, I don't have that many pens.";
        }
    }
}

public class Methods {

    public static void main(String[] args) {
        int num = (int)(Math.random() * 100) + 1;

        Computer obj = new Computer();
        obj.PlayMusic();
        
        String getPen = obj.GetMeAPen(num);
        System.out.println(getPen);
    }
    
}
