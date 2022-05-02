package id.dana.home.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ZoomDialog_ViewBinding extends BaseActivity_ViewBinding {
    private ZoomDialog getMax;
    private View length;

    @UiThread
    public ZoomDialog_ViewBinding(final ZoomDialog zoomDialog, View view) {
        super(zoomDialog, view);
        this.getMax = zoomDialog;
        zoomDialog.ivBarcodeZoom = (ImageView) drawDividersHorizontal.setMin(view, R.id.f51212131363676, "field 'ivBarcodeZoom'", ImageView.class);
        zoomDialog.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        zoomDialog.ivQrZoom = (ImageView) drawDividersHorizontal.setMin(view, R.id.f51222131363677, "field 'ivQrZoom'", ImageView.class);
        zoomDialog.layoutBarcodeZoom = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f52082131363764, "field 'layoutBarcodeZoom'", LinearLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f58652131364447, "field 'layoutParent' and method 'onParentLayoutClicked'");
        zoomDialog.layoutParent = (RelativeLayout) drawDividersHorizontal.getMin(max, R.id.f58652131364447, "field 'layoutParent'", RelativeLayout.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                zoomDialog.onParentLayoutClicked();
            }
        });
        zoomDialog.layoutQrZoom = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f52092131363765, "field 'layoutQrZoom'", RelativeLayout.class);
        zoomDialog.tvCode = (TextView) drawDividersHorizontal.setMin(view, R.id.f70502131365681, "field 'tvCode'", TextView.class);
    }

    public final void setMax() {
        ZoomDialog zoomDialog = this.getMax;
        if (zoomDialog != null) {
            this.getMax = null;
            zoomDialog.ivBarcodeZoom = null;
            zoomDialog.ivLogo = null;
            zoomDialog.ivQrZoom = null;
            zoomDialog.layoutBarcodeZoom = null;
            zoomDialog.layoutParent = null;
            zoomDialog.layoutQrZoom = null;
            zoomDialog.tvCode = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
