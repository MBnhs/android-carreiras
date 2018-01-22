package br.com.marcelo.carreiras.model;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class Cultura {

    private int ordem;
    private String icone;
    private String titulo;
    private String descricao;

    public Cultura(int ordem, String icone, String titulo, String descricao) {
        this.ordem = ordem;
        this.icone = icone;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}
