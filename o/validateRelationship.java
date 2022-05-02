package o;

import android.media.MediaMetadata;
import android.os.Parcel;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public class validateRelationship {
    public static void setMin(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
