package com.example.cacccc;

import java.io.IOException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

class Server {

    private static DefaultHttpClient client = new DefaultHttpClient();

    static class NewGame extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... params) {
            HttpUriRequest request = new HttpPost("http://popong.herokuapp.com/game");
            try {
                String json = EntityUtils.toString(client.execute(request).getEntity());
                System.out.println(json);
                ScoreBoard.gameId = new Gson().fromJson(json, JsonObject.class).get("id").getAsString();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Couldnt connect to the server");
            }
            return null;
        }
    }

    static class Score extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... params) {
            HttpUriRequest request = new HttpPost("http://popong.herokuapp.com/game/" + params[0] + "/score/"
                    + params[1]);
            try {
                client.execute(request);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Couldnt connect to the server");
            }
            return null;
        }
    }
}
