package com.example.cpbuckingham.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "camsMessage";
    // creating logs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //first to log, as its creating
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i(TAG, "onCreate");
        
    }

    @Override
    protected void onStart() {
        //starting application
        super.onStart();
        Log.i(TAG, "onStart");
        }


    @Override
    protected void onResume() {
        //the user is now looking at this screen
        super.onResume();
        Log.i(TAG, "onResume");
        }


    @Override
    protected void onPause() {
        //paused
        super.onPause();
        Log.i(TAG, "onPause");
        }


    @Override
    protected void onStop() {
        //suspended state
        super.onStop();
        Log.i(TAG, "onStop");
        }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
        }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
        }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
