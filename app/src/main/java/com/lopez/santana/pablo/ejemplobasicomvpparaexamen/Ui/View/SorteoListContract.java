package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Ui.View;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Model.BoletoLoteria;

import java.util.ArrayList;

public class SorteoListContract {
    public interface View {
        void hayDatos(ArrayList<BoletoLoteria> list);
        void noHaydatos();
        void mensaje(String msg);
        void error(String msg);
        void setPresenter(Presenter presenter);
    }

    public interface Presenter{
        void cargarDatos();
        void anadir(BoletoLoteria objeto);
        void editar(BoletoLoteria objeto);
        void delete(int pos);

    }
}
