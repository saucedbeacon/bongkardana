package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.base.extension.WorkManagerFailure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a*\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"SAVE_CONTACT_FULL_SYNC_KEY", "", "SAVE_CONTACT_PARTIAL_SYNC_KEY", "SAVE_CONTACT_PERIODIC_FULL_SYNC_KEY", "SAVE_CONTACT_PERIODIC_PARTIAL_SYNC_KEY", "scheduleSaveContactFullSyncWorker", "", "context", "Landroid/content/Context;", "scheduleSaveContactPartialSyncWorker", "startSaveContactFullSyncWorker", "policy", "Landroidx/work/ExistingWorkPolicy;", "duration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "startSaveContactPartialSyncWorker", "stopAllSaveContactSync", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class drawableToBitmap {
    public static final void length(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            setTextSize max = setTextSize.getMax(context);
            Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
            max.getMax("SAVE_CONTACT_PERIODIC_PARTIAL_SYNC_KEY");
            max.getMax("SAVE_CONTACT_PARTIAL_SYNC_KEY");
            max.getMax("SAVE_CONTACT_PERIODIC_FULL_SYNC_KEY");
            max.getMax("SAVE_CONTACT_FULL_SYNC_KEY");
        } catch (Exception e) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
            } catch (Exception unused) {
            }
        }
    }
}
