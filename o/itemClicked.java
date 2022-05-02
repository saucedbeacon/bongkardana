package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toTransaction", "Lid/dana/domain/account/model/Transaction;", "Lid/dana/data/account/TransactionEntity;", "toTransactionEntity", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class itemClicked {
    @NotNull
    public static final isItemChecked toTransactionEntity(@NotNull GriverOptionMenuPanelExtension griverOptionMenuPanelExtension) {
        Intrinsics.checkNotNullParameter(griverOptionMenuPanelExtension, "$this$toTransactionEntity");
        return new isItemChecked(griverOptionMenuPanelExtension.getType(), griverOptionMenuPanelExtension.getDate());
    }

    @NotNull
    public static final GriverOptionMenuPanelExtension toTransaction(@NotNull isItemChecked isitemchecked) {
        Intrinsics.checkNotNullParameter(isitemchecked, "$this$toTransaction");
        String type = isitemchecked.getType();
        String str = "";
        if (type == null) {
            type = str;
        }
        String date = isitemchecked.getDate();
        if (date != null) {
            str = date;
        }
        return new GriverOptionMenuPanelExtension(type, str);
    }
}
