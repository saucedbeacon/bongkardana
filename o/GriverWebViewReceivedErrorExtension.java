package o;

import id.dana.domain.bank.model.UserBank;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/bank/interactor/SaveUserBanks;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "", "Lid/dana/domain/bank/model/UserBank;", "userBankRepository", "Lid/dana/domain/bank/repository/UserBankRepository;", "(Lid/dana/domain/bank/repository/UserBankRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverWebViewReceivedErrorExtension extends APWebChromeClient<Boolean, List<? extends UserBank>> {
    private final PageFinishedPoint userBankRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverWebViewReceivedErrorExtension(@NotNull PageFinishedPoint pageFinishedPoint) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(pageFinishedPoint, "userBankRepository");
        this.userBankRepository = pageFinishedPoint;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull List<UserBank> list) {
        Intrinsics.checkNotNullParameter(list, "params");
        return this.userBankRepository.saveUserBanks(list);
    }
}
