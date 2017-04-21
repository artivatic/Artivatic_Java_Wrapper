package com.example;

import java.util.Map;

/**
 * Created by artivatic on 18/4/17.
 */

public class RegisterUserApi {
    /*
	 * Call user Register API
	 *
	 */
    public String callRegisterUserApi(String BASE_URL,String apikey,String userId,Map<String ,Object> body)
    {
       ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
        String response= apiCalling.postApiCalling(body,"user"+'/'+userId);
        return response;
    }
}
