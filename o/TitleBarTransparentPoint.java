package o;

import id.dana.data.globalnetwork.model.GnAuthResult;

final class TitleBarTransparentPoint implements RedDotDrawable {
    public static final TitleBarTransparentPoint length = new TitleBarTransparentPoint();

    public final Object apply(Object obj) {
        return FontSizeSettingProxy.transform((GnAuthResult) obj);
    }
}
