package o;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public class mayLaunchUrl {
    public static String setMin(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    public static CharSequence setMax(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    public static CharSequence length(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    public static CharSequence getMax(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    public static Bitmap getMin(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    public static Uri IsOverlapping(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    public static Bundle isInside(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    public static void setMin(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    public static Object setMin(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    public static class setMax {
        public static Object setMin() {
            return new MediaDescription.Builder();
        }

        public static void getMax(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        public static void getMin(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        public static void setMin(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        public static void setMax(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        public static void length(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        public static void getMax(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        public static void getMax(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        public static Object getMin(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }
    }
}
