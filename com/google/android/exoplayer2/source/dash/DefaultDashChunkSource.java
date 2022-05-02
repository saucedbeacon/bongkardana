package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;
    private IOException fatalError;
    private long liveEdgeTimeUs = C.TIME_UNSET;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;
    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private final TrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        public Factory(DataSource.Factory factory, int i) {
            this.dataSourceFactory = factory;
            this.maxSegmentsPerLoad = i;
        }

        public final DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, TrackSelection trackSelection, int i2, long j, boolean z, boolean z2, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener) {
            TransferListener transferListener2 = transferListener;
            DataSource createDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener2 != null) {
                createDataSource.addTransferListener(transferListener2);
            }
            return new DefaultDashChunkSource(loaderErrorThrower, dashManifest, i, iArr, trackSelection, i2, createDataSource, j, this.maxSegmentsPerLoad, z, z2, playerTrackEmsgHandler);
        }
    }

    public DefaultDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, TrackSelection trackSelection2, int i2, DataSource dataSource2, long j, int i3, boolean z, boolean z2, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2) {
        TrackSelection trackSelection3 = trackSelection2;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.adaptationSetIndices = iArr;
        this.trackSelection = trackSelection3;
        this.trackType = i2;
        this.dataSource = dataSource2;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler2;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[trackSelection2.length()];
        for (int i4 = 0; i4 < this.representationHolders.length; i4++) {
            this.representationHolders[i4] = new RepresentationHolder(periodDurationUs, i2, representations.get(trackSelection3.getIndexInTrackGroup(i4)), z, z2, playerTrackEmsgHandler2);
        }
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentNum = representationHolder.getSegmentNum(j);
                long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                return Util.resolveSeekPositionUs(j, seekParameters, segmentStartTimeUs, (segmentStartTimeUs >= j || segmentNum >= ((long) (representationHolder.getSegmentCount() + -1))) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
            }
        }
        return j;
    }

    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            ArrayList<Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representations.get(this.trackSelection.getIndexInTrackGroup(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            this.manifestLoaderErrorThrower.maybeThrowError();
            return;
        }
        throw iOException;
    }

    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    public void getNextChunk(long j, long j2, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        MediaChunk mediaChunk;
        long j3;
        MediaChunkIterator[] mediaChunkIteratorArr;
        int i;
        int i2;
        ChunkHolder chunkHolder2 = chunkHolder;
        if (this.fatalError == null) {
            long j4 = j2 - j;
            long resolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j);
            long msToUs = C.msToUs(this.manifest.availabilityStartTimeMs) + C.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + j2;
            PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = this.playerTrackEmsgHandler;
            if (playerTrackEmsgHandler2 == null || !playerTrackEmsgHandler2.maybeRefreshManifestBeforeLoadingNextChunk(msToUs)) {
                long nowUnixTimeUs = getNowUnixTimeUs();
                if (list.isEmpty()) {
                    List<? extends MediaChunk> list2 = list;
                    mediaChunk = null;
                } else {
                    mediaChunk = (MediaChunk) list.get(list.size() - 1);
                }
                int length = this.trackSelection.length();
                MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
                int i3 = 0;
                while (i3 < length) {
                    RepresentationHolder representationHolder = this.representationHolders[i3];
                    if (representationHolder.segmentIndex == null) {
                        mediaChunkIteratorArr2[i3] = MediaChunkIterator.EMPTY;
                        i2 = i3;
                        i = length;
                        mediaChunkIteratorArr = mediaChunkIteratorArr2;
                        j3 = nowUnixTimeUs;
                    } else {
                        long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(this.manifest, this.periodIndex, nowUnixTimeUs);
                        long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(this.manifest, this.periodIndex, nowUnixTimeUs);
                        RepresentationHolder representationHolder2 = representationHolder;
                        i2 = i3;
                        i = length;
                        mediaChunkIteratorArr = mediaChunkIteratorArr2;
                        j3 = nowUnixTimeUs;
                        long segmentNum = getSegmentNum(representationHolder, mediaChunk, j2, firstAvailableSegmentNum, lastAvailableSegmentNum);
                        if (segmentNum < firstAvailableSegmentNum) {
                            mediaChunkIteratorArr[i2] = MediaChunkIterator.EMPTY;
                        } else {
                            mediaChunkIteratorArr[i2] = new RepresentationSegmentIterator(representationHolder2, segmentNum, lastAvailableSegmentNum);
                        }
                    }
                    i3 = i2 + 1;
                    List<? extends MediaChunk> list3 = list;
                    length = i;
                    mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                    nowUnixTimeUs = j3;
                }
                long j5 = nowUnixTimeUs;
                this.trackSelection.updateSelectedTrack(j, j4, resolveTimeToLiveEdgeUs, list, mediaChunkIteratorArr2);
                RepresentationHolder representationHolder3 = this.representationHolders[this.trackSelection.getSelectedIndex()];
                if (representationHolder3.extractorWrapper != null) {
                    Representation representation = representationHolder3.representation;
                    RangedUri initializationUri = representationHolder3.extractorWrapper.getSampleFormats() == null ? representation.getInitializationUri() : null;
                    RangedUri indexUri = representationHolder3.segmentIndex == null ? representation.getIndexUri() : null;
                    if (!(initializationUri == null && indexUri == null)) {
                        chunkHolder2.chunk = newInitializationChunk(representationHolder3, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri);
                        return;
                    }
                }
                if (representationHolder3.getSegmentCount() == 0) {
                    chunkHolder2.endOfStream = !this.manifest.dynamic || this.periodIndex < this.manifest.getPeriodCount() - 1;
                    return;
                }
                long j6 = j5;
                long firstAvailableSegmentNum2 = representationHolder3.getFirstAvailableSegmentNum(this.manifest, this.periodIndex, j6);
                long lastAvailableSegmentNum2 = representationHolder3.getLastAvailableSegmentNum(this.manifest, this.periodIndex, j6);
                updateLiveEdgeTimeUs(representationHolder3, lastAvailableSegmentNum2);
                long j7 = lastAvailableSegmentNum2;
                long segmentNum2 = getSegmentNum(representationHolder3, mediaChunk, j2, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
                if (segmentNum2 < firstAvailableSegmentNum2) {
                    this.fatalError = new BehindLiveWindowException();
                } else if (segmentNum2 > j7 || (this.missingLastSegment && segmentNum2 >= j7)) {
                    chunkHolder2.endOfStream = !this.manifest.dynamic || this.periodIndex < this.manifest.getPeriodCount() - 1;
                } else {
                    long access$000 = representationHolder3.periodDurationUs;
                    if (access$000 == C.TIME_UNSET || representationHolder3.getSegmentStartTimeUs(segmentNum2) < access$000) {
                        int min = (int) Math.min((long) this.maxSegmentsPerLoad, (j7 - segmentNum2) + 1);
                        if (access$000 != C.TIME_UNSET) {
                            while (min > 1 && representationHolder3.getSegmentStartTimeUs((((long) min) + segmentNum2) - 1) >= access$000) {
                                min--;
                            }
                        }
                        chunkHolder2.chunk = newMediaChunk(representationHolder3, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum2, min, list.isEmpty() ? j2 : -9223372036854775807L);
                        return;
                    }
                    chunkHolder2.endOfStream = true;
                }
            }
        }
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        SeekMap seekMap;
        if (chunk instanceof InitializationChunk) {
            int indexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[indexOf];
            if (representationHolder.segmentIndex == null && (seekMap = representationHolder.extractorWrapper.getSeekMap()) != null) {
                this.representationHolders[indexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex((ChunkIndex) seekMap, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler2 != null) {
            playerTrackEmsgHandler2.onChunkLoadCompleted(chunk);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r7 = r5.representationHolders[r5.trackSelection.indexOf(r6.trackFormat)];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onChunkLoadError(com.google.android.exoplayer2.source.chunk.Chunk r6, boolean r7, java.lang.Exception r8, long r9) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r7 = r5.playerTrackEmsgHandler
            r1 = 1
            if (r7 == 0) goto L_0x0010
            boolean r7 = r7.maybeRefreshManifestOnLoadingError(r6)
            if (r7 == 0) goto L_0x0010
            return r1
        L_0x0010:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r7 = r5.manifest
            boolean r7 = r7.dynamic
            if (r7 != 0) goto L_0x0052
            boolean r7 = r6 instanceof com.google.android.exoplayer2.source.chunk.MediaChunk
            if (r7 == 0) goto L_0x0052
            boolean r7 = r8 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r7 == 0) goto L_0x0052
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r8 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r8
            int r7 = r8.responseCode
            r8 = 404(0x194, float:5.66E-43)
            if (r7 != r8) goto L_0x0052
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r7 = r5.representationHolders
            com.google.android.exoplayer2.trackselection.TrackSelection r8 = r5.trackSelection
            com.google.android.exoplayer2.Format r2 = r6.trackFormat
            int r8 = r8.indexOf((com.google.android.exoplayer2.Format) r2)
            r7 = r7[r8]
            int r8 = r7.getSegmentCount()
            r2 = -1
            if (r8 == r2) goto L_0x0052
            if (r8 == 0) goto L_0x0052
            long r2 = r7.getFirstSegmentNum()
            long r7 = (long) r8
            long r2 = r2 + r7
            r7 = 1
            long r2 = r2 - r7
            r7 = r6
            com.google.android.exoplayer2.source.chunk.MediaChunk r7 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r7
            long r7 = r7.getNextChunkIndex()
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            r5.missingLastSegment = r1
            return r1
        L_0x0052:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x006a
            com.google.android.exoplayer2.trackselection.TrackSelection r7 = r5.trackSelection
            com.google.android.exoplayer2.Format r6 = r6.trackFormat
            int r6 = r7.indexOf((com.google.android.exoplayer2.Format) r6)
            boolean r6 = r7.blacklist(r6, r9)
            if (r6 == 0) goto L_0x006a
            return r1
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.onChunkLoadError(com.google.android.exoplayer2.source.chunk.Chunk, boolean, java.lang.Exception, long):boolean");
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j, long j2, long j3) {
        if (mediaChunk != null) {
            return mediaChunk.getNextChunkIndex();
        }
        return Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private void updateLiveEdgeTimeUs(RepresentationHolder representationHolder, long j) {
        this.liveEdgeTimeUs = this.manifest.dynamic ? representationHolder.getSegmentEndTimeUs(j) : C.TIME_UNSET;
    }

    private long getNowUnixTimeUs() {
        long currentTimeMillis;
        if (this.elapsedRealtimeOffsetMs != 0) {
            currentTimeMillis = SystemClock.elapsedRealtime() + this.elapsedRealtimeOffsetMs;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis * 1000;
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        if (this.manifest.dynamic && this.liveEdgeTimeUs != C.TIME_UNSET) {
            return this.liveEdgeTimeUs - j;
        }
        return C.TIME_UNSET;
    }

    /* access modifiers changed from: protected */
    public Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource2, Format format, int i, Object obj, RangedUri rangedUri, RangedUri rangedUri2) {
        String str = representationHolder.representation.baseUrl;
        if (rangedUri == null || (rangedUri2 = rangedUri.attemptMerge(rangedUri2, str)) != null) {
            rangedUri = rangedUri2;
        }
        return new InitializationChunk(dataSource2, new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, representationHolder.representation.getCacheKey()), format, i, obj, representationHolder.extractorWrapper);
    }

    /* access modifiers changed from: protected */
    public Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource2, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        RepresentationHolder representationHolder2 = representationHolder;
        long j3 = j;
        Representation representation = representationHolder2.representation;
        long segmentStartTimeUs = representationHolder2.getSegmentStartTimeUs(j3);
        RangedUri segmentUrl = representationHolder2.getSegmentUrl(j3);
        String str = representation.baseUrl;
        if (representationHolder2.extractorWrapper == null) {
            return new SingleSampleMediaChunk(dataSource2, new DataSpec(segmentUrl.resolveUri(str), segmentUrl.start, segmentUrl.length, representation.getCacheKey()), format, i2, obj, segmentStartTimeUs, representationHolder2.getSegmentEndTimeUs(j3), j, i, format);
        }
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i4 < i5) {
            RangedUri attemptMerge = segmentUrl.attemptMerge(representationHolder2.getSegmentUrl(((long) i4) + j3), str);
            if (attemptMerge == null) {
                break;
            }
            i6++;
            i4++;
            segmentUrl = attemptMerge;
        }
        long segmentEndTimeUs = representationHolder2.getSegmentEndTimeUs((((long) i6) + j3) - 1);
        long access$000 = representationHolder.periodDurationUs;
        long j4 = (access$000 == C.TIME_UNSET || access$000 >= segmentEndTimeUs) ? -9223372036854775807L : access$000;
        DataSpec dataSpec = r18;
        DataSpec dataSpec2 = new DataSpec(segmentUrl.resolveUri(str), segmentUrl.start, segmentUrl.length, representation.getCacheKey());
        ChunkExtractorWrapper chunkExtractorWrapper = representationHolder2.extractorWrapper;
        return new ContainerMediaChunk(dataSource2, dataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j2, j4, j, i6, -representation.presentationTimeOffsetUs, chunkExtractorWrapper);
    }

    protected static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder2, long j, long j2) {
            super(j, j2);
            this.representationHolder = representationHolder2;
        }

        public final DataSpec getDataSpec() {
            checkInBounds();
            Representation representation = this.representationHolder.representation;
            RangedUri segmentUrl = this.representationHolder.getSegmentUrl(getCurrentIndex());
            return new DataSpec(segmentUrl.resolveUri(representation.baseUrl), segmentUrl.start, segmentUrl.length, representation.getCacheKey());
        }

        public final long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        public final long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }
    }

    protected static final class RepresentationHolder {
        @Nullable
        final ChunkExtractorWrapper extractorWrapper;
        /* access modifiers changed from: private */
        public final long periodDurationUs;
        public final Representation representation;
        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;

        RepresentationHolder(long j, int i, Representation representation2, boolean z, boolean z2, TrackOutput trackOutput) {
            this(j, representation2, createExtractorWrapper(i, representation2, z, z2, trackOutput), 0, representation2.getIndex());
        }

        private RepresentationHolder(long j, Representation representation2, @Nullable ChunkExtractorWrapper chunkExtractorWrapper, long j2, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation2;
            this.segmentNumShift = j2;
            this.extractorWrapper = chunkExtractorWrapper;
            this.segmentIndex = dashSegmentIndex;
        }

        /* access modifiers changed from: package-private */
        @CheckResult
        public final RepresentationHolder copyWithNewRepresentation(long j, Representation representation2) throws BehindLiveWindowException {
            long segmentNum;
            long j2 = j;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation2.getIndex();
            if (index == null) {
                return new RepresentationHolder(j, representation2, this.extractorWrapper, this.segmentNumShift, index);
            } else if (!index.isExplicit()) {
                return new RepresentationHolder(j, representation2, this.extractorWrapper, this.segmentNumShift, index2);
            } else {
                int segmentCount = index.getSegmentCount(j2);
                if (segmentCount == 0) {
                    return new RepresentationHolder(j, representation2, this.extractorWrapper, this.segmentNumShift, index2);
                }
                long firstSegmentNum = (index.getFirstSegmentNum() + ((long) segmentCount)) - 1;
                long timeUs = index.getTimeUs(firstSegmentNum) + index.getDurationUs(firstSegmentNum, j2);
                long firstSegmentNum2 = index2.getFirstSegmentNum();
                long timeUs2 = index2.getTimeUs(firstSegmentNum2);
                long j3 = this.segmentNumShift;
                if (timeUs == timeUs2) {
                    segmentNum = firstSegmentNum + 1;
                } else if (timeUs >= timeUs2) {
                    segmentNum = index.getSegmentNum(timeUs2, j2);
                } else {
                    throw new BehindLiveWindowException();
                }
                long j4 = j3 + (segmentNum - firstSegmentNum2);
                return new RepresentationHolder(j, representation2, this.extractorWrapper, j4, index2);
            }
        }

        /* access modifiers changed from: package-private */
        @CheckResult
        public final RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.extractorWrapper, this.segmentNumShift, dashSegmentIndex);
        }

        public final long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public final int getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public final long getSegmentStartTimeUs(long j) {
            return this.segmentIndex.getTimeUs(j - this.segmentNumShift);
        }

        public final long getSegmentEndTimeUs(long j) {
            return getSegmentStartTimeUs(j) + this.segmentIndex.getDurationUs(j - this.segmentNumShift, this.periodDurationUs);
        }

        public final long getSegmentNum(long j) {
            return this.segmentIndex.getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public final RangedUri getSegmentUrl(long j) {
            return this.segmentIndex.getSegmentUrl(j - this.segmentNumShift);
        }

        public final long getFirstAvailableSegmentNum(DashManifest dashManifest, int i, long j) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-366448161, oncanceled);
                onCancelLoad.getMin(-366448161, oncanceled);
            }
            if (getSegmentCount() != -1 || dashManifest.timeShiftBufferDepthMs == C.TIME_UNSET) {
                return getFirstSegmentNum();
            }
            return Math.max(getFirstSegmentNum(), getSegmentNum(((j - C.msToUs(dashManifest.availabilityStartTimeMs)) - C.msToUs(dashManifest.getPeriod(i).startMs)) - C.msToUs(dashManifest.timeShiftBufferDepthMs)));
        }

        public final long getLastAvailableSegmentNum(DashManifest dashManifest, int i, long j) {
            long firstSegmentNum;
            int segmentCount = getSegmentCount();
            if (segmentCount == -1) {
                firstSegmentNum = getSegmentNum((j - C.msToUs(dashManifest.availabilityStartTimeMs)) - C.msToUs(dashManifest.getPeriod(i).startMs));
            } else {
                firstSegmentNum = getFirstSegmentNum() + ((long) segmentCount);
            }
            return firstSegmentNum - 1;
        }

        private static boolean mimeTypeIsWebm(String str) {
            return str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM);
        }

        private static boolean mimeTypeIsRawText(String str) {
            return MimeTypes.isText(str) || MimeTypes.APPLICATION_TTML.equals(str);
        }

        /* JADX WARNING: type inference failed for: r12v9, types: [com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor] */
        /* JADX WARNING: type inference failed for: r12v10, types: [com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper createExtractorWrapper(int r10, com.google.android.exoplayer2.source.dash.manifest.Representation r11, boolean r12, boolean r13, com.google.android.exoplayer2.extractor.TrackOutput r14) {
            /*
                com.google.android.exoplayer2.Format r0 = r11.format
                java.lang.String r0 = r0.containerMimeType
                boolean r1 = mimeTypeIsRawText(r0)
                r2 = 0
                if (r1 == 0) goto L_0x000c
                return r2
            L_0x000c:
                java.lang.String r1 = "application/x-rawcc"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x001c
                com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor r12 = new com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor
                com.google.android.exoplayer2.Format r13 = r11.format
                r12.<init>(r13)
                goto L_0x004c
            L_0x001c:
                boolean r0 = mimeTypeIsWebm(r0)
                if (r0 == 0) goto L_0x0029
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r12 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
                r13 = 1
                r12.<init>(r13)
                goto L_0x004c
            L_0x0029:
                r0 = 0
                if (r12 == 0) goto L_0x002f
                r12 = 4
                r4 = 4
                goto L_0x0030
            L_0x002f:
                r4 = 0
            L_0x0030:
                if (r13 == 0) goto L_0x003d
                java.lang.String r12 = "application/cea-608"
                com.google.android.exoplayer2.Format r12 = com.google.android.exoplayer2.Format.createTextSampleFormat(r2, r12, r0, r2)
                java.util.List r12 = java.util.Collections.singletonList(r12)
                goto L_0x0041
            L_0x003d:
                java.util.List r12 = java.util.Collections.emptyList()
            L_0x0041:
                r8 = r12
                com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r12 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r12
                r9 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9)
            L_0x004c:
                com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper r13 = new com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper
                com.google.android.exoplayer2.Format r11 = r11.format
                r13.<init>(r12, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder.createExtractorWrapper(int, com.google.android.exoplayer2.source.dash.manifest.Representation, boolean, boolean, com.google.android.exoplayer2.extractor.TrackOutput):com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper");
        }
    }
}
