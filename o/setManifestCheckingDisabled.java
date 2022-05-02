package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/senddigitalmoney/model/CardPrefixQueryInfo;", "Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix$Params;", "sendDigitalMoneyRepository", "Lid/dana/domain/senddigitalmoney/SendDigitalMoneyRepository;", "(Lid/dana/domain/senddigitalmoney/SendDigitalMoneyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setManifestCheckingDisabled extends APWebChromeClient<isScannerInDifferentProcess, getMin> {
    private final getBeaconSimulator sendDigitalMoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setManifestCheckingDisabled(@NotNull getBeaconSimulator getbeaconsimulator) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbeaconsimulator, "sendDigitalMoneyRepository");
        this.sendDigitalMoneyRepository = getbeaconsimulator;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<isScannerInDifferentProcess> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.sendDigitalMoneyRepository.doQueryCardWithoutPrefix(getmin.getCardIndexNo());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix$Params;", "", "cardIndexNo", "", "(Ljava/lang/String;)V", "getCardIndexNo", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final C0067getMin Companion = new C0067getMin((DefaultConstructorMarker) null);
        @NotNull
        private final String cardIndexNo;

        @JvmStatic
        @NotNull
        public static final getMin create(@NotNull String str) {
            return Companion.create(str);
        }

        private getMin(String str) {
            this.cardIndexNo = str;
        }

        public /* synthetic */ getMin(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getCardIndexNo() {
            return this.cardIndexNo;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix$Params$Companion;", "", "()V", "create", "Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix$Params;", "cardIndexNo", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.setManifestCheckingDisabled$getMin$getMin  reason: collision with other inner class name */
        public static final class C0067getMin {
            private C0067getMin() {
            }

            public /* synthetic */ C0067getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMin create(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "cardIndexNo");
                return new getMin(str, (DefaultConstructorMarker) null);
            }
        }
    }
}
