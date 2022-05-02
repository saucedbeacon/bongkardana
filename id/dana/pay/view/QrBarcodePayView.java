package id.dana.pay.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import o.BottomPopup;
import o.OpenDocumentBridgeExtension;
import o.downloadFileByHttp;
import o.setH5MenuList;

public class QrBarcodePayView extends BasePayView {
    View barcodeOverlayView;
    @BindView(2131364216)
    ImageView barcodeView;
    @BindView(2131364218)
    TextView paycodeView;

    public int getLayout() {
        return R.layout.view_pay_qr_barcode;
    }

    public QrBarcodePayView(@NonNull Context context) {
        super(context);
    }

    public QrBarcodePayView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QrBarcodePayView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public QrBarcodePayView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onInjectedView(View view) {
        super.onInjectedView(view);
        this.barcodeOverlayView = view.findViewById(R.id.f56472131364217);
    }

    public void setup() {
        super.setup();
        this.barcodeView.setOnClickListener(new downloadFileByHttp(this));
    }

    public void fetchCode() {
        super.fetchCode();
        this.barcodeOverlayView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void showQR(boolean z) {
        super.showQR(z);
        TextView textView = this.paycodeView;
        int i = 0;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
        ImageView imageView = this.barcodeView;
        if (imageView != null) {
            if (!z) {
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void setBarcodeOverlayViewVisibility(int i) {
        View view = this.barcodeOverlayView;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDisableCode() {
        TextView textView = this.paycodeView;
        if (textView != null) {
            textView.setVisibility(0);
            this.paycodeView.setText(R.string.cant_use_qr);
        }
    }

    /* access modifiers changed from: protected */
    public void onSetCode(String str) {
        String str2;
        TextView textView = this.paycodeView;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                String substring = str.substring(0, 4);
                String substring2 = str.substring(4);
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append(substring2.replaceAll(".", "•"));
                str2 = setH5MenuList.getMin(sb.toString(), 12);
            }
            textView.setText(str2);
        }
        addDisposable(BottomPopup.setMin(str, 1).subscribe(new OpenDocumentBridgeExtension(this)));
    }

    public static /* synthetic */ void length(QrBarcodePayView qrBarcodePayView) {
        if (qrBarcodePayView.onClickListener != null && qrBarcodePayView.valid) {
            qrBarcodePayView.onClickListener.length();
        }
    }
}
