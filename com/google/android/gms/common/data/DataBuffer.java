package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

public interface DataBuffer<T> extends Releasable, Closeable, Iterable<T> {
    void close();

    T get(int i);

    int getCount();

    @KeepForSdk
    @Nullable
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    Iterator<T> iterator();

    void release();

    Iterator<T> singleRefIterator();
}
