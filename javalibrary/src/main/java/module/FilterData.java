package module;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artivatic on 18/4/17.
 */

public class FilterData {

        List<UserIds> userIds = new ArrayList<>();
        List<ProductIds> products = new ArrayList<>();
        List<CategoryFilters> filter = new ArrayList<>();
        List<Sorts> sort = new ArrayList<>();
        String search = "";
        public List<UserIds> getUserIds() {
            return userIds;
        }

        public void setUserIds(List<UserIds> userIds) {
            this.userIds = userIds;
        }

        public List<ProductIds> getProducts() {
            return products;
        }

        public void setProducts(List<ProductIds> products) {
            this.products = products;
        }

        public List<CategoryFilters> getFilter() {
            return filter;
        }

        public void setFilter(List<CategoryFilters> filter) {
            this.filter = filter;
        }

        public FilterData(List<UserIds> userIds, List<ProductIds> client, List<CategoryFilters> filter, List<Sorts> sort,String search) {
            this.userIds = userIds;
            this.products = client;
            this.sort = sort;
            this.search=search;
            this.filter = filter;
        }

}
