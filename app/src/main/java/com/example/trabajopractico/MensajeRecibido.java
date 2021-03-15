package com.example.trabajopractico;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MensajeRecibido extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Has recibido un mensaje",Toast.LENGTH_LONG).show();
    }
}
