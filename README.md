#    Artivatic Data labs Pvt. Ltd.



#### Features In Artivatic Java Library

- User Registration
- Product Adding
- Adding Interactions
- Product Predictions
   - Single User among all registered products(Including Filters)
    - For Single User among specified products
     - For Groups among all registered products(Including Filters)
      - For Groups among specified products

###  User Registartion
Intialise the Base_url and apikey before proceed to registering the user by calling the following function.



```sh
RegisterUserApi addUserApi=new RegisterUserApi(); 
addUserApi.callRegisterUserApi(BaseUrl,apikey,"{user_id}”,HashMap<String,Object>value); 

```
Keeping track that the keys of the Map of User data are in accordance of the user Meta data provided during Artivatic Sign Up.

### Product Registration
Intialise the Base_url and apikey before proceed to registering the user by calling the following function. 
```sh
AddProductApi addProductApi=new AddProductApi();
addProductApi.addProductData(BaseUrl,apikey,"{product_id}",HashMap<String,Object>value);
```
Keeping track that the keys of the Map of Product data are in accordance of the Product Meta data provided during Artivatic Sign Up.
### Adding Interactions

Interactions can be added to Artivatic using different methods. The data required to add interact are userId, productId and the level of interaction.

The level of interaction is predefined in the SDK for ease of implementation but you may choose to use your own signed integer values to represent the different levels of interaction.
#### Predefined Interaction Levels are as follows :- 

```sh
public static final int DISLIKE = -6;
public static final int NOT_INTERESTED = -3;
public static final int QUICK_DETAILS = 1;
public static final int LONG_VIEW = 2;
public static final int INTERESTED = 3;
public static final int WISHLIST = 4;
public static final int BOUGHT = 5;
public static final int LIKED = 6;
```
```sh
InterectApi interectApi=new InterectApi();
String response= interectApi.interectAPi(BaseUrl,apikey,"{user_id}","{product_id}",{interaction_level});
```
### Predict Products

Initialise the class of UserId , ProductId, CategoryFilter, and Sorts and set the value using set method of each class.
 
```sh
List<UserIds> userIds=new ArrayList<>();
userId.setUserID("{user_id}");
userId.setWeight("{weight}");
userIds.add(userId);
ProductIds productId=new ProductIds("{product_id}");
List<ProductIds> client = new ArrayList<>();
client.add(productId);
List<CategoryFilters> Filter = new ArrayList<>();
CategoryFilters categoryFilters=new CategoryFilters("{Category_name}");
categoryFilters.addFilterColumnEquals("{Attribute_name}","{Value}");
categoryFilters.addFilterColumnGreaterThan("{Attribute_name}","{Value}") 
categoryFilters.addFilterColumnGreaterThanEquals("{Attribute_name}","{Value}");
categoryFilters.addFilterColumnInRange("{Attribute_name}","{MinValue}","{MaxValue}");
categoryFilters.addFilterColumnLessThan("{Attribute_name}","{Value}");
categoryFilters.addFilterColumnLessThanEquals("{Attribute_name}","{Value}");
categoryFilters.addGeoFilterColumnRange("{Attribute_name}","{Latitude}","{Longitude}","{Radius}");
Filter.add(categoryFilters);
List<Sorts> sort = new ArrayList<>();
Sorts sorts=new Sorts("{collumn_name}","{type}");
sort.add(sorts);
filterData =new FilterData(userIds, client, Filter, sort,"{search}");
PredictFilterApi predictFIlterApi=new PredictFilterApi();
String response= predictFIlterApi.predictFilter(filterData,BaseUrl,apikey);
```

### Group Creation
Intialise the class of GroupData and add the client_user_id, ArrayList of client_member_id, add the client_group_id , group_name and artivatic_group_id.sending the apikey and baseurl and the groupData.

```sh
GroupData groupData=new GroupData("{client_user_id}",ArrayList<String> client_member_id,"{client_group_id}","{group_name}","{av_group_id}"); 
GroupCreateApi saveGroupApi=new GroupCreateApi();
saveGroupApi.callGroupCreateApi(BaseUrl,apikey,groupData);
```
- #### User Group :
```sh
UserGroupAPi userGroupAPi=new UserGroupAPi();
userGroupAPi.getUserGroup(BaseUrl,apikey,"{client_user_id}"); 
```
- #### Group Members :
```sh
GroupMemberApi groupMemberApi=new GroupMemberApi();    
groupMemberApi.getGroupMember(BaseUrl,apikey,"{client_group_id}");
```
### suggest UsersToUser
Call the Api suggest user to user
```sh
ArrayList<Filters> filters = new ArrayList<>();
Filters filter_data=new Filters("{type_value}", "{collumn_name}", "{value}");
filters.add(filter_data);
SuggestUsersApi suggestUsersApi=new SuggestUsersApi();   //Intiallise the class
SuggestionDataModel suggestionDataModel=new SuggestionDataModel(); //
suggestionDataModel.setUserIDs(ArrayList<String> userId); 
suggestionDataModel.setFilter(filters);
suggestUsersApi.suggestUsersToUsers(BaseUrl,apikey,suggestionDataModel,"{userid}");
```
### suggest UsersToProduct

```sh

Filters filter_data=new Filters("{type_value}", "{collumn_name}", "{value}");
filters.add(filter_data);
SuggestProductApi suggestProductApi=new SuggestProductApi();
SuggestionDataModel suggestionDataModel=new SuggestionDataModel();
suggestionDataModel.setUserIDs(ArrayList<String> userid)
suggestionDataModel.setFilter(filters);
suggestProductApi.suggestUsersToProduct(BaseUrl,apikey,suggestionDataModel,"{ProductId}");
```
