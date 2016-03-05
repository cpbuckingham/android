package com.example.cpbuckingham.bounded_services;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.example.cpbuckingham.bounded_services.MyService.MyLocalBinder;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    MyService camsService;
    boolean isbound = false;

    public void getTime(View view){
        String currentTime = camsService.getCurrentTime();
        TextView camsText = (TextView) findViewById(R.id.camsText);
        camsText.setText(currentTime);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i = new Intent(this, MyService.class);
        bindService(i, camsConnection, Context.BIND_AUTO_CREATE);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    private ServiceConnection camsConnection = new ServiceConnection(){
        @Override
            public void onServiceConnected(ComponentName name, IBinder service){
                MyLocalBinder binder = (MyLocalBinder) service;
                camsService = binder.getService();
                isbound = true;

        }
            public void onServiceDisconnected(ComponentName name){
                isbound = false;
            }
    };


}
