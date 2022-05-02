package o;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.CheckResult;
import o.ComponentActivity;

public class AnimRes extends BoolRes {
    static int onExtrasChanged;
    public IntentSenderRequest[] IMediaControllerCallback = new IntentSenderRequest[4];
    private WeakReference<ConstraintAnchor> IMediaControllerCallback$Stub = null;
    private WeakReference<ConstraintAnchor> IMediaControllerCallback$Stub$Proxy = null;
    private WeakReference<ConstraintAnchor> IMediaSession = null;
    public int MediaBrowserCompat$ItemReceiver;
    protected reportFullyDrawn MediaBrowserCompat$MediaItem = new reportFullyDrawn();
    public ComponentActivity.AnonymousClass5 MediaBrowserCompat$SearchResultReceiver;
    public int MediaMetadataCompat = 0;
    public int MediaMetadataCompat$BitmapKey = 0;
    int MediaMetadataCompat$LongKey;
    int MediaMetadataCompat$RatingKey;
    public int MediaMetadataCompat$TextKey;
    public IntentSenderRequest[] RatingCompat = new IntentSenderRequest[4];
    public boolean RatingCompat$StarStyle = false;
    public boolean RatingCompat$Style = false;
    protected CheckResult.getMax getMin = null;
    public CheckResult length = new CheckResult(this);
    public CheckResult.setMax onCaptioningEnabledChanged = new CheckResult.setMax();
    public boolean onEvent = false;
    public int onMetadataChanged = 0;
    public int onPlaybackStateChanged = 257;
    public boolean onQueueChanged = false;
    int onQueueTitleChanged = 0;
    private boolean onRepeatModeChanged = false;
    public int onSessionDestroyed = 0;
    private WeakReference<ConstraintAnchor> onSessionReady = null;
    private boolean onShuffleModeChangedRemoved = false;
    public suggest setMax = new suggest(this);
    public boolean setMin = false;

    private boolean setMax(boolean z) {
        return this.setMax.getMin(z);
    }

    private boolean onTransact() {
        return this.setMax.getMax();
    }

