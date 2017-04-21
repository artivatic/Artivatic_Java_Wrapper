package com.example;

import module.GroupData;

/**
 * Created by artivatic on 18/4/17.
 */

public class GroupCreateApi {
     /*
    * Call save group api
    * */

    public String callGroupCreateApi(String BASE_URL, String apikey, GroupData groupData)
    {
        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
      String response =apiCalling.postApiCalling(groupData,"saveGroupDetails");

        return response;
    }
}
