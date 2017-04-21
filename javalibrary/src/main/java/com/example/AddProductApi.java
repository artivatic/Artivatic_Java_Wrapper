package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by artivatic on 18/4/17.
 */

public class AddProductApi {
     /*
    * Call user Register API
    * */



    public String  addProductData(String BaseUrl,String ApiKey,String productId,Map<String,Object> body)
    {
        ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BaseUrl,ApiKey);
      String response =apiCalling.postApiCalling(body,"product"+'/'+productId);

        return response;

    }

}
