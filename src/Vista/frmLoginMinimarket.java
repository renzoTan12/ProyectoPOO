/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Noxire
 */
public final class frmLoginMinimarket extends javax.swing.JFrame {

    /**
     * Creates new form FORMULARIO
     */
    public frmLoginMinimarket() {
        initComponents();
        transparent();
        this.setLocationRelativeTo(null);
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
        btnLoginAdministrador = new javax.swing.JButton();
        btnLoginTrabajador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniMarket");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INI_ADM.png"))); // NOI18N
        btnLoginAdministrador.setBorder(null);
        btnLoginAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 290, 50));

        btnLoginTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INI_TRA.png"))); // NOI18N
        btnLoginTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginTrabajadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 290, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/log_.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 240, 290));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoInicio.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparent(){
        btnLoginAdministrador.setOpaque(false);
        btnLoginAdministrador.setContentAreaFilled(false);
        btnLoginAdministrador.setBorderPainted(false);
        btnLoginTrabajador.setOpaque(false);
        btnLoginTrabajador.setContentAreaFilled(false);
        btnLoginTrabajador.setBorderPainted(false);
    }
    private void btnLoginAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdministradorActionPerformed
        //Funcionamiento del boton Adminitrador
        frmLoginAdministrador loginA = new frmLoginAdministrador();
                    loginA.setVisible(true);
                    this.dispose();
    
    }//GEN-LAST:event_btnLoginAdministradorActionPerformed

    private void btnLoginTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginTrabajadorActionPerformed
        //Funcionamiento del boton Vendedor
        frmLoginTrabajador loginV = new frmLoginTrabajador();
                    loginV.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_btnLoginTrabajadorActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginMinimarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginMinimarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginMinimarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginMinimarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginMinimarket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAdministrador;
    private javax.swing.JButton btnLoginTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}