package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.DeferredMediaPeriod;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.noteStateNotSaved;
import o.onCancelLoad;
import o.onCanceled;
import o.performConfigurationChanged;
import o.performMultiWindowModeChanged;
import o.performPictureInPictureModeChanged;
import o.performPrimaryNavigationFragmentChanged;
import o.performResume;
import o.performStart;

public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId DUMMY_CONTENT_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private MediaSource[][] adGroupMediaSources;
    private Timeline[][] adGroupTimelines;
    private final MediaSourceFactory adMediaSourceFactory;
    private AdPlaybackState adPlaybackState;
    private final ViewGroup adUiViewGroup;
    /* access modifiers changed from: private */
    public final AdsLoader adsLoader;
    private ComponentListener componentListener;
    private Object contentManifest;
    private final MediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Map<MediaSource, List<DeferredMediaPeriod>> deferredMediaPeriodByAdMediaSource;
    /* access modifiers changed from: private */
    @Nullable
    public final Handler eventHandler;
    /* access modifiers changed from: private */
    @Nullable
    public final EventListener eventListener;
    /* access modifiers changed from: private */
    public final Handler mainHandler;
    private final Timeline.Period period;

    public interface MediaSourceFactory {
        MediaSource createMediaSource(Uri uri);

        int[] getSupportedTypes();
    }

    @Deprecated
    public interface EventListener {
        void onAdClicked();

        void onAdLoadError(IOException iOException);

        void onAdTapped();

        void onInternalAdLoadError(RuntimeException runtimeException);
    }

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException("Failed to load ad group ".concat(String.valueOf(i)), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }

        public final RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) getCause();
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader2, ViewGroup viewGroup) {
        this(mediaSource, (MediaSourceFactory) new ExtractorMediaSource.Factory(factory), adsLoader2, viewGroup, (Handler) null, (EventListener) null);
    }

    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader2, ViewGroup viewGroup) {
        this(mediaSource, mediaSourceFactory, adsLoader2, viewGroup, (Handler) null, (EventListener) null);
    }

    @Deprecated
    public AdsMediaSource(MediaSource mediaSource, DataSource.Factory factory, AdsLoader adsLoader2, ViewGroup viewGroup, @Nullable Handler handler, @Nullable EventListener eventListener2) {
        this(mediaSource, (MediaSourceFactory) new ExtractorMediaSource.Factory(factory), adsLoader2, viewGroup, handler, eventListener2);
    }

    @Deprecated
    public AdsMediaSource(MediaSource mediaSource, MediaSourceFactory mediaSourceFactory, AdsLoader adsLoader2, ViewGroup viewGroup, @Nullable Handler handler, @Nullable EventListener eventListener2) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = mediaSourceFactory;
        this.adsLoader = adsLoader2;
        this.adUiViewGroup = viewGroup;
        this.eventHandler = handler;
        this.eventListener = eventListener2;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.deferredMediaPeriodByAdMediaSource = new HashMap();
        this.period = new Timeline.Period();
        this.adGroupMediaSources = new MediaSource[0][];
        this.adGroupTimelines = new Timeline[0][];
        adsLoader2.setSupportedContentTypes(mediaSourceFactory.getSupportedTypes());
    }

    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z, @Nullable TransferListener transferListener) {
        super.prepareSourceInternal(exoPlayer, z, transferListener);
        Assertions.checkArgument(z, "AdsMediaSource must be the top-level source used to prepare the player.");
        ComponentListener componentListener2 = new ComponentListener();
        this.componentListener = componentListener2;
        prepareChildSource(DUMMY_CONTENT_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new performPrimaryNavigationFragmentChanged(this, exoPlayer, componentListener2));
    }

    public final /* synthetic */ void lambda$prepareSourceInternal$0(ExoPlayer exoPlayer, ComponentListener componentListener2) {
        this.adsLoader.attachPlayer(exoPlayer, componentListener2, this.adUiViewGroup);
    }

    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        if (this.adPlaybackState.adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(this.contentMediaSource, mediaPeriodId, allocator);
            deferredMediaPeriod.createPeriod(mediaPeriodId);
            return deferredMediaPeriod;
        }
        int i = mediaPeriodId.adGroupIndex;
        int i2 = mediaPeriodId.adIndexInAdGroup;
        Uri uri = this.adPlaybackState.adGroups[i].uris[i2];
        if (this.adGroupMediaSources[i].length <= i2) {
            MediaSource createMediaSource = this.adMediaSourceFactory.createMediaSource(uri);
            MediaSource[][] mediaSourceArr = this.adGroupMediaSources;
            if (i2 >= mediaSourceArr[i].length) {
                int i3 = i2 + 1;
                mediaSourceArr[i] = (MediaSource[]) Arrays.copyOf(mediaSourceArr[i], i3);
                Timeline[][] timelineArr = this.adGroupTimelines;
                timelineArr[i] = (Timeline[]) Arrays.copyOf(timelineArr[i], i3);
            }
            this.adGroupMediaSources[i][i2] = createMediaSource;
            this.deferredMediaPeriodByAdMediaSource.put(createMediaSource, new ArrayList());
            prepareChildSource(mediaPeriodId, createMediaSource);
        }
        MediaSource mediaSource = this.adGroupMediaSources[i][i2];
        DeferredMediaPeriod deferredMediaPeriod2 = new DeferredMediaPeriod(mediaSource, mediaPeriodId, allocator);
        deferredMediaPeriod2.setPrepareErrorListener(new AdPrepareErrorListener(uri, i, i2));
        List list = this.deferredMediaPeriodByAdMediaSource.get(mediaSource);
        if (list == null) {
            deferredMediaPeriod2.createPeriod(new MediaSource.MediaPeriodId(this.adGroupTimelines[i][i2].getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
        } else {
            list.add(deferredMediaPeriod2);
        }
        return deferredMediaPeriod2;
    }

    public final void releasePeriod(MediaPeriod mediaPeriod) {
        DeferredMediaPeriod deferredMediaPeriod = (DeferredMediaPeriod) mediaPeriod;
        List list = this.deferredMediaPeriodByAdMediaSource.get(deferredMediaPeriod.mediaSource);
        if (list != null) {
            list.remove(deferredMediaPeriod);
        }
        deferredMediaPeriod.releasePeriod();
    }

    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.componentListener.release();
        this.componentListener = null;
        this.deferredMediaPeriodByAdMediaSource.clear();
        this.contentTimeline = null;
        this.contentManifest = null;
        this.adPlaybackState = null;
        this.adGroupMediaSources = new MediaSource[0][];
        this.adGroupTimelines = new Timeline[0][];
        this.mainHandler.post(new performStart(this.adsLoader));
    }

    /* access modifiers changed from: protected */
    public final void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline, @Nullable Object obj) {
        if (mediaPeriodId.isAd()) {
            onAdSourceInfoRefreshed(mediaSource, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, timeline);
        } else {
            onContentSourceInfoRefreshed(timeline, obj);
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    /* access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState2) {
        if (this.adPlaybackState == null) {
            MediaSource[][] mediaSourceArr = new MediaSource[adPlaybackState2.adGroupCount][];
            this.adGroupMediaSources = mediaSourceArr;
            Arrays.fill(mediaSourceArr, new MediaSource[0]);
            Timeline[][] timelineArr = new Timeline[adPlaybackState2.adGroupCount][];
            this.adGroupTimelines = timelineArr;
            Arrays.fill(timelineArr, new Timeline[0]);
        }
        this.adPlaybackState = adPlaybackState2;
        maybeUpdateSourceInfo();
    }

    private void onContentSourceInfoRefreshed(Timeline timeline, Object obj) {
        this.contentTimeline = timeline;
        this.contentManifest = obj;
        maybeUpdateSourceInfo();
    }

    private void onAdSourceInfoRefreshed(MediaSource mediaSource, int i, int i2, Timeline timeline) {
        int max = dispatchOnCancelled.setMax(i);
        boolean z = true;
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1968978663, oncanceled);
            onCancelLoad.getMin(1968978663, oncanceled);
        }
        if (timeline.getPeriodCount() != 1) {
            z = false;
        }
        Assertions.checkArgument(z);
        this.adGroupTimelines[i][i2] = timeline;
        List remove = this.deferredMediaPeriodByAdMediaSource.remove(mediaSource);
        if (remove != null) {
            Object uidOfPeriod = timeline.getUidOfPeriod(0);
            for (int i3 = 0; i3 < remove.size(); i3++) {
                DeferredMediaPeriod deferredMediaPeriod = (DeferredMediaPeriod) remove.get(i3);
                deferredMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, deferredMediaPeriod.f10790id.windowSequenceNumber));
            }
        }
        maybeUpdateSourceInfo();
    }

    private void maybeUpdateSourceInfo() {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 != null && this.contentTimeline != null) {
            AdPlaybackState withAdDurationsUs = adPlaybackState2.withAdDurationsUs(getAdDurations(this.adGroupTimelines, this.period));
            this.adPlaybackState = withAdDurationsUs;
            refreshSourceInfo(withAdDurationsUs.adGroupCount == 0 ? this.contentTimeline : new SinglePeriodAdTimeline(this.contentTimeline, this.adPlaybackState), this.contentManifest);
        }
    }

    private static long[][] getAdDurations(Timeline[][] timelineArr, Timeline.Period period2) {
        long j;
        long[][] jArr = new long[timelineArr.length][];
        for (int i = 0; i < timelineArr.length; i++) {
            jArr[i] = new long[timelineArr[i].length];
            for (int i2 = 0; i2 < timelineArr[i].length; i2++) {
                long[] jArr2 = jArr[i];
                if (timelineArr[i][i2] == null) {
                    j = C.TIME_UNSET;
                } else {
                    j = timelineArr[i][i2].getPeriod(0, period2).getDurationUs();
                }
                jArr2[i2] = j;
            }
        }
        return jArr;
    }

    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler = new Handler();
        private volatile boolean released;

        public ComponentListener() {
        }

        public final void release() {
            this.released = true;
            this.playerHandler.removeCallbacksAndMessages((Object) null);
        }

        public final void onAdPlaybackState(AdPlaybackState adPlaybackState) {
            if (!this.released) {
                this.playerHandler.post(new noteStateNotSaved(this, adPlaybackState));
            }
        }

        public final /* synthetic */ void lambda$onAdPlaybackState$0(AdPlaybackState adPlaybackState) {
            if (!this.released) {
                AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
            }
        }

        public final void onAdClicked() {
            if (!this.released && AdsMediaSource.this.eventHandler != null && AdsMediaSource.this.eventListener != null) {
                AdsMediaSource.this.eventHandler.post(new performResume(this));
            }
        }

        public final /* synthetic */ void lambda$onAdClicked$1() {
            if (!this.released) {
                AdsMediaSource.this.eventListener.onAdClicked();
            }
        }

        public final void onAdTapped() {
            if (!this.released && AdsMediaSource.this.eventHandler != null && AdsMediaSource.this.eventListener != null) {
                AdsMediaSource.this.eventHandler.post(new performConfigurationChanged(this));
            }
        }

        public final /* synthetic */ void lambda$onAdTapped$2() {
            if (!this.released) {
                AdsMediaSource.this.eventListener.onAdTapped();
            }
        }

        public final void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (!this.released) {
                AdsMediaSource.this.createEventDispatcher((MediaSource.MediaPeriodId) null).loadError(dataSpec, dataSpec.uri, Collections.emptyMap(), 6, -1, 0, 0, adLoadException, true);
                if (AdsMediaSource.this.eventHandler != null && AdsMediaSource.this.eventListener != null) {
                    AdsMediaSource.this.eventHandler.post(new performPictureInPictureModeChanged(this, adLoadException));
                }
            }
        }

        public final /* synthetic */ void lambda$onAdLoadError$3(AdLoadException adLoadException) {
            if (this.released) {
                return;
            }
            if (adLoadException.type == 3) {
                AdsMediaSource.this.eventListener.onInternalAdLoadError(adLoadException.getRuntimeExceptionForUnexpected());
            } else {
                AdsMediaSource.this.eventListener.onAdLoadError(adLoadException);
            }
        }
    }

    public final class AdPrepareErrorListener implements DeferredMediaPeriod.PrepareErrorListener {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final Uri adUri;

        public AdPrepareErrorListener(Uri uri, int i, int i2) {
            this.adUri = uri;
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
        }

        public final void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new DataSpec(this.adUri), this.adUri, Collections.emptyMap(), 6, -1, 0, 0, AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new performMultiWindowModeChanged(this, iOException));
        }

        public final /* synthetic */ void lambda$onPrepareError$0(IOException iOException) {
            AdsMediaSource.this.adsLoader.handlePrepareError(this.adGroupIndex, this.adIndexInAdGroup, iOException);
        }
    }
}
