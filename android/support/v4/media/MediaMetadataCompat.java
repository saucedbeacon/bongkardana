package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.PlaybackStateCompat;
import o.validateRelationship;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* renamed from: getMin */
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: getMax */
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };
    private static final String[] getMax = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] getMin = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    static final PlaybackStateCompat<String, Integer> length;
    private static final String[] setMax = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private Object isInside;
    final Bundle setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BitmapKey {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LongKey {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RatingKey {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextKey {
    }

    public final int describeContents() {
        return 0;
    }

    static {
        PlaybackStateCompat<String, Integer> playbackStateCompat = new PlaybackStateCompat<>();
        length = playbackStateCompat;
        playbackStateCompat.put("android.media.metadata.TITLE", 1);
        length.put("android.media.metadata.ARTIST", 1);
        length.put("android.media.metadata.DURATION", 0);
        length.put("android.media.metadata.ALBUM", 1);
        length.put("android.media.metadata.AUTHOR", 1);
        length.put("android.media.metadata.WRITER", 1);
        length.put("android.media.metadata.COMPOSER", 1);
        length.put("android.media.metadata.COMPILATION", 1);
        length.put("android.media.metadata.DATE", 1);
        length.put("android.media.metadata.YEAR", 0);
        length.put("android.media.metadata.GENRE", 1);
        length.put("android.media.metadata.TRACK_NUMBER", 0);
        length.put("android.media.metadata.NUM_TRACKS", 0);
        length.put("android.media.metadata.DISC_NUMBER", 0);
        length.put("android.media.metadata.ALBUM_ARTIST", 1);
        length.put("android.media.metadata.ART", 2);
        length.put("android.media.metadata.ART_URI", 1);
        length.put("android.media.metadata.ALBUM_ART", 2);
        length.put("android.media.metadata.ALBUM_ART_URI", 1);
        length.put("android.media.metadata.USER_RATING", 3);
        length.put("android.media.metadata.RATING", 3);
        length.put("android.media.metadata.DISPLAY_TITLE", 1);
        length.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        length.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        length.put("android.media.metadata.DISPLAY_ICON", 2);
        length.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        length.put("android.media.metadata.MEDIA_ID", 1);
        length.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        length.put("android.media.metadata.MEDIA_URI", 1);
        length.put("android.media.metadata.ADVERTISEMENT", 0);
        length.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.setMin = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final boolean setMin(String str) {
        return this.setMin.containsKey(str);
    }

    public final long getMin(String str) {
        return this.setMin.getLong(str, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.setMin);
    }

    public static MediaMetadataCompat getMax(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        validateRelationship.setMin(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.isInside = obj;
        return createFromParcel;
    }
}
