package com.example.a1061985.weebet.Parser;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.a1061985.weebet.Model.DateDeserializer;
import com.example.a1061985.weebet.Model.Match;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JSONparser {

    private static final String MAIN_URL = "http://odds.arneralston.dk/api/matches/1";


    public static final String TAG = "TAG";


   // private static final String KEY_USER_ID = "user_id";

    private static Response response;
    /**
     * Get Data From WEB
     *
     * @return JSON Object
     */
    public static JSONObject getDataFromWeb() {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(MAIN_URL)
                    .build();
            response = client.newCall(request).execute();
            String resString = response.body().string();

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());
            Gson gson = gsonBuilder.create();

            Match[] matches = gson.fromJson(resString, Match[].class);
            JSONObject jsonObject = new JSONObject(resString);
            return jsonObject;
        } catch (@NonNull IOException | JSONException e) {
            Log.e(TAG, "" + e.getLocalizedMessage());
        }
        return null;
    }
}
