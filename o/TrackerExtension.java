package o;

import android.content.DialogInterface;
import id.dana.lazada.LazadaGuideActivity;

public final class TrackerExtension implements DialogInterface.OnDismissListener {
    private final LazadaGuideActivity getMax;

    public TrackerExtension(LazadaGuideActivity lazadaGuideActivity) {
        this.getMax = lazadaGuideActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.getMax.finish();
    }
}
