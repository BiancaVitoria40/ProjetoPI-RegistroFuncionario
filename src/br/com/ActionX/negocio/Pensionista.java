package br.com.ActionX.negocio;

public class Pensionista {
    
    private int id_pensionista;
    private String nome;
    private String cpf;
    private String cod_banco;
    private String agencia;
    private String tipo_conta;
    private String conta;
    private String digito;

    public Pensionista() {
    }

    public Pensionista(int id_pensionista, String nome, String cpf, String cod_banco, String agencia, String tipo_conta, String conta, String digito) {
        this.id_pensionista = id_pensionista;
        this.nome = nome;
        this.cpf = cpf;
        this.cod_banco = cod_banco;
        this.agencia = agencia;
        this.tipo_conta = tipo_conta;
        this.conta = conta;
        this.digito = digito;
    }

    public int getId_pensionista() {
        return id_pensionista;
    }

    public void setId_pensionista(int id_pensionista) {
        this.id_pensionista = id_pensionista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCod_banco() {
        return cod_banco;
    }

    public void setCod_banco(String cod_banco) {
        this.cod_banco = cod_banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
    
    
}
