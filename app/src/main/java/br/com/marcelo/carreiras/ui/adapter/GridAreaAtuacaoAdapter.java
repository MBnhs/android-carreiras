package br.com.marcelo.carreiras.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.marcelo.carreiras.R;
import br.com.marcelo.carreiras.model.AreaAtuacao;
import br.com.marcelo.carreiras.model.Cultura;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class GridAreaAtuacaoAdapter extends BaseAdapter {

    private List<AreaAtuacao> areasAtuacao;
    private Context context;

    public GridAreaAtuacaoAdapter(List<AreaAtuacao> areasAtuacao, Context context) {
        this.areasAtuacao = areasAtuacao;
        this.context = context;
    }

    @Override
    public int getCount() {
        return areasAtuacao.size();
    }

    @Override
    public Object getItem(int posicao) {
        return areasAtuacao.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        View viewAreaAtuacao = LayoutInflater.from(context).inflate(R.layout.item_area_atuacao, viewGroup, false);
        AreaAtuacao areaAtuacao = areasAtuacao.get(posicao);

        TextView nome = viewAreaAtuacao.findViewById(R.id.textNome);
        nome.setText(areaAtuacao.getNome());

        if (areaAtuacao.getIcone()!= null) {
            ImageView icone = viewAreaAtuacao.findViewById(R.id.imageArea);
            Resources resources = context.getResources();
            int id = resources.getIdentifier(areaAtuacao.getIcone(), "mipmap", context.getPackageName());
            Drawable drawable = resources.getDrawable(id);
            icone.setImageDrawable(drawable);
        }

        return viewAreaAtuacao;
    }
}
