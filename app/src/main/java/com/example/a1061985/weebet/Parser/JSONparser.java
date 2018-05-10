package com.example.a1061985.weebet.Parser;

import android.support.annotation.NonNull;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class JSONparser {

    private static final String MAIN_URL = "http://odds.arneralston.dk/api/matches/1";


    public static final String TAG = "TAG";

    private static final String KEY_MATCH_ID = "MatchId";

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
            return new JSONObject(response.body().string());
        } catch (@NonNull IOException | JSONException e) {
            Log.e(TAG, "" + e.getLocalizedMessage());
        }
        return null;
    }
}
