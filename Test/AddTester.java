import java.awt.Rectangle;

public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5,10,20,30);
        Rectangle box2 = new Rectangle(5,10,20,30);
        box2.add(0,0);
        System.out.println(box);
        System.out.println(box2);
    }
}