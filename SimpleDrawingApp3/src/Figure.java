import java.awt.*;

public class Figure {
    public int x,y,width,height;
    public Color color;

    public Figure (final int x, final int y, final int width, final int height, final Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics2D graphics2D){
        DrawUtils.drawPlane(graphics2D,x,y,width,height,color);
    }

}
