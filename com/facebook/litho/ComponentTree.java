package com.facebook.litho;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.ReturnsOwnership;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.litho.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.GuardedBy;
import o.BlendModeCompat;
import o.IconCompat;
import o.NotificationCompatSideChannelService;
import o.ServiceCompat$StopForegroundFlags;
import o.WindowInsetsCompat$Type$InsetsType;
import o.callbackSuccessAsync;
import o.computeVerticalScrollExtent;
import o.ensureProcessorRunningLocked;
import o.executeKeyEvent;
import o.getActionList;
import o.isNestedScrollingEnabled;
import o.isSpanStillValid;
import o.isStopped;
import o.keyToDirection;
import o.moveFocus;
import o.onGenericMotionEvent;
import o.onScrollChanged;
import o.onSizeChanged;
import o.requestChildFocus;
import o.sendAccessibilityEventUnchecked;
import o.setOnScrollChangeListener;

@ThreadSafe
public class ComponentTree {
    private static final String ICustomTabsCallback$Stub = ComponentTree.class.getSimpleName();
    @GuardedBy("ComponentTree.class")
    private static volatile Looper ICustomTabsCallback$Stub$Proxy;
    @GuardedBy("ComponentTree.class")
    private static volatile Looper getDefaultImpl;
    private static final ThreadLocal<WeakReference<Handler>> newSession = new ThreadLocal<>();
    private static final AtomicInteger setDefaultImpl = new AtomicInteger(0);
    static final Handler setMax = new setMin((byte) 0);
    @ThreadConfined("UI")
    boolean FastBitmap$CoordinateSystem;
    @GuardedBy("mCurrentCalculateLayoutRunnableLock")
    @Nullable
    getMin Grayscale$Algorithm;
    @Nullable
    public LayoutState ICustomTabsCallback;
    /* access modifiers changed from: private */
    public final boolean ICustomTabsCallback$Default;
    @GuardedBy("this")
    @Nullable
    private toIntRange ICustomTabsService;
    private boolean ICustomTabsService$Default;
    private final int ICustomTabsService$Stub;
    @GuardedBy("this")
    private final WorkingRangeStatusHandler ICustomTabsService$Stub$Proxy = new WorkingRangeStatusHandler();
    @GuardedBy("this")
    private int IPostMessageService = -1;
    final Object IsOverlapping = new Object();
    final Object Mean$Arithmetic = new Object();
    final IconCompat.IconType asBinder = new IconCompat.IconType();
    private final boolean asInterface;
    @GuardedBy("this")
    @Nullable
    isStopped b;
    @GuardedBy("this")
    @Nullable
    LayoutState create;
    @ThreadConfined("UI")
    boolean equals;
    protected final int extraCallback;
    @ThreadConfined("UI")
    boolean extraCallbackWithResult = false;
    private final boolean extraCommand;
    @GuardedBy("this")
    @Nullable
    computeVerticalScrollExtent getCause;
    private final boolean getInterfaceDescriptor;
    final Runnable getMax = new Runnable() {
        public final void run() {
            ComponentTree componentTree = ComponentTree.this;
            ComponentTree.length(componentTree, componentTree.newSessionWithExtras);
        }
    };
    @Nullable
    public final String getMin;
    @ThreadConfined("UI")
    final boolean hashCode;
    @ThreadConfined("UI")
    @Nullable
    public Transition.getMin invoke;
    @ThreadConfined("UI")
    @Nullable
    public Transition.getMin invokeSuspend;
    @Nullable
    isSpanStillValid isInside;
    boolean length;
    @Nullable
    private final sendAccessibilityEventUnchecked mayLaunchUrl;
    /* access modifiers changed from: private */
    public final boolean newSessionWithExtras;
    @ThreadConfined("UI")
    isNestedScrollingEnabled onMessageChannelReady;
    @GuardedBy("this")
    onScrollChanged onNavigationEvent;
    @GuardedBy("this")
    boolean onPostMessage;
    @GuardedBy("this")
    int onRelationshipValidationResult;
    /* access modifiers changed from: private */
    @Nullable
    public final moveFocus onTransact;
    @GuardedBy("this")
    private int postMessage = -1;
    private final BlendModeCompat receiveFile = new BlendModeCompat();
    private volatile boolean requestPostMessageChannel;
    private volatile IsOverlapping requestPostMessageChannelWithExtras;
    String setMin;
    final Object toDoubleRange = new Object();
    final ensureProcessorRunningLocked toFloatRange;
    @GuardedBy("mUpdateStateSyncRunnableLock")
    @Nullable
    equals toIntRange;
    @ThreadConfined("UI")
    LithoView toString;
    @ThreadConfined("UI")
    private final boolean updateVisuals;
    private final boolean validateRelationship;
    @GuardedBy("mLayoutStateFutureLock")
    final List<toFloatRange> valueOf = new ArrayList();
    @ThreadConfined("UI")
    isSpanStillValid values;
    @ThreadConfined("UI")
    private final boolean warmup;

    public interface IsOverlapping {
    }

    public interface toIntRange {
    }

