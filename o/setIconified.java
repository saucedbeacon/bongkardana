package o;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

public final class setIconified extends setOnCloseListener<DocumentData> {
    public setIconified(List<setTitleMarginTop<DocumentData>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        if (f != 1.0f || settitlemargintop.getMin == null) {
            return (DocumentData) settitlemargintop.setMax;
        }
        return (DocumentData) settitlemargintop.getMin;
    }
}
