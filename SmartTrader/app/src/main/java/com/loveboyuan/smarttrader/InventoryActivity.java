package com.loveboyuan.smarttrader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;

public class InventoryActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);


        ListView inventoryListView = (ListView) findViewById(R.id.inventoryListView);
        Collection<Item> items = InventoryController.getInventoryModel().getInventory();
        final ArrayList<Item> list = new ArrayList<Item>(items);
        final ArrayAdapter<Item> inventoryAdapter = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1, list);;
        inventoryListView.setAdapter(inventoryAdapter);

    //    InventoryController.getInventoryModel().addItem(new Item("a","b",1,"c",Boolean.TRUE,"d","e"));



        InventoryController.getInventoryModel().addMyObserver(new MyObserver() {
            @Override
            public void update() {
                list.clear();
                Collection<Item> item = InventoryController.getInventoryModel().getInventory();
                list.addAll(item);
                inventoryAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inventory, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // user wants to add an Item to his/her inventory
    public void addItem(View view){
        Intent intent = new Intent(InventoryActivity.this, ItemActivity.class);

        startActivity(intent);

    }


}
