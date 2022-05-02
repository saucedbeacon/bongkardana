package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.toggle.traffictype.TrafficType;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lid/dana/data/toggle/traffictype/device/TrafficTypeDevice;", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "context", "Landroid/content/Context;", "config", "Lid/dana/lib/toggle/ToggleClientConfig$Builder;", "apikey", "", "mixpanelEntityRepository", "Lid/dana/data/tracker/MixpanelEntityRepository;", "(Landroid/content/Context;Lid/dana/lib/toggle/ToggleClientConfig$Builder;Ljava/lang/String;Lid/dana/data/tracker/MixpanelEntityRepository;)V", "create", "", "matchingKey", "trafficType", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isForce extends getRequestMainPackage {
    @NotNull
    public final String setMin() {
        return TrafficType.DEVICE;
    }

    public final synchronized void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "matchingKey");
        if (!getMax()) {
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, "Creating Traffic Type Device");
            length(str);
            isUesCacheLocation.getMax().getMax(TrafficType.DEVICE, this);
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, "Traffic Type Device created with matching key ".concat(String.valueOf(str)));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public isForce(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull o.sendLocation.setMin r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull o.getQueryScene r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "apikey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "mixpanelEntityRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "Device"
            r3.setMin = r0
            o.sendLocation r3 = r3.getMin()
            java.lang.String r0 = "config.setTrafficType(TrafficType.DEVICE).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isForce.<init>(android.content.Context, o.sendLocation$setMin, java.lang.String, o.getQueryScene):void");
    }
}
