package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new Parcelable.Creator<Counter>() {
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    };
    private final AtomicLong count;
    private final String name;

    public int describeContents() {
        return 0;
    }

    public Counter(@NonNull String str) {
        this.name = str;
        this.count = new AtomicLong(0);
    }

    private Counter(Parcel parcel) {
        this.name = parcel.readString();
        this.count = new AtomicLong(parcel.readLong());
    }

    public void increment(long j) {
        this.count.addAndGet(j);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    public long getCount() {
        return this.count.get();
    }

    /* access modifiers changed from: package-private */
    public void setCount(long j) {
        this.count.set(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeLong(this.count.get());
    }
}
