package o;

import android.view.View;
import id.dana.dialog.DialogPermission;

public final class getAcParams implements View.OnClickListener {
    private final DialogPermission.length getMax;

    public getAcParams(DialogPermission.length length) {
        this.getMax = length;
    }

    public final void onClick(View view) {
        this.getMax.onPositiveButtonClicked();
    }
}
