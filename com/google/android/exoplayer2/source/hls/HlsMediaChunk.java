package com.google.android.exoplayer2.source.hls;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class HlsMediaChunk extends MediaChunk {
    private static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final DrmInitData drmInitData;
    private Extractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private final boolean hasGapTag;
    public final HlsMasterPlaylist.HlsUrl hlsUrl;
    private final ParsableByteArray id3Data;
    private final Id3Decoder id3Decoder;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private boolean initLoadCompleted;
    private int initSegmentBytesLoaded;
    private final boolean isEncrypted;
    private final boolean isMasterTimestampSource;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    private final Extractor previousExtractor;
    private final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HlsMediaChunk(com.google.android.exoplayer2.source.hls.HlsExtractorFactory r17, com.google.android.exoplayer2.upstream.DataSource r18, com.google.android.exoplayer2.upstream.DataSpec r19, com.google.android.exoplayer2.upstream.DataSpec r20, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl r21, java.util.List<com.google.android.exoplayer2.Format> r22, int r23, java.lang.Object r24, long r25, long r27, long r29, int r31, boolean r32, boolean r33, com.google.android.exoplayer2.util.TimestampAdjuster r34, com.google.android.exoplayer2.source.hls.HlsMediaChunk r35, com.google.android.exoplayer2.drm.DrmInitData r36, byte[] r37, byte[] r38) {
        /*
            r16 = this;
            r12 = r16
            r13 = r18
            r14 = r21
            r15 = r31
            r10 = r35
            r11 = r37
            r0 = r38
            com.google.android.exoplayer2.upstream.DataSource r1 = buildDataSource(r13, r11, r0)
            com.google.android.exoplayer2.Format r3 = r14.format
            r0 = r16
            r2 = r19
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r27
            r13 = r10
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r12.discontinuitySequenceNumber = r15
            r0 = r20
            r12.initDataSpec = r0
            r12.hlsUrl = r14
            r0 = r33
            r12.isMasterTimestampSource = r0
            r0 = r34
            r12.timestampAdjuster = r0
            r0 = 1
            r1 = 0
            if (r37 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            r12.isEncrypted = r2
            r2 = r32
            r12.hasGapTag = r2
            r2 = r17
            r12.extractorFactory = r2
            r2 = r22
            r12.muxedCaptionFormats = r2
            r2 = r36
            r12.drmInitData = r2
            r2 = 0
            if (r13 == 0) goto L_0x0071
            com.google.android.exoplayer2.metadata.id3.Id3Decoder r3 = r13.id3Decoder
            r12.id3Decoder = r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r13.id3Data
            r12.id3Data = r3
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r3 = r13.hlsUrl
            if (r3 != r14) goto L_0x0064
            boolean r3 = r13.loadCompleted
            if (r3 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            r12.shouldSpliceIn = r0
            int r1 = r13.discontinuitySequenceNumber
            if (r1 != r15) goto L_0x0083
            if (r0 == 0) goto L_0x006d
            goto L_0x0083
        L_0x006d:
            com.google.android.exoplayer2.extractor.Extractor r0 = r13.extractor
            r2 = r0
            goto L_0x0083
        L_0x0071:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder r0 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder
            r0.<init>()
            r12.id3Decoder = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3 = 10
            r0.<init>((int) r3)
            r12.id3Data = r0
            r12.shouldSpliceIn = r1
        L_0x0083:
            r12.previousExtractor = r2
            r0 = r18
            r12.initDataSource = r0
            java.util.concurrent.atomic.AtomicInteger r0 = uidSource
            int r0 = r0.getAndIncrement()
            r12.uid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaChunk.<init>(com.google.android.exoplayer2.source.hls.HlsExtractorFactory, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.DataSpec, com.google.android.exoplayer2.upstream.DataSpec, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl, java.util.List, int, java.lang.Object, long, long, long, int, boolean, boolean, com.google.android.exoplayer2.util.TimestampAdjuster, com.google.android.exoplayer2.source.hls.HlsMediaChunk, com.google.android.exoplayer2.drm.DrmInitData, byte[], byte[]):void");
    }

    public final void init(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.output = hlsSampleStreamWrapper;
    }

    public final boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public final void load() throws IOException, InterruptedException {
        maybeLoadInitData();
        if (!this.loadCanceled) {
            if (!this.hasGapTag) {
                loadMedia();
            }
            this.loadCompleted = true;
        }
    }

    private void maybeLoadInitData() throws IOException, InterruptedException {
        DataSpec dataSpec;
        DefaultExtractorInput prepareExtraction;
        if (!this.initLoadCompleted && (dataSpec = this.initDataSpec) != null) {
            try {
                prepareExtraction = prepareExtraction(this.initDataSource, dataSpec.subrange((long) this.initSegmentBytesLoaded));
                int i = 0;
                while (i == 0) {
                    if (this.loadCanceled) {
                        break;
                    }
                    i = this.extractor.read(prepareExtraction, (PositionHolder) null);
                }
                this.initSegmentBytesLoaded = (int) (prepareExtraction.getPosition() - this.initDataSpec.absoluteStreamPosition);
                Util.closeQuietly(this.initDataSource);
                this.initLoadCompleted = true;
            } catch (Throwable th) {
                Util.closeQuietly(this.initDataSource);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[Catch:{ all -> 0x0052, all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046 A[SYNTHETIC, Splitter:B:18:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadMedia() throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            boolean r0 = r8.isEncrypted
            r1 = 0
            if (r0 == 0) goto L_0x000d
            com.google.android.exoplayer2.upstream.DataSpec r0 = r8.dataSpec
            int r2 = r8.nextLoadPosition
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x000d:
            com.google.android.exoplayer2.upstream.DataSpec r0 = r8.dataSpec
            int r2 = r8.nextLoadPosition
            long r2 = (long) r2
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.subrange(r2)
        L_0x0016:
            r2 = 0
        L_0x0017:
            boolean r3 = r8.isMasterTimestampSource
            if (r3 != 0) goto L_0x0021
            com.google.android.exoplayer2.util.TimestampAdjuster r3 = r8.timestampAdjuster
            r3.waitUntilInitialized()
            goto L_0x0037
        L_0x0021:
            com.google.android.exoplayer2.util.TimestampAdjuster r3 = r8.timestampAdjuster
            long r3 = r3.getFirstSampleTimestampUs()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0037
            com.google.android.exoplayer2.util.TimestampAdjuster r3 = r8.timestampAdjuster
            long r4 = r8.startTimeUs
            r3.setFirstSampleTimestampUs(r4)
        L_0x0037:
            com.google.android.exoplayer2.upstream.StatsDataSource r3 = r8.dataSource     // Catch:{ all -> 0x0072 }
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r0 = r8.prepareExtraction(r3, r0)     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0044
            int r2 = r8.nextLoadPosition     // Catch:{ all -> 0x0072 }
            r0.skipFully(r2)     // Catch:{ all -> 0x0072 }
        L_0x0044:
            if (r1 != 0) goto L_0x0060
            boolean r1 = r8.loadCanceled     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0060
            com.google.android.exoplayer2.extractor.Extractor r1 = r8.extractor     // Catch:{ all -> 0x0052 }
            r2 = 0
            int r1 = r1.read(r0, r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0044
        L_0x0052:
            r1 = move-exception
            long r2 = r0.getPosition()     // Catch:{ all -> 0x0072 }
            com.google.android.exoplayer2.upstream.DataSpec r0 = r8.dataSpec     // Catch:{ all -> 0x0072 }
            long r4 = r0.absoluteStreamPosition     // Catch:{ all -> 0x0072 }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x0072 }
            r8.nextLoadPosition = r0     // Catch:{ all -> 0x0072 }
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0060:
            long r0 = r0.getPosition()     // Catch:{ all -> 0x0072 }
            com.google.android.exoplayer2.upstream.DataSpec r2 = r8.dataSpec     // Catch:{ all -> 0x0072 }
            long r2 = r2.absoluteStreamPosition     // Catch:{ all -> 0x0072 }
            long r0 = r0 - r2
            int r1 = (int) r0     // Catch:{ all -> 0x0072 }
            r8.nextLoadPosition = r1     // Catch:{ all -> 0x0072 }
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r8.dataSource
            com.google.android.exoplayer2.util.Util.closeQuietly((com.google.android.exoplayer2.upstream.DataSource) r0)
            return
        L_0x0072:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r8.dataSource
            com.google.android.exoplayer2.util.Util.closeQuietly((com.google.android.exoplayer2.upstream.DataSource) r1)
            goto L_0x007a
        L_0x0079:
            throw r0
        L_0x007a:
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaChunk.loadMedia():void");
    }

    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec) throws IOException, InterruptedException {
        DataSpec dataSpec2 = dataSpec;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec2.absoluteStreamPosition, dataSource.open(dataSpec));
        if (this.extractor != null) {
            return defaultExtractorInput;
        }
        long peekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
        defaultExtractorInput.resetPeekPosition();
        DefaultExtractorInput defaultExtractorInput2 = defaultExtractorInput;
        Pair<Extractor, Boolean> createExtractor = this.extractorFactory.createExtractor(this.previousExtractor, dataSpec2.uri, this.trackFormat, this.muxedCaptionFormats, this.drmInitData, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput2);
        Extractor extractor2 = (Extractor) createExtractor.first;
        this.extractor = extractor2;
        boolean z = true;
        boolean z2 = extractor2 == this.previousExtractor;
        if (((Boolean) createExtractor.second).booleanValue()) {
            this.output.setSampleOffsetUs(peekId3PrivTimestamp != C.TIME_UNSET ? this.timestampAdjuster.adjustTsTimestamp(peekId3PrivTimestamp) : this.startTimeUs);
        }
        if (!z2 || this.initDataSpec == null) {
            z = false;
        }
        this.initLoadCompleted = z;
        this.output.init(this.uid, this.shouldSpliceIn, z2);
        if (z2) {
            return defaultExtractorInput2;
        }
        this.extractor.init(this.output);
        return defaultExtractorInput2;
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws IOException, InterruptedException {
        Metadata decode;
        extractorInput.resetPeekPosition();
        if (extractorInput.getLength() >= 10 && extractorInput.peekFully(this.id3Data.data, 0, 10, true)) {
            this.id3Data.reset(10);
            if (this.id3Data.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
                return C.TIME_UNSET;
            }
            this.id3Data.skipBytes(3);
            int readSynchSafeInt = this.id3Data.readSynchSafeInt();
            int i = readSynchSafeInt + 10;
            if (i > this.id3Data.capacity()) {
                byte[] bArr = this.id3Data.data;
                this.id3Data.reset(i);
                System.arraycopy(bArr, 0, this.id3Data.data, 0, 10);
            }
            if (!extractorInput.peekFully(this.id3Data.data, 10, readSynchSafeInt, true) || (decode = this.id3Decoder.decode(this.id3Data.data, readSynchSafeInt)) == null) {
                return C.TIME_UNSET;
            }
            int length = decode.length();
            for (int i2 = 0; i2 < length; i2++) {
                Metadata.Entry entry = decode.get(i2);
                if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.id3Data.data, 0, 8);
                        this.id3Data.reset(8);
                        return this.id3Data.readLong() & 8589934591L;
                    }
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new Aes128DataSource(dataSource, bArr, bArr2) : dataSource;
    }
}
