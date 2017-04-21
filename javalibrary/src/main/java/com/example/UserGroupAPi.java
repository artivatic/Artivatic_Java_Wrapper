package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by artivatic on 18/4/17.
 */

public class UserGroupAPi {

    /*
	 *  Call group list api
	 */


      public String getUserGroup(String BASE_URL, String apikey, String client_user_id)
    {
        Map<String,Object> userIdList = new HashMap<>();
        userIdList.put("client_user_id",client_user_id);

        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
        String reuslt=apiCalling.postApiCalling(userIdList,"getUserGroups");

        return reuslt;

    }

}
