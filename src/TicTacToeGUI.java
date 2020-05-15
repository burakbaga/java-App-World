
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class TicTacToeGUI extends JFrame {

    private Container pane;
    private String currentPlayer;
    private boolean hasWinner;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;
    private JMenuItem back;

    JButton[][] board = new JButton[3][3];

    public TicTacToeGUI() {
        super();
        pane = getContentPane();
        pane.setLayout(new GridLayout(3, 3));

        setTitle("Tic Tac Toe");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);

        currentPlayer = "x";

        hasWinner = false;
        initializeMenuBar();
        initializeBoard();

    }

    public void initializeMenuBar() {

        menuBar = new JMenuBar();
        menu = new JMenu("File");
        newGame = new JMenuItem("New Game");

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBoard();
            }
        });

        quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        back = new JMenuItem("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                JavaApp javaapp = new JavaApp();
                javaapp.setVisible(true);
            }
        });

        menu.add(newGame);
        menu.add(back);

        menu.add(quit);

        menuBar.add(menu);
        setJMenuBar(menuBar);

    }

    private void resetBoard() {

        currentPlayer = "x";
        hasWinner = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j].setText("");

            }
        }

    }

    private void initializeBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                JButton btn = new JButton();
                btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
                btn.setText("");
                board[i][j] = btn;

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) { //who click me 
                        if (((JButton) e.getSource()).getText().equals("") && hasWinner == false) {
                            btn.setText(currentPlayer);
                            hasWinner();
                            currentPlayer = togglePlayer();

                        }
                    }
                });
                pane.add(btn);

            }
        }

    }

    private String togglePlayer() {

        if (currentPlayer.equals("x")) {
            return "o";

        } else {

            return "x";
        }

    }

    private void hasWinner() {
        if (board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        } else if (board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        } else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        } else if (board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        } else if (board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        } else if (board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
    }

}
