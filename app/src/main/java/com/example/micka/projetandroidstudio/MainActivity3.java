package com.example.micka.projetandroidstudio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Data> listData = new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);

        initData();
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(listData);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        listData.add(new Data(R.drawable.alacroiseedesmondes,"A la croisée des mondes"));
        listData.add(new Data(R.drawable.artemisfowl,"Artemis Fowl"));
        listData.add(new Data(R.drawable.harrypotter2,"Harry Potter"));
        listData.add(new Data(R.drawable.hungergames2,"Hunger Games"));
        listData.add(new Data(R.drawable.percyjackson,"Percy Jackson"));
        listData.add(new Data(R.drawable.twilight3,"Twilight"));

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        switch(Item.getItemId()){
            case R.id.exit:
                finish();
                System.exit(1);
                break;

            case R.id.home:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;

            case R.id.refresh:
                Intent intent2 = new Intent(this, MainActivity3.class);
                startActivity(intent2);
                break;

            case R.id.settings:
                Intent intent3 = new Intent(this, MainActivity4.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(Item);
    }
}
