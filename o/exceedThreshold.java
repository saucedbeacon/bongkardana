package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt$Params;", "loyaltyRepository", "Lid/dana/domain/loyalty/LoyaltyRepository;", "(Lid/dana/domain/loyalty/LoyaltyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class exceedThreshold extends APWebChromeClient<threshold, setMin> {
    private final GriverRVMonitorImpl loyaltyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public exceedThreshold(@NotNull GriverRVMonitorImpl griverRVMonitorImpl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverRVMonitorImpl, "loyaltyRepository");
        this.loyaltyRepository = griverRVMonitorImpl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<threshold> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.loyaltyRepository.submitReceipt(setmin.getBase64ReceiptLoyalty$domain_release(), setmin.getToken$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt$Params;", "", "base64ReceiptLoyalty", "Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;", "token", "", "(Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;Ljava/lang/String;)V", "getBase64ReceiptLoyalty$domain_release", "()Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;", "getToken$domain_release", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        @NotNull
        private final MonitorMap base64ReceiptLoyalty;
        @NotNull
        private final String token;

        @JvmStatic
        @NotNull
        public static final setMin create(@NotNull MonitorMap monitorMap, @NotNull String str) {
            return Companion.create(monitorMap, str);
        }

        private setMin(MonitorMap monitorMap, String str) {
            this.base64ReceiptLoyalty = monitorMap;
            this.token = str;
        }

        public /* synthetic */ setMin(MonitorMap monitorMap, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(monitorMap, str);
        }

        @NotNull
        public final MonitorMap getBase64ReceiptLoyalty$domain_release() {
            return this.base64ReceiptLoyalty;
        }

        @NotNull
        public final String getToken$domain_release() {
            return this.token;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt$Params$Companion;", "", "()V", "create", "Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt$Params;", "base64ReceiptLoyalty", "Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;", "token", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final setMin create(@NotNull MonitorMap monitorMap, @NotNull String str) {
                Intrinsics.checkNotNullParameter(monitorMap, "base64ReceiptLoyalty");
                Intrinsics.checkNotNullParameter(str, "token");
                return new setMin(monitorMap, str, (DefaultConstructorMarker) null);
            }
        }
    }
}
