package androidx.work;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.getSupportBackgroundTintList;
import o.updateAppearance;

public final class OverwritingInputMerger extends getSupportBackgroundTintList {
    @NonNull
    public final updateAppearance getMax(@NonNull List<updateAppearance> list) {
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        HashMap hashMap = new HashMap();
        for (updateAppearance updateappearance : list) {
            hashMap.putAll(Collections.unmodifiableMap(updateappearance.setMin));
        }
        getmin.setMin(hashMap);
        updateAppearance updateappearance2 = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance2);
        return updateappearance2;
    }
}
