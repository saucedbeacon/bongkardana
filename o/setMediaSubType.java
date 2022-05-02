package o;

import android.text.TextUtils;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;

public final class setMediaSubType extends getPhotoGroupIndex {
    private getMediaSubType getMin;

    public setMediaSubType(getMediaSubType getmediasubtype, boolean z, String str) {
        if (z) {
            length(new RecipientViewModel(1, str));
        }
        if (TextUtils.isEmpty(str)) {
            length(new RecipientViewModel(11));
        }
        this.getMin = getmediasubtype;
    }

    public final List<RecipientViewModel> getMin() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.getMin.getMin());
        arrayList.addAll(this.getMax);
        return arrayList;
    }
}
