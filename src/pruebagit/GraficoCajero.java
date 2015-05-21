/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Mariam
 */
public class GraficoCajero extends JFrame {

    public GraficoCajero() {
        
        
        this.setTitle("BANCO ROMANOFF");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(2);
        this.setLocation(50, 50);
        this.setLayout(null);

        //PANTALLA
        final javax.swing.JPanel pantalla;
        pantalla = new javax.swing.JPanel();
        pantalla.setLayout(null);
        pantalla.setSize(700, 350);
        pantalla.setLocation(30, 0);

        pantalla.setBackground(new Color(0, 64, 128));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        pantalla.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(20, 10, 10, 10)));
        Font font = new Font("Century Gothic", Font.BOLD, 18);
        this.add(pantalla);

        javax.swing.JLabel lbl1;
        lbl1 = new javax.swing.JLabel();
        lbl1.setText("BIENVENIDO AL CAJERO ROMANOFF");
        lbl1.setLocation(50, 10);
        lbl1.setSize(350, 50);
        lbl1.setFont(font);
        lbl1.setForeground(Color.white);
        pantalla.add(lbl1);

        final javax.swing.JLabel lbl2;
        lbl2 = new javax.swing.JLabel();
        lbl2.setText("NUMERO DE CUENTA");
        lbl2.setLocation(95, 55);
        lbl2.setSize(350, 50);
        lbl2.setFont(font);
        lbl2.setForeground(Color.white);
        pantalla.add(lbl2);
        Font font1 = new Font("Century Gothic", Font.BOLD, 14);
        lbl2.setFont(font1);

        final javax.swing.JTextField txtnum;
        txtnum = new javax.swing.JTextField();
        txtnum.setSize(100, 30);
        txtnum.setLocation(250, 70);
        pantalla.add(txtnum);

        //TECLADO ACCOUNT
        //1
        javax.swing.JButton btn1;
        btn1 = new javax.swing.JButton();
        btn1.setSize(60, 50);
        btn1.setLocation(30, 360);
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(0, 0, 0));
        btn1.setText("1");
        this.add(btn1);

        java.awt.event.ActionListener a;
        a = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "1");
            }
        };
        btn1.addActionListener(a);
        //2
        javax.swing.JButton btn2;
        btn2 = new javax.swing.JButton();
        btn2.setSize(60, 50);
        btn2.setLocation(95, 360);
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(0, 0, 0));
        btn2.setText("2");
        this.add(btn2);

        java.awt.event.ActionListener a1;
        a1 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "2");
            }
        };
        btn2.addActionListener(a1);

        //3
        javax.swing.JButton btn3;
        btn3 = new javax.swing.JButton();
        btn3.setSize(60, 50);
        btn3.setLocation(160, 360);
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(0, 0, 0));
        btn3.setText("3");
        this.add(btn3);
        java.awt.event.ActionListener a3;
        a3 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "3");
            }
        };
        btn3.addActionListener(a3);

        //4
        javax.swing.JButton btn4;
        btn4 = new javax.swing.JButton();
        btn4.setSize(60, 50);
        btn4.setLocation(30, 415);
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(0, 0, 0));
        btn4.setText("4");
        this.add(btn4);

        java.awt.event.ActionListener a4;
        a4 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "4");
            }
        };
        btn4.addActionListener(a4);

        //5
        javax.swing.JButton btn5;
        btn5 = new javax.swing.JButton();
        btn5.setSize(60, 50);
        btn5.setLocation(95, 415);
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(0, 0, 0));
        btn5.setText("5");
        this.add(btn5);

        java.awt.event.ActionListener a5;
        a5 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "5");
            }
        };
        btn5.addActionListener(a5);

        //6
        javax.swing.JButton btn6;
        btn6 = new javax.swing.JButton();
        btn6.setSize(60, 50);
        btn6.setLocation(160, 415);
        btn6.setForeground(Color.white);
        btn6.setBackground(new Color(0, 0, 0));
        btn6.setText("6");
        this.add(btn6);

        java.awt.event.ActionListener a6;
        a6 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "6");
            }
        };
        btn6.addActionListener(a6);

        //7
        javax.swing.JButton btn7;
        btn7 = new javax.swing.JButton();
        btn7.setSize(60, 50);
        btn7.setLocation(30, 470);
        btn7.setForeground(Color.white);
        btn7.setBackground(new Color(0, 0, 0));
        btn7.setText("7");
        this.add(btn7);
        java.awt.event.ActionListener a7;
        a7 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "7");
            }
        };
        btn7.addActionListener(a7);

        //8
        javax.swing.JButton btn8;
        btn8 = new javax.swing.JButton();
        btn8.setSize(60, 50);
        btn8.setLocation(95, 470);
        btn8.setForeground(Color.white);
        btn8.setBackground(new Color(0, 0, 0));
        btn8.setText("8");
        this.add(btn8);
        java.awt.event.ActionListener a8;
        a8 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "8");
            }
        };
        btn8.addActionListener(a8);
        //9
        javax.swing.JButton btn9;
        btn9 = new javax.swing.JButton();
        btn9.setSize(60, 50);
        btn9.setLocation(160, 470);
        btn9.setForeground(Color.white);
        btn9.setBackground(new Color(0, 0, 0));
        btn9.setText("9");
        this.add(btn9);

        java.awt.event.ActionListener a9;
        a9 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "9");
            }
        };
        btn9.addActionListener(a9);

        //0
        javax.swing.JButton btn0;
        btn0 = new javax.swing.JButton();
        btn0.setSize(60, 50);
        btn0.setLocation(30, 525);
        btn0.setForeground(Color.white);
        btn0.setBackground(new Color(0, 0, 0));
        btn0.setText("0");
        this.add(btn0);

        java.awt.event.ActionListener a0;
        a0 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnum.setText(txtnum.getText() + "0");
            }
        };
        btn0.addActionListener(a0);

        //NIP 
        final javax.swing.JLabel lbl3;
        lbl3 = new javax.swing.JLabel();
        lbl3.setText("NIP");
        lbl3.setLocation(190, 115);
        lbl3.setSize(350, 50);
        lbl3.setFont(font);
        lbl3.setForeground(Color.white);
        pantalla.add(lbl3);
        lbl2.setFont(font1);
        

        final javax.swing.JTextField txtnip;
        txtnip = new javax.swing.JTextField();
        txtnip.setSize(100, 30);
        txtnip.setLocation(250, 120);
        pantalla.add(txtnip);
        

     //TECLADO NIP
         //TECLADO NIP
        //1
        java.awt.event.ActionListener an1;
        an1 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "1");
            }
        };
        btn1.addActionListener(an1);
         //2

        java.awt.event.ActionListener an2;
        an2 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "2");
            }
        };
        btn2.addActionListener(an1);

        //3
        java.awt.event.ActionListener an3;
        an3 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "3");
            }
        };
        btn3.addActionListener(an3);

        //4
        java.awt.event.ActionListener an4;
        an4 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "4");
            }
        };
        btn4.addActionListener(an4);

        //5
        java.awt.event.ActionListener an5;
        an5 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "5");
            }
        };
        btn5.addActionListener(an5);

        //6
        java.awt.event.ActionListener an6;
        an6 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "6");
            }
        };
        btn6.addActionListener(an6);

        //7
        java.awt.event.ActionListener an7;
        an7 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "7");
            }
        };
        btn7.addActionListener(an7);

        //8
        java.awt.event.ActionListener an8;
        an8 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "8");
            }
        };
        btn8.addActionListener(an8);
        //9

        java.awt.event.ActionListener an9;
        an9 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "9");
            }
        };
        btn9.addActionListener(an9);

        //0
        java.awt.event.ActionListener an0;
        an0 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                txtnip.setText(txtnip.getText() + "0");
            }
        };
        btn0.addActionListener(an0);

        //ENTER BOTON
        javax.swing.JButton btnEnter;
        btnEnter = new javax.swing.JButton();
        btnEnter.setSize(125, 50);
        btnEnter.setLocation(95, 525);
        btnEnter.setForeground(Color.white);
        btnEnter.setBackground(new Color(0, 0, 0));
        btnEnter.setText("ENTER");
        this.add(btnEnter);

        java.awt.event.ActionListener aEnter;
        aEnter = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                      //for
                int num=Integer.parseInt(txtnum.getText());
                int nip=Integer.parseInt(txtnip.getText());
                if(num==123 && nip== 123){
                    //PanelMenu1 menu1=new PanelMenu1();
                    JOptionPane.showMessageDialog(null, "¡BIENVENIDO!");
                    pantalla.removeAll();
                    //pantalla.add(menu1);
                    pantalla.validate();
                    pantalla.repaint();
                    
                }
            }
        };

        //btnEnter.addActionListener(aEnter);
btnEnter.addActionListener(aEnter);
    }

}
