package io.split.android.client.metrics;

public interface ILatencyTracker {
    void addLatencyMicros(long j);

    void addLatencyMillis(long j);

    void clear();

    long getBucketForLatencyMicros(long j);

    long getBucketForLatencyMillis(long j);

    long[] getLatencies();

    long getLatency(int i);
}
