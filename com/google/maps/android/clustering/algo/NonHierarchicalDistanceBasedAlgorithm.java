package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    /* access modifiers changed from: private */
    public static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private final Collection<QuadItem<T>> mItems = new LinkedHashSet();
    private int mMaxDistance = 100;
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree(0.0d, 1.0d, 0.0d, 1.0d);

    public boolean addItem(T t) {
        boolean add;
        QuadItem quadItem = new QuadItem(t);
        synchronized (this.mQuadTree) {
            add = this.mItems.add(quadItem);
            if (add) {
                this.mQuadTree.add(quadItem);
            }
        }
        return add;
    }

    public boolean addItems(Collection<T> collection) {
        boolean z = false;
        for (T addItem : collection) {
            if (addItem(addItem)) {
                z = true;
            }
        }
        return z;
    }

    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    public boolean removeItem(T t) {
        boolean remove;
        QuadItem quadItem = new QuadItem(t);
        synchronized (this.mQuadTree) {
            remove = this.mItems.remove(quadItem);
            if (remove) {
                this.mQuadTree.remove(quadItem);
            }
        }
        return remove;
    }

    public boolean removeItems(Collection<T> collection) {
        boolean z;
        synchronized (this.mQuadTree) {
            z = false;
            for (T quadItem : collection) {
                QuadItem quadItem2 = new QuadItem(quadItem);
                if (this.mItems.remove(quadItem2)) {
                    this.mQuadTree.remove(quadItem2);
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean updateItem(T t) {
        boolean removeItem;
        synchronized (this.mQuadTree) {
            removeItem = removeItem(t);
            if (removeItem) {
                removeItem = addItem(t);
            }
        }
        return removeItem;
    }

    public Set<? extends Cluster<T>> getClusters(float f) {
        float f2 = f;
        double d = (double) this.mMaxDistance;
        double pow = Math.pow(2.0d, (double) ((int) f2));
        Double.isNaN(d);
        double d2 = (d / pow) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.mQuadTree) {
            Iterator<QuadItem<QuadItem<T>>> it = getClusteringItems(this.mQuadTree, f2).iterator();
            while (it.hasNext()) {
                QuadItem next = it.next();
                if (!hashSet.contains(next)) {
                    Collection<QuadItem<T>> search = this.mQuadTree.search(createBoundsFromSpan(next.getPoint(), d2));
                    if (search.size() == 1) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                    } else {
                        StaticCluster staticCluster = new StaticCluster(next.mClusterItem.getPosition());
                        hashSet2.add(staticCluster);
                        for (QuadItem next2 : search) {
                            Double d3 = (Double) hashMap.get(next2);
                            Iterator<QuadItem<QuadItem<T>>> it2 = it;
                            double distanceSquared = distanceSquared(next2.getPoint(), next.getPoint());
                            if (d3 != null) {
                                if (d3.doubleValue() >= distanceSquared) {
                                    ((StaticCluster) hashMap2.get(next2)).remove(next2.mClusterItem);
                                } else {
                                    it = it2;
                                }
                            }
                            hashMap.put(next2, Double.valueOf(distanceSquared));
                            staticCluster.add(next2.mClusterItem);
                            hashMap2.put(next2, staticCluster);
                            it = it2;
                        }
                        hashSet.addAll(search);
                        it = it;
                    }
                }
            }
        }
        return hashSet2;
    }

    /* access modifiers changed from: protected */
    public Collection<QuadItem<T>> getClusteringItems(PointQuadTree<QuadItem<T>> pointQuadTree, float f) {
        return this.mItems;
    }

    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.mQuadTree) {
            for (QuadItem<T> access$100 : this.mItems) {
                linkedHashSet.add(access$100.mClusterItem);
            }
        }
        return linkedHashSet;
    }

    public void setMaxDistanceBetweenClusteredItems(int i) {
        this.mMaxDistance = i;
    }

    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    private double distanceSquared(Point point, Point point2) {
        return ((point.x - point2.x) * (point.x - point2.x)) + ((point.y - point2.y) * (point.y - point2.y));
    }

    private Bounds createBoundsFromSpan(Point point, double d) {
        double d2 = d / 2.0d;
        return new Bounds(point.x - d2, point.x + d2, point.y - d2, point.y + d2);
    }

    protected static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        /* access modifiers changed from: private */
        public final T mClusterItem;
        private final Point mPoint;
        private final LatLng mPosition;
        private Set<T> singletonSet;

        public int getSize() {
            return 1;
        }

        private QuadItem(T t) {
            this.mClusterItem = t;
            this.mPosition = t.getPosition();
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(this.mPosition);
            this.singletonSet = Collections.singleton(this.mClusterItem);
        }

        public Point getPoint() {
            return this.mPoint;
        }

        public LatLng getPosition() {
            return this.mPosition;
        }

        public Set<T> getItems() {
            return this.singletonSet;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof QuadItem)) {
                return false;
            }
            return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
        }
    }
}
