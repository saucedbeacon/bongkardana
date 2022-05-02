package o;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentLifecycle;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LayoutOutput;
import com.facebook.litho.LayoutState;
import com.facebook.litho.LithoView;
import com.facebook.litho.TestItem;
import com.facebook.litho.ThreadUtils;
import com.facebook.litho.Transition;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.PlaybackStateCompat;
import o.dispatchNestedPreFling;
import o.smoothScrollBy;

@ThreadConfined("UI")
public class WindowInsetsCompat$Type$InsetsType implements smoothScrollBy.setMax {
    private static final BitSet Mean$Arithmetic = new BitSet(0);
    private static final Rect b = new Rect();
    private static final Rect create = new Rect();
    public LayoutState FastBitmap$CoordinateSystem;
    public boolean Grayscale$Algorithm = false;
    private final PlaybackStateCompat.ShuffleMode<WindowInsetsAnimationCompat$Callback$DispatchMode> ICustomTabsCallback = new PlaybackStateCompat.ShuffleMode<>();
    public final setMax IsOverlapping = new setMax((byte) 0);
    public final PlaybackStateCompat.ShuffleMode<ComponentHost> equals = new PlaybackStateCompat.ShuffleMode<>();
    private final length extraCallback = new length((byte) 0);
    private final Set<Long> extraCallbackWithResult = new HashSet();
    @Nullable
    private BitSet getCause;
    public final Map<String, Deque<TestItem>> getMax;
    public boolean getMin;
    public smoothScrollBy hashCode;
    @Nullable
    public Transition invoke;
    public final Map<pageScroll, hide<WindowInsetsAnimationCompat$Callback$DispatchMode>> invokeSuspend = new LinkedHashMap();
    public final Rect isInside = new Rect();
    public final PlaybackStateCompat.ShuffleMode<WindowInsetsAnimationCompat$Callback$DispatchMode> length = new PlaybackStateCompat.ShuffleMode<>();
    private int onMessageChannelReady;
    private final PlaybackStateCompat.ShuffleMode<measureChildWithMargins> onNavigationEvent = new PlaybackStateCompat.ShuffleMode<>();
    private int onPostMessage;
    private final WindowInsetsAnimationCompat$Callback$DispatchMode onRelationshipValidationResult;
    public boolean setMax;
    @Nullable
    public long[] setMin;
    public boolean toDoubleRange = false;
    public final LithoView toFloatRange;
    public final ensureProcessorRunningLocked toIntRange;
    public int toString = -1;
    public int[] valueOf;
    public final HashSet<pageScroll> values = new HashSet<>();

    public static boolean getMin() {
        return false;
    }

    private static boolean length(float f, int i, int i2) {
        return ((float) i2) >= f * ((float) i);
    }

    public WindowInsetsCompat$Type$InsetsType(LithoView lithoView) {
        this.toIntRange = lithoView.getComponentContext();
        this.toFloatRange = lithoView;
        this.setMax = true;
        this.getMax = keyToDirection.equals ? new HashMap() : null;
        isStopped min = ConnectivityManagerCompat$RestrictBackgroundStatus.getMin();
        LithoView lithoView2 = this.toFloatRange;
        this.onRelationshipValidationResult = NotificationCompatSideChannelService.setMin(min, lithoView2, lithoView2);
    }

    public final boolean getMax() {
        ThreadUtils.getMax();
        return this.setMax;
    }

    public final boolean setMax() {
        ThreadUtils.getMax();
        return this.getMin;
    }

    private void setMin(pageScroll pagescroll) {
        smoothScrollBy.getMin getmin;
        smoothScrollBy smoothscrollby = this.hashCode;
        if (smoothscrollby != null && pagescroll != null && (getmin = (smoothScrollBy.getMin) smoothscrollby.length.getMin.get(pagescroll)) != null) {
            smoothScrollBy.getMax(getmin, (hide<Object>) null);
        }
    }

    private void setMin(pageScroll pagescroll, int i) {
        smoothScrollBy.getMin getmin;
        hide<Object> hide;
        smoothScrollBy smoothscrollby = this.hashCode;
        if (smoothscrollby != null && pagescroll != null && (getmin = (smoothScrollBy.getMin) smoothscrollby.length.getMin.get(pagescroll)) != null && (hide = getmin.getMax) != null && hide.setMax[i] != null) {
            hide hide2 = null;
            if (hide.getMin > 1) {
                hide hide3 = new hide(hide);
                hide3.getMin(i, null);
                hide2 = hide3;
            }
            smoothScrollBy.getMax(getmin, hide2);
        }
    }

