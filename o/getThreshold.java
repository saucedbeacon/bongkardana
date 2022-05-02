package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/loyalty/interactor/SaveReceiptData;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/loyalty/interactor/SaveReceiptData$Params;", "loyaltyRepository", "Lid/dana/domain/loyalty/LoyaltyRepository;", "(Lid/dana/domain/loyalty/LoyaltyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getThreshold extends APWebChromeClient<Boolean, setMin> {
    private final GriverRVMonitorImpl loyaltyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getThreshold(@NotNull GriverRVMonitorImpl griverRVMonitorImpl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverRVMonitorImpl, "loyaltyRepository");
        this.loyaltyRepository = griverRVMonitorImpl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.loyaltyRepository.saveReceiptData(setmin.getFileOcrReceiptLoyalty$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/loyalty/interactor/SaveReceiptData$Params;", "", "fileOcrReceiptLoyalty", "Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "(Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;)V", "getFileOcrReceiptLoyalty$domain_release", "()Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        public static final C0107setMin Companion = new C0107setMin((DefaultConstructorMarker) null);
        @NotNull
        private final code fileOcrReceiptLoyalty;

        @JvmStatic
        @NotNull
        public static final setMin create(@NotNull code code) {
            return Companion.create(code);
        }

        private setMin(code code) {
            this.fileOcrReceiptLoyalty = code;
        }

        public /* synthetic */ setMin(code code, DefaultConstructorMarker defaultConstructorMarker) {
            this(code);
        }

        @NotNull
        public final code getFileOcrReceiptLoyalty$domain_release() {
            return this.fileOcrReceiptLoyalty;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/loyalty/interactor/SaveReceiptData$Params$Companion;", "", "()V", "create", "Lid/dana/domain/loyalty/interactor/SaveReceiptData$Params;", "fileOcrReceiptLoyalty", "Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "domain_release"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.getThreshold$setMin$setMin  reason: collision with other inner class name */
        public static final class C0107setMin {
            private C0107setMin() {
            }

            public /* synthetic */ C0107setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final setMin create(@NotNull code code) {
                Intrinsics.checkNotNullParameter(code, "fileOcrReceiptLoyalty");
                return new setMin(code, (DefaultConstructorMarker) null);
            }
        }
    }
}
