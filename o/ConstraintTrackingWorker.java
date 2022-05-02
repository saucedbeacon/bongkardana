package o;

import android.app.Activity;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lid/dana/contract/sendmoney/QueryPrefixErrorHandler;", "", "()V", "onErrorQueryPrefix", "Lio/reactivex/Observable;", "", "context", "Landroid/app/Activity;", "showErrorToastFailedQueryPrefix", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ConstraintTrackingWorker {
    @NotNull
    public static final ConstraintTrackingWorker getMin = new ConstraintTrackingWorker();

    private ConstraintTrackingWorker() {
    }

    @JvmStatic
    @NotNull
    public static final TitleBarRightButtonView.AnonymousClass1<Long> getMax(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        setCancelText.length(activity, R.drawable.failed, R.drawable.bg_rounded_toast_failed, activity.getString(R.string.failed_query_prefix), 80, 60, true, (String) null, 256);
        TitleBarRightButtonView.AnonymousClass1<Long> subscribeOn = TitleBarRightButtonView.AnonymousClass1.timer(500, TimeUnit.MILLISECONDS).observeOn(hideProgress.length()).subscribeOn(hideProgress.length());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "Observable.timer(500, Ti…dSchedulers.mainThread())");
        return subscribeOn;
    }
}
