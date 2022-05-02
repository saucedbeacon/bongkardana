package o;

import android.content.Context;
import o.LogContextImpl;

public final class uploadCoreByStartService {
    public final syncUploadCoreByCategoryDirectly setMax;
    public final updateTimeZone setMin;

    private uploadCoreByStartService(Context context, LogContextImpl logContextImpl) {
        this.setMin = new updateTimeZone(context, logContextImpl);
        this.setMax = new syncUploadCoreByCategoryDirectly(this.setMin);
    }

    public uploadCoreByStartService(Context context) {
        this(context, new LogContextImpl(new LogContextImpl.getMin(), (byte) 0));
    }
}
