package o;

import id.dana.di.modules.UserBankModule;
import o.b;
import o.publishImageAction;

public final class GriverH5LoadProgressPoint implements getAdapterPosition<publishImageAction.setMin> {
    private final b.C0007b<onFling> setMax;
    private final UserBankModule setMin;

    public static publishImageAction.setMin getMin(UserBankModule userBankModule, onFling onfling) {
        publishImageAction.setMin length = userBankModule.length(onfling);
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        publishImageAction.setMin length = this.setMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
