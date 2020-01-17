package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Data.Model.BoletoLoteria;
import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class SorteoListAdapter extends RecyclerView.Adapter<SorteoListAdapter.ViewHolder> {

    private ArrayList<BoletoLoteria> list;

    public SorteoListAdapter(){
        this.list = new ArrayList<BoletoLoteria>();
    }

    public void addAll(ArrayList<BoletoLoteria> list){
        this.list.addAll(list);
    }

    public void add(BoletoLoteria boletoLoteria){
        list.add(boletoLoteria);
    }

    //Inflamos la vista de los item del recycler
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sorteo_list_view_,parent,false);
        return new ViewHolder(v);
    }

    //Asociamos datos a cada componente es decir (itemView) de el ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        switch (list.get(position).getTipoSorteo())
        {
            case "Primitiva":
                holder.imgvTipoSorteo.setImageResource(R.drawable.ic_primitiva);
                break;

            case "Euromillon":
                holder.imgvTipoSorteo.setImageResource(R.drawable.ic_euromillon);
                break;

            case "Bonoloto":
                holder.imgvTipoSorteo.setImageResource(R.drawable.ic_bonoloto);
                break;
        }
        holder.tvNumSorteo.setText(Integer.toString(list.get(position).getNumSorteo()));
        holder.tvFechaSorteo.setText(list.get(position).getFechaSorteo());

        String numPremiado="";
        for (int item : list.get(position).getListNumPremiados()){
            numPremiado+="["+item+"]";
        }
        holder.tvNumPremiado.setText(numPremiado);

    }

    @Override
    public int getItemCount() {
            return list.size();
    }

    /*Esta clase interna es la encargada de enlazar los componentes graficos con las variables de la clase*/
    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgvTipoSorteo;
        private TextView tvNumSorteo;
        private TextView tvFechaSorteo;
        private TextView tvNumPremiado;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgvTipoSorteo = itemView.findViewById(R.id.imgvTipoSorteo);
            tvNumSorteo = itemView.findViewById(R.id.tvNumSorteo);
            tvFechaSorteo = itemView.findViewById(R.id.tvFechaSorteo);
            tvNumPremiado = itemView.findViewById(R.id.tvNumPremiado);
        }
    }

}
