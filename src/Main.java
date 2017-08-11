import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {


        JFrame panel = new JFrame("New JFrame");
        panel.setSize(1000, 500);
        panel.setLocationRelativeTo(null);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Logo L = new Logo();
        panel.add(L);

        Animator a = new Animator(L);

        panel.setVisible(true);
    }
}
