package com.example.a1061985.weebet.Parser;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.a1061985.weebet.Model.Competition;
import com.example.a1061985.weebet.Model.DateDeserializer;
import com.example.a1061985.weebet.Model.Match;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class JSONparser {

    private static final String MATCHES_URL = "http://odds.arneralston.dk/api/matches/";
    private static final String COMPETITIONS_URL = "http://odds.arneralston.dk/api/competitions/";
    public static final String TAG = "TAG";
    //private static Response response;

    public static ArrayList<Match> getMatchesFromServiceByCompId(int compId) {
            String json = getJSONStringFromURL(MATCHES_URL+compId);
            Gson gson = getGSONObject();
            Match[] matches = gson.fromJson(json, Match[].class);
            ArrayList<Match> res = new ArrayList<>(Arrays.asList(matches));
            return res;
    }

    public static ArrayList<Competition> getCompetitionsFromSportId(int sportId){
            String json = getJSONStringFromURL(COMPETITIONS_URL+sportId);
            Gson gson = getGSONObject();
            Competition[] competitions = gson.fromJson(json, Competition[].class);
            ArrayList<Competition> res = new ArrayList<>(Arrays.asList(competitions));
            return res;
    }

    private static String getJSONStringFromURL(String url){
        String res = "";
        try {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = response = client.newCall(request).execute();;
        res = response.body().string();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }

    private static Gson getGSONObject(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());
        Gson gson = gsonBuilder.create();
        return gson;
    }

    /*
               JSONArray array = array = (JSONArray) new JSONTokener(json).nextValue();
            for (int i = 0; i < array.length(); i++) {
                JSONObject comp = (JSONObject) array.getJSONObject(i);
                int id = comp.getInt("Id");
                int y = 9;
            }
     */
}
