/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Colecciones.ListaProducto;
import Colecciones.ListaTrabajador;
import Controlador.ControladorPanel;
import static Vista.frmLoginAdministrador.Lista;
import static Vista.frmLoginAdministrador.Listat;
import static Vista.frmLoginAdministrador.contra_admin;
import static Vista.frmLoginAdministrador.id_admin;
import javax.swing.JOptionPane;

/**
 *
 * @author Noxire
 */
public class frmLoginTrabajador extends javax.swing.JFrame {

    public static String id_admin="angel";
    public static  String contra_admin="123";
    public static ListaProducto Lista;
    public static ListaTrabajador Listat;
    public frmLoginTrabajador() {
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

        jPanel1 = new javax.swing.JPanel();
        passwor = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAccount2 = new javax.swing.JLabel();
        txtAccount3 = new javax.swing.JLabel();
        txtDialog = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        txtAccount = new javax.swing.JLabel();
        txtAccount1 = new javax.swing.JLabel();
        txtWelcome1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        post_font = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 88, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwor.setBorder(null);
        passwor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passworActionPerformed(evt);
            }
        });
        jPanel1.add(passwor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 405, 250, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ini_w.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 460, 290, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retro_w.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 40, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_w.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 53, -1, -1));

        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 345, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pass.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 412, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 352, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 40));

        txtAccount2.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        txtAccount2.setText("Contraseña");
        jPanel1.add(txtAccount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 20));

        txtAccount3.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        txtAccount3.setText("Usuario");
        jPanel1.add(txtAccount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        txtDialog.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        txtDialog.setForeground(new java.awt.Color(60, 63, 65));
        txtDialog.setText("Iniciar sesión con el Usuario y contraseña.");
        jPanel1.add(txtDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 290, 20));

        txtWelcome.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        txtWelcome.setText("¡Bienvenido!");
        jPanel1.add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, 20));

        txtAccount.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        txtAccount.setText("Usuario");
        jPanel1.add(txtAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        txtAccount1.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        txtAccount1.setText("Contraseña");
        jPanel1.add(txtAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 20));

        txtWelcome1.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        txtWelcome1.setText("VENDEDOR");
        jPanel1.add(txtWelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log_det_whi.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, -1));

        post_font.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        post_font.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Start menu.png"))); // NOI18N
        jPanel1.add(post_font, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Donut.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, 100));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Steak.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -50, 100, 100));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Breakfast.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 110, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pie.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 100, 100));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Baguette.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 380, 110, 90));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bread.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 100, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Banana Split.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 110, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Kimbab.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -30, 110, 110));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Croissant.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 110, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cheese cake.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 110, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Burrito.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 100, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ramen.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 110, 110));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Milk.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 100, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Funcionamiento del Boton Salir
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Funcionamiento del Boton Atras o Volver 
        frmLoginMinimarket loginM = new frmLoginMinimarket();
                    loginM.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtID.getText().equals(id_admin) && new String(passwor.getPassword()).equals(contra_admin)){
            frmProcesoVenta panelPV = new frmProcesoVenta();
            panelPV.setTitle("Proceso de Venta");
            panelPV.setVisible(true);
            panelPV.setLocationRelativeTo(null);
            Lista = new ListaProducto();
            Listat = new ListaTrabajador();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Introduzca valores correctos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passworActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passworActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passworActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new frmLoginTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwor;
    private javax.swing.JLabel post_font;
    private javax.swing.JLabel txtAccount;
    private javax.swing.JLabel txtAccount1;
    private javax.swing.JLabel txtAccount2;
    private javax.swing.JLabel txtAccount3;
    private javax.swing.JLabel txtDialog;
    public javax.swing.JTextField txtID;
    private javax.swing.JLabel txtWelcome;
    private javax.swing.JLabel txtWelcome1;
    // End of variables declaration//GEN-END:variables
}
