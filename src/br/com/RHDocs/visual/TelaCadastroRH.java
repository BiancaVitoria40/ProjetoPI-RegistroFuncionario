package br.com.RHDocs.visual;

import br.com.ActionX.Controller.DadosBancariosController;
import br.com.ActionX.Controller.DocumentosController;
import br.com.ActionX.Controller.EnderecoController;
import br.com.ActionX.Controller.FuncionarioController;
import br.com.ActionX.Negocio.DadosBancarios;
import br.com.ActionX.Negocio.Documentos;
import br.com.ActionX.Negocio.Enderecos;
import br.com.ActionX.Negocio.Funcionario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author biads
 */
public class TelaCadastroRH extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     *
     * @param idLogin
     */
    String modo;
    int idFunc, idEnd, idDoc, idDB;

    public TelaCadastroRH(String idLogin) throws SQLException {

        initComponents();
        txtIdLogin.setVisible(false);
        txtIdLogin.setText(idLogin);
        lblIDFunc.setVisible(false);
        this.setDefaultCloseOperation(0);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        
        FuncionarioController funcCont = new FuncionarioController();
        Funcionario func = new Funcionario();
        func = funcCont.BuscaFuncionarioPorID(Integer.parseInt(idLogin));

        if (func != null) {
            idFunc = func.getIdFuncionario();
            modo = "Atualiza";
            DocumentosController docCont = new DocumentosController();
            Documentos doc = new Documentos();
            doc = docCont.BuscaDocumentos(func.getIdFuncionario());
            idDoc = doc.getId_documento();

            DadosBancariosController dbCont = new DadosBancariosController();
            DadosBancarios db = new DadosBancarios();
            db = dbCont.BuscaDadosBancarios(func.getIdFuncionario());
            idDB = db.getId_dadosBancarios();

            EnderecoController endCont = new EnderecoController();
            Enderecos end = new Enderecos();
            end = endCont.BuscaEndereco(func.getIdFuncionario());
            idEnd = end.getId_endereco();

            txtNomeCadastro.setText(func.getNome());
            txtEmailCadastro.setText(func.getEmail());
            txtTelefoneCadastro.setText(func.getEmail());
            txtDataNascimentoCadastro.setText(func.getDt_nascimento());
            txtGeneroCadastro.setText(func.getGenero());
            txtRacaCadastro.setText(func.getRaca());
            txtNacionalidadeCadastro.setText(func.getNacionalidade());
            txtEstadoCivil.setText(func.getEstado_civil());
            lblIDFunc.setText(Integer.toString(func.getIdFuncionario()));

            txtEnderecoCadastro.setText(end.getLogradouro());
            txtNumero.setText(end.getNumero());
            txtComplemento.setText(end.getComplemento());
            txtCEP.setText(end.getCep());
            txtBairro.setText(end.getBairro());
            txtCidade.setText(end.getCidade());
            txtEstado.setText(end.getEstado());
            txtPais.setText(end.getPais());

            txtRGCadastro.setText(doc.getRg());
            txtCPFCadastro.setText(doc.getCpf());
            txtEleitorCadastro.setText(doc.getTitulo_eleitor());
            txtCarteiraTrabalhoCadastro.setText(doc.getCtps());
            txtSerie.setText(doc.getSerie());
            txtUF.setText(doc.getUf());
            txtCtNascimento.setText(doc.getCertidao_nascimento());
            txtEstadoCivil.setText(doc.getCertidao_civil());
            txtCReservista.setText(doc.getReservista());
            txtPis.setText(doc.getPis());

            txtCodBanco.setText(db.getCod_banco());
            txtAgenciaBancoCadastro.setText(db.getAgencia());
            txtTipoConta.setText(db.getTipo_conta());
            txtContaBanco.setText(db.getConta());
            txtDigitoBancoCadastro.setText(db.getDigito());

        } else {
            Funcionario func2 = new Funcionario();
            Enderecos end = new Enderecos();
            EnderecoController endCont = new EnderecoController();
            Documentos doc = new Documentos();
            DocumentosController docCont = new DocumentosController();
            DadosBancarios db = new DadosBancarios();
            DadosBancariosController dbCont = new DadosBancariosController();

            func2.setIdLogin(Integer.parseInt(idLogin));
            idFunc = funcCont.CadastrarFuncionario(func2);
            end.setidFuncionario(idFunc);
            idEnd = endCont.InsereEndereco(end);
            doc.setIdFuncionario(idFunc);
            idDoc = docCont.CriaDocumentos(doc);
            db.setIdFuncionario(idFunc);
            idDB = dbCont.InsereDadosBancarios(db);

            modo = "Atualiza";
        }
    }

    TelaCadastroRH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblDependenteCadastro = new javax.swing.JLabel();
        lblRecadoCadastro = new javax.swing.JLabel();
        btnDependente = new javax.swing.JButton();
        btnSalvarCadastro = new javax.swing.JButton();
        btnSairCadastro = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        lblCadastro = new javax.swing.JLabel();
        lblNomeCadastro = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        lblEmailCadastro = new javax.swing.JLabel();
        txtEmailCadastro = new javax.swing.JTextField();
        lblGeneroCadastro = new javax.swing.JLabel();
        txtGeneroCadastro = new javax.swing.JTextField();
        lblRacaCadastro = new javax.swing.JLabel();
        txtRacaCadastro = new javax.swing.JTextField();
        lblNacionalidadeCadastro = new javax.swing.JLabel();
        txtNacionalidadeCadastro = new javax.swing.JTextField();
        lblDataNascimentoCadastro = new javax.swing.JLabel();
        txtDataNascimentoCadastro = new javax.swing.JTextField();
        txtIdLogin = new java.awt.Label();
        lblIDFunc = new java.awt.Label();
        lblTelefoneCadastro = new javax.swing.JLabel();
        txtTelefoneCadastro = new javax.swing.JTextField();
        panel2 = new java.awt.Panel();
        lblReservista = new javax.swing.JLabel();
        txtCtNascimento = new javax.swing.JTextField();
        txtCReservista = new javax.swing.JTextField();
        lblPis = new javax.swing.JLabel();
        txtPis = new javax.swing.JTextField();
        lblCtNascimento = new javax.swing.JLabel();
        lblEleitorCadastro = new javax.swing.JLabel();
        txtEleitorCadastro = new javax.swing.JTextField();
        lblCarteiraTrabalhoCadastro = new javax.swing.JLabel();
        txtCarteiraTrabalhoCadastro = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        lblCPFCadastro = new javax.swing.JLabel();
        txtCPFCadastro = new javax.swing.JTextField();
        lblRGCadastro = new javax.swing.JLabel();
        txtRGCadastro = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblEnderecoCadastro = new javax.swing.JLabel();
        txtEnderecoCadastro = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        panel3 = new java.awt.Panel();
        lblCodBanco = new javax.swing.JLabel();
        txtCodBanco = new javax.swing.JTextField();
        lblAgenciaBancoCadastro = new javax.swing.JLabel();
        txtAgenciaBancoCadastro = new javax.swing.JTextField();
        lblContaBancoCadastro = new javax.swing.JLabel();
        txtTipoConta = new javax.swing.JTextField();
        lblDigitoBancoCadastro1 = new javax.swing.JLabel();
        txtContaBanco = new javax.swing.JTextField();
        lblDigitoBancoCadastro = new javax.swing.JLabel();
        txtDigitoBancoCadastro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblDependenteCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDependenteCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblDependenteCadastro.setText("Deseja cadastrar dependente ?");

        lblRecadoCadastro.setForeground(new java.awt.Color(102, 102, 102));
        lblRecadoCadastro.setText("Se sim, aperte o botão abaixo");

        btnDependente.setBackground(new java.awt.Color(0, 0, 153));
        btnDependente.setForeground(new java.awt.Color(255, 255, 255));
        btnDependente.setText("Dependente");
        btnDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDependenteActionPerformed(evt);
            }
        });

        btnSalvarCadastro.setBackground(new java.awt.Color(0, 0, 204));
        btnSalvarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarCadastro.setText("Salvar");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnSairCadastro.setBackground(new java.awt.Color(0, 0, 204));
        btnSairCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnSairCadastro.setText("Voltar");
        btnSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadastroActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 102, 153));

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastro.setText("Cadastro");

        lblNomeCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCadastro.setText("Nome Completo");

        txtNomeCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCadastro.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastroActionPerformed(evt);
            }
        });

        lblEmailCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmailCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailCadastro.setText("E-mail");

        txtEmailCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblGeneroCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGeneroCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblGeneroCadastro.setText("Identidade de Gênero");

        txtGeneroCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtGeneroCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblRacaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRacaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblRacaCadastro.setText("Raça/Cor");

        txtRacaCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtRacaCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblNacionalidadeCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacionalidadeCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblNacionalidadeCadastro.setText("Nacionalidade");

        txtNacionalidadeCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtNacionalidadeCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblDataNascimentoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataNascimentoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblDataNascimentoCadastro.setText("Data de Nascimento");

        txtDataNascimentoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNascimentoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        txtIdLogin.setText("label1");

        lblIDFunc.setText("label1");

        lblTelefoneCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefoneCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefoneCadastro.setText(" Telefone (com o DDD)");

        txtTelefoneCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefoneCadastro.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNomeCadastro)
                                .addGap(282, 282, 282)
                                .addComponent(lblEmailCadastro))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(357, 357, 357)
                                .addComponent(lblCadastro))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefoneCadastro)
                                .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGeneroCadastro)
                                    .addComponent(txtGeneroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(lblRacaCadastro))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(txtRacaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionalidadeCadastro))
                        .addGap(47, 47, 47)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataNascimentoCadastro)
                            .addComponent(txtDataNascimentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(lblCadastro)
                        .addGap(13, 13, 13)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailCadastro)
                            .addComponent(lblNomeCadastro))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(txtIdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblTelefoneCadastro)
                        .addGap(0, 0, 0)
                        .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGeneroCadastro)
                            .addComponent(lblRacaCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGeneroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRacaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNacionalidadeCadastro)
                            .addComponent(lblDataNascimentoCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNacionalidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataNascimentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panel2.setBackground(new java.awt.Color(0, 102, 153));

        lblReservista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblReservista.setForeground(new java.awt.Color(0, 0, 0));
        lblReservista.setText("Reservista ");

        txtCtNascimento.setBackground(new java.awt.Color(255, 255, 255));
        txtCtNascimento.setForeground(new java.awt.Color(0, 0, 0));

        txtCReservista.setBackground(new java.awt.Color(255, 255, 255));
        txtCReservista.setForeground(new java.awt.Color(0, 0, 0));

        lblPis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPis.setForeground(new java.awt.Color(0, 0, 0));
        lblPis.setText("Pis");

        txtPis.setBackground(new java.awt.Color(255, 255, 255));
        txtPis.setForeground(new java.awt.Color(0, 0, 0));

        lblCtNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCtNascimento.setForeground(new java.awt.Color(0, 0, 0));
        lblCtNascimento.setText("Certidão de Nascimento");

        lblEleitorCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEleitorCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEleitorCadastro.setText("Título de Eleitor");

        txtEleitorCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtEleitorCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblCarteiraTrabalhoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCarteiraTrabalhoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCarteiraTrabalhoCadastro.setText("Carteira de Trabalho");

        txtCarteiraTrabalhoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtCarteiraTrabalhoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        txtCarteiraTrabalhoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarteiraTrabalhoCadastroActionPerformed(evt);
            }
        });

        lblSerie.setBackground(new java.awt.Color(255, 255, 255));
        lblSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(0, 0, 0));
        lblSerie.setText("Série - CTPS");

        txtSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtSerie.setForeground(new java.awt.Color(0, 0, 0));

        lblUF.setBackground(new java.awt.Color(255, 255, 255));
        lblUF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUF.setForeground(new java.awt.Color(0, 0, 0));
        lblUF.setText("UF");

        txtUF.setBackground(new java.awt.Color(255, 255, 255));
        txtUF.setForeground(new java.awt.Color(0, 0, 0));

        lblCPFCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPFCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCPFCadastro.setText("CPF");

        txtCPFCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtCPFCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblRGCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRGCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblRGCadastro.setText("RG");

        txtRGCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtRGCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblEstadoCivil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoCivil.setText("Estado Civil");

        txtEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        txtEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCtNascimento))
                        .addGap(52, 52, 52)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReservista)
                            .addComponent(txtCReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEleitorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleitorCadastro)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarteiraTrabalhoCadastro)
                            .addComponent(txtCarteiraTrabalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSerie)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF))
                        .addGap(35, 35, 35)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPFCadastro))
                        .addGap(34, 34, 34)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRGCadastro)
                            .addComponent(txtRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstadoCivil)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservista)
                    .addComponent(lblPis, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCtNascimento)
                    .addComponent(lblEleitorCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCReservista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEleitorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lblCarteiraTrabalhoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarteiraTrabalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSerie)
                                .addComponent(lblUF))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRGCadastro)
                                    .addComponent(lblEstadoCivil))
                                .addComponent(lblCPFCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblEnderecoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEnderecoCadastro.setText("Endereço");

        txtEnderecoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtEnderecoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblComplemento.setForeground(new java.awt.Color(0, 0, 0));
        lblComplemento.setText("Complemento");

        txtComplemento.setBackground(new java.awt.Color(255, 255, 255));
        txtComplemento.setForeground(new java.awt.Color(0, 0, 0));

        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("UF");

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));

        lblPais.setForeground(new java.awt.Color(0, 0, 0));
        lblPais.setText("País");

        txtPais.setBackground(new java.awt.Color(255, 255, 255));
        txtPais.setForeground(new java.awt.Color(0, 0, 0));

        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setText("Nº");

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));

        lblCidade.setForeground(new java.awt.Color(0, 0, 0));
        lblCidade.setText("Cidade");

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));

        lblBairro.setForeground(new java.awt.Color(0, 0, 0));
        lblBairro.setText("Bairro");

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));

        lblCep.setForeground(new java.awt.Color(0, 0, 0));
        lblCep.setText("CEP");

        txtCEP.setBackground(new java.awt.Color(255, 255, 255));
        txtCEP.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplemento))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstado)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addGap(146, 146, 146)
                                .addComponent(lblPais))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEnderecoCadastro)
                        .addGap(244, 244, 244)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCep))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEnderecoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumero)
                                .addComponent(lblCep, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(lblBairro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComplemento)
                            .addComponent(lblEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCidade)
                            .addComponent(lblPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );

        panel3.setBackground(new java.awt.Color(204, 204, 204));

        lblCodBanco.setForeground(new java.awt.Color(0, 0, 0));
        lblCodBanco.setText("Codigo do Banco");

        txtCodBanco.setBackground(new java.awt.Color(255, 255, 255));
        txtCodBanco.setForeground(new java.awt.Color(0, 0, 0));

        lblAgenciaBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblAgenciaBancoCadastro.setText("Agência - Banco");

        txtAgenciaBancoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtAgenciaBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblContaBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblContaBancoCadastro.setText("Tipo de conta - Banco");

        txtTipoConta.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoConta.setForeground(new java.awt.Color(0, 0, 0));

        lblDigitoBancoCadastro1.setForeground(new java.awt.Color(0, 0, 0));
        lblDigitoBancoCadastro1.setText("Conta - Banco");

        txtContaBanco.setBackground(new java.awt.Color(255, 255, 255));
        txtContaBanco.setForeground(new java.awt.Color(0, 0, 0));

        lblDigitoBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblDigitoBancoCadastro.setText("Dígito da conta - Banco");

        txtDigitoBancoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtDigitoBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(txtCodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txtDigitoBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAgenciaBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblCodBanco)
                                .addGap(48, 48, 48)
                                .addComponent(lblAgenciaBancoCadastro)))
                        .addGap(59, 59, 59)
                        .addComponent(lblContaBancoCadastro)
                        .addGap(72, 72, 72)
                        .addComponent(lblDigitoBancoCadastro1)
                        .addGap(126, 126, 126)
                        .addComponent(lblDigitoBancoCadastro)
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodBanco)
                    .addComponent(lblAgenciaBancoCadastro)
                    .addComponent(lblContaBancoCadastro)
                    .addComponent(lblDigitoBancoCadastro1)
                    .addComponent(lblDigitoBancoCadastro))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgenciaBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDigitoBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDependenteCadastro)
                    .addComponent(lblRecadoCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnSairCadastro)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnDependente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDependenteCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecadoCadastro)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnSairCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDependente)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(866, 921));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDependenteActionPerformed
        try {
            TelaConsultaDependente telaDeCunsultaDependente = new TelaConsultaDependente(idFunc);
            telaDeCunsultaDependente.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroRH.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnDependenteActionPerformed

    private void btnSairCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadastroActionPerformed
            this.dispose();
        

    }//GEN-LAST:event_btnSairCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed

        Funcionario func = new Funcionario();
        FuncionarioController funcCont = new FuncionarioController();
        Enderecos end = new Enderecos();
        EnderecoController endCont = new EnderecoController();
        Documentos doc = new Documentos();
        DocumentosController docCont = new DocumentosController();
        DadosBancarios db = new DadosBancarios();
        DadosBancariosController dbCont = new DadosBancariosController();

        func.setIdLogin(Integer.parseInt(txtIdLogin.getText()));
        func.setNome(txtNomeCadastro.getText());
        func.setEmail(txtEmailCadastro.getText());
        func.setTelefone(txtTelefoneCadastro.getText());
        func.setDt_nascimento(txtDataNascimentoCadastro.getText());
        func.setGenero(txtGeneroCadastro.getText());
        func.setRaca(txtRacaCadastro.getText());
        func.setNacionalidade(txtNacionalidadeCadastro.getText());
        func.setEstado_civil(txtEstadoCivil.getText());

        end.setLogradouro(txtEnderecoCadastro.getText());
        end.setNumero(txtNumero.getText());
        end.setComplemento(txtComplemento.getText());
        end.setCep(txtCEP.getText());
        end.setBairro(txtBairro.getText());
        end.setCidade(txtCidade.getText());
        end.setEstado(txtEstado.getText());
        end.setPais(txtPais.getText());

        doc.setRg(txtRGCadastro.getText());
        doc.setCpf(txtCPFCadastro.getText());
        doc.setTitulo_eleitor(txtEleitorCadastro.getText());
        doc.setCtps(txtCarteiraTrabalhoCadastro.getText());
        doc.setSerie(txtSerie.getText());
        doc.setUf(txtUF.getText());
        doc.setCertidao_nascimento(txtCtNascimento.getText());
        doc.setCertidao_civil(txtEstadoCivil.getText());
        doc.setReservista(txtCReservista.getText());
        doc.setPis(txtPis.getText());

        db.setCod_banco(txtCodBanco.getText());
        db.setAgencia(txtAgenciaBancoCadastro.getText());
        db.setTipo_conta(txtTipoConta.getText());
        db.setConta(txtContaBanco.getText());
        db.setDigito(txtDigitoBancoCadastro.getText());

        if (modo == "Insere") {
            int id = funcCont.CadastrarFuncionario(func);
            end.setidFuncionario(id);
            endCont.InsereEndereco(end);
            doc.setIdFuncionario(id);
            docCont.CriaDocumentos(doc);
            db.setIdFuncionario(id);
            dbCont.InsereDadosBancarios(db);

            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        } else if (modo == "Atualiza") {
            try {
                func.setIdFuncionario(idFunc);
                funcCont.AtualizaFuncionario(func);

                end.setidFuncionario(idFunc);
                end.setId_endereco(idEnd);
                endCont.AtualizaEnderecos(end);

                doc.setIdFuncionario(idFunc);
                doc.setId_documento(idDoc);
                docCont.AtualizaDocumentos(doc);

                db.setIdFuncionario(idFunc);
                db.setId_dadosBancarios(idDB);
                dbCont.AtualizaDadosBancarios(db);

                JOptionPane.showMessageDialog(null, "Cadastro atualizados com sucesso!");
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroRH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void txtNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadastroActionPerformed

    private void txtCarteiraTrabalhoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarteiraTrabalhoCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarteiraTrabalhoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDependente;
    private javax.swing.JButton btnSairCadastro;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAgenciaBancoCadastro;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPFCadastro;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCarteiraTrabalhoCadastro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodBanco;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblContaBancoCadastro;
    private javax.swing.JLabel lblCtNascimento;
    private javax.swing.JLabel lblDataNascimentoCadastro;
    private javax.swing.JLabel lblDependenteCadastro;
    private javax.swing.JLabel lblDigitoBancoCadastro;
    private javax.swing.JLabel lblDigitoBancoCadastro1;
    private javax.swing.JLabel lblEleitorCadastro;
    private javax.swing.JLabel lblEmailCadastro;
    private javax.swing.JLabel lblEnderecoCadastro;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblGeneroCadastro;
    private java.awt.Label lblIDFunc;
    private javax.swing.JLabel lblNacionalidadeCadastro;
    private javax.swing.JLabel lblNomeCadastro;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPis;
    private javax.swing.JLabel lblRGCadastro;
    private javax.swing.JLabel lblRacaCadastro;
    private javax.swing.JLabel lblRecadoCadastro;
    private javax.swing.JLabel lblReservista;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblTelefoneCadastro;
    private javax.swing.JLabel lblUF;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JTextField txtAgenciaBancoCadastro;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPFCadastro;
    private javax.swing.JTextField txtCReservista;
    private javax.swing.JTextField txtCarteiraTrabalhoCadastro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodBanco;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtContaBanco;
    private javax.swing.JTextField txtCtNascimento;
    private javax.swing.JTextField txtDataNascimentoCadastro;
    private javax.swing.JTextField txtDigitoBancoCadastro;
    private javax.swing.JTextField txtEleitorCadastro;
    private javax.swing.JTextField txtEmailCadastro;
    private javax.swing.JTextField txtEnderecoCadastro;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtGeneroCadastro;
    private java.awt.Label txtIdLogin;
    private javax.swing.JTextField txtNacionalidadeCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPis;
    private javax.swing.JTextField txtRGCadastro;
    private javax.swing.JTextField txtRacaCadastro;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTelefoneCadastro;
    private javax.swing.JTextField txtTipoConta;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
