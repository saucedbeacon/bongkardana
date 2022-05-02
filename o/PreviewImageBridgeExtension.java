package o;

import javax.inject.Inject;
import o.PhotoPagerListener;

public final class PreviewImageBridgeExtension extends setSpeed<OnRpcResultListener, PhotoPagerListener.V3> {
    private final setBucketListener getMin;

    public final /* synthetic */ Object map(Object obj) {
        OnRpcResultListener onRpcResultListener = (OnRpcResultListener) obj;
        if (onRpcResultListener == null) {
            return null;
        }
        PhotoPagerListener.V3 v3 = new PhotoPagerListener.V3();
        v3.setMax = onRpcResultListener.isLoginStatus();
        v3.getMax = onRpcResultListener.getMaskedLoginId();
        v3.setMin = setBucketListener.getMax(onRpcResultListener.getPayMethodRiskResponse());
        return v3;
    }

    @Inject
    public PreviewImageBridgeExtension(setBucketListener setbucketlistener) {
        this.getMin = setbucketlistener;
    }
}
