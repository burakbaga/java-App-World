
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

//KeyListener Interface : for keyboard input
//ActionListener Interface : for object to move (ActionPerform) 
/**
 *
 * @author bagat
 */
class Fire {

    private int x;
    private int y;

    public Fire(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class SpaceGame extends JPanel implements KeyListener, ActionListener {

    private int timeCount = 0;
    private int fireCount = 0;
    private BufferedImage image;

    Timer timer = new Timer(5, this);

    private ArrayList<Fire> fires = new ArrayList<Fire>();

    private int firedirY = 1;
    private int ballx = 0;
    private int balldirX = 2;

    private int spaceShipX = 0;
    private int dirSpaceX = 20;

    public boolean control() {

        for (Fire fire : fires) {

            if (new Rectangle(fire.getX(), fire.getY(), 10, 20).intersects(new Rectangle(ballx, 0, 20, 20))) {
                return true;
            }

        }
        return false;

    }

    public SpaceGame() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(SpaceGame.class.getName()).log(Level.SEVERE, null, ex);
        }

        setBackground(Color.black);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        timeCount += 5;

        g.setColor(Color.red);

        g.fillOval(ballx, 0, 20, 20);
        g.drawImage(image, spaceShipX, 490, image.getWidth() / 10, image.getHeight() / 10, this);

        for (Fire fire : fires) {
            if (fire.getY() < 0) {
                fires.remove(fire);

            }

        }

        g.setColor(Color.blue);

        for (Fire fire : fires) {
            g.fillRect(fire.getX(), fire.getY(), 10, 20);
        }
        if (control()) {
            timer.stop();

            String message = "WINNER ...\n"
                    + "Fire Count : "
                    + fireCount + "\nTime : " + timeCount / 1000 + " second";

            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
    }

    @Override
    public void repaint() {
        super.repaint(); //repaint call paint again
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int c = e.getKeyCode();

        if (c == KeyEvent.VK_LEFT) {
            if (spaceShipX <= 0) {
                spaceShipX = 0;
            } else {
                spaceShipX -= dirSpaceX;

            }

        } else if (c == KeyEvent.VK_RIGHT) {
            if (spaceShipX >= 750) {
                spaceShipX = 750;
            } else {
                spaceShipX += dirSpaceX;
            }

        } else if (c == KeyEvent.VK_CONTROL) { // when press ctrl --  fire 

            fires.add(new Fire(spaceShipX + 15, 480));

            fireCount++;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (Fire fire : fires) {
            fire.setY(fire.getY() - firedirY);
        }

        ballx += balldirX;

        if (ballx >= 750) {
            balldirX = -balldirX;

        }
        if (ballx <= 0) {
            balldirX = -balldirX;
        }

        repaint();
    }

}
