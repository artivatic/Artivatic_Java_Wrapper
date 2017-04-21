package com.example;

import module.FilterData;

/**
 * Created by artivatic on 18/4/17.
 */

public class PredictFilterApi {
     /*
    * Call predict with filters
    * */


    public String predictFilter( FilterData filterData,String BASE_URL,String apikey)
    {
        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
      String response=  apiCalling.postApiCalling(filterData,"predictFilter/details");
        return response;



    }
}
