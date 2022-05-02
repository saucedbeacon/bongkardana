package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.service.executor.RVScheduleType;
import com.ap.zoloz.hummer.connect.biz.HummerConnectConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import id.dana.domain.payasset.model.PayMethod;
import id.dana.home.params.ShowCaseNumber;
import id.dana.tracker.mixpanel.RegistrationEvent;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    @Nullable
    private final MappingTrackSelector trackSelector;
    private final Timeline.Window window;

    private static String getAdaptiveSupportString(int i, int i2) {
        return i < 2 ? RegistrationEvent.ProfilePhotoSource.NO_ANSWER : i2 != 0 ? i2 != 8 ? i2 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    private static String getDiscontinuityReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    private static String getFormatSupportString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : PayMethod.ALL : ShowCaseNumber.ONE : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : RVScheduleType.IDLE;
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "DYNAMIC" : HummerConnectConstants.BIZ_SENCE_RESET : "PREPARED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    public void onLoadStarted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
    }

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = instance;
        instance.setMinimumFractionDigits(2);
        TIME_FORMAT.setMaximumFractionDigits(2);
        TIME_FORMAT.setGroupingUsed(false);
    }

    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector) {
        this(mappingTrackSelector, DEFAULT_TAG);
    }

    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector, String str) {
        this.trackSelector = mappingTrackSelector;
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", Boolean.toString(z));
    }

    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(getStateString(i));
        logd(eventTime, "state", sb.toString());
    }

    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "positionDiscontinuity", getDiscontinuityReasonString(i));
    }

    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "seekStarted");
    }

    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", Util.formatInvariant("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(playbackParameters.speed), Float.valueOf(playbackParameters.pitch), Boolean.valueOf(playbackParameters.skipSilence)));
    }

    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        StringBuilder sb = new StringBuilder("timelineChanged [");
        sb.append(getEventTimeString(eventTime));
        sb.append(", periodCount=");
        sb.append(periodCount);
        sb.append(", windowCount=");
        sb.append(windowCount);
        sb.append(", reason=");
        sb.append(getTimelineChangeReasonString(i));
        logd(sb.toString());
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            StringBuilder sb2 = new StringBuilder("  period [");
            sb2.append(getTimeString(this.period.getDurationMs()));
            sb2.append("]");
            logd(sb2.toString());
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            StringBuilder sb3 = new StringBuilder("  window [");
            sb3.append(getTimeString(this.window.getDurationMs()));
            sb3.append(", ");
            sb3.append(this.window.isSeekable);
            sb3.append(", ");
            sb3.append(this.window.isDynamic);
            sb3.append("]");
            logd(sb3.toString());
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    public void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        loge(eventTime, "playerFailed", exoPlaybackException);
    }

    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        String str;
        String str2;
        int i;
        MappingTrackSelector mappingTrackSelector = this.trackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = mappingTrackSelector != null ? mappingTrackSelector.getCurrentMappedTrackInfo() : null;
        if (currentMappedTrackInfo == null) {
            logd(eventTime, "tracksChanged", "[]");
            return;
        }
        AnalyticsListener.EventTime eventTime2 = eventTime;
        StringBuilder sb = new StringBuilder("tracksChanged [");
        sb.append(getEventTimeString(eventTime));
        sb.append(", ");
        logd(sb.toString());
        int rendererCount = currentMappedTrackInfo.getRendererCount();
        int i2 = 0;
        while (true) {
            str = "  ]";
            str2 = " [";
            if (i2 >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i2);
            TrackSelection trackSelection = trackSelectionArray.get(i2);
            if (trackGroups.length > 0) {
                i = rendererCount;
                StringBuilder sb2 = new StringBuilder("  Renderer:");
                sb2.append(i2);
                sb2.append(str2);
                logd(sb2.toString());
                int i3 = 0;
                while (i3 < trackGroups.length) {
                    TrackGroup trackGroup = trackGroups.get(i3);
                    TrackGroupArray trackGroupArray2 = trackGroups;
                    String str3 = str;
                    String adaptiveSupportString = getAdaptiveSupportString(trackGroup.length, currentMappedTrackInfo.getAdaptiveSupport(i2, i3, false));
                    StringBuilder sb3 = new StringBuilder("    Group:");
                    sb3.append(i3);
                    sb3.append(", adaptive_supported=");
                    sb3.append(adaptiveSupportString);
                    sb3.append(str2);
                    logd(sb3.toString());
                    int i4 = 0;
                    while (i4 < trackGroup.length) {
                        String trackStatusString = getTrackStatusString(trackSelection, trackGroup, i4);
                        String formatSupportString = getFormatSupportString(currentMappedTrackInfo.getTrackSupport(i2, i3, i4));
                        String str4 = str2;
                        StringBuilder sb4 = new StringBuilder("      ");
                        sb4.append(trackStatusString);
                        sb4.append(" Track:");
                        sb4.append(i4);
                        sb4.append(", ");
                        sb4.append(Format.toLogString(trackGroup.getFormat(i4)));
                        sb4.append(", supported=");
                        sb4.append(formatSupportString);
                        logd(sb4.toString());
                        i4++;
                        str2 = str4;
                    }
                    String str5 = str2;
                    logd("    ]");
                    i3++;
                    TrackSelectionArray trackSelectionArray2 = trackSelectionArray;
                    trackGroups = trackGroupArray2;
                    str = str3;
                }
                String str6 = str;
                if (trackSelection != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= trackSelection.length()) {
                            break;
                        }
                        Metadata metadata = trackSelection.getFormat(i5).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd("    ]");
                            break;
                        }
                        i5++;
                    }
                }
                logd(str6);
            } else {
                i = rendererCount;
            }
            i2++;
            rendererCount = i;
        }
        String str7 = str;
        String str8 = str2;
        TrackGroupArray unmappedTrackGroups = currentMappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Renderer:None [");
            int i6 = 0;
            while (i6 < unmappedTrackGroups.length) {
                StringBuilder sb5 = new StringBuilder("    Group:");
                sb5.append(i6);
                String str9 = str8;
                sb5.append(str9);
                logd(sb5.toString());
                TrackGroup trackGroup2 = unmappedTrackGroups.get(i6);
                for (int i7 = 0; i7 < trackGroup2.length; i7++) {
                    String trackStatusString2 = getTrackStatusString(false);
                    String formatSupportString2 = getFormatSupportString(0);
                    StringBuilder sb6 = new StringBuilder("      ");
                    sb6.append(trackStatusString2);
                    sb6.append(" Track:");
                    sb6.append(i7);
                    sb6.append(", ");
                    sb6.append(Format.toLogString(trackGroup2.getFormat(i7)));
                    sb6.append(", supported=");
                    sb6.append(formatSupportString2);
                    logd(sb6.toString());
                }
                logd("    ]");
                i6++;
                str8 = str9;
            }
            logd(str7);
        }
        logd("]");
    }

    public void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "seekProcessed");
    }

    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        StringBuilder sb = new StringBuilder("metadata [");
        sb.append(getEventTimeString(eventTime));
        sb.append(", ");
        logd(sb.toString());
        printMetadata(metadata, "  ");
        logd("]");
    }

    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderEnabled", getTrackTypeString(i));
    }

    public void onAudioSessionId(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(getTrackTypeString(i));
        sb.append(", ");
        sb.append(str);
        logd(eventTime, "decoderInitialized", sb.toString());
    }

    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2053414091, oncanceled);
            onCancelLoad.getMin(-2053414091, oncanceled);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getTrackTypeString(i));
        sb.append(", ");
        sb.append(Format.toLogString(format));
        logd(eventTime, "decoderInputFormatChanged", sb.toString());
    }

    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderDisabled", getTrackTypeString(i));
    }

    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        loge(eventTime, "audioTrackUnderrun", sb.toString(), (Throwable) null);
    }

    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        logd(eventTime, "videoSizeChanged", sb.toString());
    }

    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, @Nullable Surface surface) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(surface));
    }

    public void onMediaPeriodCreated(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodCreated");
    }

    public void onMediaPeriodReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodReleased");
    }

    public void onLoadError(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    public void onReadingStarted(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodReadingStarted");
    }

    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        logd(eventTime, "surfaceSizeChanged", sb.toString());
    }

    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormatChanged", Format.toLogString(mediaLoadData.trackFormat));
    }

    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionAcquired");
    }

    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    /* access modifiers changed from: protected */
    public void logd(String str) {
        Log.d(this.tag, str);
    }

    /* access modifiers changed from: protected */
    public void loge(String str, @Nullable Throwable th) {
        Log.e(this.tag, str, th);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str));
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, @Nullable Throwable th) {
        loge(getEventString(eventTime, str), th);
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, @Nullable Throwable th) {
        loge(getEventString(eventTime, str, str2), th);
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(metadata.get(i));
            logd(sb.toString());
        }
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" [");
        sb.append(getEventTimeString(eventTime));
        sb.append("]");
        return sb.toString();
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" [");
        sb.append(getEventTimeString(eventTime));
        sb.append(", ");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        StringBuilder sb = new StringBuilder("window=");
        sb.append(eventTime.windowIndex);
        String obj = sb.toString();
        if (eventTime.mediaPeriodId != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(", period=");
            sb2.append(eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid));
            obj = sb2.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append(", adGroup=");
                sb3.append(eventTime.mediaPeriodId.adGroupIndex);
                String obj2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj2);
                sb4.append(", ad=");
                sb4.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                obj = sb4.toString();
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getTimeString(eventTime.realtimeMs - this.startTimeMs));
        sb5.append(", ");
        sb5.append(getTimeString(eventTime.currentPlaybackPositionMs));
        sb5.append(", ");
        sb5.append(obj);
        return sb5.toString();
    }

    private static String getTimeString(long j) {
        return j == C.TIME_UNSET ? "?" : TIME_FORMAT.format((double) (((float) j) / 1000.0f));
    }

    private static String getTrackStatusString(@Nullable TrackSelection trackSelection, TrackGroup trackGroup, int i) {
        return getTrackStatusString((trackSelection == null || trackSelection.getTrackGroup() != trackGroup || trackSelection.indexOf(i) == -1) ? false : true);
    }

    private static String getTrackTypeString(int i) {
        switch (i) {
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return TtmlNode.TAG_METADATA;
            case 5:
                return "camera motion";
            case 6:
                return "none";
            default:
                if (i < 10000) {
                    return "?";
                }
                StringBuilder sb = new StringBuilder("custom (");
                sb.append(i);
                sb.append(")");
                return sb.toString();
        }
    }
}
