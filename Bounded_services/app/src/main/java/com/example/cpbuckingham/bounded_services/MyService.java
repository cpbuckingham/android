package com.example.cpbuckingham.bounded_services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;


public class MyService extends Service {

    private final IBinder camsBinder = new MyLocalBinder();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return camsBinder;
    }

    public String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss", Locale.US);
        return (df.format(new Date()));
    }


    public class MyLocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
}
