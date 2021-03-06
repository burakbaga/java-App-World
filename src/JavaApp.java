
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class JavaApp extends javax.swing.JFrame {

    /**
     * Creates new form JavaApp
     */
    public JavaApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notepadButton = new javax.swing.JButton();
        brickGameButton = new javax.swing.JButton();
        calculatorButton = new javax.swing.JButton();
        wordCountButton = new javax.swing.JButton();
        pingPong = new javax.swing.JButton();
        ticTacToeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        notepadButton.setText("NOTEPAD");
        notepadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notepadButtonActionPerformed(evt);
            }
        });

        brickGameButton.setText("BRICK GAME");
        brickGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brickGameButtonActionPerformed(evt);
            }
        });

        calculatorButton.setText("CALCULATOR");
        calculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonActionPerformed(evt);
            }
        });

        wordCountButton.setText("SPACE GAME");
        wordCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordCountButtonActionPerformed(evt);
            }
        });

        pingPong.setText("PING PONG GAME");
        pingPong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pingPongActionPerformed(evt);
            }
        });

        ticTacToeButton.setText("TAC TAC TOE GAME");
        ticTacToeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTacToeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Java Application World");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ticTacToeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pingPong, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wordCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notepadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brickGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notepadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brickGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticTacToeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wordCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pingPong, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notepadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notepadButtonActionPerformed

        Notepad notepad = new Notepad();
        setVisible(false);
        notepad.setVisible(true);


    }//GEN-LAST:event_notepadButtonActionPerformed

    private void calculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorButtonActionPerformed
        Calculator calculator = new Calculator();

        calculator.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_calculatorButtonActionPerformed

    private void brickGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brickGameButtonActionPerformed
       
             BrickGameScreen ekran = new BrickGameScreen("Sp ace Game");

        ekran.setResizable(false);// not resizable
        ekran.setFocusable(false); // focus jpanel
        ekran.setSize(700, 600);// screen size
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BrickGame oyun = new BrickGame();
        oyun.requestFocus(); // focus keyboad

        oyun.addKeyListener(oyun); // klavyeden işlemleri al

        oyun.setFocusable(true); // odak jpanele veril

        oyun.setFocusTraversalKeysEnabled(false); // for keyboard 

        ekran.add(oyun); //add jpanel to jframe

        ekran.setVisible(true);// when jpanel add to jframe show jframe
        
        
    }//GEN-LAST:event_brickGameButtonActionPerformed

    private void ticTacToeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTacToeButtonActionPerformed

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new TicTacToeGUI();
            }
        });
        setVisible(false);

    }//GEN-LAST:event_ticTacToeButtonActionPerformed

    private void pingPongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pingPongActionPerformed

        PingPong pingPongFrame = new PingPong();

        //setVisible(false);
        pingPongFrame.setResizable(false);// not resizable
        pingPongFrame.setFocusable(false); // focus jpanel
        pingPongFrame.setSize(800, 600);// screen size
        pingPongFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PingPongPanel pingPong = new PingPongPanel();

        pingPong.requestFocus(); // focus keyboad

        pingPong.addKeyListener(pingPong); // klavyeden işlemleri al

        pingPong.setFocusable(true); // odak jpanele veril

        pingPong.setFocusTraversalKeysEnabled(false); // for keyboard 

        pingPongFrame.add(pingPong); //add jpanel to jframe

        pingPongFrame.setVisible(true);// when jpanel add to jframe show jframe


    }//GEN-LAST:event_pingPongActionPerformed

    private void wordCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordCountButtonActionPerformed

        SpaceGameScreen ekran = new SpaceGameScreen("Space Game");

        ekran.setResizable(false);// not resizable
        ekran.setFocusable(false); // focus jpanel
        ekran.setSize(800, 600);// screen size
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpaceGame oyun = new SpaceGame();
        oyun.requestFocus(); // focus keyboad

        oyun.addKeyListener(oyun); // klavyeden işlemleri al

        oyun.setFocusable(true); // odak jpanele veril

        oyun.setFocusTraversalKeysEnabled(false); // for keyboard 

        ekran.add(oyun); //add jpanel to jframe

        ekran.setVisible(true);// when jpanel add to jframe show jframe


    }//GEN-LAST:event_wordCountButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brickGameButton;
    private javax.swing.JButton calculatorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton notepadButton;
    private javax.swing.JButton pingPong;
    private javax.swing.JButton ticTacToeButton;
    private javax.swing.JButton wordCountButton;
    // End of variables declaration//GEN-END:variables
}
