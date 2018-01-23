package br.com.marcelo.carreiras.model;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class AreaAtuacao {
    private String icone;
    private String nome;

    public AreaAtuacao(String icone, String nome) {
        this.icone = icone;
        this.nome = nome;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
