package com.loveboyuan.smarttrader;

/**
 * Created by boyuangu on 2015-10-24.
 */

// We need a TradeHistory controller to interact with user behaviours by access TradeHistory model

public class TradeHistoryController {
    private static TradeHistory tradeHistory = null;

    static public TradeHistory getTradeHistory() {
        if (tradeHistory == null) {
            return new TradeHistory();

        } else {
            return tradeHistory;

        }

    }

    public void addTrade(Trade trade) {


    }

    public void removeTrade(Trade trade) {
    }


    public void editTrade(Trade trade){


    }
}
