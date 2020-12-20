/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Chuy
 */
public class MenuEstructuras extends javax.swing.JFrame {

    /**
     * Creates new form MenuEstructuras
     */
    public MenuEstructuras() {
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

        jLabel1 = new javax.swing.JLabel();
        btnPIla = new javax.swing.JButton();
        btnCola = new javax.swing.JButton();
        btnListaEnlazada = new javax.swing.JButton();
        btnListaCircular = new javax.swing.JButton();
        btnListaCircDoble = new javax.swing.JButton();
        btnListaDoble = new javax.swing.JButton();
        btnArbol = new javax.swing.JButton();
        btnGrafo = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione la estrctura de datos");

        btnPIla.setText("Pila");
        btnPIla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIlaActionPerformed(evt);
            }
        });

        btnCola.setText("Cola");
        btnCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaActionPerformed(evt);
            }
        });

        btnListaEnlazada.setText("Lista enlazada");
        btnListaEnlazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEnlazadaActionPerformed(evt);
            }
        });

        btnListaCircular.setText("Lista circular");
        btnListaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaCircularActionPerformed(evt);
            }
        });

        btnListaCircDoble.setText("Lista circular doble");
        btnListaCircDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaCircDobleActionPerformed(evt);
            }
        });

        btnListaDoble.setText("Lista doble");
        btnListaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDobleActionPerformed(evt);
            }
        });

        btnArbol.setText("Arbol");

        btnGrafo.setText("Grafo");

        jButton9.setText("Regresar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrafo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPIla)
                            .addComponent(btnCola)
                            .addComponent(btnListaEnlazada)
                            .addComponent(btnListaCircular)
                            .addComponent(btnListaDoble)
                            .addComponent(btnListaCircDoble)
                            .addComponent(btnArbol)
                            .addComponent(jLabel1))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPIla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCola)
                        .addGap(4, 4, 4)
                        .addComponent(btnListaEnlazada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListaCircular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListaDoble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListaCircDoble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnArbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrafo)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnPIlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIlaActionPerformed
        new FormularioPila().setVisible(true);
    }//GEN-LAST:event_btnPIlaActionPerformed

    private void btnColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaActionPerformed
        new FormularioCola().setVisible(true);
    }//GEN-LAST:event_btnColaActionPerformed

    private void btnListaEnlazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEnlazadaActionPerformed
        new FormListaEnlazada().setVisible(true);
    }//GEN-LAST:event_btnListaEnlazadaActionPerformed

    private void btnListaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaCircularActionPerformed
        new FormularioListaCircular().setVisible(true);
    }//GEN-LAST:event_btnListaCircularActionPerformed

    private void btnListaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDobleActionPerformed
 new FormularioListaDoble().setVisible(true);        
    }//GEN-LAST:event_btnListaDobleActionPerformed

    private void btnListaCircDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaCircDobleActionPerformed
        new FormularioListaCircularDoble().setVisible(true);
    }//GEN-LAST:event_btnListaCircDobleActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEstructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEstructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEstructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEstructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEstructuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbol;
    private javax.swing.JButton btnCola;
    private javax.swing.JButton btnGrafo;
    private javax.swing.JButton btnListaCircDoble;
    private javax.swing.JButton btnListaCircular;
    private javax.swing.JButton btnListaDoble;
    private javax.swing.JButton btnListaEnlazada;
    private javax.swing.JButton btnPIla;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
