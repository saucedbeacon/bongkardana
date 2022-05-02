package id.dana.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DialogWithImage_ViewBinding implements Unbinder {
    private DialogWithImage getMax;

    @UiThread
    public DialogWithImage_ViewBinding(DialogWithImage dialogWithImage, View view) {
        this.getMax = dialogWithImage;
        dialogWithImage.constraintLayout = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40902131362575, "field 'constraintLayout'", ConstraintLayout.class);
        dialogWithImage.imageView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46312131363176, "field 'imageView'", ImageView.class);
        dialogWithImage.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        dialogWithImage.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        dialogWithImage.btnPositive = (Button) drawDividersHorizontal.setMin(view, R.id.f36602131362112, "field 'btnPositive'", Button.class);
        dialogWithImage.btnNegative = (Button) drawDividersHorizontal.setMin(view, R.id.f36492131362099, "field 'btnNegative'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        DialogWithImage dialogWithImage = this.getMax;
        if (dialogWithImage != null) {
            this.getMax = null;
            dialogWithImage.constraintLayout = null;
            dialogWithImage.imageView = null;
            dialogWithImage.tvTitle = null;
            dialogWithImage.tvDescription = null;
            dialogWithImage.btnPositive = null;
            dialogWithImage.btnNegative = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
