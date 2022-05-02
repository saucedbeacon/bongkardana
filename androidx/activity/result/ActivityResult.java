package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ActivityResult[i];
        }

        public final /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
            return new ActivityResult(parcel);
        }
    };
    public final int getMax;
    @Nullable
    public final Intent length;

    public final int describeContents() {
        return 0;
    }

    public ActivityResult(int i, @Nullable Intent intent) {
        this.getMax = i;
        this.length = intent;
    }

    ActivityResult(Parcel parcel) {
        this.getMax = parcel.readInt();
        this.length = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.getMax;
        if (i != -1) {
            str = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.length);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.getMax);
        parcel.writeInt(this.length == null ? 0 : 1);
        Intent intent = this.length;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
