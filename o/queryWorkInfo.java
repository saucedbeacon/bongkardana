package o;

import android.app.Activity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.enqueueWorkRequests;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lid/dana/contract/sendmoney/RecipientListener;", "Lid/dana/contract/sendmoney/RecipientContract$View;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "dismissProgress", "", "onFinishCheckReferralSendMoney", "enable", "", "howToUrl", "", "onGetFeatureBelowKitkatConfigSuccess", "onSuccessRemoveRecentTransaction", "success", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class queryWorkInfo implements enqueueWorkRequests.setMax {
    @NotNull
    private final Activity length;

    public void dismissProgress() {
    }

    @JvmDefault
    public void onError(@Nullable String str) {
    }

    public void onFinishCheckReferralSendMoney(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "howToUrl");
    }

    public void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
    }

    public void onSuccessRemoveRecentTransaction(boolean z, @NotNull increaseCount increasecount) {
        Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
    }

    public void showProgress() {
    }

    public queryWorkInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        this.length = activity;
    }
}