    public final void length() {
        if (this.hashCode != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.values.size());
            int length2 = this.length.length();
            for (int i = 0; i < length2; i++) {
                WindowInsetsAnimationCompat$Callback$DispatchMode min = this.length.getMin(i);
                if (min.setMin()) {
                    long min2 = this.length.setMin(i);
                    int i2 = min2 == 0 ? 3 : (int) ((min2 >> 16) & 3);
                    hide hide = (hide) linkedHashMap.get(min.isInside);
                    if (hide == null) {
                        hide = new hide();
                        linkedHashMap.put(min.isInside, hide);
                    }
                    hide.getMin(i2, min.length != null ? min.length : min.setMax);
                }
            }
            for (pageScroll pagescroll : linkedHashMap.keySet()) {
                this.hashCode.length(pagescroll, (hide<Object>) (hide) linkedHashMap.get(pagescroll));
            }
            for (pageScroll next : this.invokeSuspend.keySet()) {
                hide hide2 = this.invokeSuspend.get(next);
                hide hide3 = new hide();
                short s = hide2.getMin;
                for (int i3 = 0; i3 < s; i3++) {
                    int max = hide2.getMax(i3);
                    WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode = (WindowInsetsAnimationCompat$Callback$DispatchMode) hide2.setMax(i3);
                    hide3.getMax(max, windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax);
                }
                this.hashCode.length(next, (hide<Object>) hide3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(com.facebook.litho.LayoutState r26, android.graphics.Rect r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            com.facebook.litho.ThreadUtils.getMax()
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            o.WindowInsetsCompat$Type$InsetsType$setMax r3 = r0.IsOverlapping
            boolean r3 = r3.FastBitmap$CoordinateSystem
            o.NotificationCompat$StreamType.setMin()
            if (r3 == 0) goto L_0x001c
            long r6 = java.lang.System.nanoTime()
            goto L_0x001e
        L_0x001c:
            r6 = 0
        L_0x001e:
            java.util.List<o.measureChild> r8 = r1.equals
            int r8 = r8.size()
            r10 = 0
        L_0x0025:
            if (r10 >= r8) goto L_0x01ef
            java.util.List<o.measureChild> r13 = r1.equals
            java.lang.Object r13 = r13.get(r10)
            o.measureChild r13 = (o.measureChild) r13
            if (r3 == 0) goto L_0x0036
            long r14 = java.lang.System.nanoTime()
            goto L_0x0038
        L_0x0036:
            r14 = 0
        L_0x0038:
            o.IconCompat<o.onRequestFocusInDescendants> r4 = r13.equals
            o.IconCompat<o.FontsContractCompat$FontRequestCallback$FontRequestFailReason> r5 = r13.toFloatRange
            o.IconCompat<o.computeHorizontalScrollOffset> r11 = r13.toIntRange
            o.IconCompat<o.ParseException> r12 = r13.IsOverlapping
            o.IconCompat<o.LinkifyCompat$LinkifyMask> r9 = r13.isInside
            r17 = r8
            o.IconCompat<o.computeHorizontalScrollExtent> r8 = r13.toDoubleRange
            r18 = r6
            long r6 = r13.length
            r20 = r10
            android.graphics.Rect r10 = r13.getMax
            r21 = r14
            android.graphics.Rect r14 = create
            boolean r14 = r14.setIntersect(r10, r2)
            if (r14 == 0) goto L_0x0062
            android.graphics.Rect r14 = create
            boolean r14 = getMin(r13, r10, r14)
            if (r14 == 0) goto L_0x0062
            r14 = 1
            goto L_0x0063
        L_0x0062:
            r14 = 0
        L_0x0063:
            o.PlaybackStateCompat$ShuffleMode<o.measureChildWithMargins> r15 = r0.onNavigationEvent
            r24 = r3
            r3 = 0
            java.lang.Object r15 = r15.getMax(r6, r3)
            o.measureChildWithMargins r15 = (o.measureChildWithMargins) r15
            if (r15 == 0) goto L_0x00e9
            java.lang.String r3 = r15.length
            o.isStopped r1 = r13.setMin
            if (r1 == 0) goto L_0x007b
            o.isStopped r1 = r13.setMin
            java.lang.String r1 = r1.toFloatRange
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0087
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0087
            r23 = 1
            goto L_0x0089
        L_0x0087:
            r23 = 0
        L_0x0089:
            if (r23 != 0) goto L_0x008f
            r15.setMin = r11
            r15.getMin = r9
        L_0x008f:
            if (r14 == 0) goto L_0x0099
            if (r23 == 0) goto L_0x0094
            goto L_0x0099
        L_0x0094:
            boolean r1 = r0.setMax
            r15.toFloatRange = r1
            goto L_0x00e9
        L_0x0099:
            o.IconCompat<o.LinkifyCompat$LinkifyMask> r1 = r15.getMin
            if (r1 == 0) goto L_0x00b2
            o.IconCompat<o.LinkifyCompat$LinkifyMask> r1 = r15.getMin
            com.facebook.litho.ThreadUtils.getMax()
            o.LinkifyCompat$LinkifyMask r3 = o.getHandler.getMin
            if (r3 != 0) goto L_0x00ad
            o.LinkifyCompat$LinkifyMask r3 = new o.LinkifyCompat$LinkifyMask
            r3.<init>()
            o.getHandler.getMin = r3
        L_0x00ad:
            o.LinkifyCompat$LinkifyMask r3 = o.getHandler.getMin
            r1.setMax(r3)
        L_0x00b2:
            if (r8 == 0) goto L_0x00ba
            r1 = 0
            r3 = 0
            o.getHandler.getMax(r8, r3, r3, r1, r1)
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            boolean r1 = r15.setMin()
            if (r1 == 0) goto L_0x00e0
            int r1 = r15.getMax
            r1 = r1 & -33
            r15.getMax = r1
            o.IconCompat<o.computeHorizontalScrollOffset> r1 = r15.setMin
            if (r1 == 0) goto L_0x00e0
            o.IconCompat<o.computeHorizontalScrollOffset> r1 = r15.setMin
            com.facebook.litho.ThreadUtils.getMax()
            o.computeHorizontalScrollOffset r16 = o.getHandler.toFloatRange
            if (r16 != 0) goto L_0x00db
            o.computeHorizontalScrollOffset r16 = new o.computeHorizontalScrollOffset
            r16.<init>()
            o.getHandler.toFloatRange = r16
        L_0x00db:
            o.computeHorizontalScrollOffset r3 = o.getHandler.toFloatRange
            r1.setMax(r3)
        L_0x00e0:
            o.PlaybackStateCompat$ShuffleMode<o.measureChildWithMargins> r1 = r0.onNavigationEvent
            r1.getMin((long) r6)
            o.NotificationCompatSideChannelService.length((o.measureChildWithMargins) r15)
            r15 = 0
        L_0x00e9:
            if (r14 == 0) goto L_0x01b3
            if (r15 != 0) goto L_0x011c
            o.isStopped r1 = r13.setMin
            if (r1 == 0) goto L_0x00f6
            o.isStopped r1 = r13.setMin
            java.lang.String r3 = r1.toFloatRange
            goto L_0x00f7
        L_0x00f6:
            r3 = 0
        L_0x00f7:
            o.measureChildWithMargins r15 = o.NotificationCompatSideChannelService.setMax(r3, r9, r11, r8)
            boolean r1 = r0.setMax
            r15.toFloatRange = r1
            o.PlaybackStateCompat$ShuffleMode<o.measureChildWithMargins> r1 = r0.onNavigationEvent
            r1.setMax(r6, r15)
            if (r4 == 0) goto L_0x011c
            com.facebook.litho.ThreadUtils.getMax()
            o.NotificationCompat$StreamType.setMin()
            o.onRequestFocusInDescendants r1 = o.getHandler.getMax
            if (r1 != 0) goto L_0x0117
            o.onRequestFocusInDescendants r1 = new o.onRequestFocusInDescendants
            r1.<init>()
            o.getHandler.getMax = r1
        L_0x0117:
            o.onRequestFocusInDescendants r1 = o.getHandler.getMax
            r4.setMax(r1)
        L_0x011c:
            if (r5 != 0) goto L_0x0120
            if (r11 == 0) goto L_0x016b
        L_0x0120:
            android.graphics.Rect r1 = create
            boolean r1 = r0.getMin((android.graphics.Rect) r10, (android.graphics.Rect) r1)
            if (r1 == 0) goto L_0x014a
            boolean r1 = r15.setMin()
            if (r1 != 0) goto L_0x016b
            int r1 = r15.getMax
            r1 = r1 | 32
            r15.getMax = r1
            if (r5 == 0) goto L_0x016b
            com.facebook.litho.ThreadUtils.getMax()
            o.FontsContractCompat$FontRequestCallback$FontRequestFailReason r1 = o.getHandler.length
            if (r1 != 0) goto L_0x0144
            o.FontsContractCompat$FontRequestCallback$FontRequestFailReason r1 = new o.FontsContractCompat$FontRequestCallback$FontRequestFailReason
            r1.<init>()
            o.getHandler.length = r1
        L_0x0144:
            o.FontsContractCompat$FontRequestCallback$FontRequestFailReason r1 = o.getHandler.length
            r5.setMax(r1)
            goto L_0x016b
        L_0x014a:
            boolean r1 = r15.setMin()
            if (r1 == 0) goto L_0x016b
            int r1 = r15.getMax
            r1 = r1 & -33
            r15.getMax = r1
            if (r11 == 0) goto L_0x016b
            com.facebook.litho.ThreadUtils.getMax()
            o.computeHorizontalScrollOffset r1 = o.getHandler.toFloatRange
            if (r1 != 0) goto L_0x0166
            o.computeHorizontalScrollOffset r1 = new o.computeHorizontalScrollOffset
            r1.<init>()
            o.getHandler.toFloatRange = r1
        L_0x0166:
            o.computeHorizontalScrollOffset r1 = o.getHandler.toFloatRange
            r11.setMax(r1)
        L_0x016b:
            if (r12 == 0) goto L_0x0191
            boolean r1 = r15.getMax()
            if (r1 != 0) goto L_0x0191
            android.graphics.Rect r1 = create
            r15.length(r10, r1)
            boolean r1 = r15.getMax()
            if (r1 == 0) goto L_0x0191
            com.facebook.litho.ThreadUtils.getMax()
            o.ParseException r1 = o.getHandler.isInside
            if (r1 != 0) goto L_0x018c
            o.ParseException r1 = new o.ParseException
            r1.<init>()
            o.getHandler.isInside = r1
        L_0x018c:
            o.ParseException r1 = o.getHandler.isInside
            r12.setMax(r1)
        L_0x0191:
            if (r8 == 0) goto L_0x01b3
            int r1 = r2.right
            int r3 = r2.left
            int r1 = r1 - r3
            int r3 = r2.bottom
            int r4 = r2.top
            int r3 = r3 - r4
            float r4 = (float) r1
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            r6 = r26
            int r7 = r6.valueOf
            float r7 = (float) r7
            float r4 = r4 / r7
            float r7 = (float) r3
            float r7 = r7 * r5
            int r5 = r6.Grayscale$Algorithm
            float r5 = (float) r5
            float r7 = r7 / r5
            o.getHandler.getMax(r8, r1, r3, r4, r7)
            goto L_0x01b5
        L_0x01b3:
            r6 = r26
        L_0x01b5:
            if (r24 == 0) goto L_0x01e4
            o.isStopped r1 = r13.setMin
            if (r1 == 0) goto L_0x01c0
            o.isStopped r1 = r13.setMin
            java.lang.String r1 = r1.valueOf
            goto L_0x01c2
        L_0x01c0:
            java.lang.String r1 = "Unknown"
        L_0x01c2:
            o.WindowInsetsCompat$Type$InsetsType$setMax r3 = r0.IsOverlapping
            java.util.List<java.lang.Double> r3 = r3.toIntRange
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r21
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r7
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3.add(r4)
            o.WindowInsetsCompat$Type$InsetsType$setMax r3 = r0.IsOverlapping
            java.util.List<java.lang.String> r3 = r3.getMax
            r3.add(r1)
        L_0x01e4:
            int r10 = r20 + 1
            r1 = r6
            r8 = r17
            r6 = r18
            r3 = r24
            goto L_0x0025
        L_0x01ef:
            r24 = r3
            r18 = r6
            boolean r1 = r0.setMax
            if (r1 == 0) goto L_0x01fa
            r25.setMin()
        L_0x01fa:
            if (r24 == 0) goto L_0x0210
            o.WindowInsetsCompat$Type$InsetsType$setMax r1 = r0.IsOverlapping
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r18
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r4
            r1.values = r2
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Type$InsetsType.setMin(com.facebook.litho.LayoutState, android.graphics.Rect):void");
    }

    public final void getMax(LayoutState layoutState) {
        WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode;
        ComponentHost componentHost;
        Map<String, Deque<TestItem>> map = this.getMax;
        if (map != null) {
            for (Deque<TestItem> it : map.values()) {
                for (TestItem max : it) {
                    NotificationCompatSideChannelService.setMax(max);
                }
            }
            this.getMax.clear();
            int size = layoutState.toString == null ? 0 : layoutState.toString.size();
            for (int i = 0; i < size; i++) {
                Object obj = null;
                setSmoothScrollingEnabled setsmoothscrollingenabled = layoutState.toString == null ? null : layoutState.toString.get(i);
                long j = setsmoothscrollingenabled.getMin;
                long j2 = setsmoothscrollingenabled.length;
                if (j2 == -1) {
                    windowInsetsAnimationCompat$Callback$DispatchMode = null;
                } else {
                    windowInsetsAnimationCompat$Callback$DispatchMode = this.length.getMax(j2, null);
                }
                TestItem equals2 = NotificationCompatSideChannelService.equals();
                if (j == -1) {
                    componentHost = null;
                } else {
                    componentHost = this.equals.getMax(j, null);
                }
                equals2.getMax = componentHost;
                equals2.length.set(setsmoothscrollingenabled.getMax);
                equals2.getMin = setsmoothscrollingenabled.setMin;
                if (windowInsetsAnimationCompat$Callback$DispatchMode != null) {
                    obj = windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
                }
                equals2.setMin = obj;
                Deque deque = this.getMax.get(setsmoothscrollingenabled.setMin);
                if (deque == null) {
                    deque = new LinkedList();
                }
                deque.add(equals2);
                this.getMax.put(setsmoothscrollingenabled.setMin, deque);
            }
        }
    }

    public final void setMax(LayoutState layoutState, Rect rect) {
        if (!rect.isEmpty()) {
            ArrayList<LayoutOutput> arrayList = layoutState.toIntRange;
            ArrayList<LayoutOutput> arrayList2 = layoutState.values;
            int size = layoutState.toFloatRange.size();
            this.onPostMessage = layoutState.toFloatRange.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (rect.bottom <= arrayList.get(i).setMax.top) {
                    this.onPostMessage = i;
                    break;
                } else {
                    i++;
                }
            }
            this.onMessageChannelReady = layoutState.toFloatRange.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (rect.top < arrayList2.get(i2).setMax.bottom) {
                    this.onMessageChannelReady = i2;
                    return;
                }
            }
        }
    }

    public final void setMin() {
        ThreadUtils.getMax();
        NotificationCompat$StreamType.setMin();
        PlaybackStateCompat.ShuffleMode<measureChildWithMargins> shuffleMode = this.onNavigationEvent;
        if (shuffleMode.getMin) {
            shuffleMode.getMin();
        }
        for (int i = shuffleMode.length - 1; i >= 0; i--) {
            PlaybackStateCompat.ShuffleMode<measureChildWithMargins> shuffleMode2 = this.onNavigationEvent;
            if (shuffleMode2.getMin) {
                shuffleMode2.getMin();
            }
            measureChildWithMargins measurechildwithmargins = (measureChildWithMargins) shuffleMode2.setMin[i];
            if (measurechildwithmargins.length()) {
                measurechildwithmargins.toFloatRange = false;
            } else {
                IconCompat<LinkifyCompat$LinkifyMask> iconCompat = measurechildwithmargins.getMin;
                IconCompat<computeHorizontalScrollOffset> iconCompat2 = measurechildwithmargins.setMin;
                IconCompat<computeHorizontalScrollExtent> iconCompat3 = measurechildwithmargins.setMax;
                if (iconCompat != null) {
                    ThreadUtils.getMax();
                    if (getHandler.getMin == null) {
                        getHandler.getMin = new LinkifyCompat$LinkifyMask();
                    }
                    iconCompat.setMax(getHandler.getMin);
                }
                if (measurechildwithmargins.setMin()) {
                    measurechildwithmargins.getMax &= -33;
                    if (iconCompat2 != null) {
                        ThreadUtils.getMax();
                        if (getHandler.toFloatRange == null) {
                            getHandler.toFloatRange = new computeHorizontalScrollOffset();
                        }
                        iconCompat2.setMax(getHandler.toFloatRange);
                    }
                }
                if (iconCompat3 != null) {
                    getHandler.getMax(iconCompat3, 0, 0, 0.0f, 0.0f);
                }
                PlaybackStateCompat.ShuffleMode<measureChildWithMargins> shuffleMode3 = this.onNavigationEvent;
                if (shuffleMode3.setMin[i] != PlaybackStateCompat.ShuffleMode.getMax) {
                    shuffleMode3.setMin[i] = PlaybackStateCompat.ShuffleMode.getMax;
                    shuffleMode3.getMin = true;
                }
                NotificationCompatSideChannelService.length(measurechildwithmargins);
            }
        }
    }

    private void length(long j, ComponentHost componentHost) {
        componentHost.suppressInvalidations(true);
        this.equals.setMax(j, componentHost);
    }

    private boolean getMin(Rect rect, Rect rect2) {
        View view = (View) this.toFloatRange.getParent();
        if (view == null) {
            return false;
        }
        int width = (view.getWidth() * view.getHeight()) / 2;
        int width2 = rect.isEmpty() ? 0 : rect.width() * rect.height();
        int width3 = rect2.isEmpty() ? 0 : rect2.width() * rect2.height();
        if (width2 < width) {
            return rect.equals(rect2);
        }
        if (width3 >= width) {
            return true;
        }
        return false;
    }

    public final void getMin(boolean z) {
        PlaybackStateCompat.ShuffleMode<ComponentHost> shuffleMode = this.equals;
        if (shuffleMode.getMin) {
            shuffleMode.getMin();
        }
        for (int i = shuffleMode.length - 1; i >= 0; i--) {
            PlaybackStateCompat.ShuffleMode<ComponentHost> shuffleMode2 = this.equals;
            if (shuffleMode2.getMin) {
                shuffleMode2.getMin();
            }
            ((ComponentHost) shuffleMode2.setMin[i]).suppressInvalidations(z);
        }
    }

    private boolean getMax(LayoutState layoutState, int i) {
        LayoutState layoutState2;
        pageScroll pagescroll;
        if (!setMax(layoutState) || !equals() || this.hashCode == null || (layoutState2 = this.FastBitmap$CoordinateSystem) == null || (pagescroll = layoutState2.toFloatRange.get(i).toString) == null) {
            return false;
        }
        return this.hashCode.length(pagescroll);
    }

    private BitSet IsOverlapping(LayoutState layoutState) {
        if (!keyToDirection.newSession) {
            return Mean$Arithmetic;
        }
        BitSet bitSet = new BitSet();
        for (int size = layoutState.toFloatRange.size() - 1; size >= 0; size--) {
            if (setMax(layoutState, size)) {
                bitSet.set(size);
            }
        }
        return bitSet;
    }

    private boolean setMax(LayoutState layoutState, int i) {
        if (!keyToDirection.newSession) {
            return false;
        }
        LayoutOutput layoutOutput = layoutState.toFloatRange.get(i);
        boolean z = (layoutOutput.IsOverlapping & 8) != 0;
        boolean contains = this.values.contains(layoutOutput.toString);
        if (!z || contains) {
            return false;
        }
        return true;
    }

    private length getMax(LayoutState layoutState, BitSet bitSet, List<Integer> list) {
        length length2 = this.extraCallback;
        int i = 0;
        length2.getMax = 0;
        length2.setMin = 0;
        length2.setMax = 0;
        if (this.setMin == null) {
            return this.extraCallback;
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.setMin;
            if (i >= jArr.length) {
                return this.extraCallback;
            }
            LayoutOutput length3 = layoutState.length(jArr[i]);
            int i3 = (length3 == null || bitSet.get(length3.FastBitmap$CoordinateSystem)) ? -1 : length3.FastBitmap$CoordinateSystem;
            ThreadUtils.getMax();
            WindowInsetsAnimationCompat$Callback$DispatchMode max = this.length.getMax(this.setMin[i], null);
            if (list.size() > i2 && list.get(i2).intValue() == i) {
                i = list.get(i2 + 1).intValue();
                i2 += 2;
            } else if (i3 == -1) {
                setMax(i, this.equals);
                this.extraCallback.setMax++;
            } else {
                long length4 = length(length3, layoutState, bitSet);
                if (max == null) {
                    this.extraCallback.setMax++;
                } else if (max.toFloatRange != this.equals.getMax(length4, null)) {
                    setMax(i, this.equals);
                    this.extraCallback.setMax++;
                } else if (i3 != i) {
                    max.toFloatRange.moveItem(max, i, i3);
                    this.extraCallback.setMin++;
                } else {
                    this.extraCallback.getMax++;
                }
            }
            i++;
        }
    }

    public final void setMin(int i, LayoutOutput layoutOutput, LayoutState layoutState) {
        LayoutOutput layoutOutput2 = layoutOutput;
        LayoutState layoutState2 = layoutState;
        if (!this.getCause.get(i)) {
            long nanoTime = System.nanoTime();
            long length2 = length(layoutOutput2, layoutState2, this.getCause);
            ComponentHost max = this.equals.getMax(length2, null);
            if (max == null) {
                int intValue = layoutState2.IsOverlapping.getMax(length2, -1).intValue();
                setMin(intValue, layoutState2.toFloatRange.get(intValue), layoutState2);
                max = this.equals.getMax(length2, null);
            }
            ComponentHost componentHost = max;
            isStopped isstopped = layoutOutput2.getMin;
            if (isstopped != null) {
                Object max2 = NotificationCompatSideChannelService.getMax(this.toIntRange.setMin, (ComponentLifecycle) isstopped);
                ensureProcessorRunningLocked ensureprocessorrunninglocked = isstopped.FastBitmap$CoordinateSystem;
                if (ensureprocessorrunninglocked == null) {
                    ensureprocessorrunninglocked = this.toIntRange;
                }
                ensureProcessorRunningLocked ensureprocessorrunninglocked2 = ensureprocessorrunninglocked;
                isstopped.getMin(ensureprocessorrunninglocked2, max2);
                if (isStopped.setMin(isstopped)) {
                    ComponentHost componentHost2 = (ComponentHost) max2;
                    componentHost2.setParentHostMarker(length2);
                    length(layoutOutput2.getMax, componentHost2);
                }
                WindowInsetsAnimationCompat$Callback$DispatchMode length3 = length(i, isstopped, max2, componentHost, layoutOutput);
                isstopped.setMax(ensureprocessorrunninglocked2, max2);
                length3.equals = true;
                length3.length = setMax(max2, this.toFloatRange.getComponentTree().toFloatRange());
                getMin(layoutOutput2, layoutState2, this.getCause, create);
                setMax(length3.length != null ? length3.length : length3.setMax, create.left, create.top, create.right, create.bottom, true);
                if (this.IsOverlapping.FastBitmap$CoordinateSystem) {
                    List<Double> list = this.IsOverlapping.equals;
                    double nanoTime2 = (double) (System.nanoTime() - nanoTime);
                    Double.isNaN(nanoTime2);
                    list.add(Double.valueOf(nanoTime2 / 1000000.0d));
                    this.IsOverlapping.getMin.add(isstopped.valueOf);
                    this.IsOverlapping.IsOverlapping++;
                    this.IsOverlapping.setMax.add(ViewCompat$FocusRelativeDirection.getMax(isstopped, ensureprocessorrunninglocked2.getMin));
                    return;
                }
                return;
            }
            throw new RuntimeException("Trying to mount a LayoutOutput with a null Component.");
        }
    }

    @VisibleForTesting
    @Nullable
    private static Object setMax(Object obj, boolean z) {
        if (Build.VERSION.SDK_INT < 21 || z || (obj instanceof RippleDrawable) || (((obj instanceof ViewCompat$FocusRealDirection) && (((ViewCompat$FocusRealDirection) obj).getCurrent() instanceof RippleDrawable)) || !(obj instanceof Drawable) || !keyToDirection.onTransact)) {
            return null;
        }
        return NotificationCompatSideChannelService.setMin((Drawable) obj);
    }

    private WindowInsetsAnimationCompat$Callback$DispatchMode length(int i, isStopped isstopped, Object obj, ComponentHost componentHost, LayoutOutput layoutOutput) {
        WindowInsetsAnimationCompat$Callback$DispatchMode min = NotificationCompatSideChannelService.setMin(isstopped, componentHost, obj, layoutOutput);
        this.length.setMax(this.setMin[i], min);
        layoutOutput.getMin(create);
        componentHost.mount(i, min, create);
        setMax(min);
        return min;
    }

    public static void setMax(Object obj, int i, int i2, int i3, int i4, boolean z) {
        ThreadUtils.getMax();
        if (obj instanceof View) {
            getWorkEnqueuer.length((View) obj, i, i2, i3, i4, z);
        } else if (obj instanceof Drawable) {
            ((Drawable) obj).setBounds(i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Unsupported mounted content ".concat(String.valueOf(obj)));
        }
    }

    private static void getMin(LayoutOutput layoutOutput, LayoutState layoutState, BitSet bitSet, Rect rect) {
        long length2 = length(layoutOutput, layoutState, bitSet);
        layoutOutput.getMin(rect);
        long j = layoutOutput.toFloatRange;
        while (j != length2) {
            LayoutOutput length3 = layoutState.length(j);
            length3.getMin(b);
            rect.offset(b.left, b.top);
            j = length3.toFloatRange;
        }
    }

    private static void setMax(View view) {
        boolean z = view instanceof ComponentHost;
        if (z || view.getTag(dispatchNestedPreFling.setMax.length) != null) {
            view.setTag(dispatchNestedPreFling.setMax.length, (Object) null);
            if (!z) {
                ViewCompat.getMin(view, (setOnCancelListener) null);
            }
        }
    }

    static onStopCurrentWork setMin(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).getComponentClickListener();
        }
        return (onStopCurrentWork) view.getTag(dispatchNestedPreFling.setMax.getMin);
    }

