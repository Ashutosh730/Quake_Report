package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class QuakeDetailAdapter extends ArrayAdapter {
    public QuakeDetailAdapter(@NonNull Context context,  @NonNull List objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView=convertView;
        if(itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview, parent, false);
        }

        Earthquake earthquake = (Earthquake) getItem(position);

        TextView mag=itemView.findViewById(R.id.mag);
        mag.setText(earthquake.getMag()+"");

        TextView location=itemView.findViewById(R.id.location);
        location.setText(earthquake.getLocation()+"");

        TextView date=itemView.findViewById(R.id.date);
        date.setText(earthquake.getDate()+"");

        return itemView;
    }
}
