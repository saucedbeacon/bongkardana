package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class onUMIDInitFinishedEx<E> implements Set<E> {
    private final Map<E, Integer> mValues = new ConcurrentHashMap();

    public final boolean retainAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Nullable
    public final Object[] toArray() {
        return new Object[0];
    }

    public final <T> T[] toArray(@Nullable T[] tArr) {
        return null;
    }

    public final int size() {
        return this.mValues.size();
    }

    public final boolean isEmpty() {
        return this.mValues.isEmpty();
    }

    public final boolean contains(@Nullable Object obj) {
        return this.mValues.get(obj) != null;
    }

    @NonNull
    public final Iterator<E> iterator() {
        return this.mValues.keySet().iterator();
    }

    public final boolean add(E e) {
        this.mValues.put(e, 1);
        return true;
    }

    public final boolean remove(@Nullable Object obj) {
        return this.mValues.remove(obj) != null;
    }

    public final boolean containsAll(@NonNull Collection<?> collection) {
        return this.mValues.keySet().containsAll(collection);
    }

    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        HashMap hashMap = new HashMap();
        for (Object put : collection) {
            hashMap.put(put, 1);
        }
        this.mValues.putAll(hashMap);
        return true;
    }

    public final boolean removeAll(@NonNull Collection<?> collection) {
        return this.mValues.keySet().removeAll(collection);
    }

    public final void clear() {
        this.mValues.clear();
    }
}
