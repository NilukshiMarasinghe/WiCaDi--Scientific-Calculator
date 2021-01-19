
package wicadi.calculator;

import java.awt.Toolkit;
import wicadi.calculator.Scientific_Calculator;
import java.awt.event.KeyEvent;


public class Programmer_Calculator extends javax.swing.JFrame {

    public Programmer_Calculator() 
    {
        initComponents();
        setIcon();
    }
    
    int value;
    
    public void Decimal_disable()
    {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
    }
    
    public void Binary_disable()
    {
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        
    }
    
    public void Octal_disable()
    {
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(false);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
    }
    
    public void Hexa_disable()
    {
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
    }
    
    public void Hex_to_Bin()
    {
        String hex_value = txtDisplay.getText();
        value = Integer.parseInt(hex_value, 16);
        String bin_value = Integer.toBinaryString(value);
        txtResultDisplay.setText(bin_value);
    }
    
    public void Hex_to_Dec()
    {
        String hex_value = txtDisplay.getText();
        value = Integer.parseInt(hex_value, 16);
        String dec_value = Integer.toString(value);
        txtResultDisplay.setText(dec_value);
    }
    
    public void Hex_to_Octal()
    {
        String hex_value = txtDisplay.getText();
        value = Integer.parseInt(hex_value, 16);
        String oct_value = Integer.toOctalString(value);
        txtResultDisplay.setText(oct_value);
    }
    
    public void Hex_to_Hex()
    {
        txtResultDisplay.setText(txtDisplay.getText());
    }
    
    public void Bin_to_Dec()
    {
        String bin_value = txtDisplay.getText();
        value = Integer.parseInt(bin_value, 2);
        String dec_value = Integer.toString(value);
        txtResultDisplay.setText(dec_value);
    }
    
    public void Bin_to_Octal()
    {
        String bin_value = txtDisplay.getText();
        value = Integer.parseInt(bin_value, 2);
        String oct_value = Integer.toOctalString(value);
        txtResultDisplay.setText(oct_value);
    }
    
    public void Bin_to_Hex()
    {
        String bin_value = txtDisplay.getText();
        value = Integer.parseInt(bin_value, 2);
        String hex_value = Integer.toHexString(value);
        txtResultDisplay.setText(hex_value);
    }
    
    public void Bin_to_Bin()
    {
        txtResultDisplay.setText(txtDisplay.getText());
    }
    
    public void Octal_to_Dec()
    {
        String oct_value = txtDisplay.getText();
        value = Integer.parseInt(oct_value, 8);
        String dec_value = Integer.toString(value);
        txtResultDisplay.setText(dec_value);
    }
    
    public void Octal_to_Bin()
    {
        String oct_value = txtDisplay.getText();
        value = Integer.parseInt(oct_value, 8);
        String bin_value = Integer.toBinaryString(value);
        txtResultDisplay.setText(bin_value);
    }
    
    public void Octal_to_Hex()
    {
        String oct_value = txtDisplay.getText();
        value = Integer.parseInt(oct_value, 8);
        String hex_value = Integer.toHexString(value);
        txtResultDisplay.setText(hex_value);
    }
    
    public void Octal_to_Octal()
    {
        
        txtResultDisplay.setText(txtDisplay.getText());
    }
    
    public void Dec_to_Dec()
    {
        txtResultDisplay.setText(txtDisplay.getText());
    }
    
    public void Dec_to_Bin()
    {
        String dec_value = txtDisplay.getText();
        value = Integer.parseInt(dec_value, 10);
        String bin_value = Integer.toBinaryString(value);
        txtResultDisplay.setText(bin_value);
    }
    
    public void Dec_to_Octal()
    {
        String dec_value = txtDisplay.getText();
        value = Integer.parseInt(dec_value, 10);
        String oct_value = Integer.toOctalString(value);
        txtResultDisplay.setText(oct_value);
    }
    
