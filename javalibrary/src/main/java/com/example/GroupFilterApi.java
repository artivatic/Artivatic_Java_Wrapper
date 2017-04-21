package com.example;

import module.GroupFilterData;

/**
 * Created by artivatic on 18/4/17.
 */

public class GroupFilterApi {
    /*
	 * Call group predict with filters
	 */

    public String  predictFilterData(String BASE_URL, String apikey, GroupFilterData groupFilterData)
    {

        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
       String response= apiCalling.postApiCalling(groupFilterData,"groupPredictFilter/details");
        return response;



    }
}
