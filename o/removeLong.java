package o;

import io.split.android.client.metrics.ILatencyTracker;
import java.util.Arrays;

public final class removeLong implements ILatencyTracker {
    private static final long[] BUCKETS = {1000, 1500, 2250, 3375, 5063, 7594, 11391, 17086, 25629, 38443, 57665, 86498, 129746, 194620, 291929, 437894, 656841, 985261, 1477892, 2216838, 3325257, 4987885, MAX_LATENCY};
    private static final long MAX_LATENCY = 7481828;
    private long[] latencies = new long[BUCKETS.length];

    public final void addLatencyMillis(long j) {
        int findIndex = findIndex(j * 1000);
        long[] jArr = this.latencies;
        jArr[findIndex] = jArr[findIndex] + 1;
    }

    public final void addLatencyMicros(long j) {
        int findIndex = findIndex(j);
        long[] jArr = this.latencies;
        jArr[findIndex] = jArr[findIndex] + 1;
    }

    public final long[] getLatencies() {
        return this.latencies;
    }

    public final long getLatency(int i) {
        return this.latencies[i];
    }

    public final void clear() {
        this.latencies = new long[BUCKETS.length];
    }

    public final long getBucketForLatencyMillis(long j) {
        return this.latencies[findIndex(j * 1000)];
    }

    public final long getBucketForLatencyMicros(long j) {
        return this.latencies[findIndex(j)];
    }

    private int findIndex(long j) {
        if (j > MAX_LATENCY) {
            return BUCKETS.length - 1;
        }
        int binarySearch = Arrays.binarySearch(BUCKETS, j);
        return binarySearch < 0 ? -(binarySearch + 1) : binarySearch;
    }
}
