package com.example.ade.slametinmasyarakatapp.Service;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Ade on 22/01/2018.
 */

public class MyFirebaseMessaging extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(final RemoteMessage remoteMessage) {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MyFirebaseMessaging.this,""+remoteMessage.getNotification().getBody(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
