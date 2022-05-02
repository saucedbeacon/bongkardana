package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveExternalOnboardingDialog;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/sendmoney/interactor/SaveExternalOnboardingDialog$Param;", "sendMoneyRepository", "Lid/dana/domain/sendmoney/repository/SendMoneyRepository;", "(Lid/dana/domain/sendmoney/repository/SendMoneyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getNonBeaconLeScanCallback extends APWebChromeClient<Boolean, getMin> {
    private final fromInt sendMoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getNonBeaconLeScanCallback(@NotNull fromInt fromint) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fromint, "sendMoneyRepository");
        this.sendMoneyRepository = fromint;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveIsNeedToShowExternalOnboardingDialog = this.sendMoneyRepository.saveIsNeedToShowExternalOnboardingDialog(Boolean.valueOf(getmin.isShow()));
        Intrinsics.checkNotNullExpressionValue(saveIsNeedToShowExternalOnboardingDialog, "sendMoneyRepository.save…dingDialog(params.isShow)");
        return saveIsNeedToShowExternalOnboardingDialog;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveExternalOnboardingDialog$Param;", "", "isShow", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private final boolean isShow;

        public static /* synthetic */ getMin copy$default(getMin getmin, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = getmin.isShow;
            }
            return getmin.copy(z);
        }

        public final boolean component1() {
            return this.isShow;
        }

        @NotNull
        public final getMin copy(boolean z) {
            return new getMin(z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMin) && this.isShow == ((getMin) obj).isShow;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.isShow;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(isShow=");
            sb.append(this.isShow);
            sb.append(")");
            return sb.toString();
        }

        public getMin(boolean z) {
            this.isShow = z;
        }

        public final boolean isShow() {
            return this.isShow;
        }
    }
}
