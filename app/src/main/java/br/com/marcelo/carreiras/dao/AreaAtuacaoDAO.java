package br.com.marcelo.carreiras.dao;

import java.util.Arrays;
import java.util.List;

import br.com.marcelo.carreiras.model.AreaAtuacao;
import br.com.marcelo.carreiras.model.Cultura;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class AreaAtuacaoDAO {

    public List<AreaAtuacao> lista() {
        return Arrays.asList(new AreaAtuacao("ic_engenharia", "Engenharia", "www.google.com"),
                new AreaAtuacao("ic_atendimento", "Atendimento", "www.google.com"),
                new AreaAtuacao("ic_comunicacao_mkt", "Comunicação & Marketing", "www.google.com"),
                new AreaAtuacao("ic_desenvolvimento_vendedores", "Desenvolvimento de Vendedores", "www.google.com"),
                new AreaAtuacao("ic_design", "Design", "www.google.com"),
                new AreaAtuacao("ic_produto", "Produto", "www.google.com"),
                new AreaAtuacao("ic_trustnsafety", "Trust & Safety", "www.google.com"),
                new AreaAtuacao("ic_adm_financeiro", "Administrativo/Financeiro", "www.google.com")
        );

    }
}
