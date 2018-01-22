package br.com.marcelo.carreiras.dao;

import java.util.Arrays;
import java.util.List;

import br.com.marcelo.carreiras.model.Cultura;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class CulturaDAO {

    public List<Cultura> lista() {
        return Arrays.asList(new Cultura(0, null, "Nossa cultura", "Somos orientados pela satisfação e fidelização de nossos clientes"),
                new Cultura(0, "criatividade", "Criatividade", "Estimulamos a intervenção humana como algo insubstituível. Nosso ambiente é inspirador"),
        new Cultura(0, "colaboracao", "Colaboração", "Valorizamos o trabalho em equipe e as habilidades individuais. Incentivamos o empreendedorismo e formamos um time fora de série"),
                new Cultura(0, "tec_ino", "Tecnologia e Inovação", "Utilizamos a tecnologia para melhorar continuamente nosso negócio. Transformamos e conectamos pessoas")
        );
    }

}
