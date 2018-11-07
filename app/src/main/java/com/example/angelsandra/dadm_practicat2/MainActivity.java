package com.example.angelsandra.dadm_practicat2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton settingsButton =findViewById(R.id.settings);

        settingsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent t = new Intent(MainActivity.this, Settings.class);
                startActivity(t);
            }
        });

        FloatingActionButton rankingButton =findViewById(R.id.rankings);

        rankingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent t = new Intent(MainActivity.this, Rankings.class);
                startActivity(t);
            }
        });

        FloatingActionButton aboutUsButton=findViewById(R.id.aboutUs);

        aboutUsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent t = new Intent(MainActivity.this, Settings.class);
                startActivity(t);
            }
        });


    }

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
