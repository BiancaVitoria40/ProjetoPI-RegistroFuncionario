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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author biads
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     * @param idLogin
     */
    public TelaCadastro(String idLogin) throws SQLException {
        
        initComponents();
        txtIdLogin.setVisible(false);
        txtIdLogin.setText(idLogin);
        lblIDFunc.setVisible(false);
        
        FuncionarioController funcCont = new FuncionarioController();
        Funcionario func = new Funcionario();
        func = funcCont.BuscaFuncionario(Integer.parseInt(idLogin));
        
        DocumentosController docCont = new DocumentosController();
        Documentos doc = new Documentos();
        doc = docCont.BuscaDocumentos(func.getIdFuncionario());
        
        DadosBancariosController dbCont = new DadosBancariosController();
        DadosBancarios db = new DadosBancarios();
        db = dbCont.BuscaDadosBancarios(func.getIdFuncionario());
        
        EnderecoController endCont = new EnderecoController();
        Enderecos end = new Enderecos();
        end = endCont.BuscaEndereco(func.getIdFuncionario());
        
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
        txtCep.setText(end.getCep());
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
        txtPis.setText(doc.getReservista());
        
        
        txtCodBanco.setText(db.getCod_banco());
        txtAgenciaBancoCadastro.setText(db.getAgencia());
        txtTipoConta.setText(db.getTipo_conta());
        txtContaBanco.setText(db.getConta());
        txtDigitoBancoCadastro.setText(db.getDigito());
              
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        lblNomeCadastro = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        lblEmailCadastro = new javax.swing.JLabel();
        txtEmailCadastro = new javax.swing.JTextField();
        lblTelefoneCadastro = new javax.swing.JLabel();
        txtTelefoneCadastro = new javax.swing.JTextField();
        lblDataNascimentoCadastro = new javax.swing.JLabel();
        txtDataNascimentoCadastro = new javax.swing.JTextField();
        lblGeneroCadastro = new javax.swing.JLabel();
        txtGeneroCadastro = new javax.swing.JTextField();
        lblRacaCadastro = new javax.swing.JLabel();
        txtRacaCadastro = new javax.swing.JTextField();
        lblEnderecoCadastro = new javax.swing.JLabel();
        txtEnderecoCadastro = new javax.swing.JTextField();
        lblNacionalidadeCadastro = new javax.swing.JLabel();
        txtNacionalidadeCadastro = new javax.swing.JTextField();
        lblEleitorCadastro = new javax.swing.JLabel();
        txtEleitorCadastro = new javax.swing.JTextField();
        txtCarteiraTrabalhoCadastro = new javax.swing.JTextField();
        lblCarteiraTrabalhoCadastro = new javax.swing.JLabel();
        lblCPFCadastro = new javax.swing.JLabel();
        txtCPFCadastro = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        lblAgenciaBancoCadastro = new javax.swing.JLabel();
        txtAgenciaBancoCadastro = new javax.swing.JTextField();
        lblContaBancoCadastro = new javax.swing.JLabel();
        txtTipoConta = new javax.swing.JTextField();
        lblDigitoBancoCadastro = new javax.swing.JLabel();
        txtDigitoBancoCadastro = new javax.swing.JTextField();
        lblDependenteCadastro = new javax.swing.JLabel();
        lblRecadoCadastro = new javax.swing.JLabel();
        btnDependente = new javax.swing.JButton();
        lblPensionistaCadastro = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnSalvarCadastro = new javax.swing.JButton();
        btnSairCadastro = new javax.swing.JButton();
        txtIdLogin = new java.awt.Label();
        lblDigitoBancoCadastro1 = new javax.swing.JLabel();
        txtContaBanco = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        lblRGCadastro = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        txtRGCadastro = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        lblCtNascimento = new javax.swing.JLabel();
        lblReservista = new javax.swing.JLabel();
        lblPis = new javax.swing.JLabel();
        txtCtNascimento = new javax.swing.JTextField();
        txtPis = new javax.swing.JTextField();
        txtCReservista = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCodBanco = new javax.swing.JLabel();
        txtCodBanco = new javax.swing.JTextField();
        lblIDFunc = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastro.setText("Cadastro");

        lblNomeCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCadastro.setText("Nome Completo");

        txtNomeCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCadastro.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastroActionPerformed(evt);
            }
        });

        lblEmailCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailCadastro.setText("E-mail");

        txtEmailCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblTelefoneCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefoneCadastro.setText(" Telefone (com o DDD)");

        txtTelefoneCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefoneCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblDataNascimentoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblDataNascimentoCadastro.setText("Data de Nascimento");

        txtDataNascimentoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNascimentoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblGeneroCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblGeneroCadastro.setText("Identidade de Gênero");

        txtGeneroCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtGeneroCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblRacaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblRacaCadastro.setText("Raça/Cor");

        txtRacaCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtRacaCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblEnderecoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEnderecoCadastro.setText("Endereço");

        txtEnderecoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtEnderecoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblNacionalidadeCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblNacionalidadeCadastro.setText("Nacionalidade");

        txtNacionalidadeCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtNacionalidadeCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblEleitorCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblEleitorCadastro.setText("Título de Eleitor");

        txtEleitorCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtEleitorCadastro.setForeground(new java.awt.Color(0, 0, 0));

        txtCarteiraTrabalhoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtCarteiraTrabalhoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        txtCarteiraTrabalhoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarteiraTrabalhoCadastroActionPerformed(evt);
            }
        });

        lblCarteiraTrabalhoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCarteiraTrabalhoCadastro.setText("Carteira de Trabalho");

        lblCPFCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCPFCadastro.setText("CPF");

        txtCPFCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtCPFCadastro.setForeground(new java.awt.Color(0, 0, 0));

        txtEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        txtEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));

        lblAgenciaBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblAgenciaBancoCadastro.setText("Agência - Banco");

        txtAgenciaBancoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtAgenciaBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblContaBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblContaBancoCadastro.setText("Tipo de conta - Banco");

        txtTipoConta.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoConta.setForeground(new java.awt.Color(0, 0, 0));

        lblDigitoBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblDigitoBancoCadastro.setText("Dígito da conta - Banco");

        txtDigitoBancoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtDigitoBancoCadastro.setForeground(new java.awt.Color(0, 0, 0));

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

        lblPensionistaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblPensionistaCadastro.setText("Você é pensionista ?");

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup3.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Sim");

        buttonGroup3.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Não");

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
        btnSairCadastro.setText("Sair");
        btnSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadastroActionPerformed(evt);
            }
        });

        txtIdLogin.setText("label1");

        lblDigitoBancoCadastro1.setForeground(new java.awt.Color(0, 0, 0));
        lblDigitoBancoCadastro1.setText("Conta - Banco");

        txtContaBanco.setBackground(new java.awt.Color(255, 255, 255));
        txtContaBanco.setForeground(new java.awt.Color(0, 0, 0));

        lblSerie.setBackground(new java.awt.Color(255, 255, 255));
        lblSerie.setForeground(new java.awt.Color(0, 0, 0));
        lblSerie.setText("Série - CTPS");

        txtSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtSerie.setForeground(new java.awt.Color(0, 0, 0));

        lblRGCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblRGCadastro.setText("RG");

        lblEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoCivil.setText("Estado Civil");

        txtRGCadastro.setBackground(new java.awt.Color(255, 255, 255));
        txtRGCadastro.setForeground(new java.awt.Color(0, 0, 0));

        lblUF.setBackground(new java.awt.Color(255, 255, 255));
        lblUF.setForeground(new java.awt.Color(0, 0, 0));
        lblUF.setText("UF");

        txtUF.setBackground(new java.awt.Color(255, 255, 255));
        txtUF.setForeground(new java.awt.Color(0, 0, 0));

        lblCtNascimento.setForeground(new java.awt.Color(0, 0, 0));
        lblCtNascimento.setText("Certidão de Nascimento");

        lblReservista.setForeground(new java.awt.Color(0, 0, 0));
        lblReservista.setText("Reservista ");

        lblPis.setForeground(new java.awt.Color(0, 0, 0));
        lblPis.setText("Pis");

        txtCtNascimento.setBackground(new java.awt.Color(255, 255, 255));
        txtCtNascimento.setForeground(new java.awt.Color(0, 0, 0));

        txtPis.setBackground(new java.awt.Color(255, 255, 255));
        txtPis.setForeground(new java.awt.Color(0, 0, 0));

        txtCReservista.setBackground(new java.awt.Color(255, 255, 255));
        txtCReservista.setForeground(new java.awt.Color(0, 0, 0));

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));

        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setText("Nº");

        txtCep.setBackground(new java.awt.Color(255, 255, 255));
        txtCep.setForeground(new java.awt.Color(0, 0, 0));

        lblCep.setForeground(new java.awt.Color(0, 0, 0));
        lblCep.setText("CEP");

        txtComplemento.setBackground(new java.awt.Color(255, 255, 255));
        txtComplemento.setForeground(new java.awt.Color(0, 0, 0));

        txtPais.setBackground(new java.awt.Color(255, 255, 255));
        txtPais.setForeground(new java.awt.Color(0, 0, 0));

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));

        lblBairro.setForeground(new java.awt.Color(0, 0, 0));
        lblBairro.setText("Bairro");

        lblCidade.setForeground(new java.awt.Color(0, 0, 0));
        lblCidade.setText("Cidade");

        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("UF");

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));

        lblPais.setForeground(new java.awt.Color(0, 0, 0));
        lblPais.setText("País");

        lblComplemento.setForeground(new java.awt.Color(0, 0, 0));
        lblComplemento.setText("Complemento");

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));

        lblCodBanco.setForeground(new java.awt.Color(0, 0, 0));
        lblCodBanco.setText("Codigo do Banco");

        txtCodBanco.setBackground(new java.awt.Color(255, 255, 255));
        txtCodBanco.setForeground(new java.awt.Color(0, 0, 0));

        lblIDFunc.setText("label1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReservista))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPensionistaCadastro)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(2, 2, 2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCadastro)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmailCadastro)
                                .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefoneCadastro)
                                .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEleitorCadastro)
                            .addComponent(txtEleitorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCtNascimento)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCarteiraTrabalhoCadastro)
                                    .addComponent(txtCarteiraTrabalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCep)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblSerie)
                                                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblUF)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEstado))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPais)
                                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lblComplemento))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPFCadastro))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRGCadastro)
                            .addComponent(txtRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstadoCivil)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnderecoCadastro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblGeneroCadastro)
                                            .addComponent(txtGeneroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addComponent(lblRacaCadastro))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(txtRacaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNumero)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(187, 187, 187)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBairro)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNacionalidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNacionalidadeCadastro))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDataNascimentoCadastro)
                                            .addComponent(txtDataNascimentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txtCodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodBanco)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAgenciaBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgenciaBancoCadastro))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContaBancoCadastro))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDigitoBancoCadastro1)
                                    .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDigitoBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDigitoBancoCadastro))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnDependente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRecadoCadastro)
                                .addGap(414, 414, 414)
                                .addComponent(btnSalvarCadastro)
                                .addGap(26, 26, 26)
                                .addComponent(btnSairCadastro))
                            .addComponent(lblNomeCadastro)
                            .addComponent(lblDependenteCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCadastro))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailCadastro)
                                    .addComponent(lblNomeCadastro))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelefoneCadastro)
                                .addGap(0, 0, 0)
                                .addComponent(txtTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGeneroCadastro)
                                    .addComponent(lblRacaCadastro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGeneroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRacaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNacionalidadeCadastro)
                                    .addComponent(lblDataNascimentoCadastro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNacionalidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataNascimentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnderecoCadastro)
                            .addComponent(lblNumero)
                            .addComponent(lblCep)
                            .addComponent(lblBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSerie)
                                    .addComponent(lblUF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblComplemento)
                                    .addComponent(lblCidade)
                                    .addComponent(lblEstado)
                                    .addComponent(lblPais))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEleitorCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCarteiraTrabalhoCadastro))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCarteiraTrabalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEleitorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblRGCadastro)
                                                .addComponent(lblEstadoCivil))
                                            .addComponent(lblCPFCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCtNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPensionistaCadastro)
                                    .addComponent(lblPis, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblReservista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCReservista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgenciaBancoCadastro)
                    .addComponent(lblContaBancoCadastro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDigitoBancoCadastro1)
                        .addComponent(lblDigitoBancoCadastro))
                    .addComponent(lblCodBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAgenciaBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDigitoBancoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addComponent(lblDependenteCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarCadastro)
                        .addComponent(btnSairCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRecadoCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnDependente)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(938, 715));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDependenteActionPerformed
        TelaDependente telaDeDependente = new TelaDependente(Integer.parseInt(lblIDFunc.getText()));
        telaDeDependente.setVisible(true);
    }//GEN-LAST:event_btnDependenteActionPerformed

    private void btnSairCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadastroActionPerformed
        // TODO add your handling code here:
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
        end.setCep(txtCep.getText());
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
        
        int id = funcCont.CadastrarFuncionario(func);
        end.setidFuncionario(id);
        endCont.InsereEndereco(end);
        doc.setIdFuncionario(id);
        docCont.CriaDocumentos(doc);
        db.setIdFuncionario(id);
        dbCont.InsereDadosBancarios(db);
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
    private javax.swing.JLabel lblPensionistaCadastro;
    private javax.swing.JLabel lblPis;
    private javax.swing.JLabel lblRGCadastro;
    private javax.swing.JLabel lblRacaCadastro;
    private javax.swing.JLabel lblRecadoCadastro;
    private javax.swing.JLabel lblReservista;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblTelefoneCadastro;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtAgenciaBancoCadastro;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPFCadastro;
    private javax.swing.JTextField txtCReservista;
    private javax.swing.JTextField txtCarteiraTrabalhoCadastro;
    private javax.swing.JTextField txtCep;
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
