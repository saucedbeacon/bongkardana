package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import java.util.Collections;
import java.util.List;

public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final String baseUrl;
    public final String contentId;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;

    public abstract String getCacheKey();

    public abstract DashSegmentIndex getIndex();

    public abstract RangedUri getIndexUri();

    public static Representation newInstance(String str, long j, Format format2, String str2, SegmentBase segmentBase) {
        return newInstance(str, j, format2, str2, segmentBase, (List<Descriptor>) null);
    }

    public static Representation newInstance(String str, long j, Format format2, String str2, SegmentBase segmentBase, List<Descriptor> list) {
        return newInstance(str, j, format2, str2, segmentBase, list, (String) null);
    }

    public static Representation newInstance(String str, long j, Format format2, String str2, SegmentBase segmentBase, List<Descriptor> list, String str3) {
        SegmentBase segmentBase2 = segmentBase;
        if (segmentBase2 instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(str, j, format2, str2, (SegmentBase.SingleSegmentBase) segmentBase2, list, str3, -1);
        } else if (segmentBase2 instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(str, j, format2, str2, (SegmentBase.MultiSegmentBase) segmentBase2, list);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    private Representation(String str, long j, Format format2, String str2, SegmentBase segmentBase, List<Descriptor> list) {
        List<Descriptor> list2;
        this.contentId = str;
        this.revisionId = j;
        this.format = format2;
        this.baseUrl = str2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.inbandEventStreams = list2;
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    public static class SingleSegmentRepresentation extends Representation {
        private final String cacheKey;
        public final long contentLength;
        private final RangedUri indexUri;
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        public static SingleSegmentRepresentation newInstance(String str, long j, Format format, String str2, long j2, long j3, long j4, long j5, List<Descriptor> list, String str3, long j6) {
            return new SingleSegmentRepresentation(str, j, format, str2, new SegmentBase.SingleSegmentBase(new RangedUri((String) null, j2, (j3 - j2) + 1), 1, 0, j4, (j5 - j4) + 1), list, str3, j6);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SingleSegmentRepresentation(String str, long j, Format format, String str2, SegmentBase.SingleSegmentBase singleSegmentBase, List<Descriptor> list, String str3, long j2) {
            super(str, j, format, str2, singleSegmentBase, list);
            String str4;
            String str5 = str;
            this.uri = Uri.parse(str2);
            this.indexUri = singleSegmentBase.getIndex();
            SingleSegmentIndex singleSegmentIndex = null;
            if (str3 != null) {
                str4 = str3;
            } else if (str5 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".");
                sb.append(format.f9530id);
                sb.append(".");
                long j3 = j;
                sb.append(j);
                str4 = sb.toString();
            } else {
                str4 = null;
            }
            this.cacheKey = str4;
            this.contentLength = j2;
            this.segmentIndex = this.indexUri == null ? new SingleSegmentIndex(new RangedUri((String) null, 0, j2)) : singleSegmentIndex;
        }

        public RangedUri getIndexUri() {
            return this.indexUri;
        }

        public DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        public String getCacheKey() {
            return this.cacheKey;
        }
    }

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        private final SegmentBase.MultiSegmentBase segmentBase;

        public String getCacheKey() {
            return null;
        }

        public DashSegmentIndex getIndex() {
            return this;
        }

        public RangedUri getIndexUri() {
            return null;
        }

        public MultiSegmentRepresentation(String str, long j, Format format, String str2, SegmentBase.MultiSegmentBase multiSegmentBase, List<Descriptor> list) {
            super(str, j, format, str2, multiSegmentBase, list);
            this.segmentBase = multiSegmentBase;
        }

        public RangedUri getSegmentUrl(long j) {
            return this.segmentBase.getSegmentUrl(this, j);
        }

        public long getSegmentNum(long j, long j2) {
            return this.segmentBase.getSegmentNum(j, j2);
        }

        public long getTimeUs(long j) {
            return this.segmentBase.getSegmentTimeUs(j);
        }

        public long getDurationUs(long j, long j2) {
            return this.segmentBase.getSegmentDurationUs(j, j2);
        }

        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        public int getSegmentCount(long j) {
            return this.segmentBase.getSegmentCount(j);
        }

        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }
    }
}
