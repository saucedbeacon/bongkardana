package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/openbankaccount/interactor/GetBankAccountList;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/openbankaccount/model/BankAccountList;", "Ljava/lang/Void;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "openBankAccountRepository", "Lid/dana/domain/openbankaccount/OpenBankAccountRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/openbankaccount/OpenBankAccountRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class OfficeFileType extends parseFailed<OuterFileUtils, Void> {
    private final isShown openBankAccountRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OfficeFileType(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull isShown isshown) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(isshown, "openBankAccountRepository");
        this.openBankAccountRepository = isshown;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<OuterFileUtils> buildUseCaseObservable(@Nullable Void voidR) {
        return this.openBankAccountRepository.getInfoList();
    }
}
