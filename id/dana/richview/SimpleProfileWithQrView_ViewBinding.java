package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import o.drawDividersHorizontal;

public class SimpleProfileWithQrView_ViewBinding implements Unbinder {
    private SimpleProfileWithQrView setMin;

    @UiThread
    public SimpleProfileWithQrView_ViewBinding(SimpleProfileWithQrView simpleProfileWithQrView, View view) {
        this.setMin = simpleProfileWithQrView;
        simpleProfileWithQrView.ivStaticQrSkeleton = drawDividersHorizontal.getMax(view, R.id.f50902131363645, "field 'ivStaticQrSkeleton'");
        simpleProfileWithQrView.phoneNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68152131365442, "field 'phoneNumber'", TextView.class);
        simpleProfileWithQrView.profileImageView = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f56982131364275, "field 'profileImageView'", CircleImageView.class);
        simpleProfileWithQrView.qrImageView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46412131363186, "field 'qrImageView'", ImageView.class);
        simpleProfileWithQrView.userName = (ProfileNameTextView) drawDividersHorizontal.setMin(view, R.id.f61942131364804, "field 'userName'", ProfileNameTextView.class);
        simpleProfileWithQrView.ivDanaPremium = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48512131363405, "field 'ivDanaPremium'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        SimpleProfileWithQrView simpleProfileWithQrView = this.setMin;
        if (simpleProfileWithQrView != null) {
            this.setMin = null;
            simpleProfileWithQrView.ivStaticQrSkeleton = null;
            simpleProfileWithQrView.phoneNumber = null;
            simpleProfileWithQrView.profileImageView = null;
            simpleProfileWithQrView.qrImageView = null;
            simpleProfileWithQrView.userName = null;
            simpleProfileWithQrView.ivDanaPremium = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
