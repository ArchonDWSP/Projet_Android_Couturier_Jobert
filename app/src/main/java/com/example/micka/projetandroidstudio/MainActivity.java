package com.example.micka.projetandroidstudio;

import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.micka.projetandroidstudio.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements Navigator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding b =((ActivityMainBinding) DataBindingUtil.setContentView(this, R.layout.activity_main));
        b.setViewModel(new MainViewModel(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void goToActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        this.startActivity(intent);
    }

    @Override
    public void goToActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        this.startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finish();
            }
        });
        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem Item) {
        switch (Item.getItemId()) {
            case R.id.exit:
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Exit ?");
                builder.setCancelable(true);
                builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });
                builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                break;

            case R.id.settings:
                Intent intent1 = new Intent(this, MainActivity4.class);
                this.startActivity(intent1);
                break;
        }

        return super.onOptionsItemSelected(Item);
    }
}



