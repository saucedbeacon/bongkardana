package o;

import id.dana.di.modules.SavingConfigModule;
import o.notifyPrepared;

public final class DownloadCallback implements getAdapterPosition<notifyPrepared.length> {
    private final SavingConfigModule setMin;

    private DownloadCallback(SavingConfigModule savingConfigModule) {
        this.setMin = savingConfigModule;
    }

    public static DownloadCallback setMin(SavingConfigModule savingConfigModule) {
        return new DownloadCallback(savingConfigModule);
    }

    public final /* synthetic */ Object get() {
        notifyPrepared.length min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
