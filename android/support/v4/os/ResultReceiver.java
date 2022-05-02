package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ResultReceiver[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    };
    IResultReceiver getMax;
    final Handler getMin = null;
    final boolean setMax = false;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void setMin(int i, Bundle bundle) {
    }

    class length implements Runnable {
        final Bundle getMin;
        final int length;

        length(int i, Bundle bundle) {
            this.length = i;
            this.getMin = bundle;
        }

        public final void run() {
            ResultReceiver.this.setMin(this.length, this.getMin);
        }
    }

    class MyResultReceiver extends IResultReceiver.Stub {
        MyResultReceiver() {
        }

        public void send(int i, Bundle bundle) {
            if (ResultReceiver.this.getMin != null) {
                ResultReceiver.this.getMin.post(new length(i, bundle));
            } else {
                ResultReceiver.this.setMin(i, bundle);
            }
        }
    }

    public void getMax(int i, Bundle bundle) {
        if (this.setMax) {
            Handler handler = this.getMin;
            if (handler != null) {
                handler.post(new length(i, bundle));
            } else {
                setMin(i, bundle);
            }
        } else {
            IResultReceiver iResultReceiver = this.getMax;
            if (iResultReceiver != null) {
                try {
                    iResultReceiver.send(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.getMax == null) {
                this.getMax = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.getMax.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.getMax = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}
