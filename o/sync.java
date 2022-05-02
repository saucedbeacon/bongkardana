package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/domain/saving/interactor/SaveSavingBalanceVisibility;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "(Lid/dana/domain/account/AccountRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "isVisible", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class sync extends APWebChromeClient<Boolean, Boolean> {
    private final getCommonResources accountRepository;

    public final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 buildUseCase(Object obj) {
        return buildUseCase(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public sync(@NotNull getCommonResources getcommonresources) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        this.accountRepository = getcommonresources;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> balanceVisibility = this.accountRepository.setBalanceVisibility(Boolean.valueOf(z));
        Intrinsics.checkNotNullExpressionValue(balanceVisibility, "accountRepository.setBalanceVisibility(isVisible)");
        return balanceVisibility;
    }
}
