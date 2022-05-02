package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DashDownloader extends SegmentDownloader<DashManifest> {
    public DashDownloader(Uri uri, List<StreamKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    /* access modifiers changed from: protected */
    public final DashManifest getManifest(DataSource dataSource, Uri uri) throws IOException {
        return DashUtil.loadManifest(dataSource, uri);
    }

    /* access modifiers changed from: protected */
    public final List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws InterruptedException, IOException {
        DashManifest dashManifest2 = dashManifest;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest2.getPeriod(i);
            long msToUs = C.msToUs(period.startMs);
            long periodDurationUs = dashManifest2.getPeriodDurationUs(i);
            int i2 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i2), msToUs, periodDurationUs, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource r20, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r21, long r22, long r24, boolean r26, java.util.ArrayList<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r21
            r2 = r22
            r4 = r27
            r0 = 0
            r5 = 0
        L_0x0008:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r1.representations
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0082
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r1.representations
            java.lang.Object r0 = r0.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r0
            int r6 = r1.type     // Catch:{ IOException -> 0x0075 }
            r7 = r20
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r6 = getSegmentIndex(r7, r6, r0)     // Catch:{ IOException -> 0x0073 }
            if (r6 == 0) goto L_0x0067
            r8 = r24
            int r10 = r6.getSegmentCount(r8)
            r11 = -1
            if (r10 == r11) goto L_0x005f
            java.lang.String r11 = r0.baseUrl
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r12 = r0.getInitializationUri()
            if (r12 == 0) goto L_0x0036
            addSegment(r2, r11, r12, r4)
        L_0x0036:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r0.getIndexUri()
            if (r0 == 0) goto L_0x003f
            addSegment(r2, r11, r0, r4)
        L_0x003f:
            long r12 = r6.getFirstSegmentNum()
            long r14 = (long) r10
            long r14 = r14 + r12
            r16 = 1
            long r14 = r14 - r16
        L_0x0049:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x007c
            long r18 = r6.getTimeUs(r12)
            long r0 = r2 + r18
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r10 = r6.getSegmentUrl(r12)
            addSegment(r0, r11, r10, r4)
            long r12 = r12 + r16
            r1 = r21
            goto L_0x0049
        L_0x005f:
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0067:
            r8 = r24
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException     // Catch:{ IOException -> 0x0071 }
            java.lang.String r1 = "Missing segment index"
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0071 }
            throw r0     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            goto L_0x007a
        L_0x0073:
            r0 = move-exception
            goto L_0x0078
        L_0x0075:
            r0 = move-exception
            r7 = r20
        L_0x0078:
            r8 = r24
        L_0x007a:
            if (r26 == 0) goto L_0x0081
        L_0x007c:
            int r5 = r5 + 1
            r1 = r21
            goto L_0x0008
        L_0x0081:
            throw r0
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.offline.DashDownloader.addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet, long, long, boolean, java.util.ArrayList):void");
    }

    private static void addSegment(long j, String str, RangedUri rangedUri, ArrayList<SegmentDownloader.Segment> arrayList) {
        arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, (String) null)));
    }

    @Nullable
    private static DashSegmentIndex getSegmentIndex(DataSource dataSource, int i, Representation representation) throws IOException, InterruptedException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex loadChunkIndex = DashUtil.loadChunkIndex(dataSource, i, representation);
        if (loadChunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(loadChunkIndex, representation.presentationTimeOffsetUs);
    }
}
