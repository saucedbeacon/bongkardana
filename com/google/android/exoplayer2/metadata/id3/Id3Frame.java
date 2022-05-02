package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id  reason: collision with root package name */
    public final String f9537id;

    public int describeContents() {
        return 0;
    }

    public Id3Frame(String str) {
        this.f9537id = str;
    }

    public String toString() {
        return this.f9537id;
    }
}
