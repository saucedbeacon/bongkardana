package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.MediaFormatUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, SecExceptionCode.SEC_ERROR_SAFETOKEN, 1440, APEncodeOptions.DEFAULT_MAX_LEN, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsAutoFrcWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private Surface dummySurface;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastInputTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    private float pendingPixelWidthHeightRatio;
    private int pendingRotationDegrees;
    private boolean renderedFirstFrame;
    private int reportedHeight;
    private float reportedPixelWidthHeightRatio;
    private int reportedUnappliedRotationDegrees;
    private int reportedWidth;
    private int scalingMode;
    private Surface surface;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    public MediaCodecVideoRenderer(Context context2, MediaCodecSelector mediaCodecSelector) {
        this(context2, mediaCodecSelector, 0);
    }

    public MediaCodecVideoRenderer(Context context2, MediaCodecSelector mediaCodecSelector, long j) {
        this(context2, mediaCodecSelector, j, (Handler) null, (VideoRendererEventListener) null, -1);
    }

    public MediaCodecVideoRenderer(Context context2, MediaCodecSelector mediaCodecSelector, long j, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        this(context2, mediaCodecSelector, j, (DrmSessionManager<FrameworkMediaCrypto>) null, false, handler, videoRendererEventListener, i);
    }

    public MediaCodecVideoRenderer(Context context2, MediaCodecSelector mediaCodecSelector, long j, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        super(2, mediaCodecSelector, drmSessionManager, z, 30.0f);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        Context applicationContext = context2.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(applicationContext);
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.pendingOutputStreamSwitchTimesUs = new long[10];
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        clearReportedVideoSize();
    }

    public int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return 0;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.schemeDataCount; i2++) {
                z |= drmInitData.get(i2).requiresSecureDecryption;
            }
        } else {
            z = false;
        }
        List<MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z);
        if (decoderInfos.isEmpty()) {
            if (!z || mediaCodecSelector.getDecoderInfos(format.sampleMimeType, false).isEmpty()) {
                return 1;
            }
            return 2;
        } else if (!supportsFormatDrm(drmSessionManager, drmInitData)) {
            return 2;
        } else {
            MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
            boolean isFormatSupported = mediaCodecInfo.isFormatSupported(format);
            int i3 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
            if (mediaCodecInfo.tunneling) {
                i = 32;
            }
            return (isFormatSupported ? 4 : 3) | i3 | i;
        }
    }

    public void onEnabled(boolean z) throws ExoPlaybackException {
        super.onEnabled(z);
        int i = getConfiguration().tunnelingAudioSessionId;
        this.tunnelingAudioSessionId = i;
        this.tunneling = i != 0;
        this.eventDispatcher.enabled(this.decoderCounters);
        this.frameReleaseTimeHelper.enable();
    }

    public void onStreamChanged(Format[] formatArr, long j) throws ExoPlaybackException {
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            this.outputStreamOffsetUs = j;
        } else {
            int i = this.pendingOutputStreamOffsetCount;
            if (i == this.pendingOutputStreamOffsetsUs.length) {
                StringBuilder sb = new StringBuilder("Too many stream changes, so dropping offset: ");
                sb.append(this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
                Log.w(TAG, sb.toString());
            } else {
                this.pendingOutputStreamOffsetCount = i + 1;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            int i2 = this.pendingOutputStreamOffsetCount;
            jArr[i2 - 1] = j;
            this.pendingOutputStreamSwitchTimesUs[i2 - 1] = this.lastInputTimeUs;
        }
        super.onStreamChanged(formatArr, j);
    }

    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
        clearRenderedFirstFrame();
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        this.lastInputTimeUs = C.TIME_UNSET;
        int i = this.pendingOutputStreamOffsetCount;
        if (i != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    public boolean isReady() {
        Surface surface2;
        if (super.isReady() && (this.renderedFirstFrame || (((surface2 = this.dummySurface) != null && this.surface == surface2) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        } else if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
                return true;
            }
            this.joiningDeadlineMs = C.TIME_UNSET;
            return false;
        }
    }

    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
    }

    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        super.onStopped();
    }

    public void onDisabled() {
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.pendingOutputStreamOffsetCount = 0;
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.frameReleaseTimeHelper.disable();
        this.tunnelingOnFrameRenderedListener = null;
        this.tunneling = false;
        try {
            super.onDisabled();
        } finally {
            this.decoderCounters.ensureUpdated();
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 1) {
            setSurface((Surface) obj);
        } else if (i == 4) {
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodec codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
            }
        } else if (i == 6) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    private void setSurface(Surface surface2) throws ExoPlaybackException {
        if (surface2 == null) {
            Surface surface3 = this.dummySurface;
            if (surface3 != null) {
                surface2 = surface3;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUseDummySurface(codecInfo)) {
                    surface2 = DummySurface.newInstanceV17(this.context, codecInfo.secure);
                    this.dummySurface = surface2;
                }
            }
        }
        if (this.surface != surface2) {
            this.surface = surface2;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec codec = getCodec();
                if (Util.SDK_INT < 23 || codec == null || surface2 == null || this.codecNeedsSetOutputSurfaceWorkaround) {
                    releaseCodec();
                    maybeInitCodec();
                } else {
                    setOutputSurfaceV23(codec, surface2);
                }
            }
            if (surface2 == null || surface2 == this.dummySurface) {
                clearReportedVideoSize();
                clearRenderedFirstFrame();
                return;
            }
            maybeRenotifyVideoSizeChanged();
            clearRenderedFirstFrame();
            if (state == 2) {
                setJoiningDeadlineMs();
            }
        } else if (surface2 != null && surface2 != this.dummySurface) {
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
        }
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUseDummySurface(mediaCodecInfo);
    }

    public boolean getCodecNeedsEosPropagation() {
        return this.tunneling;
    }

    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) throws MediaCodecUtil.DecoderQueryException {
        CodecMaxValues codecMaxValues2 = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues2;
        MediaFormat mediaFormat = getMediaFormat(format, codecMaxValues2, f, this.deviceNeedsAutoFrcWorkaround, this.tunnelingAudioSessionId);
        if (this.surface == null) {
            Assertions.checkState(shouldUseDummySurface(mediaCodecInfo));
            if (this.dummySurface == null) {
                this.dummySurface = DummySurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.dummySurface;
        }
        mediaCodec.configure(mediaFormat, this.surface, mediaCrypto, 0);
        if (Util.SDK_INT >= 23 && this.tunneling) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediaCodec);
        }
    }

    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        if (!mediaCodecInfo.isSeamlessAdaptationSupported(format, format2, true) || format2.width > this.codecMaxValues.width || format2.height > this.codecMaxValues.height || getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            return 0;
        }
        if (format.initializationDataEquals(format2)) {
            return 1;
        }
        return 3;
    }

    @CallSuper
    public void releaseCodec() {
        try {
            super.releaseCodec();
        } finally {
            this.buffersInCodecCount = 0;
            Surface surface2 = this.dummySurface;
            if (surface2 != null) {
                if (this.surface == surface2) {
                    this.surface = null;
                }
                this.dummySurface.release();
                this.dummySurface = null;
            }
        }
    }

    @CallSuper
    public void flushCodec() throws ExoPlaybackException {
        super.flushCodec();
        this.buffersInCodecCount = 0;
    }

    public float getCodecOperatingRate(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.frameRate;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    public void onCodecInitialized(String str, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
    }

    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        super.onInputFormatChanged(format);
        this.eventDispatcher.inputFormatChanged(format);
        this.pendingPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        this.pendingRotationDegrees = format.rotationDegrees;
    }

    @CallSuper
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        this.buffersInCodecCount++;
        this.lastInputTimeUs = Math.max(decoderInputBuffer.timeUs, this.lastInputTimeUs);
        if (Util.SDK_INT < 23 && this.tunneling) {
            onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        if (z) {
            i = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        processOutputFormat(mediaCodec, i, i2);
    }

    public boolean processOutputBuffer(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, Format format) throws ExoPlaybackException {
        long j4 = j;
        long j5 = j2;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j6 = j3;
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j4;
        }
        long j7 = j6 - this.outputStreamOffsetUs;
        if (z) {
            skipOutputBuffer(mediaCodec2, i3, j7);
            return true;
        }
        long j8 = j6 - j4;
        if (this.surface != this.dummySurface) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            boolean z2 = getState() == 2;
            if (!this.renderedFirstFrame || (z2 && shouldForceRenderOutputBuffer(j8, elapsedRealtime - this.lastRenderTimeUs))) {
                long nanoTime = System.nanoTime();
                notifyFrameMetadataListener(j7, nanoTime, format);
                if (Util.SDK_INT >= 21) {
                    renderOutputBufferV21(mediaCodec, i, j7, nanoTime);
                    return true;
                }
                renderOutputBuffer(mediaCodec2, i3, j7);
                return true;
            }
            if (z2 && j4 != this.initialPositionUs) {
                long nanoTime2 = System.nanoTime();
                long adjustReleaseTime = this.frameReleaseTimeHelper.adjustReleaseTime(j6, ((j8 - (elapsedRealtime - j5)) * 1000) + nanoTime2);
                long j9 = (adjustReleaseTime - nanoTime2) / 1000;
                if (shouldDropBuffersToKeyframe(j9, j5) && maybeDropBuffersToKeyframe(mediaCodec, i, j7, j)) {
                    return false;
                }
                if (shouldDropOutputBuffer(j9, j5)) {
                    dropOutputBuffer(mediaCodec2, i3, j7);
                    return true;
                } else if (Util.SDK_INT >= 21) {
                    if (j9 < 50000) {
                        notifyFrameMetadataListener(j7, adjustReleaseTime, format);
                        renderOutputBufferV21(mediaCodec, i, j7, adjustReleaseTime);
                        return true;
                    }
                } else if (j9 < 30000) {
                    if (j9 > 11000) {
                        try {
                            Thread.sleep((j9 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    notifyFrameMetadataListener(j7, adjustReleaseTime, format);
                    renderOutputBuffer(mediaCodec2, i3, j7);
                    return true;
                }
            }
            return false;
        } else if (!isBufferLate(j8)) {
            return false;
        } else {
            skipOutputBuffer(mediaCodec2, i3, j7);
            return true;
        }
    }

    private void processOutputFormat(MediaCodec mediaCodec, int i, int i2) {
        this.currentWidth = i;
        this.currentHeight = i2;
        this.currentPixelWidthHeightRatio = this.pendingPixelWidthHeightRatio;
        if (Util.SDK_INT >= 21) {
            int i3 = this.pendingRotationDegrees;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.currentWidth;
                this.currentWidth = this.currentHeight;
                this.currentHeight = i4;
                this.currentPixelWidthHeightRatio = 1.0f / this.currentPixelWidthHeightRatio;
            }
        } else {
            this.currentUnappliedRotationDegrees = this.pendingRotationDegrees;
        }
        mediaCodec.setVideoScalingMode(this.scalingMode);
    }

    private void notifyFrameMetadataListener(long j, long j2, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format);
        }
    }

    /* access modifiers changed from: protected */
    public long getOutputStreamOffsetUs() {
        return this.outputStreamOffsetUs;
    }

    /* access modifiers changed from: protected */
    public void onProcessedTunneledBuffer(long j) {
        Format updateOutputFormatForTime = updateOutputFormatForTime(j);
        if (updateOutputFormatForTime != null) {
            processOutputFormat(getCodec(), updateOutputFormatForTime.width, updateOutputFormatForTime.height);
        }
        maybeNotifyVideoSizeChanged();
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    @CallSuper
    public void onProcessedOutputBuffer(long j) {
        this.buffersInCodecCount--;
        while (true) {
            int i = this.pendingOutputStreamOffsetCount;
            if (i != 0 && j >= this.pendingOutputStreamSwitchTimesUs[0]) {
                long[] jArr = this.pendingOutputStreamOffsetsUs;
                this.outputStreamOffsetUs = jArr[0];
                int i2 = i - 1;
                this.pendingOutputStreamOffsetCount = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.pendingOutputStreamSwitchTimesUs;
                System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldDropOutputBuffer(long j, long j2) {
        return isBufferLate(j);
    }

    /* access modifiers changed from: protected */
    public boolean shouldDropBuffersToKeyframe(long j, long j2) {
        return isBufferVeryLate(j);
    }

    /* access modifiers changed from: protected */
    public boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return isBufferLate(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    public void skipOutputBuffer(MediaCodec mediaCodec, int i, long j) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    /* access modifiers changed from: protected */
    public void dropOutputBuffer(MediaCodec mediaCodec, int i, long j) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    /* access modifiers changed from: protected */
    public boolean maybeDropBuffersToKeyframe(MediaCodec mediaCodec, int i, long j, long j2) throws ExoPlaybackException {
        int skipSource = skipSource(j2);
        if (skipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(this.buffersInCodecCount + skipSource);
        flushCodec();
        return true;
    }

    /* access modifiers changed from: protected */
    public void updateDroppedBufferCounters(int i) {
        this.decoderCounters.droppedBufferCount += i;
        this.droppedFrames += i;
        this.consecutiveDroppedFrameCount += i;
        this.decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(this.consecutiveDroppedFrameCount, this.decoderCounters.maxConsecutiveDroppedBufferCount);
        int i2 = this.maxDroppedFramesToNotify;
        if (i2 > 0 && this.droppedFrames >= i2) {
            maybeNotifyDroppedFrames();
        }
    }

    /* access modifiers changed from: protected */
    public void renderOutputBuffer(MediaCodec mediaCodec, int i, long j) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void renderOutputBufferV21(MediaCodec mediaCodec, int i, long j, long j2) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    private boolean shouldUseDummySurface(MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT < 23 || this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || DummySurface.isSecureSupported(this.context);
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    private void clearRenderedFirstFrame() {
        MediaCodec codec;
        this.renderedFirstFrame = false;
        if (Util.SDK_INT >= 23 && this.tunneling && (codec = getCodec()) != null) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
        }
    }

    /* access modifiers changed from: package-private */
    public void maybeNotifyRenderedFirstFrame() {
        if (!this.renderedFirstFrame) {
            this.renderedFirstFrame = true;
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void clearReportedVideoSize() {
        this.reportedWidth = -1;
        this.reportedHeight = -1;
        this.reportedPixelWidthHeightRatio = -1.0f;
        this.reportedUnappliedRotationDegrees = -1;
    }

    private void maybeNotifyVideoSizeChanged() {
        if (this.currentWidth != -1 || this.currentHeight != -1) {
            if (this.reportedWidth != this.currentWidth || this.reportedHeight != this.currentHeight || this.reportedUnappliedRotationDegrees != this.currentUnappliedRotationDegrees || this.reportedPixelWidthHeightRatio != this.currentPixelWidthHeightRatio) {
                this.eventDispatcher.videoSizeChanged(this.currentWidth, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
                this.reportedWidth = this.currentWidth;
                this.reportedHeight = this.currentHeight;
                this.reportedUnappliedRotationDegrees = this.currentUnappliedRotationDegrees;
                this.reportedPixelWidthHeightRatio = this.currentPixelWidthHeightRatio;
            }
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        if (this.reportedWidth != -1 || this.reportedHeight != -1) {
            this.eventDispatcher.videoSizeChanged(this.reportedWidth, this.reportedHeight, this.reportedUnappliedRotationDegrees, this.reportedPixelWidthHeightRatio);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    @TargetApi(23)
    private static void setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface2) {
        mediaCodec.setOutputSurface(surface2);
    }

    @TargetApi(21)
    private static void configureTunnelingV21(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, CodecMaxValues codecMaxValues2, float f, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.sampleMimeType);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        mediaFormat.setInteger("max-width", codecMaxValues2.width);
        mediaFormat.setInteger("max-height", codecMaxValues2.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues2.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            configureTunnelingV21(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) throws MediaCodecUtil.DecoderQueryException {
        int codecMaxInputSize;
        int i = format.width;
        int i2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (!(maxInputSize == -1 || (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height)) == -1)) {
                maxInputSize = Math.min((int) (((float) maxInputSize) * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new CodecMaxValues(i, i2, maxInputSize);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (mediaCodecInfo.isSeamlessAdaptationSupported(format, format2, false)) {
                z |= format2.width == -1 || format2.height == -1;
                i = Math.max(i, format2.width);
                i2 = Math.max(i2, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Resolutions unknown. Codec max resolution: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            Log.w(TAG, sb.toString());
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i = Math.max(i, codecMaxSize.x);
                i2 = Math.max(i2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.sampleMimeType, i, i2));
                StringBuilder sb2 = new StringBuilder("Codec max resolution adjusted to: ");
                sb2.append(i);
                sb2.append("x");
                sb2.append(i2);
                Log.w(TAG, sb2.toString());
            }
        }
        return new CodecMaxValues(i, i2, maxInputSize);
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z = format.height > format.width;
        int i = z ? format.height : format.width;
        int i2 = z ? format.width : format.height;
        float f = ((float) i2) / ((float) i);
        for (int i3 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i5, i3);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, (double) format.frameRate)) {
                    return alignVideoSizeV21;
                }
            } else {
                int ceilDivide = Util.ceilDivide(i3, 16) * 16;
                int ceilDivide2 = Util.ceilDivide(i4, 16) * 16;
                if (ceilDivide * ceilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                    int i6 = z ? ceilDivide2 : ceilDivide;
                    if (!z) {
                        ceilDivide = ceilDivide2;
                    }
                    return new Point(i6, ceilDivide);
                }
            }
        }
        return null;
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height);
        }
        int size = format.initializationData.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.initializationData.get(i2).length;
        }
        return format.maxInputSize + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCodecMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = -1
            if (r9 == r0) goto L_0x00af
            if (r10 != r0) goto L_0x0007
            goto L_0x00af
        L_0x0007:
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x004b;
                case -1662541442: goto L_0x0040;
                case 1187890754: goto L_0x0035;
                case 1331836730: goto L_0x002a;
                case 1599127256: goto L_0x001f;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0056
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0056
            r8 = 5
            goto L_0x0057
        L_0x001f:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0056
            r8 = 3
            goto L_0x0057
        L_0x002a:
            java.lang.String r1 = "video/avc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0056
            r8 = 2
            goto L_0x0057
        L_0x0035:
            java.lang.String r1 = "video/mp4v-es"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0056
            r8 = 1
            goto L_0x0057
        L_0x0040:
            java.lang.String r1 = "video/hevc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0056
            r8 = 4
            goto L_0x0057
        L_0x004b:
            java.lang.String r1 = "video/3gpp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0056
            r8 = 0
            goto L_0x0057
        L_0x0056:
            r8 = -1
        L_0x0057:
            if (r8 == 0) goto L_0x00a6
            if (r8 == r3) goto L_0x00a6
            if (r8 == r6) goto L_0x0067
            if (r8 == r5) goto L_0x00a6
            if (r8 == r4) goto L_0x0064
            if (r8 == r2) goto L_0x0064
            return r0
        L_0x0064:
            int r9 = r9 * r10
            goto L_0x00a9
        L_0x0067:
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x00a5
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0094
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "KFSOWI"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x00a5
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTS"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0094
            boolean r7 = r7.secure
            if (r7 == 0) goto L_0x0094
            goto L_0x00a5
        L_0x0094:
            r7 = 16
            int r8 = com.google.android.exoplayer2.util.Util.ceilDivide((int) r9, (int) r7)
            int r9 = com.google.android.exoplayer2.util.Util.ceilDivide((int) r10, (int) r7)
            int r8 = r8 * r9
            int r8 = r8 * 16
            int r9 = r8 * 16
            goto L_0x00a8
        L_0x00a5:
            return r0
        L_0x00a6:
            int r9 = r9 * r10
        L_0x00a8:
            r4 = 2
        L_0x00a9:
            int r9 = r9 * 3
            int r4 = r4 * 2
            int r9 = r9 / r4
            return r9
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.getCodecMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo, java.lang.String, int, int):int");
    }

    private static boolean deviceNeedsAutoFrcWorkaround() {
        return Util.SDK_INT <= 22 && "foster".equals(Util.DEVICE) && "NVIDIA".equals(Util.MANUFACTURER);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x05a1, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05a2, code lost:
        switch(r1) {
            case 0: goto L_0x05a6;
            case 1: goto L_0x05a6;
            case 2: goto L_0x05a6;
            case 3: goto L_0x05a6;
            case 4: goto L_0x05a6;
            case 5: goto L_0x05a6;
            case 6: goto L_0x05a6;
            case 7: goto L_0x05a6;
            case 8: goto L_0x05a6;
            case 9: goto L_0x05a6;
            case 10: goto L_0x05a6;
            case 11: goto L_0x05a6;
            case 12: goto L_0x05a6;
            case 13: goto L_0x05a6;
            case 14: goto L_0x05a6;
            case 15: goto L_0x05a6;
            case 16: goto L_0x05a6;
            case 17: goto L_0x05a6;
            case 18: goto L_0x05a6;
            case 19: goto L_0x05a6;
            case 20: goto L_0x05a6;
            case 21: goto L_0x05a6;
            case 22: goto L_0x05a6;
            case 23: goto L_0x05a6;
            case 24: goto L_0x05a6;
            case 25: goto L_0x05a6;
            case 26: goto L_0x05a6;
            case 27: goto L_0x05a6;
            case 28: goto L_0x05a6;
            case 29: goto L_0x05a6;
            case 30: goto L_0x05a6;
            case 31: goto L_0x05a6;
            case 32: goto L_0x05a6;
            case 33: goto L_0x05a6;
            case 34: goto L_0x05a6;
            case 35: goto L_0x05a6;
            case 36: goto L_0x05a6;
            case 37: goto L_0x05a6;
            case 38: goto L_0x05a6;
            case 39: goto L_0x05a6;
            case 40: goto L_0x05a6;
            case 41: goto L_0x05a6;
            case 42: goto L_0x05a6;
            case 43: goto L_0x05a6;
            case 44: goto L_0x05a6;
            case 45: goto L_0x05a6;
            case 46: goto L_0x05a6;
            case 47: goto L_0x05a6;
            case 48: goto L_0x05a6;
            case 49: goto L_0x05a6;
            case 50: goto L_0x05a6;
            case 51: goto L_0x05a6;
            case 52: goto L_0x05a6;
            case 53: goto L_0x05a6;
            case 54: goto L_0x05a6;
            case 55: goto L_0x05a6;
            case 56: goto L_0x05a6;
            case 57: goto L_0x05a6;
            case 58: goto L_0x05a6;
            case 59: goto L_0x05a6;
            case 60: goto L_0x05a6;
            case 61: goto L_0x05a6;
            case 62: goto L_0x05a6;
            case 63: goto L_0x05a6;
            case 64: goto L_0x05a6;
            case 65: goto L_0x05a6;
            case 66: goto L_0x05a6;
            case 67: goto L_0x05a6;
            case 68: goto L_0x05a6;
            case 69: goto L_0x05a6;
            case 70: goto L_0x05a6;
            case 71: goto L_0x05a6;
            case 72: goto L_0x05a6;
            case 73: goto L_0x05a6;
            case 74: goto L_0x05a6;
            case 75: goto L_0x05a6;
            case 76: goto L_0x05a6;
            case 77: goto L_0x05a6;
            case 78: goto L_0x05a6;
            case 79: goto L_0x05a6;
            case 80: goto L_0x05a6;
            case 81: goto L_0x05a6;
            case 82: goto L_0x05a6;
            case 83: goto L_0x05a6;
            case 84: goto L_0x05a6;
            case 85: goto L_0x05a6;
            case 86: goto L_0x05a6;
            case 87: goto L_0x05a6;
            case 88: goto L_0x05a6;
            case 89: goto L_0x05a6;
            case 90: goto L_0x05a6;
            case 91: goto L_0x05a6;
            case 92: goto L_0x05a6;
            case 93: goto L_0x05a6;
            case 94: goto L_0x05a6;
            case 95: goto L_0x05a6;
            case 96: goto L_0x05a6;
            case 97: goto L_0x05a6;
            case 98: goto L_0x05a6;
            case 99: goto L_0x05a6;
            case 100: goto L_0x05a6;
            case 101: goto L_0x05a6;
            case 102: goto L_0x05a6;
            case 103: goto L_0x05a6;
            case 104: goto L_0x05a6;
            case 105: goto L_0x05a6;
            case 106: goto L_0x05a6;
            case 107: goto L_0x05a6;
            case 108: goto L_0x05a6;
            case 109: goto L_0x05a6;
            case 110: goto L_0x05a6;
            case 111: goto L_0x05a6;
            case 112: goto L_0x05a6;
            case 113: goto L_0x05a6;
            case 114: goto L_0x05a6;
            case 115: goto L_0x05a6;
            case 116: goto L_0x05a6;
            case 117: goto L_0x05a6;
            default: goto L_0x05a5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05a6, code lost:
        deviceNeedsSetOutputSurfaceWorkaround = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05a8, code lost:
        r0 = com.google.android.exoplayer2.util.Util.MODEL;
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x05b1, code lost:
        if (r1 == 2006354) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x05b6, code lost:
        if (r1 == 2006367) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x05bf, code lost:
        if (r0.equals("AFTN") == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05c1, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x05c9, code lost:
        if (r0.equals("AFTA") == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x05cc, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x05cd, code lost:
        if (r2 == 0) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x05cf, code lost:
        if (r2 == 1) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x05d2, code lost:
        deviceNeedsSetOutputSurfaceWorkaround = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x05d4, code lost:
        evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 27
            r2 = 0
            if (r0 >= r1) goto L_0x05dd
            java.lang.String r0 = "OMX.google"
            boolean r7 = r7.startsWith(r0)
            if (r7 == 0) goto L_0x0011
            goto L_0x05dd
        L_0x0011:
            java.lang.Class<com.google.android.exoplayer2.video.MediaCodecVideoRenderer> r7 = com.google.android.exoplayer2.video.MediaCodecVideoRenderer.class
            monitor-enter(r7)
            boolean r0 = evaluatedDeviceNeedsSetOutputSurfaceWorkaround     // Catch:{ all -> 0x05da }
            if (r0 != 0) goto L_0x05d6
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE     // Catch:{ all -> 0x05da }
            int r3 = r0.hashCode()     // Catch:{ all -> 0x05da }
            r4 = -1
            r5 = 1
            switch(r3) {
                case -2144781245: goto L_0x0596;
                case -2144781185: goto L_0x058b;
                case -2144781160: goto L_0x0580;
                case -2097309513: goto L_0x0575;
                case -2022874474: goto L_0x056a;
                case -1978993182: goto L_0x055f;
                case -1978990237: goto L_0x0554;
                case -1936688988: goto L_0x0549;
                case -1936688066: goto L_0x053e;
                case -1936688065: goto L_0x0532;
                case -1931988508: goto L_0x0526;
                case -1696512866: goto L_0x051a;
                case -1680025915: goto L_0x050e;
                case -1615810839: goto L_0x0502;
                case -1554255044: goto L_0x04f5;
                case -1481772737: goto L_0x04e9;
                case -1481772730: goto L_0x04dd;
                case -1481772729: goto L_0x04d1;
                case -1320080169: goto L_0x04c5;
                case -1217592143: goto L_0x04b9;
                case -1180384755: goto L_0x04ad;
                case -1139198265: goto L_0x04a1;
                case -1052835013: goto L_0x0495;
                case -993250464: goto L_0x048a;
                case -965403638: goto L_0x047e;
                case -958336948: goto L_0x0472;
                case -879245230: goto L_0x0465;
                case -842500323: goto L_0x0459;
                case -821392978: goto L_0x044e;
                case -797483286: goto L_0x0442;
                case -794946968: goto L_0x0435;
                case -788334647: goto L_0x0428;
                case -782144577: goto L_0x041c;
                case -575125681: goto L_0x0410;
                case -521118391: goto L_0x0404;
                case -430914369: goto L_0x03f8;
                case -290434366: goto L_0x03eb;
                case -282781963: goto L_0x03df;
                case -277133239: goto L_0x03d3;
                case -173639913: goto L_0x03c7;
                case -56598463: goto L_0x03ba;
                case 2126: goto L_0x03ae;
                case 2564: goto L_0x03a2;
                case 2715: goto L_0x0396;
                case 2719: goto L_0x038a;
                case 3483: goto L_0x037e;
                case 73405: goto L_0x0372;
                case 75739: goto L_0x0366;
                case 76779: goto L_0x035a;
                case 78669: goto L_0x034e;
                case 79305: goto L_0x0342;
                case 80618: goto L_0x0336;
                case 88274: goto L_0x032a;
                case 98846: goto L_0x031e;
                case 98848: goto L_0x0312;
                case 99329: goto L_0x0306;
                case 101481: goto L_0x02fa;
                case 1513190: goto L_0x02ef;
                case 1514184: goto L_0x02e4;
                case 1514185: goto L_0x02d9;
                case 2436959: goto L_0x02cd;
                case 2463773: goto L_0x02c1;
                case 2464648: goto L_0x02b5;
                case 2689555: goto L_0x02a9;
                case 3351335: goto L_0x029d;
                case 3386211: goto L_0x0291;
                case 41325051: goto L_0x0285;
                case 55178625: goto L_0x0279;
                case 61542055: goto L_0x026e;
                case 65355429: goto L_0x0262;
                case 66214468: goto L_0x0256;
                case 66214470: goto L_0x024a;
                case 66214473: goto L_0x023e;
                case 66215429: goto L_0x0232;
                case 66215431: goto L_0x0226;
                case 66215433: goto L_0x021a;
                case 66216390: goto L_0x020e;
                case 76402249: goto L_0x0202;
                case 76404105: goto L_0x01f6;
                case 76404911: goto L_0x01ea;
                case 80963634: goto L_0x01de;
                case 82882791: goto L_0x01d2;
                case 102844228: goto L_0x01c6;
                case 165221241: goto L_0x01bb;
                case 182191441: goto L_0x01af;
                case 245388979: goto L_0x01a3;
                case 287431619: goto L_0x0197;
                case 307593612: goto L_0x018b;
                case 308517133: goto L_0x017f;
                case 316215098: goto L_0x0173;
                case 316215116: goto L_0x0167;
                case 316246811: goto L_0x015b;
                case 316246818: goto L_0x014f;
                case 407160593: goto L_0x0143;
                case 507412548: goto L_0x0137;
                case 793982701: goto L_0x012b;
                case 794038622: goto L_0x011f;
                case 794040393: goto L_0x0113;
                case 835649806: goto L_0x0107;
                case 917340916: goto L_0x00fc;
                case 958008161: goto L_0x00f0;
                case 1060579533: goto L_0x00e4;
                case 1150207623: goto L_0x00d8;
                case 1176899427: goto L_0x00cc;
                case 1280332038: goto L_0x00c0;
                case 1306947716: goto L_0x00b6;
                case 1349174697: goto L_0x00aa;
                case 1522194893: goto L_0x009d;
                case 1691543273: goto L_0x0091;
                case 1709443163: goto L_0x0085;
                case 1865889110: goto L_0x0079;
                case 1906253259: goto L_0x006d;
                case 1977196784: goto L_0x0061;
                case 2029784656: goto L_0x0055;
                case 2030379515: goto L_0x0049;
                case 2047190025: goto L_0x003d;
                case 2047252157: goto L_0x0031;
                case 2048319463: goto L_0x0025;
                default: goto L_0x0023;
            }     // Catch:{ all -> 0x05da }
        L_0x0023:
            goto L_0x05a1
        L_0x0025:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 50
            goto L_0x05a2
        L_0x0031:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 25
            goto L_0x05a2
        L_0x003d:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 24
            goto L_0x05a2
        L_0x0049:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 49
            goto L_0x05a2
        L_0x0055:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 48
            goto L_0x05a2
        L_0x0061:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 52
            goto L_0x05a2
        L_0x006d:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 79
            goto L_0x05a2
        L_0x0079:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 95
            goto L_0x05a2
        L_0x0085:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 51
            goto L_0x05a2
        L_0x0091:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 17
            goto L_0x05a2
        L_0x009d:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x05a2
        L_0x00aa:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 46
            goto L_0x05a2
        L_0x00b6:
            java.lang.String r3 = "EverStar_S"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            goto L_0x05a2
        L_0x00c0:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 47
            goto L_0x05a2
        L_0x00cc:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 54
            goto L_0x05a2
        L_0x00d8:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 59
            goto L_0x05a2
        L_0x00e4:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 75
            goto L_0x05a2
        L_0x00f0:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 55
            goto L_0x05a2
        L_0x00fc:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 7
            goto L_0x05a2
        L_0x0107:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 61
            goto L_0x05a2
        L_0x0113:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 44
            goto L_0x05a2
        L_0x011f:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 43
            goto L_0x05a2
        L_0x012b:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 42
            goto L_0x05a2
        L_0x0137:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 93
            goto L_0x05a2
        L_0x0143:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 85
            goto L_0x05a2
        L_0x014f:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x05a2
        L_0x015b:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x05a2
        L_0x0167:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x05a2
        L_0x0173:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 100
            goto L_0x05a2
        L_0x017f:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 9
            goto L_0x05a2
        L_0x018b:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 8
            goto L_0x05a2
        L_0x0197:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 45
            goto L_0x05a2
        L_0x01a3:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 62
            goto L_0x05a2
        L_0x01af:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 18
            goto L_0x05a2
        L_0x01bb:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 5
            goto L_0x05a2
        L_0x01c6:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 58
            goto L_0x05a2
        L_0x01d2:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x05a2
        L_0x01de:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x05a2
        L_0x01ea:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 91
            goto L_0x05a2
        L_0x01f6:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 89
            goto L_0x05a2
        L_0x0202:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 87
            goto L_0x05a2
        L_0x020e:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 34
            goto L_0x05a2
        L_0x021a:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 33
            goto L_0x05a2
        L_0x0226:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 32
            goto L_0x05a2
        L_0x0232:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 31
            goto L_0x05a2
        L_0x023e:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 30
            goto L_0x05a2
        L_0x024a:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 29
            goto L_0x05a2
        L_0x0256:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 28
            goto L_0x05a2
        L_0x0262:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 22
            goto L_0x05a2
        L_0x026e:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 4
            goto L_0x05a2
        L_0x0279:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 11
            goto L_0x05a2
        L_0x0285:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 63
            goto L_0x05a2
        L_0x0291:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 72
            goto L_0x05a2
        L_0x029d:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 65
            goto L_0x05a2
        L_0x02a9:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x05a2
        L_0x02b5:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 90
            goto L_0x05a2
        L_0x02c1:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 88
            goto L_0x05a2
        L_0x02cd:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 73
            goto L_0x05a2
        L_0x02d9:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 2
            goto L_0x05a2
        L_0x02e4:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 1
            goto L_0x05a2
        L_0x02ef:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 0
            goto L_0x05a2
        L_0x02fa:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 35
            goto L_0x05a2
        L_0x0306:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 21
            goto L_0x05a2
        L_0x0312:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 20
            goto L_0x05a2
        L_0x031e:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 19
            goto L_0x05a2
        L_0x032a:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x05a2
        L_0x0336:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 94
            goto L_0x05a2
        L_0x0342:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 86
            goto L_0x05a2
        L_0x034e:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 74
            goto L_0x05a2
        L_0x035a:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 66
            goto L_0x05a2
        L_0x0366:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 60
            goto L_0x05a2
        L_0x0372:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 56
            goto L_0x05a2
        L_0x037e:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 64
            goto L_0x05a2
        L_0x038a:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x05a2
        L_0x0396:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x05a2
        L_0x03a2:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 92
            goto L_0x05a2
        L_0x03ae:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 14
            goto L_0x05a2
        L_0x03ba:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x05a2
        L_0x03c7:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 23
            goto L_0x05a2
        L_0x03d3:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x05a2
        L_0x03df:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 12
            goto L_0x05a2
        L_0x03eb:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 99
            goto L_0x05a2
        L_0x03f8:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 84
            goto L_0x05a2
        L_0x0404:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 38
            goto L_0x05a2
        L_0x0410:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 36
            goto L_0x05a2
        L_0x041c:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 71
            goto L_0x05a2
        L_0x0428:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x05a2
        L_0x0435:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x05a2
        L_0x0442:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 97
            goto L_0x05a2
        L_0x044e:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 6
            goto L_0x05a2
        L_0x0459:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 68
            goto L_0x05a2
        L_0x0465:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x05a2
        L_0x0472:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 26
            goto L_0x05a2
        L_0x047e:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 98
            goto L_0x05a2
        L_0x048a:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 3
            goto L_0x05a2
        L_0x0495:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 67
            goto L_0x05a2
        L_0x04a1:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 96
            goto L_0x05a2
        L_0x04ad:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 53
            goto L_0x05a2
        L_0x04b9:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 13
            goto L_0x05a2
        L_0x04c5:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 37
            goto L_0x05a2
        L_0x04d1:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 78
            goto L_0x05a2
        L_0x04dd:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 77
            goto L_0x05a2
        L_0x04e9:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 76
            goto L_0x05a2
        L_0x04f5:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x05a2
        L_0x0502:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 83
            goto L_0x05a2
        L_0x050e:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 15
            goto L_0x05a2
        L_0x051a:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x05a2
        L_0x0526:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 10
            goto L_0x05a2
        L_0x0532:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 82
            goto L_0x05a2
        L_0x053e:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 81
            goto L_0x05a2
        L_0x0549:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 80
            goto L_0x05a2
        L_0x0554:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 70
            goto L_0x05a2
        L_0x055f:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 69
            goto L_0x05a2
        L_0x056a:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 16
            goto L_0x05a2
        L_0x0575:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 57
            goto L_0x05a2
        L_0x0580:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 41
            goto L_0x05a2
        L_0x058b:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 40
            goto L_0x05a2
        L_0x0596:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05a1
            r1 = 39
            goto L_0x05a2
        L_0x05a1:
            r1 = -1
        L_0x05a2:
            switch(r1) {
                case 0: goto L_0x05a6;
                case 1: goto L_0x05a6;
                case 2: goto L_0x05a6;
                case 3: goto L_0x05a6;
                case 4: goto L_0x05a6;
                case 5: goto L_0x05a6;
                case 6: goto L_0x05a6;
                case 7: goto L_0x05a6;
                case 8: goto L_0x05a6;
                case 9: goto L_0x05a6;
                case 10: goto L_0x05a6;
                case 11: goto L_0x05a6;
                case 12: goto L_0x05a6;
                case 13: goto L_0x05a6;
                case 14: goto L_0x05a6;
                case 15: goto L_0x05a6;
                case 16: goto L_0x05a6;
                case 17: goto L_0x05a6;
                case 18: goto L_0x05a6;
                case 19: goto L_0x05a6;
                case 20: goto L_0x05a6;
                case 21: goto L_0x05a6;
                case 22: goto L_0x05a6;
                case 23: goto L_0x05a6;
                case 24: goto L_0x05a6;
                case 25: goto L_0x05a6;
                case 26: goto L_0x05a6;
                case 27: goto L_0x05a6;
                case 28: goto L_0x05a6;
                case 29: goto L_0x05a6;
                case 30: goto L_0x05a6;
                case 31: goto L_0x05a6;
                case 32: goto L_0x05a6;
                case 33: goto L_0x05a6;
                case 34: goto L_0x05a6;
                case 35: goto L_0x05a6;
                case 36: goto L_0x05a6;
                case 37: goto L_0x05a6;
                case 38: goto L_0x05a6;
                case 39: goto L_0x05a6;
                case 40: goto L_0x05a6;
                case 41: goto L_0x05a6;
                case 42: goto L_0x05a6;
                case 43: goto L_0x05a6;
                case 44: goto L_0x05a6;
                case 45: goto L_0x05a6;
                case 46: goto L_0x05a6;
                case 47: goto L_0x05a6;
                case 48: goto L_0x05a6;
                case 49: goto L_0x05a6;
                case 50: goto L_0x05a6;
                case 51: goto L_0x05a6;
                case 52: goto L_0x05a6;
                case 53: goto L_0x05a6;
                case 54: goto L_0x05a6;
                case 55: goto L_0x05a6;
                case 56: goto L_0x05a6;
                case 57: goto L_0x05a6;
                case 58: goto L_0x05a6;
                case 59: goto L_0x05a6;
                case 60: goto L_0x05a6;
                case 61: goto L_0x05a6;
                case 62: goto L_0x05a6;
                case 63: goto L_0x05a6;
                case 64: goto L_0x05a6;
                case 65: goto L_0x05a6;
                case 66: goto L_0x05a6;
                case 67: goto L_0x05a6;
                case 68: goto L_0x05a6;
                case 69: goto L_0x05a6;
                case 70: goto L_0x05a6;
                case 71: goto L_0x05a6;
                case 72: goto L_0x05a6;
                case 73: goto L_0x05a6;
                case 74: goto L_0x05a6;
                case 75: goto L_0x05a6;
                case 76: goto L_0x05a6;
                case 77: goto L_0x05a6;
                case 78: goto L_0x05a6;
                case 79: goto L_0x05a6;
                case 80: goto L_0x05a6;
                case 81: goto L_0x05a6;
                case 82: goto L_0x05a6;
                case 83: goto L_0x05a6;
                case 84: goto L_0x05a6;
                case 85: goto L_0x05a6;
                case 86: goto L_0x05a6;
                case 87: goto L_0x05a6;
                case 88: goto L_0x05a6;
                case 89: goto L_0x05a6;
                case 90: goto L_0x05a6;
                case 91: goto L_0x05a6;
                case 92: goto L_0x05a6;
                case 93: goto L_0x05a6;
                case 94: goto L_0x05a6;
                case 95: goto L_0x05a6;
                case 96: goto L_0x05a6;
                case 97: goto L_0x05a6;
                case 98: goto L_0x05a6;
                case 99: goto L_0x05a6;
                case 100: goto L_0x05a6;
                case 101: goto L_0x05a6;
                case 102: goto L_0x05a6;
                case 103: goto L_0x05a6;
                case 104: goto L_0x05a6;
                case 105: goto L_0x05a6;
                case 106: goto L_0x05a6;
                case 107: goto L_0x05a6;
                case 108: goto L_0x05a6;
                case 109: goto L_0x05a6;
                case 110: goto L_0x05a6;
                case 111: goto L_0x05a6;
                case 112: goto L_0x05a6;
                case 113: goto L_0x05a6;
                case 114: goto L_0x05a6;
                case 115: goto L_0x05a6;
                case 116: goto L_0x05a6;
                case 117: goto L_0x05a6;
                default: goto L_0x05a5;
            }     // Catch:{ all -> 0x05da }
        L_0x05a5:
            goto L_0x05a8
        L_0x05a6:
            deviceNeedsSetOutputSurfaceWorkaround = r5     // Catch:{ all -> 0x05da }
        L_0x05a8:
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL     // Catch:{ all -> 0x05da }
            int r1 = r0.hashCode()     // Catch:{ all -> 0x05da }
            r3 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r1 == r3) goto L_0x05c3
            r2 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r1 == r2) goto L_0x05b9
            goto L_0x05cc
        L_0x05b9:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05cc
            r2 = 1
            goto L_0x05cd
        L_0x05c3:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05cc
            goto L_0x05cd
        L_0x05cc:
            r2 = -1
        L_0x05cd:
            if (r2 == 0) goto L_0x05d2
            if (r2 == r5) goto L_0x05d2
            goto L_0x05d4
        L_0x05d2:
            deviceNeedsSetOutputSurfaceWorkaround = r5     // Catch:{ all -> 0x05da }
        L_0x05d4:
            evaluatedDeviceNeedsSetOutputSurfaceWorkaround = r5     // Catch:{ all -> 0x05da }
        L_0x05d6:
            monitor-exit(r7)     // Catch:{ all -> 0x05da }
            boolean r7 = deviceNeedsSetOutputSurfaceWorkaround
            return r7
        L_0x05da:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x05dd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.codecNeedsSetOutputSurfaceWorkaround(java.lang.String):boolean");
    }

    protected static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.inputSize = i3;
        }
    }

    @TargetApi(23)
    final class OnFrameRenderedListenerV23 implements MediaCodec.OnFrameRenderedListener {
        private OnFrameRenderedListenerV23(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
            if (this == MediaCodecVideoRenderer.this.tunnelingOnFrameRenderedListener) {
                MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j);
            }
        }
    }
}
