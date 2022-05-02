package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.lazada.LazadaGuideActivity;
import o.GriverSessionDataExtension;

public final class WorkerManagerExtension implements getBindingAdapter<LazadaGuideActivity> {
    @InjectedFieldSignature("id.dana.lazada.LazadaGuideActivity.lazadaPresenter")
    public static void getMin(LazadaGuideActivity lazadaGuideActivity, GriverSessionDataExtension.setMax setmax) {
        lazadaGuideActivity.lazadaPresenter = setmax;
    }
}
