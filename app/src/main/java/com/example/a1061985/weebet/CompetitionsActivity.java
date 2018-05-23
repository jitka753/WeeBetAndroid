package com.example.a1061985.weebet;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.a1061985.weebet.Model.Competition;
import com.example.a1061985.weebet.Model.Match;
import com.example.a1061985.weebet.Parser.JSONparser;

import java.util.ArrayList;

public class CompetitionsActivity extends AppCompatActivity {

    private ListView listComp;
    private ArrayAdapter<Competition> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions);
        listComp = findViewById(R.id.listViewCompetitions);
        Intent intent = getIntent();
        int sportId = intent.getIntExtra("sportId",1);
        GetDataTask task = new GetDataTask();
        task.execute(sportId);

    }

    public class GetDataTask extends AsyncTask<Integer, Void, ArrayList<Competition>> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
/*
            // Progress Dialog for User Interaction
            ProgressDialog dialog = new ProgressDialog(getApplicationContext());
            dialog.setTitle("Wait Please...");
            dialog.setMessage("Matches are loading..");
            dialog.show();*/
        }
        @Override
        protected ArrayList<Competition> doInBackground(Integer... ints) {
            int sportId = ints[0];
            ArrayList<Competition> competitions = JSONparser.getCompetitionsFromSportId(sportId);
            return competitions;
        }

        @Override
        protected void onPostExecute(ArrayList<Competition> competitions) {
            super.onPostExecute(competitions);

            adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_selectable_list_item, competitions);
            listComp.setAdapter(adapter);

            listComp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getApplicationContext(), ListOddsActivity.class);
                    int compId = adapter.getItem(position).getId();
                    intent.putExtra("compId", compId);
                    startActivity(intent);
                }
            });
        }
    }
}
