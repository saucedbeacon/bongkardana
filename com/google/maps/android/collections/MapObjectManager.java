package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.MapObjectManager.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class MapObjectManager<O, C extends Collection> {
    protected final Map<O, C> mAllObjects = new HashMap();
    protected final GoogleMap mMap;
    private final Map<String, C> mNamedCollections = new HashMap();

    public abstract C newCollection();

    /* access modifiers changed from: protected */
    public abstract void removeObjectFromMap(O o2);

    /* access modifiers changed from: package-private */
    public abstract void setListenersOnUiThread();

    public MapObjectManager(@NonNull GoogleMap googleMap) {
        this.mMap = googleMap;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                MapObjectManager.this.setListenersOnUiThread();
            }
        });
    }

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) == null) {
            C newCollection = newCollection();
            this.mNamedCollections.put(str, newCollection);
            return newCollection;
        }
        throw new IllegalArgumentException("collection id is not unique: ".concat(String.valueOf(str)));
    }

    public C getCollection(String str) {
        return (Collection) this.mNamedCollections.get(str);
    }

    public boolean remove(O o2) {
        Collection collection = (Collection) this.mAllObjects.get(o2);
        return collection != null && collection.remove(o2);
    }

    public class Collection {
        private final Set<O> mObjects = new HashSet();

        public Collection() {
        }

        /* access modifiers changed from: protected */
        public void add(O o2) {
            this.mObjects.add(o2);
            MapObjectManager.this.mAllObjects.put(o2, this);
        }

        /* access modifiers changed from: protected */
        public boolean remove(O o2) {
            if (!this.mObjects.remove(o2)) {
                return false;
            }
            MapObjectManager.this.mAllObjects.remove(o2);
            MapObjectManager.this.removeObjectFromMap(o2);
            return true;
        }

        public void clear() {
            for (O next : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(next);
                MapObjectManager.this.mAllObjects.remove(next);
            }
            this.mObjects.clear();
        }

        /* access modifiers changed from: protected */
        public java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }
    }
}
