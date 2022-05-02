package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.splitbill.SelectedPayerView;
import o.CameraView;

public final class onSurfaceTextureAvailable implements getBindingAdapter<SelectedPayerView> {
    @InjectedFieldSignature("id.dana.richview.splitbill.SelectedPayerView.presenter")
    public static void setMin(SelectedPayerView selectedPayerView, CameraView.setMin setmin) {
        selectedPayerView.presenter = setmin;
    }
}
