package o;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.base.extension.WorkManagerFailure;
import id.dana.social.utils.FullSyncContactWorker;
import id.dana.social.utils.PartialSyncContactWorker;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.setBackgroundDrawable;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t\u001a\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t\u001a*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\"\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"SOCIAL_FULL_SYNC_KEY", "", "SOCIAL_PARTIAL_SYNC_KEY", "SOCIAL_RECURRING_SYNC_KEY", "getFullSyncContactLiveData", "Landroidx/lifecycle/LiveData;", "", "Landroidx/work/WorkInfo;", "applicationContext", "Landroid/content/Context;", "scheduleSocialPartialContactSync", "", "context", "startSocialContactSync", "startSocialFullSyncContactWorker", "policy", "Landroidx/work/ExistingWorkPolicy;", "duration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "startSocialPartialSyncContactWorker", "stopAllSocialSync", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setButtonStyle {
    public static final void getMin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        getMax(context, ExistingWorkPolicy.KEEP, 0, TimeUnit.SECONDS);
        getMin(context, 0, TimeUnit.SECONDS);
    }

    public static final void getMin(@NotNull Context context, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        setBackgroundDrawable.getMin getmin = (setBackgroundDrawable.getMin) ((setBackgroundDrawable.getMin) new setBackgroundDrawable.getMin(PartialSyncContactWorker.class).length(BackoffPolicy.EXPONENTIAL, TimeUnit.MINUTES)).setMax(j, timeUnit);
        getmin.getMax.add("PARTIAL_SYNC_KEY");
        onTextChanged min = ((setBackgroundDrawable.getMin) getmin.getMax()).setMin();
        Intrinsics.checkNotNullExpressionValue(min, "OneTimeWorkRequest.Build…YNC_KEY)\n        .build()");
        setBackgroundDrawable setbackgrounddrawable = (setBackgroundDrawable) min;
        try {
            setTextSize max = setTextSize.getMax(context);
            Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
            max.setMin("PARTIAL_SYNC_KEY", ExistingWorkPolicy.KEEP, Collections.singletonList(setbackgrounddrawable));
        } catch (Exception e) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
            } catch (Exception unused) {
            }
        }
    }

    public static final void getMax(@NotNull Context context, @NotNull ExistingWorkPolicy existingWorkPolicy, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "policy");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        setBackgroundDrawable.getMin getmin = (setBackgroundDrawable.getMin) ((setBackgroundDrawable.getMin) new setBackgroundDrawable.getMin(FullSyncContactWorker.class).length(BackoffPolicy.EXPONENTIAL, TimeUnit.MINUTES)).setMax(j, timeUnit);
        getmin.getMax.add("FULL_SYNC_KEY");
        onTextChanged min = ((setBackgroundDrawable.getMin) getmin.getMax()).setMin();
        Intrinsics.checkNotNullExpressionValue(min, "OneTimeWorkRequest.Build…YNC_KEY)\n        .build()");
        setBackgroundDrawable setbackgrounddrawable = (setBackgroundDrawable) min;
        try {
            setTextSize max = setTextSize.getMax(context);
            Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
            max.setMin("FULL_SYNC_KEY", existingWorkPolicy, Collections.singletonList(setbackgrounddrawable));
        } catch (Exception e) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
            } catch (Exception unused) {
            }
        }
    }

    public static final void setMax(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            setTextSize max = setTextSize.getMax(context);
            Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
            max.getMax("PARTIAL_SYNC_KEY");
            max.getMax("FULL_SYNC_KEY");
            max.getMax("RECURRING_SYNC_KEY");
        } catch (Exception e) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
            } catch (Exception unused) {
            }
        }
    }

    @NotNull
    public static final LiveData<List<WorkInfo>> getMax(@NotNull Context context) {
        LiveData<List<WorkInfo>> liveData;
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        try {
            setTextSize max = setTextSize.getMax(context);
            Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
            liveData = max.getMin("FULL_SYNC_KEY");
        } catch (Exception e) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
            } catch (Exception unused) {
            }
            liveData = null;
        }
        return liveData == null ? new CascadingMenuPopup$HorizPosition<>(CollectionsKt.emptyList()) : liveData;
    }
}
