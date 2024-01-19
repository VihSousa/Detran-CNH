
package com.mycompany.cnh2;

import javax.swing.JOptionPane;

public class BemVindo6M extends javax.swing.JFrame {

    public BemVindo6M() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SolicitarCNH = new javax.swing.JButton();
        SegundaVia = new javax.swing.JButton();
        Renovação = new javax.swing.JButton();
        btsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Detran - BA");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Selecione A Opção Desejada:");

        SolicitarCNH.setBackground(new java.awt.Color(153, 153, 153));
        SolicitarCNH.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SolicitarCNH.setForeground(new java.awt.Color(255, 255, 255));
        SolicitarCNH.setText("Solicitar CNH");
        SolicitarCNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarCNHActionPerformed(evt);
            }
        });

        SegundaVia.setBackground(new java.awt.Color(153, 153, 153));
        SegundaVia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SegundaVia.setForeground(new java.awt.Color(255, 255, 255));
        SegundaVia.setText("Segunda Via");
        SegundaVia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundaViaActionPerformed(evt);
            }
        });

        Renovação.setBackground(new java.awt.Color(153, 153, 153));
        Renovação.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Renovação.setForeground(new java.awt.Color(255, 255, 255));
        Renovação.setText("Renovação");
        Renovação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenovaçãoActionPerformed(evt);
            }
        });

        btsair.setBackground(new java.awt.Color(204, 0, 0));
        btsair.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btsair.setForeground(new java.awt.Color(255, 255, 255));
        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SolicitarCNH)
                        .addGap(61, 61, 61)
                        .addComponent(SegundaVia)
                        .addGap(60, 60, 60)
                        .addComponent(Renovação)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsair)
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btsair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SolicitarCNH)
                    .addComponent(SegundaVia)
                    .addComponent(Renovação))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolicitarCNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarCNHActionPerformed
JOptionPane.showMessageDialog(null, "Aguarde 6 meses para realizar uma nova tentativa!");     
    }//GEN-LAST:event_SolicitarCNHActionPerformed

    private void RenovaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenovaçãoActionPerformed
      JOptionPane.showMessageDialog(null, "Opção não disponível!");
    }//GEN-LAST:event_RenovaçãoActionPerformed

    private void SegundaViaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundaViaActionPerformed
JOptionPane.showMessageDialog(null, "Opção não disponível!");      
    }//GEN-LAST:event_SegundaViaActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
       this.dispose();
    }//GEN-LAST:event_btsairActionPerformed

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
            java.util.logging.Logger.getLogger(BemVindo6M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BemVindo6M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BemVindo6M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BemVindo6M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BemVindo6M().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Renovação;
    private javax.swing.JButton SegundaVia;
    private javax.swing.JButton SolicitarCNH;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
