package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Ui.View;

import android.util.Log;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Model.BoletoLoteria;
import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Repositorio.BoletoLoteriaRepositorio;

public class SorteoListPresenter implements SorteoListContract.Presenter {

    private SorteoListContract.View view;
    /**Constructor*/
    public SorteoListPresenter(SorteoListContract.View view) {
        this.view = view;
    }

    /**---------------Metodos implementados por la interfaz Presenter--------------------*/
    @Override
    public void cargarDatos() {
        Log.e("AQUI","cargarDatos en presenter ");
        if(BoletoLoteriaRepositorio.getInstance().getList().isEmpty())
            view.noHaydatos();
        else
            view.hayDatos(BoletoLoteriaRepositorio.getInstance().getList());//Le paso la lista de roipositori al adapter
    }

    @Override
    public void anadir(BoletoLoteria objeto) {

    }

    @Override
    public void editar(BoletoLoteria objeto) {

    }

    @Override
    public void delete(int pos) {

    }
    /**-----------------------------------------------------------------*/
}
