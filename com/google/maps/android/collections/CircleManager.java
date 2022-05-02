package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.maps.android.collections.MapObjectManager;

public class CircleManager extends MapObjectManager<Circle, Collection> implements GoogleMap.OnCircleClickListener {
    public CircleManager(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    /* access modifiers changed from: package-private */
    public void setListenersOnUiThread() {
        if (this.mMap != null) {
            this.mMap.setOnCircleClickListener(this);
        }
    }

    public Collection newCollection() {
        return new Collection();
    }

    /* access modifiers changed from: protected */
    public void removeObjectFromMap(Circle circle) {
        circle.remove();
    }

    public void onCircleClick(Circle circle) {
        Collection collection = (Collection) this.mAllObjects.get(circle);
        if (collection != null && collection.mCircleClickListener != null) {
            collection.mCircleClickListener.onCircleClick(circle);
        }
    }

    public class Collection extends MapObjectManager.Collection {
        /* access modifiers changed from: private */
        public GoogleMap.OnCircleClickListener mCircleClickListener;

        public Collection() {
            super();
        }

        public Circle addCircle(CircleOptions circleOptions) {
            Circle addCircle = CircleManager.this.mMap.addCircle(circleOptions);
            super.add(addCircle);
            return addCircle;
        }

        public void addAll(java.util.Collection<CircleOptions> collection) {
            for (CircleOptions addCircle : collection) {
                addCircle(addCircle);
            }
        }

        public void addAll(java.util.Collection<CircleOptions> collection, boolean z) {
            for (CircleOptions addCircle : collection) {
                addCircle(addCircle).setVisible(z);
            }
        }

        public void showAll() {
            for (Circle visible : getCircles()) {
                visible.setVisible(true);
            }
        }

        public void hideAll() {
            for (Circle visible : getCircles()) {
                visible.setVisible(false);
            }
        }

        public boolean remove(Circle circle) {
            return super.remove(circle);
        }

        public java.util.Collection<Circle> getCircles() {
            return getObjects();
        }

        public void setOnCircleClickListener(GoogleMap.OnCircleClickListener onCircleClickListener) {
            this.mCircleClickListener = onCircleClickListener;
        }
    }
}
