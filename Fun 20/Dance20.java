import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dance20
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://i91.photobucket.com/albums/k307/garrettj40/gifs/stormtrooper.gif");
        JOptionPane.showMessageDialog(null, "Dance Dance Dance!", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }