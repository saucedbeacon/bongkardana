package o;

import android.view.View;
import id.dana.dialog.CommonDialog;
import kotlin.jvm.functions.Function1;

public final class getLanguages implements Function1 {
    private final View getMin;
    private final CommonDialog.getMax setMin;

    public getLanguages(CommonDialog.getMax getmax, View view) {
        this.setMin = getmax;
        this.getMin = view;
    }

    public final Object invoke(Object obj) {
        return CommonDialog.getMin(this.setMin, this.getMin);
    }
}
