package com.loveboyuan.smarttrader;
import java.util.ArrayList;

/**
 * Created by jiahui on 10/18/15.
 */
public class FriendList {
    private ArrayList<Profile> friendList;

    public FriendList() {
        this.friendList = new ArrayList<Profile>(1);
    }

    public void add(Profile profile) {
        if (false == this.friendList.contains(profile)) {
            this.friendList.add(profile);
        }
    }

    public void remove(Profile profile) {
        if (this.friendList.contains(profile)) {
            this.friendList.remove(profile);
        }
    }

}
