package com.cpedroza.myapp_poema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pulsar(View view) {
        Intent intent = null;
        if(view.getId()== R.id.btnBandera){
            intent = new Intent(this, MA_Bandera.class);
            startActivity(intent);
        }
        if(view.getId()== R.id.btnCeiba){
            intent = new Intent(this, MA_Ceiba.class);
            startActivity(intent);
        }
        if(view.getId()== R.id.btnMonjaBlanca){
            intent = new Intent(this, MA_MonjaBlanca.class);
            startActivity(intent);
        }

    }
}