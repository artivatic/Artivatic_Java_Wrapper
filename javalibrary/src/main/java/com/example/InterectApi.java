package com.example;

import java.util.HashMap;

/**
 * Created by artivatic on 19/4/17.
 */

public class InterectApi {
        /*
    * Call Interact API
    * */

    public String interectAPi(String BASE_URL,String apikey,String userId,String productId,int interactLevel)
    {

        String urladd="interact/"+userId+'/'+productId;
        HashMap<String,Object>map=new HashMap<>();
        map.put("level",interactLevel);

        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
      String response=  apiCalling.postApiCalling(map,urladd);
        return response;



    }
    /*
    call the interect Api with predictionId
     */
    public String interectPredictionAPi(String BASE_URL,String apikey,String userId,String productId,int interactLevel,String predictId)
    {
        String urladd="interact/"+userId+'/'+productId;
        HashMap<String,Object>map=new HashMap<>();
        map.put("level",interactLevel);
        map.put("predictId",predictId);
        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
       String response= apiCalling.postApiCalling(map,urladd);
        return  response;


    }
}
