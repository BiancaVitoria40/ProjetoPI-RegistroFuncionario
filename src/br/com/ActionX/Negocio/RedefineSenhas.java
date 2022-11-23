package br.com.ActionX.Negocio;

import java.util.Date;

public class RedefineSenhas {
    
    private int id_redefineSenhas;
    private Date dt_criacao;
    private int id_login;
    private String usuario;

    public RedefineSenhas() {
    }

    public RedefineSenhas(int id_redefineSenhas, Date dt_criacao, int id_login, String usuario) {
        this.id_redefineSenhas = id_redefineSenhas;
        this.dt_criacao = dt_criacao;
        this.id_login = id_login;
        this.usuario = usuario;
    }

    public int getId_redefineSenhas() {
        return id_redefineSenhas;
    }

    public void setId_redefineSenhas(int id_redefineSenhas) {
        this.id_redefineSenhas = id_redefineSenhas;
    }

    public Date getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(Date dt_criacao) {
        this.dt_criacao = dt_criacao;
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

}
