package o;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import o.TitleBarRightButtonView;

public final class appendMonitorLog<T extends Result> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<T> {
    /* access modifiers changed from: private */
    public boolean length = false;
    /* access modifiers changed from: private */
    public final PendingResult<T> setMin;

    public appendMonitorLog(PendingResult<T> pendingResult) {
        this.setMin = pendingResult;
    }

    public final void subscribe(final TitleBarRightButtonView.AnonymousClass2<T> r3) throws Exception {
        this.setMin.setResultCallback(new ResultCallback<T>() {
            public final void onResult(@NonNull T t) {
                if (!r3.isDisposed()) {
                    r3.onNext(t);
                    r3.onComplete();
                }
                boolean unused = appendMonitorLog.this.length = true;
            }
        });
        AnonymousClass3 r0 = new removeStateDidChangeHandler() {
            public final void getMax() {
                if (!appendMonitorLog.this.length) {
                    appendMonitorLog.this.setMin.cancel();
                }
            }
        };
        setRefreshAnimation.getMax(r0, "run is null");
        r3.setDisposable(new setdeltaProgressValue(r0));
    }
}
