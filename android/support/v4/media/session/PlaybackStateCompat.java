package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.ICustomTabsService;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* renamed from: setMin */
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: setMin */
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    List<CustomAction> IsOverlapping;
    final int equals;
    final long getMax;
    final int getMin;
    private Object hashCode;
    final long isInside;
    final float length;
    final long setMax;
    final long setMin;
    final CharSequence toFloatRange;
    final long toIntRange;
    final Bundle toString;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Actions {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaKeyAction {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public static int setMax(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    public final int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.getMin = i;
        this.getMax = j;
        this.setMin = j2;
        this.length = f;
        this.setMax = j3;
        this.equals = i2;
        this.toFloatRange = charSequence;
        this.isInside = j4;
        this.IsOverlapping = new ArrayList(list);
        this.toIntRange = j5;
        this.toString = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.getMin = parcel.readInt();
        this.getMax = parcel.readLong();
        this.length = parcel.readFloat();
        this.isInside = parcel.readLong();
        this.setMin = parcel.readLong();
        this.setMax = parcel.readLong();
        this.toFloatRange = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.IsOverlapping = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.toIntRange = parcel.readLong();
        this.toString = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.equals = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.getMin);
        sb.append(", position=");
        sb.append(this.getMax);
        sb.append(", buffered position=");
        sb.append(this.setMin);
        sb.append(", speed=");
        sb.append(this.length);
        sb.append(", updated=");
        sb.append(this.isInside);
        sb.append(", actions=");
        sb.append(this.setMax);
        sb.append(", error code=");
        sb.append(this.equals);
        sb.append(", error message=");
        sb.append(this.toFloatRange);
        sb.append(", custom actions=");
        sb.append(this.IsOverlapping);
        sb.append(", active item id=");
        sb.append(this.toIntRange);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.getMin);
        parcel.writeLong(this.getMax);
        parcel.writeFloat(this.length);
        parcel.writeLong(this.isInside);
        parcel.writeLong(this.setMin);
        parcel.writeLong(this.setMax);
        TextUtils.writeToParcel(this.toFloatRange, parcel, i);
        parcel.writeTypedList(this.IsOverlapping);
        parcel.writeLong(this.toIntRange);
        parcel.writeBundle(this.toString);
        parcel.writeInt(this.equals);
    }

    public final int length() {
        return this.getMin;
    }

    public final long setMin() {
        return this.getMax;
    }

    public final long getMax() {
        return this.isInside;
    }

    public final float setMax() {
        return this.length;
    }

    public final long getMin() {
        return this.setMax;
    }

    public static PlaybackStateCompat length(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> isInside2 = ICustomTabsService.Stub.isInside(obj);
        if (isInside2 != null) {
            ArrayList arrayList2 = new ArrayList(isInside2.size());
            for (Object min : isInside2) {
                arrayList2.add(CustomAction.getMin(min));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = ICustomTabsService.Stub.Proxy.setMax(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(ICustomTabsService.Stub.getMin(obj), ICustomTabsService.Stub.length(obj), ICustomTabsService.Stub.getMax(obj), ICustomTabsService.Stub.setMin(obj), ICustomTabsService.Stub.setMax(obj), 0, ICustomTabsService.Stub.IsOverlapping(obj), ICustomTabsService.Stub.toFloatRange(obj), arrayList, ICustomTabsService.Stub.toIntRange(obj), bundle);
        playbackStateCompat.hashCode = obj2;
        return playbackStateCompat;
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* renamed from: getMin */
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: setMin */
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        private final Bundle getMax;
        private final int getMin;
        private final String length;
        private Object setMax;
        private final CharSequence setMin;

        public final int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.length = str;
            this.setMin = charSequence;
            this.getMin = i;
            this.getMax = bundle;
        }

        CustomAction(Parcel parcel) {
            this.length = parcel.readString();
            this.setMin = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.getMin = parcel.readInt();
            this.getMax = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.length);
            TextUtils.writeToParcel(this.setMin, parcel, i);
            parcel.writeInt(this.getMin);
            parcel.writeBundle(this.getMax);
        }

        public static CustomAction getMin(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(ICustomTabsService.Stub.length.getMin(obj), ICustomTabsService.Stub.length.getMax(obj), ICustomTabsService.Stub.length.length(obj), ICustomTabsService.Stub.length.setMax(obj));
            customAction.setMax = obj;
            return customAction;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append(this.setMin);
            sb.append(", mIcon=");
            sb.append(this.getMin);
            sb.append(", mExtras=");
            sb.append(this.getMax);
            return sb.toString();
        }
    }

    public static final class setMin {
        private int IsOverlapping;
        private long equals;
        private float getMax;
        private final List<CustomAction> getMin = new ArrayList();
        private Bundle hashCode;
        private CharSequence isInside;
        private long length;
        private int setMax;
        private long setMin;
        private long toFloatRange = -1;
        private long toIntRange;

        public setMin() {
        }

        public setMin(PlaybackStateCompat playbackStateCompat) {
            this.setMax = playbackStateCompat.getMin;
            this.length = playbackStateCompat.getMax;
            this.getMax = playbackStateCompat.length;
            this.equals = playbackStateCompat.isInside;
            this.setMin = playbackStateCompat.setMin;
            this.toIntRange = playbackStateCompat.setMax;
            this.IsOverlapping = playbackStateCompat.equals;
            this.isInside = playbackStateCompat.toFloatRange;
            if (playbackStateCompat.IsOverlapping != null) {
                this.getMin.addAll(playbackStateCompat.IsOverlapping);
            }
            this.toFloatRange = playbackStateCompat.toIntRange;
            this.hashCode = playbackStateCompat.toString;
        }

        public final setMin length(int i, long j, float f, long j2) {
            this.setMax = i;
            this.length = j;
            this.equals = j2;
            this.getMax = f;
            return this;
        }

        public final PlaybackStateCompat length() {
            return new PlaybackStateCompat(this.setMax, this.length, this.setMin, this.getMax, this.toIntRange, this.IsOverlapping, this.isInside, this.equals, this.getMin, this.toFloatRange, this.hashCode);
        }
    }
}
