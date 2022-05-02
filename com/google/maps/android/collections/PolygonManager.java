package com.google.maps.android.collections;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.collections.MapObjectManager;

public class PolygonManager extends MapObjectManager<Polygon, Collection> implements GoogleMap.OnPolygonClickListener {
    public PolygonManager(GoogleMap googleMap) {
        super(googleMap);
    }

    /* access modifiers changed from: package-private */
    public void setListenersOnUiThread() {
        if (this.mMap != null) {
            this.mMap.setOnPolygonClickListener(this);
        }
    }

    public Collection newCollection() {
        return new Collection();
    }

    /* access modifiers changed from: protected */
    public void removeObjectFromMap(Polygon polygon) {
        polygon.remove();
    }

    public void onPolygonClick(Polygon polygon) {
        Collection collection = (Collection) this.mAllObjects.get(polygon);
        if (collection != null && collection.mPolygonClickListener != null) {
            collection.mPolygonClickListener.onPolygonClick(polygon);
        }
    }

    public class Collection extends MapObjectManager.Collection {
        /* access modifiers changed from: private */
        public GoogleMap.OnPolygonClickListener mPolygonClickListener;

        public Collection() {
            super();
        }

        public Polygon addPolygon(PolygonOptions polygonOptions) {
            Polygon addPolygon = PolygonManager.this.mMap.addPolygon(polygonOptions);
            super.add(addPolygon);
            return addPolygon;
        }

        public void addAll(java.util.Collection<PolygonOptions> collection) {
            for (PolygonOptions addPolygon : collection) {
                addPolygon(addPolygon);
            }
        }

        public void addAll(java.util.Collection<PolygonOptions> collection, boolean z) {
            for (PolygonOptions addPolygon : collection) {
                addPolygon(addPolygon).setVisible(z);
            }
        }

        public void showAll() {
            for (Polygon visible : getPolygons()) {
                visible.setVisible(true);
            }
        }

        public void hideAll() {
            for (Polygon visible : getPolygons()) {
                visible.setVisible(false);
            }
        }

        public boolean remove(Polygon polygon) {
            return super.remove(polygon);
        }

        public java.util.Collection<Polygon> getPolygons() {
            return getObjects();
        }

        public void setOnPolygonClickListener(GoogleMap.OnPolygonClickListener onPolygonClickListener) {
            this.mPolygonClickListener = onPolygonClickListener;
        }
    }
}
