package br.ifsc.edu.br.listafrutassimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frutas frutas = new Frutas();
        final ArrayList<Fruta>  listaFrutas = new ArrayList<>();

        for(Fruta f: frutas.FRUTAS)
        {
            listaFrutas.add(f);
        }
        listView=findViewById(R.id.listView);

        FrutaAdapter adapter  = new FrutaAdapter( getApplicationContext(),
                R.layout.list_item_frut,
                listaFrutas
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Overridepublic

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String valorTexto = [position];
                Toast.makeText(getBaseContext(), valorTexto,Toast.LENGTH_LONG ).show();
            }});


    }
}


//