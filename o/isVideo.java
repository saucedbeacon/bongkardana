package o;

import android.text.TextUtils;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;

public final class isVideo extends getPhotoGroupIndex {
    private getMediaSubType setMin;

    public isVideo(getMediaSubType getmediasubtype, boolean z, List<RecentBankModel> list, String str, boolean z2) {
        if (z && (TextUtils.isEmpty(str) || (list != null && !list.isEmpty()))) {
            length(new RecipientViewModel(10));
        }
        if (TextUtils.isEmpty(str)) {
            length(new RecipientViewModel(9));
        }
        if (z) {
            if (z2) {
                length(new RecipientViewModel(18));
            } else if (list == null || list.isEmpty()) {
                length(new RecipientViewModel(17));
            } else {
                setMax((List) new saveImageToPhotosAlbum().apply(list));
            }
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
