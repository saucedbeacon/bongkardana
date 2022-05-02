package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/domain/sendmoney/model/WithdrawInitBase;", "", "withdrawMethodViews", "", "Lid/dana/domain/sendmoney/model/WithdrawInitMethodOption;", "(Ljava/util/List;)V", "getWithdrawMethodViews", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class byteArrayToFormattedString {
    @NotNull
    private final List<fromLong> withdrawMethodViews;

    public byteArrayToFormattedString(@NotNull List<fromLong> list) {
        Intrinsics.checkNotNullParameter(list, "withdrawMethodViews");
        this.withdrawMethodViews = list;
    }

    @NotNull
    public final List<fromLong> getWithdrawMethodViews() {
        return this.withdrawMethodViews;
    }
}
