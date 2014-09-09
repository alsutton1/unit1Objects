import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        
        
        turtle1.setPenColor(Color.BLACK);
        turtle1.setPenWidth(10);
        turtle1.penUp();
        turtle1.forward(50);
        
        turtle2.setPenColor(Color.BLACK);
        turtle2.setPenWidth(10);
        turtle2.penUp();
        turtle2.backward(50);
        
        turtle3.setPenColor(Color.BLACK);
        turtle3.setPenWidth(5);
        turtle3.penUp();
        turtle3.forward(50);

        
        //turtle2 actions//
        turtle2.turn(90);
        turtle2.penDown();
        turtle2.forward(50);
        turtle2.turn(90);
        turtle2.forward(40);
        turtle2.turn(90);
        turtle2.forward(100);
        turtle2.turn(90);
        turtle2.forward(40);
        turtle2.turn(90);
        turtle2.forward(50);
        
        turtle2.penUp();
        turtle2.turn(90);
        turtle2.forward(20);
        turtle2.setPenColor(Color.GREEN);
        turtle2.turn(90);
        turtle2.penDown();
        turtle2.forward(10);
        turtle2.turn(90);
        turtle2.forward(10);
        turtle2.turn(90);
        turtle2.forward(20);
        turtle2.turn(90);
        turtle2.forward(10);
        turtle2.turn(90);
        turtle2.forward(20);
        turtle2.hide();
        
        //turtle1 actions//
        turtle1.turn(90);
        turtle1.forward(100);
        turtle1.turn(-90);
        turtle1.forward(50);
        turtle1.turn(90);
        turtle1.penDown();
        
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(10);
        turtle1.turn(15);
        turtle1.forward(5);
        
        turtle1.turn(180);
        turtle1.penUp();
        turtle1.forward(200);
        turtle1.penDown();
        
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(10);
        turtle1.turn(-15);
        turtle1.forward(5);
        
        turtle1.penUp();
        turtle1.turn(-90);
        turtle1.forward(55);
        turtle1.setPenColor(Color.BLUE);
        
        turtle1.penDown();
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        
        turtle1.turn(-90);
        turtle1.penUp();
        turtle1.forward(206);
        
        turtle1.turn(-90);
        
        turtle1.penDown();
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        turtle1.turn(-30);
        turtle1.forward(5);
        
        turtle1.hide();
        
        //turtle3 nose drawing
        turtle3.penDown();
        turtle3.turn(150);
        turtle3.forward(80);
        turtle3.turn(120);
        turtle3.forward(80);
        turtle3.turn(120);
        turtle3.forward(80);
        turtle3.hide();

    }
}
