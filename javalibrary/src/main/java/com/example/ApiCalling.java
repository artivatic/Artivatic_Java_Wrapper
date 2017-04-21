package com.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import module.FilterData;
import module.GroupData;
import module.GroupFilterData;
import module.SuggestionDataModel;

/**
 * Created by artivatic on 18/4/17.
 */

public class ApiCalling {

    public   String BASE_URL = "";
    String apikey="";
    StringBuilder result;


    public void addApiKey(String BASE_URL,String apikey)
    {
        this.BASE_URL=BASE_URL;
        this.apikey=apikey;

    }

    public String getApiCalling(String addurl)
    {try
    {
        String inputUrl=BASE_URL + addurl;
        URL url = new URL(inputUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);

        conn.setRequestMethod("GET");
        conn.setRequestProperty("apikey", apikey);
        conn.setRequestProperty("Content-Type", "application/json");

        conn.connect();

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }
        result= new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));
        System.out.print(br.readLine());

        String output;

        while ((output = br.readLine()) != null) {

            result.append(output);

        }

        conn.disconnect();

    } catch (MalformedURLException e) {

        e.printStackTrace();

    } catch (IOException e) {

        e.printStackTrace();
    }
return result.toString();

    }

    public <T> String postApiCalling( T body, String addurl) {
        try {
            String inputUrl=BASE_URL + addurl;
            URL url = new URL(inputUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("apikey", this.apikey);
            conn.setRequestProperty("Content-Type", "application/json");


                conn.setRequestMethod("POST");
                Gson gson = new Gson();
                String s2 = gson.toJson(body);
                   System.out.print(s2);

                HashMap<String, Object> map = new HashMap<>();


                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(s2);
                writer.flush();
                writer.close();
                os.close();

            conn.connect();

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            result= new StringBuilder();

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            System.out.print(br.readLine());

            String output;

            while ((output = br.readLine()) != null) {

                result.append(output);

            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }


        return result.toString();
    }

}


