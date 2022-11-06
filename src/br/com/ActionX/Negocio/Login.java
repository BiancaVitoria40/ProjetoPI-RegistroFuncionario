package br.com.ActionX.Negocio;

public class Login {
    
    private int id_login;
    private String usuario;
    private String senha;
    private String dt_criacao;
    private String dt_atualizacao;

    public Login() {
    }

    public Login(int id_login, String usuario, String senha, String dt_criacao, String dt_atualizacao) {
        this.id_login = id_login;
        this.usuario = usuario;
        this.senha = senha;
        this.dt_criacao = dt_criacao;
        this.dt_atualizacao = dt_atualizacao;
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
    
    
}
