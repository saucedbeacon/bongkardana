package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/sendmoney/x2l/interactor/GetSendToLinkBannerConfig;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/sendmoney/x2l/model/BannerConfig;", "Lid/dana/domain/core/usecase/NoParams;", "sendMoneyConfigRepository", "Lid/dana/domain/sendmoney/x2l/repository/SendMoneyConfigRepository;", "(Lid/dana/domain/sendmoney/x2l/repository/SendMoneyConfigRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class Identifier extends APWebChromeClient<fromUuid, onReceivedIcon> {
    private final getByteCount sendMoneyConfigRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public Identifier(@NotNull getByteCount getbytecount) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbytecount, "sendMoneyConfigRepository");
        this.sendMoneyConfigRepository = getbytecount;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<fromUuid> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        return this.sendMoneyConfigRepository.getSendToLinkBannerConfig();
    }
}
