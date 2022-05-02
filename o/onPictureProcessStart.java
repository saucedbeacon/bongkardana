package o;

import android.view.MotionEvent;
import android.view.View;
import id.dana.richview.NewBannerView;

public final class onPictureProcessStart implements View.OnTouchListener {
    private final NewBannerView getMax;

    public onPictureProcessStart(NewBannerView newBannerView) {
        this.getMax = newBannerView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.getMax.getMax(view, motionEvent);
    }
}
