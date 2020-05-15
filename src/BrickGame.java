
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BrickGame extends JPanel implements KeyListener, ActionListener {

    boolean play = false;
    private int score = 0;

    private int totalBricks = 21;

    private int ballX = 120;
    private int ballY = 350;
    private int balldirX = -1;
    private int balldirY = -2;
    private int playerX = 300;

    Timer timer = new Timer(10, this);

    private BrickMapGenerator map;

    public BrickGame() {
        setBackground(Color.black);
        timer.start();
        map = new BrickMapGenerator(3, 7);

    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        map.draw((Graphics2D) g);

        g.setColor(Color.blue);
        g.fillRect(0, 0, 3, 590);
        g.fillRect(0, 0, 690, 3);
        g.fillRect(690, 0, 3, 590);

        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + score, 590, 30);

        g.setColor(Color.red);

        g.fillRect(playerX, 555, 100, 10);

        g.setColor(Color.green);
        g.fillOval(ballX, ballY, 20, 20);

        if (totalBricks <= 0) {
            play = false;
            balldirX = 0;
            balldirY = 0;

            g.setColor(Color.green);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("You won", 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to restart  ", 230, 350);
        }

        if (ballY > 570) {
            play = false;
            balldirX = 0;
            balldirY = 0;

            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over Score : " + score, 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to restart  ", 230, 350);

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();

        if (c == KeyEvent.VK_LEFT) {

            if (playerX >= 580) {
                playerX = 570;
            } else {
                play = true;
                playerX -= 10;
            }

        }
        if (c == KeyEvent.VK_RIGHT) {

            if (playerX < 10) {
                playerX = 10;
            } else {
                play = true;
                playerX += 10;
            }

        }

        if (c == KeyEvent.VK_ENTER) {
            if (!play) {
                ballX = 120;
                ballY = 350;
                balldirX = -1;
                balldirY = -2;

                playerX = 310;
                score = 0;

                totalBricks = 21;
                map = new BrickMapGenerator(3, 7);
                repaint();

            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();

        if (play) {

            if (new Rectangle(ballX, ballY, 20, 20).intersects(new Rectangle(playerX, 555, 100, 10))) {
                balldirY = -balldirY;
            }
            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {

                    if (map.map[i][j] > 0) {
                        int brickX = j * map.brickWidth + 80;
                        int brickY = i * map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballX, ballY, 20, 20);

                        Rectangle brickRect = rect;

                        if (ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;

                            if (ballX + 19 <= brickRect.x || ballX + 1 <= brickRect.x + brickRect.height) {
                                balldirX = -balldirX;
                            } else {
                                balldirY = -balldirY;
                            }

                            break A;
                        }

                    }
                }
            }

            ballX += balldirX;
            ballY += balldirY;

            if (ballX < 0) {
                balldirX = -balldirX;
            }
            if (ballY < 0) {
                balldirY = -balldirY;
            }

            if (ballX > 670) {
                balldirX = -balldirX;
            }

        }

        repaint();

    }

}
