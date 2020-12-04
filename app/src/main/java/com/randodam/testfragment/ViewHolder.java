package com.randodam.testfragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ViewHolder {

    TextView nomParcours, dateParcours, descriptifParcours;


    public void MyViewHolder(@NonNull View itemView) {
        /** Dans ce constructeur on fait le lien vers le design du layout d'une ligne du recycler **/
        super(itemView);

        nomParcours = itemView.findViewById(R.id.tvNomParcours);
        dateParcours = itemView.findViewById(R.id.tvDateParcours);
        descriptifParcours = itemView.findViewById(R.id.tvDateParcours);
    }
}

