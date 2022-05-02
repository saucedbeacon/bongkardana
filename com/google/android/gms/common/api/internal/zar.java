package com.google.android.gms.common.api.internal;

final class zar implements Runnable {
    private final /* synthetic */ zas zaa;

    zar(zas zas) {
        this.zaa = zas;
    }

    public final void run() {
        this.zaa.zam.lock();
        try {
            this.zaa.zah();
        } finally {
            this.zaa.zam.unlock();
        }
    }
}
