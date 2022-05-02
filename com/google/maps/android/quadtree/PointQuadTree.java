package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final Bounds mBounds;
    private List<PointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    public interface Item {
        Point getPoint();
    }

    public PointQuadTree(double d, double d2, double d3, double d4) {
        this(new Bounds(d, d2, d3, d4));
    }

    public PointQuadTree(Bounds bounds) {
        this(bounds, 0);
    }

    private PointQuadTree(double d, double d2, double d3, double d4, int i) {
        this(new Bounds(d, d2, d3, d4), i);
    }

    private PointQuadTree(Bounds bounds, int i) {
        this.mChildren = null;
        this.mBounds = bounds;
        this.mDepth = i;
    }

    public void add(T t) {
        Point point = t.getPoint();
        if (this.mBounds.contains(point.x, point.y)) {
            insert(point.x, point.y, t);
        }
    }

    private void insert(double d, double d2, T t) {
        PointQuadTree pointQuadTree = this;
        while (pointQuadTree.mChildren != null) {
            if (d2 < pointQuadTree.mBounds.midY) {
                if (d < pointQuadTree.mBounds.midX) {
                    pointQuadTree = pointQuadTree.mChildren.get(0);
                } else {
                    pointQuadTree = pointQuadTree.mChildren.get(1);
                }
            } else if (d < pointQuadTree.mBounds.midX) {
                pointQuadTree = pointQuadTree.mChildren.get(2);
            } else {
                pointQuadTree = pointQuadTree.mChildren.get(3);
            }
        }
        if (pointQuadTree.mItems == null) {
            pointQuadTree.mItems = new LinkedHashSet();
        }
        pointQuadTree.mItems.add(t);
        if (pointQuadTree.mItems.size() > 50 && pointQuadTree.mDepth < 40) {
            pointQuadTree.split();
        }
    }

    private void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        arrayList.add(new PointQuadTree(this.mBounds.minX, this.mBounds.midX, this.mBounds.minY, this.mBounds.midY, this.mDepth + 1));
        this.mChildren.add(new PointQuadTree(this.mBounds.midX, this.mBounds.maxX, this.mBounds.minY, this.mBounds.midY, this.mDepth + 1));
        this.mChildren.add(new PointQuadTree(this.mBounds.minX, this.mBounds.midX, this.mBounds.midY, this.mBounds.maxY, this.mDepth + 1));
        this.mChildren.add(new PointQuadTree(this.mBounds.midX, this.mBounds.maxX, this.mBounds.midY, this.mBounds.maxY, this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        for (T t : set) {
            insert(t.getPoint().x, t.getPoint().y, t);
        }
    }

    public boolean remove(T t) {
        Point point = t.getPoint();
        if (!this.mBounds.contains(point.x, point.y)) {
            return false;
        }
        return remove(point.x, point.y, t);
    }

    private boolean remove(double d, double d2, T t) {
        PointQuadTree pointQuadTree = this;
        while (pointQuadTree.mChildren != null) {
            if (d2 < pointQuadTree.mBounds.midY) {
                if (d < pointQuadTree.mBounds.midX) {
                    pointQuadTree = pointQuadTree.mChildren.get(0);
                } else {
                    pointQuadTree = pointQuadTree.mChildren.get(1);
                }
            } else if (d < pointQuadTree.mBounds.midX) {
                pointQuadTree = pointQuadTree.mChildren.get(2);
            } else {
                pointQuadTree = pointQuadTree.mChildren.get(3);
            }
        }
        Set<T> set = pointQuadTree.mItems;
        if (set == null) {
            return false;
        }
        return set.remove(t);
    }

    public void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public Collection<T> search(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        search(bounds, arrayList);
        return arrayList;
    }

    private void search(Bounds bounds, Collection<T> collection) {
        if (this.mBounds.intersects(bounds)) {
            List<PointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                for (PointQuadTree<T> search : list) {
                    search.search(bounds, collection);
                }
            } else if (this.mItems == null) {
            } else {
                if (bounds.contains(this.mBounds)) {
                    collection.addAll(this.mItems);
                    return;
                }
                for (T t : this.mItems) {
                    if (bounds.contains(t.getPoint())) {
                        collection.add(t);
                    }
                }
            }
        }
    }
}
