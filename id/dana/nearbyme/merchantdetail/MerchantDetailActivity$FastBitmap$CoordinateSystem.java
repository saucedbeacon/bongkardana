package id.dana.nearbyme.merchantdetail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.startBeaconDiscovery;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
final /* synthetic */ class MerchantDetailActivity$FastBitmap$CoordinateSystem extends FunctionReferenceImpl implements Function1<String, Unit> {
    MerchantDetailActivity$FastBitmap$CoordinateSystem(MerchantDetailActivity merchantDetailActivity) {
        super(1, merchantDetailActivity, startBeaconDiscovery.class, "launchPhoneCall", "launchPhoneCall(Landroid/content/Context;Ljava/lang/String;)V", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "p1");
        startBeaconDiscovery.getMin((MerchantDetailActivity) this.receiver, str);
    }
}
