package o;

import android.view.View;
import id.dana.richview.SimpleProfileWithQrView;

public final class GriverPhotoPreviewActivity implements View.OnClickListener {
    private final SimpleProfileWithQrView.setMin getMin;

    public GriverPhotoPreviewActivity(SimpleProfileWithQrView.setMin setmin) {
        this.getMin = setmin;
    }

    public final void onClick(View view) {
        SimpleProfileWithQrView.setMin(this.getMin);
    }
}
