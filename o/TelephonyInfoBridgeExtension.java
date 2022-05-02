package o;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0002\u0010\u000bB\u000f\b\u0002\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u000f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lid/dana/notification/decorator/NotificationDecorator;", "", "context", "Landroid/content/Context;", "channelId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "onGoing", "", "(Landroid/content/Context;Ljava/lang/String;Z)V", "notificationDecorator", "(Lid/dana/notification/decorator/NotificationDecorator;)V", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "(Landroidx/core/app/NotificationCompat$Builder;)V", "decoratedBuilder", "getDecoratedBuilder", "()Landroidx/core/app/NotificationCompat$Builder;", "build", "Landroid/app/Notification;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class TelephonyInfoBridgeExtension {
    @NotNull
    public final NotificationCompat.setMax getMin;

    private TelephonyInfoBridgeExtension(NotificationCompat.setMax setmax) {
        this.getMin = setmax;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TelephonyInfoBridgeExtension(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "channelId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.core.app.NotificationCompat$setMax r0 = new androidx.core.app.NotificationCompat$setMax
            r0.<init>(r2, r3)
            r2 = 0
            androidx.core.app.NotificationCompat$setMax r2 = r0.getMax((boolean) r2)
            androidx.core.app.NotificationCompat$setMax r2 = r2.length((boolean) r4)
            java.lang.String r3 = "NotificationCompat.Build…     .setOngoing(onGoing)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>((androidx.core.app.NotificationCompat.setMax) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TelephonyInfoBridgeExtension.<init>(android.content.Context, java.lang.String, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TelephonyInfoBridgeExtension(@NotNull TelephonyInfoBridgeExtension telephonyInfoBridgeExtension) {
        this(telephonyInfoBridgeExtension.getMin);
        Intrinsics.checkNotNullParameter(telephonyInfoBridgeExtension, "notificationDecorator");
    }
}
