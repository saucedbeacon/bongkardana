package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.model.SendMoneyHomeMenuModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u001c\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002J\f\u0010\u001d\u001a\u00020\u0006*\u00020\u0003H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/sendmoney_v2/landing/adapter/RecipientSelectorAdapter;", "Lid/dana/sendmoney_v2/landing/adapter/ExpandableAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/SendMoneyHomeMenuModel;", "Lid/dana/sendmoney/adapter/IBankPromoMenuHelper;", "spanSize", "", "showMoreItem", "", "(IZ)V", "bankPromoMenuHelper", "Lid/dana/sendmoney/adapter/BankPromoMenuHelper;", "getItemViewType", "position", "isBankFreeTransferActive", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "items", "", "setItemsFirstTime", "menus", "", "updateBankMenu", "menu", "fillRemainingItemInRowWithPlaceholder", "getViewTypeFromAction", "RecipientSelectorViewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IconUtils extends isIndexValidInList<Ignore<SendMoneyHomeMenuModel>, SendMoneyHomeMenuModel> {
    public final setRetmsg setMax;

    public /* synthetic */ IconUtils() {
        this((byte) 0);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == -3) {
            ignore = new setProgressColor(viewGroup);
        } else if (i != 0) {
            ignore = new CircleProgressBar(viewGroup);
        } else {
            ignore = new CompactScroller(viewGroup);
        }
        return ignore;
    }

    private IconUtils(byte b) {
        super(1, 3);
        this.setMax = new setRetmsg(this);
    }

    public final int getItemViewType(int i) {
        if (getMin(i)) {
            return -2;
        }
        SendMoneyHomeMenuModel sendMoneyHomeMenuModel = (SendMoneyHomeMenuModel) setMin(i);
        if (sendMoneyHomeMenuModel == null || StringsKt.isBlank(sendMoneyHomeMenuModel.length)) {
            return -3;
        }
        return 0;
    }

    public final boolean isInside() {
        return this.setMax.length();
    }

    public final void getMin(@Nullable List<SendMoneyHomeMenuModel> list) {
        int equals;
        if (list != null && (equals = equals() - (list.size() % equals())) > 0 && equals > 0) {
            int i = 1;
            while (true) {
                list.add(new SendMoneyHomeMenuModel((byte) 0));
                if (i == equals) {
                    break;
                }
                i++;
            }
        }
        super.getMin(list);
    }
}
