package o;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import java.util.concurrent.atomic.AtomicLong;

public class ISafeTokenComponent {
    private static final int MAX_TIME_LIMIT_IN_SECS = 1800;
    private static final int RETRY_EXPONENTIAL_BASE = 2;
    private AtomicLong mAttemptCount = new AtomicLong(0);
    private final int mBackoffBase;

    public ISafeTokenComponent(int i) {
        this.mBackoffBase = i;
    }

    public long getNextRetryTime() {
        return Math.min((long) Math.pow((double) (this.mBackoffBase * 2), (double) this.mAttemptCount.getAndAdd(1)), GriverConfigConstants.DEFAULT_ASYNC_UPDATE_PERIOD);
    }

    public void resetCounter() {
        this.mAttemptCount.set(0);
    }
}
