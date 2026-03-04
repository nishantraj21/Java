class Computer {

    public void PlayMusic() {
        System.out.println("Playing music...");
    }
    public String GetMeAPen(int a) {
        if (a >= 10)
        {
            return "Here is a pen.";
        }
        return "Sorry, you don't have enough points for a pen.";
    }
}

public class Methods {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.PlayMusic();
        String getPen = obj.GetMeAPen(2);
        System.out.println(getPen);
    }
    
}
