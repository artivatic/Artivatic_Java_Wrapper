package com.example;

import module.SuggestionDataModel;

/**
 * Created by artivatic on 19/4/17.
 */

public class SuggestUsersApi {
    /*
      * Call the Api suggest user to user
      */
    public String  suggestUsersToUsers(String BASE_URL, String apikey, SuggestionDataModel suggestionDataModel, String userId)
    {

		ApiCalling apiCalling=new ApiCalling();
        apiCalling.addApiKey(BASE_URL,apikey);
        String response =apiCalling.postApiCalling(suggestionDataModel,"suggestUsersToUser/details/"+userId);
        return  response;


    }

}
