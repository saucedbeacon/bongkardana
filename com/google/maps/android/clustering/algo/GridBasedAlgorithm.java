package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.PlaybackStateCompat;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_GRID_SIZE = 100;
    private int mGridSize = 100;
    private final Set<T> mItems = Collections.synchronizedSet(new HashSet());

    public boolean addItem(T t) {
        return this.mItems.add(t);
    }

    public boolean addItems(Collection<T> collection) {
        return this.mItems.addAll(collection);
    }

    public void clearItems() {
        this.mItems.clear();
    }

    public boolean removeItem(T t) {
        return this.mItems.remove(t);
    }

    public boolean removeItems(Collection<T> collection) {
        return this.mItems.removeAll(collection);
    }

    public boolean updateItem(T t) {
        boolean removeItem;
        synchronized (this.mItems) {
            removeItem = removeItem(t);
            if (removeItem) {
                removeItem = addItem(t);
            }
        }
        return removeItem;
    }

    public void setMaxDistanceBetweenClusteredItems(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1680259418, oncanceled);
            onCancelLoad.getMin(1680259418, oncanceled);
        }
        this.mGridSize = i;
    }

    public int getMaxDistanceBetweenClusteredItems() {
        return this.mGridSize;
    }

    public Set<? extends Cluster<T>> getClusters(float f) {
        long j;
        double d = (double) this.mGridSize;
        Double.isNaN(d);
        long ceil = (long) Math.ceil((Math.pow(2.0d, (double) f) * 256.0d) / d);
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection((double) ceil);
        HashSet hashSet = new HashSet();
        PlaybackStateCompat.ShuffleMode shuffleMode = new PlaybackStateCompat.ShuffleMode();
        synchronized (this.mItems) {
            for (T t : this.mItems) {
                Point point = sphericalMercatorProjection.toPoint(t.getPosition());
                long coord = getCoord(ceil, point.x, point.y);
                StaticCluster staticCluster = (StaticCluster) shuffleMode.getMax(coord, null);
                if (staticCluster == null) {
                    j = ceil;
                    staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.x) + 0.5d, Math.floor(point.y) + 0.5d)));
                    shuffleMode.setMax(coord, staticCluster);
                    hashSet.add(staticCluster);
                } else {
                    j = ceil;
                }
                staticCluster.add(t);
                ceil = j;
            }
        }
        return hashSet;
    }

    public Collection<T> getItems() {
        return this.mItems;
    }

    private static long getCoord(long j, double d, double d2) {
        double d3 = (double) j;
        double floor = Math.floor(d);
        Double.isNaN(d3);
        return (long) ((d3 * floor) + Math.floor(d2));
    }
}
