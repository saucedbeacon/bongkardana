package com.google.firebase.messaging.reporting;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_messaging.zze;
import com.google.android.gms.internal.firebase_messaging.zzz;
import com.google.firebase.encoders.annotations.Encodable;
import java.io.IOException;
import java.io.OutputStream;

public final class MessagingClientEventExtension {
    private static final MessagingClientEventExtension DEFAULT_INSTANCE = new Builder().build();
    private final MessagingClientEvent messaging_client_event_;

    public static final class Builder {
        private MessagingClientEvent messaging_client_event_ = null;

        Builder() {
        }

        @NonNull
        public final MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.messaging_client_event_);
        }

        @NonNull
        public final Builder setMessagingClientEvent(@NonNull MessagingClientEvent messagingClientEvent) {
            this.messaging_client_event_ = messagingClientEvent;
            return this;
        }
    }

    MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    @NonNull
    public static MessagingClientEventExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    @Encodable.Ignore
    public final MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.messaging_client_event_;
        return messagingClientEvent == null ? MessagingClientEvent.getDefaultInstance() : messagingClientEvent;
    }

    @NonNull
    @zzz(zza = 1)
    @Encodable.Field(name = "messagingClientEvent")
    public final MessagingClientEvent getMessagingClientEventInternal() {
        return this.messaging_client_event_;
    }

    @NonNull
    public final byte[] toByteArray() {
        return zze.zza(this);
    }

    public final void writeTo(@NonNull OutputStream outputStream) throws IOException {
        zze.zzb(this, outputStream);
    }
}
