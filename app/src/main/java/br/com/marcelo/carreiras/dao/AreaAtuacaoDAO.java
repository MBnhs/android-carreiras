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
        return Arrays.asList(new AreaAtuacao("ic_engenharia", "Engenharia", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/engenharia/"),
                new AreaAtuacao("ic_atendimento", "Atendimento", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/atendimento/"),
                new AreaAtuacao("ic_comunicacao_mkt", "Comunicação & Marketing", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/comunicacao-e-marketing/"),
                new AreaAtuacao("ic_desenvolvimento_vendedores", "Desenvolvimento de Vendedores", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/desenvolvimento-de-vendedores/"),
                new AreaAtuacao("ic_design", "Design", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/design/"),
                new AreaAtuacao("ic_produto", "Produto", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/produto/"),
                new AreaAtuacao("ic_trustnsafety", "Trust & Safety", "http://d9hhrg4mnvzow.cloudfront.net/carreira.elo7.com.br/16b70474-trust-safety.png"),
                new AreaAtuacao("ic_adm_financeiro", "Administrativo/Financeiro", "http://carreira.elo7.com.br/clkn/http/carreira.elo7.com.br/administrativo-financeiro/")
        );

    }
}
