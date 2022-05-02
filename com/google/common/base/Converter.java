package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @NullableDecl
    @LazyInit
    private transient Converter<B, A> reverse;

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract A doBackward(B b);

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract B doForward(A a2);

    public Converter() {
        this(true);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public final B convert(@NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public B correctedDoForward(@NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return Preconditions.checkNotNull(doForward(a2));
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b) {
        if (!this.handleNullAutomatically) {
            return doBackward(b);
        }
        if (b == null) {
            return null;
        }
        return Preconditions.checkNotNull(doBackward(b));
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() {
            public Iterator<B> iterator() {
                return new Iterator<B>() {
                    private final Iterator<? extends A> fromIterator = iterable.iterator();

                    public boolean hasNext() {
                        return this.fromIterator.hasNext();
                    }

                    public B next() {
                        return Converter.this.convert(this.fromIterator.next());
                    }

                    public void remove() {
                        this.fromIterator.remove();
                    }
                };
            }
        };
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }

        /* access modifiers changed from: protected */
        public final A doForward(B b) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public final B doBackward(A a2) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final A correctedDoForward(@NullableDecl B b) {
            return this.original.correctedDoBackward(b);
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final B correctedDoBackward(@NullableDecl A a2) {
            return this.original.correctedDoForward(a2);
        }

        public final Converter<A, B> reverse() {
            return this.original;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public final int hashCode() {
            return this.original.hashCode() ^ -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.original);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    /* access modifiers changed from: package-private */
    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) Preconditions.checkNotNull(converter));
    }

    static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        /* access modifiers changed from: protected */
        public final C doForward(A a2) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public final A doBackward(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final C correctedDoForward(@NullableDecl A a2) {
            return this.second.correctedDoForward(this.first.correctedDoForward(a2));
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final A correctedDoBackward(@NullableDecl C c) {
            return this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof ConverterComposition) {
                ConverterComposition converterComposition = (ConverterComposition) obj;
                if (!this.first.equals(converterComposition.first) || !this.second.equals(converterComposition.second)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.first);
            sb.append(".andThen(");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    @NullableDecl
    @CanIgnoreReturnValue
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new FunctionBasedConverter(function, function2);
    }

    static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.forwardFunction = (Function) Preconditions.checkNotNull(function);
            this.backwardFunction = (Function) Preconditions.checkNotNull(function2);
        }

        /* access modifiers changed from: protected */
        public final B doForward(A a2) {
            return this.forwardFunction.apply(a2);
        }

        /* access modifiers changed from: protected */
        public final A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
                if (!this.forwardFunction.equals(functionBasedConverter.forwardFunction) || !this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Converter.from(");
            sb.append(this.forwardFunction);
            sb.append(", ");
            sb.append(this.backwardFunction);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.INSTANCE;
    }

    static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final IdentityConverter<?> INSTANCE = new IdentityConverter<>();
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: protected */
        public final T doBackward(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        public final T doForward(T t) {
            return t;
        }

        public final IdentityConverter<T> reverse() {
            return this;
        }

        public final String toString() {
            return "Converter.identity()";
        }

        private IdentityConverter() {
        }

        /* access modifiers changed from: package-private */
        public final <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }
}
