package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.view.TotalSavingAmountView;
import o.SightCameraView;

public final class onSingleTapUp implements getBindingAdapter<TotalSavingAmountView> {
    @InjectedFieldSignature("id.dana.savings.view.TotalSavingAmountView.savingConfigPresenter")
    public static void setMin(TotalSavingAmountView totalSavingAmountView, SightCameraView.OnRecordListener onRecordListener) {
        totalSavingAmountView.savingConfigPresenter = onRecordListener;
    }
}
