package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SmartSet<T> extends AbstractSet<T> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    private Object data;
    private int size;

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    public final int size() {
        return getSize();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet<>((DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> collection) {
            Intrinsics.checkNotNullParameter(collection, "set");
            SmartSet<T> smartSet = new SmartSet<>((DefaultConstructorMarker) null);
            smartSet.addAll(collection);
            return smartSet;
        }
    }

    private SmartSet() {
    }

    public final int getSize() {
        return this.size;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    @NotNull
    public final Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new SingletonIterator<>(this.data);
        }
        if (size() < 5) {
            Object obj = this.data;
            if (obj != null) {
                return new ArrayIterator<>((Object[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        Object obj2 = this.data;
        if (obj2 != null) {
            return TypeIntrinsics.asMutableSet(obj2).iterator();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean add(T r6) {
        /*
            r5 = this;
            int r0 = r5.size()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r5.data = r6
            goto L_0x0081
        L_0x000b:
            int r0 = r5.size()
            r2 = 0
            if (r0 != r1) goto L_0x0027
            java.lang.Object r0 = r5.data
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x001b
            return r2
        L_0x001b:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r5.data
            r0[r2] = r3
            r0[r1] = r6
            r5.data = r0
            goto L_0x0081
        L_0x0027:
            int r0 = r5.size()
            r3 = 5
            if (r0 >= r3) goto L_0x0072
            java.lang.Object r0 = r5.data
            if (r0 == 0) goto L_0x006a
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.ArraysKt.contains((T[]) r0, r6)
            if (r3 == 0) goto L_0x003b
            return r2
        L_0x003b:
            int r3 = r5.size()
            r4 = 4
            if (r3 != r4) goto L_0x0053
            int r3 = r0.length
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            java.util.LinkedHashSet r0 = kotlin.collections.SetsKt.linkedSetOf(r3)
            r0.add(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            goto L_0x0067
        L_0x0053:
            int r2 = r5.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x0067:
            r5.data = r0
            goto L_0x0081
        L_0x006a:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            r6.<init>(r0)
            throw r6
        L_0x0072:
            java.lang.Object r0 = r5.data
            if (r0 == 0) goto L_0x008a
            java.util.Set r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableSet(r0)
            boolean r6 = r0.add(r6)
            if (r6 != 0) goto L_0x0081
            return r2
        L_0x0081:
            int r6 = r5.size()
            int r6 = r6 + r1
            r5.setSize(r6)
            return r1
        L_0x008a:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.utils.SmartSet.add(java.lang.Object):boolean");
    }

    public final void clear() {
        this.data = null;
        setSize(0);
    }

    public final boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.areEqual(this.data, obj);
        }
        if (size() < 5) {
            Object obj2 = this.data;
            if (obj2 != null) {
                return ArraysKt.contains((T[]) (Object[]) obj2, obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        }
        Object obj3 = this.data;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
    }

    static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {
        private final T element;
        private boolean hasNext = true;

        public SingletonIterator(T t) {
            this.element = t;
        }

        public final T next() {
            if (this.hasNext) {
                this.hasNext = false;
                return this.element;
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            return this.hasNext;
        }

        @NotNull
        public final Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {
        @NotNull
        private final Iterator<T> arrayIterator;

        public ArrayIterator(@NotNull T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            this.arrayIterator = ArrayIteratorKt.iterator(tArr);
        }

        public final boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        public final T next() {
            return this.arrayIterator.next();
        }

        @NotNull
        public final Void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
