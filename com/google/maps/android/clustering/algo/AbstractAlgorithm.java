package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.ClusterItem;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class AbstractAlgorithm<T extends ClusterItem> implements Algorithm<T> {
    private final ReadWriteLock mLock = new ReentrantReadWriteLock();

    public void lock() {
        this.mLock.writeLock().lock();
    }

    public void unlock() {
        this.mLock.writeLock().unlock();
    }
}