    static checkPermission getMin(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).getComponentLongClickListener();
        }
        return (checkPermission) view.getTag(dispatchNestedPreFling.setMax.getMax);
    }

    static RemoteActionCompat getMax(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).getComponentTouchListener();
        }
        return (RemoteActionCompat) view.getTag(dispatchNestedPreFling.setMax.setMin);
    }

    private static void length(View view, SparseArray<Object> sparseArray) {
        if (sparseArray != null) {
            if (view instanceof ComponentHost) {
                ((ComponentHost) view).setViewTags(sparseArray);
                return;
            }
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                view.setTag(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    private static void setMin(View view, SparseArray<Object> sparseArray) {
        if (view instanceof ComponentHost) {
            ((ComponentHost) view).setViewTags((SparseArray<Object>) null);
        } else if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                view.setTag(sparseArray.keyAt(i), (Object) null);
            }
        }
    }

    private static void getMin(View view, ViewCompat$ScrollIndicators viewCompat$ScrollIndicators) {
        if (Build.VERSION.SDK_INT >= 11 && viewCompat$ScrollIndicators.toIntRange()) {
            if (view.getScaleX() != 1.0f) {
                view.setScaleX(1.0f);
            }
            if (view.getScaleY() != 1.0f) {
                view.setScaleY(1.0f);
            }
        }
    }

    private static void getMax(View view, computeHorizontalScrollRange computehorizontalscrollrange) {
        if (Build.VERSION.SDK_INT >= 17) {
            int i = AnonymousClass4.setMin[computehorizontalscrollrange.equals.ordinal()];
            int i2 = 2;
            if (i == 1) {
                i2 = 0;
            } else if (i == 2) {
                i2 = 1;
            }
            view.setLayoutDirection(i2);
        }
    }

    /* renamed from: o.WindowInsetsCompat$Type$InsetsType$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.yoga.YogaDirection[] r0 = com.facebook.yoga.YogaDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.facebook.yoga.YogaDirection r1 = com.facebook.yoga.YogaDirection.LTR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaDirection r1 = com.facebook.yoga.YogaDirection.RTL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Type$InsetsType.AnonymousClass4.<clinit>():void");
        }
    }

    private static void getMin(View view, boolean z) {
        ThreadUtils.getMax();
        if (view instanceof LithoView) {
            LithoView lithoView = (LithoView) view;
            if (!lithoView.isIncrementalMountEnabled()) {
                return;
            }
            if (!z) {
                Rect isInside2 = NotificationCompatSideChannelService.isInside();
                isInside2.set(0, 0, view.getWidth(), view.getHeight());
                lithoView.performIncrementalMount(isInside2, false);
                NotificationCompatSideChannelService.setMax(isInside2);
                return;
            }
            lithoView.performIncrementalMount();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                getMin(viewGroup.getChildAt(i), z);
            }
        }
    }

    private void getMax(hide<WindowInsetsAnimationCompat$Callback$DispatchMode> hide) {
        setMin(hide.getMax().isInside);
        short s = hide.getMin;
        for (int i = 0; i < s; i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode = (WindowInsetsAnimationCompat$Callback$DispatchMode) hide.setMax[hide.getMax(i)];
            if (hide.getMax(i) == 3) {
                ComponentHost componentHost = (ComponentHost) windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
                for (int mountItemCount = componentHost.getMountItemCount() - 1; mountItemCount >= 0; mountItemCount--) {
                    getMax(this.toIntRange, componentHost.getMountItemAt(mountItemCount));
                }
                if (componentHost.getMountItemCount() > 0) {
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            windowInsetsAnimationCompat$Callback$DispatchMode.toFloatRange.unmountDisappearingItem(windowInsetsAnimationCompat$Callback$DispatchMode);
            getMin(windowInsetsAnimationCompat$Callback$DispatchMode);
            isStopped isstopped = windowInsetsAnimationCompat$Callback$DispatchMode.setMin;
            Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
            if (windowInsetsAnimationCompat$Callback$DispatchMode.equals()) {
                windowInsetsAnimationCompat$Callback$DispatchMode.equals = false;
            }
            isstopped.setMin(obj);
            NotificationCompatSideChannelService.getMin(this.toIntRange.setMin, windowInsetsAnimationCompat$Callback$DispatchMode);
        }
    }

    public final void toIntRange() {
        if (this.hashCode != null) {
            for (hide<WindowInsetsAnimationCompat$Callback$DispatchMode> max : this.invokeSuspend.values()) {
                getMax(max);
            }
            this.invokeSuspend.clear();
            this.values.clear();
            smoothScrollBy smoothscrollby = this.hashCode;
            for (pageScroll pagescroll : smoothscrollby.length.getMin.keySet()) {
                smoothScrollBy.getMin getmin = (smoothScrollBy.getMin) smoothscrollby.length.getMin.get(pagescroll);
                smoothScrollBy.getMax(getmin, (hide<Object>) null);
                smoothScrollBy.setMax(getmin);
            }
            getScrollRange<smoothScrollBy.getMin> getscrollrange = smoothscrollby.length;
            getscrollrange.getMax.clear();
            getscrollrange.setMax.clear();
            getscrollrange.length.clear();
            getscrollrange.getMin.clear();
            smoothscrollby.setMax.length();
            smoothscrollby.getMin.clear();
            for (int size = smoothscrollby.setMin.size() - 1; size >= 0; size--) {
                smoothscrollby.setMin.get(size).setMin();
            }
            smoothscrollby.setMin.clear();
            smoothscrollby.isInside = null;
            this.valueOf = null;
        }
    }

    private void getMax(LayoutState layoutState, int i, boolean z) {
        int min = setMin(layoutState, i);
        for (int i2 = i; i2 <= min; i2++) {
            if (z) {
                int[] iArr = this.valueOf;
                iArr[i2] = iArr[i2] + 1;
            } else {
                int[] iArr2 = this.valueOf;
                int i3 = iArr2[i2] - 1;
                iArr2[i2] = i3;
                if (i3 < 0) {
                    throw new RuntimeException("Decremented animation lock count below 0!");
                }
            }
        }
        long j = layoutState.toFloatRange.get(i).toFloatRange;
        while (j != 0) {
            int intValue = layoutState.IsOverlapping.getMax(j, -1).intValue();
            if (z) {
                int[] iArr3 = this.valueOf;
                iArr3[intValue] = iArr3[intValue] + 1;
            } else {
                int[] iArr4 = this.valueOf;
                int i4 = iArr4[intValue] - 1;
                iArr4[intValue] = i4;
                if (i4 < 0) {
                    throw new RuntimeException("Decremented animation lock count below 0!");
                }
            }
            j = layoutState.toFloatRange.get(intValue).toFloatRange;
        }
    }

    public final boolean setMax(LayoutState layoutState) {
        if (this.setMax) {
            return this.toString == layoutState.Mean$Arithmetic || this.toDoubleRange;
        }
        return false;
    }

    public final boolean equals() {
        return this.invoke != null;
    }

    public final void length(pageScroll pagescroll) {
        hide remove = this.invokeSuspend.remove(pagescroll);
        if (remove != null) {
            getMax((hide<WindowInsetsAnimationCompat$Callback$DispatchMode>) remove);
            return;
        }
        this.values.remove(pagescroll);
        hide hide = this.FastBitmap$CoordinateSystem.b.get(pagescroll);
        if (hide != null) {
            short s = hide.getMin;
            int i = 0;
            for (int i2 = 0; i2 < s; i2++) {
                int i3 = ((LayoutOutput) hide.setMax[hide.getMax(i2)]).FastBitmap$CoordinateSystem;
                getMax(this.FastBitmap$CoordinateSystem, i3, false);
                if (setMax(this.FastBitmap$CoordinateSystem, i3)) {
                    this.getCause.set(i3);
                    setMax(i3, this.equals);
                    int min = setMin(this.FastBitmap$CoordinateSystem, i3);
                    while (true) {
                        i3++;
                        if (i3 > min) {
                            break;
                        }
                        setMin(i3, this.FastBitmap$CoordinateSystem.toFloatRange.get(i3), this.FastBitmap$CoordinateSystem);
                    }
                }
            }
            if (keyToDirection.getMax && this.values.isEmpty()) {
                int length2 = this.valueOf.length;
                while (i < length2) {
                    if (this.valueOf[i] == 0) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("No running animations but index ");
                        sb.append(i);
                        sb.append(" is still animation locked!");
                        throw new RuntimeException(sb.toString());
                    }
                }
            }
        }
    }

    static class length {
        int getMax;
        int setMax;
        int setMin;

        /* synthetic */ length(byte b) {
            this();
        }

        private length() {
            this.setMax = 0;
            this.setMin = 0;
            this.getMax = 0;
        }
    }

    public static class setMax {
        public boolean FastBitmap$CoordinateSystem;
        public int IsOverlapping;
        public boolean Mean$Arithmetic;
        public List<Double> equals;
        public List<String> getMax;
        public List<String> getMin;
        public int hashCode;
        public List<Double> isInside;
        public List<String> length;
        public List<String> setMax;
        public List<String> setMin;
        public int toDoubleRange;
        public List<Double> toFloatRange;
        public List<Double> toIntRange;
        public int toString;
        public double values;

        private setMax() {
        }

        /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void IsOverlapping() {
        ThreadUtils.getMax();
        if (this.setMin != null) {
            NotificationCompat$StreamType.setMin();
            for (long max : this.setMin) {
                ThreadUtils.getMax();
                WindowInsetsAnimationCompat$Callback$DispatchMode max2 = this.length.getMax(max, null);
                if (max2 != null && max2.equals()) {
                    max2.equals = false;
                }
            }
            setMin();
        }
    }

    public final boolean getMax(int i) {
        int[] iArr = this.valueOf;
        if (iArr != null && iArr[i] > 0) {
            return true;
        }
        return false;
    }

    public final boolean setMax(LayoutState layoutState, Rect rect, boolean z) {
        int intValue;
        LayoutState layoutState2 = layoutState;
        Rect rect2 = rect;
        if (this.isInside.isEmpty() || rect2.left != this.isInside.left || rect2.right != this.isInside.right) {
            return false;
        }
        ArrayList<LayoutOutput> arrayList = layoutState2.toIntRange;
        ArrayList<LayoutOutput> arrayList2 = layoutState2.values;
        int size = layoutState2.toFloatRange.size();
        if (rect2.top > 0 || this.isInside.top > 0) {
            while (this.onMessageChannelReady < size && rect2.top >= arrayList2.get(this.onMessageChannelReady).setMax.bottom) {
                int intValue2 = layoutState2.IsOverlapping.getMax(arrayList2.get(this.onMessageChannelReady).getMax, -1).intValue();
                if (!getMax(intValue2)) {
                    setMax(intValue2, this.equals);
                }
                this.onMessageChannelReady++;
            }
            while (this.onMessageChannelReady > 0 && rect2.top < arrayList2.get(this.onMessageChannelReady - 1).setMax.bottom) {
                int i = this.onMessageChannelReady - 1;
                this.onMessageChannelReady = i;
                LayoutOutput layoutOutput = arrayList2.get(i);
                int intValue3 = layoutState2.IsOverlapping.getMax(layoutOutput.getMax, -1).intValue();
                ThreadUtils.getMax();
                if (this.length.getMax(this.setMin[intValue3], null) == null) {
                    setMin(layoutState2.IsOverlapping.getMax(layoutOutput.getMax, -1).intValue(), layoutOutput, layoutState2);
                    this.extraCallbackWithResult.add(Long.valueOf(layoutOutput.getMax));
                }
            }
        }
        int height = this.toFloatRange.getHeight();
        if (rect2.bottom < height || this.isInside.bottom < height) {
            while (this.onPostMessage < size && rect2.bottom > arrayList.get(this.onPostMessage).setMax.top) {
                LayoutOutput layoutOutput2 = arrayList.get(this.onPostMessage);
                int intValue4 = layoutState2.IsOverlapping.getMax(layoutOutput2.getMax, -1).intValue();
                ThreadUtils.getMax();
                if (this.length.getMax(this.setMin[intValue4], null) == null) {
                    setMin(layoutState2.IsOverlapping.getMax(layoutOutput2.getMax, -1).intValue(), layoutOutput2, layoutState2);
                    this.extraCallbackWithResult.add(Long.valueOf(layoutOutput2.getMax));
                }
                this.onPostMessage++;
            }
            while (this.onPostMessage > 0 && rect2.bottom <= arrayList.get(this.onPostMessage - 1).setMax.top) {
                int i2 = this.onPostMessage - 1;
                this.onPostMessage = i2;
                int intValue5 = layoutState2.IsOverlapping.getMax(arrayList.get(i2).getMax, -1).intValue();
                if (!getMax(intValue5)) {
                    setMax(intValue5, this.equals);
                }
            }
        }
        PlaybackStateCompat.ShuffleMode<WindowInsetsAnimationCompat$Callback$DispatchMode> shuffleMode = this.ICustomTabsCallback;
        if (shuffleMode.getMin) {
            shuffleMode.getMin();
        }
        int i3 = shuffleMode.length;
        for (int i4 = 0; i4 < i3; i4++) {
            PlaybackStateCompat.ShuffleMode<WindowInsetsAnimationCompat$Callback$DispatchMode> shuffleMode2 = this.ICustomTabsCallback;
            if (shuffleMode2.getMin) {
                shuffleMode2.getMin();
            }
            WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode = (WindowInsetsAnimationCompat$Callback$DispatchMode) shuffleMode2.setMin[i4];
            PlaybackStateCompat.ShuffleMode<WindowInsetsAnimationCompat$Callback$DispatchMode> shuffleMode3 = this.ICustomTabsCallback;
            if (shuffleMode3.getMin) {
                shuffleMode3.getMin();
            }
            long j = shuffleMode3.setMax[i4];
            if (!this.extraCallbackWithResult.contains(Long.valueOf(j)) && (intValue = layoutState2.IsOverlapping.getMax(j, -1).intValue()) != -1) {
                layoutState2.toFloatRange.get(intValue);
                if (isStopped.length(windowInsetsAnimationCompat$Callback$DispatchMode.setMin)) {
                    getMin((View) windowInsetsAnimationCompat$Callback$DispatchMode.setMax, z);
                }
            }
            boolean z2 = z;
        }
        this.extraCallbackWithResult.clear();
        return true;
    }

    private void length(ComponentHost componentHost) {
        if (componentHost.hasDisappearingItems()) {
            List<pageScroll> disappearingItemTransitionIds = componentHost.getDisappearingItemTransitionIds();
            int size = disappearingItemTransitionIds.size();
            for (int i = 0; i < size; i++) {
                smoothScrollBy.getMin getmin = (smoothScrollBy.getMin) this.hashCode.length.getMin.get(disappearingItemTransitionIds.get(i));
                if (getmin != null) {
                    smoothScrollBy.getMax(getmin, (hide<Object>) null);
                }
            }
        }
    }

    public final void getMax(LayoutState layoutState, ComponentTree componentTree) {
        ThreadUtils.getMax();
        if (!this.Grayscale$Algorithm) {
            ArrayList arrayList = new ArrayList();
            if (layoutState.create != null) {
                arrayList.addAll(layoutState.create);
            }
            componentTree.setMax(layoutState);
            toIntRange(layoutState);
            componentTree.setMin((List<Transition>) arrayList, layoutState.toDoubleRange);
            Transition.getMin getmin = new Transition.getMin();
            Transition.getMin getmin2 = new Transition.getMin();
            pageScroll pagescroll = layoutState.FastBitmap$CoordinateSystem;
            if (pagescroll != null) {
                int i = 0;
                int size = arrayList.size();
                while (i < size) {
                    Transition transition = (Transition) arrayList.get(i);
                    if (transition != null) {
                        computeVerticalScrollRange.getMax(pagescroll, transition, computeScroll.setMin, getmin);
                        computeVerticalScrollRange.getMax(pagescroll, transition, computeScroll.getMax, getmin2);
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("NULL_TRANSITION when collecting root bounds anim. Root: ");
                        sb.append(layoutState.toDoubleRange);
                        sb.append(", root TransitionId: ");
                        sb.append(pagescroll);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (!getmin.setMax) {
                getmin = null;
            }
            if (!getmin2.setMax) {
                getmin2 = null;
            }
            componentTree.invokeSuspend = getmin;
            componentTree.invoke = getmin2;
            this.invoke = smoothScrollBy.setMin((List<Transition>) arrayList);
            this.Grayscale$Algorithm = true;
        }
    }

    public final void isInside() {
        LayoutState layoutState = this.FastBitmap$CoordinateSystem;
        if (layoutState != null) {
            layoutState.length();
            this.FastBitmap$CoordinateSystem = null;
        }
    }

    public static boolean getMax(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        if (windowInsetsAnimationCompat$Callback$DispatchMode == null) {
            return false;
        }
        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        if ((obj instanceof ComponentHost) && ((ComponentHost) obj).getMountItemCount() > 0) {
            return true;
        }
        return false;
    }

    private static boolean getMin(measureChild measurechild, Rect rect, Rect rect2) {
        float f = measurechild.setMax;
        float f2 = measurechild.getMin;
        if (f == 0.0f && f2 == 0.0f) {
            return true;
        }
        if (!length(f, rect.height(), rect2.height()) || !length(f2, rect.width(), rect2.width())) {
            return false;
        }
        return true;
    }

    public final boolean getMax(LayoutOutput layoutOutput, LayoutState layoutState, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode, boolean z, int i, int i2) {
        LayoutOutput layoutOutput2 = layoutOutput;
        WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode2 = windowInsetsAnimationCompat$Callback$DispatchMode;
        int i3 = i2;
        isStopped isstopped = layoutOutput2.getMin;
        isStopped isstopped2 = windowInsetsAnimationCompat$Callback$DispatchMode2.setMin;
        if (isstopped != null) {
            boolean max = getMax(layoutOutput2, windowInsetsAnimationCompat$Callback$DispatchMode2, z);
            boolean z2 = max || setMin(layoutOutput2, windowInsetsAnimationCompat$Callback$DispatchMode2);
            if (max) {
                if (this.toString != i && isStopped.setMin(windowInsetsAnimationCompat$Callback$DispatchMode2.setMin)) {
                    length((ComponentHost) windowInsetsAnimationCompat$Callback$DispatchMode2.setMax);
                }
                isStopped isstopped3 = windowInsetsAnimationCompat$Callback$DispatchMode2.setMin;
                if (isStopped.length(isstopped3)) {
                    setMax(windowInsetsAnimationCompat$Callback$DispatchMode2, isStopped.setMin(isstopped3));
                }
                windowInsetsAnimationCompat$Callback$DispatchMode2.toFloatRange.maybeUnregisterTouchExpansion(i3, windowInsetsAnimationCompat$Callback$DispatchMode2);
            } else if (z2) {
                isStopped isstopped4 = windowInsetsAnimationCompat$Callback$DispatchMode2.setMin;
                if (isStopped.length(isstopped4)) {
                    setMax(windowInsetsAnimationCompat$Callback$DispatchMode2, isStopped.setMin(isstopped4));
                }
                windowInsetsAnimationCompat$Callback$DispatchMode2.toFloatRange.maybeUnregisterTouchExpansion(i3, windowInsetsAnimationCompat$Callback$DispatchMode2);
            }
            if (windowInsetsAnimationCompat$Callback$DispatchMode.equals()) {
                windowInsetsAnimationCompat$Callback$DispatchMode2.equals = false;
            }
            windowInsetsAnimationCompat$Callback$DispatchMode2.setMin = layoutOutput2.getMin;
            if (windowInsetsAnimationCompat$Callback$DispatchMode2.setMin != null) {
                windowInsetsAnimationCompat$Callback$DispatchMode2.toDoubleRange = layoutOutput2.IsOverlapping;
                windowInsetsAnimationCompat$Callback$DispatchMode2.IsOverlapping = layoutOutput2.values;
                windowInsetsAnimationCompat$Callback$DispatchMode2.toIntRange = layoutOutput2.hashCode;
                windowInsetsAnimationCompat$Callback$DispatchMode2.isInside = layoutOutput2.toString;
                windowInsetsAnimationCompat$Callback$DispatchMode.getMax();
                if (layoutOutput2.setMin != null) {
                    ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = layoutOutput2.setMin;
                    if (viewCompat$ScrollIndicators.getMax.getAndIncrement() > 0) {
                        windowInsetsAnimationCompat$Callback$DispatchMode2.getMin = viewCompat$ScrollIndicators;
                    } else {
                        throw new IllegalStateException("The NodeInfo being acquired wasn't correctly initialized.");
                    }
                }
                if (layoutOutput2.length != null) {
                    computeHorizontalScrollRange computehorizontalscrollrange = layoutOutput2.length;
                    if (computehorizontalscrollrange.getMax.getAndIncrement() > 0) {
                        windowInsetsAnimationCompat$Callback$DispatchMode2.getMax = computehorizontalscrollrange;
                    } else {
                        throw new IllegalStateException("The ViewNodeInfo being acquired wasn't correctly initialized.");
                    }
                }
                if (max) {
                    windowInsetsAnimationCompat$Callback$DispatchMode2.toFloatRange.maybeRegisterTouchExpansion(i3, windowInsetsAnimationCompat$Callback$DispatchMode2);
                    isStopped isstopped5 = layoutOutput2.getMin;
                    if (!isStopped.setMin(isstopped5)) {
                        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode2.setMax;
                        isstopped2.setMin(obj);
                        ensureProcessorRunningLocked ensureprocessorrunninglocked = isstopped5.FastBitmap$CoordinateSystem;
                        if (ensureprocessorrunninglocked == null) {
                            ensureprocessorrunninglocked = this.toIntRange;
                        }
                        isstopped5.getMin(ensureprocessorrunninglocked, obj);
                    }
                    setMax(windowInsetsAnimationCompat$Callback$DispatchMode);
                } else if (z2) {
                    windowInsetsAnimationCompat$Callback$DispatchMode2.toFloatRange.maybeRegisterTouchExpansion(i3, windowInsetsAnimationCompat$Callback$DispatchMode2);
                    setMax(windowInsetsAnimationCompat$Callback$DispatchMode);
                }
                Object obj2 = windowInsetsAnimationCompat$Callback$DispatchMode2.setMax;
                ensureProcessorRunningLocked ensureprocessorrunninglocked2 = isstopped.FastBitmap$CoordinateSystem;
                if (ensureprocessorrunninglocked2 == null) {
                    ensureprocessorrunninglocked2 = this.toIntRange;
                }
                isstopped.setMax(ensureprocessorrunninglocked2, obj2);
                windowInsetsAnimationCompat$Callback$DispatchMode2.equals = true;
                BitSet bitSet = this.getCause;
                if (layoutOutput2.getMax != 0) {
                    getMin(layoutOutput2, layoutState, bitSet, create);
                    setMax(windowInsetsAnimationCompat$Callback$DispatchMode2.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode2.length : windowInsetsAnimationCompat$Callback$DispatchMode2.setMax, create.left, create.top, create.right, create.bottom, isStopped.length(layoutOutput2.getMin) && ((View) windowInsetsAnimationCompat$Callback$DispatchMode2.setMax).isLayoutRequested());
                }
                if (windowInsetsAnimationCompat$Callback$DispatchMode.getMin()) {
                    windowInsetsAnimationCompat$Callback$DispatchMode2.toFloatRange.invalidateAccessibilityState();
                }
                if (windowInsetsAnimationCompat$Callback$DispatchMode2.setMax instanceof Drawable) {
                    NotificationCompat$Action$SemanticAction.getMax(windowInsetsAnimationCompat$Callback$DispatchMode2.toFloatRange, (Drawable) windowInsetsAnimationCompat$Callback$DispatchMode2.setMax, windowInsetsAnimationCompat$Callback$DispatchMode2.toDoubleRange, windowInsetsAnimationCompat$Callback$DispatchMode2.getMin);
                }
                return max;
            }
            throw new RuntimeException("Trying to update a MountItem with a null Component!");
        }
        throw new RuntimeException("Trying to update a MountItem with a null Component.");
    }

    private static boolean setMin(LayoutOutput layoutOutput, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        computeHorizontalScrollRange computehorizontalscrollrange = layoutOutput.length;
        computeHorizontalScrollRange computehorizontalscrollrange2 = windowInsetsAnimationCompat$Callback$DispatchMode.getMax;
        if ((computehorizontalscrollrange2 == null && computehorizontalscrollrange != null) || (computehorizontalscrollrange2 != null && !computehorizontalscrollrange2.setMin(computehorizontalscrollrange))) {
            return true;
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = layoutOutput.setMin;
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators2 = windowInsetsAnimationCompat$Callback$DispatchMode.getMin;
        if ((viewCompat$ScrollIndicators2 != null || viewCompat$ScrollIndicators == null) && (viewCompat$ScrollIndicators2 == null || viewCompat$ScrollIndicators2.setMax(viewCompat$ScrollIndicators))) {
            return false;
        }
        return true;
    }

    private static boolean getMax(LayoutOutput layoutOutput, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode, boolean z) {
        int i = layoutOutput.toDoubleRange;
        isStopped isstopped = windowInsetsAnimationCompat$Callback$DispatchMode.setMin;
        isStopped isstopped2 = layoutOutput.getMin;
        if (layoutOutput.hashCode != windowInsetsAnimationCompat$Callback$DispatchMode.toIntRange) {
            return true;
        }
        getMax(layoutOutput, windowInsetsAnimationCompat$Callback$DispatchMode);
        if (z) {
            if (i == 1) {
                if (!(isstopped instanceof PermissionInfoCompat$Protection) || !(isstopped2 instanceof PermissionInfoCompat$Protection) || !isstopped.setMax(isstopped, isstopped2)) {
                    return false;
                }
                return true;
            } else if (i == 2) {
            }
        }
        return true;
    }

    private static boolean getMax(LayoutOutput layoutOutput, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        int i;
        int i2;
        Rect rect = layoutOutput.setMax;
        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        int width = rect.width();
        boolean z = obj instanceof Drawable;
        if (z) {
            i = ((Drawable) obj).getBounds().width();
        } else {
            i = ((View) obj).getWidth();
        }
        if (width != i) {
            return false;
        }
        int height = rect.height();
        if (z) {
            i2 = ((Drawable) obj).getBounds().height();
        } else {
            i2 = ((View) obj).getHeight();
        }
        return height == i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019d, code lost:
        if (r7 != null) goto L_0x01a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(com.facebook.litho.LayoutState r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            long[] r2 = r0.setMin
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x01a0
            r7 = r6
            r2 = 0
        L_0x000d:
            long[] r8 = r0.setMin
            int r8 = r8.length
            if (r2 >= r8) goto L_0x019d
            boolean r8 = r0.getMax((com.facebook.litho.LayoutState) r1, (int) r2)
            if (r8 == 0) goto L_0x0197
            com.facebook.litho.LayoutState r8 = r0.FastBitmap$CoordinateSystem
            int r8 = setMin((com.facebook.litho.LayoutState) r8, (int) r2)
            com.facebook.litho.LayoutState r9 = r0.FastBitmap$CoordinateSystem
            java.util.List<com.facebook.litho.LayoutOutput> r9 = r9.toFloatRange
            java.lang.Object r9 = r9.get(r2)
            com.facebook.litho.LayoutOutput r9 = (com.facebook.litho.LayoutOutput) r9
            java.util.BitSet r10 = r0.getCause
            boolean r10 = r10.get(r2)
            if (r10 == 0) goto L_0x0053
            long r9 = r9.getMax
            int r11 = r2 + 1
        L_0x0034:
            if (r11 > r8) goto L_0x004e
            com.facebook.litho.LayoutState r12 = r0.FastBitmap$CoordinateSystem
            java.util.List<com.facebook.litho.LayoutOutput> r12 = r12.toFloatRange
            java.lang.Object r12 = r12.get(r11)
            com.facebook.litho.LayoutOutput r12 = (com.facebook.litho.LayoutOutput) r12
            long r12 = r12.toFloatRange
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x004b
            o.PlaybackStateCompat$ShuffleMode<com.facebook.litho.ComponentHost> r12 = r0.equals
            r0.setMax((int) r11, (o.PlaybackStateCompat.ShuffleMode<com.facebook.litho.ComponentHost>) r12)
        L_0x004b:
            int r11 = r11 + 1
            goto L_0x0034
        L_0x004e:
            java.util.BitSet r9 = r0.getCause
            r9.clear(r2)
        L_0x0053:
            r9 = r2
        L_0x0054:
            if (r9 > r8) goto L_0x0079
            com.facebook.litho.ThreadUtils.getMax()
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r10 = r0.length
            long[] r11 = r0.setMin
            r12 = r11[r9]
            java.lang.Object r10 = r10.getMax(r12, r6)
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r10 = (o.WindowInsetsAnimationCompat$Callback$DispatchMode) r10
            if (r10 != 0) goto L_0x0076
            com.facebook.litho.LayoutState r10 = r0.FastBitmap$CoordinateSystem
            java.util.List<com.facebook.litho.LayoutOutput> r10 = r10.toFloatRange
            java.lang.Object r10 = r10.get(r9)
            com.facebook.litho.LayoutOutput r10 = (com.facebook.litho.LayoutOutput) r10
            com.facebook.litho.LayoutState r11 = r0.FastBitmap$CoordinateSystem
            r0.setMin(r9, r10, r11)
        L_0x0076:
            int r9 = r9 + 1
            goto L_0x0054
        L_0x0079:
            com.facebook.litho.ThreadUtils.getMax()
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r9 = r0.length
            long[] r10 = r0.setMin
            r11 = r10[r2]
            java.lang.Object r9 = r9.getMax(r11, r6)
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r9 = (o.WindowInsetsAnimationCompat$Callback$DispatchMode) r9
            o.PlaybackStateCompat$ShuffleMode<com.facebook.litho.ComponentHost> r10 = r0.equals
            java.lang.Object r10 = r10.getMax(r4, r6)
            com.facebook.litho.ComponentHost r10 = (com.facebook.litho.ComponentHost) r10
            com.facebook.litho.ThreadUtils.getMax()
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r11 = r0.length
            long[] r12 = r0.setMin
            r13 = r12[r2]
            java.lang.Object r11 = r11.getMax(r13, r6)
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r11 = (o.WindowInsetsAnimationCompat$Callback$DispatchMode) r11
            com.facebook.litho.ComponentHost r12 = r11.toFloatRange
            if (r12 == r10) goto L_0x010b
            java.lang.Object r13 = r11.setMax
            com.facebook.litho.ComponentHost r12 = r11.toFloatRange
            r14 = 0
            r15 = 0
        L_0x00a9:
            if (r12 == r10) goto L_0x00be
            int r16 = r12.getLeft()
            int r14 = r14 + r16
            int r16 = r12.getTop()
            int r15 = r15 + r16
            android.view.ViewParent r12 = r12.getParent()
            com.facebook.litho.ComponentHost r12 = (com.facebook.litho.ComponentHost) r12
            goto L_0x00a9
        L_0x00be:
            boolean r12 = r13 instanceof android.view.View
            if (r12 == 0) goto L_0x00df
            r12 = r13
            android.view.View r12 = (android.view.View) r12
            int r16 = r12.getLeft()
            int r14 = r14 + r16
            int r16 = r12.getTop()
            int r15 = r15 + r16
            int r16 = r12.getWidth()
            int r16 = r14 + r16
            int r12 = r12.getHeight()
            int r12 = r12 + r15
            r17 = r12
            goto L_0x00fa
        L_0x00df:
            r12 = r13
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            android.graphics.Rect r12 = r12.getBounds()
            int r3 = r12.left
            int r14 = r14 + r3
            int r3 = r12.width()
            int r3 = r3 + r14
            int r4 = r12.top
            int r15 = r15 + r4
            int r4 = r12.height()
            int r4 = r4 + r15
            r16 = r3
            r17 = r4
        L_0x00fa:
            com.facebook.litho.ComponentHost r3 = r11.toFloatRange
            r3.unmount(r2, r11)
            r18 = 0
            setMax(r13, r14, r15, r16, r17, r18)
            android.graphics.Rect r3 = create
            r10.mount(r2, r11, r3)
            r11.toFloatRange = r10
        L_0x010b:
            r3 = r2
        L_0x010c:
            if (r3 > r8) goto L_0x014c
            com.facebook.litho.ThreadUtils.getMax()
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r4 = r0.length
            long[] r5 = r0.setMin
            r10 = r5[r3]
            java.lang.Object r4 = r4.getMax(r10, r6)
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r4 = (o.WindowInsetsAnimationCompat$Callback$DispatchMode) r4
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r5 = r0.length
            long[] r10 = r0.setMin
            r11 = r10[r3]
            r5.getMin((long) r11)
            o.isStopped r5 = r4.setMin
            boolean r5 = o.isStopped.setMin((o.isStopped) r5)
            if (r5 == 0) goto L_0x0149
            o.PlaybackStateCompat$ShuffleMode<com.facebook.litho.ComponentHost> r5 = r0.equals
            java.lang.Object r4 = r4.setMax
            com.facebook.litho.ComponentHost r4 = (com.facebook.litho.ComponentHost) r4
            int r4 = r5.length(r4)
            java.lang.Object[] r10 = r5.setMin
            r10 = r10[r4]
            java.lang.Object r11 = o.PlaybackStateCompat.ShuffleMode.getMax
            if (r10 == r11) goto L_0x0149
            java.lang.Object[] r10 = r5.setMin
            java.lang.Object r11 = o.PlaybackStateCompat.ShuffleMode.getMax
            r10[r4] = r11
            r4 = 1
            r5.getMin = r4
        L_0x0149:
            int r3 = r3 + 1
            goto L_0x010c
        L_0x014c:
            o.pageScroll r3 = r9.isInside
            java.util.Map<o.pageScroll, o.hide<o.WindowInsetsAnimationCompat$Callback$DispatchMode>> r4 = r0.invokeSuspend
            java.lang.Object r4 = r4.get(r3)
            o.hide r4 = (o.hide) r4
            if (r4 != 0) goto L_0x0162
            o.hide r4 = new o.hide
            r4.<init>()
            java.util.Map<o.pageScroll, o.hide<o.WindowInsetsAnimationCompat$Callback$DispatchMode>> r5 = r0.invokeSuspend
            r5.put(r3, r4)
        L_0x0162:
            long[] r3 = r0.setMin
            r10 = r3[r2]
            r12 = 0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x016e
            r3 = 3
            goto L_0x0175
        L_0x016e:
            r3 = 16
            long r10 = r10 >> r3
            r12 = 3
            long r10 = r10 & r12
            int r3 = (int) r10
        L_0x0175:
            r4.getMax(r3, r9)
            com.facebook.litho.ComponentHost r3 = r9.toFloatRange
            r3.startUnmountDisappearingItem(r2, r9)
            if (r7 != 0) goto L_0x0186
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            r7 = r3
        L_0x0186:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.add(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r7.add(r2)
            int r2 = r8 + 1
            goto L_0x0199
        L_0x0197:
            int r2 = r2 + 1
        L_0x0199:
            r4 = 0
            goto L_0x000d
        L_0x019d:
            if (r7 == 0) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x01a4:
            java.util.BitSet r2 = r19.IsOverlapping(r20)
            r0.getMax((com.facebook.litho.LayoutState) r1, (java.util.BitSet) r2, (java.util.List<java.lang.Integer>) r7)
            o.PlaybackStateCompat$ShuffleMode<com.facebook.litho.ComponentHost> r3 = r0.equals
            r4 = 0
            java.lang.Object r3 = r3.getMax(r4, r6)
            if (r3 != 0) goto L_0x01c1
            com.facebook.litho.LithoView r3 = r0.toFloatRange
            r0.length((long) r4, (com.facebook.litho.ComponentHost) r3)
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r3 = r0.length
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r6 = r0.onRelationshipValidationResult
            r3.setMax(r4, r6)
        L_0x01c1:
            java.util.List<com.facebook.litho.LayoutOutput> r3 = r1.toFloatRange
            int r3 = r3.size()
            long[] r4 = r0.setMin
            if (r4 == 0) goto L_0x01ce
            int r4 = r4.length
            if (r3 == r4) goto L_0x01d2
        L_0x01ce:
            long[] r4 = new long[r3]
            r0.setMin = r4
        L_0x01d2:
            r4 = 0
        L_0x01d3:
            if (r4 >= r3) goto L_0x01e6
            long[] r5 = r0.setMin
            java.util.List<com.facebook.litho.LayoutOutput> r6 = r1.toFloatRange
            java.lang.Object r6 = r6.get(r4)
            com.facebook.litho.LayoutOutput r6 = (com.facebook.litho.LayoutOutput) r6
            long r6 = r6.getMax
            r5[r4] = r6
            int r4 = r4 + 1
            goto L_0x01d3
        L_0x01e6:
            r0.getCause = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Type$InsetsType.setMin(com.facebook.litho.LayoutState):void");
    }

    private static long length(LayoutOutput layoutOutput, LayoutState layoutState, BitSet bitSet) {
        long j;
        if (bitSet.get(layoutOutput.FastBitmap$CoordinateSystem)) {
            return -1;
        }
        do {
            j = layoutOutput.toFloatRange;
            layoutOutput = layoutState.length(j);
        } while (bitSet.get(layoutOutput.FastBitmap$CoordinateSystem));
        return j;
    }

    private static void setMax(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        RemoteActionCompat remoteActionCompat;
        isStopped isstopped = windowInsetsAnimationCompat$Callback$DispatchMode.setMin;
        if (isStopped.length(isstopped)) {
            View view = (View) windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
            ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = windowInsetsAnimationCompat$Callback$DispatchMode.getMin;
            int i = 0;
            if (viewCompat$ScrollIndicators != null) {
                setMax(viewCompat$ScrollIndicators.values, view);
                getMin(viewCompat$ScrollIndicators.FastBitmap$CoordinateSystem, view);
                length(viewCompat$ScrollIndicators.toString, view);
                IconCompat<fullScroll> iconCompat = viewCompat$ScrollIndicators.toDoubleRange;
                if (iconCompat != null) {
                    boolean z = view instanceof ComponentHost;
                    if (z) {
                        remoteActionCompat = ((ComponentHost) view).getComponentTouchListener();
                    } else {
                        remoteActionCompat = (RemoteActionCompat) view.getTag(dispatchNestedPreFling.setMax.setMin);
                    }
                    if (remoteActionCompat == null) {
                        remoteActionCompat = new RemoteActionCompat();
                        if (z) {
                            ((ComponentHost) view).setComponentTouchListener(remoteActionCompat);
                        } else {
                            view.setOnTouchListener(remoteActionCompat);
                            view.setTag(dispatchNestedPreFling.setMax.setMin, remoteActionCompat);
                        }
                    }
                    remoteActionCompat.getMax = iconCompat;
                }
                IconCompat<getBridge> iconCompat2 = viewCompat$ScrollIndicators.valueOf;
                if (iconCompat2 != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).setInterceptTouchEventHandler(iconCompat2);
                }
                boolean z2 = view instanceof ComponentHost;
                if (z2 || viewCompat$ScrollIndicators.isInside()) {
                    view.setTag(dispatchNestedPreFling.setMax.length, viewCompat$ScrollIndicators);
                }
                Object obj = viewCompat$ScrollIndicators.length;
                if (z2) {
                    ((ComponentHost) view).setViewTag(obj);
                } else {
                    view.setTag(obj);
                }
                length(view, viewCompat$ScrollIndicators.setMin);
                float f = viewCompat$ScrollIndicators.getMin;
                if (f != 0.0f) {
                    ViewCompat.getMax(view, f);
                }
                ViewOutlineProvider viewOutlineProvider = viewCompat$ScrollIndicators.toIntRange;
                if (viewOutlineProvider != null && Build.VERSION.SDK_INT >= 21) {
                    view.setOutlineProvider(viewOutlineProvider);
                }
                boolean max = viewCompat$ScrollIndicators.setMax();
                if (max && Build.VERSION.SDK_INT >= 21) {
                    view.setClipToOutline(max);
                }
                if (viewCompat$ScrollIndicators.getMax() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(viewCompat$ScrollIndicators.length());
                }
                CharSequence charSequence = viewCompat$ScrollIndicators.setMax;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                int i2 = viewCompat$ScrollIndicators.onRelationshipValidationResult;
                if (i2 == 1) {
                    view.setFocusable(true);
                } else if (i2 == 2) {
                    view.setFocusable(false);
                }
                int i3 = viewCompat$ScrollIndicators.extraCallback;
                if (i3 == 1) {
                    view.setEnabled(true);
                } else if (i3 == 2) {
                    view.setEnabled(false);
                }
                int i4 = viewCompat$ScrollIndicators.onMessageChannelReady;
                if (i4 == 1) {
                    view.setSelected(true);
                } else if (i4 == 2) {
                    view.setSelected(false);
                }
                if (Build.VERSION.SDK_INT >= 11 && viewCompat$ScrollIndicators.toIntRange()) {
                    float f2 = viewCompat$ScrollIndicators.isInside;
                    view.setScaleX(f2);
                    view.setScaleY(f2);
                }
                if (Build.VERSION.SDK_INT >= 11 && viewCompat$ScrollIndicators.toFloatRange()) {
                    view.setAlpha(viewCompat$ScrollIndicators.IsOverlapping);
                }
                if (Build.VERSION.SDK_INT >= 11 && viewCompat$ScrollIndicators.equals()) {
                    view.setRotation(viewCompat$ScrollIndicators.hashCode);
                }
            }
            int i5 = windowInsetsAnimationCompat$Callback$DispatchMode.IsOverlapping;
            if (i5 != 0) {
                ViewCompat.setMin(view, i5);
            }
            computeHorizontalScrollRange computehorizontalscrollrange = windowInsetsAnimationCompat$Callback$DispatchMode.getMax;
            if (computehorizontalscrollrange != null) {
                length(view, computehorizontalscrollrange);
                if (!isStopped.setMin(isstopped)) {
                    onPerformActionForVirtualView<? extends Drawable> onperformactionforvirtualview = computehorizontalscrollrange.getMin;
                    if (onperformactionforvirtualview != null) {
                        view.getContext();
                        Drawable drawable = (Drawable) onPerformActionForVirtualView.setMin(onperformactionforvirtualview);
                        if (Build.VERSION.SDK_INT < 16) {
                            view.setBackgroundDrawable(drawable);
                        } else {
                            view.setBackground(drawable);
                        }
                    }
                    if (computehorizontalscrollrange.getMax()) {
                        int i6 = computehorizontalscrollrange.length != null ? computehorizontalscrollrange.length.left : 0;
                        int i7 = computehorizontalscrollrange.length != null ? computehorizontalscrollrange.length.top : 0;
                        int i8 = computehorizontalscrollrange.length != null ? computehorizontalscrollrange.length.right : 0;
                        if (computehorizontalscrollrange.length != null) {
                            i = computehorizontalscrollrange.length.bottom;
                        }
                        view.setPadding(i6, i7, i8, i);
                    }
                    setMax(view, computehorizontalscrollrange);
                    getMax(view, computehorizontalscrollrange);
                }
            }
        }
    }

    private static void getMin(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        isStopped isstopped = windowInsetsAnimationCompat$Callback$DispatchMode.setMin;
        if (isStopped.length(isstopped)) {
            setMax(windowInsetsAnimationCompat$Callback$DispatchMode, isStopped.setMin(isstopped));
        }
    }

    private static void setMax(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode, boolean z) {
        RemoteActionCompat remoteActionCompat;
        NotificationCompat$BadgeIconType notificationCompat$BadgeIconType;
        checkPermission checkpermission;
        onStopCurrentWork onstopcurrentwork;
        View view = (View) windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = windowInsetsAnimationCompat$Callback$DispatchMode.getMin;
        if (viewCompat$ScrollIndicators != null) {
            if (viewCompat$ScrollIndicators.values != null) {
                if (view instanceof ComponentHost) {
                    onstopcurrentwork = ((ComponentHost) view).getComponentClickListener();
                } else {
                    onstopcurrentwork = (onStopCurrentWork) view.getTag(dispatchNestedPreFling.setMax.getMin);
                }
                if (onstopcurrentwork != null) {
                    onstopcurrentwork.length = null;
                }
            }
            if (viewCompat$ScrollIndicators.FastBitmap$CoordinateSystem != null) {
                if (view instanceof ComponentHost) {
                    checkpermission = ((ComponentHost) view).getComponentLongClickListener();
                } else {
                    checkpermission = (checkPermission) view.getTag(dispatchNestedPreFling.setMax.getMax);
                }
                if (checkpermission != null) {
                    checkpermission.getMin = null;
                }
            }
            if (viewCompat$ScrollIndicators.toString != null) {
                if (view instanceof ComponentHost) {
                    notificationCompat$BadgeIconType = ((ComponentHost) view).getComponentFocusChangeListener();
                } else {
                    notificationCompat$BadgeIconType = (NotificationCompat$BadgeIconType) view.getTag(dispatchNestedPreFling.setMax.setMax);
                }
                if (notificationCompat$BadgeIconType != null) {
                    notificationCompat$BadgeIconType.length = null;
                }
            }
            if (viewCompat$ScrollIndicators.toDoubleRange != null) {
                if (view instanceof ComponentHost) {
                    remoteActionCompat = ((ComponentHost) view).getComponentTouchListener();
                } else {
                    remoteActionCompat = (RemoteActionCompat) view.getTag(dispatchNestedPreFling.setMax.setMin);
                }
                if (remoteActionCompat != null) {
                    remoteActionCompat.getMax = null;
                }
            }
            if (viewCompat$ScrollIndicators.valueOf != null && (view instanceof ComponentHost)) {
                ((ComponentHost) view).setInterceptTouchEventHandler((IconCompat<getBridge>) null);
            }
            if (view instanceof ComponentHost) {
                ((ComponentHost) view).setViewTag((Object) null);
            } else {
                view.setTag((Object) null);
            }
            setMin(view, viewCompat$ScrollIndicators.setMin);
            if (viewCompat$ScrollIndicators.getMin != 0.0f) {
                ViewCompat.getMax(view, 0.0f);
            }
            if (viewCompat$ScrollIndicators.toIntRange != null && Build.VERSION.SDK_INT >= 21) {
                view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            if (viewCompat$ScrollIndicators.setMax() && Build.VERSION.SDK_INT >= 21) {
                view.setClipToOutline(false);
            }
            if (!viewCompat$ScrollIndicators.length() && (view instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(true);
            }
            if (!TextUtils.isEmpty(viewCompat$ScrollIndicators.setMax)) {
                view.setContentDescription((CharSequence) null);
            }
            getMin(view, viewCompat$ScrollIndicators);
            if (Build.VERSION.SDK_INT >= 11 && viewCompat$ScrollIndicators.toFloatRange() && view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            if (Build.VERSION.SDK_INT >= 11 && viewCompat$ScrollIndicators.equals() && view.getRotation() != 0.0f) {
                view.setRotation(0.0f);
            }
        }
        view.setClickable(windowInsetsAnimationCompat$Callback$DispatchMode.setMax());
        view.setLongClickable(windowInsetsAnimationCompat$Callback$DispatchMode.length());
        view.setFocusable(windowInsetsAnimationCompat$Callback$DispatchMode.isInside());
        view.setEnabled(windowInsetsAnimationCompat$Callback$DispatchMode.IsOverlapping());
        view.setSelected(windowInsetsAnimationCompat$Callback$DispatchMode.toIntRange());
        if (windowInsetsAnimationCompat$Callback$DispatchMode.IsOverlapping != 0) {
            ViewCompat.setMin(view, 0);
        }
        setMax(view);
        computeHorizontalScrollRange computehorizontalscrollrange = windowInsetsAnimationCompat$Callback$DispatchMode.getMax;
        if (computehorizontalscrollrange != null) {
            setMin(view, computehorizontalscrollrange);
            if (!z) {
                if (computehorizontalscrollrange.getMax()) {
                    view.setPadding(0, 0, 0, 0);
                }
                onPerformActionForVirtualView<? extends Drawable> onperformactionforvirtualview = computehorizontalscrollrange.getMin;
                view.getBackground();
                if (onperformactionforvirtualview != null) {
                    if (Build.VERSION.SDK_INT < 16) {
                        view.setBackgroundDrawable((Drawable) null);
                    } else {
                        view.setBackground((Drawable) null);
                    }
                    view.getContext();
                }
                if (computehorizontalscrollrange.setMax != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        view.setForeground((Drawable) null);
                    } else {
                        throw new IllegalStateException("MountState has a ViewNodeInfo with foreground however the current Android version doesn't support foreground on Views");
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    view.setLayoutDirection(2);
                }
            }
        }
    }

    private static void setMax(IconCompat<FrameMetricsAggregator$MetricType> iconCompat, View view) {
        onStopCurrentWork onstopcurrentwork;
        if (iconCompat != null) {
            boolean z = view instanceof ComponentHost;
            if (z) {
                onstopcurrentwork = ((ComponentHost) view).getComponentClickListener();
            } else {
                onstopcurrentwork = (onStopCurrentWork) view.getTag(dispatchNestedPreFling.setMax.getMin);
            }
            if (onstopcurrentwork == null) {
                onstopcurrentwork = new onStopCurrentWork();
                if (z) {
                    ((ComponentHost) view).setComponentClickListener(onstopcurrentwork);
                } else {
                    view.setOnClickListener(onstopcurrentwork);
                    view.setTag(dispatchNestedPreFling.setMax.getMin, onstopcurrentwork);
                }
            }
            onstopcurrentwork.length = iconCompat;
            view.setClickable(true);
        }
    }

    private static void getMin(IconCompat<ViewCompat$FocusDirection> iconCompat, View view) {
        checkPermission checkpermission;
        if (iconCompat != null) {
            boolean z = view instanceof ComponentHost;
            if (z) {
                checkpermission = ((ComponentHost) view).getComponentLongClickListener();
            } else {
                checkpermission = (checkPermission) view.getTag(dispatchNestedPreFling.setMax.getMax);
            }
            if (checkpermission == null) {
                checkpermission = new checkPermission();
                if (z) {
                    ((ComponentHost) view).setComponentLongClickListener(checkpermission);
                } else {
                    view.setOnLongClickListener(checkpermission);
                    view.setTag(dispatchNestedPreFling.setMax.getMax, checkpermission);
                }
            }
            checkpermission.getMin = iconCompat;
            view.setLongClickable(true);
        }
    }

    private static void length(IconCompat<GnssStatusCompat$ConstellationType> iconCompat, View view) {
        NotificationCompat$BadgeIconType notificationCompat$BadgeIconType;
        if (iconCompat != null) {
            boolean z = view instanceof ComponentHost;
            if (z) {
                notificationCompat$BadgeIconType = ((ComponentHost) view).getComponentFocusChangeListener();
            } else {
                notificationCompat$BadgeIconType = (NotificationCompat$BadgeIconType) view.getTag(dispatchNestedPreFling.setMax.setMax);
            }
            if (notificationCompat$BadgeIconType == null) {
                notificationCompat$BadgeIconType = new NotificationCompat$BadgeIconType();
                if (z) {
                    ((ComponentHost) view).setComponentFocusChangeListener(notificationCompat$BadgeIconType);
                } else {
                    view.setOnFocusChangeListener(notificationCompat$BadgeIconType);
                    view.setTag(dispatchNestedPreFling.setMax.setMax, notificationCompat$BadgeIconType);
                }
            }
            notificationCompat$BadgeIconType.length = iconCompat;
        }
    }

    private static void setMax(View view, computeHorizontalScrollRange computehorizontalscrollrange) {
        getVirtualViewAt getvirtualviewat = computehorizontalscrollrange.setMax;
        if (getvirtualviewat == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(getvirtualviewat);
            return;
        }
        throw new IllegalStateException("MountState has a ViewNodeInfo with foreground however the current Android version doesn't support foreground on Views");
    }

    private static void length(View view, computeHorizontalScrollRange computehorizontalscrollrange) {
        StateListAnimator stateListAnimator = computehorizontalscrollrange.toIntRange;
        int i = computehorizontalscrollrange.isInside;
        if (stateListAnimator != null || i != 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                if (stateListAnimator == null) {
                    stateListAnimator = AnimatorInflater.loadStateListAnimator(view.getContext(), i);
                }
                view.setStateListAnimator(stateListAnimator);
                return;
            }
            throw new IllegalStateException("MountState has a ViewNodeInfo with stateListAnimator, however the current Android version doesn't support stateListAnimator on Views");
        }
    }

    private static void setMin(View view, computeHorizontalScrollRange computehorizontalscrollrange) {
        if (computehorizontalscrollrange.toIntRange != null || computehorizontalscrollrange.isInside != 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setStateListAnimator((StateListAnimator) null);
                return;
            }
            throw new IllegalStateException("MountState has a ViewNodeInfo with stateListAnimator, however the current Android version doesn't support stateListAnimator on Views");
        }
    }

    private void getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        setMin(windowInsetsAnimationCompat$Callback$DispatchMode.isInside);
        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        if (obj instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) obj;
            for (int mountItemCount = componentHost.getMountItemCount() - 1; mountItemCount >= 0; mountItemCount--) {
                getMax(ensureprocessorrunninglocked, componentHost.getMountItemAt(mountItemCount));
            }
            if (componentHost.getMountItemCount() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        windowInsetsAnimationCompat$Callback$DispatchMode.toFloatRange.unmount(windowInsetsAnimationCompat$Callback$DispatchMode);
        getMin(windowInsetsAnimationCompat$Callback$DispatchMode);
        isStopped isstopped = windowInsetsAnimationCompat$Callback$DispatchMode.setMin;
        Object obj2 = windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        if (windowInsetsAnimationCompat$Callback$DispatchMode.equals()) {
            windowInsetsAnimationCompat$Callback$DispatchMode.equals = false;
        }
        isstopped.setMin(obj2);
        NotificationCompatSideChannelService.getMin(ensureprocessorrunninglocked.setMin, windowInsetsAnimationCompat$Callback$DispatchMode);
    }

    public final void setMax(int i, PlaybackStateCompat.ShuffleMode<ComponentHost> shuffleMode) {
        int i2 = i;
        PlaybackStateCompat.ShuffleMode<ComponentHost> shuffleMode2 = shuffleMode;
        ThreadUtils.getMax();
        WindowInsetsAnimationCompat$Callback$DispatchMode max = this.length.getMax(this.setMin[i2], null);
        long nanoTime = System.nanoTime();
        if (max != null) {
            if (this.setMin[i2] == 0) {
                setMax(max, true);
                return;
            }
            Object obj = max.setMax;
            if ((obj instanceof ComponentHost) && !(obj instanceof LithoView)) {
                ComponentHost componentHost = (ComponentHost) obj;
                for (int mountItemCount = componentHost.getMountItemCount() - 1; mountItemCount >= 0; mountItemCount--) {
                    WindowInsetsAnimationCompat$Callback$DispatchMode mountItemAt = componentHost.getMountItemAt(mountItemCount);
                    PlaybackStateCompat.ShuffleMode<WindowInsetsAnimationCompat$Callback$DispatchMode> shuffleMode3 = this.length;
                    int length2 = shuffleMode3.length(mountItemAt);
                    if (shuffleMode3.getMin) {
                        shuffleMode3.getMin();
                    }
                    long j = shuffleMode3.setMax[length2];
                    int length3 = this.setMin.length - 1;
                    while (true) {
                        if (length3 < 0) {
                            break;
                        } else if (this.setMin[length3] == j) {
                            setMax(length3, shuffleMode2);
                            break;
                        } else {
                            length3--;
                        }
                    }
                }
                if (componentHost.getMountItemCount() > 0) {
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            if (obj instanceof OperationCanceledException) {
                ArrayList<LithoView> Mean$Arithmetic2 = NotificationCompatSideChannelService.Mean$Arithmetic();
                ((OperationCanceledException) obj).obtainLithoViewChildren(Mean$Arithmetic2);
                for (int size = Mean$Arithmetic2.size() - 1; size >= 0; size--) {
                    Mean$Arithmetic2.get(size).unmountAllItems();
                }
                NotificationCompatSideChannelService.length(Mean$Arithmetic2);
            }
            max.toFloatRange.unmount(i2, max);
            getMin(max);
            isStopped isstopped = max.setMin;
            if (isStopped.setMin(isstopped)) {
                ComponentHost componentHost2 = (ComponentHost) obj;
                int length4 = shuffleMode2.length(componentHost2);
                if (shuffleMode2.setMin[length4] != PlaybackStateCompat.ShuffleMode.getMax) {
                    shuffleMode2.setMin[length4] = PlaybackStateCompat.ShuffleMode.getMax;
                    shuffleMode2.getMin = true;
                }
                length(componentHost2);
            }
            isStopped isstopped2 = max.setMin;
            Object obj2 = max.setMax;
            if (max.equals()) {
                max.equals = false;
            }
            isstopped2.setMin(obj2);
            long j2 = this.setMin[i2];
            this.length.getMin(j2);
            if (max.setMin()) {
                setMin(max.isInside, j2 == 0 ? 3 : (int) ((j2 >> 16) & 3));
            }
            NotificationCompatSideChannelService.getMin(this.toIntRange.setMin, max);
            if (this.IsOverlapping.FastBitmap$CoordinateSystem) {
                List<Double> list = this.IsOverlapping.isInside;
                double nanoTime2 = (double) (System.nanoTime() - nanoTime);
                Double.isNaN(nanoTime2);
                list.add(Double.valueOf(nanoTime2 / 1000000.0d));
                this.IsOverlapping.setMin.add(isstopped.valueOf);
                this.IsOverlapping.toDoubleRange++;
            }
        }
    }

    public final void length(LayoutState layoutState) {
        for (pageScroll remove : layoutState.b.keySet()) {
            hide remove2 = this.invokeSuspend.remove(remove);
            if (remove2 != null) {
                getMax((hide<WindowInsetsAnimationCompat$Callback$DispatchMode>) remove2);
            }
        }
    }

    public final void getMin(LayoutState layoutState, Transition transition) {
        LayoutState layoutState2 = layoutState;
        if (this.hashCode == null) {
            this.hashCode = new smoothScrollBy(this, this);
        }
        smoothScrollBy smoothscrollby = this.hashCode;
        LayoutState layoutState3 = this.FastBitmap$CoordinateSystem;
        NotificationCompat$StreamType.setMin();
        for (V v : smoothscrollby.length.getMin.values()) {
            v.toFloatRange = false;
        }
        Map<pageScroll, hide<LayoutOutput>> map = layoutState2.b;
        if (layoutState3 == null) {
            for (pageScroll next : map.keySet()) {
                if (!keyToDirection.newSessionWithExtras || next.length != 3) {
                    smoothscrollby.length(next, (hide<LayoutOutput>) null, map.get(next));
                }
            }
        } else {
            Map<pageScroll, hide<LayoutOutput>> map2 = layoutState3.b;
            HashSet hashSet = new HashSet();
            boolean z = keyToDirection.newSessionWithExtras && !computeVerticalScrollRange.length(transition);
            for (pageScroll next2 : map.keySet()) {
                boolean z2 = next2.length == 3;
                if (!z || !z2) {
                    hide hide = map.get(next2);
                    hide hide2 = map2.get(next2);
                    if (hide2 != null) {
                        hashSet.add(next2);
                    } else if (z2) {
                    }
                    smoothscrollby.length(next2, (hide<LayoutOutput>) hide2, (hide<LayoutOutput>) hide);
                }
            }
            for (pageScroll next3 : map2.keySet()) {
                if (!hashSet.contains(next3) && (!keyToDirection.newSessionWithExtras || next3.length != 3)) {
                    smoothscrollby.length(next3, map2.get(next3), (hide<LayoutOutput>) null);
                }
            }
        }
        smoothscrollby.isInside = smoothscrollby.getMax(transition);
        smoothscrollby.getMax();
        for (pageScroll next4 : layoutState2.b.keySet()) {
            if (this.hashCode.getMin(next4)) {
                this.values.add(next4);
            }
        }
    }

    public final void getMin(LayoutState layoutState) {
        Map<pageScroll, hide<LayoutOutput>> map = layoutState.b;
        if (map != null) {
            for (pageScroll next : map.keySet()) {
                if (this.values.contains(next)) {
                    if (this.valueOf == null) {
                        this.valueOf = new int[layoutState.toFloatRange.size()];
                    }
                    hide hide = map.get(next);
                    short s = hide.getMin;
                    for (int i = 0; i < s; i++) {
                        getMax(layoutState, layoutState.IsOverlapping.getMax(((LayoutOutput) hide.setMax[hide.getMax(i)]).getMax, -1).intValue(), true);
                    }
                }
            }
            return;
        }
        this.valueOf = null;
    }

    private static int setMin(LayoutState layoutState, int i) {
        long j = layoutState.toFloatRange.get(i).getMax;
        int size = layoutState.toFloatRange.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            long j2 = layoutState.toFloatRange.get(i2).toFloatRange;
            while (j2 != j) {
                if (j2 == 0) {
                    return i2 - 1;
                }
                j2 = layoutState.toFloatRange.get(layoutState.IsOverlapping.getMax(j2, -1).intValue()).toFloatRange;
            }
        }
        return layoutState.toFloatRange.size() - 1;
    }

    @Nullable
    private static void toIntRange(LayoutState layoutState) {
        List<isStopped> list = layoutState.getCause;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
    }
}
