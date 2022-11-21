package br.com.ActionX.Negocio;


public class Funcionario {
    
    private int idFuncionario;
    private int idLogin;
    private String nome;
    private String email;
    private String telefone;
    private String genero;
    private String raca;
    private String dt_nascimento;
    private String nacionalidade;
    private String estado_civil;
    private String dt_criacao;
    private String dt_atualizacao;
    private int qtd_dependente;
    private int qtd_pensionista;
    private String status;    
    
    public Funcionario(){
        
    }

    public Funcionario(int idFuncionario, int idLogin, String nome, String email, String telefone, String genero, String raca, String dt_nascimento, String nacionalidade, String estado_civil, String dt_criacao, String dt_atualizacao, int qtd_dependente, int qtd_pensionista, String status) {
        this.idFuncionario = idFuncionario;
        this.idLogin = idLogin;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.raca = raca;
        this.dt_nascimento = dt_nascimento;
        this.nacionalidade = nacionalidade;
        this.estado_civil = estado_civil;
        this.dt_criacao = dt_criacao;
        this.dt_atualizacao = dt_atualizacao;
        this.qtd_dependente = qtd_dependente;
        this.qtd_pensionista = qtd_pensionista;
        this.status = status;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getDt_atualizacao() {
        return dt_atualizacao;
    }

    public void setDt_atualizacao(String dt_atualizacao) {
        this.dt_atualizacao = dt_atualizacao;
    }

    public int getQtd_dependente() {
        return qtd_dependente;
    }

    public void setQtd_dependente(int qtd_dependente) {
        this.qtd_dependente = qtd_dependente;
    }

    public int getQtd_pensionista() {
        return qtd_pensionista;
    }

    public void setQtd_pensionista(int qtd_pensionista) {
        this.qtd_pensionista = qtd_pensionista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}