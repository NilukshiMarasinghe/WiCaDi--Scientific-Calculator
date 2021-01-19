
package wicadi.calculator;


import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Scientific_Calculator extends javax.swing.JFrame {

    private ArrayList<String> currentEq;
    private ScriptEngine solver;
    private int size;
    
    private Object math;
    
    public Scientific_Calculator() {
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
        btnSin = new javax.swing.JButton();
        btnSinh = new javax.swing.JButton();
        btnCosh = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnTanh = new javax.swing.JButton();
        btnRound = new javax.swing.JButton();
        btnCubeRoot = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnEuler = new javax.swing.JButton();
        btnXpow2 = new javax.swing.JButton();
        btnFraction = new javax.swing.JButton();
        btnIntergration = new javax.swing.JButton();
        btnLoadFile = new javax.swing.JButton();
        jbtnSaveFile = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnOpenParen = new javax.swing.JButton();
        btnfactorial = new javax.swing.JButton();
        btnVariable_X = new javax.swing.JButton();
        btnVariable_Y = new javax.swing.JButton();
        btnVariable_Z = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        btnRead = new javax.swing.JButton();
        txtAnswer = new javax.swing.JTextField();
        btnCloseParen = new javax.swing.JButton();
        btnFCal = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        Xpow3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Standard_Menu_Item = new javax.swing.JMenuItem();
        Scientific_Menu_Item = new javax.swing.JMenuItem();
        GraphMneuItem = new javax.swing.JMenuItem();
        ProgrammerMenuItem = new javax.swing.JMenuItem();
        DataMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WiCaDi - Scientific Calculator");
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
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 64, 57));

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
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 64, 57));

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
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 64, 57));

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
        getContentPane().add(btnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 64, 57));

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
        getContentPane().add(btnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 64, 57));

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
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 64, 57));

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
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 64, 57));

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
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 64, 57));

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
        getContentPane().add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 64, 57));

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
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 64, 57));

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
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 64, 57));

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
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 64, 57));

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
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 64, 57));

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
        getContentPane().add(btnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 64, 57));

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
        getContentPane().add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 64, 57));

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
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 64, 60));

        btnPercentage.setBackground(new java.awt.Color(51, 0, 255));
        btnPercentage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPercentage.setForeground(new java.awt.Color(255, 255, 255));
        btnPercentage.setText("%");
        btnPercentage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPercentage.setFocusPainted(false);
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        getContentPane().add(btnPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 64, 57));

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
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 64, 57));

        btnBackSpace.setBackground(new java.awt.Color(51, 0, 255));
        btnBackSpace.setFont(new java.awt.Font("Wingdings", 1, 24)); // NOI18N
        btnBackSpace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSpace.setText("");
        btnBackSpace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSpace.setFocusPainted(false);
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 64, 57));

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
        getContentPane().add(btnNegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 64, 57));

        btnSin.setBackground(new java.awt.Color(51, 0, 153));
        btnSin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSin.setForeground(new java.awt.Color(255, 255, 255));
        btnSin.setText("Sin");
        btnSin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSin.setFocusPainted(false);
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        getContentPane().add(btnSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 77, 57));

        btnSinh.setBackground(new java.awt.Color(51, 0, 153));
        btnSinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSinh.setForeground(new java.awt.Color(255, 255, 255));
        btnSinh.setText("Sinh");
        btnSinh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSinh.setFocusPainted(false);
        btnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhActionPerformed(evt);
            }
        });
        getContentPane().add(btnSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 77, 57));

        btnCosh.setBackground(new java.awt.Color(51, 0, 153));
        btnCosh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCosh.setForeground(new java.awt.Color(255, 255, 255));
        btnCosh.setText("Cosh");
        btnCosh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCosh.setFocusPainted(false);
        btnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoshActionPerformed(evt);
            }
        });
        getContentPane().add(btnCosh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 57));

        btnCos.setBackground(new java.awt.Color(51, 0, 153));
        btnCos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCos.setForeground(new java.awt.Color(255, 255, 255));
        btnCos.setText("Cos");
        btnCos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCos.setFocusPainted(false);
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 77, 57));

        btnTan.setBackground(new java.awt.Color(51, 0, 153));
        btnTan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTan.setForeground(new java.awt.Color(255, 255, 255));
        btnTan.setText("Tan");
        btnTan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTan.setFocusPainted(false);
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 77, 57));

        btnTanh.setBackground(new java.awt.Color(51, 0, 153));
        btnTanh.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnTanh.setForeground(new java.awt.Color(255, 255, 255));
        btnTanh.setText("Tanh");
        btnTanh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTanh.setFocusPainted(false);
        btnTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanhActionPerformed(evt);
            }
        });
        getContentPane().add(btnTanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 78, 57));

        btnRound.setBackground(new java.awt.Color(51, 0, 153));
        btnRound.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRound.setForeground(new java.awt.Color(255, 255, 255));
        btnRound.setText("Round");
        btnRound.setToolTipText("");
        btnRound.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRound.setFocusPainted(false);
        btnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoundActionPerformed(evt);
            }
        });
        getContentPane().add(btnRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 80, 57));

        btnCubeRoot.setBackground(new java.awt.Color(51, 0, 153));
        btnCubeRoot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCubeRoot.setForeground(new java.awt.Color(255, 255, 255));
        btnCubeRoot.setText("3√");
        btnCubeRoot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCubeRoot.setFocusPainted(false);
        btnCubeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubeRootActionPerformed(evt);
            }
        });
        getContentPane().add(btnCubeRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 77, 57));

        btnSqrt.setBackground(new java.awt.Color(51, 0, 153));
        btnSqrt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSqrt.setForeground(new java.awt.Color(255, 255, 255));
        btnSqrt.setText("√");
        btnSqrt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSqrt.setFocusPainted(false);
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });
        getContentPane().add(btnSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 77, 57));

        btnLog.setBackground(new java.awt.Color(51, 0, 153));
        btnLog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("ln");
        btnLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLog.setFocusPainted(false);
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 77, 57));

        btnEuler.setBackground(new java.awt.Color(51, 0, 153));
        btnEuler.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEuler.setForeground(new java.awt.Color(255, 255, 255));
        btnEuler.setText("e");
        btnEuler.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEuler.setFocusPainted(false);
        btnEuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEulerActionPerformed(evt);
            }
        });
        getContentPane().add(btnEuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 77, 57));

        btnXpow2.setBackground(new java.awt.Color(51, 0, 153));
        btnXpow2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXpow2.setForeground(new java.awt.Color(255, 255, 255));
        btnXpow2.setText("x^2");
        btnXpow2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXpow2.setFocusPainted(false);
        btnXpow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXpow2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnXpow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 77, 57));

        btnFraction.setBackground(new java.awt.Color(51, 0, 153));
        btnFraction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFraction.setForeground(new java.awt.Color(255, 255, 255));
        btnFraction.setText("1/x");
        btnFraction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFraction.setFocusPainted(false);
        btnFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFractionActionPerformed(evt);
            }
        });
        getContentPane().add(btnFraction, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 77, 57));

        btnIntergration.setBackground(new java.awt.Color(0, 204, 204));
        btnIntergration.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIntergration.setForeground(new java.awt.Color(255, 255, 255));
        btnIntergration.setText("Intergration ");
        btnIntergration.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIntergration.setFocusPainted(false);
        getContentPane().add(btnIntergration, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 240, 45));

        btnLoadFile.setBackground(new java.awt.Color(102, 102, 255));
        btnLoadFile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoadFile.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadFile.setText("Load File");
        btnLoadFile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLoadFile.setFocusPainted(false);
        btnLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFileActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoadFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 130, 45));

        jbtnSaveFile.setBackground(new java.awt.Color(102, 102, 255));
        jbtnSaveFile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnSaveFile.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSaveFile.setText("Save File");
        jbtnSaveFile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSaveFile.setFocusPainted(false);
        jbtnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveFileActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSaveFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 130, 45));

        btnSave.setBackground(new java.awt.Color(102, 102, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setFocusPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 77, 57));

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
        getContentPane().add(btnOpenParen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 64, 57));

        btnfactorial.setBackground(new java.awt.Color(51, 0, 153));
        btnfactorial.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnfactorial.setForeground(new java.awt.Color(255, 255, 255));
        btnfactorial.setText("x!");
        btnfactorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnfactorial.setFocusPainted(false);
        btnfactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnfactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 64, 57));

        btnVariable_X.setBackground(new java.awt.Color(51, 0, 153));
        btnVariable_X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVariable_X.setForeground(new java.awt.Color(255, 255, 255));
        btnVariable_X.setText("x");
        btnVariable_X.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVariable_X.setFocusPainted(false);
        btnVariable_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVariable_XActionPerformed(evt);
            }
        });
        getContentPane().add(btnVariable_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 77, 57));

        btnVariable_Y.setBackground(new java.awt.Color(51, 0, 153));
        btnVariable_Y.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVariable_Y.setForeground(new java.awt.Color(255, 255, 255));
        btnVariable_Y.setText("y");
        btnVariable_Y.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVariable_Y.setFocusPainted(false);
        btnVariable_Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVariable_YActionPerformed(evt);
            }
        });
        getContentPane().add(btnVariable_Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 77, 57));

        btnVariable_Z.setBackground(new java.awt.Color(51, 0, 153));
        btnVariable_Z.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVariable_Z.setForeground(new java.awt.Color(255, 255, 255));
        btnVariable_Z.setText("z");
        btnVariable_Z.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVariable_Z.setFocusPainted(false);
        btnVariable_Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVariable_ZActionPerformed(evt);
            }
        });
        getContentPane().add(btnVariable_Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 77, 57));

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 530, 50));

        btnRead.setBackground(new java.awt.Color(102, 102, 255));
        btnRead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRead.setForeground(new java.awt.Color(255, 255, 255));
        btnRead.setText("Read");
        btnRead.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRead.setFocusPainted(false);
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });
        getContentPane().add(btnRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 77, 57));

        txtAnswer.setEditable(false);
        txtAnswer.setBackground(new java.awt.Color(255, 255, 255));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAnswer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 50));

        btnCloseParen.setBackground(new java.awt.Color(51, 0, 255));
        btnCloseParen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCloseParen.setForeground(new java.awt.Color(255, 255, 255));
        btnCloseParen.setText(")");
        btnCloseParen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCloseParen.setFocusPainted(false);
        btnCloseParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseParenActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloseParen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 64, 57));

        btnFCal.setBackground(new java.awt.Color(51, 0, 153));
        btnFCal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFCal.setForeground(new java.awt.Color(255, 255, 255));
        btnFCal.setText("f()");
        btnFCal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFCal.setFocusPainted(false);
        btnFCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFCalActionPerformed(evt);
            }
        });
        getContentPane().add(btnFCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 64, 57));

        btnPi.setBackground(new java.awt.Color(51, 0, 153));
        btnPi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        btnPi.setForeground(new java.awt.Color(255, 255, 255));
        btnPi.setText("π");
        btnPi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPi.setFocusPainted(false);
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });
        getContentPane().add(btnPi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 77, 57));

        Xpow3.setBackground(new java.awt.Color(51, 0, 153));
        Xpow3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Xpow3.setForeground(new java.awt.Color(255, 255, 255));
        Xpow3.setText("x^3");
        Xpow3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Xpow3.setFocusPainted(false);
        Xpow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xpow3ActionPerformed(evt);
            }
        });
        getContentPane().add(Xpow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 77, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 550, 630));

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

        GraphMneuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        GraphMneuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gr icon.jpg"))); // NOI18N
        GraphMneuItem.setText("Graph");
        GraphMneuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphMneuItemActionPerformed(evt);
            }
        });
        jMenu1.add(GraphMneuItem);

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
        DataMenuItem.setText(" Data");
        DataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(DataMenuItem);

        jMenuBar1.add(jMenu1);

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
        int max_length = 34;
        

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
        
        this.setSize(555, 660);
    }//GEN-LAST:event_formWindowActivated

    private void Scientific_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scientific_Menu_ItemActionPerformed
        Scientific_Calculator sc = new Scientific_Calculator();
        sc.setVisible(true);
        sc.setLocationRelativeTo(null);
        this.dispose();
        
        
        
    }//GEN-LAST:event_Scientific_Menu_ItemActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
            txtDisplay.setText(txtDisplay.getText()+"!");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        double p = Double.parseDouble(String.valueOf(value))/100;
        txtDisplay.setText(txtDisplay.getText()+"%");
        txtAnswer.setText(String.valueOf(p));
        }
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String display = txtDisplay.getText();
        int length = display.length();
        int max_length = 34;
        

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
        int max_length = 34;
        

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
        int max_length =34;
        

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
        int max_length = 34;
        

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
        int max_length = 34;
        

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
        int max_length = 34;
        

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
        int max_length = 34;
        

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
        int max_length = 34;
        

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
        int max_length = 34;
        

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
        if(txtDisplay.getText().contains("x")||txtDisplay.getText().contains("y")||txtDisplay.getText().contains("z"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = value*(-1);
        txtDisplay.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnNegativeActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        if(txtDisplay.getText().contains("x")||txtDisplay.getText().contains("y")||txtDisplay.getText().contains("z"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = Math.sqrt(value);
        txtDisplay.setText("√"+txtDisplay.getText());
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
       if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
            txtDisplay.setText("Log("+txtDisplay.getText()+")");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
         
        value = Math.log(value);
        txtDisplay.setText("Log("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = Math.toRadians(value); 
        value = Math.sin(value);
        txtDisplay.setText("Sin("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        
        value = Math.sinh(value);
        txtDisplay.setText("Sinh("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnSinhActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = Math.toRadians(value); 
        value = Math.cos(value);
        txtDisplay.setText("Cos("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoshActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        
        value = Math.cosh(value);
        txtDisplay.setText("Cosh("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnCoshActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = Math.toRadians(value); 
        value = Math.tan(value);
        txtDisplay.setText("Tan("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCubeRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubeRootActionPerformed
        if(txtDisplay.getText().contains("x")||txtDisplay.getText().contains("y")||txtDisplay.getText().contains("z"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = Math.cbrt(value);
        txtDisplay.setText("3√"+txtDisplay.getText());
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnCubeRootActionPerformed

    private void btnEulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEulerActionPerformed
        
        double value;
        value = (2.718281828459045);
        txtDisplay.setText(txtDisplay.getText()+String.valueOf(value));
        
    }//GEN-LAST:event_btnEulerActionPerformed

    private void btnXpow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXpow2ActionPerformed
        
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = (value * value);
        txtDisplay.setText(txtDisplay.getText()+"^2");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnXpow2ActionPerformed

    private void btnFractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFractionActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        double p = 1/Double.parseDouble(String.valueOf(value));
        txtDisplay.setText("1/"+txtDisplay.getText());
        txtAnswer.setText(String.valueOf(p));
        }
    }//GEN-LAST:event_btnFractionActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String formula = txtDisplay.getText();
        String name = JOptionPane.showInputDialog("Enter Formula Name");
        
        try
        {
            if(name==null )
            {
                
            }
            else{
                File f = new File("Database.txt");
                PrintWriter p = new PrintWriter(new FileOutputStream(f,true));
                p.append(name+"\n"+formula+"\n");
                p.close();
            }
            
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void GraphMneuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphMneuItemActionPerformed
        Graph_Calculator gc = new Graph_Calculator();
        gc.setVisible(true);
        gc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_GraphMneuItemActionPerformed

    private void btnTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanhActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = Math.tanh(value);
        txtDisplay.setText("Tan("+txtDisplay.getText()+")");
        txtAnswer.setText(String.valueOf(value));
        }
    }//GEN-LAST:event_btnTanhActionPerformed

    private void btnRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoundActionPerformed
         if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
            if(txtAnswer.getText().equals(""))
            {
                double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                value = Math.round(value);
                txtAnswer.setText(String.valueOf(value));
            }
            else
            {
                double value = Double.parseDouble(String.valueOf(txtAnswer.getText()));
                value = Math.round(value);
                txtAnswer.setText(String.valueOf(value));
            }
        
        }
    }//GEN-LAST:event_btnRoundActionPerformed

    private void ProgrammerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgrammerMenuItemActionPerformed
        Programmer_Calculator pc = new Programmer_Calculator();
        pc.setVisible(true);
        pc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ProgrammerMenuItemActionPerformed

    private void jbtnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveFileActionPerformed
        if(txtDisplay.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Text Field Empty");
        }
        else
        {
        JFileChooser fc =new JFileChooser();
        fc.showSaveDialog(this);
        File f=fc.getSelectedFile();
        boolean b;
        try{

            b=f.exists();
            if(b==true)
            {
                int reply =  JOptionPane.showConfirmDialog(null, "Do you want to Override the Formula?","Confirm",JOptionPane.YES_NO_OPTION);
                if(reply== JOptionPane.YES_OPTION)
                {
                f.delete();
                FileWriter fw=new FileWriter(f);
                String text=txtDisplay.getText();
                fw.write(text);
                fw.close();
                JOptionPane.showMessageDialog(null,"File Saved Sucessfully");
                }
            }
            else
            {
                FileWriter fw=new FileWriter(f);
                String text=txtDisplay.getText();
                fw.write(text);
                fw.close();
                JOptionPane.showMessageDialog(null,"File Saved Sucessfully");
            }
            
        } 
        catch(IOException e)
        {

        }
        }
        
    }//GEN-LAST:event_jbtnSaveFileActionPerformed

    private void DataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataMenuItemActionPerformed
        Data_Calculator dc = new Data_Calculator();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DataMenuItemActionPerformed

    private void btnOpenParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenParenActionPerformed
        String number = txtDisplay.getText() + btnOpenParen.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnOpenParenActionPerformed

    private void btnfactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactorialActionPerformed
        if(txtDisplay.getText().contains("x")||txtDisplay.getText().contains("y")||txtDisplay.getText().contains("z")||txtDisplay.getText().contains("."))
        {
            txtAnswer.setText("Syntax Error");
            txtDisplay.setText(txtDisplay.getText()+"!");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        int x=1;
        for(int i=1; i<=value; i++)
        {
            x = x * i;
        }
        txtDisplay.setText(txtDisplay.getText()+"!");
        txtAnswer.setText(String.valueOf(x));
        }
        
    }//GEN-LAST:event_btnfactorialActionPerformed

    private void btnVariable_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVariable_XActionPerformed
        String number = txtDisplay.getText() + btnVariable_X.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnVariable_XActionPerformed

    private void btnVariable_YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVariable_YActionPerformed
        String number = txtDisplay.getText() + btnVariable_Y.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnVariable_YActionPerformed

    private void btnVariable_ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVariable_ZActionPerformed
        String number = txtDisplay.getText() + btnVariable_Z.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnVariable_ZActionPerformed

    private void btnCloseParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseParenActionPerformed
        String number = txtDisplay.getText() + btnCloseParen.getText();
        txtDisplay.setText(number);
    }//GEN-LAST:event_btnCloseParenActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try{
            
            String CurrentLine = "";
            String formula="";
            FileReader reader = new FileReader("Database.txt");
            BufferedReader br = new BufferedReader(reader);
            Scanner sc = new Scanner(reader);
            
            String formulaName = JOptionPane.showInputDialog("Enter Formula Name ");
            
            while((CurrentLine = br.readLine())!=null)
            {
                {
                    if(CurrentLine.equals(formulaName)){
                        formula = br.readLine();
                        txtDisplay.setText(formula);
                        break;
                    }
                    else{
            txtDisplay.setText("No Such Formula");
            }
                }
                
            }
            if(formulaName==null)
            {
                txtDisplay.setText("");
            }
            
        }
        catch(Exception ex)
        {
           
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnFCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFCalActionPerformed
        
        if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        
        else{
            
        
        
        if(txtDisplay.getText().contains("x")){
            String val = JOptionPane.showInputDialog(null, "Enter Value for x : ");
            txtDisplay.setText(txtDisplay.getText().replaceAll("x", "("+val+")"));
        }
        
        if(txtDisplay.getText().contains("y")){
            String val = JOptionPane.showInputDialog(null, "Enter Value for y : ");
            txtDisplay.setText(txtDisplay.getText().replaceAll("y", "("+val+")"));
        }
        
        if(txtDisplay.getText().contains("z")){
            String val = JOptionPane.showInputDialog(null, "Enter Value for z : ");
            txtDisplay.setText(txtDisplay.getText().replaceAll("z", "("+val+")"));
        }
        
        WiCaDiCalculator cal = new WiCaDiCalculator();
        cal.solveEquation(txtDisplay.getText());
        txtAnswer.setText(cal.Result());
        }
        
    }//GEN-LAST:event_btnFCalActionPerformed

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerActionPerformed

    private void Xpow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xpow3ActionPerformed
        if(txtDisplay.getText().contains("(")||txtDisplay.getText().contains(")")||txtDisplay.getText().contains("")
                ||txtDisplay.getText().contains("*")||txtDisplay.getText().contains("-")||txtDisplay.getText().contains("+"))
        {
            txtAnswer.setText("Syntax Error");
        }
        else if(txtDisplay.getText().equals(""))
        {
            txtAnswer.setText("0");
        }
        else
        {
        double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        value = (value * value);
        txtDisplay.setText(txtDisplay.getText()+"^3");
        txtAnswer.setText(String.valueOf(value));
        } 
    }//GEN-LAST:event_Xpow3ActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed
        double value;
        value = (3.1415926535897932384626433832795);
        txtDisplay.setText(txtDisplay.getText()+String.valueOf(value));
    }//GEN-LAST:event_btnPiActionPerformed

    private void btnLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFileActionPerformed
       JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        
        try
        {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            txtDisplay.read(br, null);
            br.close();
            txtDisplay.requestFocus();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoadFileActionPerformed

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
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific_Calculator().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataMenuItem;
    private javax.swing.JMenuItem GraphMneuItem;
    private javax.swing.JMenuItem ProgrammerMenuItem;
    private javax.swing.JMenuItem Scientific_Menu_Item;
    private javax.swing.JMenuItem Standard_Menu_Item;
    private javax.swing.JButton Xpow3;
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
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnCosh;
    private javax.swing.JButton btnCubeRoot;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnEuler;
    private javax.swing.JButton btnFCal;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnIntergration;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNegative;
    private javax.swing.JButton btnOpenParen;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnRound;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSinh;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnTanh;
    private javax.swing.JButton btnVariable_X;
    private javax.swing.JButton btnVariable_Y;
    private javax.swing.JButton btnVariable_Z;
    private javax.swing.JButton btnXpow2;
    private javax.swing.JButton btnfactorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbtnSaveFile;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
