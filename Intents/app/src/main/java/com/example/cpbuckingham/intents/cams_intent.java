package com.example.cpbuckingham.intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class cams_intent extends IntentService{

    public static final String TAG = "com.example.cpbuckingham.intents";

    public cams_intent(){
        super("cams_intent");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        Log.i(TAG, "The Service has started");
    }

}
