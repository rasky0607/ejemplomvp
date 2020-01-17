package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Repositorio;

import android.util.Log;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Base.NumeroAleatorio;
import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Model.BoletoLoteria;

import java.util.ArrayList;

public class BoletoLoteriaRepositorio {
   private ArrayList<BoletoLoteria> list;

    static  BoletoLoteriaRepositorio INSTANCE;
    public static BoletoLoteriaRepositorio getInstance(){
        if(INSTANCE== null)
            INSTANCE = new BoletoLoteriaRepositorio();

        return INSTANCE;
    }

    public BoletoLoteriaRepositorio() {
        Log.e("AQUI","Constructor del repository ");
        this.list = new ArrayList<BoletoLoteria>();
        inicializar();
    }

    private void inicializar() {
        Log.e("AQUI","Inicializar del repository ");
        this.list.add(new BoletoLoteria(421,"Euromillon","10/12/2019"));
        this.list.add(new BoletoLoteria(202,"Bonoloto","16/12/2019"));
        this.list.add(new BoletoLoteria(331,"Primitiva","11/12/2019"));
        this.list.add(new BoletoLoteria(923,"Primitiva","22/12/2019"));
        this.list.add(new BoletoLoteria(666,"Euromillon","06/12/2019"));
        this.list.add(new BoletoLoteria(503,"Bonoloto","16/11/2019"));
        this.list.add(new BoletoLoteria(703,"Euromillon","27/10/2019"));
        this.list.add(new BoletoLoteria(208,"Primitiva","30/12/2019"));
        this.list.add(new BoletoLoteria(421,"Euromillon","10/12/2019"));
        this.list.add(new BoletoLoteria(202,"Bonoloto","16/12/2019"));
        this.list.add(new BoletoLoteria(331,"Primitiva","11/12/2019"));
        this.list.add(new BoletoLoteria(923,"Primitiva","22/12/2019"));
        this.list.add(new BoletoLoteria(666,"Euromillon","06/12/2019"));
        this.list.add(new BoletoLoteria(503,"Bonoloto","16/11/2019"));
        this.list.add(new BoletoLoteria(703,"Euromillon","27/10/2019"));
        this.list.add(new BoletoLoteria(208,"Primitiva","30/12/2019"));
        this.list.add(new BoletoLoteria(421,"Euromillon","10/12/2019"));
        this.list.add(new BoletoLoteria(202,"Bonoloto","16/12/2019"));
        this.list.add(new BoletoLoteria(331,"Primitiva","11/12/2019"));
        this.list.add(new BoletoLoteria(923,"Primitiva","22/12/2019"));
        this.list.add(new BoletoLoteria(666,"Euromillon","06/12/2019"));
        this.list.add(new BoletoLoteria(503,"Bonoloto","16/11/2019"));
        this.list.add(new BoletoLoteria(703,"Euromillon","27/10/2019"));
        this.list.add(new BoletoLoteria(208,"Primitiva","30/12/2019"));
    }

    public ArrayList<BoletoLoteria> getList(){
        return this.list;
    }
    public void add(BoletoLoteria boletoLoteria){
        this.list.add(boletoLoteria);
    }

    public void edit(BoletoLoteria boletoLoteria){
        for (BoletoLoteria item : list)
        {
            if(item.getNumSorteo()== boletoLoteria.getNumSorteo())
            {
                item.setFechaSorteo(boletoLoteria.getFechaSorteo());
                item.setListNumPremiados(boletoLoteria.getListNumPremiados());
                item.setTipoSorteo(boletoLoteria.getTipoSorteo());
            }
        }
    }

    public void delete(int pos){
        this.list.remove(pos);
    }
}
