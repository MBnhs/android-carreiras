package br.com.marcelo.carreiras.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.marcelo.carreiras.R;
import br.com.marcelo.carreiras.dao.CulturaDAO;
import br.com.marcelo.carreiras.ui.adapter.ListaCulturaAdapter;

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
    }
}
