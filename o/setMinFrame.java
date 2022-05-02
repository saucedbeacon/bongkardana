package o;

import id.dana.domain.bank.model.UserBank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0001\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\b"}, d2 = {"toUserBank", "Lid/dana/domain/bank/model/UserBank;", "Lid/dana/data/bank/model/UserConfigBankQrContent;", "toUserBanks", "", "", "([Lid/dana/data/bank/model/UserConfigBankQrContent;)Ljava/util/List;", "toUserConfigBankQrContent", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setMinFrame {
    @NotNull
    public static final List<resumeAnimation> setMin(@NotNull List<UserBank> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toUserConfigBankQrContent");
        Iterable<UserBank> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (UserBank userBank : iterable) {
            Intrinsics.checkNotNullParameter(userBank, "$this$toUserConfigBankQrContent");
            arrayList.add(new resumeAnimation(userBank.getBankAccountIndexNo(), userBank.getBankAccountHolderName(), userBank.getBankAccountFormattedMaskedNo(), userBank.getWithdrawInstId(), userBank.getWithdrawPayMethod(), userBank.getWithdrawPayOption(), userBank.getWithdrawInstLocalName()));
        }
        return (List) arrayList;
    }
}
