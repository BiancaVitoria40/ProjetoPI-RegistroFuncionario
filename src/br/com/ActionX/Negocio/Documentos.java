package br.com.ActionX.Negocio;

public class Documentos {
    
    private int id_documento;
    private String rg;
    private String cpf;
    private String titulo_eleitor;
    private String ctps;
    private String serie;
    private String uf;
    private String certidao_nascimento;
    private String certidao_civil;
    private String reservista;
    private String pis;

    public Documentos() {
    }

    public Documentos(int id_documento, String rg, String cpf, String titulo_eleitor, String ctps, String serie, String uf, String certidao_nascimento, String certidao_civil, String reservista, String pis) {
        this.id_documento = id_documento;
        this.rg = rg;
        this.cpf = cpf;
        this.titulo_eleitor = titulo_eleitor;
        this.ctps = ctps;
        this.serie = serie;
        this.uf = uf;
        this.certidao_nascimento = certidao_nascimento;
        this.certidao_civil = certidao_civil;
        this.reservista = reservista;
        this.pis = pis;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo_eleitor() {
        return titulo_eleitor;
    }

    public void setTitulo_eleitor(String titulo_eleitor) {
        this.titulo_eleitor = titulo_eleitor;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCertidao_nascimento() {
        return certidao_nascimento;
    }

    public void setCertidao_nascimento(String certidao_nascimento) {
        this.certidao_nascimento = certidao_nascimento;
    }

    public String getCertidao_civil() {
        return certidao_civil;
    }

    public void setCertidao_civil(String certidao_civil) {
        this.certidao_civil = certidao_civil;
    }

    public String getReservista() {
        return reservista;
    }

    public void setReservista(String reservista) {
        this.reservista = reservista;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }
    
    
    
    
}
