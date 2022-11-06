package br.com.ActionX.negocio;

public class Dependentes {
    
    private int id_dependentes;
    private String nome;
    private String email;
    private String telefone;
    private String tipo_dependente;
    private String certidao;
    private String data_nascimento;
    private String genero;
    private String cpf;

    public Dependentes() {
    }

    public Dependentes(int id_dependentes , String nome, String email, String telefone, String tipo_dependente, String certidao, String data_nascimento, String genero, String cpf) {
        this.id_dependentes = id_dependentes;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipo_dependente = tipo_dependente;
        this.certidao = certidao;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getId_dependentes() {
        return id_dependentes;
    }

    public void setId_dependentes(int id_dependentes) {
        this.id_dependentes = id_dependentes;
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

   
    
    
    
}
