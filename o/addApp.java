package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation$Params;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class addApp extends APWebChromeClient<String, setMin> {
    private final onWebViewDestory globalNetworkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public addApp(@NotNull onWebViewDestory onwebviewdestory) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
        this.globalNetworkRepository = onwebviewdestory;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        TitleBarRightButtonView.AnonymousClass1<String> countryCodeByLocation = this.globalNetworkRepository.getCountryCodeByLocation(setmin.getApiKey$domain_release());
        Intrinsics.checkNotNullExpressionValue(countryCodeByLocation, "globalNetworkRepository.…ByLocation(params.apiKey)");
        return countryCodeByLocation;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation$Params;", "", "apiKey", "", "(Ljava/lang/String;)V", "getApiKey$domain_release", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        @NotNull
        private final String apiKey;

        private setMin(String str) {
            this.apiKey = str;
        }

        public /* synthetic */ setMin(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getApiKey$domain_release() {
            return this.apiKey;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation$Params$Companion;", "", "()V", "forApiKeyAndTracker", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation$Params;", "apiKey", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final setMin forApiKeyAndTracker(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "apiKey");
                return new setMin(str, (DefaultConstructorMarker) null);
            }
        }
    }
}
