package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import o.getInternalPopup;
import o.getMinWidthMinor;
import o.getTextClassifier;
import o.onDragEvent;
import o.setAttachListener;
import o.setSupportBackgroundTintList;
import o.setSupportCompoundDrawablesTintList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ConstraintTrackingWorker extends ListenableWorker implements onDragEvent {
    private static final String IsOverlapping = setSupportBackgroundTintList.length("ConstraintTrkngWrkr");
    WorkerParameters getMax;
    final Object getMin = new Object();
    volatile boolean length = false;
    setAttachListener<ListenableWorker.setMax> setMax = setAttachListener.length();
    @Nullable
    ListenableWorker setMin;

    public final void getMin(@NonNull List<String> list) {
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.getMax = workerParameters;
    }

    @NonNull
    public ListenableFuture<ListenableWorker.setMax> startWork() {
        getBackgroundExecutor().execute(new Runnable() {
            public final void run() {
                String str;
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = constraintTrackingWorker.getInputData().setMin.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    setSupportBackgroundTintList.getMax();
                    constraintTrackingWorker.setMax.getMax(ListenableWorker.setMax.setMax());
                    return;
                }
                constraintTrackingWorker.setMin = constraintTrackingWorker.getWorkerFactory().length(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.getMax);
                if (constraintTrackingWorker.setMin == null) {
                    setSupportBackgroundTintList.getMax();
                    constraintTrackingWorker.setMax.getMax(ListenableWorker.setMax.setMax());
                    return;
                }
                getInternalPopup length = setSupportCompoundDrawablesTintList.length(constraintTrackingWorker.getApplicationContext()).setMax.getMax().length(constraintTrackingWorker.getId().toString());
                if (length == null) {
                    constraintTrackingWorker.setMax.getMax(ListenableWorker.setMax.setMax());
                    return;
                }
                getTextClassifier gettextclassifier = new getTextClassifier(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                gettextclassifier.getMax(Collections.singletonList(length));
                if (gettextclassifier.setMin(constraintTrackingWorker.getId().toString())) {
                    setSupportBackgroundTintList.getMax();
                    try {
                        ListenableFuture<ListenableWorker.setMax> startWork = constraintTrackingWorker.setMin.startWork();
                        startWork.addListener(new Runnable(startWork) {
                            final /* synthetic */ ListenableFuture getMin;

                            {
                                this.getMin = r2;
                            }

                            public final void run() {
                                synchronized (ConstraintTrackingWorker.this.getMin) {
                                    if (ConstraintTrackingWorker.this.length) {
                                        ConstraintTrackingWorker.this.setMax.getMax(ListenableWorker.setMax.setMin());
                                    } else {
                                        ConstraintTrackingWorker.this.setMax.getMax(this.getMin);
                                    }
                                }
                            }
                        }, constraintTrackingWorker.getBackgroundExecutor());
                    } catch (Throwable unused) {
                        setSupportBackgroundTintList.getMax();
                        synchronized (constraintTrackingWorker.getMin) {
                            if (constraintTrackingWorker.length) {
                                setSupportBackgroundTintList.getMax();
                                constraintTrackingWorker.setMax.getMax(ListenableWorker.setMax.setMin());
                            } else {
                                constraintTrackingWorker.setMax.getMax(ListenableWorker.setMax.setMax());
                            }
                        }
                    }
                } else {
                    setSupportBackgroundTintList.getMax();
                    constraintTrackingWorker.setMax.getMax(ListenableWorker.setMax.setMin());
                }
            }
        });
        return this.setMax;
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.setMin;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.setMin.stop();
        }
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.setMin;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @VisibleForTesting
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public getMinWidthMinor getTaskExecutor() {
        return setSupportCompoundDrawablesTintList.length(getApplicationContext()).length;
    }

    public final void getMax(@NonNull List<String> list) {
        setSupportBackgroundTintList.getMax();
        synchronized (this.getMin) {
            this.length = true;
        }
    }
}
