package o;

import android.view.View;
import id.dana.richview.BannerView;
import id.dana.richview.PromoBannerView;
import id.dana.richview.ToolbarSearchView;

public final class GriverCapturePreviewActivity implements BannerView.getMax {
    private final PromoBannerView getMin;

    public final class DeleteRunnable implements Runnable {
        private final View getMax;
        private final ToolbarSearchView getMin;

        public DeleteRunnable(ToolbarSearchView toolbarSearchView, View view) {
            this.getMin = toolbarSearchView;
            this.getMax = view;
        }

        public final void run() {
            ToolbarSearchView.getMin(this.getMin, this.getMax);
        }
    }

    public GriverCapturePreviewActivity(PromoBannerView promoBannerView) {
        this.getMin = promoBannerView;
    }

    public final void getMax() {
        this.getMin.refreshView();
    }
}
