package id.dana.myprofile;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.QRView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ShareQrDialog_ViewBinding extends BaseActivity_ViewBinding {
    private ShareQrDialog getMin;
    private View length;
    private View setMin;

    @UiThread
    public ShareQrDialog_ViewBinding(final ShareQrDialog shareQrDialog, View view) {
        super(shareQrDialog, view);
        this.getMin = shareQrDialog;
        View max = drawDividersHorizontal.getMax(view, R.id.f37322131362184, "field 'buttonShare' and method 'onShareButtonClick'");
        shareQrDialog.buttonShare = (Button) drawDividersHorizontal.getMin(max, R.id.f37322131362184, "field 'buttonShare'", Button.class);
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                shareQrDialog.onShareButtonClick(view);
            }
        });
        shareQrDialog.ivDanaLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f41802131362670, "field 'ivDanaLogo'", ImageView.class);
        shareQrDialog.layoutFooter = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f61202131364718, "field 'layoutFooter'", LinearLayout.class);
        shareQrDialog.layoutQr = (QRView) drawDividersHorizontal.setMin(view, R.id.f51972131363753, "field 'layoutQr'", QRView.class);
        shareQrDialog.nsvStaticQr = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f56152131364181, "field 'nsvStaticQr'", NestedScrollView.class);
        shareQrDialog.tvNote = (TextView) drawDividersHorizontal.setMin(view, R.id.f57842131364363, "field 'tvNote'", TextView.class);
        shareQrDialog.tvQrTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f73392131365974, "field 'tvQrTitle'", TextView.class);
        shareQrDialog.tvUserIDStatic = (TextView) drawDividersHorizontal.setMin(view, R.id.f70272131365657, "field 'tvUserIDStatic'", TextView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f39742131362454, "method 'onParentClick'");
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                shareQrDialog.onParentClick(view);
            }
        });
    }

    public final void setMax() {
        ShareQrDialog shareQrDialog = this.getMin;
        if (shareQrDialog != null) {
            this.getMin = null;
            shareQrDialog.buttonShare = null;
            shareQrDialog.ivDanaLogo = null;
            shareQrDialog.layoutFooter = null;
            shareQrDialog.layoutQr = null;
            shareQrDialog.nsvStaticQr = null;
            shareQrDialog.tvNote = null;
            shareQrDialog.tvQrTitle = null;
            shareQrDialog.tvUserIDStatic = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
