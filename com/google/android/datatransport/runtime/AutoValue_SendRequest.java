package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

final class AutoValue_SendRequest extends SendRequest {
    private final Encoding encoding;
    private final Event<?> event;
    private final Transformer<?, byte[]> transformer;
    private final TransportContext transportContext;
    private final String transportName;

    private AutoValue_SendRequest(TransportContext transportContext2, String str, Event<?> event2, Transformer<?, byte[]> transformer2, Encoding encoding2) {
        this.transportContext = transportContext2;
        this.transportName = str;
        this.event = event2;
        this.transformer = transformer2;
        this.encoding = encoding2;
    }

    public final TransportContext getTransportContext() {
        return this.transportContext;
    }

    public final String getTransportName() {
        return this.transportName;
    }

    /* access modifiers changed from: package-private */
    public final Event<?> getEvent() {
        return this.event;
    }

    /* access modifiers changed from: package-private */
    public final Transformer<?, byte[]> getTransformer() {
        return this.transformer;
    }

    public final Encoding getEncoding() {
        return this.encoding;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendRequest{transportContext=");
        sb.append(this.transportContext);
        sb.append(", transportName=");
        sb.append(this.transportName);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", transformer=");
        sb.append(this.transformer);
        sb.append(", encoding=");
        sb.append(this.encoding);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendRequest) {
            SendRequest sendRequest = (SendRequest) obj;
            return this.transportContext.equals(sendRequest.getTransportContext()) && this.transportName.equals(sendRequest.getTransportName()) && this.event.equals(sendRequest.getEvent()) && this.transformer.equals(sendRequest.getTransformer()) && this.encoding.equals(sendRequest.getEncoding());
        }
    }

    public final int hashCode() {
        return ((((((((this.transportContext.hashCode() ^ 1000003) * 1000003) ^ this.transportName.hashCode()) * 1000003) ^ this.event.hashCode()) * 1000003) ^ this.transformer.hashCode()) * 1000003) ^ this.encoding.hashCode();
    }

    static final class Builder extends SendRequest.Builder {
        private Encoding encoding;
        private Event<?> event;
        private Transformer<?, byte[]> transformer;
        private TransportContext transportContext;
        private String transportName;

        Builder() {
        }

        public final SendRequest.Builder setTransportContext(TransportContext transportContext2) {
            if (transportContext2 != null) {
                this.transportContext = transportContext2;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public final SendRequest.Builder setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* access modifiers changed from: package-private */
        public final SendRequest.Builder setEvent(Event<?> event2) {
            if (event2 != null) {
                this.event = event2;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public final SendRequest.Builder setTransformer(Transformer<?, byte[]> transformer2) {
            if (transformer2 != null) {
                this.transformer = transformer2;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* access modifiers changed from: package-private */
        public final SendRequest.Builder setEncoding(Encoding encoding2) {
            if (encoding2 != null) {
                this.encoding = encoding2;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        public final SendRequest build() {
            String str = "";
            if (this.transportContext == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportContext");
                str = sb.toString();
            }
            if (this.transportName == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" transportName");
                str = sb2.toString();
            }
            if (this.event == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" event");
                str = sb3.toString();
            }
            if (this.transformer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" transformer");
                str = sb4.toString();
            }
            if (this.encoding == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" encoding");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.transportContext, this.transportName, this.event, this.transformer, this.encoding);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
