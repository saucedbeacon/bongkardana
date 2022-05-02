package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/loyalty/interactor/RemoveReceiptData;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/loyalty/interactor/RemoveReceiptData$Params;", "loyaltyRepository", "Lid/dana/domain/loyalty/LoyaltyRepository;", "(Lid/dana/domain/loyalty/LoyaltyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class MonitorManager extends APWebChromeClient<Boolean, setMax> {
    private final GriverRVMonitorImpl loyaltyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public MonitorManager(@NotNull GriverRVMonitorImpl griverRVMonitorImpl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverRVMonitorImpl, "loyaltyRepository");
        this.loyaltyRepository = griverRVMonitorImpl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.loyaltyRepository.removeReceiptData(setmax.getUserLoyaltyId());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/loyalty/interactor/RemoveReceiptData$Params;", "", "userLoyaltyId", "", "(Ljava/lang/String;)V", "getUserLoyaltyId", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        private final String userLoyaltyId;

        @JvmStatic
        @NotNull
        public static final setMax create(@NotNull String str) {
            return Companion.create(str);
        }

        private setMax(String str) {
            this.userLoyaltyId = str;
        }

        public /* synthetic */ setMax(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getUserLoyaltyId() {
            return this.userLoyaltyId;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/loyalty/interactor/RemoveReceiptData$Params$Companion;", "", "()V", "create", "Lid/dana/domain/loyalty/interactor/RemoveReceiptData$Params;", "userLoyaltyId", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final setMax create(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
                return new setMax(str, (DefaultConstructorMarker) null);
            }
        }
    }
}
