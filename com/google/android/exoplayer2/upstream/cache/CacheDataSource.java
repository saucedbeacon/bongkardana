package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.TeeDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final long DEFAULT_MAX_CACHE_FILE_SIZE = 2097152;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    @Nullable
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource cacheReadDataSource;
    @Nullable
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    @Nullable
    private DataSource currentDataSource;
    private boolean currentDataSpecLengthUnset;
    @Nullable
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    @Nullable
    private final EventListener eventListener;
    private int flags;
    private int httpMethod;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    @Nullable
    private String key;
    private long readPosition;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;
    @Nullable
    private Uri uri;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource) {
        this(cache2, dataSource, 0, 2097152);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, int i) {
        this(cache2, dataSource, i, 2097152);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, int i, long j) {
        this(cache2, dataSource, new FileDataSource(), new CacheDataSink(cache2, j), i, (EventListener) null);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, @Nullable EventListener eventListener2) {
        this(cache2, dataSource, dataSource2, dataSink, i, eventListener2, (CacheKeyFactory) null);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, @Nullable EventListener eventListener2, @Nullable CacheKeyFactory cacheKeyFactory2) {
        this.cache = cache2;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory2 == null ? CacheUtil.DEFAULT_CACHE_KEY_FACTORY : cacheKeyFactory2;
        boolean z = false;
        this.blockOnCache = (i & 1) != 0;
        this.ignoreCacheOnError = (i & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i & 4) != 0 ? true : z;
        this.upstreamDataSource = dataSource;
        if (dataSink != null) {
            this.cacheWriteDataSource = new TeeDataSource(dataSource, dataSink);
        } else {
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener2;
    }

    public final void addTransferListener(TransferListener transferListener) {
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    public final long open(DataSpec dataSpec) throws IOException {
        try {
            this.key = this.cacheKeyFactory.buildCacheKey(dataSpec);
            Uri uri2 = dataSpec.uri;
            this.uri = uri2;
            this.actualUri = getRedirectedUriOrDefault(this.cache, this.key, uri2);
            this.httpMethod = dataSpec.httpMethod;
            this.flags = dataSpec.flags;
            this.readPosition = dataSpec.position;
            int shouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = shouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(shouldIgnoreCacheForRequest);
            }
            if (dataSpec.length == -1) {
                if (!this.currentRequestIgnoresCache) {
                    long contentLength = this.cache.getContentLength(this.key);
                    this.bytesRemaining = contentLength;
                    if (contentLength != -1) {
                        long j = contentLength - dataSpec.position;
                        this.bytesRemaining = j;
                        if (j <= 0) {
                            throw new DataSourceException(0);
                        }
                    }
                    openNextSource(false);
                    return this.bytesRemaining;
                }
            }
            this.bytesRemaining = dataSpec.length;
            openNextSource(false);
            return this.bytesRemaining;
        } catch (IOException e) {
            handleBeforeThrow(e);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(true);
            }
            int read = this.currentDataSource.read(bArr, i, i2);
            if (read != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += (long) read;
                }
                long j = (long) read;
                this.readPosition += j;
                if (this.bytesRemaining != -1) {
                    this.bytesRemaining -= j;
                }
            } else if (this.currentDataSpecLengthUnset) {
                setNoBytesRemainingAndMaybeStoreLength();
            } else {
                if (this.bytesRemaining <= 0) {
                    if (this.bytesRemaining == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (!this.currentDataSpecLengthUnset || !isCausedByPositionOutOfRange(e)) {
                handleBeforeThrow(e);
                throw e;
            }
            setNoBytesRemainingAndMaybeStoreLength();
            return -1;
        }
    }

    @Nullable
    public final Uri getUri() {
        return this.actualUri;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        if (isReadingFromUpstream()) {
            return this.upstreamDataSource.getResponseHeaders();
        }
        return default$getResponseHeaders();
    }

    public final void close() throws IOException {
        this.uri = null;
        this.actualUri = null;
        this.httpMethod = 1;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (IOException e) {
            handleBeforeThrow(e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openNextSource(boolean r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            boolean r0 = r1.currentRequestIgnoresCache
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r2
            goto L_0x002f
        L_0x0009:
            boolean r0 = r1.blockOnCache
            if (r0 == 0) goto L_0x0025
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache     // Catch:{ InterruptedException -> 0x0018 }
            java.lang.String r3 = r1.key     // Catch:{ InterruptedException -> 0x0018 }
            long r4 = r1.readPosition     // Catch:{ InterruptedException -> 0x0018 }
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = r0.startReadWrite(r3, r4)     // Catch:{ InterruptedException -> 0x0018 }
            goto L_0x002f
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0025:
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache
            java.lang.String r3 = r1.key
            long r4 = r1.readPosition
            com.google.android.exoplayer2.upstream.cache.CacheSpan r0 = r0.startReadWriteNonBlocking(r3, r4)
        L_0x002f:
            r3 = -1
            if (r0 != 0) goto L_0x0051
            com.google.android.exoplayer2.upstream.DataSource r2 = r1.upstreamDataSource
            com.google.android.exoplayer2.upstream.DataSpec r17 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r6 = r1.uri
            int r7 = r1.httpMethod
            r8 = 0
            long r11 = r1.readPosition
            long r13 = r1.bytesRemaining
            java.lang.String r15 = r1.key
            int r9 = r1.flags
            r5 = r17
            r16 = r9
            r9 = r11
            r5.<init>(r6, r7, r8, r9, r11, r13, r15, r16)
        L_0x004c:
            r5 = r0
            r0 = r17
            goto L_0x00c0
        L_0x0051:
            boolean r5 = r0.isCached
            if (r5 == 0) goto L_0x007f
            java.io.File r2 = r0.file
            android.net.Uri r6 = android.net.Uri.fromFile(r2)
            long r7 = r1.readPosition
            long r9 = r0.position
            long r9 = r7 - r9
            long r7 = r0.length
            long r7 = r7 - r9
            long r11 = r1.bytesRemaining
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006e
            long r7 = java.lang.Math.min(r7, r11)
        L_0x006e:
            r11 = r7
            com.google.android.exoplayer2.upstream.DataSpec r17 = new com.google.android.exoplayer2.upstream.DataSpec
            long r7 = r1.readPosition
            java.lang.String r13 = r1.key
            int r14 = r1.flags
            r5 = r17
            r5.<init>(r6, r7, r9, r11, r13, r14)
            com.google.android.exoplayer2.upstream.DataSource r2 = r1.cacheReadDataSource
            goto L_0x004c
        L_0x007f:
            boolean r5 = r0.isOpenEnded()
            if (r5 == 0) goto L_0x0088
            long r5 = r1.bytesRemaining
            goto L_0x0094
        L_0x0088:
            long r5 = r0.length
            long r7 = r1.bytesRemaining
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0094
            long r5 = java.lang.Math.min(r5, r7)
        L_0x0094:
            r15 = r5
            com.google.android.exoplayer2.upstream.DataSpec r5 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r8 = r1.uri
            int r9 = r1.httpMethod
            r10 = 0
            long r13 = r1.readPosition
            java.lang.String r6 = r1.key
            int r11 = r1.flags
            r7 = r5
            r18 = r11
            r11 = r13
            r17 = r6
            r7.<init>(r8, r9, r10, r11, r13, r15, r17, r18)
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.cacheWriteDataSource
            if (r6 == 0) goto L_0x00b6
            r2 = r6
            r19 = r5
            r5 = r0
            r0 = r19
            goto L_0x00c0
        L_0x00b6:
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.upstreamDataSource
            com.google.android.exoplayer2.upstream.cache.Cache r7 = r1.cache
            r7.releaseHoleSpan(r0)
            r0 = r5
            r5 = r2
            r2 = r6
        L_0x00c0:
            boolean r6 = r1.currentRequestIgnoresCache
            if (r6 != 0) goto L_0x00cf
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.upstreamDataSource
            if (r2 != r6) goto L_0x00cf
            long r6 = r1.readPosition
            r8 = 102400(0x19000, double:5.05923E-319)
            long r6 = r6 + r8
            goto L_0x00d4
        L_0x00cf:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d4:
            r1.checkCachePosition = r6
            if (r21 == 0) goto L_0x00f6
            boolean r6 = r20.isBypassingCache()
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            com.google.android.exoplayer2.upstream.DataSource r6 = r1.upstreamDataSource
            if (r2 != r6) goto L_0x00e4
            return
        L_0x00e4:
            r20.closeCurrentSource()     // Catch:{ all -> 0x00e8 }
            goto L_0x00f6
        L_0x00e8:
            r0 = move-exception
            r2 = r0
            boolean r0 = r5.isHoleSpan()
            if (r0 == 0) goto L_0x00f5
            com.google.android.exoplayer2.upstream.cache.Cache r0 = r1.cache
            r0.releaseHoleSpan(r5)
        L_0x00f5:
            throw r2
        L_0x00f6:
            if (r5 == 0) goto L_0x0100
            boolean r6 = r5.isHoleSpan()
            if (r6 == 0) goto L_0x0100
            r1.currentHoleSpan = r5
        L_0x0100:
            r1.currentDataSource = r2
            long r5 = r0.length
            r7 = 1
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x010b
            r5 = 1
            goto L_0x010c
        L_0x010b:
            r5 = 0
        L_0x010c:
            r1.currentDataSpecLengthUnset = r5
            long r5 = r2.open(r0)
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r0 = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations
            r0.<init>()
            boolean r2 = r1.currentDataSpecLengthUnset
            if (r2 == 0) goto L_0x0127
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0127
            r1.bytesRemaining = r5
            long r2 = r1.readPosition
            long r2 = r2 + r5
            com.google.android.exoplayer2.upstream.cache.ContentMetadataInternal.setContentLength(r0, r2)
        L_0x0127:
            boolean r2 = r20.isReadingFromUpstream()
            if (r2 == 0) goto L_0x0147
            com.google.android.exoplayer2.upstream.DataSource r2 = r1.currentDataSource
            android.net.Uri r2 = r2.getUri()
            r1.actualUri = r2
            android.net.Uri r3 = r1.uri
            boolean r2 = r3.equals(r2)
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x0144
            android.net.Uri r2 = r1.actualUri
            com.google.android.exoplayer2.upstream.cache.ContentMetadataInternal.setRedirectedUri(r0, r2)
            goto L_0x0147
        L_0x0144:
            com.google.android.exoplayer2.upstream.cache.ContentMetadataInternal.removeRedirectedUri(r0)
        L_0x0147:
            boolean r2 = r20.isWritingToCache()
            if (r2 == 0) goto L_0x0154
            com.google.android.exoplayer2.upstream.cache.Cache r2 = r1.cache
            java.lang.String r3 = r1.key
            r2.applyContentMetadataMutations(r3, r0)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSource.openNextSource(boolean):void");
    }

    private void setNoBytesRemainingAndMaybeStoreLength() throws IOException {
        this.bytesRemaining = 0;
        if (isWritingToCache()) {
            this.cache.setContentLength(this.key, this.readPosition);
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache2, String str, Uri uri2) {
        Uri redirectedUri = ContentMetadataInternal.getRedirectedUri(cache2.getContentMetadata(str));
        return redirectedUri == null ? uri2 : redirectedUri;
    }

    private static boolean isCausedByPositionOutOfRange(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof DataSourceException) && ((DataSourceException) th).reason == 0) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void closeCurrentSource() throws IOException {
        DataSource dataSource = this.currentDataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.currentDataSource = null;
                this.currentDataSpecLengthUnset = false;
                CacheSpan cacheSpan = this.currentHoleSpan;
                if (cacheSpan != null) {
                    this.cache.releaseHoleSpan(cacheSpan);
                    this.currentHoleSpan = null;
                }
            }
        }
    }

    private void handleBeforeThrow(IOException iOException) {
        if (isReadingFromCache() || (iOException instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (!this.ignoreCacheOnError || !this.seenCacheError) {
            return (!this.ignoreCacheForUnsetLengthRequests || dataSpec.length != -1) ? -1 : 1;
        }
        return 0;
    }

    private void notifyCacheIgnored(int i) {
        EventListener eventListener2 = this.eventListener;
        if (eventListener2 != null) {
            eventListener2.onCacheIgnored(i);
        }
    }

    private void notifyBytesRead() {
        EventListener eventListener2 = this.eventListener;
        if (eventListener2 != null && this.totalCachedBytesRead > 0) {
            eventListener2.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
            this.totalCachedBytesRead = 0;
        }
    }

    public final Map<String, List<String>> default$getResponseHeaders() {
        return Collections.emptyMap();
    }
}
