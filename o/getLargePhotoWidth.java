package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.summary.view.SummaryView;
import o.DiagnosticsReceiver;

public final class getLargePhotoWidth implements getBindingAdapter<SummaryView> {
    @InjectedFieldSignature("id.dana.sendmoney.summary.view.SummaryView.presenter")
    public static void length(SummaryView summaryView, DiagnosticsReceiver.getMin getmin) {
        summaryView.presenter = getmin;
    }
}
