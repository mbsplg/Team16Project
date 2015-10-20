package team16project.textbooktrader;
import java.util.ArrayList;

/**
 * Created by boyuangu on 2015-10-16.
 */
public class TradeHistory {

    // A TradeHistory has an array list of trades
    private ArrayList<Trade> trades = new ArrayList<Trade>();


    // TradeHistory can get any trade with index provided
    public Trade getTrade(int i) {

        return trades.get(i);
    }

    // TradeHistory can add trade (in "trades")
    public void addTrade(Trade trade) {
        trades.add(trade);
    }

    // TradeHistory can delete trade
    public void removeTrade(Trade trade) {
        trades.remove(trade);
    }

    // TradeHistory can get size of the trades list
    public int size() {
        return trades.size();
    }

}
