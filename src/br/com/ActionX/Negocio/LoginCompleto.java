package br.com.ActionX.Negocio;

public class LoginCompleto {
    
    private int id_login;
    private String usuario;
    private String senha;
    private String dt_criacao;
    private String dt_atualizacao;
    private String tipo_login;
    private String Nome;

    public LoginCompleto() {
    }

    public LoginCompleto(int id_login, String usuario, String senha, String dt_criacao, String dt_atualizacao, String tipo_login, String Nome) {
        this.id_login = id_login;
        this.usuario = usuario;
        this.senha = senha;
        this.dt_criacao = dt_criacao;
        this.dt_atualizacao = dt_atualizacao;
        this.tipo_login = tipo_login;
        this.Nome = Nome;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getTipo_login() {
        return tipo_login;
    }

    public void setTipo_login(String tipo_login) {
        this.tipo_login = tipo_login;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    
}
