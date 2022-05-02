package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

final class TransportFactoryImpl implements TransportFactory {
    private final Set<Encoding> supportedPayloadEncodings;
    private final TransportContext transportContext;
    private final TransportInternal transportInternal;

    TransportFactoryImpl(Set<Encoding> set, TransportContext transportContext2, TransportInternal transportInternal2) {
        this.supportedPayloadEncodings = set;
        this.transportContext = transportContext2;
        this.transportInternal = transportInternal2;
    }

    public final <T> Transport<T> getTransport(String str, Class<T> cls, Transformer<T, byte[]> transformer) {
        return getTransport(str, cls, Encoding.of("proto"), transformer);
    }

    public final <T> Transport<T> getTransport(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        if (this.supportedPayloadEncodings.contains(encoding)) {
            return new TransportImpl(this.transportContext, str, encoding, transformer, this.transportInternal);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{encoding, this.supportedPayloadEncodings}));
    }
}
