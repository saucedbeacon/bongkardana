package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/saving/interactor/TopUpSaving;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/saving/interactor/TopUpSaving$Param;", "savingRepository", "Lid/dana/domain/saving/SavingRepository;", "(Lid/dana/domain/saving/SavingRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setLatitude extends APWebChromeClient<String, getMax> {
    private final getBluetoothName savingRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setLatitude(@NotNull getBluetoothName getbluetoothname) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbluetoothname, "savingRepository");
        this.savingRepository = getbluetoothname;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.savingRepository.topUpSaving(getmax.getSavingId(), getmax.getFundAmount());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/saving/interactor/TopUpSaving$Param;", "", "savingId", "", "fundAmount", "(Ljava/lang/String;Ljava/lang/String;)V", "getFundAmount", "()Ljava/lang/String;", "getSavingId", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String fundAmount;
        @NotNull
        private final String savingId;

        public getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "savingId");
            Intrinsics.checkNotNullParameter(str2, "fundAmount");
            this.savingId = str;
            this.fundAmount = str2;
        }

        @NotNull
        public final String getSavingId() {
            return this.savingId;
        }

        @NotNull
        public final String getFundAmount() {
            return this.fundAmount;
        }
    }
}
