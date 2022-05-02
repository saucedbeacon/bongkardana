package com.google.android.gms.common.api.internal;

import android.os.IBinder;

final /* synthetic */ class zabq implements Runnable {
    private final NonGmsServiceBrokerClient zaa;
    private final IBinder zab;

    zabq(NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.zaa = nonGmsServiceBrokerClient;
        this.zab = iBinder;
    }

    public final void run() {
        this.zaa.zaa(this.zab);
    }
}
