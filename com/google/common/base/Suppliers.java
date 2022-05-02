package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class Suppliers {

    interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        SupplierComposition(Function<? super F, T> function2, Supplier<F> supplier2) {
            this.function = (Function) Preconditions.checkNotNull(function2);
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier2);
        }

        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (!this.function.equals(supplierComposition.function) || !this.supplier.equals(supplierComposition.supplier)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.function, this.supplier);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.compose(");
            sb.append(this.function);
            sb.append(", ");
            sb.append(this.supplier);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    @VisibleForTesting
    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        volatile transient boolean initialized;
        @NullableDecl
        transient T value;

        MemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        return t;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.initialized) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.value);
                sb2.append(SimpleComparison.GREATER_THAN_OPERATION);
                obj = sb2.toString();
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    @VisibleForTesting
    static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        volatile Supplier<T> delegate;
        volatile boolean initialized;
        @NullableDecl
        T value;

        NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        this.delegate = null;
                        return t;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object obj = this.delegate;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == null) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.value);
                sb2.append(SimpleComparison.GREATER_THAN_OPERATION);
                obj = sb2.toString();
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(supplier, j, timeUnit);
    }

    @VisibleForTesting
    static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        @NullableDecl
        volatile transient T value;

        ExpiringMemoizingSupplier(Supplier<T> supplier, long j, TimeUnit timeUnit) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
            this.durationNanos = timeUnit.toNanos(j);
            Preconditions.checkArgument(j > 0, "duration (%s %s) must be > 0", j, (Object) timeUnit);
        }

        public T get() {
            long j = this.expirationNanos;
            long systemNanoTime = Platform.systemNanoTime();
            if (j == 0 || systemNanoTime - j >= 0) {
                synchronized (this) {
                    if (j == this.expirationNanos) {
                        T t = this.delegate.get();
                        this.value = t;
                        long j2 = systemNanoTime + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.expirationNanos = j2;
                        return t;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.memoizeWithExpiration(");
            sb.append(this.delegate);
            sb.append(", ");
            sb.append(this.durationNanos);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    public static <T> Supplier<T> ofInstance(@NullableDecl T t) {
        return new SupplierOfInstance(t);
    }

    static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        final T instance;

        SupplierOfInstance(@NullableDecl T t) {
            this.instance = t;
        }

        public T get() {
            return this.instance;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
            sb.append(this.instance);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }

    static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        ThreadSafeSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.synchronizedSupplier(");
            sb.append(this.delegate);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        public final String toString() {
            return "Suppliers.supplierFunction()";
        }

        public final Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }
    }
}
