/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PruebasFrame;

import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pruebagit.Archivos;
import pruebagit.Cuenta;
import pruebagit.Limitetxt;
import pruebagit.ValidarMayusculas;

/**
 *
 * @author Mariam
 */
public class AltaCuentas extends javax.swing.JPanel {
private DefaultTableModel modelo = new DefaultTableModel();
ArrayList<Cuenta> cuentas;
 Archivos a;

       int encontrado;
   
   
    /**
     * Creates new form AltaCuentas
     */
    public AltaCuentas() {
        
        initComponents();
        
       txtNombre.setDocument(new ValidarMayusculas());
      txtCuenta.setDocument(new Limitetxt(txtCuenta, 5));
            txtNip.setDocument(new Limitetxt(txtNip, 5));
           txtModifica.setDocument(new Limitetxt(txtModifica,5));
       
        cuentas = new ArrayList();
        a=new Archivos();
        System.out.println("aqui entra");
        
        modelo.addColumn("No.Cuenta");
        modelo.addColumn("Nombre");
        modelo.addColumn("NIP");
        modelo.addColumn("Saldo Total");
        modelo.addColumn("Saldo Disponible");
        table.setModel(modelo);
        
    
        
         MostrarDatoEnTabla();
        
       
    }
public void MostrarDatoEnTabla(){
    
       
       cuentas = a.LeerArchivo();
       System.out.println("aqui va a impirmi en tabla");
        for (int cont = 0; cont < cuentas.size(); cont++) {
            Cuenta c = cuentas.get(cont);
            modelo.insertRow(cont, new Object[]{});
            modelo.setValueAt(c.getNumDeCuenta(), cont, 0);
            modelo.setValueAt(c.getNombre(), cont, 1);
            modelo.setValueAt(c.getPin(), cont, 2);
            modelo.setValueAt(c.getBalanceDisponible(), cont, 3);
            modelo.setValueAt(c.getBalanceTotal(), cont, 4);
        }


}

public void BorrarTabla(){
    
   System.out.println("aqui va a borrar la  tabla");
      modelo.setRowCount(0);
        
}
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblCuenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblnumcuenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        txtNip = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnBaja = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtModifica = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        lblseleccion = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1078, 299));
        setPreferredSize(new java.awt.Dimension(1078, 299));

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 153));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1078, 299));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1078, 299));

        lblCuenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCuenta.setText("DA DE ALTA UNA CUENTA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        lblnumcuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnumcuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblnumcuenta.setText("No. Cuenta");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Saldo");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });
        txtCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuentaFocusGained(evt);
            }
        });
        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaKeyTyped(evt);
            }
        });

        txtNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNipActionPerformed(evt);
            }
        });
        txtNip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNipFocusGained(evt);
            }
        });
        txtNip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNipKeyTyped(evt);
            }
        });

        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
        txtSaldo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSaldoFocusGained(evt);
            }
        });
        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });

        btnBaja.setText("Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        txtModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModificaActionPerformed(evt);
            }
        });
        txtModifica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModificaFocusGained(evt);
            }
        });
        txtModifica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModificaKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese No. de cuenta que ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("desea modificar");

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        lblseleccion.setForeground(new java.awt.Color(255, 255, 255));
        lblseleccion.setText("Selecciona a quien desea dar de baja");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblCuenta))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(btnAlta)
                                        .addGap(111, 111, 111)
                                        .addComponent(btnBaja)))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblnumcuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(txtModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifica)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblseleccion)
                .addGap(278, 278, 278))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCuenta)
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(lblnumcuenta)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsulta)
                        .addComponent(btnModifica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBaja)
                            .addComponent(btnAlta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblseleccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(lblCuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblnumcuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtSaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAlta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnModifica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtModifica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblseleccion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
BorrarTabla();
Modificar();    
MostrarDatoEnTabla();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
 Altas();
        
        
    }//GEN-LAST:event_btnAltaActionPerformed

    
    
    
   /* private void SLetras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
        public void keyTyped 
    });
    
    
    }*/
    
    
    public void Altas(){
           String vacio1=txtNombre.getText();
            String vacio2=txtCuenta.getText();
              String vacio3=txtNip.getText();
                             String vacio4=txtSaldo.getText();
                                 
     if( vacio1.length() < 1 || vacio2.length()<1 || vacio3.length()<1||vacio4.length()<1){
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Error de captura", JOptionPane.ERROR_MESSAGE);
        }else{
        boolean bandera=true;
        
       int numcuenta= Integer.parseInt(txtCuenta.getText());
       String nombre=txtNombre.getText();
       int nip=Integer.parseInt(txtNip.getText());
       double saldoTotal=Double.parseDouble(txtSaldo.getText());
       double saldoDisponible=saldoTotal; //+depositos
       
       Cuenta c = new Cuenta(numcuenta,nombre,nip,saldoTotal);
        //ArrayList<Materias> materias = 
       
            
        cuentas=a.LeerArchivo(); //LEO ERCHIVO
        
        if(cuentas.size()==0){
                    cuentas.add(c);
          a.EscribirArchivo(cuentas);
      JOptionPane.showMessageDialog(null, "¡Listo!");
        
        }else{
          for (int i = 0;  i < cuentas.size(); i++) {
            Cuenta c1 = cuentas.get(i);
            if (c1.getNumDeCuenta()!=numcuenta && c1.getPin()!=nip) {
           
                System.out.println("Recorriendo array.... NO SE HA ENCONTRARO 1 IGUAL");
                     bandera=true;
                     
            }else{
                System.out.println("SE ENCONTRO UNO IGUAL");
                bandera=false;
                break;
          }
          }
          
          
          if(bandera==true){
              
              for (int i = 0; i < cuentas.size(); i++) {
              cuentas.add(c);
         
                
                
                
        a.EscribirArchivo(cuentas);

        JOptionPane.showMessageDialog(null, "¡Listo!");
        break;
        }
        
              

              
               

            }else{
                    JOptionPane.showMessageDialog(null,"CUENTA O NIP YA EXISTE, NO SE PUDO DAR DE ALTA");
               bandera=false;
                
            }
          
          txtCuenta.setText("");
          txtNombre.setText("");
          txtNip.setText("");
          txtSaldo.setText("");
          
        }
       
        
    
        System.out.println("Aqui muestra en tabla");
     }
        
}
    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
CajeroPrincipal.caja = this.txtNombre;   
        
        
        
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaActionPerformed
      CajeroPrincipal.caja = this.txtCuenta;   
    }//GEN-LAST:event_txtCuentaActionPerformed

    private void txtNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNipActionPerformed
