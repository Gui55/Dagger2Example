package com.example.daggertwoexample;

import android.util.Log;

import javax.inject.Inject;

public class Computador {

    CPU cpu;
    GPU gpu;
    Memoria memoria;

    @Inject /*Assim o programa vai automaticamente saber que a classe Computador é instanciada dessa forma*/
    public Computador(CPU cpu, GPU gpu, Memoria memoria){

        this.cpu = cpu;
        this.gpu = gpu;
        this.memoria = memoria;

    }

    void tocarSom(){
        Log.d("PC", "Tum tuuum");
    }

}
