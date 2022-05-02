package o;

import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;

public final class getMediaId extends getPhotoGroupIndex {
    private getMediaSubType setMin;

    public getMediaId(getMediaSubType getmediasubtype, boolean z) {
        if (z) {
            length(new RecipientViewModel(7));
        }
        this.setMin = getmediasubtype;
    }

    public final List<RecipientViewModel> getMin() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.setMin.getMin());
        arrayList.addAll(this.getMax);
        return arrayList;
    }
}
