package com.example.mac1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MaestroLogginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maestro_loggin);
    }

    public void onClick(View view) {
        Intent miIntent=new Intent(MaestroLogginActivity.this,ActivityRegistroMaestro.class);
        startActivity(miIntent);
    }
}
