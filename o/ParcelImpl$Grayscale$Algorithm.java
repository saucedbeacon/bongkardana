package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ParcelImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
final class ParcelImpl$Grayscale$Algorithm extends Lambda implements Function1<APWebViewClient, Unit> {
    final /* synthetic */ ParcelImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ParcelImpl$Grayscale$Algorithm(ParcelImpl parcelImpl) {
        super(1);
        this.this$0 = parcelImpl;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((APWebViewClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull APWebViewClient aPWebViewClient) {
        Intrinsics.checkNotNullParameter(aPWebViewClient, "it");
        this.this$0.onNavigationEvent.setMax(aPWebViewClient);
        if (aPWebViewClient.getExploreSkuWidget()) {
            this.this$0.getCause.execute(onReceivedIcon.INSTANCE, new ParcelImpl.invoke(this.this$0), ParcelImpl$Mean$Arithmetic.INSTANCE);
        }
    }
}
