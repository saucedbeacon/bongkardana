package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    public final boolean isPresent() {
        return true;
    }

    Present(T t) {
        this.reference = t;
    }

    public final T get() {
        return this.reference;
    }

    public final T or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public final Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    public final T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.reference;
    }

    public final T orNull() {
        return this.reference;
    }

    public final Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    public final <V> Optional<V> transform(Function<? super T, V> function) {
        return new Present(Preconditions.checkNotNull(function.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }
}
