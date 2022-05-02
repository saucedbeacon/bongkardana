package o;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import o.isGroupDividerEnabled;
import o.removeItem;

public final class getActionViewStatesKey {
    static final boolean getMin = Log.isLoggable("MediaSessionManager", 3);
    private static final Object length = new Object();

    interface getMax {
    }

    public static final class length {
        getMax length;

        public length(@NonNull String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.length = new removeItem.length(str, i, i2);
            } else {
                this.length = new isGroupDividerEnabled.setMax(str, i, i2);
            }
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public length(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.length = new removeItem.length(remoteUserInfo);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            return this.length.equals(((length) obj).length);
        }

        public final int hashCode() {
            return this.length.hashCode();
        }
    }
}
