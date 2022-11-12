package br.com.ActionX.Negocio;

public class Dependentes {
    
    private int id_dependentes;
    private int idFuncionario;
    private String nome;
    private String email;
    private String telefone;
    private String tipo_dependente;
    private String certidao;
    private String data_nascimento;
    private String genero;
    private String cpf;
    private String status;

    public Dependentes() {
    }

    public Dependentes(int id_dependentes, int idFuncionario, String nome, String email, String telefone, String tipo_dependente, String certidao, String data_nascimento, String genero, String cpf, String status) {
        this.id_dependentes = id_dependentes;
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipo_dependente = tipo_dependente;
        this.certidao = certidao;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.cpf = cpf;
        this.status = status;
    }

    public int getId_dependentes() {
        return id_dependentes;
    }

    public void setId_dependentes(int id_dependentes) {
        this.id_dependentes = id_dependentes;
    }

    public int getId_funcionario() {
        return idFuncionario;
    }

    public void setidFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public String getTipo_dependente() {
        return tipo_dependente;
    }

    public void setTipo_dependente(String tipo_dependente) {
        this.tipo_dependente = tipo_dependente;
    }

    public String getCertidao() {
        return certidao;
    }

    public void setCertidao(String certidao) {
        this.certidao = certidao;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