    public static getMax setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, @NonNull isStopped isstopped) {
        if (isstopped != null) {
            return NotificationCompatSideChannelService.getMax(ensureprocessorrunninglocked, isstopped);
        }
        throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
    }

    protected ComponentTree(getMax getmax) {
        this.toFloatRange = ensureProcessorRunningLocked.setMin(getmax.getMax, this);
        isStopped isstopped = getmax.length;
        setOnScrollChangeListener setonscrollchangelistener = callbackSuccessAsync.length;
        this.b = setonscrollchangelistener != null ? setonscrollchangelistener.getMin() : isstopped;
        this.hashCode = getmax.setMin;
        this.warmup = getmax.setMax;
        this.values = getmax.getMin;
        this.newSessionWithExtras = getmax.getCause;
        this.isInside = getmax.toFloatRange;
        this.updateVisuals = getmax.equals;
        this.requestPostMessageChannel = getmax.FastBitmap$CoordinateSystem;
        this.ICustomTabsService = getmax.values;
        this.getMin = getmax.hashCode;
        this.extraCommand = getmax.toDoubleRange;
        this.validateRelationship = getmax.toString;
        this.onTransact = getmax.invokeSuspend;
        this.ICustomTabsCallback$Default = getmax.valueOf;
        this.asInterface = getmax.invoke;
        this.getInterfaceDescriptor = getmax.Grayscale$Algorithm;
        this.ICustomTabsService$Stub = getmax.Mean$Arithmetic;
        if (this.values == null) {
            this.values = keyToDirection.Grayscale$Algorithm == null ? new length(create(), (byte) 0) : new onGenericMotionEvent(keyToDirection.Grayscale$Algorithm);
        }
        if (this.isInside == null && getmax.create) {
            this.isInside = new setMax(getCause(), (byte) 0);
        }
        onScrollChanged onscrollchanged = getmax.IsOverlapping;
        this.onNavigationEvent = onscrollchanged == null ? onScrollChanged.setMin((onScrollChanged) null) : onscrollchanged;
        if (getmax.isInside != null) {
            this.onMessageChannelReady = getmax.isInside;
            this.extraCallbackWithResult = true;
        }
        if (getmax.toIntRange != -1) {
            this.extraCallback = getmax.toIntRange;
        } else {
            this.extraCallback = setDefaultImpl.getAndIncrement();
        }
        this.mayLaunchUrl = new sendAccessibilityEventUnchecked(this);
    }

    @CheckReturnValue
    @ReturnsOwnership
    @GuardedBy("this")
    @ThreadConfined("UI")
    private LayoutState Mean$Arithmetic() {
        ThreadUtils.length();
        if (invokeSuspend()) {
            LayoutState layoutState = this.create;
            this.create = null;
            return layoutState;
        }
        LithoView lithoView = this.toString;
        if (lithoView != null) {
            lithoView.setMountStateDirty();
        }
        LayoutState layoutState2 = this.ICustomTabsCallback;
        this.ICustomTabsCallback = this.create;
        this.create = null;
        return layoutState2;
    }

    @CheckReturnValue
    @ReturnsOwnership
    @GuardedBy("this")
    @ThreadConfined("UI")
    private boolean invokeSuspend() {
        ThreadUtils.length();
        if (getMin(this.ICustomTabsCallback)) {
            return true;
        }
        if (setMax(this.create, this.postMessage, this.IPostMessageService) || !setMax(this.ICustomTabsCallback, this.postMessage, this.IPostMessageService)) {
            return false;
        }
        return true;
    }

    public final boolean setMin() {
        return this.requestPostMessageChannel;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r1.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r0 = r5.toString.getMeasuredWidth();
        r1 = r5.toString.getMeasuredHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r0 != 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r1 != 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if ((!length(r5.ICustomTabsCallback, r2, r0, r1)) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5.toString.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        valueOf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke() {
        /*
            r5 = this;
            com.facebook.litho.ThreadUtils.getMax()
            boolean r0 = r5.FastBitmap$CoordinateSystem
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            monitor-enter(r5)
            o.isStopped r0 = r5.b     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r5)     // Catch:{ all -> 0x004e }
            return
        L_0x000f:
            com.facebook.litho.LayoutState r0 = r5.ICustomTabsCallback     // Catch:{ all -> 0x004e }
            com.facebook.litho.LayoutState r1 = r5.Mean$Arithmetic()     // Catch:{ all -> 0x004e }
            com.facebook.litho.LayoutState r2 = r5.ICustomTabsCallback     // Catch:{ all -> 0x004e }
            r3 = 1
            if (r2 == r0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            o.isStopped r2 = r5.b     // Catch:{ all -> 0x004e }
            int r2 = r2.setMax     // Catch:{ all -> 0x004e }
            monitor-exit(r5)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0027
            r1.length()
        L_0x0027:
            if (r0 != 0) goto L_0x002a
            return
        L_0x002a:
            com.facebook.litho.LithoView r0 = r5.toString
            int r0 = r0.getMeasuredWidth()
            com.facebook.litho.LithoView r1 = r5.toString
            int r1 = r1.getMeasuredHeight()
            if (r0 != 0) goto L_0x003b
            if (r1 != 0) goto L_0x003b
            return
        L_0x003b:
            com.facebook.litho.LayoutState r4 = r5.ICustomTabsCallback
            boolean r0 = length(r4, r2, r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x004a
            com.facebook.litho.LithoView r0 = r5.toString
            r0.requestLayout()
            return
        L_0x004a:
            r5.valueOf()
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.invoke():void");
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        LayoutState Mean$Arithmetic2;
        int i;
        ThreadUtils.getMax();
        LithoView lithoView = this.toString;
        if (lithoView != null) {
            sendAccessibilityEventUnchecked sendaccessibilityeventunchecked = this.mayLaunchUrl;
            if (sendaccessibilityeventunchecked != null) {
                sendaccessibilityeventunchecked.setMax(lithoView);
            }
            synchronized (this) {
                this.FastBitmap$CoordinateSystem = true;
                Mean$Arithmetic2 = Mean$Arithmetic();
                if (this.b != null) {
                    i = this.b.setMax;
                } else {
                    StringBuilder sb = new StringBuilder("Trying to attach a ComponentTree with a null root. Is released: ");
                    sb.append(this.length);
                    sb.append(", Released Component name is: ");
                    sb.append(this.setMin);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (Mean$Arithmetic2 != null) {
                Mean$Arithmetic2.length();
            }
            int measuredWidth = this.toString.getMeasuredWidth();
            int measuredHeight = this.toString.getMeasuredHeight();
            if (measuredWidth != 0 || measuredHeight != 0) {
                if ((true ^ length(this.ICustomTabsCallback, i, measuredWidth, measuredHeight)) || this.toString.isMountStateDirty()) {
                    this.toString.requestLayout();
                } else {
                    this.toString.rebind();
                }
            }
        } else {
            throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
        }
    }

    private static boolean setMin(Context context, Context context2) {
        return ServiceCompat$StopForegroundFlags.setMin(context) == ServiceCompat$StopForegroundFlags.setMin(context2);
    }

    /* access modifiers changed from: package-private */
    @ThreadConfined("UI")
    public final boolean length() {
        return this.equals;
    }

    private boolean valueOf() {
        if (!this.toString.isMountStateDirty() && !this.toString.mountStateNeedsRemount()) {
            return false;
        }
        if (this.hashCode) {
            getMax();
        } else {
            setMax((Rect) null, true);
        }
        return true;
    }

    public final void getMax() {
        ThreadUtils.getMax();
        if (!this.hashCode) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        } else if (this.toString != null) {
            Rect isInside2 = NotificationCompatSideChannelService.isInside();
            if (keyToDirection.asInterface) {
                if (!(this.FastBitmap$CoordinateSystem && this.toString.getLocalVisibleRect(isInside2))) {
                    isInside2.setEmpty();
                }
                setMax(isInside2, true);
            } else if (this.toString.getLocalVisibleRect(isInside2) || getMin(isInside2)) {
                setMax(isInside2, true);
            }
            NotificationCompatSideChannelService.setMax(isInside2);
        }
    }

    private boolean getMin(Rect rect) {
        if (this.requestPostMessageChannel) {
            return false;
        }
        if (this.invoke == null || rect.height() != 0) {
            return this.invokeSuspend != null && rect.width() == 0;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int getMax(int i, boolean z, @Nullable Transition.getMin getmin, requestChildFocus requestchildfocus) {
        if (getmin == null) {
            return -1;
        }
        if (!this.requestPostMessageChannel && getmin.getMin != null) {
            return (int) Transition.getMin(getmin.getMin, this.ICustomTabsCallback, requestchildfocus);
        }
        if (!this.requestPostMessageChannel || z) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final void setMax(Rect rect, boolean z) {
        ThreadUtils.getMax();
        if (this.ICustomTabsCallback != null) {
            boolean isMountStateDirty = this.toString.isMountStateDirty();
            if (isMountStateDirty || !this.requestPostMessageChannel || !keyToDirection.asInterface || rect == null || !rect.equals(this.toString.getPreviousMountBounds())) {
                this.equals = true;
                if (!this.requestPostMessageChannel) {
                    WindowInsetsCompat$Type$InsetsType mountState = this.toString.getMountState();
                    ThreadUtils.getMax();
                    mountState.toDoubleRange = true;
                    this.requestPostMessageChannel = true;
                }
                this.toString.mount(this.ICustomTabsCallback, rect, z);
                if (isMountStateDirty) {
                    length(this.ICustomTabsCallback);
                }
                this.equals = false;
                this.invoke = null;
                this.invokeSuspend = null;
                if (isMountStateDirty) {
                    this.toString.onDirtyMountComplete();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax() {
        ThreadUtils.getMax();
        sendAccessibilityEventUnchecked sendaccessibilityeventunchecked = this.mayLaunchUrl;
        if (sendaccessibilityeventunchecked != null) {
            int size = sendaccessibilityeventunchecked.setMin.size();
            for (int i = 0; i < size; i++) {
                sendAccessibilityEventUnchecked.length.setMin(sendaccessibilityeventunchecked.setMin.get(i));
            }
            sendaccessibilityeventunchecked.setMin.clear();
        }
        synchronized (this) {
            this.FastBitmap$CoordinateSystem = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(@NonNull LithoView lithoView) {
        ThreadUtils.getMax();
        if (this.FastBitmap$CoordinateSystem) {
            LithoView lithoView2 = this.toString;
            if (lithoView2 != null) {
                lithoView2.setComponentTree((ComponentTree) null);
            } else {
                setMax();
            }
        } else {
            LithoView lithoView3 = this.toString;
            if (lithoView3 != null) {
                lithoView3.clearComponentTree();
            }
        }
        if (setMin(lithoView.getContext(), this.toFloatRange.setMin)) {
            this.toString = lithoView;
            return;
        }
        StringBuilder sb = new StringBuilder("Base view context differs, view context is: ");
        sb.append(lithoView.getContext());
        sb.append(", ComponentTree context is: ");
        sb.append(this.toFloatRange);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(int r15, int r16, int[] r17, boolean r18) {
        /*
            r14 = this;
            r11 = r14
            com.facebook.litho.ThreadUtils.getMax()
            monitor-enter(r14)
            r0 = 1
            r11.onPostMessage = r0     // Catch:{ all -> 0x00d7 }
            r4 = r15
            r11.postMessage = r4     // Catch:{ all -> 0x00d7 }
            r5 = r16
            r11.IPostMessageService = r5     // Catch:{ all -> 0x00d7 }
            com.facebook.litho.LayoutState r1 = r14.Mean$Arithmetic()     // Catch:{ all -> 0x00d7 }
            com.facebook.litho.LayoutState r2 = r11.ICustomTabsCallback     // Catch:{ all -> 0x00d7 }
            r12 = 0
            if (r2 == 0) goto L_0x0027
            com.facebook.litho.LayoutState r2 = r11.ICustomTabsCallback     // Catch:{ all -> 0x00d7 }
            int r3 = r11.postMessage     // Catch:{ all -> 0x00d7 }
            int r6 = r11.IPostMessageService     // Catch:{ all -> 0x00d7 }
            boolean r2 = setMax(r2, r3, r6)     // Catch:{ all -> 0x00d7 }
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            boolean r3 = r11.ICustomTabsService$Default     // Catch:{ all -> 0x00d7 }
            r13 = 0
            if (r3 != 0) goto L_0x0035
            if (r18 != 0) goto L_0x0035
            if (r2 == 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r3 = r13
            r8 = r3
            goto L_0x0049
        L_0x0035:
            o.isStopped r2 = r11.b     // Catch:{ all -> 0x00d7 }
            o.isStopped r2 = r2.getMax()     // Catch:{ all -> 0x00d7 }
            o.computeVerticalScrollExtent r3 = r11.getCause     // Catch:{ all -> 0x00d7 }
            if (r3 != 0) goto L_0x0041
            r3 = r13
            goto L_0x0045
        L_0x0041:
            o.computeVerticalScrollExtent r3 = o.computeVerticalScrollExtent.setMin(r3)     // Catch:{ all -> 0x00d7 }
        L_0x0045:
            r11.ICustomTabsService$Default = r12     // Catch:{ all -> 0x00d7 }
            r8 = r3
            r3 = r2
        L_0x0049:
            monitor-exit(r14)     // Catch:{ all -> 0x00d7 }
            if (r1 == 0) goto L_0x004f
            r1.length()
        L_0x004f:
            if (r3 == 0) goto L_0x009a
            com.facebook.litho.LayoutState r1 = r11.ICustomTabsCallback
            if (r1 == 0) goto L_0x0062
            monitor-enter(r14)
            com.facebook.litho.LayoutState r1 = r11.ICustomTabsCallback     // Catch:{ all -> 0x005f }
            r11.ICustomTabsCallback = r13     // Catch:{ all -> 0x005f }
            monitor-exit(r14)     // Catch:{ all -> 0x005f }
            r1.length()
            goto L_0x0062
        L_0x005f:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0062:
            o.ensureProcessorRunningLocked r2 = r11.toFloatRange
            boolean r6 = r11.warmup
            r7 = 0
            r9 = 3
            r10 = 0
            r1 = r14
            r4 = r15
            r5 = r16
            com.facebook.litho.LayoutState r1 = r1.length((o.ensureProcessorRunningLocked) r2, (o.isStopped) r3, (int) r4, (int) r5, (boolean) r6, (com.facebook.litho.LayoutState) r7, (o.computeVerticalScrollExtent) r8, (int) r9, (java.lang.String) r10)
            monitor-enter(r14)
            o.onScrollChanged r2 = r1.ICustomTabsCallback     // Catch:{ all -> 0x0097 }
            r1.ICustomTabsCallback = r13     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0097 }
            java.util.List<o.isStopped> r4 = r1.setMax     // Catch:{ all -> 0x0097 }
            r3.<init>(r4)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0086
            o.onScrollChanged r4 = r11.onNavigationEvent     // Catch:{ all -> 0x0097 }
            boolean r5 = r11.extraCommand     // Catch:{ all -> 0x0097 }
            r4.setMax(r2, r5)     // Catch:{ all -> 0x0097 }
        L_0x0086:
            java.util.List<o.isStopped> r2 = r1.setMax     // Catch:{ all -> 0x0097 }
            r2.clear()     // Catch:{ all -> 0x0097 }
            r11.ICustomTabsCallback = r1     // Catch:{ all -> 0x0097 }
            monitor-exit(r14)     // Catch:{ all -> 0x0097 }
            r14.getMax((java.util.List<o.isStopped>) r3)
            com.facebook.litho.LithoView r1 = r11.toString
            r1.setMountStateDirty()
            goto L_0x009a
        L_0x0097:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x009a:
            com.facebook.litho.LayoutState r1 = r11.ICustomTabsCallback
            int r1 = r1.valueOf
            r17[r12] = r1
            com.facebook.litho.LayoutState r1 = r11.ICustomTabsCallback
            int r1 = r1.Grayscale$Algorithm
            r17[r0] = r1
            monitor-enter(r14)
            r11.onPostMessage = r12     // Catch:{ all -> 0x00d4 }
            int r1 = r11.onRelationshipValidationResult     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00c2
            int r1 = r11.onRelationshipValidationResult     // Catch:{ all -> 0x00d4 }
            r11.onRelationshipValidationResult = r12     // Catch:{ all -> 0x00d4 }
            o.isStopped r2 = r11.b     // Catch:{ all -> 0x00d4 }
            o.isStopped r2 = r2.getMax()     // Catch:{ all -> 0x00d4 }
            o.computeVerticalScrollExtent r3 = r11.getCause     // Catch:{ all -> 0x00d4 }
            if (r3 != 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            o.computeVerticalScrollExtent r13 = o.computeVerticalScrollExtent.setMin(r3)     // Catch:{ all -> 0x00d4 }
        L_0x00c0:
            r6 = r13
            goto L_0x00c5
        L_0x00c2:
            r2 = r13
            r6 = r2
            r1 = 0
        L_0x00c5:
            monitor-exit(r14)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d3
            if (r1 != r0) goto L_0x00cc
            r3 = 1
            goto L_0x00cd
        L_0x00cc:
            r3 = 0
        L_0x00cd:
            r4 = 3
            r5 = 0
            r1 = r14
            r1.length(r2, r3, r4, r5, r6)
        L_0x00d3:
            return
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.setMax(int, int, int[], boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean toIntRange() {
        ThreadUtils.getMax();
        return valueOf();
    }

    public final boolean isInside() {
        return this.hashCode;
    }

    public final boolean toFloatRange() {
        return this.getInterfaceDescriptor;
    }

    public final boolean IsOverlapping() {
        return this.extraCommand;
    }

    /* access modifiers changed from: package-private */
    public final synchronized isStopped equals() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void FastBitmap$CoordinateSystem() {
        LayoutState layoutState = invokeSuspend() ? this.ICustomTabsCallback : this.create;
        if (layoutState != null) {
            WorkingRangeStatusHandler workingRangeStatusHandler = this.ICustomTabsService$Stub$Proxy;
            if (layoutState.onRelationshipValidationResult != null) {
                onSizeChanged onsizechanged = layoutState.onRelationshipValidationResult;
                if (onsizechanged.getMin != null) {
                    for (String str : onsizechanged.getMin.keySet()) {
                        onSizeChanged.getMax getmax = onsizechanged.getMin.get(str);
                        for (isStopped min : getmax.getMax) {
                            workingRangeStatusHandler.getMin(getmax.length, min);
                        }
                    }
                }
            }
        }
        this.ICustomTabsService$Stub$Proxy.getMin.clear();
    }

    @Keep
    @Nullable
    public LithoView getLithoView() {
        ThreadUtils.getMax();
        return this.toString;
    }

    @Nullable
    public final synchronized void setMin(List<Transition> list, @Nullable String str) {
        if (this.onNavigationEvent != null) {
            this.onNavigationEvent.getMin(list, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004e, code lost:
        if (r8 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        r7 = r6.toDoubleRange;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0055, code lost:
        if (r6.Grayscale$Algorithm == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0057, code lost:
        r6.values.removeCallbacks(r6.Grayscale$Algorithm);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005e, code lost:
        r8 = new com.facebook.litho.ComponentTree.getMin(r6, r9, r11, r10);
        r6.Grayscale$Algorithm = r8;
        r6.values.post(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006f, code lost:
        getMin(r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(o.isStopped r7, boolean r8, int r9, java.lang.String r10, @androidx.annotation.Nullable o.computeVerticalScrollExtent r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.length     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            return
        L_0x0007:
            o.onScrollChanged r0 = r6.onNavigationEvent     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x0013
        L_0x000d:
            o.onScrollChanged r0 = r6.onNavigationEvent     // Catch:{ all -> 0x0073 }
            java.util.Map r0 = r0.getMin()     // Catch:{ all -> 0x0073 }
        L_0x0013:
            if (r0 == 0) goto L_0x0029
            int r0 = r0.size()     // Catch:{ all -> 0x0073 }
            if (r0 <= 0) goto L_0x0029
            if (r7 == 0) goto L_0x0029
            o.isStopped r7 = r7.getMax()     // Catch:{ all -> 0x0073 }
            java.util.concurrent.atomic.AtomicInteger r0 = o.isStopped.length     // Catch:{ all -> 0x0073 }
            int r0 = r0.incrementAndGet()     // Catch:{ all -> 0x0073 }
            r7.setMax = r0     // Catch:{ all -> 0x0073 }
        L_0x0029:
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x002f
            r2 = 1
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r11 == 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0041
            int r4 = r7.setMax     // Catch:{ all -> 0x0073 }
            o.isStopped r5 = r6.b     // Catch:{ all -> 0x0073 }
            int r5 = r5.setMax     // Catch:{ all -> 0x0073 }
            if (r4 != r5) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0045
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            return
        L_0x0045:
            if (r2 == 0) goto L_0x0049
            r6.b = r7     // Catch:{ all -> 0x0073 }
        L_0x0049:
            if (r3 == 0) goto L_0x004d
            r6.getCause = r11     // Catch:{ all -> 0x0073 }
        L_0x004d:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            if (r8 == 0) goto L_0x006f
            java.lang.Object r7 = r6.toDoubleRange
            monitor-enter(r7)
            com.facebook.litho.ComponentTree$getMin r8 = r6.Grayscale$Algorithm     // Catch:{ all -> 0x006c }
            if (r8 == 0) goto L_0x005e
            o.isSpanStillValid r8 = r6.values     // Catch:{ all -> 0x006c }
            com.facebook.litho.ComponentTree$getMin r0 = r6.Grayscale$Algorithm     // Catch:{ all -> 0x006c }
            r8.removeCallbacks(r0)     // Catch:{ all -> 0x006c }
        L_0x005e:
            com.facebook.litho.ComponentTree$getMin r8 = new com.facebook.litho.ComponentTree$getMin     // Catch:{ all -> 0x006c }
            r8.<init>(r9, r11, r10)     // Catch:{ all -> 0x006c }
            r6.Grayscale$Algorithm = r8     // Catch:{ all -> 0x006c }
            o.isSpanStillValid r9 = r6.values     // Catch:{ all -> 0x006c }
            r9.post(r8)     // Catch:{ all -> 0x006c }
            monitor-exit(r7)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x006f:
            r6.getMin(r9, r10, r11)
            return
        L_0x0073:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.length(o.isStopped, boolean, int, java.lang.String, o.computeVerticalScrollExtent):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r1 = r11.toFloatRange.getMin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r1 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        r1 = o.ViewCompat$FocusRelativeDirection.setMax(r11.toFloatRange, r1, r1.getMax());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r1 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        com.facebook.litho.ThreadUtils.setMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        if (r11.asInterface == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        r1 = r11.onTransact;
        r2 = java.lang.Thread.currentThread().getName();
        android.os.Process.myTid();
        r1.length(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        r1 = length(r11.toFloatRange, r3, r4, r5, r11.warmup, r0, r16, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r0 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        if (ICustomTabsCallback() != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        if (setMax(r1, r11.postMessage, r11.IPostMessageService) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009f, code lost:
        if (r0 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        r0 = r1.ICustomTabsCallback;
        r1.ICustomTabsCallback = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (r0 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ab, code lost:
        if (r11.onNavigationEvent == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ad, code lost:
        r11.onNavigationEvent.setMax(r0, r11.extraCommand);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b4, code lost:
        r0 = new java.util.ArrayList(r1.setMax);
        r1.setMax.clear();
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c1, code lost:
        r0 = r11.create;
        r11.create = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c7, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c8, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        if (r12 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        getMax((java.util.List<o.isStopped>) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ce, code lost:
        if (r1 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d0, code lost:
        r1.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d3, code lost:
        if (r2 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d5, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d8, code lost:
        r0 = r11.isInside;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00da, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dc, code lost:
        r0.removeCallbacks(r11.getMax);
        r11.isInside.post(r11.getMax);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getMin(int r14, @androidx.annotation.Nullable java.lang.String r15, @androidx.annotation.Nullable o.computeVerticalScrollExtent r16) {
        /*
            r13 = this;
            r11 = r13
            java.lang.Object r1 = r11.toDoubleRange
            monitor-enter(r1)
            com.facebook.litho.ComponentTree$getMin r0 = r11.Grayscale$Algorithm     // Catch:{ all -> 0x00f1 }
            r12 = 0
            if (r0 == 0) goto L_0x0012
            o.isSpanStillValid r0 = r11.values     // Catch:{ all -> 0x00f1 }
            com.facebook.litho.ComponentTree$getMin r2 = r11.Grayscale$Algorithm     // Catch:{ all -> 0x00f1 }
            r0.removeCallbacks(r2)     // Catch:{ all -> 0x00f1 }
            r11.Grayscale$Algorithm = r12     // Catch:{ all -> 0x00f1 }
        L_0x0012:
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            monitor-enter(r13)
            boolean r0 = r13.onNavigationEvent()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            o.isStopped r0 = r11.b     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x0020
            goto L_0x00ec
        L_0x0020:
            boolean r0 = r13.ICustomTabsCallback()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0028
            monitor-exit(r13)     // Catch:{ all -> 0x00ee }
            return
        L_0x0028:
            int r4 = r11.postMessage     // Catch:{ all -> 0x00ee }
            int r5 = r11.IPostMessageService     // Catch:{ all -> 0x00ee }
            o.isStopped r0 = r11.b     // Catch:{ all -> 0x00ee }
            o.isStopped r3 = r0.getMax()     // Catch:{ all -> 0x00ee }
            com.facebook.litho.LayoutState r0 = r11.ICustomTabsCallback     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0049
            com.facebook.litho.LayoutState r0 = r11.ICustomTabsCallback     // Catch:{ all -> 0x00ee }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.invokeSuspend     // Catch:{ all -> 0x00ee }
            int r1 = r1.getAndIncrement()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = "Trying to use a released LayoutState"
            r0.<init>(r1)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x0049:
            r0 = r12
        L_0x004a:
            monitor-exit(r13)     // Catch:{ all -> 0x00ee }
            o.ensureProcessorRunningLocked r1 = r11.toFloatRange
            com.facebook.litho.ComponentsLogger r1 = r1.getMin
            if (r1 == 0) goto L_0x005c
            o.ensureProcessorRunningLocked r2 = r11.toFloatRange
            o.startNestedScroll r6 = r1.getMax()
            o.startNestedScroll r1 = o.ViewCompat$FocusRelativeDirection.setMax(r2, r1, r6)
            goto L_0x005d
        L_0x005c:
            r1 = r12
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            com.facebook.litho.ThreadUtils.setMax()
        L_0x0062:
            boolean r1 = r11.asInterface
            if (r1 == 0) goto L_0x0076
            o.moveFocus r1 = r11.onTransact
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            android.os.Process.myTid()
            r1.length(r2)
        L_0x0076:
            o.ensureProcessorRunningLocked r2 = r11.toFloatRange
            boolean r6 = r11.warmup
            r1 = r13
            r7 = r0
            r8 = r16
            r9 = r14
            r10 = r15
            com.facebook.litho.LayoutState r1 = r1.length((o.ensureProcessorRunningLocked) r2, (o.isStopped) r3, (int) r4, (int) r5, (boolean) r6, (com.facebook.litho.LayoutState) r7, (o.computeVerticalScrollExtent) r8, (int) r9, (java.lang.String) r10)
            if (r0 == 0) goto L_0x0089
            r0.length()
        L_0x0089:
            monitor-enter(r13)
            boolean r0 = r13.ICustomTabsCallback()     // Catch:{ all -> 0x00e9 }
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x009e
            int r0 = r11.postMessage     // Catch:{ all -> 0x00e9 }
            int r4 = r11.IPostMessageService     // Catch:{ all -> 0x00e9 }
            boolean r0 = setMax(r1, r0, r4)     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 == 0) goto L_0x00c7
            if (r1 == 0) goto L_0x00c1
            o.onScrollChanged r0 = r1.ICustomTabsCallback     // Catch:{ all -> 0x00e9 }
            r1.ICustomTabsCallback = r12     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00b4
            o.onScrollChanged r3 = r11.onNavigationEvent     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x00b4
            o.onScrollChanged r3 = r11.onNavigationEvent     // Catch:{ all -> 0x00e9 }
            boolean r4 = r11.extraCommand     // Catch:{ all -> 0x00e9 }
            r3.setMax(r0, r4)     // Catch:{ all -> 0x00e9 }
        L_0x00b4:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00e9 }
            java.util.List<o.isStopped> r3 = r1.setMax     // Catch:{ all -> 0x00e9 }
            r0.<init>(r3)     // Catch:{ all -> 0x00e9 }
            java.util.List<o.isStopped> r3 = r1.setMax     // Catch:{ all -> 0x00e9 }
            r3.clear()     // Catch:{ all -> 0x00e9 }
            r12 = r0
        L_0x00c1:
            com.facebook.litho.LayoutState r0 = r11.create     // Catch:{ all -> 0x00e9 }
            r11.create = r1     // Catch:{ all -> 0x00e9 }
            r1 = r0
            goto L_0x00c8
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            monitor-exit(r13)     // Catch:{ all -> 0x00e9 }
            if (r12 == 0) goto L_0x00ce
            r13.getMax((java.util.List<o.isStopped>) r12)
        L_0x00ce:
            if (r1 == 0) goto L_0x00d3
            r1.length()
        L_0x00d3:
            if (r2 == 0) goto L_0x00d8
            r13.b()
        L_0x00d8:
            o.isSpanStillValid r0 = r11.isInside
            if (r0 == 0) goto L_0x00e8
            java.lang.Runnable r1 = r11.getMax
            r0.removeCallbacks(r1)
            o.isSpanStillValid r0 = r11.isInside
            java.lang.Runnable r1 = r11.getMax
            r0.post(r1)
        L_0x00e8:
            return
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00ec:
            monitor-exit(r13)     // Catch:{ all -> 0x00ee }
            return
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.getMin(int, java.lang.String, o.computeVerticalScrollExtent):void");
    }

    private void b() {
        if (ThreadUtils.setMax()) {
            invoke();
        } else {
            setMax.obtainMessage(1, this).sendToTarget();
        }
    }

    @GuardedBy("this")
    private boolean getMin(LayoutState layoutState) {
        ThreadUtils.length();
        isStopped isstopped = this.b;
        return isstopped != null && getMax(layoutState, isstopped.setMax, this.postMessage, this.IPostMessageService);
    }

    @GuardedBy("this")
    private boolean ICustomTabsCallback() {
        ThreadUtils.length();
        return getMin(this.ICustomTabsCallback) || getMin(this.create);
    }

    @GuardedBy("this")
    private boolean onNavigationEvent() {
        ThreadUtils.length();
        return (this.postMessage == -1 || this.IPostMessageService == -1) ? false : true;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final synchronized String values() {
        if (this.b == null) {
            return null;
        }
        return this.b.valueOf;
    }

    private static synchronized Looper create() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (ICustomTabsCallback$Stub$Proxy == null) {
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                handlerThread.start();
                ICustomTabsCallback$Stub$Proxy = handlerThread.getLooper();
            }
            looper = ICustomTabsCallback$Stub$Proxy;
        }
        return looper;
    }

    private static synchronized Looper getCause() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (getDefaultImpl == null) {
                HandlerThread handlerThread = new HandlerThread("PreallocateMountContentThread");
                handlerThread.start();
                getDefaultImpl = handlerThread.getLooper();
            }
            looper = getDefaultImpl;
        }
        return looper;
    }

    private static boolean setMax(LayoutState layoutState, int i, int i2) {
        return layoutState != null && layoutState.getMin(i, i2) && layoutState.setMax();
    }

    private static boolean getMax(LayoutState layoutState, int i, int i2, int i3) {
        return layoutState != null && layoutState.setMax(i, i2, i3) && layoutState.setMax();
    }

    private static boolean length(LayoutState layoutState, int i, int i2, int i3) {
        return layoutState != null && layoutState.length(i) && layoutState.setMin(i2, i3) && layoutState.setMax();
    }

    public final synchronized boolean toDoubleRange() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final synchronized String Grayscale$Algorithm() {
        return this.setMin;
    }

    static class setMin extends Handler {
        /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                ((ComponentTree) message.obj).invoke();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Nullable
    private LayoutState length(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped, int i, int i2, boolean z, @Nullable LayoutState layoutState, @Nullable computeVerticalScrollExtent computeverticalscrollextent, int i3, @Nullable String str) {
        if (!this.validateRelationship) {
            return length(ensureprocessorrunninglocked, isstopped, i, i2, z, layoutState, computeverticalscrollextent, i3);
        }
        toFloatRange tofloatrange = new toFloatRange(this, ensureprocessorrunninglocked, isstopped, i, i2, z, layoutState, computeverticalscrollextent, i3, str, (byte) 0);
        synchronized (this.Mean$Arithmetic) {
            boolean z2 = false;
            int i4 = 0;
            while (true) {
                if (i4 >= this.valueOf.size()) {
                    break;
                } else if (this.valueOf.get(i4).equals(tofloatrange)) {
                    tofloatrange = this.valueOf.get(i4);
                    z2 = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z2) {
                this.valueOf.add(tofloatrange);
            }
            tofloatrange.setMin++;
        }
        LayoutState max = tofloatrange.getMax();
        synchronized (this.Mean$Arithmetic) {
            tofloatrange.setMin--;
            if (tofloatrange.setMin < 0) {
                throw new IllegalStateException("LayoutStateFuture ref count is below 0");
            } else if (tofloatrange.setMin == 0) {
                tofloatrange.setMax();
                if (this.valueOf.contains(tofloatrange)) {
                    this.valueOf.remove(tofloatrange);
                }
            }
        }
        return max;
    }

    /* access modifiers changed from: private */
    public LayoutState length(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped, int i, int i2, boolean z, @Nullable LayoutState layoutState, @Nullable computeVerticalScrollExtent computeverticalscrollextent, int i3) {
        getActionList getactionlist;
        ensureProcessorRunningLocked ensureprocessorrunninglocked2;
        synchronized (this) {
            if (!keyToDirection.FastBitmap$CoordinateSystem) {
                if (!keyToDirection.getMax) {
                    getactionlist = null;
                    ensureProcessorRunningLocked ensureprocessorrunninglocked3 = ensureprocessorrunninglocked;
                    ensureprocessorrunninglocked2 = new ensureProcessorRunningLocked(ensureprocessorrunninglocked, onScrollChanged.setMin(this.onNavigationEvent), getactionlist, computeverticalscrollextent);
                }
            }
            getactionlist = new getActionList(this.toFloatRange.getMin);
            ensureProcessorRunningLocked ensureprocessorrunninglocked32 = ensureprocessorrunninglocked;
            ensureprocessorrunninglocked2 = new ensureProcessorRunningLocked(ensureprocessorrunninglocked, onScrollChanged.setMin(this.onNavigationEvent), getactionlist, computeverticalscrollextent);
        }
        return LayoutState.getMin(ensureprocessorrunninglocked2, isstopped, this.extraCallback, i, i2, z, layoutState, i3, this.ICustomTabsService$Stub);
    }

    @VisibleForTesting
    class toFloatRange {
        @Nullable
        private final computeVerticalScrollExtent FastBitmap$CoordinateSystem;
        private final int IsOverlapping;
        private final boolean equals;
        private final AtomicInteger getMax;
        final /* synthetic */ ComponentTree getMin;
        @Nullable
        private final LayoutState isInside;
        @GuardedBy("LayoutStateFuture.this")
        @Nullable
        volatile LayoutState length;
        private final ensureProcessorRunningLocked setMax;
        volatile int setMin;
        /* access modifiers changed from: private */
        @GuardedBy("LayoutStateFuture.this")
        public volatile boolean toDoubleRange;
        private final isStopped toFloatRange;
        private final int toIntRange;
        private final FutureTask<LayoutState> values;

        /* synthetic */ toFloatRange(ComponentTree componentTree, ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped, int i, int i2, boolean z, LayoutState layoutState, computeVerticalScrollExtent computeverticalscrollextent, int i3, String str, byte b) {
            this(componentTree, ensureprocessorrunninglocked, isstopped, i, i2, z, layoutState, computeverticalscrollextent, i3, str);
        }

        private toFloatRange(ComponentTree componentTree, ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped, int i, int i2, @Nullable boolean z, @Nullable LayoutState layoutState, computeVerticalScrollExtent computeverticalscrollextent, @Nullable int i3, String str) {
            final ComponentTree componentTree2 = componentTree;
            this.getMin = componentTree2;
            this.getMax = new AtomicInteger(-1);
            this.toDoubleRange = false;
            this.length = null;
            final ensureProcessorRunningLocked ensureprocessorrunninglocked2 = ensureprocessorrunninglocked;
            this.setMax = ensureprocessorrunninglocked2;
            final isStopped isstopped2 = isstopped;
            this.toFloatRange = isstopped2;
            final int i4 = i;
            this.toIntRange = i4;
            final int i5 = i2;
            this.IsOverlapping = i5;
            final boolean z2 = z;
            this.equals = z2;
            final LayoutState layoutState2 = layoutState;
            this.isInside = layoutState2;
            final computeVerticalScrollExtent computeverticalscrollextent2 = computeverticalscrollextent;
            this.FastBitmap$CoordinateSystem = computeverticalscrollextent2;
            final int i6 = i3;
            final String str2 = str;
            this.values = new FutureTask<>(new Callable<LayoutState>() {
                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
                    if (com.facebook.litho.ComponentTree.toFloatRange.setMax(r12.toString) == false) goto L_0x0037;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
                    r0.length();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
                    monitor-exit(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
                    return null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
                    r12.toString.length = r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
                    monitor-exit(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
                    r0 = com.facebook.litho.ComponentTree.length(r12.toString.getMin, r3, r4, r5, r6, r7, r8, r9, r10);
                    r1 = r12.toString;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
                    monitor-enter(r1);
                 */
                @androidx.annotation.Nullable
                /* renamed from: getMax */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.facebook.litho.LayoutState call() {
                    /*
                        r12 = this;
                        com.facebook.litho.ComponentTree$toFloatRange r0 = com.facebook.litho.ComponentTree.toFloatRange.this
                        monitor-enter(r0)
                        com.facebook.litho.ComponentTree$toFloatRange r1 = com.facebook.litho.ComponentTree.toFloatRange.this     // Catch:{ all -> 0x0040 }
                        boolean r1 = r1.toDoubleRange     // Catch:{ all -> 0x0040 }
                        r2 = 0
                        if (r1 == 0) goto L_0x000e
                        monitor-exit(r0)     // Catch:{ all -> 0x0040 }
                        return r2
                    L_0x000e:
                        monitor-exit(r0)
                        com.facebook.litho.ComponentTree$toFloatRange r0 = com.facebook.litho.ComponentTree.toFloatRange.this
                        com.facebook.litho.ComponentTree r3 = r0.getMin
                        o.ensureProcessorRunningLocked r4 = r3
                        o.isStopped r5 = r4
                        int r6 = r5
                        int r7 = r6
                        boolean r8 = r7
                        com.facebook.litho.LayoutState r9 = r8
                        o.computeVerticalScrollExtent r10 = r9
                        int r11 = r10
                        com.facebook.litho.LayoutState r0 = r3.length(r4, r5, r6, r7, r8, r9, r10, r11)
                        com.facebook.litho.ComponentTree$toFloatRange r1 = com.facebook.litho.ComponentTree.toFloatRange.this
                        monitor-enter(r1)
                        com.facebook.litho.ComponentTree$toFloatRange r3 = com.facebook.litho.ComponentTree.toFloatRange.this     // Catch:{ all -> 0x003d }
                        boolean r3 = r3.toDoubleRange     // Catch:{ all -> 0x003d }
                        if (r3 == 0) goto L_0x0037
                        r0.length()     // Catch:{ all -> 0x003d }
                        monitor-exit(r1)     // Catch:{ all -> 0x003d }
                        return r2
                    L_0x0037:
                        com.facebook.litho.ComponentTree$toFloatRange r2 = com.facebook.litho.ComponentTree.toFloatRange.this     // Catch:{ all -> 0x003d }
                        r2.length = r0     // Catch:{ all -> 0x003d }
                        monitor-exit(r1)     // Catch:{ all -> 0x003d }
                        return r0
                    L_0x003d:
                        r0 = move-exception
                        monitor-exit(r1)
                        throw r0
                    L_0x0040:
                        r1 = move-exception
                        monitor-exit(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.toFloatRange.AnonymousClass2.call():com.facebook.litho.LayoutState");
                }
            });
        }

        /* access modifiers changed from: package-private */
        public final synchronized void setMax() {
            if (!this.toDoubleRange) {
                if (this.length != null) {
                    this.length.length();
                    this.length = null;
                }
                this.toDoubleRange = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        @androidx.annotation.VisibleForTesting
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.litho.LayoutState getMax() {
            /*
                r7 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r7.getMax
                int r1 = android.os.Process.myTid()
                r2 = -1
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0012
                java.util.concurrent.FutureTask<com.facebook.litho.LayoutState> r0 = r7.values
                r0.run()
            L_0x0012:
                java.util.concurrent.atomic.AtomicInteger r0 = r7.getMax
                int r0 = r0.get()
                boolean r1 = com.facebook.litho.ThreadUtils.setMax()
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0060
                java.util.concurrent.FutureTask<com.facebook.litho.LayoutState> r1 = r7.values
                boolean r1 = r1.isDone()
                if (r1 != 0) goto L_0x0060
                int r1 = android.os.Process.myTid()
                if (r0 == r1) goto L_0x0060
                boolean r1 = o.keyToDirection.asBinder
                if (r1 == 0) goto L_0x0037
                int r1 = com.facebook.litho.ThreadUtils.length(r0)
                goto L_0x003c
            L_0x0037:
                r1 = -4
                int r1 = com.facebook.litho.ThreadUtils.getMax(r0, r1)
            L_0x003c:
                r2 = r1
                r1 = 1
                com.facebook.litho.ComponentTree r4 = r7.getMin
                boolean r4 = r4.ICustomTabsCallback$Default
                if (r4 == 0) goto L_0x005c
                com.facebook.litho.ComponentTree r4 = r7.getMin
                o.moveFocus r4 = r4.onTransact
                java.lang.String r5 = java.lang.String.valueOf(r0)
                java.lang.String r6 = "LayoutStateFuture_"
                java.lang.String r5 = r6.concat(r5)
                o.getKeyboardFocusedVirtualViewId r4 = r4.length(r5)
                r1 = r2
                goto L_0x005e
            L_0x005c:
                r1 = r2
                r4 = r3
            L_0x005e:
                r2 = 1
                goto L_0x0062
            L_0x0060:
                r4 = r3
                r1 = 0
            L_0x0062:
                java.util.concurrent.FutureTask<com.facebook.litho.LayoutState> r5 = r7.values     // Catch:{ ExecutionException -> 0x00a1, InterruptedException -> 0x0096, CancellationException -> 0x0094 }
                java.lang.Object r5 = r5.get()     // Catch:{ ExecutionException -> 0x00a1, InterruptedException -> 0x0096, CancellationException -> 0x0094 }
                com.facebook.litho.LayoutState r5 = (com.facebook.litho.LayoutState) r5     // Catch:{ ExecutionException -> 0x00a1, InterruptedException -> 0x0096, CancellationException -> 0x0094 }
                if (r2 == 0) goto L_0x0073
                android.os.Process.setThreadPriority(r0, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0072, all -> 0x0070 }
                goto L_0x0073
            L_0x0070:
                r0 = move-exception
                throw r0
            L_0x0072:
            L_0x0073:
                if (r5 != 0) goto L_0x0076
                return r3
            L_0x0076:
                monitor-enter(r7)
                boolean r0 = r7.toDoubleRange     // Catch:{ all -> 0x008f }
                if (r0 == 0) goto L_0x007d
                monitor-exit(r7)     // Catch:{ all -> 0x008f }
                return r3
            L_0x007d:
                java.util.concurrent.atomic.AtomicInteger r0 = r5.invokeSuspend     // Catch:{ all -> 0x008f }
                int r0 = r0.getAndIncrement()     // Catch:{ all -> 0x008f }
                if (r0 == 0) goto L_0x0087
                monitor-exit(r7)     // Catch:{ all -> 0x008f }
                return r5
            L_0x0087:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008f }
                java.lang.String r1 = "Trying to use a released LayoutState"
                r0.<init>(r1)     // Catch:{ all -> 0x008f }
                throw r0     // Catch:{ all -> 0x008f }
            L_0x008f:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
            L_0x0092:
                r3 = move-exception
                goto L_0x00b7
            L_0x0094:
                r3 = move-exception
                goto L_0x0097
            L_0x0096:
                r3 = move-exception
            L_0x0097:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0092 }
                java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x0092 }
                r5.<init>(r6, r3)     // Catch:{ all -> 0x0092 }
                throw r5     // Catch:{ all -> 0x0092 }
            L_0x00a1:
                r3 = move-exception
                java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x0092 }
                boolean r6 = r5 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0092 }
                if (r6 == 0) goto L_0x00ad
                java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5     // Catch:{ all -> 0x0092 }
                throw r5     // Catch:{ all -> 0x0092 }
            L_0x00ad:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0092 }
                java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x0092 }
                r5.<init>(r6, r3)     // Catch:{ all -> 0x0092 }
                throw r5     // Catch:{ all -> 0x0092 }
            L_0x00b7:
                if (r2 == 0) goto L_0x00c0
                android.os.Process.setThreadPriority(r0, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00bf, all -> 0x00bd }
                goto L_0x00c0
            L_0x00bd:
                r0 = move-exception
                throw r0
            L_0x00bf:
            L_0x00c0:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.toFloatRange.getMax():com.facebook.litho.LayoutState");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            toFloatRange tofloatrange = (toFloatRange) obj;
            return this.toIntRange == tofloatrange.toIntRange && this.IsOverlapping == tofloatrange.IsOverlapping && this.setMax.equals(tofloatrange.setMax) && this.toFloatRange.setMax == tofloatrange.toFloatRange.setMax;
        }

        public final int hashCode() {
            return (((((this.setMax.hashCode() * 31) + this.toFloatRange.setMax) * 31) + this.toIntRange) * 31) + this.IsOverlapping;
        }
    }

    static class length extends Handler implements isSpanStillValid {
        /* synthetic */ length(Looper looper, byte b) {
            this(looper);
        }

        private length(Looper looper) {
            super(looper);
        }
    }

    static class setMax extends Handler implements isSpanStillValid {
        /* synthetic */ setMax(Looper looper, byte b) {
            this(looper);
        }

        private setMax(Looper looper) {
            super(looper);
        }
    }

    final class getMin extends executeKeyEvent {
        private final String getMax;
        @Nullable
        private final computeVerticalScrollExtent length;
        private final int setMax;

        public getMin(int i, @Nullable computeVerticalScrollExtent computeverticalscrollextent, String str) {
            this.setMax = i;
            this.length = computeverticalscrollextent;
            this.getMax = str;
        }

        public final void length() {
            ComponentTree.this.getMin(this.setMax, this.getMax, this.length);
        }
    }

    final class equals extends executeKeyEvent {
        private final String getMax;
        final /* synthetic */ ComponentTree setMax;

        public final void length() {
            ComponentTree componentTree = this.setMax;
            String str = this.getMax;
            synchronized (componentTree) {
                if (componentTree.b != null) {
                    if (!componentTree.onPostMessage) {
                        isStopped max = componentTree.b.getMax();
                        computeVerticalScrollExtent computeverticalscrollextent = componentTree.getCause;
                        computeVerticalScrollExtent min = computeverticalscrollextent == null ? null : computeVerticalScrollExtent.setMin(computeverticalscrollextent);
                        componentTree.length(max, false, 2, str, min);
                    } else if (componentTree.onRelationshipValidationResult != 2) {
                        componentTree.onRelationshipValidationResult = 2;
                    }
                }
            }
        }
    }

    public static class getMax {
        public boolean FastBitmap$CoordinateSystem = false;
        public boolean Grayscale$Algorithm = false;
        public onScrollChanged IsOverlapping;
        int Mean$Arithmetic;
        /* access modifiers changed from: private */
        public boolean create;
        public boolean equals = true;
        /* access modifiers changed from: private */
        public boolean getCause;
        public ensureProcessorRunningLocked getMax;
        public isSpanStillValid getMin;
        public String hashCode;
        public boolean invoke;
        @Nullable
        public moveFocus invokeSuspend;
        public isNestedScrollingEnabled isInside;
        public isStopped length;
        public boolean setMax = true;
        public boolean setMin = true;
        public boolean toDoubleRange = keyToDirection.mayLaunchUrl;
        public isSpanStillValid toFloatRange;
        public int toIntRange = -1;
        public boolean toString = false;
        public boolean valueOf;
        toIntRange values;

        public getMax() {
            int i = 1;
            int i2 = keyToDirection.requestPostMessageChannel;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = 2;
                    }
                }
                this.Mean$Arithmetic = i;
            }
            i = 0;
            this.Mean$Arithmetic = i;
        }

        public final ComponentTree length() {
            ComponentTree componentTree = new ComponentTree(this);
            NotificationCompatSideChannelService.setMin(this);
            return componentTree;
        }
    }

    public final void setMax(LayoutState layoutState) {
        List<isStopped> list = layoutState.getCause;
        if (list != null && !list.isEmpty() && this.onMessageChannelReady != null && list != null && list.size() > 0) {
            list.get(0);
            throw new RuntimeException("Trying to apply previous render data to component that doesn't support it");
        }
    }

    private void length(LayoutState layoutState) {
        List<isStopped> list = layoutState.getCause;
        if (list != null && !list.isEmpty()) {
            if (this.onMessageChannelReady == null) {
                this.onMessageChannelReady = NotificationCompatSideChannelService.valueOf();
            }
            this.onMessageChannelReady.length(list);
        }
    }

    private void getMax(List<isStopped> list) {
        this.asBinder.getMin();
        for (isStopped next : list) {
            this.receiveFile.setMin(next.FastBitmap$CoordinateSystem, next, next.toFloatRange);
            synchronized (this.asBinder) {
            }
        }
        this.receiveFile.setMax();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r1 = r4.toFloatRange.getMin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        o.ViewCompat$FocusRelativeDirection.setMax(r4.toFloatRange, r1, r1.getMax());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        o.NotificationCompat$StreamType.setMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r0.toFloatRange == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r0.toFloatRange.isEmpty() != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r4 = 0;
        r1 = r0.toFloatRange.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4 >= r1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r2 = r0.toFloatRange.get(r4).getMin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r5 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (o.isStopped.length(r2) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        o.NotificationCompatSideChannelService.length(r0.getMin.setMin, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void length(com.facebook.litho.ComponentTree r4, boolean r5) {
        /*
            monitor-enter(r4)
            com.facebook.litho.LayoutState r0 = r4.ICustomTabsCallback     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0018
            com.facebook.litho.LayoutState r0 = r4.ICustomTabsCallback     // Catch:{ all -> 0x0078 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.invokeSuspend     // Catch:{ all -> 0x0078 }
            int r1 = r1.getAndIncrement()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0026
        L_0x0010:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "Trying to use a released LayoutState"
            r5.<init>(r0)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x0078 }
        L_0x0018:
            com.facebook.litho.LayoutState r0 = r4.create     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0076
            com.facebook.litho.LayoutState r0 = r4.create     // Catch:{ all -> 0x0078 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.invokeSuspend     // Catch:{ all -> 0x0078 }
            int r1 = r1.getAndIncrement()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x006e
        L_0x0026:
            monitor-exit(r4)
            o.ensureProcessorRunningLocked r1 = r4.toFloatRange
            com.facebook.litho.ComponentsLogger r1 = r1.getMin
            if (r1 == 0) goto L_0x0036
            o.ensureProcessorRunningLocked r4 = r4.toFloatRange
            o.startNestedScroll r2 = r1.getMax()
            o.ViewCompat$FocusRelativeDirection.setMax(r4, r1, r2)
        L_0x0036:
            o.NotificationCompat$StreamType.setMin()
            java.util.List<com.facebook.litho.LayoutOutput> r4 = r0.toFloatRange
            if (r4 == 0) goto L_0x006a
            java.util.List<com.facebook.litho.LayoutOutput> r4 = r0.toFloatRange
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x006a
            r4 = 0
            java.util.List<com.facebook.litho.LayoutOutput> r1 = r0.toFloatRange
            int r1 = r1.size()
        L_0x004c:
            if (r4 >= r1) goto L_0x006a
            java.util.List<com.facebook.litho.LayoutOutput> r2 = r0.toFloatRange
            java.lang.Object r2 = r2.get(r4)
            com.facebook.litho.LayoutOutput r2 = (com.facebook.litho.LayoutOutput) r2
            o.isStopped r2 = r2.getMin
            if (r5 != 0) goto L_0x0067
            boolean r3 = o.isStopped.length((o.isStopped) r2)
            if (r3 == 0) goto L_0x0067
            o.ensureProcessorRunningLocked r3 = r0.getMin
            android.content.Context r3 = r3.setMin
            o.NotificationCompatSideChannelService.length(r3, r2)
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x004c
        L_0x006a:
            r0.length()
            return
        L_0x006e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "Trying to use a released LayoutState"
            r5.<init>(r0)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x007c
        L_0x007b:
            throw r5
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.length(com.facebook.litho.ComponentTree, boolean):void");
    }
}