    public void Dec_to_Hex()
    {
        String dec_value = txtDisplay.getText();
        value = Integer.parseInt(dec_value, 10);
        String hex_value = Integer.toHexString(value);
        txtResultDisplay.setText(hex_value);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnBinary = new javax.swing.JButton();
        btnHexadecimal = new javax.swing.JButton();
        btnOctal = new javax.swing.JButton();
        comboSelect = new javax.swing.JComboBox<>();
        txtResultDisplay = new javax.swing.JTextField();
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
        setTitle("WiCaDi - Programmer Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        txtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisplayKeyTyped(evt);
            }
        });
        getContentPane().add(txtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 50));

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
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 50));

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
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 60, 50));

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
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 60, 50));

        btnF.setBackground(new java.awt.Color(0, 153, 153));
        btnF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnF.setForeground(new java.awt.Color(255, 255, 255));
        btnF.setText("F");
        btnF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnF.setFocusPainted(false);
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        getContentPane().add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 50));

        btnE.setBackground(new java.awt.Color(0, 153, 153));
        btnE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnE.setForeground(new java.awt.Color(255, 255, 255));
        btnE.setText("E");
        btnE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnE.setFocusPainted(false);
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        getContentPane().add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 50));

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
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 50));

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
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 50));

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
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 50));

        btnD.setBackground(new java.awt.Color(0, 153, 153));
        btnD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 255, 255));
        btnD.setText("D");
        btnD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnD.setFocusPainted(false);
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 60, 50));

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
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 60, 50));

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
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 60, 50));

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
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 60, 50));

        btnC.setBackground(new java.awt.Color(0, 153, 153));
        btnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnC.setFocusPainted(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 60, 50));

        btnB.setBackground(new java.awt.Color(0, 153, 153));
        btnB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 255, 255));
        btnB.setText("B");
        btnB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnB.setFocusPainted(false);
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 60, 50));

        btnA.setBackground(new java.awt.Color(0, 153, 153));
        btnA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 255, 255));
        btnA.setText("A");
        btnA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnA.setFocusPainted(false);
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 60, 50));

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
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, 50));

        btnDecimal.setBackground(new java.awt.Color(51, 0, 153));
        btnDecimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimal.setText("Decimal");
        btnDecimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDecimal.setFocusPainted(false);
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 90, 50));

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
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, 50));

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
        getContentPane().add(btnBackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 50));

        btnBinary.setBackground(new java.awt.Color(51, 0, 153));
        btnBinary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBinary.setForeground(new java.awt.Color(255, 255, 255));
        btnBinary.setText("Binary");
        btnBinary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBinary.setFocusPainted(false);
        btnBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnBinary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 90, 50));

        btnHexadecimal.setBackground(new java.awt.Color(51, 0, 153));
        btnHexadecimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHexadecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnHexadecimal.setText("Hex");
        btnHexadecimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHexadecimal.setFocusPainted(false);
        btnHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexadecimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnHexadecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 90, 50));

        btnOctal.setBackground(new java.awt.Color(51, 0, 153));
        btnOctal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOctal.setForeground(new java.awt.Color(255, 255, 255));
        btnOctal.setText("Octal");
        btnOctal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOctal.setFocusPainted(false);
        btnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctalActionPerformed(evt);
            }
        });
        getContentPane().add(btnOctal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 90, 50));

        comboSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hexadecimal", "Decimal", "Binary", "Octal" }));
        comboSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        comboSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectActionPerformed(evt);
            }
        });
        getContentPane().add(comboSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, 50));

        txtResultDisplay.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        txtResultDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultDisplayKeyTyped(evt);
            }
        });
        getContentPane().add(txtResultDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

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

        Scientific_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
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
        ProgrammerMenuItem.setText("Programmer ");
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
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

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
        
        this.setSize(395, 485);
    }//GEN-LAST:event_formWindowActivated

    private void Scientific_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scientific_Menu_ItemActionPerformed
        Scientific_Calculator sc = new Scientific_Calculator();
        sc.setVisible(true);
        sc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Scientific_Menu_ItemActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
      
        if(comboSelect.getSelectedItem().equals("Hexadecimal"))
         {
             Hex_to_Dec();
         }
         else if(comboSelect.getSelectedItem().equals("Binary"))
         {
             Bin_to_Dec();
         }
         else if(comboSelect.getSelectedItem().equals("Octal"))
         {
             Octal_to_Dec();
         }
         else if(comboSelect.getSelectedItem().equals("Decimal"))
         {
             Dec_to_Dec();
         }
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        int max_length = 18;
        

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
        txtResultDisplay.setText("");
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

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btnA.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinaryActionPerformed
        
        if(comboSelect.getSelectedItem().equals("Hexadecimal"))
         {
             Hex_to_Bin();
         }
         else if(comboSelect.getSelectedItem().equals("Binary"))
         {
             Bin_to_Bin();
         }
         else if(comboSelect.getSelectedItem().equals("Octal"))
         {
             Octal_to_Bin();
         }
         else if(comboSelect.getSelectedItem().equals("Decimal"))
         {
             Dec_to_Bin();
         }
        
    }//GEN-LAST:event_btnBinaryActionPerformed

    private void txtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyTyped
         char c = evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
         {
             getToolkit().beep();
         evt.consume();
         }
    }//GEN-LAST:event_txtDisplayKeyTyped

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btnB.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
       String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btnC.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
         String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btnD.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }

    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
         String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btnE.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }

        
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 18;
        

            if(length<=max_length)
            {
               String number = txtDisplay.getText() + btnF.getText();
                txtDisplay.setText(number);
            }
            else
            {
                
            }

    }//GEN-LAST:event_btnFActionPerformed

    private void GraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphMenuItemActionPerformed
        Graph_Calculator gc = new Graph_Calculator();
        gc.setVisible(true);
        gc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_GraphMenuItemActionPerformed

    private void btnHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexadecimalActionPerformed
        
        if(comboSelect.getSelectedItem().equals("Hexadecimal"))
         {
             Hex_to_Hex();
         }
         else if(comboSelect.getSelectedItem().equals("Binary"))
         {
             Bin_to_Hex();
         }
         else if(comboSelect.getSelectedItem().equals("Octal"))
         {
             Octal_to_Hex();
         }
         else if(comboSelect.getSelectedItem().equals("Decimal"))
         {
             Dec_to_Hex();
         }
    }//GEN-LAST:event_btnHexadecimalActionPerformed

    private void btnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctalActionPerformed
        
        if(comboSelect.getSelectedItem().equals("Hexadecimal"))
         {
             Hex_to_Octal();
         }
         else if(comboSelect.getSelectedItem().equals("Binary"))
         {
             Bin_to_Octal();
         }
         else if(comboSelect.getSelectedItem().equals("Octal"))
         {
             Octal_to_Octal();
         }
         else if(comboSelect.getSelectedItem().equals("Decimal"))
         {
             Dec_to_Octal();
         }
    }//GEN-LAST:event_btnOctalActionPerformed

    private void ProgrammerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgrammerMenuItemActionPerformed
        Programmer_Calculator pc = new Programmer_Calculator();
        pc.setVisible(true);
        pc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ProgrammerMenuItemActionPerformed

    private void DataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataMenuItemActionPerformed
       Data_Calculator dc = new Data_Calculator();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DataMenuItemActionPerformed

    private void comboSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectActionPerformed
         if(comboSelect.getSelectedItem().equals("Decimal"))
         {
             Decimal_disable();
         }
         else if(comboSelect.getSelectedItem().equals("Binary"))
         {
             Binary_disable();
         }
         else if(comboSelect.getSelectedItem().equals("Octal"))
         {
             Octal_disable();
         }
         else if(comboSelect.getSelectedItem().equals("Hexadecimal"))
         {
             Hexa_disable();
         }
    }//GEN-LAST:event_comboSelectActionPerformed

    private void txtResultDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultDisplayKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultDisplayKeyTyped

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programmer_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataMenuItem;
    private javax.swing.JMenuItem GraphMenuItem;
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
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnBinary;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnHexadecimal;
    private javax.swing.JButton btnOctal;
    private javax.swing.JComboBox<String> comboSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtResultDisplay;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
