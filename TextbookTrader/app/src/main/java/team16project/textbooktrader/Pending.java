package team16project.textbooktrader;
import java.util.ArrayList;

public class Pending {

    //A pending friend request has a requester(person who requests to be a friend)
    private User requester;

    //A pending friend request has an owner
    private User owner;

    //An owner has a list of users that have requested them
    private ArrayList<Item> receivedFriendRequests;

    //An owner has a list of users they have sent friend requests to
    private ArrayList<Item> sentFriendRequests;

    //An owner can accept the friend request or deny it
    private boolean friendResult;

    //Pending  can get the owner of the request
    public User getOwner() {
        return owner;
    }

    //Pending can get the requester
    public User getRequester() {
        return requester;
    }

    //Pending can get list of received friend requests
    public ArrayList<Item> getReceivedFriendRequests() {
        return this.receivedFriendRequests;
    }

    //Pending can get list of sent friend requests
    public ArrayList<Item> getSentFriendRequests() {
        return this.sentFriendRequests;
    }

    //Pending can get result of friend request
    public boolean getFriendResult() {
        return friendResult;
    }

    //Owner can accept friend request
    public void acceptFriend() {
        this.friendResult = Boolean.TRUE;
        //remove from list of pending friend requests
        // add users to each others friend lists (not exactly sure how we are going to implement this yet)
    }

    //Owner can reject friend request
    public void rejectFriend() {
        this.friendResult = Boolean.FALSE;
        //remove from list of pending friend requests
    }
}
