package com.google.android.datatransport;

import androidx.annotation.Nullable;

final class AutoValue_Event<T> extends Event<T> {
    private final Integer code;
    private final T payload;
    private final Priority priority;

    AutoValue_Event(@Nullable Integer num, T t, Priority priority2) {
        this.code = num;
        if (t != null) {
            this.payload = t;
            if (priority2 != null) {
                this.priority = priority2;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    public final T getPayload() {
        return this.payload;
    }

    public final Priority getPriority() {
        return this.priority;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{code=");
        sb.append(this.code);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Event) {
            Event event = (Event) obj;
            Integer num = this.code;
            if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
                return this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority());
            }
        }
    }

    public final int hashCode() {
        Integer num = this.code;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode();
    }
}
