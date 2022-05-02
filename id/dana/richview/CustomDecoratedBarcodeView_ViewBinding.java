package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import id.dana.R;
import o.drawDividersHorizontal;

public class CustomDecoratedBarcodeView_ViewBinding implements Unbinder {
    private CustomDecoratedBarcodeView getMin;

    @UiThread
    public CustomDecoratedBarcodeView_ViewBinding(CustomDecoratedBarcodeView customDecoratedBarcodeView, View view) {
        this.getMin = customDecoratedBarcodeView;
        customDecoratedBarcodeView.decoratedBarcodeView = (DecoratedBarcodeView) drawDividersHorizontal.setMin(view, R.id.f41872131362678, "field 'decoratedBarcodeView'", DecoratedBarcodeView.class);
        customDecoratedBarcodeView.ivQrisSupported = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50402131363595, "field 'ivQrisSupported'", ImageView.class);
        customDecoratedBarcodeView.bvBubbleStatus = (BubbleView) drawDividersHorizontal.setMin(view, R.id.f37372131362189, "field 'bvBubbleStatus'", BubbleView.class);
    }

    @CallSuper
    public final void setMax() {
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.getMin;
        if (customDecoratedBarcodeView != null) {
            this.getMin = null;
            customDecoratedBarcodeView.decoratedBarcodeView = null;
            customDecoratedBarcodeView.ivQrisSupported = null;
            customDecoratedBarcodeView.bvBubbleStatus = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
