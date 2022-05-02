package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.collections.MapObjectManager;

public class PolylineManager extends MapObjectManager<Polyline, Collection> implements GoogleMap.OnPolylineClickListener {
    public PolylineManager(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    /* access modifiers changed from: package-private */
    public void setListenersOnUiThread() {
        if (this.mMap != null) {
            this.mMap.setOnPolylineClickListener(this);
        }
    }

    public Collection newCollection() {
        return new Collection();
    }

    /* access modifiers changed from: protected */
    public void removeObjectFromMap(Polyline polyline) {
        polyline.remove();
    }

    public void onPolylineClick(Polyline polyline) {
        Collection collection = (Collection) this.mAllObjects.get(polyline);
        if (collection != null && collection.mPolylineClickListener != null) {
            collection.mPolylineClickListener.onPolylineClick(polyline);
        }
    }

    public class Collection extends MapObjectManager.Collection {
        /* access modifiers changed from: private */
        public GoogleMap.OnPolylineClickListener mPolylineClickListener;

        public Collection() {
            super();
        }

        public Polyline addPolyline(PolylineOptions polylineOptions) {
            Polyline addPolyline = PolylineManager.this.mMap.addPolyline(polylineOptions);
            super.add(addPolyline);
            return addPolyline;
        }

        public void addAll(java.util.Collection<PolylineOptions> collection) {
            for (PolylineOptions addPolyline : collection) {
                addPolyline(addPolyline);
            }
        }

        public void addAll(java.util.Collection<PolylineOptions> collection, boolean z) {
            for (PolylineOptions addPolyline : collection) {
                addPolyline(addPolyline).setVisible(z);
            }
        }

        public void showAll() {
            for (Polyline visible : getPolylines()) {
                visible.setVisible(true);
            }
        }

        public void hideAll() {
            for (Polyline visible : getPolylines()) {
                visible.setVisible(false);
            }
        }

        public boolean remove(Polyline polyline) {
            return super.remove(polyline);
        }

        public java.util.Collection<Polyline> getPolylines() {
            return getObjects();
        }

        public void setOnPolylineClickListener(GoogleMap.OnPolylineClickListener onPolylineClickListener) {
            this.mPolylineClickListener = onPolylineClickListener;
        }
    }
}
