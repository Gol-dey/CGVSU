import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;

    private Figure figure;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.figure= new Figure(100, 100, 380, 150, Color.RED);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
       // figure.setX(ticksFromStart);
       // figure.setY();

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
    @Override
    public void paintComponent(Graphics gr){
        Graphics2D graphics2D = (Graphics2D) gr;
        Plane plane = new Plane(338,35,1,1,Color.black);
        Plane plane2 = new Plane(338,500,1,1,Color.black);
        plane.draw(graphics2D);
        plane2.draw(graphics2D);
    }
}