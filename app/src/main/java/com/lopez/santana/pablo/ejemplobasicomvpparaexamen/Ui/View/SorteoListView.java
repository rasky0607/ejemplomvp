package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Ui.View;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Adapter.SorteoListAdapter;
import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Model.BoletoLoteria;
import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.R;

import java.util.ArrayList;

public class SorteoListView extends Fragment implements SorteoListContract.View {

    public static final String TAG="SorteoListView";
    private RecyclerView rvSorteo;
    private SorteoListAdapter sorteoListAdapter;
    SorteoListContract.Presenter presenter;

    //Constructor
    public SorteoListView() {
    }

    // Unica Instancia del fragment
    public static SorteoListView newInstance(Bundle args) {
        SorteoListView fragment = new SorteoListView();
        fragment.setArguments(args);
        return fragment;
    }

    /**Al crear la actividad/fragment*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**Al crear la vista, (inflamos la vista)*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sorteo__list__view, container, false);
    }

    /*Justo despues de crear la actividad
    * Principalmente es donde carga todas las cosas ene ste caso el listado del reciclerView*/
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Para mantener los datos o estado al girar la actividad
        setRetainInstance(true);
        rvSorteo = view.findViewById(R.id.rvSorteo);
        inicilizaRvSorteo();
        presenter.cargarDatos();
    }

    public void inicilizaRvSorteo(){
        sorteoListAdapter = new SorteoListAdapter();
        rvSorteo.setAdapter(sorteoListAdapter);
        rvSorteo.setLayoutManager(new LinearLayoutManager(getContext()));
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

/**---------------Metodos implementados por la interfaz View--------------------*/
    @Override
    public void hayDatos(ArrayList<BoletoLoteria> list) {
        sorteoListAdapter.addAll(list);
        sorteoListAdapter.notifyDataSetChanged();//Para que actulice los datos
        Log.e("AQUI","El 1 es: "+list.get(0).getNumSorteo());
    }

    @Override
    public void noHaydatos() {
        Toast.makeText(getContext(),"NO hay datos",Toast.LENGTH_LONG).show();
        Log.e("AQUI","No hay datos ");
    }

    @Override
    public void mensaje(String msg) {
        Toast.makeText(getContext(),msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void error(String msg) {
        Toast.makeText(getContext(),"Error",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(SorteoListContract.Presenter presenter) {
        this.presenter=presenter;
    }
    /**-----------------------------------------------------------------*/

}
