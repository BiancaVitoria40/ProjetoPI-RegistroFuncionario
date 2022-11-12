package br.com.ActionX.Negocio;

public class DadosBancarios {
    
    private int idFuncionario;
    private int id_dadosBancarios;
    private String cod_banco;
    private String agencia;
    private String tipo_conta;
    private String conta;
    private String digito;
    private String status;

    public DadosBancarios() {
    }

    public DadosBancarios(int idFuncionario, int id_dadosBancarios, String cod_banco, String agencia, String tipo_conta, String conta, String digito, String status) {
        this.idFuncionario = idFuncionario;
        this.id_dadosBancarios = id_dadosBancarios;
        this.cod_banco = cod_banco;
        this.agencia = agencia;
        this.tipo_conta = tipo_conta;
        this.conta = conta;
        this.digito = digito;
        this.status = status;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getId_dadosBancarios() {
        return id_dadosBancarios;
    }

    public void setId_dadosBancarios(int id_dadosBancarios) {
        this.id_dadosBancarios = id_dadosBancarios;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}