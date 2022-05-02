package o;

import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import o.GriverHttpRequestAPIExtension;
import o.b;

public final class JSONSerializable implements getAdapterPosition<GriverHttpRequestAPIExtension.RequestContext> {
    private final b.C0007b<onSwitchTab> getMax;
    private final ChangePhoneNumberH5EventModule setMin;

    public static GriverHttpRequestAPIExtension.RequestContext getMin(ChangePhoneNumberH5EventModule changePhoneNumberH5EventModule, onSwitchTab onswitchtab) {
        GriverHttpRequestAPIExtension.RequestContext length = changePhoneNumberH5EventModule.length(onswitchtab);
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverHttpRequestAPIExtension.RequestContext length = this.setMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
