package o;

import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MediaSessionCompat$MediaSessionImplApi21$ExtraSession {
    private final ITrustedWebActivityCallback length;

    private MediaSessionCompat$MediaSessionImplApi21$ExtraSession(@NonNull ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.length = iTrustedWebActivityCallback;
    }

    @Nullable
    public static MediaSessionCompat$MediaSessionImplApi21$ExtraSession getMin(@Nullable IBinder iBinder) {
        ITrustedWebActivityCallback asInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (asInterface == null) {
            return null;
        }
        return new MediaSessionCompat$MediaSessionImplApi21$ExtraSession(asInterface);
    }
}
