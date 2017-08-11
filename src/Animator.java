import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Animator implements ActionListener{
    private Logo logo;

    public Animator(Logo logo) {

        this.logo = logo;
        Timer t = new Timer(11, this);
        t.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        logo.repaint();

    }
}
