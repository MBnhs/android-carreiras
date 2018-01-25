package br.com.marcelo.carreiras.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.marcelo.carreiras.R;
import br.com.marcelo.carreiras.dao.AreaAtuacaoDAO;
import br.com.marcelo.carreiras.dao.CulturaDAO;
import br.com.marcelo.carreiras.dao.RedeSocialDAO;
import br.com.marcelo.carreiras.model.AreaAtuacao;
import br.com.marcelo.carreiras.model.RedeSocial;
import br.com.marcelo.carreiras.ui.adapter.GridAreaAtuacaoAdapter;
import br.com.marcelo.carreiras.ui.adapter.GridRodapeAdapter;
import br.com.marcelo.carreiras.ui.adapter.ListaCulturaAdapter;
import br.com.marcelo.carreiras.ui.utils.UIUtils;

public class CarreirasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");*/
        setContentView(R.layout.activity_carreiras);

        ListView listaCultura = findViewById(R.id.listaCultura);
        listaCultura.setAdapter(new ListaCulturaAdapter(new CulturaDAO().lista(), this));
        UIUtils.setListViewHeightBasedOnItems(listaCultura);


        final GridView gridAreaAtuacao = findViewById(R.id.gridAreaAtuacao);
        gridAreaAtuacao.setAdapter(new GridAreaAtuacaoAdapter(new AreaAtuacaoDAO().lista(),this));
        UIUtils.setGridViewHeightBasedOnItems(gridAreaAtuacao);

        gridAreaAtuacao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AreaAtuacao areaAtuacao = (AreaAtuacao) gridAreaAtuacao.getItemAtPosition(i);
                Intent intent = new Intent(CarreirasActivity.this, WebViewActivity.class);
                intent.putExtra("url", areaAtuacao.getLink());
                startActivity(intent);
            }
        });

        final GridView gridRodape = findViewById(R.id.gridRodape);
        gridRodape.setAdapter(new GridRodapeAdapter(new RedeSocialDAO().lista(),this));
        UIUtils.setGridViewHeightBasedOnItems(gridAreaAtuacao);

        gridRodape.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                RedeSocial redeSocial = (RedeSocial) gridRodape.getItemAtPosition(i);
                Intent intent = new Intent(CarreirasActivity.this, WebViewActivity.class);
                intent.putExtra("url", redeSocial.getLink());
                startActivity(intent);
            }
        });

    }
}
