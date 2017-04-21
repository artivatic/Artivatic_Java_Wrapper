package module;

import java.util.ArrayList;

/**
 * Created by artivatic on 18/4/17.
 */


    public class GroupData {
        private String client_user_id="";
        private ArrayList<String> client_member_id = new ArrayList<>();
        private String client_group_id = "";
        private String group_name = "";
        private String av_group_id = "";

        public GroupData(String client_user_id, ArrayList<String> client_member_id, String client_group_id, String group_name, String av_group_id) {
            this.client_user_id = client_user_id;
            this.client_member_id = client_member_id;
            this.client_group_id = client_group_id;
            this.group_name = group_name;
            this.av_group_id = av_group_id;
        }






}
