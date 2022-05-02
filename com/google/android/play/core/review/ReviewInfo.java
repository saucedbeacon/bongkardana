package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ReviewInfo implements Parcelable {
    public static ReviewInfo a(PendingIntent pendingIntent) {
        return new a(pendingIntent);
    }

    /* access modifiers changed from: package-private */
    public abstract PendingIntent a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), 0);
    }
}
