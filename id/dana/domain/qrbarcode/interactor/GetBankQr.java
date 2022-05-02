package id.dana.domain.qrbarcode.interactor;

import dagger.Module;
import id.dana.domain.bank.model.UserBank;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APWebChromeClient;
import o.GriverAppXInterceptor;
import o.GriverPrepareInterceptor;
import o.TitleBarRightButtonView;
import o.getLastScanStartTimeMillis;
import o.hasCornerMarking;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\f\u0010\n\u001a\u00020\u000b*\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/qrbarcode/interactor/GetBankQr;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/qrbarcode/QrUserBankResult;", "Lid/dana/domain/bank/model/UserBank;", "repository", "Lid/dana/domain/qrbarcode/QrBarcodeRepository;", "(Lid/dana/domain/qrbarcode/QrBarcodeRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "toUserBankGenerateQr", "Lid/dana/domain/splitbill/model/UserBankGenerateQr;", "domain_release"}, k = 1, mv = {1, 4, 2})
@Module
public final class GetBankQr extends APWebChromeClient<GriverAppXInterceptor, UserBank> {
    private final GriverPrepareInterceptor repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GetBankQr(@NotNull GriverPrepareInterceptor griverPrepareInterceptor) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverPrepareInterceptor, "repository");
        this.repository = griverPrepareInterceptor;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverAppXInterceptor> buildUseCase(@NotNull UserBank userBank) {
        Intrinsics.checkNotNullParameter(userBank, "params");
        TitleBarRightButtonView.AnonymousClass1<GriverAppXInterceptor> userBankQr = this.repository.getUserBankQr(toUserBankGenerateQr(userBank));
        Intrinsics.checkNotNullExpressionValue(userBankQr, "repository.getUserBankQr…s.toUserBankGenerateQr())");
        return userBankQr;
    }

    private final getLastScanStartTimeMillis toUserBankGenerateQr(UserBank userBank) {
        return new getLastScanStartTimeMillis(userBank.getBankAccountIndexNo(), userBank.getBankAccountHolderName(), userBank.getBankAccountFormattedMaskedNo(), userBank.getWithdrawInstId(), userBank.getWithdrawPayMethod(), userBank.getWithdrawPayOption(), userBank.getWithdrawInstLocalName());
    }
}
