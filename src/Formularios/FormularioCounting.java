/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Chuy
 */
public class FormularioCounting extends javax.swing.JFrame {

    int intercambios;
    int comparaciones;
    int[] arregloOriginal;
    int[] arregloAuxiliar;
    int[] arregloOrdenado;
    int valorMayor;
           
    /**
     * Creates new form FormularioCounting
     */
    public FormularioCounting() {
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
        btnArreglo1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnArreglo3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTamaño = new javax.swing.JTextField();
        txtMinimo = new javax.swing.JTextField();
        txtMaximo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnArreglo = new javax.swing.JButton();
        btnArreglo2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblArregloDesordenado = new javax.swing.JLabel();
        lblArregloOrdenado = new javax.swing.JLabel();
        lblArregloInvertido = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        jLabel1.setText("Tamaño");

        btnArreglo1.setText("Crear arreglo");
        btnArreglo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArreglo1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tamaño del arreglo");

        jLabel7.setText("Tamaño del arreglo");

        jLabel9.setText("Tamaño del arreglo");

        jLabel12.setText("Arreglo desordenado");

        jLabel14.setText(". . . . . . . .");

        btnArreglo3.setText("Crear arreglo");
        btnArreglo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArreglo3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Tamaño del arreglo");

        jLabel3.setText("Min");

        jLabel4.setText("Max");

        btnArreglo.setText("Crear arreglo");
        btnArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArregloActionPerformed(evt);
            }
        });

        btnArreglo2.setText("Crear arreglo aleatorio");
        btnArreglo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArreglo2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Arreglo desordenado");

        jLabel8.setText("Arreglo ordenado");

        jLabel10.setText("Arreglo invertido");

        jLabel11.setText("Tiempo elapsado");

        lblArregloDesordenado.setText(". . . . . . . .");

        lblArregloOrdenado.setText(". . . . . . . .");

        lblArregloInvertido.setText(". . . . . . . .");

        lblTiempo.setText(". . . . . . . .");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnArreglo2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnArreglo)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegresar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArregloDesordenado)
                            .addComponent(lblArregloOrdenado)
                            .addComponent(lblArregloInvertido)
                            .addComponent(lblTiempo))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnArreglo)
                        .addComponent(btnRegresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(btnArreglo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblArregloDesordenado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblArregloOrdenado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblArregloInvertido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblTiempo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArregloActionPerformed
        try
        {
            int tamaño = Integer.parseInt(txtTamaño.getText());
            int minimo = Integer.parseInt(txtMinimo.getText());
            int maximo = Integer.parseInt(txtTamaño.getText());
            if (tamaño <= 0)
            {
                JOptionPane.showMessageDialog(null,"El tamaño no puede ser menor o igual a 0");
                return;
            }
            if(maximo <= minimo)
            {
                JOptionPane.showMessageDialog(null, "El maximo no puede ser menor o igual que el minimo");
                return;
            }
            txtMaximo.setText("");
            txtMinimo.setText("");
            txtTamaño.setText("");
            intercambios = 0;
            comparaciones = 0;
            OrdenarArreglo(tamaño,minimo,maximo);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Introduzca datos validos");
        }
    }//GEN-LAST:event_btnArregloActionPerformed

     private String ImprimirArreglo(int[] arreglo){
        String numeros = "";
        if(arreglo.length != 0){
            for (int i = 0; i< arreglo.length;i++){
                numeros += arreglo[i] + ", ";
            }
        }
        return numeros;
    }
     
     public void OrdenarArreglo(int tamaño,int minimo, int maximo){
         arregloOriginal = new int[tamaño];
        long start = System.nanoTime();
            int random;
            for (int i = 0; i < arregloOriginal.length; i++)
            {
               random  = ThreadLocalRandom.current().nextInt(minimo,maximo + 1);
               arregloOriginal[i] = random;
            }
            lblArregloDesordenado.setText(ImprimirArreglo(arregloOriginal));
            
            for (int i = 0; i < arregloOriginal.length; i++)
            {
                if (arregloOriginal[i] > valorMayor)
                {
                    valorMayor = arregloOriginal[i];
                }
            }

            arregloAuxiliar = new int[valorMayor + 1];
            int posicion;
            for (int i = 0; i < arregloOriginal.length; i++)
            {
                posicion = arregloOriginal[i];
                arregloAuxiliar[posicion]++;
            }

            for (int i = 1; i < arregloAuxiliar.length; i++)
            {
                arregloAuxiliar[i] = arregloAuxiliar[i - 1] + arregloAuxiliar[i];
            }   

            for (int i = arregloAuxiliar.length - 1; i != 0; i--)
            {
                arregloAuxiliar[i] = arregloAuxiliar[i - 1];
            }
            arregloAuxiliar[0] = 0;

            arregloOrdenado = new int[arregloOriginal.length];
            int valor;  
            for (int i = 0; i < arregloOriginal.length; i++)
            {
                valor = arregloOriginal[i];
                posicion = arregloAuxiliar[valor];
                arregloOrdenado[posicion] = valor;
                arregloAuxiliar[valor]++;
            }
            long aaa;
            aaa = System.nanoTime();
            double tiempo = (aaa - start)/1000000.0;
            lblTiempo.setText(tiempo + "");
            lblArregloOrdenado.setText(ImprimirArreglo(arregloOrdenado));
            RevertirArreglo();
            lblArregloInvertido.setText(ImprimirArreglo(arregloOrdenado)); 
            
            
            
     }
   
    private void btnArreglo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArreglo1ActionPerformed

    }//GEN-LAST:event_btnArreglo1ActionPerformed

    private void btnArreglo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArreglo2ActionPerformed
    int tamaño = ThreadLocalRandom.current().nextInt(1,18 + 1);
    int minimo = ThreadLocalRandom.current().nextInt(0,50 + 1);
    int maximo = ThreadLocalRandom.current().nextInt(minimo, 100 + 1);
    comparaciones = 0;
    intercambios = 0;
    OrdenarArreglo(tamaño,minimo,maximo);
    }//GEN-LAST:event_btnArreglo2ActionPerformed

    private void btnArreglo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArreglo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArreglo3ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void RevertirArreglo(){
    for(int i=0; i<arregloOrdenado.length/2; i++){
  int temp = arregloOrdenado[i];
  arregloOrdenado[i] = arregloOrdenado[arregloOrdenado.length -i -1];
  arregloOrdenado[arregloOrdenado.length -i -1] = temp;
}
    }
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
            java.util.logging.Logger.getLogger(FormularioCounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCounting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArreglo;
    private javax.swing.JButton btnArreglo1;
    private javax.swing.JButton btnArreglo2;
    private javax.swing.JButton btnArreglo3;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblArregloDesordenado;
    private javax.swing.JLabel lblArregloInvertido;
    private javax.swing.JLabel lblArregloOrdenado;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtMinimo;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
