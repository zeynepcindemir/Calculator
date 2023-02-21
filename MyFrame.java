import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    //MyPanel panel;
    PanelTry p;
    public MyFrame(){
        //panel = new MyPanel();
        p = new PanelTry();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this.add(panel);
        this.add(p);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
