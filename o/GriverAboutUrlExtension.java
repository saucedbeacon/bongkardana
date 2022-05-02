package o;

import android.view.View;
import id.dana.dialog.DialogPermission;

public final class GriverAboutUrlExtension implements View.OnClickListener {
    private final DialogPermission.length setMin;

    public GriverAboutUrlExtension(DialogPermission.length length) {
        this.setMin = length;
    }

    public final void onClick(View view) {
        this.setMin.onNegativeButtonClicked();
    }
}
