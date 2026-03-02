import java.awt.*;

public class Oval implements Sprite{
    private int width;
    private int height;

    public Oval(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics surface, int leftX, int topY) {

        surface.drawOval(leftX, topY, this.width, this.height);
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
