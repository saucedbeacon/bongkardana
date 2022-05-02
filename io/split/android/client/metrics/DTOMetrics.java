package io.split.android.client.metrics;

import io.split.android.client.dtos.Counter;
import io.split.android.client.dtos.Latency;

public interface DTOMetrics {
    void count(Counter counter);

    void time(Latency latency);
}
