package o;

import android.content.Context;
import id.dana.social.di.module.PrivacySettingModule;
import o.AUHorizontalListView;
import o.b;

public final class setMsgCount implements getAdapterPosition<AUHorizontalListView.SelectionNotifier> {
    private final PrivacySettingModule setMax;
    private final b.C0007b<Context> setMin;

    private setMsgCount(PrivacySettingModule privacySettingModule, b.C0007b<Context> bVar) {
        this.setMax = privacySettingModule;
        this.setMin = bVar;
    }

    public static setMsgCount setMax(PrivacySettingModule privacySettingModule, b.C0007b<Context> bVar) {
        return new setMsgCount(privacySettingModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AUHorizontalListView.SelectionNotifier max = this.setMax.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
