package br.com.RHDocs.visual;

import br.com.ActionX.Controller.DependenteController;
import br.com.ActionX.Negocio.Dependentes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author biads
 */
public class TelaDependente extends javax.swing.JFrame {

    /**
     * Creates new form TelaDependente
     */
    String origemG;
    int idG;
    public TelaDependente(int id, String origem) throws SQLException {
        initComponents();
        this.setDefaultCloseOperation(0);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        origemG = origem;
        idG = id;
        lblIDFunc.setVisible(false);
        lblIDFunc.setText(Integer.toString(id));
        
        if(origem == "Consulta"){
        DependenteController depCont = new DependenteController();
        Dependentes dp = new Dependentes();
        dp = depCont.BuscaDependentePorID(id);
        
        txtNomeDependente.setText(dp.getNome());
        txtEmailDependente.setText(dp.getEmail());
        txtTelefoneDependente.setText(dp.getTelefone());
        txtCertidaoDependente.setText(dp.getCertidao());
        txtGeneroDependente.setText(dp.getGenero());
        txtDataNascimentoDependente.setText(dp.getData_nascimento());
        txtCPFDependente.setText(dp.getCpf());
        txtTipoDependente.setText(dp.getTipo_dependente());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDependente = new javax.swing.JLabel();
        lblNomeDependente = new javax.swing.JLabel();
        txtNomeDependente = new javax.swing.JTextField();
        lblEmailDependente = new javax.swing.JLabel();
        txtEmailDependente = new javax.swing.JTextField();
        lblTelefoneDependente = new javax.swing.JLabel();
        txtTelefoneDependente = new javax.swing.JTextField();
        lblCertidaoDependente = new javax.swing.JLabel();
        txtCertidaoDependente = new javax.swing.JTextField();
        lblGeneroDependente = new javax.swing.JLabel();
        txtGeneroDependente = new javax.swing.JTextField();
        lblDataNascimentoDependente = new javax.swing.JLabel();
        txtDataNascimentoDependente = new javax.swing.JTextField();
        lblCPFDependente = new javax.swing.JLabel();
        txtCPFDependente = new javax.swing.JTextField();
        lblTipoDependente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTipoDependente = new javax.swing.JTextField();
        btnSalvarDependente = new javax.swing.JButton();
        btnVoltarDependente = new javax.swing.JButton();
        lblIDFunc = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblDependente.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblDependente.setText("Dependente");

        lblNomeDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeDependente.setText("Nome Completo");

        txtNomeDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblEmailDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailDependente.setText("E-mail");

        txtEmailDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblTelefoneDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefoneDependente.setText("Telefone (Com DDD)");

        txtTelefoneDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefoneDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblCertidaoDependente.setBackground(new java.awt.Color(204, 204, 204));
        lblCertidaoDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblCertidaoDependente.setText("Certidão de Nascimento/Estado Civil");

        txtCertidaoDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtCertidaoDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblGeneroDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblGeneroDependente.setText("Identidade de Gênero");

        txtGeneroDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtGeneroDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblDataNascimentoDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblDataNascimentoDependente.setText("Data de Nascimento");

        txtDataNascimentoDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNascimentoDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblCPFDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblCPFDependente.setText("CPF");

        txtCPFDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtCPFDependente.setForeground(new java.awt.Color(0, 0, 0));

        lblTipoDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoDependente.setText("Tipo de Dependente");

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Ex: Filho(a), Esposo(a)...");

        txtTipoDependente.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoDependente.setForeground(new java.awt.Color(0, 0, 0));

        btnSalvarDependente.setBackground(new java.awt.Color(0, 0, 153));
        btnSalvarDependente.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarDependente.setText("Salvar");
        btnSalvarDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDependenteActionPerformed(evt);
            }
        });

        btnVoltarDependente.setBackground(new java.awt.Color(0, 0, 153));
        btnVoltarDependente.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarDependente.setText("Voltar");
        btnVoltarDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDependenteActionPerformed(evt);
            }
        });

        lblIDFunc.setText("label1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(lblDependente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeneroDependente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTelefoneDependente)
                                    .addComponent(lblNomeDependente)
                                    .addComponent(txtNomeDependente)
                                    .addComponent(lblEmailDependente)
                                    .addComponent(txtEmailDependente, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtTelefoneDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCertidaoDependente)
                                    .addComponent(txtCertidaoDependente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDataNascimentoDependente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDataNascimentoDependente)
                                    .addComponent(lblCPFDependente)
                                    .addComponent(txtCPFDependente)
                                    .addComponent(txtTipoDependente)
                                    .addComponent(lblTipoDependente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtGeneroDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarDependente)
                .addGap(31, 31, 31)
                .addComponent(btnSalvarDependente)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDependente)
                    .addComponent(lblIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDependente)
                    .addComponent(lblDataNascimentoDependente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimentoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailDependente)
                    .addComponent(lblCPFDependente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneDependente)
                    .addComponent(lblTipoDependente)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblCertidaoDependente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCertidaoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblGeneroDependente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGeneroDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarDependente)
                    .addComponent(btnSalvarDependente))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(954, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDependenteActionPerformed
        Dependentes dep = new Dependentes();
        DependenteController depCont = new DependenteController();
        
        dep.setidFuncionario(Integer.parseInt(lblIDFunc.getText()));
        
        dep.setId_dependentes(idG);
        dep.setNome(txtNomeDependente.getText());
        dep.setEmail(txtEmailDependente.getText());
        dep.setTelefone(txtTelefoneDependente.getText());
        dep.setCertidao(txtCertidaoDependente.getText());
        dep.setGenero(txtGeneroDependente.getText());
        dep.setData_nascimento(txtDataNascimentoDependente.getText());
        dep.setCpf(txtCPFDependente.getText());
        dep.setTipo_dependente(txtTipoDependente.getText());
        
        if (origemG == "Criacao"){
        idG = depCont.InsereDependente(dep);
        JOptionPane.showMessageDialog(null, "Dependente criado com sucesso");
        origemG = "Consulta";
        }else if (origemG == "Consulta"){
            try {
                depCont.AtualizaDependente(dep);
                JOptionPane.showMessageDialog(null, "Dependente atualizado com sucesso");
            } catch (SQLException ex) {
                Logger.getLogger(TelaDependente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnSalvarDependenteActionPerformed

    private void btnVoltarDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDependenteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarDependenteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarDependente;
    private javax.swing.JButton btnVoltarDependente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPFDependente;
    private javax.swing.JLabel lblCertidaoDependente;
    private javax.swing.JLabel lblDataNascimentoDependente;
    private javax.swing.JLabel lblDependente;
    private javax.swing.JLabel lblEmailDependente;
    private javax.swing.JLabel lblGeneroDependente;
    private java.awt.Label lblIDFunc;
    private javax.swing.JLabel lblNomeDependente;
    private javax.swing.JLabel lblTelefoneDependente;
    private javax.swing.JLabel lblTipoDependente;
    private javax.swing.JTextField txtCPFDependente;
    private javax.swing.JTextField txtCertidaoDependente;
    private javax.swing.JTextField txtDataNascimentoDependente;
    private javax.swing.JTextField txtEmailDependente;
    private javax.swing.JTextField txtGeneroDependente;
    private javax.swing.JTextField txtNomeDependente;
    private javax.swing.JTextField txtTelefoneDependente;
    private javax.swing.JTextField txtTipoDependente;
    // End of variables declaration//GEN-END:variables
}
