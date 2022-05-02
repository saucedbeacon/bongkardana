package o;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class getImpl {
    private final Cache<Long, Long> mCache;

    public getImpl(long j) {
        this.mCache = CacheBuilder.newBuilder().maximumSize(j).concurrencyLevel(4).build();
    }

    public Long testAndSet(dynamicDecryptDDp dynamicdecryptddp) {
        if (dynamicdecryptddp == null) {
            return null;
        }
        Long process = createLiteVMInstance.process(dynamicdecryptddp);
        Long ifPresent = this.mCache.getIfPresent(process);
        this.mCache.put(process, Long.valueOf(dynamicdecryptddp.time()));
        if (ifPresent == null) {
            return null;
        }
        return Long.valueOf(Math.min(ifPresent.longValue(), dynamicdecryptddp.time()));
    }
}
