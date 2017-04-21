package com.example;

/**
 * Created by artivatic on 18/4/17.
 */

public class GetMetaApi {

    /*
 *  Call user Register API
 */
    public String  getMetaData(String BASE_URL,String apikey)
    {
        ApiCalling apiCalling=new ApiCalling();

       apiCalling.addApiKey(BASE_URL,apikey);
        String response=apiCalling.getApiCalling("getclient/metadata");

        return response;
    }

}
