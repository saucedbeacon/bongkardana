package o;

import android.view.View;
import id.dana.dialog.CommonDialog;
import kotlin.jvm.functions.Function1;

public final class setAcquirerId implements Function1 {
    private final View length;
    private final CommonDialog.getMax setMin;

    public setAcquirerId(CommonDialog.getMax getmax, View view) {
        this.setMin = getmax;
        this.length = view;
    }

    public final Object invoke(Object obj) {
        return CommonDialog.getMax(this.setMin, this.length);
    }
}
