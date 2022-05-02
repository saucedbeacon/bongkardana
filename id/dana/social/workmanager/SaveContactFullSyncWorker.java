package id.dana.social.workmanager;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.base.extension.WorkManagerFailure;
import id.dana.social.base.BaseSocialSyncWorker;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.findCalculatorForModelWithLock;
import o.forThisDevice;
import o.onLeScan;
import o.onTextChanged;
import o.setBackgroundDrawable;
import o.setTextSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lid/dana/social/workmanager/SaveContactFullSyncWorker;", "Lid/dana/social/base/BaseSocialSyncWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "syncRunner", "Lid/dana/domain/social/SyncRunner;", "getSyncRunner", "()Lid/dana/domain/social/SyncRunner;", "setSyncRunner", "(Lid/dana/domain/social/SyncRunner;)V", "doSync", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueAnotherWork", "", "injectDependency", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SaveContactFullSyncWorker extends BaseSocialSyncWorker {
    @Inject
    @Named("recurringfullsync")
    public findCalculatorForModelWithLock syncRunner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveContactFullSyncWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    public final void setMin(@NotNull PrepareException.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "applicationComponent");
        r2.setMin(this);
    }

    @Nullable
    public final Object length(@NotNull Continuation<? super forThisDevice<onLeScan>> continuation) {
        findCalculatorForModelWithLock findcalculatorformodelwithlock = this.syncRunner;
        if (findcalculatorformodelwithlock == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncRunner");
        }
        return findcalculatorformodelwithlock.sync(getRunAttemptCount(), continuation);
    }

    public final void length() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(applicationContext, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "policy");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        onTextChanged min = ((setBackgroundDrawable.getMin) ((setBackgroundDrawable.getMin) new setBackgroundDrawable.getMin(SaveContactFullSyncWorker.class).length(BackoffPolicy.EXPONENTIAL, TimeUnit.MINUTES)).setMax(30, timeUnit)).setMin();
        Intrinsics.checkNotNullExpressionValue(min, "OneTimeWorkRequest.Build…imeUnit)\n        .build()");
        setBackgroundDrawable setbackgrounddrawable = (setBackgroundDrawable) min;
        try {
            setTextSize max = setTextSize.getMax(applicationContext);
            Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
            max.setMin("SAVE_CONTACT_FULL_SYNC_KEY", existingWorkPolicy, Collections.singletonList(setbackgrounddrawable));
        } catch (Exception e) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
            } catch (Exception unused) {
            }
        }
    }
}
