package o;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import id.dana.R;

public final class DefaultBlueToothProxy extends Dialog {
    public DefaultBlueToothProxy(Activity activity) {
        super(activity);
        requestWindowFeature(1);
        setCancelable(false);
        setContentView(R.layout.dialog_currency_switch_loading);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable((Drawable) null);
        }
    }

    public final void show() {
        super.show();
        findViewById(R.id.f49002131363455).startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.f732130772045));
    }
}
