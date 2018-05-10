package com.example.a1061985.weebet;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;

import com.example.a1061985.weebet.Adapter.ListViewAdapter;
import com.example.a1061985.weebet.Model.Match;
import com.example.a1061985.weebet.Parser.JSONparser;
import com.example.a1061985.weebet.Model.Odds;
import com.example.a1061985.weebet.Utils.Keys;

import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ListOddsActivity extends AppCompatActivity {

    private ListView listView;
  //  private ArrayList<Odds> list;
    private ArrayList<Match> matches;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

       // list = new ArrayList<>();
        matches = new ArrayList<>();
        adapter = new ListViewAdapter(this, matches);

        listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);
        // listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //        Snackbar.make(findViewById(R.id.parentLayout), list.get(position).getName() + " => " + list.get(position).getPhone(), Snackbar.LENGTH_LONG).show();
        //   }
        //});
        GetDataTask task = new GetDataTask();
        task.execute();
    }

    //Creating Get Data Task for Getting Data From Web
    class GetDataTask extends AsyncTask<Void, Void, ArrayList<Match>> {

        ProgressDialog dialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            // Progress Dialog for User Interaction
            dialog = new ProgressDialog(ListOddsActivity.this);
            dialog.setTitle("Wait Please...");
            dialog.setMessage("Matches are loading..");
            dialog.show();
        }

        @Nullable
        @Override
        protected ArrayList<Match> doInBackground(Void... params) {

            //0 Getting JSON Object from Web Using okHttp
            ArrayList<Match> matches = JSONparser.getDataFromWeb();
            return matches;
        }

        @Override
        protected void onPostExecute(ArrayList<Match> matches) {
            dialog.dismiss();

            // Checking if List size if more than zero then Update ListView
            if (matches.size() > 0) {

                adapter = new ListViewAdapter(getApplicationContext(), matches);
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            } else {
            }
        }
    }
}


