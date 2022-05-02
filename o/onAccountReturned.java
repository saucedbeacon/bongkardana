package o;

import android.app.PendingIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/notification/decorator/NotificationContentDecorator;", "Lid/dana/notification/decorator/NotificationDecorator;", "notificationDecorator", "title", "", "message", "pendingIntent", "Landroid/app/PendingIntent;", "(Lid/dana/notification/decorator/NotificationDecorator;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onAccountReturned extends TelephonyInfoBridgeExtension {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onAccountReturned(@NotNull TelephonyInfoBridgeExtension telephonyInfoBridgeExtension, @NotNull String str, @NotNull String str2) {
        super(telephonyInfoBridgeExtension);
        Intrinsics.checkNotNullParameter(telephonyInfoBridgeExtension, "notificationDecorator");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "message");
        CharSequence charSequence = str;
        this.getMin.length(charSequence).setMin(charSequence).getMin((CharSequence) str2).setMin((PendingIntent) null);
    }
}
