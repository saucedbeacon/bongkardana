package com.facebook.litho;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.litho.ComponentLifecycle;
import com.facebook.litho.ComponentsReporter;
import com.facebook.litho.Transition;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o.ConnectivityManagerCompat$RestrictBackgroundStatus;
import o.ContentInfoCompat$Source;
import o.FontsContractCompat$FontRequestCallback$FontRequestFailReason;
import o.IconCompat;
import o.LinkifyCompat$LinkifyMask;
import o.NotificationCompat$GroupAlertBehavior;
import o.NotificationCompat$StreamType;
import o.NotificationCompatSideChannelService;
import o.ParseException;
import o.PermissionInfoCompat$Protection;
import o.PermissionInfoCompat$ProtectionFlags;
import o.PlaybackStateCompat;
import o.RemoteInput$EditChoicesBeforeSending;
import o.ViewCompat$FocusRelativeDirection;
import o.ViewCompat$ScrollIndicators;
import o.clampViewPositionHorizontal;
import o.clearKeyboardFocusForVirtualView;
import o.computeHorizontalScrollExtent;
import o.computeHorizontalScrollOffset;
import o.computeHorizontalScrollRange;
import o.computeScrollDeltaToGetChildRectOnScreen;
import o.computeVerticalScrollRange;
import o.ensureProcessorRunningLocked;
import o.getExecutor;
import o.getUriForFile;
import o.getVirtualViewAt;
import o.hide;
import o.isStopped;
import o.keyToDirection;
import o.measureChild;
import o.onPerformActionForVirtualView;
import o.onPopulateNodeForHost;
import o.onRequestFocusInDescendants;
import o.onScrollChanged;
import o.onSizeChanged;
import o.pageScroll;
import o.performAccessibilityAction;
import o.sendAccessibilityEvent;
import o.setSmoothScrollingEnabled;
import o.startNestedScroll;

