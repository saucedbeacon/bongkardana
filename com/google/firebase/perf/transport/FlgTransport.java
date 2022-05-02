package com.google.firebase.perf.transport;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.PerfMetric;
import o.getColumnCount;

final class FlgTransport {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private Transport<PerfMetric> flgTransport;
    private final Provider<TransportFactory> flgTransportFactoryProvider;
    private final String logSourceName;

    FlgTransport(Provider<TransportFactory> provider, String str) {
        this.logSourceName = str;
        this.flgTransportFactoryProvider = provider;
    }

    @WorkerThread
    public final void log(@NonNull PerfMetric perfMetric) {
        if (!initializeFlgTransportClient()) {
            logger.warn("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.flgTransport.send(Event.ofData(perfMetric));
        }
    }

    private boolean initializeFlgTransportClient() {
        if (this.flgTransport == null) {
            TransportFactory transportFactory = this.flgTransportFactoryProvider.get();
            if (transportFactory != null) {
                this.flgTransport = transportFactory.getTransport(this.logSourceName, PerfMetric.class, Encoding.of("proto"), getColumnCount.setMax);
            } else {
                logger.warn("Flg TransportFactory is not available at the moment");
            }
        }
        return this.flgTransport != null;
    }
}
