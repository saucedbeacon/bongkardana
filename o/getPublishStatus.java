package o;

import android.view.View;
import id.dana.dialog.DialogPermission;

public final class getPublishStatus implements View.OnClickListener {
    private final DialogPermission.length getMin;

    public getPublishStatus(DialogPermission.length length) {
        this.getMin = length;
    }

    public final void onClick(View view) {
        this.getMin.onPositiveButtonClicked();
    }
}
