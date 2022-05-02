package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import o.fireTrigger;
import o.getDependencySortedChildren;
import o.getDependents;
import o.getDescendantRect;
import o.getDesiredAnchoredChildRectWithoutConstraints;
import o.getResolvedLayoutParams;
import o.getTopSortedChildren;
import o.isPointInChildBounds;
import o.layoutChildWithAnchor;
import o.parseBehavior;
import o.resolveKeylineGravity;
import o.setDebugMode;
import o.setFirstHorizontalStyle;
import o.setId;

public final class SingleRequest<R> implements getResolvedLayoutParams, getDesiredAnchoredChildRectWithoutConstraints, getDescendantRect {
    private static final boolean getMin = Log.isLoggable("Request", 2);
    private final layoutChildWithAnchor<R> FastBitmap$CoordinateSystem;
    private final Executor Grayscale$Algorithm;
    @GuardedBy("requestLock")
    private Status ICustomTabsCallback;
    private final Class<R> IsOverlapping;
    @Nullable
    private final List<parseBehavior<R>> Mean$Arithmetic;
    @GuardedBy("requestLock")
    @Nullable
    private Drawable b;
    @GuardedBy("requestLock")
    @Nullable
    private Drawable create;
    private final RequestCoordinator equals;
    @GuardedBy("requestLock")
    @Nullable
    private Drawable extraCallback;
    @Nullable
    private RuntimeException extraCallbackWithResult;
    private volatile setDebugMode getCause;
    private final isPointInChildBounds getMax;
    private final getTopSortedChildren<?> hashCode;
    @GuardedBy("requestLock")
    private fireTrigger<R> invoke;
    private final resolveKeylineGravity<? super R> invokeSuspend;
    private final setFirstHorizontalStyle isInside;
    @Nullable
    private final parseBehavior<R> length;
    @GuardedBy("requestLock")
    private int onMessageChannelReady;
    @GuardedBy("requestLock")
    private long onNavigationEvent;
    @GuardedBy("requestLock")
    private boolean onPostMessage;
    @GuardedBy("requestLock")
    private int onRelationshipValidationResult;
    @Nullable
    private final String setMax;
    private final Object setMin;
    private final int toDoubleRange;
    private final Context toFloatRange;
    @Nullable
    private final Object toIntRange;
    private final Priority toString;
    @GuardedBy("requestLock")
    private setDebugMode.length valueOf;
    private final int values;

    enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public static <R> SingleRequest<R> length(Context context, setFirstHorizontalStyle setfirsthorizontalstyle, Object obj, Object obj2, Class<R> cls, getTopSortedChildren<?> gettopsortedchildren, int i, int i2, Priority priority, layoutChildWithAnchor<R> layoutchildwithanchor, parseBehavior<R> parsebehavior, @Nullable List<parseBehavior<R>> list, RequestCoordinator requestCoordinator, setDebugMode setdebugmode, resolveKeylineGravity<? super R> resolvekeylinegravity, Executor executor) {
        return new SingleRequest(context, setfirsthorizontalstyle, obj, obj2, cls, gettopsortedchildren, i, i2, priority, layoutchildwithanchor, parsebehavior, list, requestCoordinator, setdebugmode, resolvekeylinegravity, executor);
    }

