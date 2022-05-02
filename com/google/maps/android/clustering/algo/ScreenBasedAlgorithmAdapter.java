package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;

public class ScreenBasedAlgorithmAdapter<T extends ClusterItem> extends AbstractAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private Algorithm<T> mAlgorithm;

    public void onCameraChange(CameraPosition cameraPosition) {
    }

    public boolean shouldReclusterOnMapMovement() {
        return false;
    }

    public ScreenBasedAlgorithmAdapter(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    public boolean addItem(T t) {
        return this.mAlgorithm.addItem(t);
    }

    public boolean addItems(Collection<T> collection) {
        return this.mAlgorithm.addItems(collection);
    }

    public void clearItems() {
        this.mAlgorithm.clearItems();
    }

    public boolean removeItem(T t) {
        return this.mAlgorithm.removeItem(t);
    }

    public boolean removeItems(Collection<T> collection) {
        return this.mAlgorithm.removeItems(collection);
    }

    public boolean updateItem(T t) {
        return this.mAlgorithm.updateItem(t);
    }

    public Set<? extends Cluster<T>> getClusters(float f) {
        return this.mAlgorithm.getClusters(f);
    }

    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    public void setMaxDistanceBetweenClusteredItems(int i) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i);
    }

    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }
}
