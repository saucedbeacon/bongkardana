package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderConfig;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/core/usecase/NoParams;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class AppPreDownloadConfig extends APWebChromeClient<Boolean, onReceivedIcon> {
    private final setDefaultFontSize featureConfigRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams$Params;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ConfigUnitsBean extends APWebChromeClient<Boolean, length> {
        private final onWebViewDestory globalNetworkRepository;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public ConfigUnitsBean(@NotNull onWebViewDestory onwebviewdestory) {
            super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
            this.globalNetworkRepository = onwebviewdestory;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull length length2) {
            Intrinsics.checkNotNullParameter(length2, "params");
            TitleBarRightButtonView.AnonymousClass1<Boolean> sendRiskEvent = this.globalNetworkRepository.sendRiskEvent(length2.getOriginCountry(), length2.getCurrentCountry());
            Intrinsics.checkNotNullExpressionValue(sendRiskEvent, "globalNetworkRepository.…   params.currentCountry)");
            return sendRiskEvent;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams$Params;", "", "originCountry", "", "currentCountry", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrentCountry", "()Ljava/lang/String;", "getOriginCountry", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            @NotNull
            public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
            @NotNull
            private final String currentCountry;
            @NotNull
            private final String originCountry;

            private length(String str, String str2) {
                this.originCountry = str;
                this.currentCountry = str2;
            }

            public /* synthetic */ length(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2);
            }

            @NotNull
            public final String getCurrentCountry() {
                return this.currentCountry;
            }

            @NotNull
            public final String getOriginCountry() {
                return this.originCountry;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams$Params$Companion;", "", "()V", "forSendRiskEventWithParams", "Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams$Params;", "originCountry", "", "currentCountry", "domain_release"}, k = 1, mv = {1, 4, 2})
            public static final class getMax {
                private getMax() {
                }

                public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final length forSendRiskEventWithParams(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "originCountry");
                    Intrinsics.checkNotNullParameter(str2, "currentCountry");
                    return new length(str, str2, (DefaultConstructorMarker) null);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AppPreDownloadConfig(@NotNull setDefaultFontSize setdefaultfontsize) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        this.featureConfigRepository = setdefaultfontsize;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureQrisCrossBorderEnable = this.featureConfigRepository.isFeatureQrisCrossBorderEnable();
        Intrinsics.checkNotNullExpressionValue(isFeatureQrisCrossBorderEnable, "featureConfigRepository.…tureQrisCrossBorderEnable");
        return isFeatureQrisCrossBorderEnable;
    }
}
