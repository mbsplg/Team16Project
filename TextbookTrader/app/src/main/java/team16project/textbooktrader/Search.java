package team16project.textbooktrader;
import java.util.ArrayList;

/**
 * Created by nabdulla on 2015-10-19.
 */
public interface Search {

    /*
    jiahui changed this file on 21/Oct/2015
     */

    //Searching for items
    Item searchItem();

    //Searching for friends
    Profile searchProfile();

    //Searching a previous trade made
    Trade searchTrade();
}