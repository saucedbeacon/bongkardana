package o;

import id.dana.di.modules.SavingTopUpModule;
import o.setVideoCurTimeStamp;

public final class getUploadRequest implements getAdapterPosition<setVideoCurTimeStamp.setMin> {
    private final SavingTopUpModule setMin;

    private getUploadRequest(SavingTopUpModule savingTopUpModule) {
        this.setMin = savingTopUpModule;
    }

    public static getUploadRequest getMin(SavingTopUpModule savingTopUpModule) {
        return new getUploadRequest(savingTopUpModule);
    }

    public final /* synthetic */ Object get() {
        setVideoCurTimeStamp.setMin max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
