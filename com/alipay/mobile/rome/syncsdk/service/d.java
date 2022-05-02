package com.alipay.mobile.rome.syncsdk.service;

import com.alipay.mobile.rome.longlinkservice.ConnectionEvent;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.Observable;

public final class d extends Observable {
    public final void a(ConnectionEvent connectionEvent) {
        try {
            setChanged();
            super.notifyObservers(connectionEvent);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("[notifyObservers] Exception: ");
            sb.append(th.toString());
            c.a("ConnectionStateObservable", sb.toString(), th);
        }
    }
}