CajeroPrincipal.caja = this.txtNip;           // TODO add your handling code here:
    }//GEN-LAST:event_txtNipActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
CajeroPrincipal.caja = this.txtSaldo;           // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void txtModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificaActionPerformed
CajeroPrincipal.caja = this.txtModifica;     
// TODO add your handling code here:
    }//GEN-LAST:event_txtModificaActionPerformed

    private void txtCuentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuentaFocusGained
CajeroPrincipal.caja = this.txtCuenta;          // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaFocusGained

    private void txtNipFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNipFocusGained
     CajeroPrincipal.caja = this.txtNip;   // TODO add your handling code here:
    }//GEN-LAST:event_txtNipFocusGained

    private void txtSaldoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaldoFocusGained
CajeroPrincipal.caja = this.txtSaldo;        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoFocusGained

    private void txtModificaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModificaFocusGained
CajeroPrincipal.caja = this.txtNombre;   
// TODO add your handling code here:
    }//GEN-LAST:event_txtModificaFocusGained

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
 
        

// TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
 
      // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
char tecla;
      tecla=evt.getKeyChar();
   
      if(Character.isDigit(tecla)){
          evt.consume();
          getToolkit().beep();
      }          // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
            a.LeerArchivo();
        int seleccion = table.getSelectedRow();
        if (seleccion >= 0) {
            int x=JOptionPane.showConfirmDialog(this, "¿Seguro que desea dar de baja ?");
            if(x==JOptionPane.OK_OPTION){
            modelo.removeRow(seleccion);
            cuentas.remove(seleccion);
            }else{
            JOptionPane.showMessageDialog(this, "SELECCION CANCELADA");
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO SELECCIONO NADA");
        }
        a.EscribirArchivo(cuentas);       
        
        
        
    }//GEN-LAST:event_btnBajaActionPerformed

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
char tecla;
      tecla=evt.getKeyChar();
      
      if(Character.isLetter(tecla)){
          evt.consume();
          getToolkit().beep();
      }               // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void txtNipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNipKeyTyped
