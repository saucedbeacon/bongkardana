package o;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/playstorereview/AppReviewManager;", "", "activity", "Landroid/app/Activity;", "listener", "Lid/dana/playstorereview/AppReviewManager$AppReviewListener;", "(Landroid/app/Activity;Lid/dana/playstorereview/AppReviewManager$AppReviewListener;)V", "manager", "Lcom/google/android/play/core/review/ReviewManager;", "(Landroid/app/Activity;Lid/dana/playstorereview/AppReviewManager$AppReviewListener;Lcom/google/android/play/core/review/ReviewManager;)V", "onRequestAppReviewSuccess", "", "reviewInfo", "Lcom/google/android/play/core/review/ReviewInfo;", "requestReviewFlow", "showInApp", "AppReviewListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class openDocument {
    final Activity getMax;
    public final ReviewManager getMin;
    final setMin setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/playstorereview/AppReviewManager$AppReviewListener;", "", "onError", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
    }

    private openDocument(@NotNull Activity activity, @NotNull setMin setmin, @NotNull ReviewManager reviewManager) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(setmin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Intrinsics.checkNotNullParameter(reviewManager, "manager");
        this.getMax = activity;
        this.setMax = setmin;
        this.getMin = reviewManager;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public openDocument(@org.jetbrains.annotations.NotNull android.app.Activity r3, @org.jetbrains.annotations.NotNull o.openDocument.setMin r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.play.core.review.ReviewManager r0 = com.google.android.play.core.review.ReviewManagerFactory.create(r0)
            java.lang.String r1 = "ReviewManagerFactory.create(activity)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.openDocument.<init>(android.app.Activity, o.openDocument$setMin):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/play/core/tasks/Task;", "Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<ResultT> implements OnCompleteListener<ReviewInfo> {
        final /* synthetic */ openDocument setMax;

        public getMin(openDocument opendocument) {
            this.setMax = opendocument;
        }

        public final void onComplete(@NotNull Task<ReviewInfo> task) {
            Intrinsics.checkNotNullParameter(task, "it");
            if (task.isSuccessful()) {
                openDocument opendocument = this.setMax;
                ReviewInfo result = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result, "it.result");
                opendocument.getMin.launchReviewFlow(opendocument.getMax, result).addOnCompleteListener(new length(opendocument));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/play/core/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 2})
    static final class length<ResultT> implements OnCompleteListener<Void> {
        final /* synthetic */ openDocument getMin;

        length(openDocument opendocument) {
            this.getMin = opendocument;
        }

        public final void onComplete(@NotNull Task<Void> task) {
            Intrinsics.checkNotNullParameter(task, "it");
            if (task.isSuccessful()) {
            }
        }
    }
}
