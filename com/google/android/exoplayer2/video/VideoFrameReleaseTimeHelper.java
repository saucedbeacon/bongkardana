package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.messaging.Constants;

@TargetApi(16)
public final class VideoFrameReleaseTimeHelper {
    private static final long CHOREOGRAPHER_SAMPLE_DELAY_MILLIS = 500;
    private static final long MAX_ALLOWED_DRIFT_NS = 20000000;
    private static final int MIN_FRAMES_FOR_ADJUSTMENT = 6;
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private long adjustedLastFrameTimeNs;
    private final DefaultDisplayListener displayListener;
    private long frameCount;
    private boolean haveSync;
    private long lastFramePresentationTimeUs;
    private long pendingAdjustedFrameTimeNs;
    private long syncFramePresentationTimeNs;
    private long syncUnadjustedReleaseTimeNs;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    private final VSyncSampler vsyncSampler;
    private final WindowManager windowManager;

    public VideoFrameReleaseTimeHelper() {
        this((Context) null);
    }

    public VideoFrameReleaseTimeHelper(@Nullable Context context) {
        DefaultDisplayListener defaultDisplayListener = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.windowManager = (WindowManager) context.getSystemService("window");
        } else {
            this.windowManager = null;
        }
        if (this.windowManager != null) {
            this.displayListener = Util.SDK_INT >= 17 ? maybeBuildDefaultDisplayListenerV17(context) : defaultDisplayListener;
            this.vsyncSampler = VSyncSampler.getInstance();
        } else {
            this.displayListener = null;
            this.vsyncSampler = null;
        }
        this.vsyncDurationNs = C.TIME_UNSET;
        this.vsyncOffsetNs = C.TIME_UNSET;
    }

    public final void enable() {
        this.haveSync = false;
        if (this.windowManager != null) {
            this.vsyncSampler.addObserver();
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.register();
            }
            updateDefaultDisplayRefreshRateParams();
        }
    }

    public final void disable() {
        if (this.windowManager != null) {
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.unregister();
            }
            this.vsyncSampler.removeObserver();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long adjustReleaseTime(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.haveSync
            if (r2 == 0) goto L_0x0042
            long r2 = r10.lastFramePresentationTimeUs
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.frameCount
            r4 = 1
            long r2 = r2 + r4
            r10.frameCount = r2
            long r2 = r10.pendingAdjustedFrameTimeNs
            r10.adjustedLastFrameTimeNs = r2
        L_0x0019:
            long r2 = r10.frameCount
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.syncFramePresentationTimeNs
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.adjustedLastFrameTimeNs
            long r2 = r2 + r4
            boolean r4 = r10.isDriftTooLarge(r2, r13)
            if (r4 == 0) goto L_0x0033
            r10.haveSync = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r10.syncUnadjustedReleaseTimeNs
            long r4 = r4 + r2
            long r6 = r10.syncFramePresentationTimeNs
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r10.isDriftTooLarge(r0, r13)
            if (r2 == 0) goto L_0x0042
            r10.haveSync = r6
        L_0x0042:
            r4 = r13
            r2 = r0
        L_0x0044:
            boolean r6 = r10.haveSync
            if (r6 != 0) goto L_0x0053
            r10.syncFramePresentationTimeNs = r0
            r10.syncUnadjustedReleaseTimeNs = r13
            r13 = 0
            r10.frameCount = r13
            r13 = 1
            r10.haveSync = r13
        L_0x0053:
            r10.lastFramePresentationTimeUs = r11
            r10.pendingAdjustedFrameTimeNs = r2
            com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper$VSyncSampler r11 = r10.vsyncSampler
            if (r11 == 0) goto L_0x0078
            long r12 = r10.vsyncDurationNs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            long r6 = r11.sampledVsyncTimeNs
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006e
            return r4
        L_0x006e:
            long r8 = r10.vsyncDurationNs
            long r11 = closestVsync(r4, r6, r8)
            long r13 = r10.vsyncOffsetNs
            long r11 = r11 - r13
            return r11
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper.adjustReleaseTime(long, long):long");
    }

    @TargetApi(17)
    private DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager == null) {
            return null;
        }
        return new DefaultDisplayListener(displayManager);
    }

    /* access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams() {
        Display defaultDisplay = this.windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.vsyncDurationNs = j;
            this.vsyncOffsetNs = (j * VSYNC_OFFSET_PERCENTAGE) / 100;
        }
    }

    private boolean isDriftTooLarge(long j, long j2) {
        return Math.abs((j2 - this.syncUnadjustedReleaseTimeNs) - (j - this.syncFramePresentationTimeNs)) > MAX_ALLOWED_DRIFT_NS;
    }

    private static long closestVsync(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @TargetApi(17)
    final class DefaultDisplayListener implements DisplayManager.DisplayListener {
        private final DisplayManager displayManager;

        public final void onDisplayAdded(int i) {
        }

        public final void onDisplayRemoved(int i) {
        }

        public DefaultDisplayListener(DisplayManager displayManager2) {
            this.displayManager = displayManager2;
        }

        public final void register() {
            this.displayManager.registerDisplayListener(this, (Handler) null);
        }

        public final void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        public final void onDisplayChanged(int i) {
            if (i == 0) {
                VideoFrameReleaseTimeHelper.this.updateDefaultDisplayRefreshRateParams();
            }
        }
    }

    static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final VSyncSampler INSTANCE = new VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = C.TIME_UNSET;

        public static VSyncSampler getInstance() {
            return INSTANCE;
        }

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            Handler createHandler = Util.createHandler(this.choreographerOwnerThread.getLooper(), this);
            this.handler = createHandler;
            createHandler.sendEmptyMessage(0);
        }

        public final void addObserver() {
            this.handler.sendEmptyMessage(1);
        }

        public final void removeObserver() {
            this.handler.sendEmptyMessage(2);
        }

        public final void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            this.choreographer.postFrameCallbackDelayed(this, VideoFrameReleaseTimeHelper.CHOREOGRAPHER_SAMPLE_DELAY_MILLIS);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                createChoreographerInstanceInternal();
                return true;
            } else if (i == 1) {
                addObserverInternal();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                removeObserverInternal();
                return true;
            }
        }

        private void createChoreographerInstanceInternal() {
            this.choreographer = Choreographer.getInstance();
        }

        private void addObserverInternal() {
            int i = this.observerCount + 1;
            this.observerCount = i;
            if (i == 1) {
                this.choreographer.postFrameCallback(this);
            }
        }

        private void removeObserverInternal() {
            int i = this.observerCount - 1;
            this.observerCount = i;
            if (i == 0) {
                this.choreographer.removeFrameCallback(this);
                this.sampledVsyncTimeNs = C.TIME_UNSET;
            }
        }
    }
}
