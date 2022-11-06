package br.com.ActionX.Negocio;

public class RedefineSenhas {
    
    private int id_redefineSenhas;
    private String dt_criacao;

    public RedefineSenhas() {
    }

    public RedefineSenhas(int id_redefineSenhas, String dt_criacao) {
        this.id_redefineSenhas = id_redefineSenhas;
        this.dt_criacao = dt_criacao;
    }

    public int getId_redefineSenhas() {
        return id_redefineSenhas;
    }

    public void setId_redefineSenhas(int id_redefineSenhas) {
        this.id_redefineSenhas = id_redefineSenhas;
    }

    public String getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }
    
    
}
