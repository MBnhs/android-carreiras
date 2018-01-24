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


        GridView gridAreaAtuacao = findViewById(R.id.gridAreaAtuacao);
        gridAreaAtuacao.setAdapter(new GridAreaAtuacaoAdapter(new AreaAtuacaoDAO().lista(),this));
        UIUtils.setGridViewHeightBasedOnItems(gridAreaAtuacao);

        gridAreaAtuacao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Uri uri = Uri.parse("https://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        GridView gridRodape = findViewById(R.id.gridRodape);
        gridRodape.setAdapter(new GridRodapeAdapter(new RedeSocialDAO().lista(),this));
        UIUtils.setGridViewHeightBasedOnItems(gridAreaAtuacao);

    }
}
