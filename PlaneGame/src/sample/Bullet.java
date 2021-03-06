package sample;
import java.awt.*;

public class Bullet {
    private int x,y;
    private int speed;

    public Bullet(int x, int y){
        this.x = x;
        this.y = y;
        speed = 10;
    }
    public void tick(){
        y -= speed;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void render(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x,y,5,6);
    }
}
