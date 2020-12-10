package mdi;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Estudiante;
import tablas.TablaEstudiante;

public class InfoUca extends javax.swing.JFrame {
    
    public String EstudianteId;
    TablaEstudiante tlbEst;
    Estudiante est;
    
    public InfoUca() {
        initComponents();       
    }
    
    public InfoUca(String id) {
        initComponents();
        EstudianteId= id;      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPerfil = new javax.swing.JMenu();
        mCuenta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mSus = new javax.swing.JMenu();
        mNuevaSus = new javax.swing.JMenuItem();
        mCancelar = new javax.swing.JMenuItem();
        mAcerca = new javax.swing.JMenu();
        mDesarrolladores = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFO UCA");
        setBackground(new java.awt.Color(0, 153, 153));

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        mPerfil.setText("Perfil");

        mCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cuenta.png"))); // NOI18N
        mCuenta.setLabel("Mi cuenta");
        mCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCuentaActionPerformed(evt);
            }
        });
        mPerfil.add(mCuenta);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/administracion.png"))); // NOI18N
        jMenuItem1.setText("Admin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mPerfil.add(jMenuItem1);

        jMenuBar1.add(mPerfil);

        mSus.setText("Suscripciones");
        mSus.setMaximumSize(new java.awt.Dimension(90, 20));
        mSus.setMinimumSize(new java.awt.Dimension(90, 20));
        mSus.setPreferredSize(new java.awt.Dimension(90, 20));

        mNuevaSus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mas.png"))); // NOI18N
        mNuevaSus.setText("Nueva ");
        mNuevaSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevaSusActionPerformed(evt);
            }
        });
        mSus.add(mNuevaSus);

        mCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar (1).png"))); // NOI18N
        mCancelar.setText("Cancelar suscripcion");
        mCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCancelarActionPerformed(evt);
            }
        });
        mSus.add(mCancelar);

        jMenuBar1.add(mSus);

        mAcerca.setText("Acerca de...");

        mDesarrolladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/programacion.png"))); // NOI18N
        mDesarrolladores.setText("Desarrolladores");
        mDesarrolladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDesarrolladoresActionPerformed(evt);
            }
        });
        mAcerca.add(mDesarrolladores);

        jMenuBar1.add(mAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCancelarActionPerformed
        try {
            CancelarSuscripcion c = new CancelarSuscripcion(EstudianteId);
            this.add(c);
            c.setVisible(true);
            c.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InfoUca.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mCancelarActionPerformed

    private void mNuevaSusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevaSusActionPerformed
        try {
            NuevaSuscripcion n = new NuevaSuscripcion();
            this.add(n);
            n.setMaximum(true);
            n.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InfoUca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mNuevaSusActionPerformed

    private void mDesarrolladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDesarrolladoresActionPerformed
        // TODO add your handling code here:
        Acerca a = new Acerca();
        this.add(a);
        try {
            a.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InfoUca.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_mDesarrolladoresActionPerformed

    private void mCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCuentaActionPerformed
        try {
           
            MiCuenta mc = new MiCuenta( EstudianteId);
            
            this.add(mc);
            mc.setMaximum(true);
            mc.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_mCuentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Administrador adm = new Administrador();
        this.add(adm);
        try {
            adm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InfoUca.class.getName()).log(Level.SEVERE, null, ex);
        }
        adm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoUca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mAcerca;
    private javax.swing.JMenuItem mCancelar;
    private javax.swing.JMenuItem mCuenta;
    private javax.swing.JMenuItem mDesarrolladores;
    private javax.swing.JMenuItem mNuevaSus;
    private javax.swing.JMenu mPerfil;
    private javax.swing.JMenu mSus;
    // End of variables declaration//GEN-END:variables
}
