import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Logo extends JPanel {
    private int sunX = -60;
    private int sunY = 170;
    private int count;
    Color custom = new Color(0, 150,255);

    @Override
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        g.setColor(custom);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(new Color(0, 255, 40));
        g.fillRect(0, 300, this.getWidth(), this.getHeight());
        g.setColor(new Color(50, 200, 20));

        paintHouse(g, 90, 270);
        paintTop(g, 90, 270);
        paintHouse(g, 30, 300);
        paintTop(g, 30, 300);
        paintHouse(g, 150, 300);
        paintTop(g, 150, 300);

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        g.setFont(font);
        g.drawString("AccountPros", 360, 250);

        paintHouse(g, 710, 270);
        paintTop(g, 710, 270);
        paintHouse(g, 650, 300);  //start 600, 300
        paintTop(g, 650, 300);
        paintHouse(g, 770, 300);
        paintTop(g, 770, 300);
        paintSun(g, sunX, sunY);
        //CubicCurve2D r = new CubicCurve2D.Double(150, 300, 100, 360, 190, 430, 150, 500);
        //g.draw(r);
        //r = new CubicCurve2D.Double(250, 300, 200, 360, 280, 380, 250, 500);
        //g.draw(r);
        paintRiver(g);
        updateSun();
    }
    private void paintHouse(Graphics2D g, int x, int h){
        GeneralPath path = new GeneralPath();
        g.setColor(new Color(0x686868));
        path.moveTo(x, h);
        path.lineTo(x + 75,h - 150);
        path.lineTo(x + 150, h );
        path.lineTo(x, h);
        g.fill(path);
    }
    private void paintTop(Graphics2D g,int x,int h){
        GeneralPath path = new GeneralPath();
        g.setColor(new Color(255,255,255));
        path.moveTo(x + 45, h - 90);
        path.lineTo(x + 57, h - 100);
        path.lineTo(x + 68, h - 90);
        path.lineTo(x + 79, h - 100);
        path.lineTo(x + 90, h - 90);
        path.lineTo(x + 100, h - 100);
        path.lineTo(x + 75, h - 150);
        path.lineTo(x + 45, h - 90);
        g.fill(path);
    }

    private void paintSun(Graphics2D g, int x, int h){
        g.setColor(Color.YELLOW);
        g.fillOval(x, h, 40, 40);
    }
    private void paintRiver(Graphics2D g){
        GeneralPath path = new GeneralPath();
        g.setColor(new Color(0, 80, 255));
        path.moveTo(150, 300);
        path.curveTo(190, 370, 80, 400, 180, 500);
        path.lineTo(260, 500);
        path.moveTo(150, 300);
        path.lineTo(230, 300);
        path.curveTo(270, 370, 170, 400, 260, 500);
        g.fill(path);
    }

    public void updateSun(){

        if(count != 600){
            count++;
            sunX = sunX + 2;
            sunY = sunY - 1;
            if (count > 275){
                sunY = sunY + 2;
                if(count > 520){
                    custom = new Color(0, 0, 150);
                }
            }
        } else{
            count = 0;
            sunX = -60;
            sunY = 170;
            custom = new Color(0, 150, 255);
        }
    }
}
