package o;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import id.dana.R;
import id.dana.richview.LogoProgressView;

public class setPublishStatus {
    public LogoProgressView getMax;
    private Activity getMin;
    public Dialog length;

    public setPublishStatus(Activity activity) {
        this.getMin = activity;
        Dialog dialog = new Dialog(this.getMin);
        this.length = dialog;
        dialog.requestWindowFeature(1);
        this.length.setCancelable(false);
        this.length.setContentView(R.layout.dialog_loading_dana);
        if (this.length.getWindow() != null) {
            this.length.getWindow().setBackgroundDrawable((Drawable) null);
        }
        this.getMax = (LogoProgressView) this.length.findViewById(R.id.f57112131364288);
    }

    public final void getMax() {
        if (setTopBackgroundColor.getMin(this.getMin) && this.length.isShowing()) {
            this.length.dismiss();
            this.getMax.stopRefresh();
        }
    }
}
