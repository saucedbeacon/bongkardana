package o;

import id.dana.domain.bank.model.UserBank;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u0003H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/bank/repository/UserBankRepository;", "", "addUserBank", "Lio/reactivex/Observable;", "", "userBank", "Lid/dana/domain/bank/model/UserBank;", "deleteUserBank", "getUserBanks", "", "hasUserBank", "saveUserBanks", "userBanks", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface PageFinishedPoint {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> addUserBank(@NotNull UserBank userBank);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> deleteUserBank(@NotNull UserBank userBank);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<UserBank>> getUserBanks();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> hasUserBank(@NotNull UserBank userBank);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserBanks(@NotNull List<UserBank> list);
}
