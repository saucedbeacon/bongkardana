package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/featureconfig/interactor/GetGlobalNetworkProxyConfig;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/core/usecase/NoParams;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setVerticalScrollbarOverlay extends APWebChromeClient<Boolean, onReceivedIcon> {
    private final setDefaultFontSize featureConfigRepository;

    /* JADX WARNING: Illegal instructions before constructor call */
    @javax.inject.Inject
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setVerticalScrollbarOverlay(@org.jetbrains.annotations.NotNull o.setDefaultFontSize r4) {
        /*
            r3 = this;
            java.lang.String r0 = "featureConfigRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            o.hasCornerMarking r0 = o.getSecureSignatureComp.setMin()
            java.lang.String r1 = "Schedulers.io()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2 = 1
            r3.<init>(r1, r0, r2, r1)
            r3.featureConfigRepository = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVerticalScrollbarOverlay.<init>(o.setDefaultFontSize):void");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGnProxyEnable = this.featureConfigRepository.isFeatureGnProxyEnable();
        Intrinsics.checkNotNullExpressionValue(isFeatureGnProxyEnable, "featureConfigRepository.isFeatureGnProxyEnable");
        return isFeatureGnProxyEnable;
    }
}