    private SingleRequest(Context context, setFirstHorizontalStyle setfirsthorizontalstyle, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, getTopSortedChildren<?> gettopsortedchildren, int i, int i2, Priority priority, layoutChildWithAnchor<R> layoutchildwithanchor, @Nullable parseBehavior<R> parsebehavior, @Nullable List<parseBehavior<R>> list, RequestCoordinator requestCoordinator, setDebugMode setdebugmode, resolveKeylineGravity<? super R> resolvekeylinegravity, Executor executor) {
        this.setMax = getMin ? String.valueOf(super.hashCode()) : null;
        this.getMax = new isPointInChildBounds.length();
        this.setMin = obj;
        this.toFloatRange = context;
        this.isInside = setfirsthorizontalstyle;
        this.toIntRange = obj2;
        this.IsOverlapping = cls;
        this.hashCode = gettopsortedchildren;
        this.toDoubleRange = i;
        this.values = i2;
        this.toString = priority;
        this.FastBitmap$CoordinateSystem = layoutchildwithanchor;
        this.length = parsebehavior;
        this.Mean$Arithmetic = list;
        this.equals = requestCoordinator;
        this.getCause = setdebugmode;
        this.invokeSuspend = resolvekeylinegravity;
        this.Grayscale$Algorithm = executor;
        this.ICustomTabsCallback = Status.PENDING;
        if (this.extraCallbackWithResult == null && setfirsthorizontalstyle.setMax()) {
            this.extraCallbackWithResult = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.setMin
            monitor-enter(r0)
            boolean r1 = r4.onPostMessage     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x009b
            o.isPointInChildBounds r1 = r4.getMax     // Catch:{ all -> 0x00a3 }
            r1.setMax()     // Catch:{ all -> 0x00a3 }
            long r1 = o.getDependencySortedChildren.setMax()     // Catch:{ all -> 0x00a3 }
            r4.onNavigationEvent = r1     // Catch:{ all -> 0x00a3 }
            java.lang.Object r1 = r4.toIntRange     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x003d
            int r1 = r4.toDoubleRange     // Catch:{ all -> 0x00a3 }
            int r2 = r4.values     // Catch:{ all -> 0x00a3 }
            boolean r1 = o.getDependents.length((int) r1, (int) r2)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0028
            int r1 = r4.toDoubleRange     // Catch:{ all -> 0x00a3 }
            r4.onMessageChannelReady = r1     // Catch:{ all -> 0x00a3 }
            int r1 = r4.values     // Catch:{ all -> 0x00a3 }
            r4.onRelationshipValidationResult = r1     // Catch:{ all -> 0x00a3 }
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r4.toFloatRange()     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x0030
            r1 = 5
            goto L_0x0031
        L_0x0030:
            r1 = 3
        L_0x0031:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a3 }
            r4.setMax(r2, r1)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            return
        L_0x003d:
            com.bumptech.glide.request.SingleRequest$Status r1 = r4.ICustomTabsCallback     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00a3 }
            if (r1 == r2) goto L_0x0093
            com.bumptech.glide.request.SingleRequest$Status r1 = r4.ICustomTabsCallback     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00a3 }
            if (r1 != r2) goto L_0x0052
            o.fireTrigger<R> r1 = r4.invoke     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00a3 }
            r4.length(r1, r2)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            return
        L_0x0052:
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a3 }
            r4.ICustomTabsCallback = r1     // Catch:{ all -> 0x00a3 }
            int r1 = r4.toDoubleRange     // Catch:{ all -> 0x00a3 }
            int r2 = r4.values     // Catch:{ all -> 0x00a3 }
            boolean r1 = o.getDependents.length((int) r1, (int) r2)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0068
            int r1 = r4.toDoubleRange     // Catch:{ all -> 0x00a3 }
            int r2 = r4.values     // Catch:{ all -> 0x00a3 }
            r4.getMax(r1, r2)     // Catch:{ all -> 0x00a3 }
            goto L_0x006d
        L_0x0068:
            o.layoutChildWithAnchor<R> r1 = r4.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00a3 }
            r1.getMin((o.getDesiredAnchoredChildRectWithoutConstraints) r4)     // Catch:{ all -> 0x00a3 }
        L_0x006d:
            com.bumptech.glide.request.SingleRequest$Status r1 = r4.ICustomTabsCallback     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00a3 }
            if (r1 == r2) goto L_0x0079
            com.bumptech.glide.request.SingleRequest$Status r1 = r4.ICustomTabsCallback     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a3 }
            if (r1 != r2) goto L_0x0088
        L_0x0079:
            boolean r1 = r4.invoke()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0088
            o.layoutChildWithAnchor<R> r1 = r4.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00a3 }
            android.graphics.drawable.Drawable r2 = r4.IsOverlapping()     // Catch:{ all -> 0x00a3 }
            r1.getMin((android.graphics.drawable.Drawable) r2)     // Catch:{ all -> 0x00a3 }
        L_0x0088:
            boolean r1 = getMin     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0091
            long r1 = r4.onNavigationEvent     // Catch:{ all -> 0x00a3 }
            o.getDependencySortedChildren.length(r1)     // Catch:{ all -> 0x00a3 }
        L_0x0091:
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            return
        L_0x0093:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.length():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        o.setDebugMode.setMin(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.setMin
            monitor-enter(r0)
            boolean r1 = r5.onPostMessage     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0065
            o.isPointInChildBounds r1 = r5.getMax     // Catch:{ all -> 0x006d }
            r1.setMax()     // Catch:{ all -> 0x006d }
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.ICustomTabsCallback     // Catch:{ all -> 0x006d }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x006d }
            if (r1 != r2) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x0014:
            boolean r1 = r5.onPostMessage     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x005d
            o.isPointInChildBounds r1 = r5.getMax     // Catch:{ all -> 0x006d }
            r1.setMax()     // Catch:{ all -> 0x006d }
            o.layoutChildWithAnchor<R> r1 = r5.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x006d }
            r1.setMax(r5)     // Catch:{ all -> 0x006d }
            o.setDebugMode$length r1 = r5.valueOf     // Catch:{ all -> 0x006d }
            r2 = 0
            if (r1 == 0) goto L_0x003a
            o.setDebugMode$length r1 = r5.valueOf     // Catch:{ all -> 0x006d }
            o.setDebugMode r3 = o.setDebugMode.this     // Catch:{ all -> 0x006d }
            monitor-enter(r3)     // Catch:{ all -> 0x006d }
            o.setScene<?> r4 = r1.getMin     // Catch:{ all -> 0x0037 }
            o.getDescendantRect r1 = r1.getMax     // Catch:{ all -> 0x0037 }
            r4.setMin((o.getDescendantRect) r1)     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            r5.valueOf = r2     // Catch:{ all -> 0x006d }
            goto L_0x003a
        L_0x0037:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x006d }
        L_0x003a:
            o.fireTrigger<R> r1 = r5.invoke     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0043
            o.fireTrigger<R> r1 = r5.invoke     // Catch:{ all -> 0x006d }
            r5.invoke = r2     // Catch:{ all -> 0x006d }
            r2 = r1
        L_0x0043:
            boolean r1 = r5.FastBitmap$CoordinateSystem()     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0052
            o.layoutChildWithAnchor<R> r1 = r5.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x006d }
            android.graphics.drawable.Drawable r3 = r5.IsOverlapping()     // Catch:{ all -> 0x006d }
            r1.getMax(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x006d }
            r5.ICustomTabsCallback = r1     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x005c
            o.setDebugMode.setMin(r2)
        L_0x005c:
            return
        L_0x005d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x006d }
        L_0x0065:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.getMin():void");
    }

    public final void setMax() {
        synchronized (this.setMin) {
            if (getMax()) {
                getMin();
            }
        }
    }

    public final boolean getMax() {
        boolean z;
        synchronized (this.setMin) {
            if (this.ICustomTabsCallback != Status.RUNNING) {
                if (this.ICustomTabsCallback != Status.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean setMin() {
        boolean z;
        synchronized (this.setMin) {
            z = this.ICustomTabsCallback == Status.COMPLETE;
        }
        return z;
    }

    public final boolean equals() {
        boolean z;
        synchronized (this.setMin) {
            z = this.ICustomTabsCallback == Status.CLEARED;
        }
        return z;
    }

    public final boolean toIntRange() {
        boolean z;
        synchronized (this.setMin) {
            z = this.ICustomTabsCallback == Status.COMPLETE;
        }
        return z;
    }

    @GuardedBy("requestLock")
    private Drawable IsOverlapping() {
        if (this.b == null) {
            Drawable drawable = this.hashCode.IsOverlapping;
            this.b = drawable;
            if (drawable == null && this.hashCode.toFloatRange > 0) {
                this.b = length(this.hashCode.toFloatRange);
            }
        }
        return this.b;
    }

    @GuardedBy("requestLock")
    private Drawable toFloatRange() {
        if (this.extraCallback == null) {
            Drawable drawable = this.hashCode.toIntRange;
            this.extraCallback = drawable;
            if (drawable == null && this.hashCode.isInside > 0) {
                this.extraCallback = length(this.hashCode.isInside);
            }
        }
        return this.extraCallback;
    }

    @GuardedBy("requestLock")
    private Drawable length(@DrawableRes int i) {
        Resources.Theme theme;
        if (this.hashCode.hashCode != null) {
            theme = this.hashCode.hashCode;
        } else {
            theme = this.toFloatRange.getTheme();
        }
        return setId.length(this.isInside, i, theme);
    }

    @GuardedBy("requestLock")
    private void toDoubleRange() {
        if (invoke()) {
            Drawable drawable = null;
            if (this.toIntRange == null) {
                drawable = toFloatRange();
            }
            if (drawable == null) {
                if (this.create == null) {
                    Drawable drawable2 = this.hashCode.setMax;
                    this.create = drawable2;
                    if (drawable2 == null && this.hashCode.getMin > 0) {
                        this.create = length(this.hashCode.getMin);
                    }
                }
                drawable = this.create;
            }
            if (drawable == null) {
                drawable = IsOverlapping();
            }
            this.FastBitmap$CoordinateSystem.length(drawable);
        }
    }

    public final void getMax(int i, int i2) {
        Object obj;
        int i3 = i;
        int i4 = i2;
        this.getMax.setMax();
        Object obj2 = this.setMin;
        synchronized (obj2) {
            try {
                if (getMin) {
                    getDependencySortedChildren.length(this.onNavigationEvent);
                }
                if (this.ICustomTabsCallback == Status.WAITING_FOR_SIZE) {
                    this.ICustomTabsCallback = Status.RUNNING;
                    float f = this.hashCode.setMin;
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(((float) i3) * f);
                    }
                    this.onMessageChannelReady = i3;
                    this.onRelationshipValidationResult = i4 == Integer.MIN_VALUE ? i4 : Math.round(f * ((float) i4));
                    if (getMin) {
                        getDependencySortedChildren.length(this.onNavigationEvent);
                    }
                    obj = obj2;
                    try {
                        try {
                            this.valueOf = this.getCause.setMax(this.isInside, this.toIntRange, this.hashCode.equals, this.onMessageChannelReady, this.onRelationshipValidationResult, this.hashCode.toDoubleRange, this.IsOverlapping, this.toString, this.hashCode.getMax, this.hashCode.FastBitmap$CoordinateSystem, this.hashCode.valueOf(), this.hashCode.onNavigationEvent(), this.hashCode.toString, this.hashCode.invoke(), this.hashCode.getCause(), this.hashCode.b(), this.hashCode.extraCallback(), this, this.Grayscale$Algorithm);
                            if (this.ICustomTabsCallback != Status.RUNNING) {
                                this.valueOf = null;
                            }
                            if (getMin) {
                                getDependencySortedChildren.length(this.onNavigationEvent);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    private boolean values() {
        RequestCoordinator requestCoordinator = this.equals;
        return requestCoordinator == null || requestCoordinator.setMax(this);
    }

    @GuardedBy("requestLock")
    private boolean FastBitmap$CoordinateSystem() {
        RequestCoordinator requestCoordinator = this.equals;
        return requestCoordinator == null || requestCoordinator.setMin(this);
    }

    @GuardedBy("requestLock")
    private boolean invoke() {
        RequestCoordinator requestCoordinator = this.equals;
        return requestCoordinator == null || requestCoordinator.getMin(this);
    }

    @GuardedBy("requestLock")
    private boolean Grayscale$Algorithm() {
        RequestCoordinator requestCoordinator = this.equals;
        return requestCoordinator == null || !requestCoordinator.toFloatRange().toIntRange();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [o.fireTrigger<R>, o.setDebugMode$length] */
    /* JADX WARNING: type inference failed for: r0v2, types: [o.fireTrigger] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        o.setDebugMode.setMin(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(o.fireTrigger<?> r6, com.bumptech.glide.load.DataSource r7) {
        /*
            r5 = this;
            o.isPointInChildBounds r0 = r5.getMax
            r0.setMax()
            r0 = 0
            java.lang.Object r1 = r5.setMin     // Catch:{ all -> 0x00b2 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b2 }
            r5.valueOf = r0     // Catch:{ all -> 0x00af }
            if (r6 != 0) goto L_0x002c
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.<init>(r2)     // Catch:{ all -> 0x00af }
            java.lang.Class<R> r2 = r5.IsOverlapping     // Catch:{ all -> 0x00af }
            r7.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00af }
            r6.<init>(r7)     // Catch:{ all -> 0x00af }
            r5.setMax(r6)     // Catch:{ all -> 0x00af }
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            return
        L_0x002c:
            java.lang.Object r2 = r6.setMin()     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x0057
            java.lang.Class<R> r3 = r5.IsOverlapping     // Catch:{ all -> 0x00af }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00af }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00af }
            if (r3 != 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            boolean r3 = r5.values()     // Catch:{ all -> 0x00af }
            if (r3 != 0) goto L_0x0052
            r5.invoke = r0     // Catch:{ all -> 0x00ab }
            com.bumptech.glide.request.SingleRequest$Status r7 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00ab }
            r5.ICustomTabsCallback = r7     // Catch:{ all -> 0x00ab }
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0051
            o.setDebugMode.setMin(r6)
        L_0x0051:
            return
        L_0x0052:
            r5.setMin(r6, r2, r7)     // Catch:{ all -> 0x00af }
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            return
        L_0x0057:
            r5.invoke = r0     // Catch:{ all -> 0x00ab }
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "Expected to receive an object of "
            r0.<init>(r3)     // Catch:{ all -> 0x00ab }
            java.lang.Class<R> r3 = r5.IsOverlapping     // Catch:{ all -> 0x00ab }
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x0073
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00ab }
            goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            r0.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            r0.append(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = ""
            goto L_0x0097
        L_0x0095:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x0097:
            r0.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ab }
            r7.<init>(r0)     // Catch:{ all -> 0x00ab }
            r5.setMax(r7)     // Catch:{ all -> 0x00ab }
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x00aa
            o.setDebugMode.setMin(r6)
        L_0x00aa:
            return
        L_0x00ab:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x00b0
        L_0x00af:
            r6 = move-exception
        L_0x00b0:
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            throw r6     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r6 = move-exception
            if (r0 == 0) goto L_0x00b8
            o.setDebugMode.setMin(r0)
        L_0x00b8:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.length(o.fireTrigger, com.bumptech.glide.load.DataSource):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0 A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.GuardedBy("requestLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMin(o.fireTrigger<R> r11, R r12, com.bumptech.glide.load.DataSource r13) {
        /*
            r10 = this;
            boolean r6 = r10.Grayscale$Algorithm()
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r10.ICustomTabsCallback = r0
            r10.invoke = r11
            o.setFirstHorizontalStyle r11 = r10.isInside
            int r11 = r11.setMin()
            r0 = 3
            if (r11 > r0) goto L_0x005f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Finished loading "
            r11.<init>(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.toIntRange
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.onMessageChannelReady
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.onRelationshipValidationResult
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.onNavigationEvent
            double r0 = o.getDependencySortedChildren.length(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
        L_0x005f:
            r11 = 1
            r10.onPostMessage = r11
            r7 = 0
            java.util.List<o.parseBehavior<R>> r0 = r10.Mean$Arithmetic     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0087
            java.util.List<o.parseBehavior<R>> r0 = r10.Mean$Arithmetic     // Catch:{ all -> 0x00b4 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b4 }
            r9 = 0
        L_0x006e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b4 }
            o.parseBehavior r0 = (o.parseBehavior) r0     // Catch:{ all -> 0x00b4 }
            java.lang.Object r2 = r10.toIntRange     // Catch:{ all -> 0x00b4 }
            o.layoutChildWithAnchor<R> r3 = r10.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00b4 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b4 }
            r9 = r9 | r0
            goto L_0x006e
        L_0x0087:
            r9 = 0
        L_0x0088:
            o.parseBehavior<R> r0 = r10.length     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x009c
            o.parseBehavior<R> r0 = r10.length     // Catch:{ all -> 0x00b4 }
            java.lang.Object r2 = r10.toIntRange     // Catch:{ all -> 0x00b4 }
            o.layoutChildWithAnchor<R> r3 = r10.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00b4 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r13 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b4 }
            if (r13 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r11 = 0
        L_0x009d:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00aa
            o.resolveKeylineGravity<? super R> r11 = r10.invokeSuspend     // Catch:{ all -> 0x00b4 }
            r11.getMin()     // Catch:{ all -> 0x00b4 }
            o.layoutChildWithAnchor<R> r11 = r10.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00b4 }
            r11.getMin(r12)     // Catch:{ all -> 0x00b4 }
        L_0x00aa:
            r10.onPostMessage = r7
            com.bumptech.glide.request.RequestCoordinator r11 = r10.equals
            if (r11 == 0) goto L_0x00b3
            r11.length(r10)
        L_0x00b3:
            return
        L_0x00b4:
            r11 = move-exception
            r10.onPostMessage = r7
            goto L_0x00b9
        L_0x00b8:
            throw r11
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.setMin(o.fireTrigger, java.lang.Object, com.bumptech.glide.load.DataSource):void");
    }

    public final void setMax(GlideException glideException) {
        setMax(glideException, 5);
    }

    public final Object isInside() {
        this.getMax.setMax();
        return this.setMin;
    }

    /* JADX INFO: finally extract failed */
    private void setMax(GlideException glideException, int i) {
        boolean z;
        this.getMax.setMax();
        synchronized (this.setMin) {
            glideException.setOrigin(this.extraCallbackWithResult);
            int min = this.isInside.setMin();
            if (min <= i) {
                StringBuilder sb = new StringBuilder("Load failed for ");
                sb.append(this.toIntRange);
                sb.append(" with size [");
                sb.append(this.onMessageChannelReady);
                sb.append("x");
                sb.append(this.onRelationshipValidationResult);
                sb.append("]");
                if (min <= 4) {
                    glideException.logRootCauses("Glide");
                }
            }
            this.valueOf = null;
            this.ICustomTabsCallback = Status.FAILED;
            boolean z2 = true;
            this.onPostMessage = true;
            try {
                if (this.Mean$Arithmetic != null) {
                    z = false;
                    for (parseBehavior<R> onLoadFailed : this.Mean$Arithmetic) {
                        z |= onLoadFailed.onLoadFailed(glideException, this.toIntRange, this.FastBitmap$CoordinateSystem, Grayscale$Algorithm());
                    }
                } else {
                    z = false;
                }
                if (this.length == null || !this.length.onLoadFailed(glideException, this.toIntRange, this.FastBitmap$CoordinateSystem, Grayscale$Algorithm())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    toDoubleRange();
                }
                this.onPostMessage = false;
                if (this.equals != null) {
                    this.equals.IsOverlapping(this);
                }
            } catch (Throwable th) {
                this.onPostMessage = false;
                throw th;
            }
        }
    }

    public final boolean getMax(getResolvedLayoutParams getresolvedlayoutparams) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        getTopSortedChildren<?> gettopsortedchildren;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        getTopSortedChildren<?> gettopsortedchildren2;
        Priority priority2;
        int size2;
        getResolvedLayoutParams getresolvedlayoutparams2 = getresolvedlayoutparams;
        if (!(getresolvedlayoutparams2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.setMin) {
            i = this.toDoubleRange;
            i2 = this.values;
            obj = this.toIntRange;
            cls = this.IsOverlapping;
            gettopsortedchildren = this.hashCode;
            priority = this.toString;
            size = this.Mean$Arithmetic != null ? this.Mean$Arithmetic.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) getresolvedlayoutparams2;
        synchronized (singleRequest.setMin) {
            i3 = singleRequest.toDoubleRange;
            i4 = singleRequest.values;
            obj2 = singleRequest.toIntRange;
            cls2 = singleRequest.IsOverlapping;
            gettopsortedchildren2 = singleRequest.hashCode;
            priority2 = singleRequest.toString;
            size2 = singleRequest.Mean$Arithmetic != null ? singleRequest.Mean$Arithmetic.size() : 0;
        }
        return i == i3 && i2 == i4 && getDependents.length(obj, obj2) && cls.equals(cls2) && gettopsortedchildren.equals(gettopsortedchildren2) && priority == priority2 && size == size2;
    }
}
