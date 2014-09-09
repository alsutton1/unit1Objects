
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Leek_spin
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://img2.wikia.nocookie.net/__cb20140629005934/danganmafia/images/3/37/Leek_spin_gif_in_hd_by_life_scape-d5hshqr.gif");
            String leek = "Leek Spin"; 
        JOptionPane.showMessageDialog(null, leek, "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }
    