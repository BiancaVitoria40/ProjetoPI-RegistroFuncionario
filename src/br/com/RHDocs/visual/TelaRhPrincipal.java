package br.com.RHDocs.visual;

import br.com.ActionX.Controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author biads
 */
public class TelaRhPrincipal extends javax.swing.JFrame {
    
    static String tipoFunc = "Funcionario";
    
    public TelaRhPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogoRHDocs = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRecado = new javax.swing.JLabel();
        btnConsultaFuncionario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblCriarConta1 = new javax.swing.JLabel();
        btnSolicitacaoSenha = new javax.swing.JButton();
        btnSolicitacaoSenha1 = new javax.swing.JButton();
        btnSolicitacaoSenha2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        lblLogoRHDocs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/RHDocs/imagens/logoRHDocs.png"))); // NOI18N
        lblLogoRHDocs.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLogoRHDocs, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(lblLogoRHDocs, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblRecado.setForeground(new java.awt.Color(102, 102, 102));
        lblRecado.setText("Selecione sua opção");

        btnConsultaFuncionario.setBackground(new java.awt.Color(0, 0, 102));
        btnConsultaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaFuncionario.setText("Consultar Funcionário");
        btnConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaFuncionarioActionPerformed(evt);
            }
        });

        lblCriarConta1.setBackground(new java.awt.Color(0, 0, 0));
        lblCriarConta1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        lblCriarConta1.setForeground(new java.awt.Color(0, 0, 0));
        lblCriarConta1.setText("RhDocs");
        lblCriarConta1.setPreferredSize(new java.awt.Dimension(60, 16));

        btnSolicitacaoSenha.setBackground(new java.awt.Color(0, 0, 102));
        btnSolicitacaoSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitacaoSenha.setText("Solicitação Senha");
        btnSolicitacaoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoSenhaActionPerformed(evt);
            }
        });

        btnSolicitacaoSenha1.setBackground(new java.awt.Color(0, 0, 102));
        btnSolicitacaoSenha1.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitacaoSenha1.setText("Desativa Usuario");
        btnSolicitacaoSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoSenha1ActionPerformed(evt);
            }
        });

        btnSolicitacaoSenha2.setBackground(new java.awt.Color(0, 0, 102));
        btnSolicitacaoSenha2.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitacaoSenha2.setText("Voltar");
        btnSolicitacaoSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoSenha2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(214, 214, 214))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSolicitacaoSenha1)
                            .addComponent(lblRecado))
                        .addGap(35, 35, 35)
                        .addComponent(btnSolicitacaoSenha))
                    .addComponent(btnSolicitacaoSenha2))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnConsultaFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(193, Short.MAX_VALUE)
                    .addComponent(lblCriarConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(117, 117, 117)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblRecado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaFuncionario)
                    .addComponent(btnSolicitacaoSenha1)
                    .addComponent(btnSolicitacaoSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSolicitacaoSenha2)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(lblCriarConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(459, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(983, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaFuncionarioActionPerformed
        try {
            new TelaConsultaFuncionario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRhPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultaFuncionarioActionPerformed

    private void btnSolicitacaoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoSenhaActionPerformed
        try {
            new TelaExcluirSenha().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRhPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSolicitacaoSenhaActionPerformed

    private void btnSolicitacaoSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoSenha1ActionPerformed
        try {
            TelaDesativaLogin desativa = new TelaDesativaLogin();
            desativa.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRhPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSolicitacaoSenha1ActionPerformed

    private void btnSolicitacaoSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoSenha2ActionPerformed
        new TelaLogin().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnSolicitacaoSenha2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRhPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRhPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRhPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRhPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRhPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaFuncionario;
    private javax.swing.JButton btnSolicitacaoSenha;
    private javax.swing.JButton btnSolicitacaoSenha1;
    private javax.swing.JButton btnSolicitacaoSenha2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCriarConta1;
    private javax.swing.JLabel lblLogoRHDocs;
    private javax.swing.JLabel lblRecado;
    // End of variables declaration//GEN-END:variables
}
