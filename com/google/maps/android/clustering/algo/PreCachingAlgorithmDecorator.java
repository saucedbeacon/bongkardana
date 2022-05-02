package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.PlaybackStateCompat;

public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final PlaybackStateCompat.ErrorCode<Integer, Set<? extends Cluster<T>>> mCache = new PlaybackStateCompat.ErrorCode<>(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    public boolean addItem(T t) {
        boolean addItem = this.mAlgorithm.addItem(t);
        if (addItem) {
            clearCache();
        }
        return addItem;
    }

    public boolean addItems(Collection<T> collection) {
        boolean addItems = this.mAlgorithm.addItems(collection);
        if (addItems) {
            clearCache();
        }
        return addItems;
    }

    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    public boolean removeItem(T t) {
        boolean removeItem = this.mAlgorithm.removeItem(t);
        if (removeItem) {
            clearCache();
        }
        return removeItem;
    }

    public boolean removeItems(Collection<T> collection) {
        boolean removeItems = this.mAlgorithm.removeItems(collection);
        if (removeItems) {
            clearCache();
        }
        return removeItems;
    }

    public boolean updateItem(T t) {
        boolean updateItem = this.mAlgorithm.updateItem(t);
        if (updateItem) {
            clearCache();
        }
        return updateItem;
    }

    private void clearCache() {
        this.mCache.evictAll();
    }

    public Set<? extends Cluster<T>> getClusters(float f) {
        int i = (int) f;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i);
        int i2 = i + 1;
        if (this.mCache.get(Integer.valueOf(i2)) == null) {
            new Thread(new PrecacheRunnable(i2)).start();
        }
        int i3 = i - 1;
        if (this.mCache.get(Integer.valueOf(i3)) == null) {
            new Thread(new PrecacheRunnable(i3)).start();
        }
        return clustersInternal;
    }

    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    public void setMaxDistanceBetweenClusteredItems(int i) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i);
        clearCache();
    }

    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    /* access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> set = this.mCache.get(Integer.valueOf(i));
        this.mCacheLock.readLock().unlock();
        if (set == null) {
            this.mCacheLock.writeLock().lock();
            set = this.mCache.get(Integer.valueOf(i));
            if (set == null) {
                set = this.mAlgorithm.getClusters((float) i);
                this.mCache.put(Integer.valueOf(i), set);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return set;
    }

    class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i) {
            this.mZoom = i;
        }

        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            Set unused2 = PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }
}
