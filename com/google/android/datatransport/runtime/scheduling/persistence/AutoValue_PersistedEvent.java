package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

final class AutoValue_PersistedEvent extends PersistedEvent {
    private final EventInternal event;

    /* renamed from: id  reason: collision with root package name */
    private final long f10787id;
    private final TransportContext transportContext;

    AutoValue_PersistedEvent(long j, TransportContext transportContext2, EventInternal eventInternal) {
        this.f10787id = j;
        if (transportContext2 != null) {
            this.transportContext = transportContext2;
            if (eventInternal != null) {
                this.event = eventInternal;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final long getId() {
        return this.f10787id;
    }

    public final TransportContext getTransportContext() {
        return this.transportContext;
    }

    public final EventInternal getEvent() {
        return this.event;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.f10787id);
        sb.append(", transportContext=");
        sb.append(this.transportContext);
        sb.append(", event=");
        sb.append(this.event);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedEvent) {
            PersistedEvent persistedEvent = (PersistedEvent) obj;
            return this.f10787id == persistedEvent.getId() && this.transportContext.equals(persistedEvent.getTransportContext()) && this.event.equals(persistedEvent.getEvent());
        }
    }

    public final int hashCode() {
        long j = this.f10787id;
        return this.event.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003);
    }
}
