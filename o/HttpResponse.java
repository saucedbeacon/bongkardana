package o;

import id.dana.di.modules.SavingTopUpHistoryModule;
import o.isEnableFrameData;

public final class HttpResponse implements getAdapterPosition<isEnableFrameData.getMin> {
    private final SavingTopUpHistoryModule getMin;

    private HttpResponse(SavingTopUpHistoryModule savingTopUpHistoryModule) {
        this.getMin = savingTopUpHistoryModule;
    }

    public static HttpResponse getMin(SavingTopUpHistoryModule savingTopUpHistoryModule) {
        return new HttpResponse(savingTopUpHistoryModule);
    }

    public final /* synthetic */ Object get() {
        isEnableFrameData.getMin length = this.getMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
