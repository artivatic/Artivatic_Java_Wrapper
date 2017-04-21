package module;

import java.util.ArrayList;

/**
 * Created by artivatic on 19/4/17.
 */

public class SuggestionDataModel {
  private   ArrayList<String> userIds = new ArrayList<>();
  public    ArrayList<Filters> filter = new ArrayList<>();

    public ArrayList<String> getUserIDs() {
        return userIds;
    }

    public void setUserIDs(ArrayList<String> userIDs) {
        this.userIds = userIDs;
    }

    public ArrayList<Filters> getFilter() {
        return filter;
    }

    public void setFilter(ArrayList<Filters> filter) {
        this.filter = filter;
    }
}
