package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import o.drawDividersHorizontal;

public class QRView_ViewBinding implements Unbinder {
    private QRView setMin;

    @UiThread
    public QRView_ViewBinding(QRView qRView, View view) {
        this.setMin = qRView;
        qRView.imageViewUserProfile = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f46432131363188, "field 'imageViewUserProfile'", CircleImageView.class);
        qRView.ivKyc = (ImageView) drawDividersHorizontal.setMin(view, R.id.f72522131365887, "field 'ivKyc'", ImageView.class);
        qRView.ivQr = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50372131363592, "field 'ivQr'", ImageView.class);
        qRView.ivRefresh = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50562131363611, "field 'ivRefresh'", ImageView.class);
        qRView.viewQrSkeleton = drawDividersHorizontal.getMax(view, R.id.f72942131365929, "field 'viewQrSkeleton'");
    }

    @CallSuper
    public final void setMax() {
        QRView qRView = this.setMin;
        if (qRView != null) {
            this.setMin = null;
            qRView.imageViewUserProfile = null;
            qRView.ivKyc = null;
            qRView.ivQr = null;
            qRView.ivRefresh = null;
            qRView.viewQrSkeleton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
