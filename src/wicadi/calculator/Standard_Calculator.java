
package wicadi.calculator;

import java.awt.Image;
import java.awt.Toolkit;
import wicadi.calculator.Scientific_Calculator;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class Standard_Calculator extends javax.swing.JFrame {

     ArrayList<String> currentEq;
	private ScriptEngine solver;
	private int size;
        

    public Standard_Calculator() {
        initComponents();
        setIcon();
    }
    
    public void Calculator()
            {
                ScriptEngineManager mgr = new ScriptEngineManager();
		solver = mgr.getEngineByName("JavaScript");
		currentEq = new ArrayList<>();
		size = 0;
            }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAnswer = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnNegative = new javax.swing.JButton();
        btnCloseParen = new javax.swing.JButton();
        btnOpenParen = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Standard_Menu_Item = new javax.swing.JMenuItem();
        Scientific_Menu_Item = new javax.swing.JMenuItem();
        GraphMenuItem = new javax.swing.JMenuItem();
        ProgrammerMenuItem = new javax.swing.JMenuItem();
        DataMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WiCaDi - Standard ");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAnswer.setEditable(false);
        txtAnswer.setBackground(new java.awt.Color(255, 255, 255));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAnswer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnswerKeyTyped(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 50));

        btn7.setBackground(new java.awt.Color(0, 153, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setFocusPainted(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 50));

        btn9.setBackground(new java.awt.Color(0, 153, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setFocusPainted(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 50));

        btn8.setBackground(new java.awt.Color(0, 153, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setFocusPainted(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 50));

        btnDivide.setBackground(new java.awt.Color(51, 0, 255));
        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setText("/");
        btnDivide.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDivide.setFocusPainted(false);
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 50));

        btnMultiply.setBackground(new java.awt.Color(51, 0, 255));
        btnMultiply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMultiply.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiply.setText("*");
        btnMultiply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMultiply.setFocusPainted(false);
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 60, 50));

        btn6.setBackground(new java.awt.Color(0, 153, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setFocusPainted(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 60, 50));

        btn5.setBackground(new java.awt.Color(0, 153, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setFocusPainted(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 60, 50));

        btn4.setBackground(new java.awt.Color(0, 153, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setFocusPainted(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 60, 50));

        btnMinus.setBackground(new java.awt.Color(51, 0, 255));
        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnMinus.setText("-");
        btnMinus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMinus.setFocusPainted(false);
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 60, 50));

        btn3.setBackground(new java.awt.Color(0, 153, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setToolTipText("");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setFocusPainted(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 60, 50));

        btn2.setBackground(new java.awt.Color(0, 153, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setFocusPainted(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 60, 50));

        btn1.setBackground(new java.awt.Color(0, 153, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setFocusPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, 50));

        btnAdd.setBackground(new java.awt.Color(51, 0, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 60, 50));

        btnEqual.setBackground(new java.awt.Color(51, 0, 255));
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(255, 255, 255));
        btnEqual.setText("=");
        btnEqual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEqual.setFocusPainted(false);
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(btnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 60, 50));

        btnDecimal.setBackground(new java.awt.Color(51, 0, 255));
        btnDecimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimal.setText(".");
        btnDecimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDecimal.setFocusPainted(false);
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 50));

        btn0.setBackground(new java.awt.Color(0, 153, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.setFocusPainted(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 60, 50));

        btnPercentage.setBackground(new java.awt.Color(51, 0, 255));
        btnPercentage.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnPercentage.setForeground(new java.awt.Color(255, 255, 255));
        btnPercentage.setText("%");
        btnPercentage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPercentage.setFocusPainted(false);
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        getContentPane().add(btnPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 50));

        btnClear.setBackground(new java.awt.Color(51, 0, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.setFocusPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 60, 50));

        btnBackSpace.setBackground(new java.awt.Color(51, 0, 255));
        btnBackSpace.setFont(new java.awt.Font("Wingdings", 1, 20)); // NOI18N
        btnBackSpace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSpace.setText("");
        btnBackSpace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSpace.setFocusPainted(false);
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 50));

        btnNegative.setBackground(new java.awt.Color(51, 0, 255));
        btnNegative.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNegative.setForeground(new java.awt.Color(255, 255, 255));
        btnNegative.setText("±");
        btnNegative.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNegative.setFocusPainted(false);
        btnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativeActionPerformed(evt);
            }
        });
        getContentPane().add(btnNegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 60, 50));

        btnCloseParen.setBackground(new java.awt.Color(51, 0, 255));
        btnCloseParen.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCloseParen.setForeground(new java.awt.Color(255, 255, 255));
        btnCloseParen.setText(")");
        btnCloseParen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCloseParen.setFocusPainted(false);
        btnCloseParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseParenActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloseParen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 60, 50));

        btnOpenParen.setBackground(new java.awt.Color(51, 0, 255));
        btnOpenParen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOpenParen.setForeground(new java.awt.Color(255, 255, 255));
        btnOpenParen.setText("(");
        btnOpenParen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOpenParen.setFocusPainted(false);
        btnOpenParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenParenActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpenParen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 60, 50));

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        txtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDisplayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisplayKeyTyped(evt);
            }
        });
        getContentPane().add(txtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Standard_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Standard_Menu_Item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/standard icon.png"))); // NOI18N
        Standard_Menu_Item.setText("Standard");
        Standard_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Standard_Menu_ItemActionPerformed(evt);
            }
        });
        Menu.add(Standard_Menu_Item);

        Scientific_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        Scientific_Menu_Item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scientific_icon.jpg"))); // NOI18N
        Scientific_Menu_Item.setText("Scientific");
        Scientific_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scientific_Menu_ItemActionPerformed(evt);
            }
        });
        Menu.add(Scientific_Menu_Item);

        GraphMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        GraphMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gr icon.jpg"))); // NOI18N
        GraphMenuItem.setText("Graph");
        GraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphMenuItemActionPerformed(evt);
            }
        });
        Menu.add(GraphMenuItem);

        ProgrammerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        ProgrammerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/binary.png"))); // NOI18N
        ProgrammerMenuItem.setText("Programmer");
        ProgrammerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgrammerMenuItemActionPerformed(evt);
            }
        });
        Menu.add(ProgrammerMenuItem);

        DataMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        DataMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convert_icon.png"))); // NOI18N
        DataMenuItem.setText("Data");
        DataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataMenuItemActionPerformed(evt);
            }
        });
        Menu.add(DataMenuItem);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Standard_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Standard_Menu_ItemActionPerformed
        Standard_Calculator st = new Standard_Calculator();
        st.setVisible(true);
        st.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Standard_Menu_ItemActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn1.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        this.setSize(295, 545);
        //this.setIconImage(createImage("Calculator-icon.png").getImage());
    }//GEN-LAST:event_formWindowActivated

    private void Scientific_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scientific_Menu_ItemActionPerformed
        Scientific_Calculator sc = new Scientific_Calculator();
        sc.setVisible(true);
        sc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Scientific_Menu_ItemActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        double p = Double.parseDouble(String.valueOf(value))/100;
        txtDisplay.setText(txtDisplay.getText()+"%");
        txtAnswer.setText(String.valueOf(p));
        }
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        
    }//GEN-LAST:event_MenuActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn7.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn8.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn4.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn5.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn6.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn3.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 13;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btn0.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
        
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtDisplay.setText("");
        txtAnswer.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSpaceActionPerformed
        String bkspace = null;
        
        if(txtDisplay.getText().length()>0)
        {
            StringBuilder stb = new StringBuilder(txtDisplay.getText());
            stb.deleteCharAt(txtDisplay.getText().length()-1);
            bkspace = stb.toString();
            txtDisplay.setText(bkspace);
        }
    }//GEN-LAST:event_btnBackSpaceActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        if(txtDisplay.getText().equals(""))
        {
            
        }
        else 
        {
            txtDisplay.setText(txtDisplay.getText()+btnDecimal.getText());
        }
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativeActionPerformed
        if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("Error");
        }
        else{
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = value*(-1);
        txtDisplay.setText(String.valueOf(value));
            }
    }//GEN-LAST:event_btnNegativeActionPerformed

    private void txtAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyTyped
         char c = evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
         {
             getToolkit().beep();
         evt.consume();
         }
    }//GEN-LAST:event_txtAnswerKeyTyped

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("Error");
        }
        else{
        WiCaDiCalculator cal = new WiCaDiCalculator();
        cal.solveEquation(txtDisplay.getText());
        txtAnswer.setText(cal.Result());
        
        
        
        }
        
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       try{
        if(txtDisplay.getText().charAt(txtDisplay.getText().length()-1)!='+'){
           txtDisplay.setText(txtDisplay.getText()+"+");
        }
        
        currentEq.add("+");
		size++;
                
       }catch(Exception ex){
          
       }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        try{
        if(txtDisplay.getText().charAt(txtDisplay.getText().length()-1)!='-'){
           txtDisplay.setText(txtDisplay.getText()+"-");
        }
        currentEq.add("-");
		size++;
       }catch(Exception ex){
       }
       
       
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        try{
        if(txtDisplay.getText().charAt(txtDisplay.getText().length()-1)!='*'){
           txtDisplay.setText(txtDisplay.getText()+"*");
        }
        currentEq.add("*");
		size++;
       }catch(Exception ex){
       }
       
       
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        try{
        if(txtDisplay.getText().charAt(txtDisplay.getText().length()-1)!='/'){
           txtDisplay.setText(txtDisplay.getText()+"/");
        }
        currentEq.add("/");
		size++;
       }catch(Exception ex){
       }
       
       
    }//GEN-LAST:event_btnDivideActionPerformed

    private void GraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphMenuItemActionPerformed
        Graph_Calculator gc = new Graph_Calculator();
        gc.setVisible(true);
        gc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_GraphMenuItemActionPerformed

    private void ProgrammerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgrammerMenuItemActionPerformed
        Programmer_Calculator pc = new Programmer_Calculator();
        pc.setVisible(true);
        pc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ProgrammerMenuItemActionPerformed

    private void txtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayKeyTyped

    private void DataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataMenuItemActionPerformed
        Data_Calculator dc = new Data_Calculator();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DataMenuItemActionPerformed

    private void btnCloseParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseParenActionPerformed
        String number = txtDisplay.getText() + btnCloseParen.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnCloseParenActionPerformed

    private void btnOpenParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenParenActionPerformed
        String number = txtDisplay.getText() + btnOpenParen.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnOpenParenActionPerformed

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerActionPerformed

    private void txtDisplayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyPressed
       
    }//GEN-LAST:event_txtDisplayKeyPressed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 15;
        

            if(length<=max_length)
            {
                txtDisplay.setEditable(true);
            }
            else
            {
                txtDisplay.setEditable(false);
            }
        
    }//GEN-LAST:event_txtDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Standard_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataMenuItem;
    private javax.swing.JMenuItem GraphMenuItem;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem ProgrammerMenuItem;
    private javax.swing.JMenuItem Scientific_Menu_Item;
    private javax.swing.JMenuItem Standard_Menu_Item;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCloseParen;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNegative;
    private javax.swing.JButton btnOpenParen;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables

    private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png" )));
    }
}
