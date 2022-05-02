package com.google.android.datatransport.runtime.dagger;

public interface Lazy<T> {
    T get();
}
