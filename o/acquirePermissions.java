package o;

import androidx.annotation.NonNull;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import o.getItem;

public final class acquirePermissions extends getItem<RecipientViewModel> {
    private final List<RecipientViewModel> setMax;

    public acquirePermissions(List<RecipientViewModel> list) {
        this.setMax = list;
    }

    public final void getMax(@NonNull getItem.getMin<RecipientViewModel> getmin) {
        getmin.length(this.setMax);
    }
}
