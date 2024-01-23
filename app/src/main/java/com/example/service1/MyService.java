package com.example.service1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {


    public MyService() {


    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        for (int i = 0; i<=100;i++){
            Log.i("App...","inside loop " + i);
        }


        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        Log.i("App...","inside on Destroy");
        super.onDestroy();
    }
}