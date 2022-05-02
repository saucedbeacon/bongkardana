package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getNextTransition;

public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    public static final CacheKeyFactory DEFAULT_CACHE_KEY_FACTORY = getNextTransition.setMax;

    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static String getKey(DataSpec dataSpec) {
        return dataSpec.key != null ? dataSpec.key : generateKey(dataSpec.uri);
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        long j;
        DataSpec dataSpec2 = dataSpec;
        CachingCounters cachingCounters2 = cachingCounters;
        String key = getKey(dataSpec);
        long j2 = dataSpec2.absoluteStreamPosition;
        if (dataSpec2.length != -1) {
            j = dataSpec2.length;
            Cache cache2 = cache;
        } else {
            j = cache.getContentLength(key);
        }
        cachingCounters2.contentLength = j;
        cachingCounters2.alreadyCachedBytes = 0;
        cachingCounters2.newlyCachedBytes = 0;
        long j3 = j2;
        long j4 = j;
        while (j4 != 0) {
            long cachedLength = cache.getCachedLength(key, j3, j4 != -1 ? j4 : Long.MAX_VALUE);
            if (cachedLength > 0) {
                cachingCounters2.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            j3 += cachedLength;
            if (j4 == -1) {
                cachedLength = 0;
            }
            j4 -= cachedLength;
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, @Nullable CachingCounters cachingCounters, @Nullable AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], (PriorityTaskManager) null, 0, cachingCounters, atomicBoolean, false);
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i, @Nullable CachingCounters cachingCounters, @Nullable AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        DataSpec dataSpec2 = dataSpec;
        Cache cache2 = cache;
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec2, cache2, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec);
        long j = dataSpec2.absoluteStreamPosition;
        long contentLength = dataSpec2.length != -1 ? dataSpec2.length : cache2.getContentLength(key);
        while (true) {
            long j2 = 0;
            if (contentLength != 0) {
                throwExceptionIfInterruptedOrCancelled(atomicBoolean);
                long cachedLength = cache.getCachedLength(key, j, contentLength != -1 ? contentLength : Long.MAX_VALUE);
                if (cachedLength <= 0) {
                    long j3 = -cachedLength;
                    long j4 = j3;
                    if (readAndDiscard(dataSpec, j, j3, cacheDataSource, bArr, priorityTaskManager, i, cachingCounters3, atomicBoolean) >= j4) {
                        cachedLength = j4;
                    } else if (z && contentLength != -1) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                }
                j += cachedLength;
                if (contentLength != -1) {
                    j2 = cachedLength;
                }
                contentLength -= j2;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        com.google.android.exoplayer2.util.Util.closeQuietly(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long readAndDiscard(com.google.android.exoplayer2.upstream.DataSpec r17, long r18, long r20, com.google.android.exoplayer2.upstream.DataSource r22, byte[] r23, com.google.android.exoplayer2.util.PriorityTaskManager r24, int r25, com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters r26, java.util.concurrent.atomic.AtomicBoolean r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r22
            r0 = r23
            r2 = r26
            r3 = r17
        L_0x0008:
            if (r24 == 0) goto L_0x000d
            r24.proceed(r25)
        L_0x000d:
            throwExceptionIfInterruptedOrCancelled(r27)     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            com.google.android.exoplayer2.upstream.DataSpec r15 = new com.google.android.exoplayer2.upstream.DataSpec     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            android.net.Uri r5 = r3.uri     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            int r6 = r3.httpMethod     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            byte[] r7 = r3.httpBody     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            long r8 = r3.position     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            long r8 = r8 + r18
            long r10 = r3.absoluteStreamPosition     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            long r10 = r8 - r10
            r12 = -1
            java.lang.String r14 = r3.key     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            int r4 = r3.flags     // Catch:{ PriorityTooLowException -> 0x0085, all -> 0x0080 }
            r16 = r4 | 2
            r4 = r15
            r8 = r18
            r17 = r3
            r3 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15)     // Catch:{ PriorityTooLowException -> 0x0087, all -> 0x0080 }
            long r4 = r1.open(r3)     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r6 = r2.contentLength     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0048
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0048
            long r6 = r3.absoluteStreamPosition     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r6 = r6 + r4
            r2.contentLength = r6     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
        L_0x0048:
            r4 = 0
        L_0x004a:
            int r6 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r6 == 0) goto L_0x007c
            throwExceptionIfInterruptedOrCancelled(r27)     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            r6 = 0
            int r7 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0060
            int r7 = r0.length     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r10 = (long) r7     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r12 = r20 - r4
            long r10 = java.lang.Math.min(r10, r12)     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            int r7 = (int) r10     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            goto L_0x0061
        L_0x0060:
            int r7 = r0.length     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
        L_0x0061:
            int r6 = r1.read(r0, r6, r7)     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            r7 = -1
            if (r6 != r7) goto L_0x0074
            long r6 = r2.contentLength     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x007c
            long r6 = r3.absoluteStreamPosition     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r6 = r6 + r4
            r2.contentLength = r6     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            goto L_0x007c
        L_0x0074:
            long r6 = (long) r6     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r4 = r4 + r6
            long r10 = r2.newlyCachedBytes     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            long r10 = r10 + r6
            r2.newlyCachedBytes = r10     // Catch:{ PriorityTooLowException -> 0x0089, all -> 0x0080 }
            goto L_0x004a
        L_0x007c:
            com.google.android.exoplayer2.util.Util.closeQuietly((com.google.android.exoplayer2.upstream.DataSource) r22)
            return r4
        L_0x0080:
            r0 = move-exception
            com.google.android.exoplayer2.util.Util.closeQuietly((com.google.android.exoplayer2.upstream.DataSource) r22)
            throw r0
        L_0x0085:
            r17 = r3
        L_0x0087:
            r3 = r17
        L_0x0089:
            com.google.android.exoplayer2.util.Util.closeQuietly((com.google.android.exoplayer2.upstream.DataSource) r22)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheUtil.readAndDiscard(com.google.android.exoplayer2.upstream.DataSpec, long, long, com.google.android.exoplayer2.upstream.DataSource, byte[], com.google.android.exoplayer2.util.PriorityTaskManager, int, com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters, java.util.concurrent.atomic.AtomicBoolean):long");
    }

    public static void remove(Cache cache, String str) {
        for (CacheSpan removeSpan : cache.getCachedSpans(str)) {
            try {
                cache.removeSpan(removeSpan);
            } catch (Cache.CacheException unused) {
            }
        }
    }

    private static void throwExceptionIfInterruptedOrCancelled(AtomicBoolean atomicBoolean) throws InterruptedException {
        if (Thread.interrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new InterruptedException();
        }
    }

    private CacheUtil() {
    }
}
