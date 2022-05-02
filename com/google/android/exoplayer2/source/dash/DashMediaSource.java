package com.google.android.exoplayer2.source.dash;

import android.mtp.MtpConstants;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o.performLowMemory;
import o.performPrepareOptionsMenu;

public final class DashMediaSource extends BaseMediaSource {
    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_FIXED_MS = 30000;
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_PREFER_MANIFEST_MS = -1;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final int NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final String TAG = "DashMediaSource";
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private boolean dynamicMediaPresentationEnded;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private final long livePresentationDelayMs;
    private final boolean livePresentationDelayOverridesManifest;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    /* access modifiers changed from: private */
    public Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    /* access modifiers changed from: private */
    public IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    @Nullable
    private TransferListener mediaTransferListener;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;
    @Nullable
    private final Object tag;

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
    }

    public static final class Factory implements AdsMediaSource.MediaSourceFactory {
        private final DashChunkSource.Factory chunkSourceFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private boolean isCreateCalled;
        private long livePresentationDelayMs;
        private boolean livePresentationDelayOverridesManifest;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;
        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
        @Nullable
        private Object tag;

        public final int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory(DataSource.Factory factory) {
            this(new DefaultDashChunkSource.Factory(factory), factory);
        }

        public Factory(DashChunkSource.Factory factory, @Nullable DataSource.Factory factory2) {
            this.chunkSourceFactory = (DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.livePresentationDelayMs = 30000;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        }

        public final Factory setTag(Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        @Deprecated
        public final Factory setMinLoadableRetryCount(int i) {
            return setLoadErrorHandlingPolicy(new DefaultLoadErrorHandlingPolicy(i));
        }

        public final Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy2) {
            Assertions.checkState(!this.isCreateCalled);
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy2;
            return this;
        }

        @Deprecated
        public final Factory setLivePresentationDelayMs(long j) {
            if (j == -1) {
                return setLivePresentationDelayMs(30000, false);
            }
            return setLivePresentationDelayMs(j, true);
        }

        public final Factory setLivePresentationDelayMs(long j, boolean z) {
            Assertions.checkState(!this.isCreateCalled);
            this.livePresentationDelayMs = j;
            this.livePresentationDelayOverridesManifest = z;
            return this;
        }

        public final Factory setManifestParser(ParsingLoadable.Parser<? extends DashManifest> parser) {
            Assertions.checkState(!this.isCreateCalled);
            this.manifestParser = (ParsingLoadable.Parser) Assertions.checkNotNull(parser);
            return this;
        }

        public final Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2) {
            Assertions.checkState(!this.isCreateCalled);
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory2);
            return this;
        }

        public final DashMediaSource createMediaSource(DashManifest dashManifest) {
            Assertions.checkArgument(!dashManifest.dynamic);
            this.isCreateCalled = true;
            return new DashMediaSource(dashManifest, (Uri) null, (DataSource.Factory) null, (ParsingLoadable.Parser) null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.loadErrorHandlingPolicy, this.livePresentationDelayMs, this.livePresentationDelayOverridesManifest, this.tag);
        }

        @Deprecated
        public final DashMediaSource createMediaSource(DashManifest dashManifest, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
            DashMediaSource createMediaSource = createMediaSource(dashManifest);
            if (!(handler == null || mediaSourceEventListener == null)) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }

        public final DashMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            if (this.manifestParser == null) {
                this.manifestParser = new DashManifestParser();
            }
            return new DashMediaSource((DashManifest) null, (Uri) Assertions.checkNotNull(uri), this.manifestDataSourceFactory, this.manifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.loadErrorHandlingPolicy, this.livePresentationDelayMs, this.livePresentationDelayOverridesManifest, this.tag);
        }

        @Deprecated
        public final DashMediaSource createMediaSource(Uri uri, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
            DashMediaSource createMediaSource = createMediaSource(uri);
            if (!(handler == null || mediaSourceEventListener == null)) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }
    }

    @Deprecated
    public DashMediaSource(DashManifest dashManifest, DashChunkSource.Factory factory, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(dashManifest, factory, 3, handler2, mediaSourceEventListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DashMediaSource(DashManifest dashManifest, DashChunkSource.Factory factory, int i, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(dashManifest, (Uri) null, (DataSource.Factory) null, (ParsingLoadable.Parser<? extends DashManifest>) null, factory, new DefaultCompositeSequenceableLoaderFactory(), new DefaultLoadErrorHandlingPolicy(i), 30000, false, (Object) null);
        Handler handler3 = handler2;
        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
        if (handler3 == null || mediaSourceEventListener2 == null) {
            return;
        }
        addEventListener(handler3, mediaSourceEventListener2);
    }

    @Deprecated
    public DashMediaSource(Uri uri, DataSource.Factory factory, DashChunkSource.Factory factory2, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, factory2, 3, -1, handler2, mediaSourceEventListener);
    }

    @Deprecated
    public DashMediaSource(Uri uri, DataSource.Factory factory, DashChunkSource.Factory factory2, int i, long j, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, new DashManifestParser(), factory2, i, j, handler2, mediaSourceEventListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DashMediaSource(Uri uri, DataSource.Factory factory, ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, int i, long j, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this((DashManifest) null, uri, factory, parser, factory2, new DefaultCompositeSequenceableLoaderFactory(), new DefaultLoadErrorHandlingPolicy(i), j == -1 ? 30000 : j, j != -1, (Object) null);
        Handler handler3 = handler2;
        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
        if (handler3 == null || mediaSourceEventListener2 == null) {
            return;
        }
        addEventListener(handler3, mediaSourceEventListener2);
    }

    private DashMediaSource(DashManifest dashManifest, Uri uri, DataSource.Factory factory, ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2, LoadErrorHandlingPolicy loadErrorHandlingPolicy2, long j, boolean z, @Nullable Object obj) {
        this.initialManifestUri = uri;
        this.manifest = dashManifest;
        this.manifestUri = uri;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy2;
        this.livePresentationDelayMs = j;
        this.livePresentationDelayOverridesManifest = z;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory2;
        this.tag = obj;
        this.sideloadedManifest = dashManifest != null;
        this.manifestEventDispatcher = createEventDispatcher((MediaSource.MediaPeriodId) null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = C.TIME_UNSET;
        if (this.sideloadedManifest) {
            Assertions.checkState(!dashManifest.dynamic);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new LoaderErrorThrower.Dummy();
            return;
        }
        this.manifestCallback = new ManifestCallback();
        this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
        this.refreshManifestRunnable = new performPrepareOptionsMenu(this);
        this.simulateManifestRefreshRunnable = new performLowMemory(this);
    }

    public final /* synthetic */ void lambda$new$0() {
        processManifest(false);
    }

    public final void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z, @Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("Loader:DashMediaSource");
        this.handler = new Handler();
        startLoadingManifest();
    }

    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        int intValue = ((Integer) mediaPeriodId2.periodUid).intValue() - this.firstPeriodId;
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId2, this.manifest.getPeriod(intValue).startMs);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.firstPeriodId + intValue, this.manifest, intValue, this.chunkSourceFactory, this.mediaTransferListener, this.loadErrorHandlingPolicy, createEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback);
        this.periodsById.put(dashMediaPeriod.f10792id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    public final void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f10792id);
    }

    public final void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader2 = this.loader;
        if (loader2 != null) {
            loader2.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0;
        this.manifestLoadEndTimestampMs = 0;
        this.manifest = this.sideloadedManifest ? this.manifest : null;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = 0;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = C.TIME_UNSET;
        this.dynamicMediaPresentationEnded = false;
        this.firstPeriodId = 0;
        this.periodsById.clear();
    }

    /* access modifiers changed from: package-private */
    public final void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    /* access modifiers changed from: package-private */
    public final void onDashLiveMediaPresentationEndSignalEncountered() {
        this.dynamicMediaPresentationEnded = true;
    }

    /* access modifiers changed from: package-private */
    public final void onDashManifestPublishTimeExpired(long j) {
        long j2 = this.expiredManifestPublishTimeUs;
        if (j2 == C.TIME_UNSET || j2 < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onManifestLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r16, long r17, long r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r13 = r17
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r1.manifestEventDispatcher
            com.google.android.exoplayer2.upstream.DataSpec r3 = r0.dataSpec
            android.net.Uri r4 = r16.getUri()
            java.util.Map r5 = r16.getResponseHeaders()
            int r6 = r0.type
            long r11 = r16.bytesLoaded()
            r7 = r17
            r9 = r19
            r2.loadCompleted(r3, r4, r5, r6, r7, r9, r11)
            java.lang.Object r2 = r16.getResult()
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = (com.google.android.exoplayer2.source.dash.manifest.DashManifest) r2
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r1.manifest
            r4 = 0
            if (r3 != 0) goto L_0x002b
            r3 = 0
            goto L_0x002f
        L_0x002b:
            int r3 = r3.getPeriodCount()
        L_0x002f:
            com.google.android.exoplayer2.source.dash.manifest.Period r5 = r2.getPeriod(r4)
            long r5 = r5.startMs
            r7 = 0
        L_0x0036:
            if (r7 >= r3) goto L_0x0047
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r8 = r1.manifest
            com.google.android.exoplayer2.source.dash.manifest.Period r8 = r8.getPeriod(r7)
            long r8 = r8.startMs
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0047
            int r7 = r7 + 1
            goto L_0x0036
        L_0x0047:
            boolean r5 = r2.dynamic
            r6 = 1
            if (r5 == 0) goto L_0x00c9
            int r5 = r3 - r7
            int r8 = r2.getPeriodCount()
            if (r5 <= r8) goto L_0x005d
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            com.google.android.exoplayer2.util.Log.w(r5, r8)
        L_0x005b:
            r5 = 1
            goto L_0x00a5
        L_0x005d:
            boolean r5 = r1.dynamicMediaPresentationEnded
            if (r5 != 0) goto L_0x007b
            long r8 = r1.expiredManifestPublishTimeUs
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0079
            long r8 = r2.publishTimeMs
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            long r10 = r1.expiredManifestPublishTimeUs
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r5 = 0
            goto L_0x00a5
        L_0x007b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Loaded stale dynamic manifest: "
            r5.<init>(r8)
            long r8 = r2.publishTimeMs
            r5.append(r8)
            java.lang.String r8 = ", "
            r5.append(r8)
            boolean r8 = r1.dynamicMediaPresentationEnded
            r5.append(r8)
            java.lang.String r8 = ", "
            r5.append(r8)
            long r8 = r1.expiredManifestPublishTimeUs
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "DashMediaSource"
            com.google.android.exoplayer2.util.Log.w(r8, r5)
            goto L_0x005b
        L_0x00a5:
            if (r5 == 0) goto L_0x00c7
            int r2 = r1.staleManifestReloadAttempt
            int r3 = r2 + 1
            r1.staleManifestReloadAttempt = r3
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r1.loadErrorHandlingPolicy
            int r0 = r0.type
            int r0 = r3.getMinimumLoadableRetryCount(r0)
            if (r2 >= r0) goto L_0x00bf
            long r2 = r15.getManifestLoadRetryDelayMillis()
            r15.scheduleManifestRefresh(r2)
            return
        L_0x00bf:
            com.google.android.exoplayer2.source.dash.DashManifestStaleException r0 = new com.google.android.exoplayer2.source.dash.DashManifestStaleException
            r0.<init>()
            r1.manifestFatalError = r0
            return
        L_0x00c7:
            r1.staleManifestReloadAttempt = r4
        L_0x00c9:
            r1.manifest = r2
            boolean r5 = r1.manifestLoadPending
            boolean r2 = r2.dynamic
            r2 = r2 & r5
            r1.manifestLoadPending = r2
            long r8 = r13 - r19
            r1.manifestLoadStartTimestampMs = r8
            r1.manifestLoadEndTimestampMs = r13
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r1.manifest
            android.net.Uri r2 = r2.location
            if (r2 == 0) goto L_0x00f7
            java.lang.Object r2 = r1.manifestUriLock
            monitor-enter(r2)
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.dataSpec     // Catch:{ all -> 0x00f4 }
            android.net.Uri r0 = r0.uri     // Catch:{ all -> 0x00f4 }
            android.net.Uri r5 = r1.manifestUri     // Catch:{ all -> 0x00f4 }
            if (r0 != r5) goto L_0x00ea
            r4 = 1
        L_0x00ea:
            if (r4 == 0) goto L_0x00f2
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r1.manifest     // Catch:{ all -> 0x00f4 }
            android.net.Uri r0 = r0.location     // Catch:{ all -> 0x00f4 }
            r1.manifestUri = r0     // Catch:{ all -> 0x00f4 }
        L_0x00f2:
            monitor-exit(r2)     // Catch:{ all -> 0x00f4 }
            goto L_0x00f7
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00f7:
            if (r3 != 0) goto L_0x010b
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r1.manifest
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r0 = r0.utcTiming
            if (r0 == 0) goto L_0x0107
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r1.manifest
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r0 = r0.utcTiming
            r15.resolveUtcTimingElement(r0)
            return
        L_0x0107:
            r15.processManifest(r6)
            return
        L_0x010b:
            int r0 = r1.firstPeriodId
            int r0 = r0 + r7
            r1.firstPeriodId = r0
            r15.processManifest(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.onManifestLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable, long, long):void");
    }

    /* access modifiers changed from: package-private */
    public final Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException) {
        ParsingLoadable<DashManifest> parsingLoadable2 = parsingLoadable;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof ParserException;
        this.manifestEventDispatcher.loadError(parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable2.type, j, j2, parsingLoadable.bytesLoaded(), iOException2, z);
        return z ? Loader.DONT_RETRY_FATAL : Loader.RETRY;
    }

    /* access modifiers changed from: package-private */
    public final void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
        ParsingLoadable<Long> parsingLoadable2 = parsingLoadable;
        this.manifestEventDispatcher.loadCompleted(parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable2.type, j, j2, parsingLoadable.bytesLoaded());
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j);
    }

    /* access modifiers changed from: package-private */
    public final Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException) {
        ParsingLoadable<Long> parsingLoadable2 = parsingLoadable;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.manifestEventDispatcher;
        DataSpec dataSpec = parsingLoadable2.dataSpec;
        Uri uri = parsingLoadable.getUri();
        Map<String, List<String>> responseHeaders = parsingLoadable.getResponseHeaders();
        int i = parsingLoadable2.type;
        eventDispatcher.loadError(dataSpec, uri, responseHeaders, i, j, j2, parsingLoadable.bytesLoaded(), iOException, true);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    /* access modifiers changed from: package-private */
    public final void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j, long j2) {
        ParsingLoadable<?> parsingLoadable2 = parsingLoadable;
        this.manifestEventDispatcher.loadCanceled(parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable2.type, j, j2, parsingLoadable.bytesLoaded());
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new Iso8601Parser());
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new XsDateTimeParser());
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e) {
            onUtcTimestampResolutionError(e);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    private void onUtcTimestampResolutionError(IOException iOException) {
        Log.e(TAG, "Failed to resolve UtcTiming element.", iOException);
        processManifest(true);
    }

    private void processManifest(boolean z) {
        long j;
        boolean z2;
        long j2;
        long j3;
        for (int i = 0; i < this.periodsById.size(); i++) {
            int keyAt = this.periodsById.keyAt(i);
            if (keyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i).updateManifest(this.manifest, keyAt - this.firstPeriodId);
            }
        }
        int periodCount = this.manifest.getPeriodCount() - 1;
        PeriodSeekInfo createPeriodSeekInfo = PeriodSeekInfo.createPeriodSeekInfo(this.manifest.getPeriod(0), this.manifest.getPeriodDurationUs(0));
        PeriodSeekInfo createPeriodSeekInfo2 = PeriodSeekInfo.createPeriodSeekInfo(this.manifest.getPeriod(periodCount), this.manifest.getPeriodDurationUs(periodCount));
        long j4 = createPeriodSeekInfo.availableStartTimeUs;
        long j5 = createPeriodSeekInfo2.availableEndTimeUs;
        if (!this.manifest.dynamic || createPeriodSeekInfo2.isIndexExplicit) {
            j = j4;
            z2 = false;
        } else {
            j5 = Math.min((getNowUnixTimeUs() - C.msToUs(this.manifest.availabilityStartTimeMs)) - C.msToUs(this.manifest.getPeriod(periodCount).startMs), j5);
            if (this.manifest.timeShiftBufferDepthMs != C.TIME_UNSET) {
                long msToUs = j5 - C.msToUs(this.manifest.timeShiftBufferDepthMs);
                while (msToUs < 0 && periodCount > 0) {
                    periodCount--;
                    msToUs += this.manifest.getPeriodDurationUs(periodCount);
                }
                if (periodCount == 0) {
                    j3 = Math.max(j4, msToUs);
                } else {
                    j3 = this.manifest.getPeriodDurationUs(0);
                }
                j4 = j3;
            }
            j = j4;
            z2 = true;
        }
        long j6 = j5 - j;
        for (int i2 = 0; i2 < this.manifest.getPeriodCount() - 1; i2++) {
            j6 += this.manifest.getPeriodDurationUs(i2);
        }
        if (this.manifest.dynamic) {
            long j7 = this.livePresentationDelayMs;
            if (!this.livePresentationDelayOverridesManifest && this.manifest.suggestedPresentationDelayMs != C.TIME_UNSET) {
                j7 = this.manifest.suggestedPresentationDelayMs;
            }
            long msToUs2 = j6 - C.msToUs(j7);
            if (msToUs2 < MIN_LIVE_DEFAULT_START_POSITION_US) {
                msToUs2 = Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, j6 / 2);
            }
            j2 = msToUs2;
        } else {
            j2 = 0;
        }
        refreshSourceInfo(new DashTimeline(this.manifest.availabilityStartTimeMs, this.manifest.availabilityStartTimeMs + this.manifest.getPeriod(0).startMs + C.usToMs(j), this.firstPeriodId, j, j6, j2, this.manifest, this.tag), this.manifest);
        if (!this.sideloadedManifest) {
            this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
            long j8 = 5000;
            if (z2) {
                this.handler.postDelayed(this.simulateManifestRefreshRunnable, 5000);
            }
            if (this.manifestLoadPending) {
                startLoadingManifest();
            } else if (z && this.manifest.dynamic && this.manifest.minUpdatePeriodMs != C.TIME_UNSET) {
                long j9 = this.manifest.minUpdatePeriodMs;
                if (j9 != 0) {
                    j8 = j9;
                }
                scheduleManifestRefresh(Math.max(0, (this.manifestLoadStartTimestampMs + j8) - SystemClock.elapsedRealtime()));
            }
        }
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    public final void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    private long getManifestLoadRetryDelayMillis() {
        return (long) Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i) {
        this.manifestEventDispatcher.loadStarted(parsingLoadable.dataSpec, parsingLoadable.type, this.loader.startLoading(parsingLoadable, callback, i));
    }

    private long getNowUnixTimeUs() {
        if (this.elapsedRealtimeOffsetMs != 0) {
            return C.msToUs(SystemClock.elapsedRealtime() + this.elapsedRealtimeOffsetMs);
        }
        return C.msToUs(System.currentTimeMillis());
    }

    static final class PeriodSeekInfo {
        public final long availableEndTimeUs;
        public final long availableStartTimeUs;
        public final boolean isIndexExplicit;

        public static PeriodSeekInfo createPeriodSeekInfo(Period period, long j) {
            boolean z;
            boolean z2;
            long j2;
            Period period2 = period;
            long j3 = j;
            int size = period2.adaptationSets.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                int i3 = period2.adaptationSets.get(i2).type;
                if (i3 == 1 || i3 == 2) {
                    z = true;
                } else {
                    i2++;
                }
            }
            long j4 = Long.MAX_VALUE;
            int i4 = 0;
            boolean z3 = false;
            long j5 = 0;
            boolean z4 = false;
            while (i4 < size) {
                AdaptationSet adaptationSet = period2.adaptationSets.get(i4);
                if (!z || adaptationSet.type != 3) {
                    DashSegmentIndex index = adaptationSet.representations.get(i).getIndex();
                    if (index == null) {
                        return new PeriodSeekInfo(true, 0, j);
                    }
                    z3 |= index.isExplicit();
                    int segmentCount = index.getSegmentCount(j3);
                    if (segmentCount == 0) {
                        z2 = z;
                        j2 = 0;
                        j5 = 0;
                        z4 = true;
                    } else if (!z4) {
                        z2 = z;
                        long firstSegmentNum = index.getFirstSegmentNum();
                        long j6 = j4;
                        j5 = Math.max(j5, index.getTimeUs(firstSegmentNum));
                        if (segmentCount != -1) {
                            long j7 = (firstSegmentNum + ((long) segmentCount)) - 1;
                            j2 = Math.min(j6, index.getTimeUs(j7) + index.getDurationUs(j7, j3));
                        } else {
                            j2 = j6;
                        }
                    }
                    i4++;
                    j4 = j2;
                    z = z2;
                    i = 0;
                }
                z2 = z;
                j2 = j4;
                i4++;
                j4 = j2;
                z = z2;
                i = 0;
            }
            return new PeriodSeekInfo(z3, j5, j4);
        }

        private PeriodSeekInfo(boolean z, long j, long j2) {
            this.isIndexExplicit = z;
            this.availableStartTimeUs = j;
            this.availableEndTimeUs = j2;
        }
    }

    static final class DashTimeline extends Timeline {
        private final int firstPeriodId;
        private final DashManifest manifest;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;
        @Nullable
        private final Object windowTag;

        public final int getWindowCount() {
            return 1;
        }

        public DashTimeline(long j, long j2, int i, long j3, long j4, long j5, DashManifest dashManifest, @Nullable Object obj) {
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.firstPeriodId = i;
            this.offsetInFirstPeriodUs = j3;
            this.windowDurationUs = j4;
            this.windowDefaultStartPositionUs = j5;
            this.manifest = dashManifest;
            this.windowTag = obj;
        }

        public final int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            Integer num = null;
            String str = z ? this.manifest.getPeriod(i).f10795id : null;
            if (z) {
                num = Integer.valueOf(this.firstPeriodId + i);
            }
            return period.set(str, num, 0, this.manifest.getPeriodDurationUs(i), C.msToUs(this.manifest.getPeriod(i).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        public final Timeline.Window getWindow(int i, Timeline.Window window, boolean z, long j) {
            Assertions.checkIndex(i, 0, 1);
            return window.set(z ? this.windowTag : null, this.presentationStartTimeMs, this.windowStartTimeMs, true, this.manifest.dynamic, getAdjustedWindowDefaultStartPositionUs(j), this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        public final int getIndexOfPeriod(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && intValue < getPeriodCount()) {
                return intValue;
            }
            return -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
            r2 = r2.adaptationSets.get(r6).representations.get(0).getIndex();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long getAdjustedWindowDefaultStartPositionUs(long r9) {
            /*
                r8 = this;
                long r0 = r8.windowDefaultStartPositionUs
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r8.manifest
                boolean r2 = r2.dynamic
                if (r2 != 0) goto L_0x0009
                return r0
            L_0x0009:
                r2 = 0
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x001c
                long r0 = r0 + r9
                long r9 = r8.windowDurationUs
                int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r2 <= 0) goto L_0x001c
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r9
            L_0x001c:
                long r9 = r8.offsetInFirstPeriodUs
                long r9 = r9 + r0
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r8.manifest
                r3 = 0
                long r4 = r2.getPeriodDurationUs(r3)
                r2 = 0
            L_0x0027:
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r8.manifest
                int r6 = r6.getPeriodCount()
                int r6 = r6 + -1
                if (r2 >= r6) goto L_0x003f
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x003f
                long r9 = r9 - r4
                int r2 = r2 + 1
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r4 = r8.manifest
                long r4 = r4.getPeriodDurationUs(r2)
                goto L_0x0027
            L_0x003f:
                com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r8.manifest
                com.google.android.exoplayer2.source.dash.manifest.Period r2 = r6.getPeriod(r2)
                r6 = 2
                int r6 = r2.getAdaptationSetIndex(r6)
                r7 = -1
                if (r6 != r7) goto L_0x004e
                return r0
            L_0x004e:
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r2.adaptationSets
                java.lang.Object r2 = r2.get(r6)
                com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r2 = r2.representations
                java.lang.Object r2 = r2.get(r3)
                com.google.android.exoplayer2.source.dash.manifest.Representation r2 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r2
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r2 = r2.getIndex()
                if (r2 == 0) goto L_0x0075
                int r3 = r2.getSegmentCount(r4)
                if (r3 != 0) goto L_0x006b
                goto L_0x0075
            L_0x006b:
                long r3 = r2.getSegmentNum(r9, r4)
                long r2 = r2.getTimeUs(r3)
                long r0 = r0 + r2
                long r0 = r0 - r9
            L_0x0075:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.DashTimeline.getAdjustedWindowDefaultStartPositionUs(long):long");
        }

        public final Object getUidOfPeriod(int i) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i);
        }
    }

    final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        public final void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }

        public final void onDashManifestPublishTimeExpired(long j) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j);
        }

        public final void onDashLiveMediaPresentationEndSignalEncountered() {
            DashMediaSource.this.onDashLiveMediaPresentationEndSignalEncountered();
        }
    }

    final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        public final void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j, j2);
        }

        public final void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        public final Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        public final void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j, j2);
        }

        public final void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        public final Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        public final Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN;
        private static char[] getMax = null;
        private static int length = 1;
        private static int setMin;

        static void getMin() {
            getMax = new char[]{22, '9', 'M', 'T', 'F'};
        }

        Iso8601Parser() {
        }

        static {
            try {
                getMin();
                TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
                int i = length + 61;
                setMin = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        }

        public final Long parse(Uri uri, InputStream inputStream) throws IOException {
            long j;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(getMax(new int[]{0, 5, 0, 4}, new byte[]{1, 1, 0, 1, 1}, !MtpConstants.isAbstractObject(0)).intern()))).readLine();
            Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if ((!"Z".equals(matcher.group(2)) ? 'J' : 4) != 4) {
                    int i = setMin + 1;
                    length = i % 128;
                    int i2 = i % 2;
                    long j2 = 0;
                    if ("+".equals(matcher.group(4))) {
                        int i3 = length + 3;
                        setMin = i3 % 128;
                        j = i3 % 2 != 0 ? 0 : 1;
                    } else {
                        j = -1;
                    }
                    try {
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if ((TextUtils.isEmpty(group2) ? 14 : Typography.amp) != 14) {
                            j2 = Long.parseLong(group2);
                        } else {
                            int i4 = setMin + 31;
                            length = i4 % 128;
                            int i5 = i4 % 2;
                            int i6 = length + 101;
                            setMin = i6 % 128;
                            int i7 = i6 % 2;
                        }
                        time -= j * ((((parseLong * 60) + j2) * 60) * 1000);
                    } catch (ParseException e) {
                        throw new ParserException((Throwable) e);
                    }
                }
                return Long.valueOf(time);
            }
            throw new ParserException("Couldn't parse timestamp: ".concat(String.valueOf(readLine)));
        }

        private static String getMax(int[] iArr, byte[] bArr, boolean z) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(getMax, i, cArr, 0, i2);
            if (!(bArr == null)) {
                char[] cArr2 = new char[i2];
                char c = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    if (bArr[i5] == 1) {
                        int i6 = length + 31;
                        setMin = i6 % 128;
                        if (i6 % 2 != 0) {
                            cArr2[i5] = (char) (((cArr[i5] * 1) % 0) + c);
                        } else {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        }
                    } else {
                        cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                    }
                    c = cArr2[i5];
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i7 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i7, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i7);
            }
            if (z) {
                try {
                    int i8 = length + 91;
                    setMin = i8 % 128;
                    int i9 = i8 % 2;
                    char[] cArr4 = new char[i2];
                    for (int i10 = 0; i10 < i2; i10++) {
                        cArr4[i10] = cArr[(i2 - i10) - 1];
                    }
                    cArr = cArr4;
                } catch (Exception e) {
                    throw e;
                }
            }
            if ((i3 > 0 ? 25 : '?') != '?') {
                int i11 = 0;
                while (true) {
                    if (i11 >= i2) {
                        break;
                    }
                    int i12 = setMin + 65;
                    length = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr[i11] = (char) (cArr[i11] % iArr[3]);
                        i11 += 60;
                    } else {
                        cArr[i11] = (char) (cArr[i11] - iArr[2]);
                        i11++;
                    }
                }
            }
            return new String(cArr);
        }
    }

    final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        ManifestLoadErrorThrower() {
        }

        public final void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        public final void maybeThrowError(int i) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i);
            maybeThrowManifestError();
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }
    }
}
