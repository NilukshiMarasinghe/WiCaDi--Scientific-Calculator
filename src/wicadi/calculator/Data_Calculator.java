
package wicadi.calculator;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import wicadi.calculator.Scientific_Calculator;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Data_Calculator extends javax.swing.JFrame {

    public Data_Calculator() {
        initComponents();
        setIcon();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        btnBackSpace = new javax.swing.JButton();
        comboSelect = new javax.swing.JComboBox<>();
        labelResult = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        lblUnit = new javax.swing.JLabel();
        txtField2 = new javax.swing.JTextField();
        txtField1 = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        btn0 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Standard_Menu_Item = new javax.swing.JMenuItem();
        Scientific_Menu_Item = new javax.swing.JMenuItem();
        GraphMenuItem = new javax.swing.JMenuItem();
        ProgrammerMenuItem = new javax.swing.JMenuItem();
        DataMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WiCaDi - Data Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn7.setBackground(new java.awt.Color(0, 153, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 50));

        btn8.setBackground(new java.awt.Color(0, 153, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 50));

        btn6.setBackground(new java.awt.Color(0, 153, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setFocusPainted(false);
        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, 50));

        btn5.setBackground(new java.awt.Color(0, 153, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 50));

        btn4.setBackground(new java.awt.Color(0, 153, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 50));

        btn3.setBackground(new java.awt.Color(0, 153, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setToolTipText("");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setFocusPainted(false);
        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, 50));

        btn2.setBackground(new java.awt.Color(0, 153, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setFocusPainted(false);
        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 50));

        btn1.setBackground(new java.awt.Color(0, 153, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 50));

        btnDecimal.setBackground(new java.awt.Color(0, 153, 255));
        btnDecimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimal.setText(".");
        btnDecimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDecimal.setFocusPainted(false);
        btnDecimal.setFocusable(false);
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, 50));

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
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, 50));

        Label2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 255, 255));
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        getContentPane().add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 50));

        btnBackSpace.setBackground(new java.awt.Color(51, 0, 255));
        btnBackSpace.setFont(new java.awt.Font("Wingdings", 1, 20)); // NOI18N
        btnBackSpace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSpace.setText("");
        btnBackSpace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSpace.setFocusPainted(false);
        btnBackSpace.setFocusable(false);
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 50));

        comboSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Distance", "Speed", "Time" }));
        comboSelect.setBorder(null);
        comboSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectActionPerformed(evt);
            }
        });
        getContentPane().add(comboSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 350, 40));

        labelResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelResult.setForeground(new java.awt.Color(255, 255, 255));
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        getContentPane().add(labelResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 150, 50));

        Label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        getContentPane().add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, 50));

        lblUnit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblUnit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 90, 50));

        txtField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        txtField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtField2FocusGained(evt);
            }
        });
        txtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, 40));

        txtField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        txtField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtField1FocusGained(evt);
            }
        });
        txtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField1ActionPerformed(evt);
            }
        });
        txtField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField1KeyPressed(evt);
            }
        });
        getContentPane().add(txtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, 40));

        btnReset.setBackground(new java.awt.Color(51, 51, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 120, 50));

        btnCalculate.setBackground(new java.awt.Color(51, 51, 255));
        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate.setFocusPainted(false);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 120, 50));

        label3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 110, 50));

        btn0.setBackground(new java.awt.Color(0, 153, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.setFocusPainted(false);
        btn0.setFocusable(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 50));

        btn9.setBackground(new java.awt.Color(0, 153, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setFocusPainted(false);
        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 50));

        lblA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblA.setForeground(new java.awt.Color(204, 204, 204));
        lblA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 160, 30));

        lblB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblB.setForeground(new java.awt.Color(204, 204, 204));
        lblB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
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
        jMenu1.add(Standard_Menu_Item);

        Scientific_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Scientific_Menu_Item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scientific_icon.jpg"))); // NOI18N
        Scientific_Menu_Item.setText("Scientific");
        Scientific_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scientific_Menu_ItemActionPerformed(evt);
            }
        });
        jMenu1.add(Scientific_Menu_Item);

        GraphMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        GraphMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gr icon.jpg"))); // NOI18N
        GraphMenuItem.setText("Graph");
        GraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(GraphMenuItem);

        ProgrammerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        ProgrammerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/binary.png"))); // NOI18N
        ProgrammerMenuItem.setText("Programmer");
        ProgrammerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgrammerMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ProgrammerMenuItem);

        DataMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        DataMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convert_icon.png"))); // NOI18N
        DataMenuItem.setText("Data");
        DataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(DataMenuItem);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

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
        
        writeValue(btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        
        this.setSize(605, 400);
    }//GEN-LAST:event_formWindowActivated

    private void Scientific_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scientific_Menu_ItemActionPerformed
        Scientific_Calculator sc = new Scientific_Calculator();
        sc.setVisible(true);
        sc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Scientific_Menu_ItemActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        writeValue(btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        writeValue(btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       
        writeValue(btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        writeValue(btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       
        writeValue(btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        writeValue(btn2.getText());
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       
        writeValue(btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        if(!txtField1.getText().contains(".") && txtField1.hasFocus()==true)
        {
            txtField1.setText(txtField1.getText()+".");
        }
        if(!txtField2.getText().contains(".") && txtField2.hasFocus()==true)
        {
            txtField2.setText(txtField2.getText()+".");
        }
        
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
          
        txtField1.setText("");
        txtField2.setText("");
        comboSelect.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSpaceActionPerformed

        try{
            
            String number="";

            if(txtField1.hasFocus()==true){
                number = txtField1.getText();
                number = number.substring(0,number.length()-1);
                txtField1.setText(number);
                txtField1.requestFocus();
            }
            else if(txtField2.hasFocus()==true){
                number = txtField2.getText();
                number = number.substring(0,number.length()-1);
                txtField2.setText(number);
                txtField2.requestFocus();
            }
            
        }catch(Exception ex){
        }
        
    }//GEN-LAST:event_btnBackSpaceActionPerformed

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

    private void comboSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectActionPerformed
        if(comboSelect.getSelectedItem().equals("Distance"))
        {
            lblA.setText("Speed (km/h)");
            lblB.setText("Time (h)");
            Label1.setText("");
            Label2.setText("");
            label3.setText("");
            labelResult.setText("");
            lblUnit.setText("");
            
        }
        
        else if(comboSelect.getSelectedItem().equals("Speed"))
        {
            lblA.setText("Distance (km)");
            lblB.setText("Time (h)");
            Label1.setText("");
            Label2.setText("");
            label3.setText("");
            labelResult.setText("");
            lblUnit.setText("");
            
        }
        
        else if(comboSelect.getSelectedItem().equals("Time"))
        {
            lblA.setText("Distance (km)");
            lblB.setText("Speed (km/h)");
            Label1.setText("");
            Label2.setText("");
            label3.setText("");
            labelResult.setText("");
            lblUnit.setText("");
            
        }
        
        txtField1.setText("");
        txtField1.requestFocus();
    }//GEN-LAST:event_comboSelectActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
    
        writeValue(btn9.getText());
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        writeValue(btn0.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void DataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataMenuItemActionPerformed
        Data_Calculator dc = new Data_Calculator();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DataMenuItemActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if((txtField1.getText()).equals("") || txtField2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Empty fields", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(comboSelect.getSelectedItem().equals("Select an Option"))
        {
            JOptionPane.showMessageDialog(null, "Select an Option", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(comboSelect.getSelectedItem().equals("Distance"))
        {
            double speed = Double.parseDouble(txtField1.getText());
            double time = Double.parseDouble(txtField2.getText());
            double distance;
            //distance = speed*time;
            Label1.setText("Distance = ");
            Label2.setText("Speed x ");
            label3.setText("Time");
            distance = speed * time;
            String value = String.format("%.2f", distance);
            labelResult.setText(value);
            lblUnit.setText("km");
        }
        
        else if(comboSelect.getSelectedItem().equals("Speed"))
        {
            double distance = Double.parseDouble(txtField1.getText());
            double time = Double.parseDouble(txtField2.getText());
            double speed;
            //speed = distance/time
            Label1.setText("Speed = ");
            Label2.setText("Distance / ");
            label3.setText("Time");
            speed = distance / time;
            String value = String.format("%.2f", speed);
            labelResult.setText(value);
            lblUnit.setText("km/h");
        }
        
        else if(comboSelect.getSelectedItem().equals("Time"))
        {
            double distance = Double.parseDouble(txtField1.getText());
            double speed = Double.parseDouble(txtField2.getText());
            double time;
            //time = distance/speed
            Label1.setText("Time = ");
            Label2.setText("Distance / ");
            label3.setText("Speed");
            time = distance / speed;
            String value = String.format("%.2f", time);
            labelResult.setText(value);
            lblUnit.setText("hrs");
        }
        
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Label1.setText("");
        Label2.setText("");
        label3.setText("");
        lblUnit.setText("");
        lblA.setText("");
        lblB.setText("");
        labelResult.setText("");
        txtField1.setText("");
        txtField2.setText("");
        comboSelect.setSelectedItem("Select an Option");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtField1FocusGained
        
    
    }//GEN-LAST:event_txtField1FocusGained

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField1ActionPerformed

    private void txtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2ActionPerformed
       
    }//GEN-LAST:event_txtField2ActionPerformed

    private void txtField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtField2FocusGained
      
    }//GEN-LAST:event_txtField2FocusGained

    private void txtField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField1KeyPressed
        
        
    }//GEN-LAST:event_txtField1KeyPressed

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
            java.util.logging.Logger.getLogger(Data_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataMenuItem;
    private javax.swing.JMenuItem GraphMenuItem;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
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
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblUnit;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    // End of variables declaration//GEN-END:variables

    
    private void writeValue(String text){

        if(txtField1.hasFocus()==true){
            String number = txtField1.getText() + text;
            txtField1.setText(number);
            txtField1.requestFocus();
        }
        else if(txtField2.hasFocus()==true){
            String number = txtField2.getText() + text;
            txtField2.setText(number);
            txtField2.requestFocus();
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
