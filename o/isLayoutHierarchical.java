package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class isLayoutHierarchical implements Iterable<Object> {
    private ArrayList<Object> list = new ArrayList<>();

    isLayoutHierarchical() {
    }

    @NonNull
    @Deprecated
    public static isLayoutHierarchical from(@NonNull onItemsUpdated onitemsupdated) {
        if (onitemsupdated != null) {
            return performAccessibilityActionForItem.builderFrom((List<?>) onitemsupdated.getHistory());
        }
        throw new IllegalArgumentException("Backstack cannot be null!");
    }

    @NonNull
    @Deprecated
    public static isLayoutHierarchical from(@NonNull getSelectionModeForAccessibility getselectionmodeforaccessibility) {
        if (getselectionmodeforaccessibility != null) {
            return performAccessibilityActionForItem.builderFrom(getselectionmodeforaccessibility.getBackstack());
        }
        throw new IllegalArgumentException("BackstackDelegate cannot be null!");
    }

    @NonNull
    @Deprecated
    public static isLayoutHierarchical from(Object... objArr) {
        return performAccessibilityActionForItem.builderFrom((List<?>) Arrays.asList(objArr));
    }

    @NonNull
    @Deprecated
    public static isLayoutHierarchical from(@NonNull List<?> list2) {
        for (Object obj : list2) {
            if (obj == null) {
                throw new IllegalArgumentException("Cannot provide `null` as a key!");
            }
        }
        return performAccessibilityActionForItem.newBuilder().addAll(list2);
    }

    @NonNull
    @Deprecated
    public static isLayoutHierarchical newBuilder() {
        return new isLayoutHierarchical();
    }

    @NonNull
    @Deprecated
    public static performAccessibilityActionForItem<Object> single(@NonNull Object obj) {
        return performAccessibilityActionForItem.newBuilder().add(obj).build();
    }

    @NonNull
    public isLayoutHierarchical addAll(@NonNull List<?> list2) {
        if (list2 != null) {
            this.list.addAll(list2);
            return this;
        }
        throw new IllegalArgumentException("Provided collection cannot be null");
    }

    @NonNull
    public isLayoutHierarchical addAllAt(@NonNull List<?> list2, int i) {
        if (list2 != null) {
            this.list.addAll(i, list2);
            return this;
        }
        throw new IllegalArgumentException("Provided collection cannot be null");
    }

    @NonNull
    public isLayoutHierarchical clear() {
        this.list.clear();
        return this;
    }

    public boolean contains(@NonNull Object obj) {
        checkKey(obj);
        return this.list.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        if (collection != null) {
            return this.list.containsAll(collection);
        }
        throw new IllegalArgumentException("Keys cannot be null!");
    }

    public int size() {
        return this.list.size();
    }

    @NonNull
    public isLayoutHierarchical remove(@NonNull Object obj) {
        checkKey(obj);
        this.list.remove(obj);
        return this;
    }

    @NonNull
    public isLayoutHierarchical removeAt(int i) {
        this.list.remove(i);
        return this;
    }

    @NonNull
    public isLayoutHierarchical retainAll(@NonNull Collection<?> collection) {
        checkKeys(collection);
        this.list.retainAll(collection);
        return this;
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @NonNull
    public isLayoutHierarchical removeLast() {
        if (!this.list.isEmpty()) {
            ArrayList<Object> arrayList = this.list;
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        throw new IllegalStateException("Cannot remove element from empty builder");
    }

    @NonNull
    public isLayoutHierarchical removeUntil(@NonNull Object obj) {
        checkKey(obj);
        while (!this.list.isEmpty() && !getLast().equals(obj)) {
            removeLast();
        }
        if (!this.list.isEmpty()) {
            return this;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(obj);
        sb.append("] was not found in history!");
        throw new IllegalArgumentException(sb.toString());
    }

    public int indexOf(@NonNull Object obj) {
        checkKey(obj);
        return this.list.indexOf(obj);
    }

    @NonNull
    public <T> T get(int i) {
        return this.list.get(i);
    }

    @Nullable
    public <T> T getLast() {
        if (this.list.isEmpty()) {
            return null;
        }
        ArrayList<Object> arrayList = this.list;
        return arrayList.get(arrayList.size() - 1);
    }

    @NonNull
    public isLayoutHierarchical add(@NonNull Object obj) {
        checkKey(obj);
        this.list.add(obj);
        return this;
    }

    @NonNull
    public isLayoutHierarchical add(@NonNull Object obj, int i) {
        checkKey(obj);
        this.list.add(i, obj);
        return this;
    }

    @NonNull
    public Iterator<Object> iterator() {
        return this.list.iterator();
    }

    @NonNull
    public <T> performAccessibilityActionForItem<T> build() {
        LinkedList linkedList = new LinkedList();
        Iterator<Object> it = this.list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next());
        }
        return new performAccessibilityActionForItem<>(linkedList);
    }

    private void checkKey(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("History key cannot be null!");
        }
    }

    private void checkKeys(Collection<?> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Keys cannot be null!");
        }
    }
}
