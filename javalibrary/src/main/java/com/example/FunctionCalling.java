package com.example;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;


import module.FilterData;
import module.Filters;
import module.GroupData;
import module.SuggestionDataModel;
import module.UserIds;

/**
 * Created by artivatic on 18/4/17.
 */

public class FunctionCalling {
    static UserIds userId=new UserIds("1","0.6");
    static ArrayList<String>response;

  //  static List<UserIds> userIds=new ArrayList<>();
    static FilterData filterData;
  //  static List<ProductIds> client = new ArrayList<>();
  //  static List<CategoryFilters> Filter = new ArrayList<>();
    //static List<Sorts> sort = new ArrayList<>();
    static   String  search="";
    public static final String BaseUrl="http://49.204.83.22:9000/";
    static String  apikey="pSbdBxrduu27JoY5pWZ9TQ==";
    public static void main(String args[])
    {
      /*
        Call group list api
         */

//        UserGroupAPi userGroupAPi=new UserGroupAPi();  //initialte the UserGroupApi.class
//        String result=  userGroupAPi.getUserGroup(BaseUrl,apikey,"{client_user_id}");  //call the  api response
//        System.out.print(result);


        /*

 *  Call MetaData Api
 */


//        GetMetaApi getMetaApi=new GetMetaApi();  // call the getMetaData
//        String response=getMetaApi.getMetaData(BaseUrl,apikey); //Call user Register API
//        System.out.print(response);



        /*
	 * Call user Register API
	 *
	 */

//        HashMap<String,Object>map=new HashMap<>();
//        map.put("name","shikha");
//        map.put("id","2");
//        map.put("degree","btech");
//        RegisterUserApi addUserApi=new RegisterUserApi();   // add user data
//        String result= addUserApi.callRegisterUserApi(BaseUrl,apikey,"1",map);  //call the api
//        System.out.print(result);



        /*
Call Product add API
 */

//        HashMap<String,Object> map=new HashMap<>();
//        map.put("category","baby-gear");
//        map.put("id","14");
//        map.put("year","3");
//        map.put("price","1408");
//
//        AddProductApi addProductApi=new AddProductApi();
//
//        String result= addProductApi.addProductData(BaseUrl,apikey,"f823",map);
//        System.out.print(result);

//
        /*
Call save group api
         */


//        ArrayList<String>addmember=new ArrayList<>();
//        addmember.add("500");
//        addmember.add("144");
//        GroupData groupData=new GroupData("1",addmember,"","av_rebel-different-v2-0","");
//
//      GroupCreateApi saveGroupApi=new GroupCreateApi();
//        String result=saveGroupApi.callGroupCreateApi(BaseUrl,apikey,groupData);
//        System.out.print(result);



//
        /*
   Call  predict with filters
         */

//        userId.setUserID("1");
//        userId.setWeight("0.6");
//        userIds.add(userId);
//        filterData =new FilterData(userIds, client, Filter, sort,search);
//        PredictFilterApi predictFIlterApi=new PredictFilterApi();
//      String response=  predictFIlterApi.predictFilter(filterData,BaseUrl,apikey);
//        System.out.print(response);




//
//        List<UserIds> userIds=new ArrayList<>();
//        userId.setUserID("{user_id}");
//        userId.setWeight("{weight}");
//        userIds.add(userId);
//        ProductIds productId=new ProductIds("{product_id}");
//
//        List<ProductIds> client = new ArrayList<>();
//        client.add(productId);
//        List<CategoryFilters> Filter = new ArrayList<>();
//        CategoryFilters categoryFilters=new CategoryFilters("{Category_name}");
//        categoryFilters.addFilterColumnEquals("{Attribute_name}","{Value}");
//        categoryFilters.addFilterColumnGreaterThan("{Attribute_name}","{Value}");
//        categoryFilters.addFilterColumnGreaterThanEquals("{Attribute_name}","{Value}");
//        categoryFilters.addFilterColumnInRange("{Attribute_name}","{MinValue}","{MaxValue}");
//        categoryFilters.addFilterColumnLessThan("{Attribute_name}","{Value}");
//        categoryFilters.addFilterColumnLessThanEquals("{Attribute_name}","{Value}");
//        categoryFilters.addGeoFilterColumnRange("{Attribute_name}","{Latitude}","{Longitude}","{Radius}");
//        Filter.add(categoryFilters);
//        List<Sorts> sort = new ArrayList<>();
//        Sorts sorts=new Sorts("{collumn_name}","{type}");
//        sort.add(sorts);
//
//
//        filterData =new FilterData(userIds, client, Filter, sort,"{search}");
//        PredictFilterApi predictFIlterApi=new PredictFilterApi();
//      String response=  predictFIlterApi.predictFilter(filterData,BaseUrl,apikey);
//        System.out.print(response);





//
//        $suggestBody=new SuggestionData(); //Intiallise the class
//        $suggestBody->set_userIds(array("1","2"));// Add arrayList of userid
//        $filterValue=new TypeValue(); //TypeValue class is the Filter class inside the SuggestionaData class
//        $filterValue->filterDataList("{collumn_name}","{type_value}","{value}");// AddData in filter collumn_name,type_value,value;
// $filterValue->addFilterColumnEquals($attributeName,  $value); //Add the attributeName and value
// $filterData->addFilterCollumnLessThan($attributeName,  $value); //Whose column_name is Less Than
// $filterData->addFilterCollumnGreaterThan($attributeName,  $value); //Whose column_name is Greater Than
// $filterData->addFilterCollumnLessThanEquals($attributeName,  $value);//Whose column_name is LessThanEquals
// $filterData->addFilterCollumnGreaterThanEquals($attributeName,  $value);


        /*
Call group predict with filters
         */
//
//        GroupFilterData groupFilterData=new GroupFilterData("",client,Filter,sort,"");
//        userId.setUserID("1");
//        userId.setWeight("0.6");
//        GroupFilterApi groupFIlterApi=new GroupFilterApi();
//        String response=groupFIlterApi.predictFilterData(BaseUrl,apikey,groupFilterData);
//        System.out.print(response);

//
        /*
Call group details api
         */

//        GroupMemberApi groupMemberApi=new GroupMemberApi();
//       String  response= groupMemberApi.getGroupMember(BaseUrl,apikey,"{client_group_id}");
//        System.out.print(response);

        /*Call Interact API

         */


//        InterectApi interectApi=new InterectApi();
//      String response=  interectApi.interectAPi(BaseUrl,apikey,"1","f823",9);
//       System.out.print(response);
//
///*
 /*
	 * Call user to product suggestion api
	 */


//
//        ArrayList<String> user_data=new ArrayList<>();
//        user_data.add("1");
//        user_data.add("2");
//        ArrayList<Filters> filters = new ArrayList<>();
////
//        Filters filter_data=new Filters("{type_value}", "{collumn_name}", "{value}");
//
//        filters.add(filter_data);
//        SuggestProductApi suggestProductApi=new SuggestProductApi();
//        SuggestionDataModel suggestionDataModel=new SuggestionDataModel();
//        suggestionDataModel.setUserIDs(user_data);
//        suggestionDataModel.setFilter(filters);
//       String response= suggestProductApi.suggestUsersToProduct(BaseUrl,apikey,suggestionDataModel,"f823");
//        System.out.print(response);

/*
Call the Api suggest user to user
 */
//
//        ArrayList<String> user_data=new ArrayList<>(); //Add the user_data in ArrayList
//        user_data.add("1");//  add the data in Array_List
//        user_data.add("2");
//        ArrayList<Filters> filters = new ArrayList<>();
//
//        Filters filter_data=new Filters("{type_value}", "{collumn_name}", "{value}");
//
//        filters.add(filter_data);
//
//
//        SuggestUsersApi suggestUsersApi=new SuggestUsersApi();   //Intiallise the class
//        SuggestionDataModel suggestionDataModel=new SuggestionDataModel(); //
//        suggestionDataModel.setUserIDs(user_data); // set the userId
//        suggestionDataModel.setFilter(filters);
//
//        String response=suggestUsersApi.suggestUsersToUsers(BaseUrl,apikey,suggestionDataModel,"1");
//      // add the value in map
//        System.out.print(response);




    }
}
