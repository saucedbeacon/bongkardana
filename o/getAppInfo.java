package o;

import android.content.DialogInterface;
import android.view.View;
import id.dana.dialog.DialogWithImage;

public final class getAppInfo implements View.OnClickListener {
    private final DialogInterface.OnClickListener getMin;
    private final int length;
    private final DialogWithImage setMax;

    public getAppInfo(DialogWithImage dialogWithImage, DialogInterface.OnClickListener onClickListener, int i) {
        this.setMax = dialogWithImage;
        this.getMin = onClickListener;
        this.length = i;
    }

    public final void onClick(View view) {
        DialogWithImage.setMax(this.setMax, this.getMin, this.length);
    }
}
