package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.ArrayList;
import java.util.List;
import o.MotionHelper;
import o.addPreDrawListener;
import o.addTransitionListener;
import o.evaluate;
import o.fireTransitionCompleted;
import o.fireTrigger;
import o.getAnchorDpDt;
import o.getConstraintSetNames;
import o.getDebugMode;
import o.getDependencySortedChildren;
import o.getVelocity;
import o.getViewVelocity;
import o.isPointInChildBounds;
import o.isUseOnHide;
import o.onViewAdded;
import o.parseLayoutDescription;
import o.removeTransitionListener;
import o.requestLayout;
import o.setAllowsGoneWidget;
import o.setFirstHorizontalStyle;
import o.setPivotY;
import o.setPositiveButtonIcon;
import o.setProgress;
import o.setTranslationX;
import o.setTranslationY;
import o.transitionToEnd;
import o.transitionToState;

public final class DecodeJob<R> implements getViewVelocity.setMin, Runnable, Comparable<DecodeJob<?>>, addPreDrawListener.getMin {
    public getMax<R> FastBitmap$CoordinateSystem;
    public volatile boolean Grayscale$Algorithm;
    private final setPositiveButtonIcon.length<DecodeJob<?>> ICustomTabsCallback;
    private volatile boolean ICustomTabsCallback$Default;
    public setPivotY IsOverlapping;
    setPivotY Mean$Arithmetic;
    private final isPointInChildBounds b = new isPointInChildBounds.length();
    private Stage create;
    public int equals;
    private setPivotY extraCallback;
    private isUseOnHide<?> extraCallbackWithResult;
    private final List<Throwable> getCause = new ArrayList();
    public setFirstHorizontalStyle getMax;
    public final setMin getMin = new setMin();
    public evaluate hashCode;
    public volatile getViewVelocity invoke;
    public boolean invokeSuspend;
    public int isInside;
    final setMax<?> length = new setMax<>();
    private Object onMessageChannelReady;
    private long onNavigationEvent;
    private Thread onPostMessage;
    private DataSource onRelationshipValidationResult;
    public final getMin setMax;
    public final requestLayout<R> setMin = new requestLayout<>();
    public MotionHelper toDoubleRange;
    public Priority toFloatRange;
    public getAnchorDpDt toIntRange;
    public int toString;
    public Object valueOf;
    public RunReason values;

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public interface getMax<R> {
        void setMax(fireTrigger<R> firetrigger, DataSource dataSource);

        void setMin(DecodeJob<?> decodeJob);

        void setMin(GlideException glideException);
    }

