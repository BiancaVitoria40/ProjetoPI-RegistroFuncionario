package br.com.RHDocs.visual;

import br.com.ActionX.Conexao.DependentesDAO;
import br.com.ActionX.Conexao.FuncionariosDAO;
import br.com.ActionX.Controller.DependenteController;
import br.com.ActionX.Negocio.Dependentes;
import br.com.ActionX.Negocio.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author biads
 */
public class TelaConsultaDependente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalRH
     */
    DefaultTableModel model;
    int idG;
    public TelaConsultaDependente(int id) throws SQLException {
        initComponents();
        idG = id;
        model = (DefaultTableModel) tbDep.getModel();
        this.setDefaultCloseOperation(0);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        
        DependenteController dep = new DependenteController();
        List<Dependentes> listaDeDependentes = new ArrayList<>();
        listaDeDependentes = dep.BuscaDependentePorIDFuncionario(id);

        for (Dependentes d : listaDeDependentes) {
            model.insertRow(model.getRowCount(), new Object[]{
                d.getId_dependentes(),
                d.getNome(),
                d.getEmail(),
                d.getTelefone()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCadDependente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDep = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Consultar Dependente");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Consulta por nome");

        txtBuscaNome.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaNome.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCadDependente.setBackground(new java.awt.Color(0, 0, 153));
        btnCadDependente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadDependente.setText("Cadastrar Dependente");
        btnCadDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDependenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadDependente)))))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnCadDependente))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tbDep.setBackground(new java.awt.Color(102, 102, 102));
        tbDep.setForeground(new java.awt.Color(255, 255, 255));
        tbDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDep);

        btnSair.setBackground(new java.awt.Color(0, 0, 153));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(933, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            model = (DefaultTableModel) tbDep.getModel();
            model.setRowCount(0);
            List<Dependentes> listaDeDependentes = new ArrayList<>();
            DependentesDAO dDAO = new DependentesDAO();
            listaDeDependentes = dDAO.buscaDependentePorIDFuncionario(idG);

            for (Dependentes f : listaDeDependentes) {
                model.insertRow(model.getRowCount(), new Object[]{
                    f.getId_dependentes(),
                    f.getNome(),
                    f.getEmail(),
                    f.getTelefone()
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaDependente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

            this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void tbDepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepMouseClicked
        try {
            int column = 0;
            int row = tbDep.getSelectedRow();
            String id = tbDep.getModel().getValueAt(row, column).toString();
            DependenteController depCont = new DependenteController();
            Dependentes dep  = new Dependentes();
            dep = depCont.BuscaDependentePorID(Integer.parseInt(id));

            TelaDependente telaDeCadastro = new TelaDependente(dep.getId_dependentes(), "Consulta");
            telaDeCadastro.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaDependente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbDepMouseClicked

    private void btnCadDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDependenteActionPerformed
        try {
            new TelaDependente(idG, "Criacao").setVisible(true);        
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaDependente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadDependenteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadDependente;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDep;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
