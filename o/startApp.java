package o;

import com.alipay.android.phone.mobilesdk.socketcraft.api.DefaultWebSocketClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lid/dana/data/config/model/PromoAdsLocationConfigResponse;", "", "minimumRadiusInMeter", "", "(I)V", "getMinimumRadiusInMeter", "()I", "setMinimumRadiusInMeter", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class startApp {
    int minimumRadiusInMeter;

    public startApp() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public startApp(int i) {
        this.minimumRadiusInMeter = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ startApp(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DefaultWebSocketClient.MIN_CONNECTION_TIMEOUT : i);
    }

    public final int getMinimumRadiusInMeter() {
        return this.minimumRadiusInMeter;
    }

    public final void setMinimumRadiusInMeter(int i) {
        this.minimumRadiusInMeter = i;
    }
}
