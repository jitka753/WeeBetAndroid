package com.example.a1061985.weebet.Adapter;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.a1061985.weebet.Model.Odd;
import com.example.a1061985.weebet.R;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Odd> {

    List<Odd> odds;
    Context context;
    private LayoutInflater mInflater;


    // Constructors
    public ListViewAdapter(Context context, List<Odd> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        odds = objects;
    }

    @Override
    public Odd getItem(int position) {
        return odds.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         ViewHolder vh;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View view= inflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Odd item = getItem(position);

        vh.textViewOdd1.setText(String.valueOf(item.getOdd_1()));
        vh.textViewOddX.setText(Double.toString(item.getOdd_x()));
        vh.textViewOdd2.setText(Double.toString(item.getOdd_2()));


        return vh.rootView;
    }


    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final TextView textViewOdd1;
        public final TextView textViewOddX;
        public final TextView textViewOdd2;

        private ViewHolder(RelativeLayout rootView, TextView textViewOdd1, TextView textViewOddX,  TextView textViewOdd2) {
            this.rootView = rootView;
            this.textViewOdd1 = textViewOdd1;
            this.textViewOdd2 = textViewOdd2;
            this.textViewOddX = textViewOddX;
        }

        public static ViewHolder create(RelativeLayout rootView) {
            TextView textViewOdd1 = (TextView) rootView.findViewById(R.id.textViewOdd1);
            TextView textViewOddX = (TextView) rootView.findViewById(R.id.textViewOddX);
            TextView textViewOdd2 = (TextView) rootView.findViewById(R.id.textViewOdd2);
            return new ViewHolder(rootView, textViewOdd1, textViewOdd2, textViewOddX);
        }
    }


}



