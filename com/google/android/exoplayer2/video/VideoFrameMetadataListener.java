package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.Format;

public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j, long j2, Format format);
}
