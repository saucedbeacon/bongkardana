package o;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.primitives.Longs;
import io.split.android.client.dtos.Counter;
import io.split.android.client.dtos.Latency;
import io.split.android.client.metrics.DTOMetrics;
import io.split.android.client.metrics.ILatencyTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o.b;

public final class putByteArray implements b.a {
    private final Map<String, length> _countMap;
    private AtomicLong _counterLastUpdateTimeMillis;
    private final Object _counterLock;
    private AtomicLong _latencyLastUpdateTimeMillis;
    private final Object _latencyLock;
    private final Map<String, ILatencyTracker> _latencyMap;
    private final DTOMetrics _metrics;
    private final int _queueForTheseManyCalls;
    private long _refreshPeriodInMillis;

    putByteArray(DTOMetrics dTOMetrics, int i) {
        this(dTOMetrics, i, TimeUnit.MINUTES.toMillis(1));
    }

    public putByteArray(DTOMetrics dTOMetrics, long j) {
        this(dTOMetrics, 100, j);
    }

    private putByteArray(DTOMetrics dTOMetrics, int i, long j) {
        this._latencyLock = new Object();
        this._latencyLastUpdateTimeMillis = new AtomicLong(System.currentTimeMillis());
        this._counterLock = new Object();
        this._counterLastUpdateTimeMillis = new AtomicLong(System.currentTimeMillis());
        this._metrics = dTOMetrics;
        this._latencyMap = Maps.newHashMap();
        this._countMap = Maps.newHashMap();
        Preconditions.checkArgument(i > 0, "queue for cache should be greater than zero");
        this._queueForTheseManyCalls = i;
        this._refreshPeriodInMillis = j;
    }

    public final void count(String str, long j) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1674278842, oncanceled);
            onCancelLoad.getMin(-1674278842, oncanceled);
        }
        if (j > 0 && str != null && !str.trim().isEmpty()) {
            synchronized (this._counterLock) {
                length length3 = this._countMap.get(str);
                if (length3 == null) {
                    length3 = new length();
                    this._countMap.put(str, length3);
                }
                length3.addDelta(j);
                if (length3._count >= this._queueForTheseManyCalls || hasTimeElapsed(this._counterLastUpdateTimeMillis)) {
                    Counter counter = new Counter();
                    counter.name = str;
                    counter.delta = length3._sum;
                    length3.clear();
                    this._counterLastUpdateTimeMillis.set(System.currentTimeMillis());
                    this._metrics.count(counter);
                }
            }
        }
    }

    private boolean hasTimeElapsed(AtomicLong atomicLong) {
        return System.currentTimeMillis() - atomicLong.get() > this._refreshPeriodInMillis;
    }

    public final void time(String str, long j) {
        if (str != null && !str.trim().isEmpty() && j >= 0) {
            synchronized (this._latencyLock) {
                if (!this._latencyMap.containsKey(str)) {
                    this._latencyMap.put(str, new removeLong());
                }
                ILatencyTracker iLatencyTracker = this._latencyMap.get(str);
                iLatencyTracker.addLatencyMillis((long) ((int) j));
                if (hasTimeElapsed(this._latencyLastUpdateTimeMillis)) {
                    Latency latency = new Latency();
                    latency.name = str;
                    latency.latencies = Longs.asList(iLatencyTracker.getLatencies());
                    iLatencyTracker.clear();
                    this._latencyLastUpdateTimeMillis.set(System.currentTimeMillis());
                    this._metrics.time(latency);
                }
            }
        }
    }

    static final class length {
        /* access modifiers changed from: private */
        public int _count;
        /* access modifiers changed from: private */
        public long _sum;

        private length() {
            this._count = 0;
            this._sum = 0;
        }

        /* access modifiers changed from: package-private */
        public final void addDelta(long j) {
            this._count++;
            this._sum += j;
        }

        /* access modifiers changed from: package-private */
        public final void clear() {
            this._count = 0;
            this._sum = 0;
        }
    }
}
