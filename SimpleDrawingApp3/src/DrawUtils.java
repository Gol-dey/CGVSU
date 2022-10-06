import java.awt.*;

public class DrawUtils {
    public static void drawCar(Graphics2D g2, int x, int y, int width, int height, Color color){

    }

    public static void drawPlane(Graphics2D g, int x, int y, int width, int height, Color color){//x,y - start left wing
        g.drawLine(x,y,x*6/5+width,y*4+height);
    }

    public static void drawWall(Graphics2D g2, int x, int y, int width, int height, Color color) {

    }
}
