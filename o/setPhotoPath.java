package o;

import android.view.View;
import id.dana.sendmoney.recipient.recent.viewholder.ScannerViewHolder;
import o.Ignore;

public final class setPhotoPath implements View.OnClickListener {
    private final Ignore.setMin getMax;
    private final ScannerViewHolder length;

    public setPhotoPath(ScannerViewHolder scannerViewHolder, Ignore.setMin setmin) {
        this.length = scannerViewHolder;
        this.getMax = setmin;
    }

    public final void onClick(View view) {
        ScannerViewHolder.getMax(this.length, this.getMax);
    }
}
