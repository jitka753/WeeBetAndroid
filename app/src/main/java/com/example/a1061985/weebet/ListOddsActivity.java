package com.example.a1061985.weebet;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

import com.example.a1061985.weebet.Adapter.ListViewAdapter;
import com.example.a1061985.weebet.Parser.JSONparser;
import com.example.a1061985.weebet.Model.Odd;
import com.example.a1061985.weebet.Utils.InternetConnection;
import com.example.a1061985.weebet.Utils.Keys;

import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ListOddsActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Odd> list;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list = new ArrayList<>();
        adapter = new ListViewAdapter(this, list);

        listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);
        // listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //        Snackbar.make(findViewById(R.id.parentLayout), list.get(position).getName() + " => " + list.get(position).getPhone(), Snackbar.LENGTH_LONG).show();
        //   }
        //});
    }

    /**
     * Creating Get Data Task for Getting Data From Web
     */
    class GetDataTask extends AsyncTask<Void, Void, Void> {

        ProgressDialog dialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            /**
             * Progress Dialog for User Interaction
             */
            dialog = new ProgressDialog(ListOddsActivity.this);
            dialog.setTitle("Hey Wait Please...");
            dialog.setMessage("I am getting your JSON");
            dialog.show();
        }
        @Nullable
        @Override
        protected Void doInBackground(Void... params) {

            /**
             * Getting JSON Object from Web Using okHttp
             */
            JSONObject jsonObject = JSONparser.getDataFromWeb();

            try {
                /**
                 * Check Whether Its NULL???
                 */
                if (jsonObject != null) {
                    /**
                     * Check Length...
                     */
                    if(jsonObject.length() > 0) {
                        /**
                         * Getting Array named "contacts" From MAIN Json Object
                         */
                        JSONArray array = jsonObject.getJSONArray(Keys.KEY_MATCH_ID);

                        /**
                         * Check Length of Array...
                         */
                        int lenArray = array.length();
                        if(lenArray > 0) {
                            for(int jIndex = 0; jIndex < lenArray; jIndex++) {

                                /**
                                 * Creating Every time New Object
                                 * and
                                 * Adding into List
                                 */
                                Odd model = new Odd();

                                /**
                                 * Getting Inner Object from contacts array...
                                 * and
                                 * From that We will get Name of that Contact
                                 *
                                 */
                                JSONObject innerObject = array.getJSONObject(jIndex);
                                Double odd1 = innerObject.getDouble(Keys.KEY_ODDS1);
                                Double oddX = innerObject.getDouble(Keys.KEY_ODDSX);
                                Double odd2 = innerObject.getDouble(Keys.KEY_ODDS2);

                                /**
                                 * Getting Object from Object "phone"
                                 */
                              //  JSONObject phoneObject = innerObject.getJSONObject(Keys.KEY_PHONE);
                               // String phone = phoneObject.getString(Keys.KEY_MOBILE);

                                model.setOdd_1(odd1);
                                model.setOdd_2(odd2);
                                model.setOdd_x(oddX);


                                /**
                                 * Adding name and phone concatenation in List...
                                 */
                                list.add(model);
                            }
                        }
                    }
                } else {

                }
            } catch (JSONException je) {
                Log.i(JSONparser.TAG, "" + je.getLocalizedMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            dialog.dismiss();
            /**
             * Checking if List size if more than zero then
             * Update ListView
             */
            if(list.size() > 0) {
                adapter.notifyDataSetChanged();
            } else {
               // Snackbar.make(findViewById(R.id.parentLayout), "No Data Found", Snackbar.LENGTH_LONG).show();
            }
        }
    }
}

