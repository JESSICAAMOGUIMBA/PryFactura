/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterface;
import  CapaNegocio.ClsTriangulo;
import CapaNegocio.ClsCuadrilatero;
public class WinKSegovia extends javax.swing.JFrame {

    /**
     * Creates new form WinKSegovia
     */
    public WinKSegovia() {
        initComponents();
    }
    int codigo,lad1,lad2,lad3,contador,cod;
    float largo,ancho;
    ClsTriangulo a;
    ClsCuadrilatero b;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnTipo = new javax.swing.JButton();
        BtnLados = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnArea = new javax.swing.JButton();
        BtnPerimetro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Correccion");
        setBackground(new java.awt.Color(0, 204, 51));

        BtnTipo.setBackground(new java.awt.Color(0, 0, 255));
        BtnTipo.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        BtnTipo.setForeground(new java.awt.Color(255, 0, 0));
        BtnTipo.setText("Tipo");
        BtnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTipoActionPerformed(evt);
            }
        });

        BtnLados.setBackground(new java.awt.Color(0, 0, 255));
        BtnLados.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        BtnLados.setForeground(new java.awt.Color(255, 0, 0));
        BtnLados.setText("Lados");
        BtnLados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLadosActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(0, 0, 255));
        BtnSalir.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 0, 0));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(0, 0, 255));
        BtnLimpiar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnArea.setBackground(new java.awt.Color(0, 0, 255));
        BtnArea.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        BtnArea.setForeground(new java.awt.Color(255, 0, 0));
        BtnArea.setText("Area");
        BtnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAreaActionPerformed(evt);
            }
        });

        BtnPerimetro.setBackground(new java.awt.Color(0, 0, 255));
        BtnPerimetro.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        BtnPerimetro.setForeground(new java.awt.Color(255, 0, 0));
        BtnPerimetro.setText("Perimetro");
        BtnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerimetroActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiipo: 1 triangulo, 2 cuadrilatero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnArea)
                                    .addComponent(BtnTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnLados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPerimetro)
                    .addComponent(BtnArea))
                .addGap(36, 36, 36)
                .addComponent(BtnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTipoActionPerformed
        codigo=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        cod=1;
        if(codigo==1){
            contador=1;
            BtnLados.setText("Lado 1");
        }
        if(codigo==2){
            contador=2;
            BtnLados.setText("Largo");
        }
        BtnTipo.setEnabled(false);
    }//GEN-LAST:event_BtnTipoActionPerformed

    private void BtnLadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLadosActionPerformed
        if(contador==1){
            switch(cod){
                case 1:
                    lad1=Integer.parseInt(TxtPantalla.getText());
                    TxtPantalla.setText(null);
                    TxtPantalla.requestFocus();
                    BtnLados.setText("Lado 2");
                    cod=2;
                break;    
                case 2:
                    lad2=Integer.parseInt(TxtPantalla.getText());
                    TxtPantalla.setText(null);
                    TxtPantalla.requestFocus();
                    BtnLados.setText("Lado 3");
                    cod=3;
                break;
                case 3:
                    lad3=Integer.parseInt(TxtPantalla.getText());
                    a=new ClsTriangulo(lad1,lad2,lad3);
                    TxtPantalla.setText(a.Tipo());
                    TxtPantalla.requestFocus();
                    BtnLados.setText("Lados");
                    BtnTipo.setEnabled(true);
                break;    
            }
        }
        if(contador==2){
            switch(cod){
                case 1:
                    largo=Float.parseFloat(TxtPantalla.getText());
                    TxtPantalla.setText(null);
                    TxtPantalla.requestFocus();
                    BtnLados.setText("Ancho");
                    cod=2;
                break;
                case 2:
                    ancho=Float.parseFloat(TxtPantalla.getText());
                    TxtPantalla.requestFocus();
                    b=new ClsCuadrilatero(largo,ancho);
                    TxtPantalla.setText(b.Tipo());
                    BtnLados.setText("Lados");
                 break;   
            }
        }
            
    }//GEN-LAST:event_BtnLadosActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
       TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
       BtnTipo.setEnabled(true);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAreaActionPerformed
        if(contador==1){
            TxtPantalla.setText(a.area()+"");
            TxtPantalla.requestFocus();
        }
        if(contador==2){
            TxtPantalla.setText(b.area()+"");
            TxtPantalla.requestFocus();
        }
    }//GEN-LAST:event_BtnAreaActionPerformed

    private void BtnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerimetroActionPerformed
        if(contador==1){
            TxtPantalla.setText(a.perimetro()+"");
            TxtPantalla.requestFocus();
        }
        if(contador==2){
            TxtPantalla.setText(b.perimetro()+"");
            TxtPantalla.requestFocus();
        }
    }//GEN-LAST:event_BtnPerimetroActionPerformed

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
            java.util.logging.Logger.getLogger(WinKSegovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinKSegovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinKSegovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinKSegovia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinKSegovia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnArea;
    private javax.swing.JButton BtnLados;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPerimetro;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTipo;
    private javax.swing.JTextField TxtPantalla;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
