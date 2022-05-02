package o;

import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;

public final class getNextTransition implements CacheKeyFactory {
    public static final getNextTransition setMax = new getNextTransition();

    public final String buildCacheKey(DataSpec dataSpec) {
        return CacheUtil.getKey(dataSpec);
    }
}
