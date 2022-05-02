package o;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/notification/decorator/NotificationIconDecorator;", "Lid/dana/notification/decorator/NotificationDecorator;", "notificationDecorator", "smallIcon", "", "largeIcon", "Landroid/graphics/Bitmap;", "(Lid/dana/notification/decorator/NotificationDecorator;ILandroid/graphics/Bitmap;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ContactAccount extends TelephonyInfoBridgeExtension {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAccount(@NotNull TelephonyInfoBridgeExtension telephonyInfoBridgeExtension, int i) {
        super(telephonyInfoBridgeExtension);
        Intrinsics.checkNotNullParameter(telephonyInfoBridgeExtension, "notificationDecorator");
        this.getMin.getMin(i);
        this.getMin.setMin((Bitmap) null);
    }
}
