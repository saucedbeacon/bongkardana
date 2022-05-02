package o;

import id.dana.model.SendMoneyHomeMenuModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u0016\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0016\u0010\u0014\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0002\u001a\u0016\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/sendmoney/adapter/BankPromoMenuHelper;", "Lid/dana/sendmoney/adapter/IBankPromoMenuHelper;", "sendMoneyHomeMenuAdapter", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/SendMoneyHomeMenuModel;", "(Lid/dana/base/BaseRecyclerViewAdapter;)V", "bankPromoActive", "", "bankPromoTitle", "", "dismissAndBackupBankPromoTitleIfPromoActive", "", "menus", "", "getBankMenu", "", "isBankFreeTransferActive", "restoreBankPromoTitle", "bankMenu", "setItemsFirstTime", "updateBankMenu", "menu", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setRetmsg {
    private String length = "";
    private boolean setMax;
    private final IMultiInstanceInvalidationCallback.Stub<? extends Ignore<SendMoneyHomeMenuModel>, SendMoneyHomeMenuModel> setMin;

    public setRetmsg(@NotNull IMultiInstanceInvalidationCallback.Stub<? extends Ignore<SendMoneyHomeMenuModel>, SendMoneyHomeMenuModel> stub) {
        Intrinsics.checkNotNullParameter(stub, "sendMoneyHomeMenuAdapter");
        this.setMin = stub;
    }

    public final boolean length() {
        return this.setMax;
    }

    public final void setMin(@Nullable SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        int min;
        if (sendMoneyHomeMenuModel != null && this.setMin.getMax() != null && (min = setMin(this.setMin.getMax())) != -1 && this.setMin.setMin(min) != null) {
            SendMoneyHomeMenuModel min2 = this.setMin.setMin(min);
            Intrinsics.checkNotNullExpressionValue(min2, "bankMenu");
            String str = this.length;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            min2.toIntRange = str;
            this.setMin.getMax().set(min, min2);
            this.setMin.notifyItemChanged(min);
        }
    }

    private static int setMin(List<SendMoneyHomeMenuModel> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getMax()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final void getMin(@NotNull List<SendMoneyHomeMenuModel> list) {
        Intrinsics.checkNotNullParameter(list, "menus");
        int min = setMin(list);
        if (min != -1 && list.get(min).setMin()) {
            SendMoneyHomeMenuModel sendMoneyHomeMenuModel = list.get(min);
            this.length = sendMoneyHomeMenuModel.toIntRange;
            this.setMax = sendMoneyHomeMenuModel.setMin();
            Intrinsics.checkNotNullParameter("", "<set-?>");
            sendMoneyHomeMenuModel.toIntRange = "";
            Intrinsics.checkNotNullParameter("", "<set-?>");
            sendMoneyHomeMenuModel.IsOverlapping = "";
            sendMoneyHomeMenuModel.getMin = false;
        }
        this.setMin.getMin(list);
    }
}
