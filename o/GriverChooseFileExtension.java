package o;

import id.dana.di.modules.SwitchFaceAuthenticationModule;
import o.replaceLayoutParam;

public final class GriverChooseFileExtension implements getAdapterPosition<replaceLayoutParam.length> {
    private final SwitchFaceAuthenticationModule getMin;

    private GriverChooseFileExtension(SwitchFaceAuthenticationModule switchFaceAuthenticationModule) {
        this.getMin = switchFaceAuthenticationModule;
    }

    public static GriverChooseFileExtension setMin(SwitchFaceAuthenticationModule switchFaceAuthenticationModule) {
        return new GriverChooseFileExtension(switchFaceAuthenticationModule);
    }

    public final /* synthetic */ Object get() {
        replaceLayoutParam.length max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
