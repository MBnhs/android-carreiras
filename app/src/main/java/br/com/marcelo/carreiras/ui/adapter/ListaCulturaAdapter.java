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

import br.com.marcelo.carreiras.model.Cultura;
import br.com.marcelo.carreiras.R;
/**
 * Created by Marcelo on 22/01/2018.
 */

public class ListaCulturaAdapter extends BaseAdapter{

    private List<Cultura> listaCultura;
    private Context context;

    public ListaCulturaAdapter(List<Cultura> listaCultura, Context context) {
        this.listaCultura = listaCultura;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaCultura.size();
    }

    @Override
    public Object getItem(int posicao) {
        return listaCultura.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        View viewCultura = LayoutInflater.from(context).inflate(R.layout.item_cultura, viewGroup, false);
        Cultura cultura = listaCultura.get(posicao);

        TextView titulo = viewCultura.findViewById(R.id.textTitulo);
        titulo.setText(cultura.getTitulo());

        TextView descricao = viewCultura.findViewById(R.id.textDescricao);
        descricao.setText(cultura.getDescricao());

        if (cultura.getIcone()!= null) {
            ImageView icone = viewCultura.findViewById(R.id.imageCultura);
            Resources resources = context.getResources();
            int id = resources.getIdentifier(cultura.getIcone(), "mipmap", context.getPackageName());
            Drawable drawable = resources.getDrawable(id);
            icone.setImageDrawable(drawable);
        }

        return viewCultura;
    }
}
