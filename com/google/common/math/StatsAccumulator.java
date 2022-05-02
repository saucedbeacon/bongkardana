package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

@GwtIncompatible
@Beta
public final class StatsAccumulator {
    private long count = 0;
    private double max = Double.NaN;
    private double mean = 0.0d;
    private double min = Double.NaN;
    private double sumOfSquaresOfDeltas = 0.0d;

    public final void add(double d) {
        long j = this.count;
        if (j == 0) {
            this.count = 1;
            this.mean = d;
            this.min = d;
            this.max = d;
            if (!Doubles.isFinite(d)) {
                this.sumOfSquaresOfDeltas = Double.NaN;
                return;
            }
            return;
        }
        this.count = j + 1;
        if (!Doubles.isFinite(d) || !Doubles.isFinite(this.mean)) {
            this.mean = calculateNewMeanNonFinite(this.mean, d);
            this.sumOfSquaresOfDeltas = Double.NaN;
        } else {
            double d2 = this.mean;
            double d3 = d - d2;
            double d4 = (double) this.count;
            Double.isNaN(d4);
            double d5 = d2 + (d3 / d4);
            this.mean = d5;
            this.sumOfSquaresOfDeltas += d3 * (d - d5);
        }
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public final void addAll(Iterable<? extends Number> iterable) {
        for (Number doubleValue : iterable) {
            add(doubleValue.doubleValue());
        }
    }

    public final void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(((Number) it.next()).doubleValue());
        }
    }

    public final void addAll(double... dArr) {
        for (double add : dArr) {
            add(add);
        }
    }

    public final void addAll(int... iArr) {
        for (int i : iArr) {
            add((double) i);
        }
    }

    public final void addAll(long... jArr) {
        for (long j : jArr) {
            add((double) j);
        }
    }

    public final void addAll(Stats stats) {
        if (stats.count() != 0) {
            merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
        }
    }

    public final void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() != 0) {
            merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
        }
    }

    private void merge(long j, double d, double d2, double d3, double d4) {
        long j2 = j;
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        double d8 = d4;
        long j3 = this.count;
        if (j3 == 0) {
            this.count = j2;
            this.mean = d5;
            this.sumOfSquaresOfDeltas = d6;
            this.min = d7;
            this.max = d8;
            return;
        }
        this.count = j3 + j2;
        if (!Doubles.isFinite(this.mean) || !Doubles.isFinite(d)) {
            this.mean = calculateNewMeanNonFinite(this.mean, d5);
            this.sumOfSquaresOfDeltas = Double.NaN;
        } else {
            double d9 = this.mean;
            double d10 = d5 - d9;
            double d11 = (double) j2;
            Double.isNaN(d11);
            double d12 = (double) this.count;
            Double.isNaN(d12);
            double d13 = d9 + ((d10 * d11) / d12);
            this.mean = d13;
            double d14 = this.sumOfSquaresOfDeltas;
            Double.isNaN(d11);
            this.sumOfSquaresOfDeltas = d14 + d6 + (d10 * (d5 - d13) * d11);
        }
        this.min = Math.min(this.min, d7);
        this.max = Math.max(this.max, d4);
    }

    public final Stats snapshot() {
        return new Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
    }

    public final long count() {
        return this.count;
    }

    public final double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public final double sum() {
        double d = this.mean;
        double d2 = (double) this.count;
        Double.isNaN(d2);
        return d * d2;
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count != 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        double ensureNonNegative = DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas);
        double d = (double) this.count;
        Double.isNaN(d);
        return ensureNonNegative / d;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        double ensureNonNegative = DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas);
        double d = (double) (this.count - 1);
        Double.isNaN(d);
        return ensureNonNegative / d;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    /* access modifiers changed from: package-private */
    public final double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    static double calculateNewMeanNonFinite(double d, double d2) {
        if (Doubles.isFinite(d)) {
            return d2;
        }
        if (Doubles.isFinite(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }
}
