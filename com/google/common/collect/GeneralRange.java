package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    @NullableDecl
    private final T lowerEndpoint;
    @NullableDecl
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    @NullableDecl
    private final T upperEndpoint;

    static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        T t = null;
        T lowerEndpoint2 = range.hasLowerBound() ? range.lowerEndpoint() : null;
        BoundType lowerBoundType2 = range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN;
        if (range.hasUpperBound()) {
            t = range.upperEndpoint();
        }
        return new GeneralRange(Ordering.natural(), range.hasLowerBound(), lowerEndpoint2, lowerBoundType2, range.hasUpperBound(), t, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    static <T> GeneralRange<T> all(Comparator<? super T> comparator2) {
        return new GeneralRange(comparator2, false, (Object) null, BoundType.OPEN, false, (Object) null, BoundType.OPEN);
    }

    static <T> GeneralRange<T> downTo(Comparator<? super T> comparator2, @NullableDecl T t, BoundType boundType) {
        return new GeneralRange(comparator2, true, t, boundType, false, (T) null, BoundType.OPEN);
    }

    static <T> GeneralRange<T> upTo(Comparator<? super T> comparator2, @NullableDecl T t, BoundType boundType) {
        return new GeneralRange(comparator2, false, (Object) null, BoundType.OPEN, true, t, boundType);
    }

    static <T> GeneralRange<T> range(Comparator<? super T> comparator2, @NullableDecl T t, BoundType boundType, @NullableDecl T t2, BoundType boundType2) {
        return new GeneralRange(comparator2, true, t, boundType, true, t2, boundType2);
    }

    private GeneralRange(Comparator<? super T> comparator2, boolean z, @NullableDecl T t, BoundType boundType, boolean z2, @NullableDecl T t2, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator2);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator2.compare(t, t);
        }
        if (z2) {
            comparator2.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator2.compare(t, t2);
            boolean z3 = true;
            Preconditions.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", (Object) t, (Object) t2);
            if (compare == 0) {
                Preconditions.checkArgument((boundType != BoundType.OPEN) | (boundType2 == BoundType.OPEN ? false : z3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Comparator<? super T> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: package-private */
    public final boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    /* access modifiers changed from: package-private */
    public final boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    /* access modifiers changed from: package-private */
    public final boolean isEmpty() {
        if (!hasUpperBound() || !tooLow(getUpperEndpoint())) {
            return hasLowerBound() && tooHigh(getLowerEndpoint());
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean tooLow(@NullableDecl T t) {
        boolean z = false;
        if (!hasLowerBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, getLowerEndpoint());
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (getLowerBoundType() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: package-private */
    public final boolean tooHigh(@NullableDecl T t) {
        boolean z = false;
        if (!hasUpperBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, getUpperEndpoint());
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (getUpperBoundType() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: package-private */
    public final boolean contains(@NullableDecl T t) {
        return !tooLow(t) && !tooHigh(t);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        if (r12.getUpperBoundType() == com.google.common.collect.BoundType.OPEN) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r12.getLowerBoundType() == com.google.common.collect.BoundType.OPEN) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> r12) {
        /*
            r11 = this;
            com.google.common.base.Preconditions.checkNotNull(r12)
            java.util.Comparator<? super T> r0 = r11.comparator
            java.util.Comparator<? super T> r1 = r12.comparator
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r11.hasLowerBound
            java.lang.Object r1 = r11.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r11.getLowerBoundType()
            boolean r3 = r11.hasLowerBound()
            if (r3 != 0) goto L_0x0021
            boolean r0 = r12.hasLowerBound
            goto L_0x0041
        L_0x0021:
            boolean r3 = r12.hasLowerBound()
            if (r3 == 0) goto L_0x0049
            java.util.Comparator<? super T> r3 = r11.comparator
            java.lang.Object r4 = r11.getLowerEndpoint()
            java.lang.Object r5 = r12.getLowerEndpoint()
            int r3 = r3.compare(r4, r5)
            if (r3 < 0) goto L_0x0041
            if (r3 != 0) goto L_0x0049
            com.google.common.collect.BoundType r3 = r12.getLowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L_0x0049
        L_0x0041:
            java.lang.Object r1 = r12.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r12.getLowerBoundType()
        L_0x0049:
            r5 = r0
            boolean r0 = r11.hasUpperBound
            java.lang.Object r3 = r11.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r11.getUpperBoundType()
            boolean r6 = r11.hasUpperBound()
            if (r6 != 0) goto L_0x005d
            boolean r0 = r12.hasUpperBound
            goto L_0x007d
        L_0x005d:
            boolean r6 = r12.hasUpperBound()
            if (r6 == 0) goto L_0x0085
            java.util.Comparator<? super T> r6 = r11.comparator
            java.lang.Object r7 = r11.getUpperEndpoint()
            java.lang.Object r8 = r12.getUpperEndpoint()
            int r6 = r6.compare(r7, r8)
            if (r6 > 0) goto L_0x007d
            if (r6 != 0) goto L_0x0085
            com.google.common.collect.BoundType r6 = r12.getUpperBoundType()
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            if (r6 != r7) goto L_0x0085
        L_0x007d:
            java.lang.Object r3 = r12.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r12.getUpperBoundType()
        L_0x0085:
            r8 = r0
            r9 = r3
            if (r5 == 0) goto L_0x00a5
            if (r8 == 0) goto L_0x00a5
            java.util.Comparator<? super T> r12 = r11.comparator
            int r12 = r12.compare(r1, r9)
            if (r12 > 0) goto L_0x009d
            if (r12 != 0) goto L_0x00a5
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r2 != r12) goto L_0x00a5
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r4 != r12) goto L_0x00a5
        L_0x009d:
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r7 = r12
            r10 = r0
            r6 = r9
            goto L_0x00a8
        L_0x00a5:
            r6 = r1
            r7 = r2
            r10 = r4
        L_0x00a8:
            com.google.common.collect.GeneralRange r12 = new com.google.common.collect.GeneralRange
            java.util.Comparator<? super T> r4 = r11.comparator
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.intersect(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (!this.comparator.equals(generalRange.comparator) || this.hasLowerBound != generalRange.hasLowerBound || this.hasUpperBound != generalRange.hasUpperBound || !getLowerBoundType().equals(generalRange.getLowerBoundType()) || !getUpperBoundType().equals(generalRange.getUpperBoundType()) || !Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) || !Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    /* access modifiers changed from: package-private */
    public final GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange generalRange2 = new GeneralRange(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comparator);
        sb.append(":");
        sb.append(this.lowerBoundType == BoundType.CLOSED ? '[' : '(');
        sb.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb.append(',');
        sb.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb.append(this.upperBoundType == BoundType.CLOSED ? ']' : ')');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    /* access modifiers changed from: package-private */
    public final BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    /* access modifiers changed from: package-private */
    public final T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    /* access modifiers changed from: package-private */
    public final BoundType getUpperBoundType() {
        return this.upperBoundType;
    }
}
