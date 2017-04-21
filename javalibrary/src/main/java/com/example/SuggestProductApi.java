package com.example;

import module.SuggestionDataModel;

/**
 * Created by artivatic on 19/4/17.
 */

public class SuggestProductApi {
    /*
	 * Call user to product suggestion api
	 */
    public String  suggestUsersToProduct(String BASE_URL, String apikey, SuggestionDataModel suggestionDataModel, String productId)
    {
ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
       String response =apiCalling.postApiCalling(suggestionDataModel,"suggestUsersToProduct/details/"+productId);
        return response;


    }

}
