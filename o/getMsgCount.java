package o;

import id.dana.social.di.module.PrivacySettingModule;
import o.b;
import o.getTitleBarRelative;

public final class getMsgCount implements getAdapterPosition<getTitleBarRelative.setMin> {
    private final b.C0007b<getRightButton> getMax;
    private final PrivacySettingModule length;

    private getMsgCount(PrivacySettingModule privacySettingModule, b.C0007b<getRightButton> bVar) {
        this.length = privacySettingModule;
        this.getMax = bVar;
    }

    public static getMsgCount length(PrivacySettingModule privacySettingModule, b.C0007b<getRightButton> bVar) {
        return new getMsgCount(privacySettingModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getTitleBarRelative.setMin min = this.length.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
