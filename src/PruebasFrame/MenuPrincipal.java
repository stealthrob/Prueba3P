/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PruebasFrame;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariam
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        desktop1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtopc = new javax.swing.JTextField();
        lblsaldo = new javax.swing.JLabel();
        lblretiro = new javax.swing.JLabel();
        lbldeposito = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1078, 296));

        desktop1.setBackground(new java.awt.Color(204, 102, 255));
        desktop1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU PRINCIPAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teclea una Opcion");

        txtopc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopcActionPerformed(evt);
            }
        });
        txtopc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtopcFocusGained(evt);
            }
        });
        txtopc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtopcKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtopcKeyTyped(evt);
            }
        });

        lblsaldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblsaldo.setText("1. Solicitud de Saldo ");

        lblretiro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblretiro.setForeground(new java.awt.Color(255, 255, 255));
        lblretiro.setText("2. Retiro");

        lbldeposito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldeposito.setForeground(new java.awt.Color(255, 255, 255));
        lbldeposito.setText("3. Deposito");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BANCO FALSO YEI");

        javax.swing.GroupLayout desktop1Layout = new javax.swing.GroupLayout(desktop1);
        desktop1.setLayout(desktop1Layout);
        desktop1Layout.setHorizontalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop1Layout.createSequentialGroup()
                .addGap(117, 933, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
            .addGroup(desktop1Layout.createSequentialGroup()
                .addGroup(desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktop1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblsaldo)
                            .addComponent(lblretiro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldeposito, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(desktop1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(txtopc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desktop1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktop1Layout.setVerticalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktop1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktop1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(lblsaldo)))
                .addGap(18, 18, 18)
                .addComponent(lblretiro)
                .addGap(26, 26, 26)
                .addComponent(lbldeposito)
                .addGap(36, 36, 36)
                .addGroup(desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtopc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55))
        );
        desktop1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(txtopc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(lblsaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(lblretiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(lbldeposito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtopcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopcActionPerformed
CajeroPrincipal.caja = this.txtopc;      

        
        
    }//GEN-LAST:event_txtopcActionPerformed

    private void txtopcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtopcKeyPressed
     int opc;
        if(evt.getKeyCode()==10 ){
             opc=Integer.parseInt(txtopc.getText());
        }
        
      
    }//GEN-LAST:event_txtopcKeyPressed

    private void txtopcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtopcKeyTyped
 char tecla;
      tecla=evt.getKeyChar();
      
      if(Character.isLetter(tecla)){
          evt.consume();
          getToolkit().beep();
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopcKeyTyped

    private void txtopcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtopcFocusGained
CajeroPrincipal.caja = this.txtopc;      
// TODO add your handling code here:
    }//GEN-LAST:event_txtopcFocusGained

public  void manage_window(Component c) {
        desktop1.removeAll();
        desktop1.setPreferredSize(c.getPreferredSize());
        desktop1.add(c);
        desktop1.updateUI();
        c.setSize(desktop1.getPreferredSize());
        c.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbldeposito;
    private javax.swing.JLabel lblretiro;
    private javax.swing.JLabel lblsaldo;
    protected static javax.swing.JTextField txtopc;
    // End of variables declaration//GEN-END:variables
}
