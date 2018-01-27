package br.com.marcelo.carreiras.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import br.com.marcelo.carreiras.R;
import br.com.marcelo.carreiras.model.AreaAtuacao;
import br.com.marcelo.carreiras.model.Cultura;
import br.com.marcelo.carreiras.model.RedeSocial;
import br.com.marcelo.carreiras.ui.adapter.GridAreaAtuacaoAdapter;
import br.com.marcelo.carreiras.ui.adapter.GridRodapeAdapter;
import br.com.marcelo.carreiras.ui.adapter.ListaCulturaAdapter;
import br.com.marcelo.carreiras.ui.utils.UIUtils;

public class CarreirasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carreiras);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference referenciaCulturas = database.getReference("culturas");
        final List<Cultura> culturas = new ArrayList<>();
        referenciaCulturas.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Cultura>> genericTypeIndicator =new GenericTypeIndicator<List<Cultura>>(){};
                List<Cultura> taskCulturas = dataSnapshot.getValue(genericTypeIndicator);
                culturas.addAll(taskCulturas);
                loadCulturas(culturas);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference referenciaRedesSociais = database.getReference("redesSociais");
        final List<RedeSocial> redeSociais = new ArrayList<>();
        referenciaRedesSociais.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<RedeSocial>> genericTypeIndicator =new GenericTypeIndicator<List<RedeSocial>>(){};
                List<RedeSocial> taskRedesSociais = dataSnapshot.getValue(genericTypeIndicator);
                redeSociais.addAll(taskRedesSociais);
                loadRedesSociais(redeSociais);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference referenciaAreas = database.getReference("areasAtuacao");
        final List<AreaAtuacao>areasAtuacao = new ArrayList<>();
        referenciaAreas.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<AreaAtuacao>> genericTypeIndicator =new GenericTypeIndicator<List<AreaAtuacao>>(){};
                List<AreaAtuacao> taskAreas = dataSnapshot.getValue(genericTypeIndicator);
                areasAtuacao.addAll(taskAreas);
                loadAreas(areasAtuacao);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void loadCulturas(List<Cultura> culturas) {
        ListView listaCultura = findViewById(R.id.listaCultura);
        listaCultura.setAdapter(new ListaCulturaAdapter(culturas, this));
        UIUtils.setListViewHeightBasedOnItems(listaCultura);
    }

    private void loadAreas(List<AreaAtuacao> areaAtuacao) {
        final GridView gridAreaAtuacao = findViewById(R.id.gridAreaAtuacao);
        gridAreaAtuacao.setAdapter(new GridAreaAtuacaoAdapter(areaAtuacao,this));
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
    }

    private void loadRedesSociais(List<RedeSocial> redeSociais) {
        final GridView gridRodape = findViewById(R.id.gridRodape);
        gridRodape.setAdapter(new GridRodapeAdapter(redeSociais,this));

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
