package com.example.micka.projetandroidstudio;

import android.databinding.ObservableField;


public class MainViewModel  {

    public ObservableField<String> button1 = new ObservableField<>();
    public ObservableField<String> button2 = new ObservableField<>();

    Navigator main;

    public MainViewModel(Navigator main){
        this.main = main;
        button1.set(String.valueOf(R.id.Button1));
        button2.set(String.valueOf(R.id.Button2));
    }

    public void onActivity2(){
        main.goToActivity2();
    }

    public void onActivity3(){
       main.goToActivity3();
    }
}
