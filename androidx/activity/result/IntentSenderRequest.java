package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new IntentSenderRequest[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }
    };
    @NonNull
    public final IntentSender getMin;
    @Nullable
    public final Intent length;
    public final int setMax;
    public final int setMin;

    public final int describeContents() {
        return 0;
    }

    public IntentSenderRequest(@NonNull IntentSender intentSender, @Nullable Intent intent, int i, int i2) {
        this.getMin = intentSender;
        this.length = intent;
        this.setMin = i;
        this.setMax = i2;
    }

    IntentSenderRequest(@NonNull Parcel parcel) {
        this.getMin = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.length = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.setMin = parcel.readInt();
        this.setMax = parcel.readInt();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.getMin, i);
        parcel.writeParcelable(this.length, i);
        parcel.writeInt(this.setMin);
        parcel.writeInt(this.setMax);
    }

    public static final class setMin {
        public int getMax;
        public IntentSender getMin;
        public Intent length;
        public int setMin;

        public setMin(@NonNull IntentSender intentSender) {
            this.getMin = intentSender;
        }
    }
}
