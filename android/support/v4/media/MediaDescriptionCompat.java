package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import o.mayLaunchUrl;
import o.newSessionWithExtras;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* renamed from: setMin */
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.getMax(mayLaunchUrl.setMin(parcel));
        }

        /* renamed from: getMin */
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private final Uri IsOverlapping;
    private final String getMax;
    private final Bitmap getMin;
    private Object isInside;
    private final CharSequence length;
    private final CharSequence setMax;
    private final CharSequence setMin;
    private final Uri toFloatRange;
    private final Bundle toIntRange;

    public final int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.getMax = str;
        this.setMin = charSequence;
        this.length = charSequence2;
        this.setMax = charSequence3;
        this.getMin = bitmap;
        this.IsOverlapping = uri;
        this.toIntRange = bundle;
        this.toFloatRange = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.getMax = parcel.readString();
        this.setMin = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.length = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.setMax = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.getMin = (Bitmap) parcel.readParcelable(classLoader);
        this.IsOverlapping = (Uri) parcel.readParcelable(classLoader);
        this.toIntRange = parcel.readBundle(classLoader);
        this.toFloatRange = (Uri) parcel.readParcelable(classLoader);
    }

    @Nullable
    public final String setMin() {
        return this.getMax;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.getMax);
            TextUtils.writeToParcel(this.setMin, parcel, i);
            TextUtils.writeToParcel(this.length, parcel, i);
            TextUtils.writeToParcel(this.setMax, parcel, i);
            parcel.writeParcelable(this.getMin, i);
            parcel.writeParcelable(this.IsOverlapping, i);
            parcel.writeBundle(this.toIntRange);
            parcel.writeParcelable(this.toFloatRange, i);
            return;
        }
        mayLaunchUrl.setMin(getMax(), parcel, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMin);
        sb.append(", ");
        sb.append(this.length);
        sb.append(", ");
        sb.append(this.setMax);
        return sb.toString();
    }

    public final Object getMax() {
        if (this.isInside != null || Build.VERSION.SDK_INT < 21) {
            return this.isInside;
        }
        Object min = mayLaunchUrl.setMax.setMin();
        mayLaunchUrl.setMax.getMax(min, this.getMax);
        mayLaunchUrl.setMax.getMin(min, this.setMin);
        mayLaunchUrl.setMax.setMin(min, this.length);
        mayLaunchUrl.setMax.setMax(min, this.setMax);
        mayLaunchUrl.setMax.length(min, this.getMin);
        mayLaunchUrl.setMax.getMax(min, this.IsOverlapping);
        Bundle bundle = this.toIntRange;
        if (Build.VERSION.SDK_INT < 23 && this.toFloatRange != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.toFloatRange);
        }
        mayLaunchUrl.setMax.getMax(min, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            newSessionWithExtras.length.setMax(min, this.toFloatRange);
        }
        Object min2 = mayLaunchUrl.setMax.getMin(min);
        this.isInside = min2;
        return min2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat getMax(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$getMin r1 = new android.support.v4.media.MediaDescriptionCompat$getMin
            r1.<init>()
            java.lang.String r2 = o.mayLaunchUrl.setMin((java.lang.Object) r8)
            r1.getMin((java.lang.String) r2)
            java.lang.CharSequence r2 = o.mayLaunchUrl.setMax(r8)
            r1.getMin((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = o.mayLaunchUrl.length(r8)
            r1.length(r2)
            java.lang.CharSequence r2 = o.mayLaunchUrl.getMax(r8)
            r1.getMax((java.lang.CharSequence) r2)
            android.graphics.Bitmap r2 = o.mayLaunchUrl.getMin(r8)
            r1.getMin((android.graphics.Bitmap) r2)
            android.net.Uri r2 = o.mayLaunchUrl.IsOverlapping(r8)
            r1.setMin(r2)
            android.os.Bundle r2 = o.mayLaunchUrl.isInside(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.v4.media.session.MediaSessionCompat.setMax(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.getMax((android.os.Bundle) r0)
            if (r4 == 0) goto L_0x006d
            r1.getMax((android.net.Uri) r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = o.newSessionWithExtras.length(r8)
            r1.getMax((android.net.Uri) r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.getMax()
            r0.isInside = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.getMax(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public static final class getMin {
        private Uri IsOverlapping;
        private Bundle equals;
        private CharSequence getMax;
        private Bitmap getMin;
        private Uri isInside;
        private String length;
        private CharSequence setMax;
        private CharSequence setMin;

        public final getMin getMin(@Nullable String str) {
            this.length = str;
            return this;
        }

        public final getMin getMin(@Nullable CharSequence charSequence) {
            this.setMin = charSequence;
            return this;
        }

        public final getMin length(@Nullable CharSequence charSequence) {
            this.getMax = charSequence;
            return this;
        }

        public final getMin getMax(@Nullable CharSequence charSequence) {
            this.setMax = charSequence;
            return this;
        }

        public final getMin getMin(@Nullable Bitmap bitmap) {
            this.getMin = bitmap;
            return this;
        }

        public final getMin setMin(@Nullable Uri uri) {
            this.IsOverlapping = uri;
            return this;
        }

        public final getMin getMax(@Nullable Bundle bundle) {
            this.equals = bundle;
            return this;
        }

        public final getMin getMax(@Nullable Uri uri) {
            this.isInside = uri;
            return this;
        }

        public final MediaDescriptionCompat getMax() {
            return new MediaDescriptionCompat(this.length, this.setMin, this.getMax, this.setMax, this.getMin, this.IsOverlapping, this.equals, this.isInside);
        }
    }
}