    public interface getMin {
        getConstraintSetNames getMin();
    }

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        DecodeJob decodeJob = (DecodeJob) obj;
        int ordinal = this.toFloatRange.ordinal() - decodeJob.toFloatRange.ordinal();
        return ordinal == 0 ? this.toString - decodeJob.toString : ordinal;
    }

    public DecodeJob(getMin getmin, setPositiveButtonIcon.length<DecodeJob<?>> length2) {
        this.setMax = getmin;
        this.ICustomTabsCallback = length2;
    }

    public final boolean length() {
        Stage min = getMin(Stage.INITIALIZE);
        return min == Stage.RESOURCE_CACHE || min == Stage.DATA_CACHE;
    }

    public final void getMax() {
        this.getMin.getMax();
        setMax<?> setmax = this.length;
        setmax.setMax = null;
        setmax.setMin = null;
        setmax.length = null;
        requestLayout<R> requestlayout = this.setMin;
        requestlayout.setMax = null;
        requestlayout.getMin = null;
        requestlayout.hashCode = null;
        requestlayout.equals = null;
        requestlayout.values = null;
        requestlayout.isInside = null;
        requestlayout.toString = null;
        requestlayout.toIntRange = null;
        requestlayout.invoke = null;
        requestlayout.length.clear();
        requestlayout.FastBitmap$CoordinateSystem = false;
        requestlayout.setMin.clear();
        requestlayout.toDoubleRange = false;
        this.ICustomTabsCallback$Default = false;
        this.getMax = null;
        this.IsOverlapping = null;
        this.toDoubleRange = null;
        this.toFloatRange = null;
        this.toIntRange = null;
        this.FastBitmap$CoordinateSystem = null;
        this.create = null;
        this.invoke = null;
        this.onPostMessage = null;
        this.Mean$Arithmetic = null;
        this.onMessageChannelReady = null;
        this.onRelationshipValidationResult = null;
        this.extraCallbackWithResult = null;
        this.onNavigationEvent = 0;
        this.Grayscale$Algorithm = false;
        this.valueOf = null;
        this.getCause.clear();
        this.ICustomTabsCallback.getMin(this);
    }

    public final void run() {
        isUseOnHide<?> isuseonhide = this.extraCallbackWithResult;
        try {
            if (this.Grayscale$Algorithm) {
                equals();
                if (isuseonhide != null) {
                    isuseonhide.getMin();
                    return;
                }
                return;
            }
            int i = AnonymousClass3.setMin[this.values.ordinal()];
            if (i == 1) {
                this.create = getMin(Stage.INITIALIZE);
                this.invoke = setMax();
                toIntRange();
            } else if (i == 2) {
                toIntRange();
            } else if (i == 3) {
                isInside();
            } else {
                StringBuilder sb = new StringBuilder("Unrecognized run reason: ");
                sb.append(this.values);
                throw new IllegalStateException(sb.toString());
            }
            if (isuseonhide != null) {
                isuseonhide.getMin();
            }
        } catch (transitionToState e) {
            throw e;
        } catch (Throwable th) {
            if (isuseonhide != null) {
                isuseonhide.getMin();
            }
            throw th;
        }
    }

    private getViewVelocity setMax() {
        int i = AnonymousClass3.getMin[this.create.ordinal()];
        if (i == 1) {
            return new addTransitionListener(this.setMin, this);
        }
        if (i == 2) {
            return new getVelocity(this.setMin, this);
        }
        if (i == 3) {
            return new onViewAdded(this.setMin, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Unrecognized stage: ");
        sb.append(this.create);
        throw new IllegalStateException(sb.toString());
    }

    private void toIntRange() {
        this.onPostMessage = Thread.currentThread();
        this.onNavigationEvent = getDependencySortedChildren.setMax();
        boolean z = false;
        while (!this.Grayscale$Algorithm && this.invoke != null && !(z = this.invoke.setMax())) {
            this.create = getMin(this.create);
            this.invoke = setMax();
            if (this.create == Stage.SOURCE) {
                this.values = RunReason.SWITCH_TO_SOURCE_SERVICE;
                this.FastBitmap$CoordinateSystem.setMin((DecodeJob<?>) this);
                return;
            }
        }
        if ((this.create == Stage.FINISHED || this.Grayscale$Algorithm) && !z) {
            equals();
        }
    }

    private void equals() {
        IsOverlapping();
        this.FastBitmap$CoordinateSystem.setMin(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.getCause)));
        if (this.getMin.setMax()) {
            getMax();
        }
    }

    private void IsOverlapping() {
        Throwable th;
        this.b.setMax();
        if (this.ICustomTabsCallback$Default) {
            if (this.getCause.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.getCause;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.ICustomTabsCallback$Default = true;
    }

    private Stage getMin(Stage stage) {
        while (true) {
            int i = AnonymousClass3.getMin[stage.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this.invokeSuspend ? Stage.FINISHED : Stage.SOURCE;
                }
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(String.valueOf(stage)));
                    } else if (this.hashCode.length()) {
                        return Stage.RESOURCE_CACHE;
                    } else {
                        stage = Stage.RESOURCE_CACHE;
                    }
                }
            } else if (this.hashCode.getMax()) {
                return Stage.DATA_CACHE;
            } else {
                stage = Stage.DATA_CACHE;
            }
        }
        return Stage.FINISHED;
    }

    public final void getMin() {
        this.values = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.FastBitmap$CoordinateSystem.setMin((DecodeJob<?>) this);
    }

    public final void setMin(setPivotY setpivoty, Object obj, isUseOnHide<?> isuseonhide, DataSource dataSource, setPivotY setpivoty2) {
        this.Mean$Arithmetic = setpivoty;
        this.onMessageChannelReady = obj;
        this.extraCallbackWithResult = isuseonhide;
        this.onRelationshipValidationResult = dataSource;
        this.extraCallback = setpivoty2;
        if (Thread.currentThread() != this.onPostMessage) {
            this.values = RunReason.DECODE_DATA;
            this.FastBitmap$CoordinateSystem.setMin((DecodeJob<?>) this);
            return;
        }
        isInside();
    }

    public final void setMin(setPivotY setpivoty, Exception exc, isUseOnHide<?> isuseonhide, DataSource dataSource) {
        isuseonhide.getMin();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(setpivoty, dataSource, isuseonhide.setMax());
        this.getCause.add(glideException);
        if (Thread.currentThread() != this.onPostMessage) {
            this.values = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.FastBitmap$CoordinateSystem.setMin((DecodeJob<?>) this);
            return;
        }
        toIntRange();
    }

    private void isInside() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.onNavigationEvent;
            StringBuilder sb = new StringBuilder("data: ");
            sb.append(this.onMessageChannelReady);
            sb.append(", cache key: ");
            sb.append(this.Mean$Arithmetic);
            sb.append(", fetcher: ");
            sb.append(this.extraCallbackWithResult);
            getDependencySortedChildren.length(j);
        }
        fireTrigger<R> firetrigger = null;
        try {
            firetrigger = setMax(this.extraCallbackWithResult, this.onMessageChannelReady, this.onRelationshipValidationResult);
        } catch (GlideException e) {
            e.setLoggingDetails(this.extraCallback, this.onRelationshipValidationResult);
            this.getCause.add(e);
        }
        if (firetrigger != null) {
            setMax(firetrigger, this.onRelationshipValidationResult);
        } else {
            toIntRange();
        }
    }

    private void setMax(fireTrigger<R> firetrigger, DataSource dataSource) {
        if (firetrigger instanceof getDebugMode) {
            ((getDebugMode) firetrigger).getMax();
        }
        removeTransitionListener<R> removetransitionlistener = null;
        removeTransitionListener<R> removetransitionlistener2 = firetrigger;
        if (this.length.getMax()) {
            removeTransitionListener<R> min = removeTransitionListener.getMin(firetrigger);
            removetransitionlistener = min;
            removetransitionlistener2 = min;
        }
        IsOverlapping();
        this.FastBitmap$CoordinateSystem.setMax(removetransitionlistener2, dataSource);
        this.create = Stage.ENCODE;
        try {
            if (this.length.getMax()) {
                this.length.setMax(this.setMax, this.toDoubleRange);
            }
            if (this.getMin.getMin()) {
                getMax();
            }
        } finally {
            if (removetransitionlistener != null) {
                removetransitionlistener.getMax();
            }
        }
    }

    private <Data> fireTrigger<R> setMax(isUseOnHide<?> isuseonhide, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            isuseonhide.getMin();
            return null;
        }
        try {
            long max = getDependencySortedChildren.setMax();
            requestLayout<R> requestlayout = this.setMin;
            fireTrigger<R> min = getMin(data, dataSource, requestlayout.setMax.length.setMax(data.getClass(), requestlayout.equals, requestlayout.values));
            if (Log.isLoggable("DecodeJob", 2)) {
                getDependencySortedChildren.length(max);
            }
            return min;
        } finally {
            isuseonhide.getMin();
        }
    }

    @NonNull
    public final isPointInChildBounds j_() {
        return this.b;
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMin;
        static final /* synthetic */ int[] setMax;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                getMin = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = getMin     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = getMin     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = getMin     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = getMin     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                setMin = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = setMin     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.AnonymousClass3.<clinit>():void");
        }
    }

    final class length<Z> implements parseLayoutDescription.getMin<Z> {
        private final DataSource setMax;

        length(DataSource dataSource) {
            this.setMax = dataSource;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: o.transitionToStart} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: o.onViewRemoved} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: o.onViewRemoved} */
        /* JADX WARNING: type inference failed for: r14v5, types: [o.setPivotY] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.NonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.fireTrigger<Z> length(@androidx.annotation.NonNull o.fireTrigger<Z> r14) {
            /*
                r13 = this;
                com.bumptech.glide.load.engine.DecodeJob r0 = com.bumptech.glide.load.engine.DecodeJob.this
                com.bumptech.glide.load.DataSource r1 = r13.setMax
                java.lang.Object r2 = r14.setMin()
                java.lang.Class r10 = r2.getClass()
                com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
                r3 = 0
                if (r1 == r2) goto L_0x0024
                o.requestLayout<R> r2 = r0.setMin
                o.updatePostLayout r2 = r2.getMin(r10)
                o.setFirstHorizontalStyle r4 = r0.getMax
                int r5 = r0.equals
                int r6 = r0.isInside
                o.fireTrigger r4 = r2.getMax(r4, r14, r5, r6)
                r9 = r2
                r2 = r4
                goto L_0x0026
            L_0x0024:
                r2 = r14
                r9 = r3
            L_0x0026:
                boolean r4 = r14.equals(r2)
                if (r4 != 0) goto L_0x002f
                r14.length()
            L_0x002f:
                o.requestLayout<R> r14 = r0.setMin
                boolean r14 = r14.getMin((o.fireTrigger<?>) r2)
                if (r14 == 0) goto L_0x005a
                o.requestLayout<R> r14 = r0.setMin
                o.setFirstHorizontalStyle r14 = r14.setMax
                com.bumptech.glide.Registry r14 = r14.length
                o.setWindowInsets r14 = r14.setMin
                java.lang.Class r3 = r2.getMin()
                o.setTranslationY r3 = r14.setMin(r3)
                if (r3 == 0) goto L_0x0050
                o.MotionHelper r14 = r0.toDoubleRange
                com.bumptech.glide.load.EncodeStrategy r14 = r3.getMax(r14)
                goto L_0x005c
            L_0x0050:
                com.bumptech.glide.Registry$NoResultEncoderAvailableException r14 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
                java.lang.Class r0 = r2.getMin()
                r14.<init>(r0)
                throw r14
            L_0x005a:
                com.bumptech.glide.load.EncodeStrategy r14 = com.bumptech.glide.load.EncodeStrategy.NONE
            L_0x005c:
                r12 = r3
                o.requestLayout<R> r3 = r0.setMin
                o.setPivotY r4 = r0.Mean$Arithmetic
                boolean r3 = r3.setMax(r4)
                r4 = 1
                r3 = r3 ^ r4
                o.evaluate r5 = r0.hashCode
                boolean r1 = r5.setMin(r3, r1, r14)
                if (r1 == 0) goto L_0x00c9
                if (r12 == 0) goto L_0x00bb
                int[] r1 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass3.setMax
                int r3 = r14.ordinal()
                r1 = r1[r3]
                if (r1 == r4) goto L_0x00a5
                r3 = 2
                if (r1 != r3) goto L_0x0095
                o.onViewRemoved r14 = new o.onViewRemoved
                o.requestLayout<R> r1 = r0.setMin
                o.setFirstHorizontalStyle r1 = r1.setMax
                o.setOnHide r4 = r1.setMax
                o.setPivotY r5 = r0.Mean$Arithmetic
                o.setPivotY r6 = r0.IsOverlapping
                int r7 = r0.equals
                int r8 = r0.isInside
                o.MotionHelper r11 = r0.toDoubleRange
                r3 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x00ae
            L_0x0095:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = java.lang.String.valueOf(r14)
                java.lang.String r1 = "Unknown strategy: "
                java.lang.String r14 = r1.concat(r14)
                r0.<init>(r14)
                throw r0
            L_0x00a5:
                o.transitionToStart r14 = new o.transitionToStart
                o.setPivotY r1 = r0.Mean$Arithmetic
                o.setPivotY r3 = r0.IsOverlapping
                r14.<init>(r1, r3)
            L_0x00ae:
                o.removeTransitionListener r2 = o.removeTransitionListener.getMin(r2)
                com.bumptech.glide.load.engine.DecodeJob$setMax<?> r0 = r0.length
                r0.setMax = r14
                r0.setMin = r12
                r0.length = r2
                goto L_0x00c9
            L_0x00bb:
                com.bumptech.glide.Registry$NoResultEncoderAvailableException r14 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
                java.lang.Object r0 = r2.setMin()
                java.lang.Class r0 = r0.getClass()
                r14.<init>(r0)
                throw r14
            L_0x00c9:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.length.length(o.fireTrigger):o.fireTrigger");
        }
    }

    public static class setMin {
        private boolean getMax;
        private boolean getMin;
        private boolean length;

        setMin() {
        }

        public final synchronized boolean length() {
            this.length = true;
            return setMin();
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean getMin() {
            this.getMin = true;
            return setMin();
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean setMax() {
            this.getMax = true;
            return setMin();
        }

        /* access modifiers changed from: package-private */
        public final synchronized void getMax() {
            this.getMin = false;
            this.length = false;
            this.getMax = false;
        }

        private boolean setMin() {
            return (this.getMax || this.getMin) && this.length;
        }
    }

    static class setMax<Z> {
        removeTransitionListener<Z> length;
        setPivotY setMax;
        setTranslationY<Z> setMin;

        setMax() {
        }

        /* access modifiers changed from: package-private */
        public final void setMax(getMin getmin, MotionHelper motionHelper) {
            try {
                getmin.getMin().setMin(this.setMax, new transitionToEnd(this.setMin, this.length, motionHelper));
            } finally {
                this.length.getMax();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax() {
            return this.length != null;
        }
    }

    private <Data, ResourceType> fireTrigger<R> getMin(Data data, DataSource dataSource, fireTransitionCompleted<Data, ResourceType, R> firetransitioncompleted) throws GlideException {
        MotionHelper motionHelper = this.toDoubleRange;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.setMin.length();
            setTranslationX<Boolean> settranslationx = setAllowsGoneWidget.length;
            Boolean bool = (Boolean) (motionHelper.length.containsKey(settranslationx) ? motionHelper.length.get(settranslationx) : settranslationx.getMax);
            if (bool == null || (bool.booleanValue() && !z)) {
                motionHelper = new MotionHelper();
                motionHelper.length.length(this.toDoubleRange.length);
                motionHelper.length.put(setAllowsGoneWidget.length, Boolean.valueOf(z));
            }
        }
        MotionHelper motionHelper2 = motionHelper;
        setProgress min = this.getMax.length.setMax.setMin(data);
        try {
            return firetransitioncompleted.length(min, motionHelper2, this.equals, this.isInside, new length(dataSource));
        } finally {
            min.getMax();
        }
    }
}
