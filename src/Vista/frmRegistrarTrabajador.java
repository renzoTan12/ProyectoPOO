/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Noxire
 */
public class frmRegistrarTrabajador extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegistrarTrabajador
     */
    public frmRegistrarTrabajador() {
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

        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosTrabajador = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        cbxCargo = new javax.swing.JComboBox<>();
        cbxTurno = new javax.swing.JComboBox<>();
        btnEliminarT = new javax.swing.JButton();
        btnBuscarT = new javax.swing.JButton();
        btnEditarT = new javax.swing.JButton();

        setTitle("Registrar Trabajador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(102, 102, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, 50));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 170, 60));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELÉFONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 187, 170, 60));

        tblDatosTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatosTrabajador);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 25, 826, 360));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("DATOS TRABAJADOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 146, 30));

        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 170, 60));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));
        cbxCargo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        getContentPane().add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 60));

        cbxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));
        cbxTurno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TURNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        cbxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 251, 170, 60));

        btnEliminarT.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarT.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarT.setText("ELIMINAR");
        btnEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 150, 50));

        btnBuscarT.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscarT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarT.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarT.setText("BUSCAR");
        btnBuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 150, 50));

        btnEditarT.setBackground(new java.awt.Color(102, 102, 255));
        btnEditarT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarT.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarT.setText("EDITAR");
        btnEditarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarTActionPerformed

    private void btnBuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTActionPerformed

    private void btnEditarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarTActionPerformed

    private void cbxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTurnoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscarT;
    public javax.swing.JButton btnEditarT;
    public javax.swing.JButton btnEliminarT;
    public javax.swing.JComboBox<String> cbxCargo;
    public javax.swing.JComboBox<String> cbxTurno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDatosTrabajador;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
