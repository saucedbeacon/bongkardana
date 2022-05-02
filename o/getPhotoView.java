package o;

import id.dana.model.ThirdPartyService;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000f"}, d2 = {"Lid/dana/service/adapter/EditServiceAdapter;", "Lid/dana/service/adapter/ServiceAdapter;", "()V", "isItemFull", "", "()Z", "onEditChange", "", "onEdit", "removeItem", "position", "", "replaceEmptyItem", "service", "Lid/dana/model/ThirdPartyService;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPhotoView extends PhotoView {
    /* access modifiers changed from: protected */
    public final void length(boolean z) {
    }

    public final boolean setMax() {
        List<ThirdPartyService> max = getMax();
        if (max == null) {
            return true;
        }
        for (ThirdPartyService thirdPartyService : max) {
            if (thirdPartyService.values == 6) {
                return false;
            }
        }
        return true;
    }

    public final void getMax(int i) {
        if (i <= getMax().size()) {
            ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
            getmin.values = 6;
            getMax().set(i, getmin.setMin());
            notifyItemChanged(i);
        }
    }
}
