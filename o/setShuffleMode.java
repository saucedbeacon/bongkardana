package o;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class setShuffleMode {
    @RequiresApi(23)
    @NonNull
    public static Parcelable[] setMin(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