char tecla;
      tecla=evt.getKeyChar();
      
      if(Character.isLetter(tecla)){
          evt.consume();
          getToolkit().beep();
      }       
      // TODO add your handling code here:
    }//GEN-LAST:event_txtNipKeyTyped

    private void txtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoKeyTyped
char tecla;
      tecla=evt.getKeyChar();
      
      if(Character.isLetter(tecla)){
          evt.consume();
          getToolkit().beep();
      }       
      // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoKeyTyped

    private void txtModificaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificaKeyTyped
char tecla;
      tecla=evt.getKeyChar();
      
      if(Character.isLetter(tecla)){
          evt.consume();
          getToolkit().beep();
      }       
      // TODO add your handling code here:
    }//GEN-LAST:event_txtModificaKeyTyped

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        System.out.println("AQUI ENTRAS A CONSULTAR");
               System.out.println("numcuenta"+txtModifica.getText());
      
       String vacio=txtModifica.getText();
       
     if( vacio.length() < 1){
            JOptionPane.showMessageDialog(null, "Introduce un numero de cuenta", "Error de captura", JOptionPane.ERROR_MESSAGE);
        }else{
         
         int numcuenta=Integer.parseInt(txtModifica.getText());
               a.LeerArchivo();
        //LeerArchivos(personas);
        
                 
       Cuenta p;
       
       boolean bandera=true;
        for (int i = 0; i <cuentas.size(); i++) {
             Cuenta c = cuentas.get(i);
            if (c.getNumDeCuenta()!=numcuenta) {
           
                System.out.println("Recorriendo array.... NO SE HA ENCONTRARO 1 IGUAL");
                     bandera=true;
                     
            }else{
                System.out.println("SE ENCONTRO UNO IGUAL");
                bandera=false;
                break;
          }
          }
          
          
          if(bandera==false){
                for (int i = 0; i < cuentas.size(); i++) {
             p = cuentas.get(i);
            if (p.getNumDeCuenta()==numcuenta) {
                 txtNombre.setText(p.getNombre());
              txtCuenta.setText(Integer.toString(p.getNumDeCuenta())); 
               txtNip.setText(Integer.toString(p.getPin()));
               txtSaldo.setText(Double.toString(p.getBalanceTotal()));
              lblCuenta.setEnabled(false);
              txtCuenta.setEnabled(false);
               
               
               encontrado=i;
              
                   break;  
            }
                
                }    
          }else{
              JOptionPane.showMessageDialog(null, "NO EXISTE ESE ID");
          }
     }
    
          // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaActionPerformed

private void Modificar(){

     String vacio=txtModifica.getText();
       
     if( vacio.length() < 1){
            JOptionPane.showMessageDialog(null, "Introduce un numero de cuenta, después consulta y modifica", "Error de captura", JOptionPane.ERROR_MESSAGE);
        }else{
             int numcuenta=Integer.parseInt(txtCuenta.getText());
        String nuevonombre= txtNombre.getText();
        int nuevonip=Integer.parseInt(txtNip.getText());
        double nuevosaldo=Double.parseDouble(txtSaldo.getText());
        double nuevodisponible=nuevosaldo;//+ deposito
       
      Cuenta p=new Cuenta(numcuenta, nuevonombre,nuevonip,nuevosaldo);
        
        
        cuentas.set(encontrado, p);
       
        
        txtNombre.setText(nuevonombre);
        txtNip.setText(Integer.toString(nuevonip));
        txtSaldo.setText(Double.toString(nuevosaldo));
        //txtEdad.setText(Byte.toString(nuevaEdad));
        a.EscribirArchivo(cuentas);
        JOptionPane.showMessageDialog(null, "¡MODIFICADO!");
}
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnModifica;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblnumcuenta;
    private javax.swing.JLabel lblseleccion;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtModifica;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}