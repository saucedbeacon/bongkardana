package o;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class getSupportCompoundDrawablesTintList implements Runnable {
    static final String getMax = setSupportBackgroundTintList.length("WorkerWrapper");
    private onAttachedToWindow FastBitmap$CoordinateSystem;
    private setFirstBaselineToTopHeight Grayscale$Algorithm;
    private String IsOverlapping;
    private String Mean$Arithmetic;
    @NonNull
    setAttachListener<Boolean> equals = setAttachListener.length();
    ListenableWorker getMin;
    private hasOverlappingRendering hashCode;
    private compatMeasureContentWidth invoke;
    private List<String> invokeSuspend;
    volatile boolean isInside;
    Context length;
    getInternalPopup setMax;
    @NonNull
    ListenableWorker.setMax setMin = ListenableWorker.setMax.setMax();
    private getMinWidthMinor toDoubleRange;
    @Nullable
    ListenableFuture<ListenableWorker.setMax> toFloatRange = null;
    private List<getAutoSizeMaxTextSize> toIntRange;
    private WorkerParameters.getMax toString;
    private AppCompatRatingBar valueOf;
    private WorkDatabase values;

    getSupportCompoundDrawablesTintList(@NonNull length length2) {
        this.length = length2.length;
        this.toDoubleRange = length2.getMax;
        this.hashCode = length2.getMin;
        this.IsOverlapping = length2.toIntRange;
        this.toIntRange = length2.IsOverlapping;
        this.toString = length2.equals;
        this.getMin = length2.setMax;
        this.FastBitmap$CoordinateSystem = length2.setMin;
        WorkDatabase workDatabase = length2.toFloatRange;
        this.values = workDatabase;
        this.invoke = workDatabase.getMax();
        this.valueOf = this.values.length();
        this.Grayscale$Algorithm = this.values.setMin();
    }

    @WorkerThread
    public final void run() {
        boolean z;
        updateAppearance max;
        List<String> max2 = this.Grayscale$Algorithm.setMax(this.IsOverlapping);
        this.invokeSuspend = max2;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.IsOverlapping);
        sb.append(", tags={ ");
        Iterator<String> it = max2.iterator();
        boolean z2 = true;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        this.Mean$Arithmetic = sb.toString();
        if (!setMax()) {
            this.values.beginTransaction();
            try {
                getInternalPopup length2 = this.invoke.length(this.IsOverlapping);
                this.setMax = length2;
                if (length2 == null) {
                    setSupportBackgroundTintList.getMax();
                    setMax(false);
                    this.values.setTransactionSuccessful();
                } else if (length2.getMin != WorkInfo.State.ENQUEUED) {
                    getMax();
                    this.values.setTransactionSuccessful();
                    setSupportBackgroundTintList.getMax();
                    String str = this.setMax.setMax;
                    this.values.endTransaction();
                } else {
                    if (this.setMax.length() || this.setMax.setMax()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (this.setMax.toDoubleRange == 0) {
                            z = true;
                        }
                        if (!z && currentTimeMillis < this.setMax.getMin()) {
                            setSupportBackgroundTintList.getMax();
                            String str2 = this.setMax.setMax;
                            setMax(true);
                            this.values.setTransactionSuccessful();
                            this.values.endTransaction();
                            return;
                        }
                    }
                    this.values.setTransactionSuccessful();
                    this.values.endTransaction();
                    if (this.setMax.length()) {
                        max = this.setMax.setMin;
                    } else {
                        getSupportBackgroundTintList max3 = getSupportBackgroundTintList.getMax(this.setMax.length);
                        if (max3 == null) {
                            setSupportBackgroundTintList.getMax();
                            String str3 = this.setMax.length;
                            getMin();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.setMax.setMin);
                        arrayList.addAll(this.invoke.toIntRange(this.IsOverlapping));
                        max = max3.getMax((List<updateAppearance>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.IsOverlapping), max, this.invokeSuspend, this.toString, this.setMax.values, this.FastBitmap$CoordinateSystem.getMax, this.toDoubleRange, this.FastBitmap$CoordinateSystem.length, new ContentFrameLayout(this.values, this.toDoubleRange), new AppCompatToggleButton(this.values, this.hashCode, this.toDoubleRange));
                    if (this.getMin == null) {
                        this.getMin = this.FastBitmap$CoordinateSystem.length.length(this.length, this.setMax.setMax, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.getMin;
                    if (listenableWorker == null) {
                        setSupportBackgroundTintList.getMax();
                        String str4 = this.setMax.setMax;
                        getMin();
                    } else if (listenableWorker.isUsed()) {
                        setSupportBackgroundTintList.getMax();
                        String str5 = this.setMax.setMax;
                        getMin();
                    } else {
                        this.getMin.setUsed();
                        if (!setMin()) {
                            getMax();
                        } else if (!setMax()) {
                            final setAttachListener length3 = setAttachListener.length();
                            this.toDoubleRange.getMax().execute(new Runnable() {
                                public final void run() {
                                    try {
                                        setSupportBackgroundTintList.getMax();
                                        String str = getSupportCompoundDrawablesTintList.getMax;
                                        String str2 = getSupportCompoundDrawablesTintList.this.setMax.setMax;
                                        getSupportCompoundDrawablesTintList.this.toFloatRange = getSupportCompoundDrawablesTintList.this.getMin.startWork();
                                        length3.getMax(getSupportCompoundDrawablesTintList.this.toFloatRange);
                                    } catch (Throwable th) {
                                        length3.getMin(th);
                                    }
                                }
                            });
                            final String str6 = this.Mean$Arithmetic;
                            length3.addListener(new Runnable() {
                                @SuppressLint({"SyntheticAccessor"})
                                public final void run() {
                                    try {
                                        ListenableWorker.setMax setmax = (ListenableWorker.setMax) length3.get();
                                        if (setmax == null) {
                                            setSupportBackgroundTintList.getMax();
                                            String str = getSupportCompoundDrawablesTintList.getMax;
                                            String str2 = getSupportCompoundDrawablesTintList.this.setMax.setMax;
                                        } else {
                                            setSupportBackgroundTintList.getMax();
                                            String str3 = getSupportCompoundDrawablesTintList.getMax;
                                            String str4 = getSupportCompoundDrawablesTintList.this.setMax.setMax;
                                            getSupportCompoundDrawablesTintList.this.setMin = setmax;
                                        }
                                    } catch (CancellationException e) {
                                        setSupportBackgroundTintList.getMax();
                                        String str5 = getSupportCompoundDrawablesTintList.getMax;
                                        new Throwable[1][0] = e;
                                    } catch (InterruptedException | ExecutionException e2) {
                                        setSupportBackgroundTintList.getMax();
                                        String str6 = getSupportCompoundDrawablesTintList.getMax;
                                        new Throwable[1][0] = e2;
                                    } catch (Throwable th) {
                                        getSupportCompoundDrawablesTintList.this.length();
                                        throw th;
                                    }
                                    getSupportCompoundDrawablesTintList.this.length();
                                }
                            }, this.toDoubleRange.getMin());
                        }
                    }
                }
            } finally {
                this.values.endTransaction();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void length() {
        if (!setMax()) {
            this.values.beginTransaction();
            try {
                WorkInfo.State floatRange = this.invoke.toFloatRange(this.IsOverlapping);
                this.values.equals().getMax(this.IsOverlapping);
                if (floatRange == null) {
                    setMax(false);
                } else if (floatRange == WorkInfo.State.RUNNING) {
                    ListenableWorker.setMax setmax = this.setMin;
                    if (setmax instanceof ListenableWorker.setMax.C0000setMax) {
                        setSupportBackgroundTintList.getMax();
                        if (this.setMax.length()) {
                            IsOverlapping();
                        } else {
                            this.values.beginTransaction();
                            this.invoke.setMin(WorkInfo.State.SUCCEEDED, this.IsOverlapping);
                            this.invoke.getMin(this.IsOverlapping, ((ListenableWorker.setMax.C0000setMax) this.setMin).length);
                            long currentTimeMillis = System.currentTimeMillis();
                            for (String next : this.valueOf.setMin(this.IsOverlapping)) {
                                if (this.invoke.toFloatRange(next) == WorkInfo.State.BLOCKED && this.valueOf.length(next)) {
                                    setSupportBackgroundTintList.getMax();
                                    this.invoke.setMin(WorkInfo.State.ENQUEUED, next);
                                    this.invoke.length(next, currentTimeMillis);
                                }
                            }
                            this.values.setTransactionSuccessful();
                            this.values.endTransaction();
                            setMax(false);
                        }
                    } else if (setmax instanceof ListenableWorker.setMax.setMin) {
                        setSupportBackgroundTintList.getMax();
                        toIntRange();
                    } else {
                        setSupportBackgroundTintList.getMax();
                        if (this.setMax.length()) {
                            IsOverlapping();
                        } else {
                            getMin();
                        }
                    }
                } else if (!floatRange.isFinished()) {
                    toIntRange();
                }
                this.values.setTransactionSuccessful();
                this.values.endTransaction();
            } catch (Throwable th) {
                this.values.endTransaction();
                throw th;
            }
        }
        List<getAutoSizeMaxTextSize> list = this.toIntRange;
        if (list != null) {
            for (getAutoSizeMaxTextSize max : list) {
                max.setMax(this.IsOverlapping);
            }
            getAutoSizeMinTextSize.setMax(this.FastBitmap$CoordinateSystem, this.values, this.toIntRange);
        }
    }

    private void getMax() {
        if (this.invoke.toFloatRange(this.IsOverlapping) == WorkInfo.State.RUNNING) {
            setSupportBackgroundTintList.getMax();
            setMax(true);
            return;
        }
        setSupportBackgroundTintList.getMax();
        setMax(false);
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax() {
        boolean z = false;
        if (!this.isInside) {
            return false;
        }
        setSupportBackgroundTintList.getMax();
        WorkInfo.State floatRange = this.invoke.toFloatRange(this.IsOverlapping);
        if (floatRange != null && !floatRange.isFinished()) {
            z = true;
        }
        setMax(z);
        return true;
    }

    /* JADX INFO: finally extract failed */
    private void setMax(boolean z) {
        this.values.beginTransaction();
        try {
            if (this.values.getMax().length().isEmpty()) {
                setTextMetricsParamsCompat.setMax(this.length, RescheduleReceiver.class, false);
            }
            if (z) {
                this.invoke.setMin(WorkInfo.State.ENQUEUED, this.IsOverlapping);
                this.invoke.getMin(this.IsOverlapping, -1);
            }
            if (!(this.setMax == null || this.getMin == null || !this.getMin.isRunInForeground())) {
                this.hashCode.length(this.IsOverlapping);
            }
            this.values.setTransactionSuccessful();
            this.values.endTransaction();
            this.equals.getMax(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.values.endTransaction();
            throw th;
        }
    }

    private boolean setMin() {
        this.values.beginTransaction();
        try {
            boolean z = true;
            if (this.invoke.toFloatRange(this.IsOverlapping) == WorkInfo.State.ENQUEUED) {
                this.invoke.setMin(WorkInfo.State.RUNNING, this.IsOverlapping);
                this.invoke.setMin(this.IsOverlapping);
            } else {
                z = false;
            }
            this.values.setTransactionSuccessful();
            return z;
        } finally {
            this.values.endTransaction();
        }
    }

    @VisibleForTesting
    private void getMin() {
        this.values.beginTransaction();
        try {
            setMin(this.IsOverlapping);
            this.invoke.getMin(this.IsOverlapping, ((ListenableWorker.setMax.getMin) this.setMin).getMin);
            this.values.setTransactionSuccessful();
        } finally {
            this.values.endTransaction();
            setMax(false);
        }
    }

    private void setMin(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.invoke.toFloatRange(str2) != WorkInfo.State.CANCELLED) {
                this.invoke.setMin(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.valueOf.setMin(str2));
        }
    }

    private void toIntRange() {
        this.values.beginTransaction();
        try {
            this.invoke.setMin(WorkInfo.State.ENQUEUED, this.IsOverlapping);
            this.invoke.length(this.IsOverlapping, System.currentTimeMillis());
            this.invoke.getMin(this.IsOverlapping, -1);
            this.values.setTransactionSuccessful();
        } finally {
            this.values.endTransaction();
            setMax(true);
        }
    }

    private void IsOverlapping() {
        this.values.beginTransaction();
        try {
            this.invoke.length(this.IsOverlapping, System.currentTimeMillis());
            this.invoke.setMin(WorkInfo.State.ENQUEUED, this.IsOverlapping);
            this.invoke.setMax(this.IsOverlapping);
            this.invoke.getMin(this.IsOverlapping, -1);
            this.values.setTransactionSuccessful();
        } finally {
            this.values.endTransaction();
            setMax(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class length {
        List<getAutoSizeMaxTextSize> IsOverlapping;
        @NonNull
        WorkerParameters.getMax equals = new WorkerParameters.getMax();
        @NonNull
        getMinWidthMinor getMax;
        @NonNull
        hasOverlappingRendering getMin;
        @NonNull
        Context length;
        @Nullable
        ListenableWorker setMax;
        @NonNull
        onAttachedToWindow setMin;
        @NonNull
        WorkDatabase toFloatRange;
        @NonNull
        String toIntRange;

        public length(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow, @NonNull getMinWidthMinor getminwidthminor, @NonNull hasOverlappingRendering hasoverlappingrendering, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.length = context.getApplicationContext();
            this.getMax = getminwidthminor;
            this.getMin = hasoverlappingrendering;
            this.setMin = onattachedtowindow;
            this.toFloatRange = workDatabase;
            this.toIntRange = str;
        }
    }
}
