import java.awt.*;

public class Wall extends Figure  {
    public Wall(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        DrawUtils.drawWall(graphics2D, x, y, width, height, color);
    }
}
