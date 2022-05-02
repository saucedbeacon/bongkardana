package id.dana.pay.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.BottomPopup;
import o.FileMangerBridgeExtension;
import o.downloadFile;
import o.downloadFileByBase64;

public abstract class BasePayView extends BaseRichView {
    private String getMax = "";
    private ImageView getMin;
    public setMax onClickListener;
    @BindView(2131364226)
    ImageView qrView;
    @BindView(2131364225)
    TextView refreshLabel;
    private ImageView setMax;
    public boolean valid;

    public interface setMax {
        void length();

        void setMax();

        void setMin();
    }

    /* access modifiers changed from: protected */
    public abstract void onDisableCode();

    /* access modifiers changed from: protected */
    public abstract void onSetCode(String str);

    /* access modifiers changed from: protected */
    public abstract void setBarcodeOverlayViewVisibility(int i);

    public BasePayView(@NonNull Context context) {
        super(context);
    }

    public BasePayView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BasePayView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BasePayView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onInjectedView(View view) {
        super.onInjectedView(view);
        this.setMax = (ImageView) view.findViewById(R.id.f56522131364223);
        this.getMin = (ImageView) view.findViewById(R.id.f56532131364224);
    }

    public void setup(boolean z) {
        super.setup(z);
        if (!z) {
            setCode("");
            fetchCode();
        }
    }

    public void setup() {
        this.getMin.setOnClickListener(new FileMangerBridgeExtension(this));
        this.qrView.setOnClickListener(new downloadFileByBase64(this));
    }

    public void setOnClickListener(setMax setmax) {
        this.onClickListener = setmax;
    }

    public void startRefresh() {
        fetchCode();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f732130772045);
        loadAnimation.setInterpolator(new LinearInterpolator());
        this.getMin.startAnimation(loadAnimation);
    }

    private void getMax(boolean z) {
        ImageView imageView = this.getMin;
        int i = 0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        TextView textView = this.refreshLabel;
        if (textView != null) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void showQR(boolean z) {
        ImageView imageView = this.setMax;
        int i = 0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        ImageView imageView2 = this.qrView;
        if (imageView2 != null) {
            if (!z) {
                i = 4;
            }
            imageView2.setVisibility(i);
        }
    }

    public void invalidCode() {
        this.valid = false;
        getMax(true);
        showQR(false);
        TextView textView = this.refreshLabel;
        if (textView != null) {
            textView.setText(R.string.tap_to_refresh);
        }
        setBarcodeOverlayViewVisibility(0);
    }

    public void disableCode() {
        this.valid = false;
        getMax(true);
        showQR(false);
        setBarcodeOverlayViewVisibility(8);
        TextView textView = this.refreshLabel;
        if (textView != null) {
            textView.setVisibility(8);
        }
        onDisableCode();
        ImageView imageView = this.getMin;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.qr_code_failed);
        }
    }

    public void stopRefresh() {
        try {
            if (!TextUtils.isEmpty(this.getMax) && !this.getMax.equals("")) {
                getMax(false);
                showQR(true);
                setBarcodeOverlayViewVisibility(8);
            }
            if (this.getMin != null) {
                this.getMin.setAnimation((Animation) null);
            }
        } catch (Exception unused) {
        }
    }

    public String getCode() {
        return this.getMax;
    }

    public void setCode(String str) {
        if (!TextUtils.isEmpty(str) && !"".equals(str)) {
            this.getMax = str;
            this.valid = true;
        }
        addDisposable(BottomPopup.getMin(str).subscribe(new downloadFile(this)));
        onSetCode(str);
        TextView textView = this.refreshLabel;
        if (textView != null) {
            textView.setText(R.string.tap_to_refresh);
        }
        stopRefresh();
    }

    public void resetQrCode() {
        this.getMax = "";
    }

    public void fetchCode() {
        getMax(true);
        showQR(false);
        this.refreshLabel.setText(R.string.loading_pay_qr);
    }

    public static /* synthetic */ void getMax(BasePayView basePayView) {
        setMax setmax = basePayView.onClickListener;
        if (setmax != null && basePayView.valid) {
            setmax.setMax();
        }
    }

    public static /* synthetic */ void setMax(BasePayView basePayView) {
        setMax setmax = basePayView.onClickListener;
        if (setmax != null) {
            setmax.setMin();
        }
    }
}
