package o;

import android.app.Activity;
import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.notification.NotificationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lid/dana/notification/PersistentNotificationDirector;", "Lid/dana/notification/NotificationDirector;", "context", "Landroid/content/Context;", "notificationData", "Lid/dana/notification/NotificationData;", "(Landroid/content/Context;Lid/dana/notification/NotificationData;)V", "setInAppNotification", "", "setOutAppNotification", "activity", "Landroid/app/Activity;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class processCommandApdu extends isNfcEnable {
    @NotNull
    public static final getMin getMin = new getMin((byte) 0);

    public final void setMax(@Nullable Activity activity) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public processCommandApdu(@NotNull Context context, @NotNull NotificationData notificationData) {
        super(context, notificationData);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
    }

    public final void setMax() {
        Context context = this.getMax;
        NotificationData notificationData = this.length;
        Intrinsics.checkNotNullExpressionValue(notificationData, "notificationData");
        ChoosePhoneContactBridgeExtension.getMax(context, notificationData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/notification/PersistentNotificationDirector$Companion;", "", "()V", "MESSAGE_KEY", "", "ON_GOING_KEY", "TITLE_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
