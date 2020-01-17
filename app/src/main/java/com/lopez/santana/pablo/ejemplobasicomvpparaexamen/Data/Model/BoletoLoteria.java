package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Model;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Base.NumeroAleatorio;

import java.util.ArrayList;

public class BoletoLoteria {
    //region Campos
    int numSorteo;
    String tipoSorteo;
    String fechaSorteo;
    ArrayList<Integer> listNumPremiados; //Conjunto de numeros premiados
    //endregion

    //region Propiedades
    public int getNumSorteo() {
        return numSorteo;
    }

    public void setNumSorteo(int numSorteo) {
        this.numSorteo = numSorteo;
    }

    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }

    public String getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(String fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public ArrayList<Integer> getListNumPremiados() {
        return listNumPremiados;
    }

    public void setListNumPremiados(ArrayList<Integer> listNumPremiados) {
        this.listNumPremiados = listNumPremiados;
    }
    //endregion

    //region Constructores
    public BoletoLoteria(int numSorteo, String tipoSorteo, String fechaSorteo) {
        this.numSorteo = numSorteo;
        this.tipoSorteo = tipoSorteo;
        this.fechaSorteo = fechaSorteo;
        this.listNumPremiados = new ArrayList<Integer>();
        switch (tipoSorteo)
        {
            case "Euromillon":
                this.listNumPremiados.addAll(NumeroAleatorio.getListaNumerosAleatorios(1,50,5));
                this.listNumPremiados.add(NumeroAleatorio.numeroAleatorio(1,12));
                this.listNumPremiados.add(NumeroAleatorio.numeroAleatorio(1,12));
                break;
            default:
                this.listNumPremiados.addAll(NumeroAleatorio.getListaNumerosAleatorios(1,49,6));
                this.listNumPremiados.add(NumeroAleatorio.numeroAleatorio(1,49));
                this.listNumPremiados.add(NumeroAleatorio.numeroAleatorio(0,9));
                break;
        }

    }
    //endregion

}
