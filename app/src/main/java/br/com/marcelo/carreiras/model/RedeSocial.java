package br.com.marcelo.carreiras.model;

/**
 * Created by Marcelo on 24/01/2018.
 */

public class RedeSocial {

    private String icone;
    private String link;

    public RedeSocial() {

    }

    public RedeSocial(String icone, String link) {
        this.icone = icone;
        this.link = link;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
