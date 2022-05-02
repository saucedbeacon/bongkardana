package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.SharedDataBridgeExtension;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
final class SharedDataBridgeExtension$Grayscale$Algorithm extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ String $currentCountryCode;
    final /* synthetic */ boolean $supportedCountry;
    final /* synthetic */ SharedDataBridgeExtension this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedDataBridgeExtension$Grayscale$Algorithm(SharedDataBridgeExtension sharedDataBridgeExtension, boolean z, String str) {
        super(1);
        this.this$0 = sharedDataBridgeExtension;
        this.$supportedCountry = z;
        this.$currentCountryCode = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (this.$supportedCountry) {
            SharedDataBridgeExtension sharedDataBridgeExtension = this.this$0;
            String str = this.$currentCountryCode;
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            sharedDataBridgeExtension.length.execute(str, new SharedDataBridgeExtension.toFloatRange(sharedDataBridgeExtension, str), new SharedDataBridgeExtension.values(sharedDataBridgeExtension));
            this.this$0.getMin(this.$currentCountryCode, true);
        }
    }
}
