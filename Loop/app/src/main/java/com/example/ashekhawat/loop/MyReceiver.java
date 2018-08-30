package com.example.ashekhawat.loop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "MY_CUSTOM_INTENT DETECTED", Toast.LENGTH_SHORT).show();
        Log.d("ANDROID LOGGED: ", "THIS IS BEING LOGGED");
    }
}
