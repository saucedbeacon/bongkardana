package o;

import android.view.View;
import id.dana.dialog.DialogPermission;

public final class getAboutUrl implements View.OnClickListener {
    private final DialogPermission.length length;

    public getAboutUrl(DialogPermission.length length2) {
        this.length = length2;
    }

    public final void onClick(View view) {
        this.length.onNegativeButtonClicked();
    }
}
