package com.example.daggertwoexample;

import dagger.Component;

@Component
public interface ComputComponent {

    Computador getComputador();

    void inject(MainActivity mainActivity);

}