public class LayoutState {
    static final Comparator<LayoutOutput> getMax = new Comparator<LayoutOutput>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            LayoutOutput layoutOutput = (LayoutOutput) obj;
            LayoutOutput layoutOutput2 = (LayoutOutput) obj2;
            int i = layoutOutput.setMax.top;
            int i2 = layoutOutput2.setMax.top;
            return i == i2 ? layoutOutput.FastBitmap$CoordinateSystem - layoutOutput2.FastBitmap$CoordinateSystem : i - i2;
        }
    };
    public static final AtomicInteger length = new AtomicInteger(1);
    @Nullable
    private static Map<Integer, List<Boolean>> requestPostMessageChannel;
    private static final Object requestPostMessageChannelWithExtras = new Object();
    static final Comparator<LayoutOutput> setMin = new Comparator<LayoutOutput>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            LayoutOutput layoutOutput = (LayoutOutput) obj;
            LayoutOutput layoutOutput2 = (LayoutOutput) obj2;
            int i = layoutOutput.setMax.bottom;
            int i2 = layoutOutput2.setMax.bottom;
            return i == i2 ? layoutOutput2.FastBitmap$CoordinateSystem - layoutOutput.FastBitmap$CoordinateSystem : i - i2;
        }
    };
    @Nullable
    public pageScroll FastBitmap$CoordinateSystem;
    public int Grayscale$Algorithm;
    public onScrollChanged ICustomTabsCallback;
    private PermissionInfoCompat$ProtectionFlags ICustomTabsCallback$Default;
    private int ICustomTabsCallback$Stub;
    private boolean ICustomTabsCallback$Stub$Proxy = false;
    private long ICustomTabsService = -1;
    public final PlaybackStateCompat.ShuffleMode<Integer> IsOverlapping = new PlaybackStateCompat.ShuffleMode<>(8);
    public int Mean$Arithmetic = -1;
    private int asBinder = 0;
    @Nullable
    private performAccessibilityAction asInterface;
    public final Map<pageScroll, hide<LayoutOutput>> b = new LinkedHashMap();
    public List<Transition> create;
    public final List<measureChild> equals = new ArrayList(8);
    private final Map<String, Rect> extraCallback = new HashMap();
    public int extraCallbackWithResult;
    private boolean extraCommand = true;
    public List<isStopped> getCause;
    private int getDefaultImpl = -1;
    private boolean getInterfaceDescriptor = true;
    public volatile ensureProcessorRunningLocked getMin;
    @Nullable
    public sendAccessibilityEvent hashCode;
    public int invoke;
    public final AtomicInteger invokeSuspend = new AtomicInteger(-1);
    isStopped isInside;
    @Nullable
    private pageScroll mayLaunchUrl;
    @Nullable
    private hide<LayoutOutput> newSession;
    private AccessibilityManager newSessionWithExtras;
    private int onMessageChannelReady;
    int onNavigationEvent = -1;
    private int onPostMessage;
    @Nullable
    onSizeChanged onRelationshipValidationResult;
    private int onTransact;
    private final Set<pageScroll> postMessage = new HashSet();
    private int setDefaultImpl = 0;
    final List<isStopped> setMax = new ArrayList();
    @Nullable
    public String toDoubleRange;
    public final List<LayoutOutput> toFloatRange = new ArrayList(8);
    public final ArrayList<LayoutOutput> toIntRange = new ArrayList<>();
    public List<setSmoothScrollingEnabled> toString;
    public int valueOf;
    public final ArrayList<LayoutOutput> values = new ArrayList<>();
    private boolean warmup = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CalculateLayoutSource {
        public static final int MEASURE = 3;
        public static final int NONE = -1;
        public static final int SET_ROOT = 0;
        public static final int SET_SIZE_SPEC = 1;
        public static final int TEST = -2;
        public static final int UPDATE_STATE = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NodeTreePersistenceMode {
        public static final int NONE = 0;
        public static final int RELEASE_AFTER_CALCULATE = 2;
        public static final int RELEASE_BEFORE_CALCULATE = 1;
    }

    public LayoutState() {
        if (!keyToDirection.values) {
            this.asInterface = new performAccessibilityAction();
        }
    }

    private static LayoutOutput setMin(isStopped isstopped, LayoutState layoutState, sendAccessibilityEvent sendaccessibilityevent, boolean z) {
        NotificationCompat$StreamType.setMin();
        return getMax(isstopped, layoutState, sendaccessibilityevent, false, 2, layoutState.getInterfaceDescriptor, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        if (r15.extraCallback == 2) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.litho.LayoutOutput getMax(o.isStopped r16, com.facebook.litho.LayoutState r17, o.sendAccessibilityEvent r18, boolean r19, int r20, boolean r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r3 = r18
            o.NotificationCompat$StreamType.setMin()
            boolean r2 = o.isStopped.length((o.isStopped) r16)
            com.facebook.litho.LayoutOutput r8 = o.NotificationCompatSideChannelService.getMax()
            if (r0 == 0) goto L_0x00e6
            r8.getMin = r0
            r0 = r20
            r8.values = r0
            int r0 = r1.extraCallbackWithResult
            r8.hashCode = r0
            long r4 = r1.ICustomTabsService
            r8.toFloatRange = r4
            int r0 = r1.getDefaultImpl
            if (r0 < 0) goto L_0x0038
            java.util.List<com.facebook.litho.LayoutOutput> r4 = r1.toFloatRange
            java.lang.Object r0 = r4.get(r0)
            com.facebook.litho.LayoutOutput r0 = (com.facebook.litho.LayoutOutput) r0
            android.graphics.Rect r0 = r0.setMax
            int r4 = r0.left
            int r0 = r0.top
            r8.toIntRange = r4
            r8.equals = r0
            goto L_0x003a
        L_0x0038:
            r0 = 0
            r4 = 0
        L_0x003a:
            int r5 = r1.onTransact
            int r6 = r18.getMin()
            int r10 = r5 + r6
            int r5 = r1.ICustomTabsCallback$Stub
            int r6 = r18.length()
            int r11 = r5 + r6
            int r5 = r18.setMax()
            int r12 = r10 + r5
            int r5 = r18.setMin()
            int r13 = r11 + r5
            if (r19 == 0) goto L_0x005d
            int r5 = r18.equals()
            goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            if (r19 == 0) goto L_0x0065
            int r6 = r18.toFloatRange()
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            if (r19 == 0) goto L_0x006d
            int r7 = r18.toIntRange()
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            if (r19 == 0) goto L_0x0075
            int r14 = r18.isInside()
            goto L_0x0076
        L_0x0075:
            r14 = 0
        L_0x0076:
            o.ViewCompat$ScrollIndicators r15 = r3.FastBitmap$CoordinateSystem
            r9 = 2
            if (r2 == 0) goto L_0x00c1
            r8.getMax(r15)
            o.computeHorizontalScrollRange r9 = o.NotificationCompatSideChannelService.length()
            java.util.concurrent.atomic.AtomicInteger r2 = r9.getMax
            r15 = 1
            int r2 = r2.getAndSet(r15)
            if (r2 != 0) goto L_0x00b9
            if (r19 == 0) goto L_0x0096
            boolean r2 = r18.IsOverlapping()
            if (r2 == 0) goto L_0x0096
            r9.length(r5, r6, r7, r14)
        L_0x0096:
            com.facebook.yoga.YogaNode r2 = r3.length
            int r2 = r2.mLayoutDirection
            com.facebook.yoga.YogaDirection r2 = com.facebook.yoga.YogaDirection.fromInt(r2)
            r9.equals = r2
            int r5 = r10 - r4
            int r6 = r11 - r0
            int r7 = r12 - r4
            int r0 = r13 - r0
            r2 = r9
            r3 = r18
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            r2.length(r3, r4, r5, r6, r7)
            r8.getMin((o.computeHorizontalScrollRange) r9)
            r9.length()
            goto L_0x00cc
        L_0x00b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The ViewNodeInfo reference acquired from the pool  wasn't correctly released."
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            int r10 = r10 + r5
            int r11 = r11 + r6
            int r12 = r12 - r7
            int r13 = r13 - r14
            if (r15 == 0) goto L_0x00cc
            int r0 = r15.extraCallback
            if (r0 != r9) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r9 = 0
        L_0x00cd:
            android.graphics.Rect r0 = r8.setMax
            r0.set(r10, r11, r12, r13)
            if (r21 == 0) goto L_0x00d6
            r9 = r9 | 1
        L_0x00d6:
            if (r22 == 0) goto L_0x00db
            r9 = r9 | 4
            goto L_0x00df
        L_0x00db:
            o.pageScroll r0 = r1.mayLaunchUrl
            r8.toString = r0
        L_0x00df:
            if (r23 == 0) goto L_0x00e3
            r9 = r9 | 8
        L_0x00e3:
            r8.IsOverlapping = r9
            return r8
        L_0x00e6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Trying to set a null Component on a LayoutOutput!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LayoutState.getMax(o.isStopped, com.facebook.litho.LayoutState, o.sendAccessibilityEvent, boolean, int, boolean, boolean, boolean):com.facebook.litho.LayoutOutput");
    }

    private static boolean setMax(Context context) {
        return Build.VERSION.SDK_INT >= 17 && (context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private static void getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, sendAccessibilityEvent sendaccessibilityevent, LayoutState layoutState, PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags2;
        long j;
        int i;
        pageScroll pagescroll;
        hide<LayoutOutput> hide;
        PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags3;
        LayoutOutput layoutOutput;
        isStopped isstopped;
        Context context;
        int i2;
        isStopped isstopped2;
        LayoutOutput layoutOutput2;
        boolean z;
        LayoutState layoutState2;
        LayoutOutput layoutOutput3;
        ArrayList arrayList;
        long j2;
        clearKeyboardFocusForVirtualView.setMin setmin;
        int i3;
        double d;
        double d2;
        double d3;
        sendAccessibilityEvent sendaccessibilityevent2;
        LayoutOutput layoutOutput4;
        long j3;
        int i4;
        sendAccessibilityEvent sendaccessibilityevent3;
        sendAccessibilityEvent sendaccessibilityevent4 = sendaccessibilityevent;
        LayoutState layoutState3 = layoutState;
        PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags4 = permissionInfoCompat$ProtectionFlags;
        if (sendaccessibilityevent.extraCallbackWithResult()) {
            sendaccessibilityevent4.length.mHasNewLayout = false;
        }
        isStopped isstopped3 = sendaccessibilityevent4.setMax.size() == 0 ? null : sendaccessibilityevent4.setMax.get(0);
        NotificationCompat$StreamType.setMin();
        if (sendaccessibilityevent.valueOf()) {
            sendAccessibilityEvent min = setMin(ensureprocessorrunninglocked.length() ? ensureprocessorrunninglocked : sendaccessibilityevent4.getMax, sendaccessibilityevent4, View.MeasureSpec.makeMeasureSpec(sendaccessibilityevent.setMax(), 1073741824), View.MeasureSpec.makeMeasureSpec(sendaccessibilityevent.setMin(), 1073741824));
            if (min != ensureProcessorRunningLocked.length) {
                layoutState3.onTransact += sendaccessibilityevent.getMin();
                layoutState3.ICustomTabsCallback$Stub += sendaccessibilityevent.length();
                getMax(ensureprocessorrunninglocked, min, layoutState3, permissionInfoCompat$ProtectionFlags4);
                layoutState3.onTransact -= sendaccessibilityevent.getMin();
                layoutState3.ICustomTabsCallback$Stub -= sendaccessibilityevent.length();
                return;
            }
            return;
        }
        if (sendaccessibilityevent4.getMin == 8) {
            sendaccessibilityevent4.length(1);
            YogaNode yogaNode = sendaccessibilityevent4.length;
            int size = yogaNode.setMax == null ? 0 : yogaNode.setMax.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (sendaccessibilityevent4.length.setMin(i5) == null) {
                    sendaccessibilityevent3 = null;
                } else {
                    sendaccessibilityevent3 = (sendAccessibilityEvent) sendaccessibilityevent4.length.setMin(i5).toFloatRange;
                }
                sendaccessibilityevent3.length(4);
            }
        }
        boolean z2 = layoutState3.ICustomTabsCallback$Stub$Proxy;
        PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags5 = sendaccessibilityevent4.onPostMessage;
        boolean z3 = isStopped.setMax(isstopped3) && permissionInfoCompat$ProtectionFlags5 != null;
        boolean z4 = z3 && sendaccessibilityevent.invoke();
        if (z2) {
            PermissionInfoCompat$ProtectionFlags intRange = NotificationCompatSideChannelService.toIntRange();
            intRange.isInside = sendaccessibilityevent.toDoubleRange();
            intRange.FastBitmap$CoordinateSystem = sendaccessibilityevent.values();
            intRange.equals = sendaccessibilityevent4.extraCallbackWithResult;
            intRange.toFloatRange = sendaccessibilityevent4.onRelationshipValidationResult;
            intRange.toIntRange = sendaccessibilityevent4.setMax.size() == 0 ? null : sendaccessibilityevent4.setMax.get(0);
            if (permissionInfoCompat$ProtectionFlags4 != null) {
                permissionInfoCompat$ProtectionFlags4.toDoubleRange.add(intRange);
            }
            if (permissionInfoCompat$ProtectionFlags4 == null) {
                layoutState3.ICustomTabsCallback$Default = intRange;
            }
            permissionInfoCompat$ProtectionFlags2 = intRange;
        } else {
            permissionInfoCompat$ProtectionFlags2 = null;
        }
        if (layoutState3.setDefaultImpl == 2) {
            if (sendaccessibilityevent4.FastBitmap$CoordinateSystem == null) {
                ViewCompat$ScrollIndicators min2 = NotificationCompatSideChannelService.setMin();
                if (min2.getMax.getAndSet(1) == 0) {
                    sendaccessibilityevent4.FastBitmap$CoordinateSystem = min2;
                } else {
                    throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
                }
            }
            sendaccessibilityevent4.FastBitmap$CoordinateSystem.extraCallback = 2;
        }
        boolean max = setMax(sendaccessibilityevent, layoutState);
        boolean z5 = !max && getMax(sendaccessibilityevent);
        boolean z6 = max || z5;
        long j4 = layoutState3.ICustomTabsService;
        int i6 = layoutState3.getDefaultImpl;
        pageScroll pagescroll2 = layoutState3.mayLaunchUrl;
        hide<LayoutOutput> hide2 = layoutState3.newSession;
        pageScroll min3 = getMin(sendaccessibilityevent);
        layoutState3.mayLaunchUrl = min3;
        layoutState3.newSession = min3 != null ? new hide<>() : null;
        isStopped isstopped4 = isstopped3;
        if (z6) {
            isStopped isstopped5 = sendaccessibilityevent4.setMax.size() == 0 ? null : sendaccessibilityevent4.setMax.get(0);
            NotificationCompat$StreamType.setMin();
            if (!isStopped.length(isstopped5) || layoutState3.setMin(sendaccessibilityevent4)) {
                NotificationCompat$StreamType.setMin();
                hide = hide2;
                pagescroll = pagescroll2;
                i = i6;
                j = j4;
                permissionInfoCompat$ProtectionFlags3 = permissionInfoCompat$ProtectionFlags2;
                LayoutOutput max2 = getMax(ConnectivityManagerCompat$RestrictBackgroundStatus.getMin(), layoutState, sendaccessibilityevent, false, sendaccessibilityevent4.getMin, sendaccessibilityevent.asBinder(), false, z5);
                computeHorizontalScrollRange computehorizontalscrollrange = max2.length;
                if (sendaccessibilityevent.Mean$Arithmetic()) {
                    computehorizontalscrollrange.isInside = sendaccessibilityevent4.toString;
                } else {
                    computehorizontalscrollrange.toIntRange = sendaccessibilityevent4.values;
                }
                getMin(layoutState3, max2);
                int size2 = layoutState3.toFloatRange.size() - 1;
                if (permissionInfoCompat$ProtectionFlags3 != null) {
                    permissionInfoCompat$ProtectionFlags3.getMin = max2;
                }
                if (layoutState3.setMin(sendaccessibilityevent4)) {
                    max2.getMax = 0;
                    max2.toFloatRange = 0;
                    max2.toDoubleRange = 2;
                    i4 = size2;
                } else {
                    i4 = size2;
                    layoutState.getMax(max2, layoutState3.asBinder, 3, -1, false);
                }
                getMin(layoutState3.IsOverlapping, max2, i4);
                hide<LayoutOutput> hide3 = layoutState3.newSession;
                if (hide3 != null) {
                    hide3.getMax(3, max2);
                }
                length(layoutState);
                layoutState3.asBinder++;
                layoutState3.ICustomTabsService = layoutState3.toFloatRange.get(i4).getMax;
                layoutState3.getDefaultImpl = i4;
            } else {
                throw new IllegalArgumentException("We shouldn't insert a host as a parent of a View");
            }
        } else {
            hide = hide2;
            pagescroll = pagescroll2;
            i = i6;
            j = j4;
            permissionInfoCompat$ProtectionFlags3 = permissionInfoCompat$ProtectionFlags2;
        }
        boolean z7 = layoutState3.getInterfaceDescriptor;
        layoutState3.getInterfaceDescriptor = z6 || (z7 && sendaccessibilityevent.asBinder());
        isStopped isstopped6 = sendaccessibilityevent4.setMax.size() == 0 ? null : sendaccessibilityevent4.setMax.get(0);
        if (isstopped6 == null || isstopped6.equals() == ComponentLifecycle.MountType.NONE) {
            layoutOutput = null;
        } else {
            layoutOutput = getMax(isstopped6, layoutState, sendaccessibilityevent, true, sendaccessibilityevent4.getMin, layoutState3.getInterfaceDescriptor, z6, false);
        }
        if (layoutOutput != null) {
            if (z3) {
                j3 = permissionInfoCompat$ProtectionFlags5.length.getMax;
            } else {
                j3 = -1;
            }
            layoutState.getMax(layoutOutput, layoutState3.asBinder, 0, j3, z4);
        }
        onPerformActionForVirtualView<? extends Drawable> onperformactionforvirtualview = sendaccessibilityevent4.isInside;
        if (onperformactionforvirtualview != null) {
            if (layoutOutput == null || !layoutOutput.isInside()) {
                if (permissionInfoCompat$ProtectionFlags5 != null) {
                    layoutOutput4 = permissionInfoCompat$ProtectionFlags5.setMin;
                } else {
                    layoutOutput4 = null;
                }
                LayoutOutput min4 = getMin(sendaccessibilityevent, layoutState, layoutOutput4, onperformactionforvirtualview, 1, z6);
                if (permissionInfoCompat$ProtectionFlags3 != null) {
                    permissionInfoCompat$ProtectionFlags3.setMin = min4;
                }
            } else {
                layoutOutput.length.getMin = onperformactionforvirtualview;
            }
        }
        if (isStopped.setMax(isstopped4)) {
            ensureProcessorRunningLocked ensureprocessorrunninglocked2 = layoutState3.getMin;
            isstopped = isstopped4;
            isstopped.setMin((NotificationCompat$GroupAlertBehavior) sendaccessibilityevent4);
            getMin(layoutState3, layoutOutput);
            getMin(layoutState3.IsOverlapping, layoutOutput, layoutState3.toFloatRange.size() - 1);
            hide<LayoutOutput> hide4 = layoutState3.newSession;
            if (hide4 != null) {
                hide4.getMax(0, layoutOutput);
            }
            if (permissionInfoCompat$ProtectionFlags3 != null) {
                permissionInfoCompat$ProtectionFlags3.length = layoutOutput;
            }
        } else {
            isstopped = isstopped4;
        }
        if (isstopped.FastBitmap$CoordinateSystem == null) {
            context = null;
        } else {
            context = isstopped.FastBitmap$CoordinateSystem.setMin;
        }
        if (computeVerticalScrollRange.setMax(context)) {
            ArrayList<Transition> arrayList2 = sendaccessibilityevent4.ICustomTabsCallback$Stub;
            if (arrayList2 != null) {
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    Transition transition = arrayList2.get(i7);
                    if (layoutState3.create == null) {
                        layoutState3.create = new ArrayList();
                    }
                    computeVerticalScrollRange.getMin(transition, layoutState3.create, layoutState3.toDoubleRange);
                }
            }
            ArrayList<isStopped> arrayList3 = sendaccessibilityevent4.onTransact;
            if (arrayList3 != null) {
                if (layoutState3.getCause == null) {
                    layoutState3.getCause = new ArrayList();
                }
                layoutState3.getCause.addAll(arrayList3);
            }
        }
        layoutState3.onTransact += sendaccessibilityevent.getMin();
        layoutState3.ICustomTabsCallback$Stub += sendaccessibilityevent.length();
        int i8 = layoutState3.setDefaultImpl;
        if (sendaccessibilityevent4.FastBitmap$CoordinateSystem != null) {
            i2 = sendaccessibilityevent4.FastBitmap$CoordinateSystem.extraCallback;
        } else {
            i2 = 0;
        }
        layoutState3.setDefaultImpl = i2;
        YogaNode yogaNode2 = sendaccessibilityevent4.length;
        int size4 = yogaNode2.setMax == null ? 0 : yogaNode2.setMax.size();
        for (int i9 = 0; i9 < size4; i9++) {
            ensureProcessorRunningLocked ensureprocessorrunninglocked3 = sendaccessibilityevent4.getMax;
            if (sendaccessibilityevent4.length.setMin(i9) == null) {
                sendaccessibilityevent2 = null;
            } else {
                sendaccessibilityevent2 = (sendAccessibilityEvent) sendaccessibilityevent4.length.setMin(i9).toFloatRange;
            }
            getMax(ensureprocessorrunninglocked3, sendaccessibilityevent2, layoutState3, permissionInfoCompat$ProtectionFlags3);
        }
        layoutState3.setDefaultImpl = i8;
        layoutState3.onTransact -= sendaccessibilityevent.getMin();
        layoutState3.ICustomTabsCallback$Stub -= sendaccessibilityevent.length();
        if (sendaccessibilityevent.asInterface()) {
            LayoutOutput layoutOutput5 = permissionInfoCompat$ProtectionFlags5 != null ? permissionInfoCompat$ProtectionFlags5.getMax : null;
            if (sendaccessibilityevent.asInterface()) {
                boolean z8 = sendaccessibilityevent.Grayscale$Algorithm() == YogaDirection.RTL;
                float[] fArr = sendaccessibilityevent4.toDoubleRange;
                int[] iArr = sendaccessibilityevent4.IsOverlapping;
                YogaEdge yogaEdge = z8 ? YogaEdge.RIGHT : YogaEdge.LEFT;
                YogaEdge yogaEdge2 = z8 ? YogaEdge.LEFT : YogaEdge.RIGHT;
                clearKeyboardFocusForVirtualView.setMin setmin2 = new clearKeyboardFocusForVirtualView.setMin();
                setmin2.length.toFloatRange = sendaccessibilityevent4.hashCode;
                setmin2.length.getMax = Border.setMax(iArr, yogaEdge);
                setmin2.length.toIntRange = Border.setMax(iArr, YogaEdge.TOP);
                setmin2.length.isInside = Border.setMax(iArr, yogaEdge2);
                setmin2.length.equals = Border.setMax(iArr, YogaEdge.BOTTOM);
                float min5 = sendaccessibilityevent4.length.getMin(yogaEdge);
                if (min5 > 0.0f) {
                    setmin = setmin2;
                    double d4 = (double) min5;
                    Double.isNaN(d4);
                    i3 = (int) (d4 + 0.5d);
                } else {
                    setmin = setmin2;
                    double d5 = (double) min5;
                    Double.isNaN(d5);
                    i3 = (int) (d5 - 0.5d);
                }
                clearKeyboardFocusForVirtualView.setMin setmin3 = setmin;
                setmin3.length.setMin = (float) i3;
                float min6 = sendaccessibilityevent4.length.getMin(YogaEdge.TOP);
                if (min6 > 0.0f) {
                    isstopped2 = isstopped;
                    double d6 = (double) min6;
                    Double.isNaN(d6);
                    d = d6 + 0.5d;
                } else {
                    isstopped2 = isstopped;
                    double d7 = (double) min6;
                    Double.isNaN(d7);
                    d = d7 - 0.5d;
                }
                setmin3.length.length = (float) ((int) d);
                float min7 = sendaccessibilityevent4.length.getMin(yogaEdge2);
                if (min7 > 0.0f) {
                    double d8 = (double) min7;
                    Double.isNaN(d8);
                    d2 = d8 + 0.5d;
                } else {
                    double d9 = (double) min7;
                    Double.isNaN(d9);
                    d2 = d9 - 0.5d;
                }
                setmin3.length.getMin = (float) ((int) d2);
                float min8 = sendaccessibilityevent4.length.getMin(YogaEdge.BOTTOM);
                if (min8 > 0.0f) {
                    double d10 = (double) min8;
                    Double.isNaN(d10);
                    d3 = d10 + 0.5d;
                } else {
                    double d11 = (double) min8;
                    Double.isNaN(d11);
                    d3 = d11 - 0.5d;
                }
                setmin3.length.setMax = (float) ((int) d3);
                setmin3.length.IsOverlapping = Arrays.copyOf(fArr, fArr.length);
                LayoutOutput min9 = getMin(sendaccessibilityevent, layoutState, layoutOutput5, (onPerformActionForVirtualView<? extends Drawable>) new onPopulateNodeForHost(new clearKeyboardFocusForVirtualView(setmin3.length, (byte) 0)), 4, z6);
                if (permissionInfoCompat$ProtectionFlags3 != null) {
                    permissionInfoCompat$ProtectionFlags3.getMax = min9;
                }
            } else {
                throw new RuntimeException("This node does not support drawing border color");
            }
        } else {
            isstopped2 = isstopped;
        }
        getVirtualViewAt getvirtualviewat = sendaccessibilityevent4.equals;
        if (getvirtualviewat != null) {
            if (layoutOutput == null || !layoutOutput.isInside() || Build.VERSION.SDK_INT < 23) {
                LayoutOutput min10 = getMin(sendaccessibilityevent, layoutState, permissionInfoCompat$ProtectionFlags5 != null ? permissionInfoCompat$ProtectionFlags5.setMax : null, (onPerformActionForVirtualView<? extends Drawable>) new onPopulateNodeForHost(getvirtualviewat), 2, z6);
                if (permissionInfoCompat$ProtectionFlags3 != null) {
                    permissionInfoCompat$ProtectionFlags3.setMax = min10;
                }
            } else {
                layoutOutput.length.setMax = getvirtualviewat;
            }
        }
        if (sendaccessibilityevent.invokeSuspend()) {
            int min11 = layoutState3.onTransact + sendaccessibilityevent.getMin();
            int length2 = layoutState3.ICustomTabsCallback$Stub + sendaccessibilityevent.length();
            int max3 = sendaccessibilityevent.setMax() + min11;
            int min12 = sendaccessibilityevent.setMin() + length2;
            IconCompat<onRequestFocusInDescendants> iconCompat = sendaccessibilityevent4.invoke;
            IconCompat<FontsContractCompat$FontRequestCallback$FontRequestFailReason> iconCompat2 = sendaccessibilityevent4.onNavigationEvent;
            IconCompat<computeHorizontalScrollOffset> iconCompat3 = sendaccessibilityevent4.b;
            IconCompat<ParseException> iconCompat4 = sendaccessibilityevent4.ICustomTabsCallback;
            IconCompat<LinkifyCompat$LinkifyMask> iconCompat5 = sendaccessibilityevent4.create;
            z = z7;
            IconCompat<computeHorizontalScrollExtent> iconCompat6 = sendaccessibilityevent4.getCause;
            layoutOutput2 = layoutOutput;
            measureChild max4 = NotificationCompatSideChannelService.setMax();
            PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags6 = permissionInfoCompat$ProtectionFlags3;
            max4.setMin = sendaccessibilityevent4.setMax.size() == 0 ? null : sendaccessibilityevent4.setMax.get(0);
            max4.getMax.set(min11, length2, max3, min12);
            max4.setMax = sendaccessibilityevent4.Mean$Arithmetic;
            max4.getMin = sendaccessibilityevent4.invokeSuspend;
            max4.equals = iconCompat;
            max4.toFloatRange = iconCompat2;
            max4.toIntRange = iconCompat3;
            max4.IsOverlapping = iconCompat4;
            max4.isInside = iconCompat5;
            max4.toDoubleRange = iconCompat6;
            if (!z3 || permissionInfoCompat$ProtectionFlags5.IsOverlapping == null) {
                layoutState2 = layoutState;
                j2 = -1;
            } else {
                j2 = permissionInfoCompat$ProtectionFlags5.IsOverlapping.length;
                layoutState2 = layoutState;
            }
            int i10 = layoutState2.asBinder;
            if (layoutState2.asInterface == null) {
                layoutState2.asInterface = new performAccessibilityAction();
            }
            performAccessibilityAction performaccessibilityaction = layoutState2.asInterface;
            if (performaccessibilityaction.length == null) {
                performaccessibilityaction.length = new PlaybackStateCompat.ShuffleMode<>(2);
            }
            if (i10 < 0 || i10 > 255) {
                throw new IllegalArgumentException("Level must be non-negative and no greater than 255 actual level ".concat(String.valueOf(i10)));
            }
            long j5 = ((max4.setMin != null ? (long) max4.setMin.invokeSuspend : 0) << 26) | 0 | (((long) i10) << 18);
            int i11 = (j2 <= 0 || ((int) ((j2 >> 18) & 255)) != i10) ? -1 : ((int) j2) & 65535;
            int intValue = performaccessibilityaction.length.getMax(j5, 0).intValue();
            if (i11 < intValue) {
                i11 = intValue + 1;
            }
            if (i11 < 0 || i11 > 65535) {
                throw new IllegalArgumentException("Sequence must be non-negative and no greater than 65535 actual sequence ".concat(String.valueOf(i11)));
            }
            max4.length = ((long) i11) | j5;
            performaccessibilityaction.length.setMax(j5, Integer.valueOf(i11 + 1));
            layoutState2.equals.add(max4);
            if (permissionInfoCompat$ProtectionFlags6 != null) {
                permissionInfoCompat$ProtectionFlags6.IsOverlapping = max4;
            }
        } else {
            layoutOutput2 = layoutOutput;
            layoutState2 = layoutState3;
            z = z7;
        }
        if (layoutState2.toString == null || TextUtils.isEmpty(sendaccessibilityevent4.onMessageChannelReady)) {
            layoutOutput3 = layoutOutput2;
        } else {
            int min13 = layoutState2.onTransact + sendaccessibilityevent.getMin();
            int length3 = layoutState2.ICustomTabsCallback$Stub + sendaccessibilityevent.length();
            setSmoothScrollingEnabled min14 = NotificationCompatSideChannelService.getMin();
            min14.setMin = sendaccessibilityevent4.onMessageChannelReady;
            min14.getMax.set(min13, length3, sendaccessibilityevent.setMax() + min13, sendaccessibilityevent.setMin() + length3);
            min14.getMin = layoutState2.ICustomTabsService;
            layoutOutput3 = layoutOutput2;
            if (layoutOutput2 != null) {
                min14.length = layoutOutput3.getMax;
            }
            layoutState2.toString.add(min14);
        }
        ArrayList<onSizeChanged.length> arrayList4 = sendaccessibilityevent4.asInterface;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            if (layoutState2.onRelationshipValidationResult == null) {
                layoutState2.onRelationshipValidationResult = new onSizeChanged();
            }
            for (onSizeChanged.length next : arrayList4) {
                onSizeChanged onsizechanged = layoutState2.onRelationshipValidationResult;
                String str = next.getMax;
                computeScrollDeltaToGetChildRectOnScreen computescrolldeltatogetchildrectonscreen = next.getMin;
                isStopped isstopped7 = next.setMin;
                if (onsizechanged.getMin == null) {
                    onsizechanged.getMin = new LinkedHashMap();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(computescrolldeltatogetchildrectonscreen.hashCode());
                String obj = sb.toString();
                onSizeChanged.getMax getmax = onsizechanged.getMin.get(obj);
                if (getmax == null) {
                    onsizechanged.getMin.put(obj, new onSizeChanged.getMax(str, computescrolldeltatogetchildrectonscreen, isstopped7));
                } else {
                    getmax.getMax.add(isstopped7);
                }
            }
        }
        if (isstopped2 != null) {
            Rect isInside2 = NotificationCompatSideChannelService.isInside();
            if (layoutOutput3 != null) {
                isInside2.set(layoutOutput3.setMax);
            } else {
                isInside2.left = layoutState2.onTransact + sendaccessibilityevent.getMin();
                isInside2.top = layoutState2.ICustomTabsCallback$Stub + sendaccessibilityevent.length();
                isInside2.right = isInside2.left + sendaccessibilityevent.setMax();
                isInside2.bottom = isInside2.top + sendaccessibilityevent.setMin();
            }
            for (isStopped next2 : sendaccessibilityevent4.setMax) {
                Rect isInside3 = NotificationCompatSideChannelService.isInside();
                isInside3.set(isInside2);
                if (!(next2.FastBitmap$CoordinateSystem == null || next2.FastBitmap$CoordinateSystem.toString == null)) {
                    layoutState2.setMax.add(next2);
                }
                if (next2.toFloatRange != null) {
                    layoutState2.extraCallback.put(next2.toFloatRange, isInside3);
                }
            }
            NotificationCompatSideChannelService.setMax(isInside2);
        }
        if (keyToDirection.IsOverlapping) {
            if (layoutState2.setMin(sendaccessibilityevent4)) {
                int i12 = layoutState2.Mean$Arithmetic;
                synchronized (requestPostMessageChannelWithExtras) {
                    if (requestPostMessageChannel == null) {
                        requestPostMessageChannel = new HashMap();
                    }
                    List list = requestPostMessageChannel.get(Integer.valueOf(i12));
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(Boolean.valueOf(ThreadUtils.setMax()));
                    requestPostMessageChannel.put(Integer.valueOf(i12), list);
                    arrayList = new ArrayList(list);
                }
                getMin(sendaccessibilityevent, layoutState, (LayoutOutput) null, (onPerformActionForVirtualView<? extends Drawable>) new onPopulateNodeForHost(new getUriForFile(arrayList)), 2, max);
            }
        } else if (requestPostMessageChannel != null) {
            synchronized (requestPostMessageChannelWithExtras) {
                requestPostMessageChannel = null;
            }
        }
        long j6 = j;
        if (layoutState2.ICustomTabsService != j6) {
            layoutState2.ICustomTabsService = j6;
            layoutState2.getDefaultImpl = i;
            layoutState2.asBinder--;
        }
        layoutState2.getInterfaceDescriptor = z;
        length(layoutState);
        layoutState2.mayLaunchUrl = pagescroll;
        layoutState2.newSession = hide;
    }

    private static LayoutOutput getMin(sendAccessibilityEvent sendaccessibilityevent, LayoutState layoutState, @Nullable LayoutOutput layoutOutput, onPerformActionForVirtualView<? extends Drawable> onperformactionforvirtualview, int i, boolean z) {
        long j;
        PermissionInfoCompat$Protection min = PermissionInfoCompat$Protection.getMin(onperformactionforvirtualview);
        min.getMin(ensureProcessorRunningLocked.getMin(sendaccessibilityevent.getMax, min));
        boolean z2 = layoutOutput != null ? !min.setMax(layoutOutput.getMin, (isStopped) min) : false;
        if (layoutOutput != null) {
            j = layoutOutput.getMax;
        } else {
            j = -1;
        }
        LayoutOutput max = setMax(min, layoutState, sendaccessibilityevent, i, j, z2, z);
        hide<LayoutOutput> hide = layoutState.newSession;
        if (hide != null) {
            hide.getMax(i, max);
        }
        return max;
    }

    private static void length(LayoutState layoutState) {
        pageScroll pagescroll;
        hide<LayoutOutput> hide = layoutState.newSession;
        if (hide != null && !hide.length() && (pagescroll = layoutState.mayLaunchUrl) != null) {
            if (pagescroll.length == 3) {
                if (!layoutState.postMessage.contains(pagescroll) && layoutState.b.put(pagescroll, hide) != null) {
                    layoutState.b.remove(pagescroll);
                    layoutState.postMessage.add(pagescroll);
                }
            } else if (layoutState.b.put(pagescroll, hide) != null) {
                ComponentsReporter.LogLevel logLevel = ComponentsReporter.LogLevel.FATAL;
                StringBuilder sb = new StringBuilder("The transitionId '");
                sb.append(pagescroll);
                sb.append("' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n");
                sb.append(NotificationCompatSideChannelService.NotificationSideChannelStub.getMin(layoutState.hashCode));
                ComponentsReporter.setMax(logLevel, sb.toString());
            }
            layoutState.newSession = null;
            layoutState.mayLaunchUrl = null;
        }
    }

    private static LayoutOutput setMax(isStopped isstopped, LayoutState layoutState, sendAccessibilityEvent sendaccessibilityevent, int i, long j, boolean z, boolean z2) {
        NotificationCompat$StreamType.setMin();
        ensureProcessorRunningLocked ensureprocessorrunninglocked = layoutState.getMin;
        isstopped.setMin((NotificationCompat$GroupAlertBehavior) sendaccessibilityevent);
        LayoutOutput min = setMin(isstopped, layoutState, sendaccessibilityevent, z2);
        layoutState.getMax(min, layoutState.asBinder, i, j, z);
        getMin(layoutState, min);
        PlaybackStateCompat.ShuffleMode<Integer> shuffleMode = layoutState.IsOverlapping;
        int size = layoutState.toFloatRange.size() - 1;
        if (shuffleMode != null) {
            shuffleMode.setMax(min.getMax, Integer.valueOf(size));
        }
        return min;
    }

    private static void setMin(@Nullable LayoutState layoutState) {
        sendAccessibilityEvent sendaccessibilityevent;
        if (layoutState != null && (sendaccessibilityevent = layoutState.hashCode) != null && sendaccessibilityevent != ensureProcessorRunningLocked.length) {
            getMax(layoutState.hashCode, false);
            layoutState.hashCode = null;
        }
    }

    public static void getMax(sendAccessibilityEvent sendaccessibilityevent, boolean z) {
        sendAccessibilityEvent sendaccessibilityevent2;
        if (sendaccessibilityevent != ensureProcessorRunningLocked.length) {
            YogaNode yogaNode = sendaccessibilityevent.length;
            for (int size = (yogaNode.setMax == null ? 0 : yogaNode.setMax.size()) - 1; size >= 0; size--) {
                if (sendaccessibilityevent.length.setMin(size) == null) {
                    sendaccessibilityevent2 = null;
                } else {
                    sendaccessibilityevent2 = (sendAccessibilityEvent) sendaccessibilityevent.length.setMin(size).toFloatRange;
                }
                if (z && sendaccessibilityevent.extraCallbackWithResult()) {
                    sendaccessibilityevent.length.mHasNewLayout = false;
                }
                sendaccessibilityevent.hashCode(size);
                getMax(sendaccessibilityevent2, z);
            }
            if (sendaccessibilityevent.ICustomTabsCallback$Stub() && sendaccessibilityevent.toFloatRange != ensureProcessorRunningLocked.length) {
                getMax(sendaccessibilityevent.toFloatRange, true);
            }
            sendaccessibilityevent.ICustomTabsCallback$Default();
            return;
        }
        throw new IllegalArgumentException("Cannot release a null node tree");
    }

    private void getMax() {
        performAccessibilityAction performaccessibilityaction = this.asInterface;
        if (performaccessibilityaction != null) {
            if (performaccessibilityaction.setMax != null) {
                performaccessibilityaction.setMax.setMin();
            }
            if (performaccessibilityaction.length != null) {
                performaccessibilityaction.length.setMin();
            }
        }
    }

    private void getMax(LayoutOutput layoutOutput, int i, int i2, long j, boolean z) {
        if (this.asInterface == null) {
            this.asInterface = new performAccessibilityAction();
        }
        this.asInterface.length(layoutOutput, i, i2, j, z);
    }

    @VisibleForTesting
    private static sendAccessibilityEvent getMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped, sendAccessibilityEvent sendaccessibilityevent, int i, int i2, PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        isstopped.setMin(ensureprocessorrunninglocked);
        if (keyToDirection.getMax) {
            RemoteInput$EditChoicesBeforeSending.setMin(ensureprocessorrunninglocked, isstopped);
        }
        ensureProcessorRunningLocked ensureprocessorrunninglocked2 = isstopped.FastBitmap$CoordinateSystem;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            ensureprocessorrunninglocked2 = new ensureProcessorRunningLocked(ensureprocessorrunninglocked2);
        }
        boolean z = sendaccessibilityevent != null;
        if (z) {
            ensureprocessorrunninglocked2.toDoubleRange = sendaccessibilityevent.asBinder;
        }
        int i3 = ensureprocessorrunninglocked2.isInside;
        int i4 = ensureprocessorrunninglocked2.hashCode;
        ensureprocessorrunninglocked2.isInside = i;
        ensureprocessorrunninglocked2.hashCode = i2;
        ComponentsLogger componentsLogger = ensureprocessorrunninglocked2.getMin;
        if (componentsLogger != null) {
            ViewCompat$FocusRelativeDirection.setMax(ensureprocessorrunninglocked2, componentsLogger, componentsLogger.getMax());
        }
        sendAccessibilityEvent max = isstopped.setMax(ensureprocessorrunninglocked2, true);
        ensureprocessorrunninglocked2.toDoubleRange = null;
        ensureprocessorrunninglocked2.isInside = i3;
        ensureprocessorrunninglocked2.hashCode = i4;
        if (max == ensureProcessorRunningLocked.length) {
            return max;
        }
        if (z) {
            isStopped.getMax(isstopped);
        }
        if (YogaDirection.fromInt(YogaNode.jni_YGNodeStyleGetDirection(max.length.getMin)) == YogaDirection.INHERIT && setMax(ensureprocessorrunninglocked2.setMin)) {
            max.setMax(YogaDirection.RTL);
        }
        setMin(max, i, i2, permissionInfoCompat$ProtectionFlags);
        return max;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(int i, int i2) {
        return ContentInfoCompat$Source.getMin(this.onPostMessage, i, this.valueOf) && ContentInfoCompat$Source.getMin(this.onMessageChannelReady, i2, this.Grayscale$Algorithm);
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax() {
        return getExecutor.setMax(this.newSessionWithExtras) == this.warmup;
    }

    private static void setMax(sendAccessibilityEvent sendaccessibilityevent, PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        sendAccessibilityEvent sendaccessibilityevent2;
        sendaccessibilityevent.onMessageChannelReady();
        int i = 0;
        isStopped.getMax(sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0));
        if (length(sendaccessibilityevent, permissionInfoCompat$ProtectionFlags)) {
            sendaccessibilityevent.setMin(permissionInfoCompat$ProtectionFlags);
            YogaNode yogaNode = sendaccessibilityevent.length;
            int size = yogaNode.setMax == null ? 0 : yogaNode.setMax.size();
            int size2 = permissionInfoCompat$ProtectionFlags.toDoubleRange == null ? 0 : permissionInfoCompat$ProtectionFlags.toDoubleRange.size();
            if (size != 0 && size2 != 0) {
                while (i < size && i < size2) {
                    if (sendaccessibilityevent.length.setMin(i) == null) {
                        sendaccessibilityevent2 = null;
                    } else {
                        sendaccessibilityevent2 = (sendAccessibilityEvent) sendaccessibilityevent.length.setMin(i).toFloatRange;
                    }
                    setMax(sendaccessibilityevent2, permissionInfoCompat$ProtectionFlags.toDoubleRange.get(i));
                    i++;
                }
            } else if (!setMin(sendaccessibilityevent, permissionInfoCompat$ProtectionFlags)) {
                if (sendaccessibilityevent.setMax.size() != 0) {
                    sendaccessibilityevent.setMax.get(0);
                }
                sendaccessibilityevent.FastBitmap$CoordinateSystem();
            }
        }
    }

    private static boolean getMax(isStopped isstopped, isStopped isstopped2) {
        if (isstopped == isstopped2) {
            return true;
        }
        if (isstopped == null || isstopped2 == null) {
            return false;
        }
        return isstopped.getClass().equals(isstopped2.getClass());
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax(int i, int i2, int i3) {
        return this.isInside.setMax == i && getMin(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin(int i, int i2) {
        return this.valueOf == i && this.Grayscale$Algorithm == i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(int i) {
        return this.isInside.setMax == i;
    }

    @ThreadSafe(enableChecks = false)
    public final void length() {
        int decrementAndGet = this.invokeSuspend.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Trying to releaseRef a recycled LayoutState");
        } else if (!keyToDirection.ICustomTabsCallback$Default && decrementAndGet == 0) {
            this.getMin = null;
            this.isInside = null;
            this.valueOf = 0;
            this.Grayscale$Algorithm = 0;
            this.onTransact = 0;
            this.ICustomTabsCallback$Stub = 0;
            this.ICustomTabsService = -1;
            this.getDefaultImpl = -1;
            this.Mean$Arithmetic = -1;
            this.invoke = -1;
            this.onNavigationEvent = -1;
            this.getInterfaceDescriptor = true;
            int size = this.toFloatRange.size();
            for (int i = 0; i < size; i++) {
                this.toFloatRange.get(i).IsOverlapping();
            }
            this.toFloatRange.clear();
            this.toIntRange.clear();
            this.values.clear();
            this.IsOverlapping.setMin();
            for (Rect max : this.extraCallback.values()) {
                NotificationCompatSideChannelService.setMax(max);
            }
            this.extraCallback.clear();
            this.setMax.clear();
            int size2 = this.equals.size();
            for (int i2 = 0; i2 < size2; i2++) {
                NotificationCompatSideChannelService.setMax(this.equals.get(i2));
            }
            this.equals.clear();
            List<setSmoothScrollingEnabled> list = this.toString;
            if (list != null) {
                int size3 = list.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    NotificationCompatSideChannelService.getMax(this.toString.get(i3));
                }
                this.toString.clear();
            }
            this.ICustomTabsCallback$Stub$Proxy = false;
            this.newSessionWithExtras = null;
            this.warmup = false;
            PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags = this.ICustomTabsCallback$Default;
            if (permissionInfoCompat$ProtectionFlags != null) {
                NotificationCompatSideChannelService.length(permissionInfoCompat$ProtectionFlags);
                this.ICustomTabsCallback$Default = null;
            }
            getMax();
            List<Transition> list2 = this.create;
            if (list2 != null) {
                list2.clear();
                this.create = null;
            }
            sendAccessibilityEvent sendaccessibilityevent = this.hashCode;
            if (sendaccessibilityevent != null) {
                getMax(sendaccessibilityevent, false);
                this.hashCode = null;
            }
            this.FastBitmap$CoordinateSystem = null;
            this.toDoubleRange = null;
            List<isStopped> list3 = this.getCause;
            if (list3 != null) {
                list3.clear();
            }
            this.newSession = null;
            this.b.clear();
            this.postMessage.clear();
            this.onRelationshipValidationResult = null;
            NotificationCompatSideChannelService.setMin(this);
        }
    }

    private boolean setMin(sendAccessibilityEvent sendaccessibilityevent) {
        return this.hashCode.valueOf() ? sendaccessibilityevent == this.hashCode.toFloatRange : sendaccessibilityevent == this.hashCode;
    }

    private static boolean getMax(int i, int i2, int i3, int i4, float f, float f2) {
        return ContentInfoCompat$Source.getMin(i, i3, (int) f) && ContentInfoCompat$Source.getMin(i2, i4, (int) f2);
    }

    private static boolean setMax(sendAccessibilityEvent sendaccessibilityevent, LayoutState layoutState) {
        if (layoutState.setMin(sendaccessibilityevent)) {
            return true;
        }
        if (!isStopped.length(sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0)) && (getMax(sendaccessibilityevent, layoutState) || sendaccessibilityevent.extraCallback())) {
            return true;
        }
        if (keyToDirection.newSession || !getMax(sendaccessibilityevent)) {
            return false;
        }
        return true;
    }

    private static void getMin(LayoutState layoutState, LayoutOutput layoutOutput) {
        layoutOutput.FastBitmap$CoordinateSystem = layoutState.toFloatRange.size();
        layoutState.toFloatRange.add(layoutOutput);
        layoutState.toIntRange.add(layoutOutput);
        layoutState.values.add(layoutOutput);
    }

    @Nullable
    private static pageScroll getMin(sendAccessibilityEvent sendaccessibilityevent) {
        String str;
        String str2;
        int i;
        if (sendaccessibilityevent.onRelationshipValidationResult()) {
            Transition.TransitionKeyType transitionKeyType = sendaccessibilityevent.valueOf;
            if (transitionKeyType == Transition.TransitionKeyType.GLOBAL) {
                i = 1;
                str2 = null;
            } else if (transitionKeyType == Transition.TransitionKeyType.LOCAL) {
                i = 2;
                str2 = (sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0)).setMin;
            } else {
                throw new RuntimeException("Unhandled transition key type ".concat(String.valueOf(transitionKeyType)));
            }
            str = sendaccessibilityevent.Grayscale$Algorithm;
        } else if (!keyToDirection.extraCommand) {
            return null;
        } else {
            i = 3;
            str = (sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0)).toFloatRange;
            str2 = null;
        }
        if (str != null) {
            return new pageScroll(i, str, str2);
        }
        return null;
    }

    private static boolean getMax(sendAccessibilityEvent sendaccessibilityevent, LayoutState layoutState) {
        if (sendaccessibilityevent.setMax.size() != 0) {
            isStopped isstopped = sendaccessibilityevent.setMax.get(0);
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = sendaccessibilityevent.FastBitmap$CoordinateSystem;
        boolean z = viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.isInside();
        int i = sendaccessibilityevent.getMin;
        boolean z2 = layoutState.warmup && i != 2 && (z || ((viewCompat$ScrollIndicators != null && !TextUtils.isEmpty(viewCompat$ScrollIndicators.setMax)) || i != 0));
        boolean z3 = viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.getMin();
        boolean z4 = (viewCompat$ScrollIndicators == null || !viewCompat$ScrollIndicators.setMin() || viewCompat$ScrollIndicators.extraCallback == 2) ? false : true;
        boolean z5 = (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.length == null) ? false : true;
        boolean z6 = (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.setMin == null) ? false : true;
        boolean z7 = (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.getMin == 0.0f) ? false : true;
        boolean z8 = (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.toIntRange == null) ? false : true;
        boolean z9 = viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.setMax();
        boolean z10 = viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.onRelationshipValidationResult == 1;
        boolean z11 = viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.getMax();
        if (z3 || z4 || z5 || z6 || z7 || z8 || z9 || z11 || z2 || z10) {
            return true;
        }
        return false;
    }

    private static void getMin(PlaybackStateCompat.ShuffleMode shuffleMode, LayoutOutput layoutOutput, int i) {
        if (shuffleMode != null) {
            shuffleMode.setMax(layoutOutput.getMax, Integer.valueOf(i));
        }
    }

    static LayoutState getMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped, int i, int i2, int i3, boolean z, @Nullable LayoutState layoutState, int i4, int i5) {
        startNestedScroll startnestedscroll;
        ensureProcessorRunningLocked ensureprocessorrunninglocked2 = ensureprocessorrunninglocked;
        isStopped isstopped2 = isstopped;
        LayoutState layoutState2 = layoutState;
        int i6 = i4;
        int i7 = i5;
        ComponentsLogger componentsLogger = ensureprocessorrunninglocked2.getMin;
        NotificationCompat$StreamType.setMin();
        if (componentsLogger != null) {
            try {
                startnestedscroll = ViewCompat$FocusRelativeDirection.setMax(ensureprocessorrunninglocked, componentsLogger, componentsLogger.getMax());
            } finally {
            }
        } else {
            startnestedscroll = null;
        }
        int i8 = -1;
        if (!(startnestedscroll == null || i6 == -2 || i6 == -1 || i6 == 0 || i6 == 1 || i6 == 2)) {
            if (i6 != 3) {
                throw new RuntimeException("Unknown calculate layout source: ".concat(String.valueOf(i4)));
            }
        }
        isstopped.setMin();
        LayoutState length2 = NotificationCompatSideChannelService.length(ensureprocessorrunninglocked);
        length2.ICustomTabsCallback$Stub$Proxy = z;
        length2.Mean$Arithmetic = i;
        if (layoutState2 != null) {
            i8 = layoutState2.invoke;
        }
        length2.onNavigationEvent = i8;
        AccessibilityManager accessibilityManager = (AccessibilityManager) ensureprocessorrunninglocked2.setMin.getSystemService("accessibility");
        length2.newSessionWithExtras = accessibilityManager;
        length2.warmup = getExecutor.setMax(accessibilityManager);
        length2.isInside = isstopped2;
        length2.onPostMessage = i2;
        length2.onMessageChannelReady = i3;
        length2.toDoubleRange = isstopped2.valueOf;
        if (i7 == 1) {
            setMin(layoutState);
        }
        sendAccessibilityEvent sendaccessibilityevent = isstopped2.Mean$Arithmetic;
        isstopped2.Mean$Arithmetic = null;
        if (sendaccessibilityevent == null) {
            sendaccessibilityevent = getMin(ensureprocessorrunninglocked, isstopped, (sendAccessibilityEvent) null, i2, i3, layoutState2 != null ? layoutState2.ICustomTabsCallback$Default : null);
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            length2.valueOf = Math.min(sendaccessibilityevent.setMax(), View.MeasureSpec.getSize(i2));
        } else if (mode == 0) {
            length2.valueOf = sendaccessibilityevent.setMax();
        } else if (mode == 1073741824) {
            length2.valueOf = View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE) {
            length2.Grayscale$Algorithm = Math.min(sendaccessibilityevent.setMin(), View.MeasureSpec.getSize(i3));
        } else if (mode2 == 0) {
            length2.Grayscale$Algorithm = sendaccessibilityevent.setMin();
        } else if (mode2 == 1073741824) {
            length2.Grayscale$Algorithm = View.MeasureSpec.getSize(i3);
        }
        if (length2.asInterface != null) {
            performAccessibilityAction performaccessibilityaction = length2.asInterface;
            if (performaccessibilityaction.setMax != null) {
                performaccessibilityaction.setMax.setMin();
            }
            if (performaccessibilityaction.length != null) {
                performaccessibilityaction.length.setMin();
            }
        }
        length2.ICustomTabsService = -1;
        if (sendaccessibilityevent == ensureProcessorRunningLocked.length) {
            return length2;
        }
        length2.hashCode = sendaccessibilityevent;
        length2.FastBitmap$CoordinateSystem = getMin(sendaccessibilityevent);
        startNestedScroll max = componentsLogger != null ? ViewCompat$FocusRelativeDirection.setMax(ensureprocessorrunninglocked, componentsLogger, componentsLogger.getMax()) : null;
        getMax(ensureprocessorrunninglocked, sendaccessibilityevent, length2, (PermissionInfoCompat$ProtectionFlags) null);
        Collections.sort(length2.toIntRange, getMax);
        Collections.sort(length2.values, setMin);
        if (!(max == null || sendaccessibilityevent.setMax.size() == 0)) {
            sendaccessibilityevent.setMax.get(0);
        }
        if (i7 == 2) {
            setMin(layoutState);
        }
        if (i7 == 0 && !keyToDirection.getMax && !keyToDirection.equals && length2.hashCode != null) {
            getMax(length2.hashCode, false);
            length2.hashCode = null;
        }
        return length2;
    }

    @VisibleForTesting
    private static void setMin(sendAccessibilityEvent sendaccessibilityevent, int i, int i2, PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        startNestedScroll startnestedscroll;
        float f;
        ensureProcessorRunningLocked ensureprocessorrunninglocked = sendaccessibilityevent.getMax;
        if (sendaccessibilityevent.setMax.size() != 0) {
            sendaccessibilityevent.setMax.get(0);
        }
        NotificationCompat$StreamType.setMin();
        if (clampViewPositionHorizontal.length(((YogaValue) YogaNode.jni_YGNodeStyleGetWidth(sendaccessibilityevent.length.getMin)).setMax)) {
            sendaccessibilityevent.toDoubleRange(i);
        }
        if (clampViewPositionHorizontal.length(((YogaValue) YogaNode.jni_YGNodeStyleGetHeight(sendaccessibilityevent.length.getMin)).setMax)) {
            sendaccessibilityevent.FastBitmap$CoordinateSystem(i2);
        }
        if (permissionInfoCompat$ProtectionFlags != null) {
            NotificationCompat$StreamType.getMax();
            setMax(sendaccessibilityevent, permissionInfoCompat$ProtectionFlags);
            NotificationCompat$StreamType.length();
        }
        ComponentsLogger componentsLogger = ensureprocessorrunninglocked.getMin;
        if (componentsLogger != null) {
            startnestedscroll = ViewCompat$FocusRelativeDirection.setMax(ensureprocessorrunninglocked, componentsLogger, componentsLogger.getMax());
        } else {
            startnestedscroll = null;
        }
        if (!(startnestedscroll == null || sendaccessibilityevent.setMax.size() == 0)) {
            sendaccessibilityevent.setMax.get(0);
        }
        float f2 = 1.0E21f;
        if (View.MeasureSpec.getMode(i) == 0) {
            f = 1.0E21f;
        } else {
            f = (float) View.MeasureSpec.getSize(i);
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            f2 = (float) View.MeasureSpec.getSize(i2);
        }
        sendaccessibilityevent.length(sendaccessibilityevent);
        YogaNode.jni_YGNodeCalculateLayout(sendaccessibilityevent.length.getMin, f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (getMax(r0.toDoubleRange(), r0.values(), r13, r14, r0.extraCallbackWithResult, r0.onRelationshipValidationResult) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.sendAccessibilityEvent setMin(o.ensureProcessorRunningLocked r11, o.sendAccessibilityEvent r12, int r13, int r14) {
        /*
            java.util.List<o.isStopped> r0 = r12.setMax
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000c
            r4 = r2
            goto L_0x0015
        L_0x000c:
            java.util.List<o.isStopped> r0 = r12.setMax
            java.lang.Object r0 = r0.get(r1)
            o.isStopped r0 = (o.isStopped) r0
            r4 = r0
        L_0x0015:
            o.sendAccessibilityEvent r0 = r4.Mean$Arithmetic
            r4.Mean$Arithmetic = r2
            if (r0 != 0) goto L_0x001d
            o.sendAccessibilityEvent r0 = r12.toFloatRange
        L_0x001d:
            if (r0 == 0) goto L_0x0033
            int r5 = r0.toDoubleRange()
            int r6 = r0.values()
            float r9 = r0.extraCallbackWithResult
            float r10 = r0.onRelationshipValidationResult
            r7 = r13
            r8 = r14
            boolean r3 = getMax(r5, r6, r7, r8, r9, r10)
            if (r3 != 0) goto L_0x009a
        L_0x0033:
            o.sendAccessibilityEvent r3 = setMin((o.isStopped) r4, (o.sendAccessibilityEvent) r12, (int) r13, (int) r14)
            if (r3 == 0) goto L_0x003b
            r0 = r3
            goto L_0x0097
        L_0x003b:
            java.util.List<o.isStopped> r3 = r12.setMax
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            java.util.List<o.isStopped> r2 = r12.setMax
            java.lang.Object r1 = r2.get(r1)
            r2 = r1
            o.isStopped r2 = (o.isStopped) r2
        L_0x004d:
            boolean r1 = r11.length()
            if (r1 == 0) goto L_0x0067
            if (r2 == 0) goto L_0x0067
            o.isStopped r1 = r2.getMax()
            java.lang.String r2 = r2.toFloatRange
            r1.toFloatRange = r2
            java.util.List<o.isStopped> r2 = r12.setMax
            r2.clear()
            java.util.List<o.isStopped> r2 = r12.setMax
            r2.add(r1)
        L_0x0067:
            if (r0 == 0) goto L_0x006c
            o.isStopped.FastBitmap$CoordinateSystem()
        L_0x006c:
            if (r0 == 0) goto L_0x0076
            o.sendAccessibilityEvent r1 = o.ensureProcessorRunningLocked.length
            if (r0 == r1) goto L_0x0076
            r1 = 1
            getMax((o.sendAccessibilityEvent) r0, (boolean) r1)
        L_0x0076:
            o.PermissionInfoCompat$ProtectionFlags r8 = r12.onPostMessage
            r3 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            o.sendAccessibilityEvent r11 = getMin((o.ensureProcessorRunningLocked) r3, (o.isStopped) r4, (o.sendAccessibilityEvent) r5, (int) r6, (int) r7, (o.PermissionInfoCompat$ProtectionFlags) r8)
            r11.getMax((int) r13)
            r11.getMin((int) r14)
            int r13 = r11.setMin()
            float r13 = (float) r13
            r11.getMax((float) r13)
            int r13 = r11.setMax()
            float r13 = (float) r13
            r11.length((float) r13)
            r0 = r11
        L_0x0097:
            r12.setMin((o.sendAccessibilityEvent) r0)
        L_0x009a:
            o.sendAccessibilityEvent.getMax((o.sendAccessibilityEvent) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LayoutState.setMin(o.ensureProcessorRunningLocked, o.sendAccessibilityEvent, int, int):o.sendAccessibilityEvent");
    }

    @Nullable
    private static sendAccessibilityEvent setMin(isStopped isstopped, sendAccessibilityEvent sendaccessibilityevent, int i, int i2) {
        sendAccessibilityEvent sendaccessibilityevent2;
        if (isstopped.values == null) {
            sendaccessibilityevent2 = null;
        } else {
            sendaccessibilityevent2 = isstopped.values.get(Long.valueOf(Thread.currentThread().getId()));
        }
        if (sendaccessibilityevent2 != null) {
            boolean max = sendAccessibilityEvent.getMax(sendaccessibilityevent, sendaccessibilityevent2);
            boolean max2 = getMax(sendaccessibilityevent2.toDoubleRange(), sendaccessibilityevent2.values(), i, i2, sendaccessibilityevent2.extraCallbackWithResult, sendaccessibilityevent2.onRelationshipValidationResult);
            if (!max || !max2) {
                isstopped.isInside();
            } else {
                isstopped.values.remove(Long.valueOf(Thread.currentThread().getId()));
                return sendaccessibilityevent2;
            }
        }
        return null;
    }

    private static boolean length(sendAccessibilityEvent sendaccessibilityevent, PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        if (permissionInfoCompat$ProtectionFlags == null) {
            return false;
        }
        return getMax(sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0), permissionInfoCompat$ProtectionFlags.toIntRange);
    }

    private static boolean setMin(sendAccessibilityEvent sendaccessibilityevent, PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        if (permissionInfoCompat$ProtectionFlags == null) {
            return true;
        }
        isStopped isstopped = sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0);
        if (isstopped != null) {
            return isstopped.setMax(isstopped, permissionInfoCompat$ProtectionFlags.toIntRange);
        }
        return true;
    }

    private static boolean getMax(sendAccessibilityEvent sendaccessibilityevent) {
        if (!TextUtils.isEmpty(sendaccessibilityevent.Grayscale$Algorithm)) {
            if (!isStopped.length(sendaccessibilityevent.setMax.size() == 0 ? null : sendaccessibilityevent.setMax.get(0))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final LayoutOutput length(long j) {
        int intValue = this.IsOverlapping.getMax(j, -1).intValue();
        if (intValue < 0) {
            return null;
        }
        return this.toFloatRange.get(intValue);
    }
}
