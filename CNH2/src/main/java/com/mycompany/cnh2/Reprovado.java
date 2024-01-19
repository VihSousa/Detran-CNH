
package com.mycompany.cnh2;


public class Reprovado extends javax.swing.JFrame {

    public Reprovado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btsair2 = new javax.swing.JButton();
        btloser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reprovado");

        txtOi.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtOi.setForeground(new java.awt.Color(51, 51, 51));
        txtOi.setText("Infelizmente vc foi");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Reprovado");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btsair2.setBackground(new java.awt.Color(204, 0, 0));
        btsair2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btsair2.setForeground(new java.awt.Color(255, 255, 255));
        btsair2.setText("Sair");
        btsair2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btsair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsair2ActionPerformed(evt);
            }
        });

        btloser.setBackground(new java.awt.Color(51, 51, 51));
        btloser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btloser.setForeground(new java.awt.Color(255, 255, 255));
        btloser.setText("2° tentativa");
        btloser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btloser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btloser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsair2)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOi)
                            .addComponent(jLabel2))
                        .addContainerGap(210, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtOi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsair2)
                    .addComponent(btloser))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsair2ActionPerformed
        new BemVindoo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btsair2ActionPerformed

    private void btloserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloserActionPerformed

        new Provas().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btloserActionPerformed

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
            java.util.logging.Logger.getLogger(Reprovado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reprovado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reprovado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reprovado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reprovado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btloser;
    private javax.swing.JButton btsair2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtOi;
    // End of variables declaration//GEN-END:variables
}
