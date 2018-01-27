package br.com.marcelo.carreiras.dao;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.Arrays;
import java.util.List;

import br.com.marcelo.carreiras.model.Cultura;
import br.com.marcelo.carreiras.model.RedeSocial;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class RedeSocialDAO {

    public List<RedeSocial> lista() {
        return Arrays.asList(new RedeSocial("facebook", "https://m.facebook.com/Elo7br/"),
                             new RedeSocial("instagram", "https://www.instagram.com/elo7br/"),
                             new RedeSocial("googleplus", "https://plus.google.com/+Elo7Br"),
                             new RedeSocial("pinterest_light", "https://br.pinterest.com/elo7br/"),
                             new RedeSocial("twitter", "https://mobile.twitter.com/elo7"),
                             new RedeSocial("linkedin", "https://br.linkedin.com/company/elo7"),
                             new RedeSocial("blog", "https://blog.elo7.com.br/"));
    }

}
