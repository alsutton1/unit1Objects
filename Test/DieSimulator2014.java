import java.util.Random;

public class DieSimulator2014
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int num = generator.nextInt(6)+1;
        System.out.println(num);
    }
}