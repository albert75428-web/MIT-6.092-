import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
    ArrayList<Mover> movers;
    public DrawGraphics() {
        movers = new ArrayList<>();
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Oval box2 = new Oval(15, 20);
        Mover movingSprite;
        movingSprite = new Bouncer(100, 170, box);
        movers.add(movingSprite);
        movers.get(0).setMovementVector(3,1);
        movingSprite = new Bouncer(50, 120, box2);
        movers.add(movingSprite);
        movers.get(1).setMovementVector(3, 1);
        movingSprite=new StraightMover(50,100,box);
        movers.add(movingSprite);
        movingSprite=new StraightMover(100,100,box2);
        movers.add(movingSprite);
        movers.get(2).setMovementVector(-1, 1);
        movers.get(3).setMovementVector(-1, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover bouncer : movers) {
            bouncer.draw(surface);
        }
    }
}
