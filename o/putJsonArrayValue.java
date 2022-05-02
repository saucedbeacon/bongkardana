package o;

import java.util.List;

final class putJsonArrayValue implements RedDotDrawable {
    private final APWebSettings getMax;

    public putJsonArrayValue(APWebSettings aPWebSettings) {
        this.getMax = aPWebSettings;
    }

    public final Object apply(Object obj) {
        return getData.lambda$generateSplitBillQrDeepLink$7(this.getMax, (List) obj);
    }
}
