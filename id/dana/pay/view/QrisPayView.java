package id.dana.pay.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;

public class QrisPayView extends BasePayView {
    public int getLayout() {
        return R.layout.view_pay_qris;
    }

    /* access modifiers changed from: protected */
    public void onDisableCode() {
    }

    /* access modifiers changed from: protected */
    public void onSetCode(String str) {
    }

    /* access modifiers changed from: protected */
    public void setBarcodeOverlayViewVisibility(int i) {
    }

    public QrisPayView(@NonNull Context context) {
        super(context);
    }

    public QrisPayView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QrisPayView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
