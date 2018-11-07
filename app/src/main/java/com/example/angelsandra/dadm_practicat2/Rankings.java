package com.example.angelsandra.dadm_practicat2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rankings extends Activity {

    String[] perfiles={"1. Jugador 1", "2. Jugador 2", "3. Jugador 3", "4. Jugador 4", "5. Jugador 5", "1. Jugador 1", "2. Jugador 2", "3. Jugador 3", "4. Jugador 4", "5. Jugador 5", "1. Jugador 1", "2. Jugador 2", "3. Jugador 3", "4. Jugador 4", "5. Jugador 5" };
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankings);

        lista = (ListView)findViewById(R.id.rankingListView);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, perfiles);
        lista.setAdapter(adaptador);
    }
}
