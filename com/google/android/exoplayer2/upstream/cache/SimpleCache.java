package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public final class SimpleCache implements Cache {
    private static final String TAG = "SimpleCache";
    private static boolean cacheFolderLockingDisabled;
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    /* access modifiers changed from: private */
    public final CacheEvictor evictor;
    private final CachedContentIndex index;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private boolean released;
    private long totalSpace;

    public static synchronized boolean isCacheFolderLocked(File file) {
        boolean contains;
        synchronized (SimpleCache.class) {
            contains = lockedCacheDirs.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    @Deprecated
    public static synchronized void disableCacheFolderLocking() {
        synchronized (SimpleCache.class) {
            cacheFolderLockingDisabled = true;
            lockedCacheDirs.clear();
        }
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, (byte[]) null, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr, boolean z) {
        this(file, cacheEvictor, new CachedContentIndex(file, bArr, z));
    }

    SimpleCache(File file, CacheEvictor cacheEvictor, CachedContentIndex cachedContentIndex) {
        if (lockFolder(file)) {
            this.cacheDir = file;
            this.evictor = cacheEvictor;
            this.index = cachedContentIndex;
            this.listeners = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") {
                public void run() {
                    synchronized (SimpleCache.this) {
                        conditionVariable.open();
                        SimpleCache.this.initialize();
                        SimpleCache.this.evictor.onCacheInitialized();
                    }
                }
            }.start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(file)));
    }

    public final synchronized void release() throws Cache.CacheException {
        if (!this.released) {
            this.listeners.clear();
            try {
                removeStaleSpansAndCachedContents();
            } finally {
                unlockFolder(this.cacheDir);
                this.released = true;
            }
        }
    }

    public final synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        Assertions.checkState(!this.released);
        ArrayList arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void removeListener(java.lang.String r2, com.google.android.exoplayer2.upstream.cache.Cache.Listener r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.released     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r0 = r1.listeners     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0021 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            r0.remove(r3)     // Catch:{ all -> 0x0021 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.Cache$Listener>> r3 = r1.listeners     // Catch:{ all -> 0x0021 }
            r3.remove(r2)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.SimpleCache.removeListener(java.lang.String, com.google.android.exoplayer2.upstream.cache.Cache$Listener):void");
    }

    @NonNull
    public final synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        Assertions.checkState(!this.released);
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent != null) {
            if (!cachedContent.isEmpty()) {
                return new TreeSet(cachedContent.getSpans());
            }
        }
        return new TreeSet();
    }

    public final synchronized Set<String> getKeys() {
        Assertions.checkState(!this.released);
        return new HashSet(this.index.getKeys());
    }

    public final synchronized long getCacheSpace() {
        Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    public final synchronized SimpleCacheSpan startReadWrite(String str, long j) throws InterruptedException, Cache.CacheException {
        SimpleCacheSpan startReadWriteNonBlocking;
        while (true) {
            startReadWriteNonBlocking = startReadWriteNonBlocking(str, j);
            if (startReadWriteNonBlocking == null) {
                wait();
            }
        }
        return startReadWriteNonBlocking;
    }

    @Nullable
    public final synchronized SimpleCacheSpan startReadWriteNonBlocking(String str, long j) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        SimpleCacheSpan span = getSpan(str, j);
        if (span.isCached) {
            try {
                SimpleCacheSpan simpleCacheSpan = this.index.get(str).touch(span);
                notifySpanTouched(span, simpleCacheSpan);
                return simpleCacheSpan;
            } catch (Cache.CacheException unused) {
                return span;
            }
        } else {
            CachedContent orAdd = this.index.getOrAdd(str);
            if (orAdd.isLocked()) {
                return null;
            }
            orAdd.setLocked(true);
            return span;
        }
    }

    public final synchronized File startFile(String str, long j, long j2) throws Cache.CacheException {
        CachedContent cachedContent;
        Assertions.checkState(!this.released);
        cachedContent = this.index.get(str);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        if (!this.cacheDir.exists()) {
            this.cacheDir.mkdirs();
            removeStaleSpansAndCachedContents();
        }
        this.evictor.onStartFile(this, str, j, j2);
        return SimpleCacheSpan.getCacheFile(this.cacheDir, cachedContent.f10796id, j, System.currentTimeMillis());
    }

    public final synchronized void commitFile(File file) throws Cache.CacheException {
        boolean z = true;
        Assertions.checkState(!this.released);
        SimpleCacheSpan createCacheEntry = SimpleCacheSpan.createCacheEntry(file, this.index);
        Assertions.checkState(createCacheEntry != null);
        CachedContent cachedContent = this.index.get(createCacheEntry.key);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long contentLength = ContentMetadataInternal.getContentLength(cachedContent.getMetadata());
            if (contentLength != -1) {
                if (createCacheEntry.position + createCacheEntry.length > contentLength) {
                    z = false;
                }
                Assertions.checkState(z);
            }
            addSpan(createCacheEntry);
            this.index.store();
            notifyAll();
        }
    }

    public final synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        CachedContent cachedContent = this.index.get(cacheSpan.key);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        cachedContent.setLocked(false);
        this.index.maybeRemove(cachedContent.key);
        notifyAll();
    }

    public final synchronized void removeSpan(CacheSpan cacheSpan) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        removeSpan(cacheSpan, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean isCached(java.lang.String r4, long r5, long r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch:{ all -> 0x0021 }
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex r0 = r3.index     // Catch:{ all -> 0x0021 }
            com.google.android.exoplayer2.upstream.cache.CachedContent r4 = r0.get(r4)     // Catch:{ all -> 0x0021 }
            if (r4 == 0) goto L_0x001f
            long r4 = r4.getCachedBytesLength(r5, r7)     // Catch:{ all -> 0x0021 }
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x001f
            monitor-exit(r3)
            return r1
        L_0x001f:
            monitor-exit(r3)
            return r2
        L_0x0021:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.SimpleCache.isCached(java.lang.String, long, long):boolean");
    }

    public final synchronized long getCachedLength(String str, long j, long j2) {
        Assertions.checkState(!this.released);
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent != null) {
            return cachedContent.getCachedBytesLength(j, j2);
        }
        return -j2;
    }

    public final synchronized void setContentLength(String str, long j) throws Cache.CacheException {
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        ContentMetadataInternal.setContentLength(contentMetadataMutations, j);
        applyContentMetadataMutations(str, contentMetadataMutations);
    }

    public final synchronized long getContentLength(String str) {
        return ContentMetadataInternal.getContentLength(getContentMetadata(str));
    }

    public final synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        this.index.applyContentMetadataMutations(str, contentMetadataMutations);
        this.index.store();
    }

    public final synchronized ContentMetadata getContentMetadata(String str) {
        Assertions.checkState(!this.released);
        return this.index.getContentMetadata(str);
    }

    private SimpleCacheSpan getSpan(String str, long j) throws Cache.CacheException {
        SimpleCacheSpan span;
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent == null) {
            return SimpleCacheSpan.createOpenHole(str, j);
        }
        while (true) {
            span = cachedContent.getSpan(j);
            if (!span.isCached || span.file.exists()) {
                return span;
            }
            removeStaleSpansAndCachedContents();
        }
        return span;
    }

    /* access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            this.cacheDir.mkdirs();
            return;
        }
        this.index.load();
        File[] listFiles = this.cacheDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                    SimpleCacheSpan createCacheEntry = file.length() > 0 ? SimpleCacheSpan.createCacheEntry(file, this.index) : null;
                    if (createCacheEntry != null) {
                        addSpan(createCacheEntry);
                    } else {
                        file.delete();
                    }
                }
            }
            this.index.removeEmpty();
            try {
                this.index.store();
            } catch (Cache.CacheException e) {
                Log.e(TAG, "Storing index file failed", e);
            }
        }
    }

    private void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.index.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private void removeSpan(CacheSpan cacheSpan, boolean z) throws Cache.CacheException {
        CachedContent cachedContent = this.index.get(cacheSpan.key);
        if (cachedContent != null && cachedContent.removeSpan(cacheSpan)) {
            this.totalSpace -= cacheSpan.length;
            if (z) {
                try {
                    this.index.maybeRemove(cachedContent.key);
                    this.index.store();
                } catch (Throwable th) {
                    notifySpanRemoved(cacheSpan);
                    throw th;
                }
            }
            notifySpanRemoved(cacheSpan);
        }
    }

    private void removeStaleSpansAndCachedContents() throws Cache.CacheException {
        ArrayList arrayList = new ArrayList();
        for (CachedContent spans : this.index.getAll()) {
            Iterator<SimpleCacheSpan> it = spans.getSpans().iterator();
            while (it.hasNext()) {
                CacheSpan next = it.next();
                if (!next.file.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpan((CacheSpan) arrayList.get(i), false);
        }
        this.index.removeEmpty();
        this.index.store();
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanAdded(SimpleCacheSpan simpleCacheSpan) {
        ArrayList arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanTouched(SimpleCacheSpan simpleCacheSpan, CacheSpan cacheSpan) {
        ArrayList arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static synchronized boolean lockFolder(File file) {
        synchronized (SimpleCache.class) {
            if (cacheFolderLockingDisabled) {
                return true;
            }
            boolean add = lockedCacheDirs.add(file.getAbsoluteFile());
            return add;
        }
    }

    private static synchronized void unlockFolder(File file) {
        synchronized (SimpleCache.class) {
            if (!cacheFolderLockingDisabled) {
                lockedCacheDirs.remove(file.getAbsoluteFile());
            }
        }
    }
}
