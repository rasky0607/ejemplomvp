package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Ui.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.R;

public class MainSorteo extends AppCompatActivity {
    SorteoListView fragmentSorteoListView ;
    SorteoListPresenter sorteoListPresenter;
    private FloatingActionButton fb;
    AddSorteo fragmentAddSorteo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_sorteo);
        inicializar();
        fb = findViewById(R.id.fbAdd);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentAddSorteo = (AddSorteo)getSupportFragmentManager().findFragmentByTag(AddSorteo.TAG);
                if(fragmentAddSorteo==null)
                    fragmentAddSorteo=AddSorteo.newInstance(null);

                getSupportFragmentManager().beginTransaction().replace(R.id.micontentenedor,fragmentAddSorteo,AddSorteo.TAG).commit();
            }
        });
    }

    public void inicializar(){
        fragmentSorteoListView=(SorteoListView) getSupportFragmentManager().findFragmentByTag(SorteoListView.TAG);//Añadimos el tag a este fragment
        if(fragmentSorteoListView==null)
        {
            fragmentSorteoListView= SorteoListView.newInstance(null);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.micontentenedor,fragmentSorteoListView, SorteoListView.TAG).commit();
        sorteoListPresenter = new SorteoListPresenter(fragmentSorteoListView);
        fragmentSorteoListView.setPresenter(sorteoListPresenter);
        setTitle("Lista de Sorteos");

    }



}
