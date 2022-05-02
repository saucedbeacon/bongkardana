package o;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MediaSource;

public final class setAllowReturnTransitionOverlap implements MediaSource.SourceInfoRefreshListener {
    private final CompositeMediaSource getMin;
    private final Object setMax;

    public setAllowReturnTransitionOverlap(CompositeMediaSource compositeMediaSource, Object obj) {
        this.getMin = compositeMediaSource;
        this.setMax = obj;
    }

    public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline, Object obj) {
        this.getMin.lambda$prepareChildSource$0(this.setMax, mediaSource, timeline, obj);
    }
}
