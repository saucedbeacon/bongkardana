package o;

import id.dana.domain.profilemenu.model.SettingModel;
import kotlin.jvm.functions.Function1;
import o.GriverShareExtensionImpl;

final class encodeURIComponent implements Function1 {
    private final SettingModel getMax;
    private final GriverShareExtensionImpl.AnonymousClass3 setMin;

    public encodeURIComponent(GriverShareExtensionImpl.AnonymousClass3 r1, SettingModel settingModel) {
        this.setMin = r1;
        this.getMax = settingModel;
    }

    public final Object invoke(Object obj) {
        return GriverShareExtensionImpl.AnonymousClass3.getMin(this.setMin, this.getMax, (Exception) obj);
    }
}
