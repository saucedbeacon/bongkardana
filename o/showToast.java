package o;

import java.util.List;

final class showToast implements RedDotDrawable {
    private final FontSizeSetting getMax;

    public showToast(FontSizeSetting fontSizeSetting) {
        this.getMax = fontSizeSetting;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((List) obj);
    }
}
