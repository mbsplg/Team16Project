package com.loveboyuan.smarttrader;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.ArrayList;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

/*
    public void testTrade(){

        // First, we create two users. One is borrower and the other one is owner
        User borrower = new User();
        User owner = new User();

        // Then, we get the inventories of both users(borrower and owner)
        Inventory bInventory = borrower.getInventory();
        Inventory oInventory = owner.getInventory();

        // Add an item to each of the users's inventory
        Item bItem = new Item();
        Item oItem = new Item();
        bInventory.addItem(bItem);
        oInventory.addItem(oItem);

        // borrower wants to trade bitem for oitem with owner
        // A trade will consist of an item from the owner's inventory and 0 or more items from the borrower's inventory.
        ArrayList<Item> bItems = new ArrayList<Item>();
        bItems.add(bItem);

        // Now the borrower's willing to trade items in bitems for owner's oitem
        Trade trade = new Trade(owner, oItem, borrower, bItems);
        borrower.proposeTrade(trade);


        // 1.Borrower proposed the trade, let's test if owner receives the same trade.
        TradeHistory bTradeHistory = borrower.getTradeHistory();
        TradeHistory oTradeHistory = owner.getTradeHistory();
        assertTrue(bTradeHistory.getTrade(0).equals(oTradeHistory.getTrade(0)));


        // 2.Assume the owner accepted the trade, let's test if trade result is success or not
        owner.getTradeHistory().getTrade(0).acceptTrade();
        assertTrue(borrower.getTradeHistory().getTrade(0).getTradeResult());


        // 3.Assume the owner rejected the trade, let's test if trade result is failure or not
        owner.getTradeHistory().getTrade(0).rejectTrade();
        assertFalse(borrower.getTradeHistory().getTrade(0).getTradeResult());


        // 4.Assume the owner rejected the trade and then proposed a counter trade, let's test if the
        //  counter trade is correctly initialized
        Trade counterTrade = owner.getTradeHistory().getTrade(0).makeCounterTrader();
        owner.proposeTrade(counterTrade);

        assertTrue(borrower.getTradeHistory().getTrade(1).getOwner().equals(borrower));
        assertTrue(borrower.getTradeHistory().getTrade(1).getBorrower().equals(owner));
        ArrayList<Item> testItems = new ArrayList<Item>();
        testItems.add(oItem);
        assertTrue(borrower.getTradeHistory().getTrade(1).getBItems().equals(testItems));
        assertTrue(borrower.getTradeHistory().getTrade(1).getOItem() == null);



        // 5.Assume the User edit the trade(oItem and bItems), let's test if the trade is correctly edited
        Item newBItem = new Item();
        Item newOItem = new Item();
        bInventory.addItem(newBItem);
        oInventory.addItem(newOItem);
        ArrayList<Item>newBItems = new ArrayList<Item>();
        newBItems.add(newBItem);

        borrower.getTradeHistory().getTrade(0).editOItem(newOItem);
        borrower.getTradeHistory().getTrade(0).editBItems(newBItems);

        assertTrue(owner.getTradeHistory().getTrade(0).getOItem().equals(newOItem));
        assertTrue(owner.getTradeHistory().getTrade(0).getBItems() == newBItems);


        // 6.As a borrower, when composing a trade or counter-trade I can delete the trade

        owner.deleteTrade(counterTrade);
        assertTrue(borrower.getTradeHistory().size() == 1);

        borrower.deleteTrade(trade);
        assertTrue(owner.getTradeHistory().size() == 0);


    }
*/

}