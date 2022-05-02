package o;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class performAccessibilityActionForItem<T> extends AbstractList<T> implements List<T> {
    private final List<T> elements;

    performAccessibilityActionForItem() {
        this(Collections.emptyList());
    }

    performAccessibilityActionForItem(List<T> list) {
        this.elements = Collections.unmodifiableList(new ArrayList(list));
    }

    @Nullable
    public <K> K top() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    @NonNull
    public <K> K fromTop(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(314295423, oncanceled);
            onCancelLoad.getMin(314295423, oncanceled);
        }
        int size = size();
        if (size > 0) {
            int i2 = -size;
            if (i < i2 || i >= size) {
                StringBuilder sb = new StringBuilder("The provided offset value [");
                sb.append(i);
                sb.append("] was out of range: [");
                sb.append(i2);
                sb.append("; ");
                sb.append(size);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
            while (i < 0) {
                i += size;
            }
            return get(((size - 1) - (i % size)) % size);
        }
        throw new IllegalStateException("Cannot obtain elements from an uninitialized history.");
    }

    @Nullable
    public <K> K root() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    @NonNull
    public isLayoutHierarchical buildUpon() {
        return builderFrom((List<?>) this);
    }

    @NonNull
    public static <T> performAccessibilityActionForItem<T> of(T... tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i = 0;
            while (i < length) {
                if (tArr[i] != null) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Cannot provide `null` as a key!");
                }
            }
            return builderFrom((List<?>) Arrays.asList(tArr)).build();
        }
        throw new IllegalArgumentException("Cannot provide `null` as a key!");
    }

    @NonNull
    public static <T> performAccessibilityActionForItem<T> from(@NonNull List<? extends T> list) {
        return builderFrom((List<?>) list).build();
    }

    @NonNull
    public static isLayoutHierarchical builderFrom(@NonNull onItemsUpdated onitemsupdated) {
        if (onitemsupdated != null) {
            return newBuilder().addAll(onitemsupdated.getHistory());
        }
        throw new IllegalArgumentException("Backstack cannot be null!");
    }

    @NonNull
    public static isLayoutHierarchical builderFrom(@NonNull getSelectionModeForAccessibility getselectionmodeforaccessibility) {
        if (getselectionmodeforaccessibility != null) {
            return builderFrom(getselectionmodeforaccessibility.getBackstack());
        }
        throw new IllegalArgumentException("BackstackDelegate cannot be null!");
    }

    @NonNull
    public static isLayoutHierarchical builderOf(Object... objArr) {
        return builderFrom((List<?>) Arrays.asList(objArr));
    }

    @NonNull
    public static isLayoutHierarchical builderFrom(@NonNull List<?> list) {
        for (Object obj : list) {
            if (obj == null) {
                throw new IllegalArgumentException("Cannot provide `null` as a key!");
            }
        }
        return newBuilder().addAll(list);
    }

    @NonNull
    public static isLayoutHierarchical newBuilder() {
        return new isLayoutHierarchical();
    }

    @NonNull
    public static <T> performAccessibilityActionForItem<T> single(@NonNull T t) {
        return newBuilder().add(t).build();
    }

    public boolean add(T t) {
        return this.elements.add(t);
    }

    public T set(int i, T t) {
        return this.elements.set(i, t);
    }

    public void add(int i, T t) {
        this.elements.add(i, t);
    }

    public T remove(int i) {
        return this.elements.remove(i);
    }

    public int indexOf(Object obj) {
        return this.elements.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.elements.lastIndexOf(obj);
    }

    public void clear() {
        this.elements.clear();
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1937760915, oncanceled);
            onCancelLoad.getMin(1937760915, oncanceled);
        }
        return this.elements.addAll(i, collection);
    }

    @NonNull
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }

    @NonNull
    public ListIterator<T> listIterator() {
        return this.elements.listIterator();
    }

    @NonNull
    public ListIterator<T> listIterator(int i) {
        return this.elements.listIterator(i);
    }

    @NonNull
    public List<T> subList(int i, int i2) {
        return this.elements.subList(i, i2);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof performAccessibilityActionForItem)) {
            return this.elements.equals(((performAccessibilityActionForItem) obj).elements);
        }
        return false;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.elements.contains(obj);
    }

    @NonNull
    public Object[] toArray() {
        return this.elements.toArray();
    }

    @NonNull
    public <T1> T1[] toArray(@NonNull T1[] t1Arr) {
        return this.elements.toArray(t1Arr);
    }

    public boolean remove(Object obj) {
        return this.elements.remove(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.elements.containsAll(collection);
    }

    public boolean addAll(@NonNull Collection<? extends T> collection) {
        return this.elements.addAll(collection);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.elements.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.elements.retainAll(collection);
    }

    public String toString() {
        return Arrays.toString(this.elements.toArray());
    }

    public T get(int i) {
        return this.elements.get(i);
    }

    public int size() {
        return this.elements.size();
    }

    @TargetApi(24)
    public boolean removeIf(Predicate<? super T> predicate) {
        return this.elements.removeIf(predicate);
    }

    @TargetApi(24)
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        this.elements.replaceAll(unaryOperator);
    }

    @TargetApi(24)
    public void sort(Comparator<? super T> comparator) {
        this.elements.sort(comparator);
    }

    @TargetApi(24)
    public Spliterator<T> spliterator() {
        return this.elements.spliterator();
    }

    @TargetApi(24)
    public Stream<T> stream() {
        return this.elements.stream();
    }

    @TargetApi(24)
    public Stream<T> parallelStream() {
        return this.elements.parallelStream();
    }

    @TargetApi(24)
    public void forEach(Consumer<? super T> consumer) {
        this.elements.forEach(consumer);
    }
}
