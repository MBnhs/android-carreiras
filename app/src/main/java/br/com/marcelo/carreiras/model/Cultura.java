package br.com.marcelo.carreiras.model;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class Cultura {

    private String icone;
    private String titulo;
    private String descricao;

    public Cultura() {

    }

    public Cultura(String icone, String titulo, String descricao) {
        this.icone = icone;
        this.titulo = titulo;
        this.descricao = descricao;
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
