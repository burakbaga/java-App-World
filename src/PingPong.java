
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
class PingPongPanel extends JPanel implements ActionListener, KeyListener {

    private int player1x = 10;
    private int player1y = 300;

    private int player2x = 780;
    private int player2y = 300;

    private int ballX = 300;
    private int ballY = 300;

    private int balldirX = 3;
    private int balldirY = 1;

    private int moveVel = 20;

    Timer timer = new Timer(15, this);

    public PingPongPanel() {

        timer.start();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.fillRect(player1x, player1y, 8, 100);

        g.setColor(Color.blue);
        g.fillRect(player2x, player2y, 8, 100);

        g.setColor(Color.black);
        g.fillOval(ballX, ballY, 20, 20);

        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 10);

        g.setColor(Color.black);
        g.fillRect(0, 555, 800, 10);

        repaint();
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ballX += -balldirX;
        ballY += -balldirY;

        Rectangle Player1rect = new Rectangle(player1x, player1y, 8, 100);
        Rectangle Player2rect = new Rectangle(player2x, player2y, 8, 100);

        Rectangle ballRect = new Rectangle(ballX, ballY, 20, 20);

        Rectangle brickRect1 = Player1rect;
        Rectangle brickRect2 = Player2rect;

        Rectangle wall1 = new Rectangle(0, 0, 800, 10);

        Rectangle wall2 = new Rectangle(0, 555, 800, 10);

        if (ballRect.intersects(brickRect1) || ballRect.intersects(wall1) || ballRect.intersects(wall2) || ballRect.intersects(brickRect2)) {

            if (ballX + 19 <= brickRect1.x || ballX + 1 <= brickRect1.x + brickRect1.height) {
                balldirX = -balldirX;
            } else {
                balldirY = -balldirY;
            }

            if (ballX + 19 >= brickRect2.x || ballX + 1 >= brickRect2.x + brickRect2.height) {
                balldirX = -balldirX;
            } else {
                balldirY = -balldirY;
            }

        }

        if (player1y <= 0) {
            player1y = 0;
        } else if (player1y >= 475) {

            player1y = 475;
        }
        if (player2y <= 0) {
            player2y = 0;
        } else if (player2y >= 475) {
            player2y = 475;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
        int c = e.getKeyCode();

        if (c == KeyEvent.VK_DOWN) {
            player2y += moveVel;
        } else if (c == KeyEvent.VK_UP) {
            player2y -= moveVel;
        }

        if (c == KeyEvent.VK_W) {
            player1y -= moveVel;
        } else if (c == KeyEvent.VK_S) {
            player1y += moveVel;
        }

    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
    }

}

public class PingPong extends JFrame {

    public PingPong() {

        super();

    }

}
