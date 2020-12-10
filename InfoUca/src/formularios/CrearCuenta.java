package formularios;

import javax.swing.JOptionPane;
import tablas.Conexion;
import tablas.TablaEstudiante;
   
public class CrearCuenta extends javax.swing.JFrame{
   
    Conexion conex = new Conexion();
    TablaEstudiante tlbEst = new TablaEstudiante(conex);
   
   
    public CrearCuenta() {
        initComponents();
    }
    

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        JT_Id = new javax.swing.JTextField();
        JT_Nombres = new javax.swing.JTextField();
        JT_Apellidos = new javax.swing.JTextField();
        JT_Correo = new javax.swing.JTextField();
        JT_NumTel = new javax.swing.JTextField();
        JL_Id = new javax.swing.JLabel();
        JL_Nombre = new javax.swing.JLabel();
        JL_Apellidos = new javax.swing.JLabel();
        JL_Correo = new javax.swing.JLabel();
        JL_NumTel = new javax.swing.JLabel();
        B_Crear = new javax.swing.JButton();
        JL_Pass = new javax.swing.JLabel();
        JT_Pass = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CREAR CUENTA");

        JT_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_IdActionPerformed(evt);
            }
        });

        JT_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_NombresActionPerformed(evt);
            }
        });

        JT_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_ApellidosActionPerformed(evt);
            }
        });

        JT_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_CorreoActionPerformed(evt);
            }
        });

        JT_NumTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_NumTelActionPerformed(evt);
            }
        });

        JL_Id.setText("Ingrese su ID: ");

        JL_Nombre.setText("Nombres:");

        JL_Apellidos.setText("Apellidos:");

        JL_Correo.setText("correo:");

        JL_NumTel.setText("Número telefónico: ");

        B_Crear.setText("Crear cuenta");
        B_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CrearActionPerformed(evt);
            }
        });

        JL_Pass.setText("Contraseña: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JL_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(JT_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JL_Apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JL_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(JT_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL_Id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JT_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_NumTel)
                            .addComponent(JL_Pass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JT_NumTel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_Crear)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JT_Pass))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Nombre))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Apellidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Correo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_NumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_NumTel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Pass)
                    .addComponent(JT_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(B_Crear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_IdActionPerformed

    private void JT_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_NombresActionPerformed

    private void JT_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_ApellidosActionPerformed

    private void JT_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_CorreoActionPerformed

    private void JT_NumTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_NumTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_NumTelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CrearActionPerformed

        int b=tlbEst.agregarRegistro(JT_Id.getText(), JT_Nombres.getText(), JT_Apellidos.getText(), JT_Correo.getText(), JT_NumTel.getText(), JT_Pass.getText());
        if(b!=0){
            JOptionPane.showMessageDialog(null,"Registro guardado","Estudiante",0);
        }
        
    }//GEN-LAST:event_B_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Crear;
    private javax.swing.JLabel JL_Apellidos;
    private javax.swing.JLabel JL_Correo;
    private javax.swing.JLabel JL_Id;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_NumTel;
    private javax.swing.JLabel JL_Pass;
    private javax.swing.JTextField JT_Apellidos;
    private javax.swing.JTextField JT_Correo;
    private javax.swing.JTextField JT_Id;
    private javax.swing.JTextField JT_Nombres;
    private javax.swing.JTextField JT_NumTel;
    private javax.swing.JPasswordField JT_Pass;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