    private boolean setMax(boolean z, int i) {
        return this.setMax.length(z, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x01fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long getMax(int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = r27
            r0.MediaBrowserCompat$ItemReceiver = r4
            r4 = r28
            r0.MediaMetadataCompat$TextKey = r4
            o.CheckResult r4 = r0.length
            o.CheckResult$getMax r5 = r0.getMin
            java.util.ArrayList r6 = r0.onVolumeInfoChanged
            int r6 = r6.size()
            int r7 = r0.areNotificationsEnabled
            r8 = 8
            r9 = 0
            if (r7 != r8) goto L_0x0023
            r7 = 0
            goto L_0x0025
        L_0x0023:
            int r7 = r0.requestPostMessageChannelWithExtras
        L_0x0025:
            int r10 = r0.areNotificationsEnabled
            if (r10 != r8) goto L_0x002b
            r10 = 0
            goto L_0x002d
        L_0x002b:
            int r10 = r0.postMessage
        L_0x002d:
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = o.ArrayRes.setMin(r1, r11)
            r12 = 64
            r13 = 1
            if (r11 != 0) goto L_0x0041
            boolean r1 = o.ArrayRes.setMin(r1, r12)
            if (r1 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r1 = 0
            goto L_0x0042
        L_0x0041:
            r1 = 1
        L_0x0042:
            r14 = 0
            if (r1 == 0) goto L_0x00a1
            r15 = 0
        L_0x0046:
            if (r15 >= r6) goto L_0x00a1
            java.util.ArrayList r12 = r0.onVolumeInfoChanged
            java.lang.Object r12 = r12.get(r15)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r12
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r12.extraCommand
            r8 = r8[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x005a
            r8 = 1
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r12.extraCommand
            r9 = r9[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r13) goto L_0x0065
            r9 = 1
            goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            if (r8 == 0) goto L_0x0072
            if (r9 == 0) goto L_0x0072
            float r8 = r12.updateVisuals
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0072
            r8 = 1
            goto L_0x0073
        L_0x0072:
            r8 = 0
        L_0x0073:
            boolean r9 = r12.extraCallback()
            if (r9 == 0) goto L_0x007d
            if (r8 == 0) goto L_0x007d
        L_0x007b:
            r1 = 0
            goto L_0x00a1
        L_0x007d:
            boolean r9 = r12.onMessageChannelReady()
            if (r9 == 0) goto L_0x0086
            if (r8 == 0) goto L_0x0086
            goto L_0x007b
        L_0x0086:
            boolean r8 = r12 instanceof o.BinderThread
            if (r8 == 0) goto L_0x008b
            goto L_0x007b
        L_0x008b:
            boolean r8 = r12.extraCallback()
            if (r8 != 0) goto L_0x007b
            boolean r8 = r12.onMessageChannelReady()
            if (r8 == 0) goto L_0x0098
            goto L_0x007b
        L_0x0098:
            int r15 = r15 + 1
            r8 = 8
            r9 = 0
            r12 = 64
            r13 = 1
            goto L_0x0046
        L_0x00a1:
            r8 = 1
            if (r1 == 0) goto L_0x00b0
            o.ComponentActivity$5 r12 = o.reportFullyDrawn.values
            if (r12 == 0) goto L_0x00b0
            o.ComponentActivity$5 r12 = o.reportFullyDrawn.values
            long r14 = r12.setMax
            long r14 = r14 + r8
            r12.setMax = r14
        L_0x00b0:
            r12 = 1073741824(0x40000000, float:2.0)
            if (r2 != r12) goto L_0x00b6
            if (r3 == r12) goto L_0x00b8
        L_0x00b6:
            if (r11 == 0) goto L_0x00ba
        L_0x00b8:
            r13 = 1
            goto L_0x00bb
        L_0x00ba:
            r13 = 0
        L_0x00bb:
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0130
            int[] r14 = r0.onMessageChannelReady
            r15 = 0
            r14 = r14[r15]
            r15 = r24
            int r14 = java.lang.Math.min(r14, r15)
            int[] r15 = r0.onMessageChannelReady
            r8 = 1
            r9 = r15[r8]
            r15 = r26
            int r9 = java.lang.Math.min(r9, r15)
            if (r2 != r12) goto L_0x00e9
            int r15 = r0.areNotificationsEnabled
            r13 = 8
            if (r15 != r13) goto L_0x00de
            r13 = 0
            goto L_0x00e0
        L_0x00de:
            int r13 = r0.requestPostMessageChannelWithExtras
        L_0x00e0:
            if (r13 == r14) goto L_0x00e9
            r0.getMax((int) r14)
            o.suggest r13 = r0.setMax
            r13.getMax = r8
        L_0x00e9:
            if (r3 != r12) goto L_0x00ff
            int r8 = r0.areNotificationsEnabled
            r13 = 8
            if (r8 != r13) goto L_0x00f3
            r8 = 0
            goto L_0x00f5
        L_0x00f3:
            int r8 = r0.postMessage
        L_0x00f5:
            if (r8 == r9) goto L_0x00ff
            r0.toFloatRange(r9)
            o.suggest r8 = r0.setMax
            r9 = 1
            r8.getMax = r9
        L_0x00ff:
            if (r2 != r12) goto L_0x0109
            if (r3 != r12) goto L_0x0109
            boolean r8 = r0.setMax((boolean) r11)
            r9 = 2
            goto L_0x0120
        L_0x0109:
            boolean r8 = r21.onTransact()
            r9 = 0
            if (r2 != r12) goto L_0x0116
            boolean r13 = r0.setMax(r11, r9)
            r8 = r8 & r13
            r9 = 1
        L_0x0116:
            if (r3 != r12) goto L_0x0120
            r13 = 1
            boolean r11 = r0.setMax(r11, r13)
            r8 = r8 & r11
            int r9 = r9 + 1
        L_0x0120:
            if (r8 == 0) goto L_0x0132
            if (r2 != r12) goto L_0x0126
            r2 = 1
            goto L_0x0127
        L_0x0126:
            r2 = 0
        L_0x0127:
            if (r3 != r12) goto L_0x012b
            r3 = 1
            goto L_0x012c
        L_0x012b:
            r3 = 0
        L_0x012c:
            r0.getMax((boolean) r2, (boolean) r3)
            goto L_0x0132
        L_0x0130:
            r8 = 0
            r9 = 0
        L_0x0132:
            if (r8 == 0) goto L_0x0137
            r2 = 2
            if (r9 == r2) goto L_0x044c
        L_0x0137:
            int r2 = r0.onPlaybackStateChanged
            if (r6 <= 0) goto L_0x0204
            java.util.ArrayList r3 = r0.onVolumeInfoChanged
            int r3 = r3.size()
            r8 = 64
            boolean r8 = r0.FastBitmap$CoordinateSystem(r8)
            o.CheckResult$getMax r9 = r0.getMin
            r15 = 0
        L_0x014a:
            if (r15 >= r3) goto L_0x0201
            java.util.ArrayList r11 = r0.onVolumeInfoChanged
            java.lang.Object r11 = r11.get(r15)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof o.AnimatorRes
            if (r12 != 0) goto L_0x01f8
            boolean r12 = r11 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r12 != 0) goto L_0x01f8
            boolean r12 = r11.FastBitmap$CoordinateSystem()
            if (r12 != 0) goto L_0x01f8
            if (r8 == 0) goto L_0x017c
            o.DimenRes r12 = r11.toFloatRange
            if (r12 == 0) goto L_0x017c
            o.unit r12 = r11.equals
            if (r12 == 0) goto L_0x017c
            o.DimenRes r12 = r11.toFloatRange
            o.ColorInt r12 = r12.toFloatRange
            boolean r12 = r12.toFloatRange
            if (r12 == 0) goto L_0x017c
            o.unit r12 = r11.equals
            o.ColorInt r12 = r12.toFloatRange
            boolean r12 = r12.toFloatRange
            if (r12 != 0) goto L_0x01f8
        L_0x017c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r11.extraCommand
            r13 = 0
            r12 = r12[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r13 = r11.extraCommand
            r14 = 1
            r13 = r13[r14]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r14) goto L_0x019b
            int r14 = r11.Mean$Arithmetic
            r23 = r3
            r3 = 1
            if (r14 == r3) goto L_0x019e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x019e
            int r14 = r11.invoke
            if (r14 == r3) goto L_0x019e
            r14 = 1
            goto L_0x019f
        L_0x019b:
            r23 = r3
            r3 = 1
        L_0x019e:
            r14 = 0
        L_0x019f:
            if (r14 != 0) goto L_0x01da
            boolean r19 = r0.FastBitmap$CoordinateSystem(r3)
            if (r19 == 0) goto L_0x01da
            boolean r3 = r11 instanceof o.BinderThread
            if (r3 != 0) goto L_0x01da
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r3) goto L_0x01be
            int r3 = r11.Mean$Arithmetic
            if (r3 != 0) goto L_0x01be
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 == r3) goto L_0x01be
            boolean r3 = r11.extraCallback()
            if (r3 != 0) goto L_0x01be
            r14 = 1
        L_0x01be:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r3) goto L_0x01d1
            int r3 = r11.invoke
            if (r3 != 0) goto L_0x01d1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 == r3) goto L_0x01d1
            boolean r3 = r11.extraCallback()
            if (r3 != 0) goto L_0x01d1
            r14 = 1
        L_0x01d1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 == r3) goto L_0x01dc
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r3) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r12 = 0
            goto L_0x01e4
        L_0x01dc:
            float r3 = r11.updateVisuals
            r12 = 0
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x01e4
            r14 = 1
        L_0x01e4:
            if (r14 != 0) goto L_0x01fb
            int r3 = o.CheckResult.setMax.getMax
            r4.length(r9, r11, r3)
            o.ComponentActivity$5 r3 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r3 == 0) goto L_0x01fb
            long r13 = r3.getMax
            r16 = 1
            long r13 = r13 + r16
            r3.getMax = r13
            goto L_0x01fb
        L_0x01f8:
            r23 = r3
            r12 = 0
        L_0x01fb:
            int r15 = r15 + 1
            r3 = r23
            goto L_0x014a
        L_0x0201:
            r9.getMin()
        L_0x0204:
            r4.getMin(r0)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r4.getMin
            int r3 = r3.size()
            if (r6 <= 0) goto L_0x0212
            r4.setMin(r0, r7, r10)
        L_0x0212:
            if (r3 <= 0) goto L_0x0441
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r0.extraCommand
            r15 = 0
            r6 = r6[r15]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r8) goto L_0x021f
            r6 = 1
            goto L_0x0220
        L_0x021f:
            r6 = 0
        L_0x0220:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r0.extraCommand
            r9 = 1
            r8 = r8[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r9) goto L_0x022b
            r8 = 1
            goto L_0x022c
        L_0x022b:
            r8 = 0
        L_0x022c:
            int r9 = r0.areNotificationsEnabled
            r11 = 8
            if (r9 != r11) goto L_0x0234
            r9 = 0
            goto L_0x0236
        L_0x0234:
            int r9 = r0.requestPostMessageChannelWithExtras
        L_0x0236:
            o.AnimRes r12 = r4.setMax
            int r12 = r12.ICustomTabsCallback()
            int r9 = java.lang.Math.max(r9, r12)
            int r12 = r0.areNotificationsEnabled
            if (r12 != r11) goto L_0x0246
            r11 = 0
            goto L_0x0248
        L_0x0246:
            int r11 = r0.postMessage
        L_0x0248:
            o.AnimRes r12 = r4.setMax
            int r12 = r12.b()
            int r11 = java.lang.Math.max(r11, r12)
            r12 = 0
            r13 = 0
        L_0x0254:
            if (r12 >= r3) goto L_0x0301
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r14 = r4.getMin
            java.lang.Object r14 = r14.get(r12)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof o.BinderThread
            if (r15 == 0) goto L_0x02ee
            int r15 = r14.areNotificationsEnabled
            r19 = r2
            r2 = 8
            if (r15 != r2) goto L_0x026e
            r27 = r7
            r15 = 0
            goto L_0x0272
        L_0x026e:
            int r15 = r14.requestPostMessageChannelWithExtras
            r27 = r7
        L_0x0272:
            int r7 = r14.areNotificationsEnabled
            if (r7 != r2) goto L_0x0278
            r2 = 0
            goto L_0x027a
        L_0x0278:
            int r2 = r14.postMessage
        L_0x027a:
            int r7 = o.CheckResult.setMax.length
            boolean r7 = r4.length(r5, r14, r7)
            r7 = r7 | r13
            o.ComponentActivity$5 r13 = r0.MediaBrowserCompat$SearchResultReceiver
            r22 = r1
            if (r13 == 0) goto L_0x028f
            long r0 = r13.length
            r16 = 1
            long r0 = r0 + r16
            r13.length = r0
        L_0x028f:
            int r0 = r14.areNotificationsEnabled
            r1 = 8
            if (r0 != r1) goto L_0x0297
            r0 = 0
            goto L_0x0299
        L_0x0297:
            int r0 = r14.requestPostMessageChannelWithExtras
        L_0x0299:
            int r13 = r14.areNotificationsEnabled
            if (r13 != r1) goto L_0x029f
            r1 = 0
            goto L_0x02a1
        L_0x029f:
            int r1 = r14.postMessage
        L_0x02a1:
            if (r0 == r15) goto L_0x02c3
            r14.getMax((int) r0)
            if (r6 == 0) goto L_0x02c2
            int r0 = r14.create()
            if (r0 <= r9) goto L_0x02c2
            int r0 = r14.create()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r14.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r7)
            int r7 = r7.getMin()
            int r0 = r0 + r7
            int r0 = java.lang.Math.max(r9, r0)
            r9 = r0
        L_0x02c2:
            r7 = 1
        L_0x02c3:
            if (r1 == r2) goto L_0x02e5
            r14.toFloatRange(r1)
            if (r8 == 0) goto L_0x02e4
            int r0 = r14.getCause()
            if (r0 <= r11) goto L_0x02e4
            int r0 = r14.getCause()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r14.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r1)
            int r1 = r1.getMin()
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r11, r0)
            r11 = r0
        L_0x02e4:
            r7 = 1
        L_0x02e5:
            o.BinderThread r14 = (o.BinderThread) r14
            boolean r0 = r14.length()
            r0 = r0 | r7
            r13 = r0
            goto L_0x02f4
        L_0x02ee:
            r22 = r1
            r19 = r2
            r27 = r7
        L_0x02f4:
            int r12 = r12 + 1
            r0 = r21
            r1 = r22
            r7 = r27
            r2 = r19
            r15 = 0
            goto L_0x0254
        L_0x0301:
            r22 = r1
            r19 = r2
            r27 = r7
            r0 = 2
            r15 = 0
        L_0x0309:
            if (r15 >= r0) goto L_0x040d
            r1 = 0
        L_0x030c:
            if (r1 >= r3) goto L_0x03f3
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r4.getMin
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            boolean r7 = r2 instanceof o.AttrRes
            if (r7 == 0) goto L_0x031e
            boolean r7 = r2 instanceof o.BinderThread
            if (r7 == 0) goto L_0x03e2
        L_0x031e:
            boolean r7 = r2 instanceof o.AnimatorRes
            if (r7 != 0) goto L_0x03e2
            int r7 = r2.areNotificationsEnabled
            r12 = 8
            if (r7 == r12) goto L_0x03e2
            if (r22 == 0) goto L_0x033a
            o.DimenRes r7 = r2.toFloatRange
            o.ColorInt r7 = r7.toFloatRange
            boolean r7 = r7.toFloatRange
            if (r7 == 0) goto L_0x033a
            o.unit r7 = r2.equals
            o.ColorInt r7 = r7.toFloatRange
            boolean r7 = r7.toFloatRange
            if (r7 != 0) goto L_0x03e2
        L_0x033a:
            boolean r7 = r2 instanceof o.BinderThread
            if (r7 != 0) goto L_0x03e2
            int r7 = r2.areNotificationsEnabled
            r12 = 8
            if (r7 != r12) goto L_0x0346
            r7 = 0
            goto L_0x0348
        L_0x0346:
            int r7 = r2.requestPostMessageChannelWithExtras
        L_0x0348:
            int r14 = r2.areNotificationsEnabled
            if (r14 != r12) goto L_0x034e
            r12 = 0
            goto L_0x0350
        L_0x034e:
            int r12 = r2.postMessage
        L_0x0350:
            int r14 = r2.IPostMessageService$Stub
            int r18 = o.CheckResult.setMax.length
            r0 = 1
            if (r15 != r0) goto L_0x0359
            int r18 = o.CheckResult.setMax.setMin
        L_0x0359:
            r0 = r18
            boolean r0 = r4.length(r5, r2, r0)
            r0 = r0 | r13
            r13 = r21
            r24 = r0
            o.ComponentActivity$5 r0 = r13.MediaBrowserCompat$SearchResultReceiver
            r25 = r3
            r18 = r4
            if (r0 == 0) goto L_0x0375
            long r3 = r0.length
            r16 = 1
            long r3 = r3 + r16
            r0.length = r3
            goto L_0x0377
        L_0x0375:
            r16 = 1
        L_0x0377:
            int r0 = r2.areNotificationsEnabled
            r3 = 8
            if (r0 != r3) goto L_0x037f
            r0 = 0
            goto L_0x0381
        L_0x037f:
            int r0 = r2.requestPostMessageChannelWithExtras
        L_0x0381:
            int r4 = r2.areNotificationsEnabled
            if (r4 != r3) goto L_0x0387
            r3 = 0
            goto L_0x0389
        L_0x0387:
            int r3 = r2.postMessage
        L_0x0389:
            if (r0 == r7) goto L_0x03ab
            r2.getMax((int) r0)
            if (r6 == 0) goto L_0x03a9
            int r0 = r2.create()
            if (r0 <= r9) goto L_0x03a9
            int r0 = r2.create()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            int r4 = r4.getMin()
            int r0 = r0 + r4
            int r9 = java.lang.Math.max(r9, r0)
        L_0x03a9:
            r0 = 1
            goto L_0x03ad
        L_0x03ab:
            r0 = r24
        L_0x03ad:
            if (r3 == r12) goto L_0x03cf
            r2.toFloatRange(r3)
            if (r8 == 0) goto L_0x03ce
            int r0 = r2.getCause()
            if (r0 <= r11) goto L_0x03ce
            int r0 = r2.getCause()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r3)
            int r3 = r3.getMin()
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r11, r0)
            r11 = r0
        L_0x03ce:
            r0 = 1
        L_0x03cf:
            boolean r3 = r2.onRelationshipValidationResult()
            if (r3 == 0) goto L_0x03dc
            int r2 = r2.IPostMessageService$Stub
            if (r14 == r2) goto L_0x03dc
            r0 = r13
            r13 = 1
            goto L_0x03ea
        L_0x03dc:
            r20 = r13
            r13 = r0
            r0 = r20
            goto L_0x03ea
        L_0x03e2:
            r16 = 1
            r0 = r21
            r25 = r3
            r18 = r4
        L_0x03ea:
            int r1 = r1 + 1
            r3 = r25
            r4 = r18
            r0 = 2
            goto L_0x030c
        L_0x03f3:
            r16 = 1
            r0 = r21
            r25 = r3
            r18 = r4
            r7 = r27
            r1 = r18
            if (r13 == 0) goto L_0x0412
            r1.setMin(r0, r7, r10)
            int r15 = r15 + 1
            r3 = r25
            r4 = r1
            r0 = 2
            r13 = 0
            goto L_0x0309
        L_0x040d:
            r0 = r21
            r7 = r27
            r1 = r4
        L_0x0412:
            if (r13 == 0) goto L_0x043e
            r1.setMin(r0, r7, r10)
            int r2 = r0.areNotificationsEnabled
            r3 = 8
            if (r2 != r3) goto L_0x041f
            r15 = 0
            goto L_0x0421
        L_0x041f:
            int r15 = r0.requestPostMessageChannelWithExtras
        L_0x0421:
            if (r15 >= r9) goto L_0x0428
            r0.getMax((int) r9)
            r15 = 1
            goto L_0x0429
        L_0x0428:
            r15 = 0
        L_0x0429:
            int r2 = r0.areNotificationsEnabled
            if (r2 != r3) goto L_0x042f
            r9 = 0
            goto L_0x0431
        L_0x042f:
            int r9 = r0.postMessage
        L_0x0431:
            if (r9 >= r11) goto L_0x0438
            r0.toFloatRange(r11)
            r13 = 1
            goto L_0x0439
        L_0x0438:
            r13 = r15
        L_0x0439:
            if (r13 == 0) goto L_0x043e
            r1.setMin(r0, r7, r10)
        L_0x043e:
            r1 = r19
            goto L_0x0442
        L_0x0441:
            r1 = r2
        L_0x0442:
            r0.onPlaybackStateChanged = r1
            r1 = 512(0x200, float:7.175E-43)
            boolean r1 = r0.FastBitmap$CoordinateSystem(r1)
            o.reportFullyDrawn.setMax = r1
        L_0x044c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AnimRes.getMax(int, int, int, int, int, int, int):long");
    }

    public final void getMin(CheckResult.getMax getmax) {
        this.getMin = getmax;
        this.setMax.length = getmax;
    }

    public final CheckResult.getMax setMax() {
        return this.getMin;
    }

    public final boolean FastBitmap$CoordinateSystem(int i) {
        return (this.onPlaybackStateChanged & i) == i;
    }

    public final void valueOf() {
        this.MediaBrowserCompat$MediaItem.getMax();
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.MediaMetadataCompat$LongKey = 0;
        this.MediaMetadataCompat$TextKey = 0;
        this.MediaMetadataCompat$RatingKey = 0;
        this.onQueueChanged = false;
        super.valueOf();
    }

    public final boolean length() {
        return this.onShuffleModeChangedRemoved;
    }

    public final boolean isInside() {
        return this.onRepeatModeChanged;
    }

    public final void setMin(ConstraintAnchor constraintAnchor) {
        int i;
        WeakReference<ConstraintAnchor> weakReference = this.IMediaSession;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i2 = 0;
            if (!constraintAnchor.setMin) {
                i = 0;
            } else {
                i = constraintAnchor.getMin;
            }
            ConstraintAnchor constraintAnchor2 = this.IMediaSession.get();
            if (constraintAnchor2.setMin) {
                i2 = constraintAnchor2.getMin;
            }
            if (i <= i2) {
                return;
            }
        }
        this.IMediaSession = new WeakReference<>(constraintAnchor);
    }

    public final void getMax(ConstraintAnchor constraintAnchor) {
        int i;
        WeakReference<ConstraintAnchor> weakReference = this.IMediaControllerCallback$Stub;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i2 = 0;
            if (!constraintAnchor.setMin) {
                i = 0;
            } else {
                i = constraintAnchor.getMin;
            }
            ConstraintAnchor constraintAnchor2 = this.IMediaControllerCallback$Stub.get();
            if (constraintAnchor2.setMin) {
                i2 = constraintAnchor2.getMin;
            }
            if (i <= i2) {
                return;
            }
        }
        this.IMediaControllerCallback$Stub = new WeakReference<>(constraintAnchor);
    }

    public final void setMax(ConstraintAnchor constraintAnchor) {
        int i;
        WeakReference<ConstraintAnchor> weakReference = this.IMediaControllerCallback$Stub$Proxy;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i2 = 0;
            if (!constraintAnchor.setMin) {
                i = 0;
            } else {
                i = constraintAnchor.getMin;
            }
            ConstraintAnchor constraintAnchor2 = this.IMediaControllerCallback$Stub$Proxy.get();
            if (constraintAnchor2.setMin) {
                i2 = constraintAnchor2.getMin;
            }
            if (i <= i2) {
                return;
            }
        }
        this.IMediaControllerCallback$Stub$Proxy = new WeakReference<>(constraintAnchor);
    }

    public final void getMin(ConstraintAnchor constraintAnchor) {
        int i;
        WeakReference<ConstraintAnchor> weakReference = this.onSessionReady;
        if (!(weakReference == null || weakReference.get() == null)) {
            int i2 = 0;
            if (!constraintAnchor.setMin) {
                i = 0;
            } else {
                i = constraintAnchor.getMin;
            }
            ConstraintAnchor constraintAnchor2 = this.onSessionReady.get();
            if (constraintAnchor2.setMin) {
                i2 = constraintAnchor2.getMin;
            }
            if (i <= i2) {
                return;
            }
        }
        this.onSessionReady = new WeakReference<>(constraintAnchor);
    }

    private boolean getMax(reportFullyDrawn reportfullydrawn) {
        boolean FastBitmap$CoordinateSystem = FastBitmap$CoordinateSystem(64);
        setMin(reportfullydrawn, FastBitmap$CoordinateSystem);
        int size = this.onVolumeInfoChanged.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.onVolumeInfoChanged.get(i);
            constraintWidget.length(0, false);
            constraintWidget.length(1, false);
            if (constraintWidget instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.onVolumeInfoChanged.get(i2);
                if (constraintWidget2 instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
                    ((OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget2).setMax();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) this.onVolumeInfoChanged.get(i3);
            if (constraintWidget3.asBinder()) {
                constraintWidget3.setMin(reportfullydrawn, FastBitmap$CoordinateSystem);
            }
        }
        if (reportFullyDrawn.setMax) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.onVolumeInfoChanged.get(i4);
                if (!constraintWidget4.asBinder()) {
                    hashSet.add(constraintWidget4);
                }
            }
            getMin(this, reportfullydrawn, hashSet, this.extraCommand[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it.next();
                ArrayRes.getMin(this, reportfullydrawn, constraintWidget5);
                constraintWidget5.setMin(reportfullydrawn, FastBitmap$CoordinateSystem);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) this.onVolumeInfoChanged.get(i5);
                if (constraintWidget6 instanceof AnimRes) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget6.extraCommand[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget6.extraCommand[1];
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.extraCommand[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    constraintWidget6.setMin(reportfullydrawn, FastBitmap$CoordinateSystem);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.extraCommand[0] = dimensionBehaviour;
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget6.extraCommand[1] = dimensionBehaviour2;
                    }
                } else {
                    ArrayRes.getMin(this, reportfullydrawn, constraintWidget6);
                    if (!constraintWidget6.asBinder()) {
                        constraintWidget6.setMin(reportfullydrawn, FastBitmap$CoordinateSystem);
                    }
                }
            }
        }
        if (this.MediaMetadataCompat$BitmapKey > 0) {
            ActivityResultRegistry$1.getMax(this, reportfullydrawn, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.MediaMetadataCompat > 0) {
            ActivityResultRegistry$1.getMax(this, reportfullydrawn, (ArrayList<ConstraintWidget>) null, 1);
        }
        return true;
    }

    public final void getMax(boolean z, boolean z2) {
        super.getMax(z, z2);
        int size = this.onVolumeInfoChanged.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.onVolumeInfoChanged.get(i)).getMax(z, z2);
        }
    }

    public final boolean toFloatRange() {
        return this.setMin;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void asInterface() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.ICustomTabsService$Stub$Proxy = r2
            r1.ICustomTabsService$Stub = r2
            r1.onShuffleModeChangedRemoved = r2
            r1.onRepeatModeChanged = r2
            java.util.ArrayList r0 = r1.onVolumeInfoChanged
            int r3 = r0.size()
            int r0 = r1.areNotificationsEnabled
            r4 = 8
            if (r0 != r4) goto L_0x0019
            r0 = 0
            goto L_0x001b
        L_0x0019:
            int r0 = r1.requestPostMessageChannelWithExtras
        L_0x001b:
            int r0 = java.lang.Math.max(r2, r0)
            int r5 = r1.areNotificationsEnabled
            if (r5 != r4) goto L_0x0025
            r5 = 0
            goto L_0x0027
        L_0x0025:
            int r5 = r1.postMessage
        L_0x0027:
            int r5 = java.lang.Math.max(r2, r5)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r1.extraCommand
            r7 = 1
            r6 = r6[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r1.extraCommand
            r8 = r8[r2]
            o.ComponentActivity$5 r9 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r9 == 0) goto L_0x003f
            long r10 = r9.ICustomTabsCallback$Default
            r12 = 1
            long r10 = r10 + r12
            r9.ICustomTabsCallback$Default = r10
        L_0x003f:
            int r9 = r1.onPlaybackStateChanged
            boolean r9 = o.ArrayRes.setMin(r9, r7)
            if (r9 == 0) goto L_0x009b
            o.CheckResult$getMax r9 = r1.getMin
            o.ColorLong.length(r1, r9)
            r9 = 0
        L_0x004d:
            if (r9 >= r3) goto L_0x009b
            java.util.ArrayList r10 = r1.onVolumeInfoChanged
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r10
            boolean r11 = r10.Grayscale$Algorithm()
            if (r11 == 0) goto L_0x0098
            boolean r11 = r10 instanceof o.AnimatorRes
            if (r11 != 0) goto L_0x0098
            boolean r11 = r10 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r11 != 0) goto L_0x0098
            boolean r11 = r10 instanceof o.BinderThread
            if (r11 != 0) goto L_0x0098
            boolean r11 = r10.FastBitmap$CoordinateSystem()
            if (r11 != 0) goto L_0x0098
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r10.extraCommand
            r11 = r11[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r10.extraCommand
            r12 = r12[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r13) goto L_0x0089
            int r11 = r10.Mean$Arithmetic
            if (r11 == r7) goto L_0x0089
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r11) goto L_0x0089
            int r11 = r10.invoke
            if (r11 == r7) goto L_0x0089
            r11 = 1
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            if (r11 != 0) goto L_0x0098
            o.CheckResult$setMax r11 = new o.CheckResult$setMax
            r11.<init>()
            o.CheckResult$getMax r12 = r1.getMin
            int r13 = o.CheckResult.setMax.getMax
            setMax(r10, r12, r11, r13)
        L_0x0098:
            int r9 = r9 + 1
            goto L_0x004d
        L_0x009b:
            r9 = 2
            if (r3 <= r9) goto L_0x00f8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r10) goto L_0x00a6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r10) goto L_0x00f8
        L_0x00a6:
            int r10 = r1.onPlaybackStateChanged
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = o.ArrayRes.setMin(r10, r11)
            if (r10 == 0) goto L_0x00f8
            o.CheckResult$getMax r10 = r1.getMin
            boolean r10 = o.codename.getMax(r1, r10)
            if (r10 == 0) goto L_0x00f8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r10) goto L_0x00d6
            int r10 = r1.areNotificationsEnabled
            if (r10 != r4) goto L_0x00c2
            r10 = 0
            goto L_0x00c4
        L_0x00c2:
            int r10 = r1.requestPostMessageChannelWithExtras
        L_0x00c4:
            if (r0 >= r10) goto L_0x00ce
            if (r0 <= 0) goto L_0x00ce
            r1.getMax((int) r0)
            r1.onShuffleModeChangedRemoved = r7
            goto L_0x00d6
        L_0x00ce:
            int r0 = r1.areNotificationsEnabled
            if (r0 != r4) goto L_0x00d4
            r0 = 0
            goto L_0x00d6
        L_0x00d4:
            int r0 = r1.requestPostMessageChannelWithExtras
        L_0x00d6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r10) goto L_0x00f4
            int r10 = r1.areNotificationsEnabled
            if (r10 != r4) goto L_0x00e0
            r10 = 0
            goto L_0x00e2
        L_0x00e0:
            int r10 = r1.postMessage
        L_0x00e2:
            if (r5 >= r10) goto L_0x00ec
            if (r5 <= 0) goto L_0x00ec
            r1.toFloatRange(r5)
            r1.onRepeatModeChanged = r7
            goto L_0x00f4
        L_0x00ec:
            int r5 = r1.areNotificationsEnabled
            if (r5 != r4) goto L_0x00f2
            r5 = 0
            goto L_0x00f4
        L_0x00f2:
            int r5 = r1.postMessage
        L_0x00f4:
            r10 = r5
            r5 = r0
            r0 = 1
            goto L_0x00fb
        L_0x00f8:
            r10 = r5
            r5 = r0
            r0 = 0
        L_0x00fb:
            r11 = 64
            boolean r12 = r1.FastBitmap$CoordinateSystem(r11)
            if (r12 != 0) goto L_0x010e
            r12 = 128(0x80, float:1.794E-43)
            boolean r12 = r1.FastBitmap$CoordinateSystem(r12)
            if (r12 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r12 = 0
            goto L_0x010f
        L_0x010e:
            r12 = 1
        L_0x010f:
            o.reportFullyDrawn r13 = r1.MediaBrowserCompat$MediaItem
            r13.toFloatRange = r2
            o.reportFullyDrawn r13 = r1.MediaBrowserCompat$MediaItem
            r13.toDoubleRange = r2
            int r13 = r1.onPlaybackStateChanged
            if (r13 == 0) goto L_0x0121
            if (r12 == 0) goto L_0x0121
            o.reportFullyDrawn r12 = r1.MediaBrowserCompat$MediaItem
            r12.toDoubleRange = r7
        L_0x0121:
            java.util.ArrayList r12 = r1.onVolumeInfoChanged
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r13 = r1.extraCommand
            r13 = r13[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 == r14) goto L_0x0136
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r13 = r1.extraCommand
            r13 = r13[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != r14) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r13 = 0
            goto L_0x0137
        L_0x0136:
            r13 = 1
        L_0x0137:
            r1.MediaMetadataCompat$BitmapKey = r2
            r1.MediaMetadataCompat = r2
            r14 = 0
        L_0x013c:
            if (r14 >= r3) goto L_0x0154
            java.util.ArrayList r15 = r1.onVolumeInfoChanged
            java.lang.Object r15 = r15.get(r14)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            boolean r4 = r15 instanceof o.BoolRes
            if (r4 == 0) goto L_0x014f
            o.BoolRes r15 = (o.BoolRes) r15
            r15.asInterface()
        L_0x014f:
            int r14 = r14 + 1
            r4 = 8
            goto L_0x013c
        L_0x0154:
            boolean r4 = r1.FastBitmap$CoordinateSystem(r11)
            r14 = r0
            r0 = 0
            r15 = 1
        L_0x015b:
            if (r15 == 0) goto L_0x03da
            int r11 = r0 + 1
            o.reportFullyDrawn r0 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x024a }
            r0.getMax()     // Catch:{ Exception -> 0x024a }
            r1.MediaMetadataCompat$BitmapKey = r2     // Catch:{ Exception -> 0x024a }
            r1.MediaMetadataCompat = r2     // Catch:{ Exception -> 0x024a }
            o.reportFullyDrawn r0 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x024a }
            r1.setMin((o.reportFullyDrawn) r0)     // Catch:{ Exception -> 0x024a }
            r0 = 0
        L_0x016e:
            if (r0 >= r3) goto L_0x0182
            java.util.ArrayList r7 = r1.onVolumeInfoChanged     // Catch:{ Exception -> 0x024a }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x024a }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r7     // Catch:{ Exception -> 0x024a }
            o.reportFullyDrawn r9 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x024a }
            r7.setMin((o.reportFullyDrawn) r9)     // Catch:{ Exception -> 0x024a }
            int r0 = r0 + 1
            r7 = 1
            r9 = 2
            goto L_0x016e
        L_0x0182:
            o.reportFullyDrawn r0 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x024a }
            boolean r15 = r1.getMax((o.reportFullyDrawn) r0)     // Catch:{ Exception -> 0x024a }
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaSession     // Catch:{ Exception -> 0x0246 }
            r9 = 5
            if (r0 == 0) goto L_0x01b7
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaSession     // Catch:{ Exception -> 0x0246 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0246 }
            if (r0 == 0) goto L_0x01b7
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaSession     // Catch:{ Exception -> 0x0246 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0246 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x0246 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0246 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.setDefaultImpl     // Catch:{ Exception -> 0x0246 }
            androidx.constraintlayout.solver.SolverVariable r2 = r7.getMin((java.lang.Object) r2)     // Catch:{ Exception -> 0x0246 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0246 }
            androidx.constraintlayout.solver.SolverVariable r0 = r7.getMin((java.lang.Object) r0)     // Catch:{ Exception -> 0x0246 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0246 }
            r17 = r15
            r15 = 0
            r7.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r2, (int) r15, (int) r9)     // Catch:{ Exception -> 0x0242 }
            r0 = 0
            r1.IMediaSession = r0     // Catch:{ Exception -> 0x0242 }
            goto L_0x01b9
        L_0x01b7:
            r17 = r15
        L_0x01b9:
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaControllerCallback$Stub$Proxy     // Catch:{ Exception -> 0x0242 }
            if (r0 == 0) goto L_0x01e4
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaControllerCallback$Stub$Proxy     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0242 }
            if (r0 == 0) goto L_0x01e4
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaControllerCallback$Stub$Proxy     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r2 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r1.getInterfaceDescriptor     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.SolverVariable r2 = r2.getMin((java.lang.Object) r7)     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.SolverVariable r0 = r7.getMin((java.lang.Object) r0)     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            r15 = 0
            r7.setMin((androidx.constraintlayout.solver.SolverVariable) r2, (androidx.constraintlayout.solver.SolverVariable) r0, (int) r15, (int) r9)     // Catch:{ Exception -> 0x0242 }
            r0 = 0
            r1.IMediaControllerCallback$Stub$Proxy = r0     // Catch:{ Exception -> 0x0242 }
        L_0x01e4:
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaControllerCallback$Stub     // Catch:{ Exception -> 0x0242 }
            if (r0 == 0) goto L_0x020f
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaControllerCallback$Stub     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0242 }
            if (r0 == 0) goto L_0x020f
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.IMediaControllerCallback$Stub     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r2 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r1.ICustomTabsCallback$Default     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.SolverVariable r2 = r2.getMin((java.lang.Object) r7)     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.SolverVariable r0 = r7.getMin((java.lang.Object) r0)     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            r15 = 0
            r7.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r2, (int) r15, (int) r9)     // Catch:{ Exception -> 0x0242 }
            r0 = 0
            r1.IMediaControllerCallback$Stub = r0     // Catch:{ Exception -> 0x0242 }
        L_0x020f:
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.onSessionReady     // Catch:{ Exception -> 0x0242 }
            if (r0 == 0) goto L_0x023a
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.onSessionReady     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0242 }
            if (r0 == 0) goto L_0x023a
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.onSessionReady     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r2 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r1.ICustomTabsCallback$Stub$Proxy     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.SolverVariable r2 = r2.getMin((java.lang.Object) r7)     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            androidx.constraintlayout.solver.SolverVariable r0 = r7.getMin((java.lang.Object) r0)     // Catch:{ Exception -> 0x0242 }
            o.reportFullyDrawn r7 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            r15 = 0
            r7.setMin((androidx.constraintlayout.solver.SolverVariable) r2, (androidx.constraintlayout.solver.SolverVariable) r0, (int) r15, (int) r9)     // Catch:{ Exception -> 0x0242 }
            r0 = 0
            r1.onSessionReady = r0     // Catch:{ Exception -> 0x0242 }
        L_0x023a:
            o.reportFullyDrawn r0 = r1.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0242 }
            r0.setMin()     // Catch:{ Exception -> 0x0242 }
            r15 = r17
            goto L_0x025a
        L_0x0242:
            r0 = move-exception
            r15 = r17
            goto L_0x024b
        L_0x0246:
            r0 = move-exception
            r17 = r15
            goto L_0x024b
        L_0x024a:
            r0 = move-exception
        L_0x024b:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r7 = "EXCEPTION : "
            java.lang.String r0 = r7.concat(r0)
            r2.println(r0)
        L_0x025a:
            if (r15 == 0) goto L_0x0282
            boolean[] r0 = o.ArrayRes.getMin
            r2 = 2
            r7 = 0
            r0[r2] = r7
            r2 = 64
            boolean r0 = r1.FastBitmap$CoordinateSystem(r2)
            r1.length((boolean) r0)
            java.util.ArrayList r7 = r1.onVolumeInfoChanged
            int r7 = r7.size()
            r9 = 0
        L_0x0272:
            if (r9 >= r7) goto L_0x0298
            java.util.ArrayList r15 = r1.onVolumeInfoChanged
            java.lang.Object r15 = r15.get(r9)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            r15.length((boolean) r0)
            int r9 = r9 + 1
            goto L_0x0272
        L_0x0282:
            r2 = 64
            r1.length((boolean) r4)
            r0 = 0
        L_0x0288:
            if (r0 >= r3) goto L_0x0298
            java.util.ArrayList r7 = r1.onVolumeInfoChanged
            java.lang.Object r7 = r7.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r7
            r7.length((boolean) r4)
            int r0 = r0 + 1
            goto L_0x0288
        L_0x0298:
            if (r13 == 0) goto L_0x0329
            r7 = 8
            if (r11 >= r7) goto L_0x0329
            boolean[] r0 = o.ArrayRes.getMin
            r9 = 2
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x0329
            r0 = 0
            r2 = 0
            r15 = 0
        L_0x02a8:
            if (r0 >= r3) goto L_0x02de
            java.util.ArrayList r9 = r1.onVolumeInfoChanged
            java.lang.Object r9 = r9.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r9
            r16 = r3
            int r3 = r9.ICustomTabsService$Stub$Proxy
            r17 = r4
            int r4 = r9.areNotificationsEnabled
            if (r4 != r7) goto L_0x02be
            r4 = 0
            goto L_0x02c0
        L_0x02be:
            int r4 = r9.requestPostMessageChannelWithExtras
        L_0x02c0:
            int r3 = r3 + r4
            int r15 = java.lang.Math.max(r15, r3)
            int r3 = r9.ICustomTabsService$Stub
            int r4 = r9.areNotificationsEnabled
            if (r4 != r7) goto L_0x02cd
            r4 = 0
            goto L_0x02cf
        L_0x02cd:
            int r4 = r9.postMessage
        L_0x02cf:
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            int r0 = r0 + 1
            r3 = r16
            r4 = r17
            r7 = 8
            r9 = 2
            goto L_0x02a8
        L_0x02de:
            r16 = r3
            r17 = r4
            int r0 = r1.IPostMessageService$Default
            int r0 = java.lang.Math.max(r0, r15)
            int r3 = r1.IPostMessageService$Stub$Proxy
            int r2 = java.lang.Math.max(r3, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r3) goto L_0x030b
            int r3 = r1.areNotificationsEnabled
            r4 = 8
            if (r3 != r4) goto L_0x02fa
            r3 = 0
            goto L_0x02fc
        L_0x02fa:
            int r3 = r1.requestPostMessageChannelWithExtras
        L_0x02fc:
            if (r3 >= r0) goto L_0x030b
            r1.getMax((int) r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r4 = 0
            r0[r4] = r3
            r0 = 1
            r14 = 1
            goto L_0x030c
        L_0x030b:
            r0 = 0
        L_0x030c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r3) goto L_0x032e
            int r3 = r1.areNotificationsEnabled
            r4 = 8
            if (r3 != r4) goto L_0x0318
            r3 = 0
            goto L_0x031a
        L_0x0318:
            int r3 = r1.postMessage
        L_0x031a:
            if (r3 >= r2) goto L_0x032e
            r1.toFloatRange(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r3 = 1
            r0[r3] = r2
            r0 = 1
            r14 = 1
            goto L_0x032e
        L_0x0329:
            r16 = r3
            r17 = r4
            r0 = 0
        L_0x032e:
            int r2 = r1.IPostMessageService$Default
            int r3 = r1.areNotificationsEnabled
            r4 = 8
            if (r3 != r4) goto L_0x0338
            r3 = 0
            goto L_0x033a
        L_0x0338:
            int r3 = r1.requestPostMessageChannelWithExtras
        L_0x033a:
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.areNotificationsEnabled
            if (r3 != r4) goto L_0x0344
            r3 = 0
            goto L_0x0346
        L_0x0344:
            int r3 = r1.requestPostMessageChannelWithExtras
        L_0x0346:
            if (r2 <= r3) goto L_0x0354
            r1.getMax((int) r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = 0
            r0[r3] = r2
            r0 = 1
            r14 = 1
        L_0x0354:
            int r2 = r1.IPostMessageService$Stub$Proxy
            int r3 = r1.areNotificationsEnabled
            r4 = 8
            if (r3 != r4) goto L_0x035e
            r3 = 0
            goto L_0x0360
        L_0x035e:
            int r3 = r1.postMessage
        L_0x0360:
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.areNotificationsEnabled
            if (r3 != r4) goto L_0x036a
            r3 = 0
            goto L_0x036c
        L_0x036a:
            int r3 = r1.postMessage
        L_0x036c:
            if (r2 <= r3) goto L_0x037b
            r1.toFloatRange(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = 1
            r0[r3] = r2
            r0 = 1
            r3 = 1
            goto L_0x037c
        L_0x037b:
            r3 = r14
        L_0x037c:
            if (r3 != 0) goto L_0x03ca
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.extraCommand
            r4 = 0
            r2 = r2[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r4) goto L_0x03a5
            if (r5 <= 0) goto L_0x03a5
            int r2 = r1.areNotificationsEnabled
            r4 = 8
            if (r2 != r4) goto L_0x0391
            r2 = 0
            goto L_0x0393
        L_0x0391:
            int r2 = r1.requestPostMessageChannelWithExtras
        L_0x0393:
            if (r2 <= r5) goto L_0x03a5
            r2 = 1
            r1.onShuffleModeChangedRemoved = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = 0
            r0[r4] = r3
            r1.getMax((int) r5)
            r0 = 1
            r3 = 1
            goto L_0x03a6
        L_0x03a5:
            r2 = 1
        L_0x03a6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r1.extraCommand
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r7) goto L_0x03ca
            if (r10 <= 0) goto L_0x03ca
            int r4 = r1.areNotificationsEnabled
            r7 = 8
            if (r4 != r7) goto L_0x03b8
            r15 = 0
            goto L_0x03ba
        L_0x03b8:
            int r15 = r1.postMessage
        L_0x03ba:
            if (r15 <= r10) goto L_0x03cc
            r1.onRepeatModeChanged = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r2] = r3
            r1.toFloatRange(r10)
            r14 = 1
            r15 = 1
            goto L_0x03ce
        L_0x03ca:
            r7 = 8
        L_0x03cc:
            r15 = r0
            r14 = r3
        L_0x03ce:
            r0 = r11
            r3 = r16
            r4 = r17
            r2 = 0
            r7 = 1
            r9 = 2
            r11 = 64
            goto L_0x015b
        L_0x03da:
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r1.onVolumeInfoChanged = r12
            if (r14 == 0) goto L_0x03ea
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            r2 = 0
            r0[r2] = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.extraCommand
            r2 = 1
            r0[r2] = r6
        L_0x03ea:
            o.reportFullyDrawn r0 = r1.MediaBrowserCompat$MediaItem
            o.ComponentActivity$3 r0 = r0.toString
            r1.setMin((o.ComponentActivity.AnonymousClass3) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AnimRes.asInterface():void");
    }

    public final reportFullyDrawn ICustomTabsCallback$Stub() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public static boolean setMax(ConstraintWidget constraintWidget, CheckResult.getMax getmax, CheckResult.setMax setmax, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        if (getmax == null) {
            return false;
        }
        setmax.getMin = constraintWidget.extraCommand[0];
        setmax.setMax = constraintWidget.extraCommand[1];
        if (constraintWidget.areNotificationsEnabled == 8) {
            i2 = 0;
        } else {
            i2 = constraintWidget.requestPostMessageChannelWithExtras;
        }
        setmax.IsOverlapping = i2;
        if (constraintWidget.areNotificationsEnabled == 8) {
            i3 = 0;
        } else {
            i3 = constraintWidget.postMessage;
        }
        setmax.isInside = i3;
        setmax.hashCode = false;
        setmax.values = i;
        boolean z2 = setmax.getMin == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = setmax.setMax == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z4 = z2 && constraintWidget.updateVisuals > 0.0f;
        boolean z5 = z3 && constraintWidget.updateVisuals > 0.0f;
        if (z2 && constraintWidget.getMin(0) && constraintWidget.Mean$Arithmetic == 0 && !z4) {
            setmax.getMin = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z3 && constraintWidget.invoke == 0) {
                setmax.getMin = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (z3 && constraintWidget.getMin(1) && constraintWidget.invoke == 0 && !z5) {
            setmax.setMax = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.Mean$Arithmetic == 0) {
                setmax.setMax = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z3 = false;
        }
        if (constraintWidget.getMin()) {
            setmax.getMin = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (constraintWidget.setMin()) {
            setmax.setMax = ConstraintWidget.DimensionBehaviour.FIXED;
            z3 = false;
        }
        if (z4) {
            if (constraintWidget.valueOf[0] == 4) {
                setmax.getMin = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z3) {
                if (setmax.setMax == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i5 = setmax.isInside;
                } else {
                    setmax.getMin = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    getmax.setMax(constraintWidget, setmax);
                    i5 = setmax.toIntRange;
                }
                setmax.getMin = ConstraintWidget.DimensionBehaviour.FIXED;
                if (constraintWidget.validateRelationship == 0 || constraintWidget.validateRelationship == -1) {
                    setmax.IsOverlapping = (int) (constraintWidget.updateVisuals * ((float) i5));
                } else {
                    setmax.IsOverlapping = (int) (constraintWidget.updateVisuals / ((float) i5));
                }
            }
        }
        if (z5) {
            if (constraintWidget.valueOf[1] == 4) {
                setmax.setMax = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                if (setmax.getMin == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i4 = setmax.IsOverlapping;
                } else {
                    setmax.setMax = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    getmax.setMax(constraintWidget, setmax);
                    i4 = setmax.toFloatRange;
                }
                setmax.setMax = ConstraintWidget.DimensionBehaviour.FIXED;
                if (constraintWidget.validateRelationship == 0 || constraintWidget.validateRelationship == -1) {
                    setmax.isInside = (int) (((float) i4) / constraintWidget.updateVisuals);
                } else {
                    setmax.isInside = (int) (((float) i4) * constraintWidget.updateVisuals);
                }
            }
        }
        getmax.setMax(constraintWidget, setmax);
        constraintWidget.getMax(setmax.toFloatRange);
        constraintWidget.toFloatRange(setmax.toIntRange);
        constraintWidget.ICustomTabsCallback$Stub = setmax.toDoubleRange;
        int i6 = setmax.equals;
        constraintWidget.IPostMessageService$Stub = i6;
        if (i6 > 0) {
            z = true;
        }
        constraintWidget.ICustomTabsCallback$Stub = z;
        setmax.values = CheckResult.setMax.getMax;
        return setmax.hashCode;
    }
}
