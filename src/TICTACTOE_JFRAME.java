
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author New
 */
public class TICTACTOE_JFRAME extends javax.swing.JFrame {

    /**
     * Creates new form TICTACTOE_JFRAME
     */
    private String turn;
    private int totalCount;
    private int xCount;
    private int oCount;
    public TICTACTOE_JFRAME() {
        initComponents();
        if(JOptionPane.showConfirmDialog(this, "Confirm If You Want To Start the turn by X ?","Turn",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)  
{
   turn = "X";
}
        else{
            turn ="O";
        }
     // turn="O";
      totalCount=0;
    }
    private void changePlayer(){
        if(turn.equals("X"))
        {
            turn="O";
        }
        else
        {
            turn="X";
        }
    }
    private void resetGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(white);
        btn2.setBackground(white);
         btn3.setBackground(white);
          btn4.setBackground(white);
          btn5.setBackground(white);
            btn6.setBackground(white);
              btn7.setBackground(white);
                btn8.setBackground(white);
                  btn9.setBackground(white);
        totalCount =0;
        
    }
    private void gameScore(){
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }
    private void checkWinner(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        if(b1.equals(b2) && b2.equals(b3) && !b1.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(green);
              btn2.setBackground(green);
                btn3.setBackground(green);
                
        }
        else if(b4.equals(b5) && b5.equals(b6) && !b4.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(green);
              btn5.setBackground(green);
                btn6.setBackground(green);
               
        }
         else if(b7.equals(b8) && b7.equals(b9) && !b7.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(green);
              btn8.setBackground(green);
                btn9.setBackground(green);
                    
        }
         else if(b1.equals(b4) && b4.equals(b7) && !b1.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(green);
              btn4.setBackground(green);
                btn3.setBackground(green);
                     
        }
         else if(b2.equals(b5) && b2.equals(b8) && !b2.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(green);
              btn5.setBackground(green);
                btn8.setBackground(green);
                   
        }
        else if(b3.equals(b6) && b6.equals(b9) && !b3.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(green);
              btn6.setBackground(green);
                btn9.setBackground(green);
                   
        }
        else if(b1.equals(b5) && b5.equals(b9) && !b1.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(green);
              btn5.setBackground(green);
                btn9.setBackground(green);
                    
        }
         else if(b3.equals(b5) && b5.equals(b7) && !b3.equals(""))
        {
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            JOptionPane.showMessageDialog(this,"Player "+turn+" Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(green);
              btn5.setBackground(green);
                btn7.setBackground(green);
                  
        }
         else if(totalCount==9)
         {
             JOptionPane.showMessageDialog(this,"There is A DRAW","Winner",JOptionPane.INFORMATION_MESSAGE);
             resetGame();
         }
        gameScore();
    }
private void btnTriggered(JButton btn)
{
    String btnText = btn.getText();
    
   // if(!btn.getText().equals(""))
   if(!btnText.equals(""))
    {
        return;
    }
     btn.setText(turn);
        if(turn.equals("X"))
        {
            btn.setForeground(red);
            btn.setBackground(black);
        }
        else
        {
             btn.setForeground(magenta);
                btn.setBackground(white);
        }
        totalCount++;
         checkWinner();
        changePlayer();
       
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(750, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btn2.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn2.setPreferredSize(new java.awt.Dimension(100, 80));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn3.setPreferredSize(new java.awt.Dimension(100, 80));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn1.setPreferredSize(new java.awt.Dimension(100, 80));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn4.setPreferredSize(new java.awt.Dimension(100, 80));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn5.setPreferredSize(new java.awt.Dimension(100, 80));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn6.setPreferredSize(new java.awt.Dimension(100, 80));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn7.setPreferredSize(new java.awt.Dimension(100, 80));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn8.setPreferredSize(new java.awt.Dimension(100, 80));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(100, 80));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        btn9.setPreferredSize(new java.awt.Dimension(100, 80));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(102, 255, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setPreferredSize(new java.awt.Dimension(100, 80));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Score Board");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel3.setText("PLAYER O");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setText("PLAYER X");

        oScore.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        oScore.setText(" O");

        xScore.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        xScore.setText(" X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        jLabel5.setText("Created By Harshit Chhabda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
if(JOptionPane.showConfirmDialog(this, "Confirm If You Want To Exit ?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)  
{
    System.exit(0);
}// TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
resetGame();        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       btnTriggered(btn4);   // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       btnTriggered(btn8);  // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
      btnTriggered(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    btnTriggered(btn2);  // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         btnTriggered(btn3);  // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btnTriggered(btn5); // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
     btnTriggered(btn6);   // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
      btnTriggered(btn7);  // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
     btnTriggered(btn9);   // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(TICTACTOE_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE_JFRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oScore;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables
}
