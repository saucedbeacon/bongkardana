package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;

final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;

    /* renamed from: id  reason: collision with root package name */
    public final MediaSource.MediaPeriodId f9531id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, boolean z2) {
        this.f9531id = mediaPeriodId;
        this.startPositionUs = j;
        this.contentPositionUs = j2;
        this.durationUs = j3;
        this.isLastInTimelinePeriod = z;
        this.isFinal = z2;
    }

    public final MediaPeriodInfo copyWithStartPositionUs(long j) {
        return new MediaPeriodInfo(this.f9531id, j, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }
}
