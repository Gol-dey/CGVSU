import java.awt.*;

public class Plane extends Figure {

    public Plane(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }
    public void draw(Graphics2D g2) {
        DrawUtils.drawPlane(g2,x, y, width, height,color);
    }
}
