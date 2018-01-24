package br.com.marcelo.carreiras.dao;

import java.util.Arrays;
import java.util.List;

import br.com.marcelo.carreiras.model.Cultura;
import br.com.marcelo.carreiras.model.RedeSocial;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class RedeSocialDAO {

    public List<RedeSocial> lista() {
        return Arrays.asList(new RedeSocial("facebook"),
                             new RedeSocial("instagram"),
                             new RedeSocial("googleplus"),
                             new RedeSocial("pinterest_light"),
                             new RedeSocial("twitter"),
                             new RedeSocial("linkedin"),
                             new RedeSocial("blog"));
    }

}
