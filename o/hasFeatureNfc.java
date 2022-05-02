package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.notification.DanaFirebaseMessagingService;
import id.dana.notification.NotificationActivity;
import id.dana.notification.NotificationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lid/dana/notification/GNAMLNotificationDirector;", "Lid/dana/notification/NotificationDirector;", "context", "Landroid/content/Context;", "notificationData", "Lid/dana/notification/NotificationData;", "(Landroid/content/Context;Lid/dana/notification/NotificationData;)V", "setInAppNotification", "", "setOutAppNotification", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class hasFeatureNfc extends isNfcEnable {
    public final void setMax(@Nullable Activity activity) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hasFeatureNfc(@NotNull Context context, @NotNull NotificationData notificationData) {
        super(context, notificationData);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
    }

    public final void setMax() {
        NotificationData notificationData = this.length;
        Intrinsics.checkNotNullExpressionValue(notificationData, "notificationData");
        notificationData.isInside = "https://m.dana.id/m/kyc/landingPage?entryPoint=profile";
        Intent intent = new Intent(this.getMax, NotificationActivity.class);
        intent.setFlags(603979776);
        intent.putExtra(DanaFirebaseMessagingService.MESSAGE_DATA, this.length);
        PendingIntent activity = PendingIntent.getActivity(this.getMax, 0, intent, 268435456);
        Context context = this.getMax;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        NotificationData notificationData2 = this.length;
        Intrinsics.checkNotNullExpressionValue(notificationData2, "notificationData");
        Intrinsics.checkNotNullExpressionValue(activity, "resultPendingIntent");
        ChoosePhoneContactBridgeExtension.setMax(context, notificationData2, activity, true);
    }
}
