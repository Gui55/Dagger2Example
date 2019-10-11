package com.example.daggertwoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Computador computador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComputComponent computComponent = DaggerComputComponent.create();
        computComponent.inject(this);

        computador.tocarSom();
    }
}
