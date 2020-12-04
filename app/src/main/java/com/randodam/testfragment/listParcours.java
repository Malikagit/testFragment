package com.randodam.testfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class listParcours extends AppCompatActivity {



    public void titreApp() {
        //Ici on déclare le nom de l'app car c'est la première page qui s'affiche
        String titre = "liste Parcours";
        // On fait le lien avec la ressource et on la modifiee
        setTitle(titre);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_parcours);

        titreApp();
    }
}