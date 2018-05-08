package com.example.a1061985.weebet.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.a1061985.weebet.Model.Match;
import com.example.a1061985.weebet.Model.Odds;
import com.example.a1061985.weebet.R;

import java.util.List;

public class OddsAdapter extends ArrayAdapter<Odds> {

    private List<Odds> odds;
    Context context;


    public OddsAdapter(@NonNull Context context, List<Odds> objects) {
        super(context, 0, objects);
        this.context = context;
        odds = (List<Odds>) objects;
    }

    private class ViewHolder {
        TextView textViewVendorName;
        TextView textViewOdd1;
        TextView textViewOdd2;
        TextView textViewOddX;

        public ViewHolder(View v) {
            textViewVendorName = v.findViewById(R.id.textViewVendorName);
            textViewOdd1 = v.findViewById(R.id.textViewOdd1);
            textViewOdd2 = v.findViewById(R.id.textViewOdd2);
            textViewOddX = v.findViewById(R.id.textViewOddX);
        }
    }

    @Override
    public Odds getItem(int position) {
        return odds.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        ViewHolder viewHolder;
        //DataRecording dataRecording = getItem(position);
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.layout_odds_row, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Odds item = getItem(position);
        viewHolder.textViewVendorName.setText(String.valueOf(item.getVendor().getName()));
        viewHolder.textViewOdd1.setText(String.valueOf(item.getOdds1()));
        viewHolder.textViewOdd2.setText(String.valueOf(item.getOdds2()));
        viewHolder.textViewOddX.setText(String.valueOf(item.getOddsX()));


        return convertView;
    }

}

