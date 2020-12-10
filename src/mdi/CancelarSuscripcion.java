package mdi;

import javax.swing.JOptionPane;
import tablas.Conexion;
import tablas.TablaEstudiante;
import tablas.TablaSuscripcion;


public class CancelarSuscripcion extends javax.swing.JInternalFrame {

    Conexion conex = new Conexion();
    TablaEstudiante tlbEst;
    TablaSuscripcion tlbSus;
    
    public CancelarSuscripcion() {
        initComponents();
        tlbSus=new TablaSuscripcion(conex);
    }
    
    public CancelarSuscripcion(String idEst) {
        initComponents();
        tlbSus = new TablaSuscripcion(conex, idEst);
        this.Cb_Area.setModel(tlbSus.listarArea());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cb_Area = new javax.swing.JComboBox<>();
        JT_CanId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cancelar suscripción ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Escriba su ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione el area:");

        Cb_Area.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cb_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_AreaActionPerformed(evt);
            }
        });

        JT_CanId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JT_CanId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_CanIdActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cancelar Suscripcion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cb_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_CanId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JT_CanId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cb_Area))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cb_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_AreaActionPerformed

    private void JT_CanIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_CanIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_CanIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
       int s = tlbSus.eliminarRegistro(JT_CanId.getText(), this.Cb_Area.getSelectedItem().toString());
        if(s!=0){
            JOptionPane.showMessageDialog(null,"Se ha eliminado su suscripcion a:  " + Cb_Area.getSelectedItem() ,"Suscripcion",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }else {
            JOptionPane.showMessageDialog(this, "Usuario Incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_Area;
    private javax.swing.JTextField JT_CanId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
