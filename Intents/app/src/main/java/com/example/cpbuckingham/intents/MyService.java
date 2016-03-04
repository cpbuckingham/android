package com.example.cpbuckingham.intents;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

        public static final String TAG = "com.example.cpbuckingham.intents";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i(TAG, "onStartCommand");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    long futureTime = System.currentTimeMillis()+5000;
                    while(System.currentTimeMillis()< futureTime){
                        synchronized (this){
                            try{
                                wait(futureTime-System.currentTimeMillis());
                                Log.i(TAG, "Service is doing something");
                            }catch(Exception e){}
                        }
                    }
                }
            }
        };

        Thread camsThread = new Thread(r);
        camsThread.start();
        return Service.START_STICKY;

    }

    @Override
    public void onDestroy(){
        Log.i(TAG, "destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
