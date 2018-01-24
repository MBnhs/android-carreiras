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
import br.com.marcelo.carreiras.model.RedeSocial;

/**
 * Created by Marcelo on 22/01/2018.
 */

public class GridRodapeAdapter extends BaseAdapter {

    private List<RedeSocial> redesSociais;
    private Context context;

    public GridRodapeAdapter(List<RedeSocial> redesSociais, Context context) {
        this.redesSociais = redesSociais;
        this.context = context;
    }

    @Override
    public int getCount() {
        return redesSociais.size();
    }

    @Override
    public RedeSocial getItem(int posicao) {
        return redesSociais.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        View viewRedeSocial = LayoutInflater.from(context).inflate(R.layout.item_rede_social, viewGroup, false);
        RedeSocial redeSocial = redesSociais.get(posicao);

        if (redeSocial.getIcone()!= null) {
            ImageView icone = viewRedeSocial.findViewById(R.id.imageArea);
            Resources resources = context.getResources();
            int id = resources.getIdentifier(redeSocial.getIcone(), "mipmap", context.getPackageName());
            Drawable drawable = resources.getDrawable(id);
            icone.setImageDrawable(drawable);
        }

        return viewRedeSocial;
    }
}
