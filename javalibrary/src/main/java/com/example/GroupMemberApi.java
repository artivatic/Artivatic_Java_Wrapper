package com.example;

import java.util.HashMap;

/**
 * Created by artivatic on 18/4/17.
 */

public class GroupMemberApi {

    /*
	 *  Call group details api
	 */
    public String  getGroupMember(String BASE_URL,String apikey,String client_groupid)
    {
       HashMap<String ,Object>map=new HashMap<>();
        map.put("client_group_id",client_groupid);
        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
      String response=  apiCalling.postApiCalling(map,"getGroupMembers");
        return response;

    }
}
