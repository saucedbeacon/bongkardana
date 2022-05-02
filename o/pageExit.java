package o;

import id.dana.di.modules.RequestMoneyQrModule;
import o.b;
import o.loadOriginalImage;

public final class pageExit implements getAdapterPosition<loadOriginalImage.setMax> {
    private final b.C0007b<GriverH5Utils> getMax;
    private final RequestMoneyQrModule setMax;

    public static loadOriginalImage.setMax length(RequestMoneyQrModule requestMoneyQrModule, GriverH5Utils griverH5Utils) {
        loadOriginalImage.setMax min = requestMoneyQrModule.setMin(griverH5Utils);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        loadOriginalImage.setMax min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
