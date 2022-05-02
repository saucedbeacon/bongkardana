package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class setActivityChooserModel extends VersionedParcel {
    private final int IsOverlapping;
    private final String equals;
    private final Parcel getMax;
    private int isInside;
    private final SparseIntArray length;
    private int toDoubleRange;
    private final int toFloatRange;
    private int toIntRange;

    public setActivityChooserModel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new PlaybackStateCompat(), new PlaybackStateCompat(), new PlaybackStateCompat());
    }

    private setActivityChooserModel(Parcel parcel, int i, int i2, String str, PlaybackStateCompat<String, Method> playbackStateCompat, PlaybackStateCompat<String, Method> playbackStateCompat2, PlaybackStateCompat<String, Class> playbackStateCompat3) {
        super(playbackStateCompat, playbackStateCompat2, playbackStateCompat3);
        this.length = new SparseIntArray();
        this.toIntRange = -1;
        this.isInside = 0;
        this.toDoubleRange = -1;
        this.getMax = parcel;
        this.IsOverlapping = i;
        this.toFloatRange = i2;
        this.isInside = i;
        this.equals = str;
    }

    public final boolean length(int i) {
        while (this.isInside < this.toFloatRange) {
            int i2 = this.toDoubleRange;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.getMax.setDataPosition(this.isInside);
            int readInt = this.getMax.readInt();
            this.toDoubleRange = this.getMax.readInt();
            this.isInside += readInt;
        }
        return this.toDoubleRange == i;
    }

    public final void getMax(int i) {
        length();
        this.toIntRange = i;
        this.length.put(i, this.getMax.dataPosition());
        this.getMax.writeInt(0);
        this.getMax.writeInt(i);
    }

    public final void length() {
        int i = this.toIntRange;
        if (i >= 0) {
            int i2 = this.length.get(i);
            int dataPosition = this.getMax.dataPosition();
            this.getMax.setDataPosition(i2);
            this.getMax.writeInt(dataPosition - i2);
            this.getMax.setDataPosition(dataPosition);
        }
    }

    public final VersionedParcel getMin() {
        Parcel parcel = this.getMax;
        int dataPosition = parcel.dataPosition();
        int i = this.isInside;
        if (i == this.IsOverlapping) {
            i = this.toFloatRange;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.equals);
        sb.append("  ");
        return new setActivityChooserModel(parcel, dataPosition, i2, sb.toString(), this.setMax, this.setMin, this.getMin);
    }

    public final void setMin(byte[] bArr) {
        if (bArr != null) {
            this.getMax.writeInt(bArr.length);
            this.getMax.writeByteArray(bArr);
            return;
        }
        this.getMax.writeInt(-1);
    }

    public final void setMin(int i) {
        this.getMax.writeInt(i);
    }

    public final void setMin(String str) {
        this.getMax.writeString(str);
    }

    public final void getMax(Parcelable parcelable) {
        this.getMax.writeParcelable(parcelable, 0);
    }

    public final void length(boolean z) {
        this.getMax.writeInt(z ? 1 : 0);
    }

    public final void setMin(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.getMax, 0);
    }

    public final CharSequence toFloatRange() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.getMax);
    }

    public final int setMax() {
        return this.getMax.readInt();
    }

    public final String setMin() {
        return this.getMax.readString();
    }

    public final byte[] getMax() {
        int readInt = this.getMax.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.getMax.readByteArray(bArr);
        return bArr;
    }

    public final <T extends Parcelable> T equals() {
        return this.getMax.readParcelable(getClass().getClassLoader());
    }

    public final boolean isInside() {
        return this.getMax.readInt() != 0;
    }
}
