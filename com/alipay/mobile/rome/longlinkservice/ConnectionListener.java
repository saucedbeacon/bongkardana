package com.alipay.mobile.rome.longlinkservice;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import java.util.Observable;
import java.util.Observer;

public abstract class ConnectionListener implements Observer {
    public abstract void onConnectionStateChanged(ConnectionEvent connectionEvent);

    public void update(Observable observable, Object obj) {
        if (obj == null) {
            LoggerFactory.getTraceLogger().warn("sync_ConnectionListener", "[update] event data is null.");
        } else if (!(obj instanceof ConnectionEvent)) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            StringBuilder sb = new StringBuilder("[update] Illegal event obj = ");
            sb.append(obj.getClass().getName());
            traceLogger.warn("sync_ConnectionListener", sb.toString());
        } else {
            try {
                ConnectionEvent connectionEvent = (ConnectionEvent) obj;
                TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                StringBuilder sb2 = new StringBuilder("[update] onConnectionStateChanged: ");
                sb2.append(connectionEvent.toString());
                traceLogger2.info("sync_ConnectionListener", sb2.toString());
                onConnectionStateChanged(connectionEvent);
            } catch (Throwable th) {
                TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                StringBuilder sb3 = new StringBuilder("[update] onConnectionStateChanged exception: ");
                sb3.append(th.toString());
                traceLogger3.error("sync_ConnectionListener", sb3.toString(), th);
            }
        }
    }
}
