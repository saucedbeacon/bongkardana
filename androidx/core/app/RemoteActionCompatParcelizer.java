package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import o.ActivityChooserView;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.setMin = (IconCompat) versionedParcel.setMin(remoteActionCompat.setMin);
        remoteActionCompat.length = versionedParcel.getMax(remoteActionCompat.length, 2);
        remoteActionCompat.setMax = versionedParcel.getMax(remoteActionCompat.setMax, 3);
        remoteActionCompat.getMax = (PendingIntent) versionedParcel.setMax(remoteActionCompat.getMax, 4);
        remoteActionCompat.getMin = versionedParcel.getMin(remoteActionCompat.getMin, 5);
        remoteActionCompat.equals = versionedParcel.getMin(remoteActionCompat.equals, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getMin((ActivityChooserView) remoteActionCompat.setMin);
        versionedParcel.getMin(remoteActionCompat.length, 2);
        versionedParcel.getMin(remoteActionCompat.setMax, 3);
        versionedParcel.getMax((Parcelable) remoteActionCompat.getMax, 4);
        versionedParcel.setMax(remoteActionCompat.getMin, 5);
        versionedParcel.setMax(remoteActionCompat.equals, 6);
    }
}
