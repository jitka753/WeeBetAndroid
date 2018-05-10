package com.example.a1061985.weebet.Adapter;



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.a1061985.weebet.ListOddsActivity;
import com.example.a1061985.weebet.Model.Match;
import com.example.a1061985.weebet.Model.Odds;
import com.example.a1061985.weebet.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Match> {

    private List<Match> matches;
    Context context;
    private LayoutInflater mInflater;


    public ListViewAdapter(@NonNull Context context, List<Match> objects) {
        super(context, 0, objects);
        this.context = context;
        matches = (List<Match>) objects;
    }

    private class ViewHolder {
        TextView textview_list_contendentAway;
        TextView textview_list_contendentHome;
        ListView oddsList;
        OddsAdapter adapter;

        public ViewHolder(View v) {
            textview_list_contendentAway = v.findViewById(R.id.textview_list_contendentAway);
            textview_list_contendentHome = v.findViewById(R.id.textview_list_contendentHome);
            oddsList = v.findViewById(R.id.ListOdds);
        }
    }

    @Override
    public Match getItem(int position) {
        return matches.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        ViewHolder viewHolder;
        //DataRecording dataRecording = getItem(position);
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.layout_row_view, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Match item = getItem(position);
        viewHolder.textview_list_contendentAway.setText(String.valueOf(item.getContendentAway().getName()));
        viewHolder.textview_list_contendentHome.setText(String.valueOf(item.getContendentHome().getName()));

        viewHolder.adapter= new OddsAdapter(getContext(), item.getOdds());
        viewHolder.oddsList.setAdapter(viewHolder.adapter);

        return convertView;
    }

}



