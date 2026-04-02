package dev.omar.nettyproxy.services;

import android.app.Service;
import android.os.IBinder;
import android.content.Intent;

public abstract class BaseService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
