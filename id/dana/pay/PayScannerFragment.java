package id.dana.pay;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.scanner.ScannerFragment;
import id.dana.tracker.TrackerKey;
import o.DecodeWrapper;
import o.cancelAll;
import o.isInAccessExternalPathWhiteList;

public class PayScannerFragment extends ScannerFragment implements isInAccessExternalPathWhiteList {
    @BindView(2131363453)
    ImageView ivFlash;
    @BindView(2131363917)
    LinearLayout llScannerTools;
    private setMax setMin;
    @BindView(2131365217)
    TextView tvDoneScan;

    public interface setMax {
        void getMax();
    }

    public final void FastBitmap$CoordinateSystem() {
    }

    public final int setMin() {
        return R.layout.fragment_pay_scanner;
    }

    public static PayScannerFragment setMin(setMax setmax) {
        PayScannerFragment payScannerFragment = new PayScannerFragment();
        payScannerFragment.setMin = setmax;
        return payScannerFragment;
    }

    public final void toDoubleRange() {
        Drawable drawable;
        this.setMax = false;
        if (this.barcodeView != null) {
            this.barcodeView.setTorchOff();
        }
        ImageView imageView = this.ivFlash;
        if (imageView != null) {
            if (this.setMax) {
                drawable = cancelAll.getMin(getContext(), R.drawable.bg_circle_white_transparent);
            } else {
                drawable = cancelAll.getMin(getContext(), R.drawable.bg_circle_transparent);
            }
            imageView.setBackground(drawable);
            this.ivFlash.setImageResource(this.setMax ? R.drawable.ic_flash_pay_active : R.drawable.ic_flash_pay);
        }
    }

    public final void getMax() {
        setMax setmax = this.setMin;
        if (setmax != null) {
            setmax.getMax();
        }
    }

    public final void equals() {
        this.barcodeView.resume();
    }

    public final void setMax() {
        super.setMax();
        this.llScannerTools.setVisibility(8);
        this.tvDoneScan.setVisibility(8);
        DecodeWrapper.getMin(TrackerKey.SourceType.CAMERA_CARD);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363461})
    public void onIvGalleryClicked() {
        openGallery();
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363453})
    public void onIvFlashClicked() {
        Drawable drawable;
        setTorch();
        ImageView imageView = this.ivFlash;
        if (imageView != null) {
            if (this.setMax) {
                drawable = cancelAll.getMin(getContext(), R.drawable.bg_circle_white_transparent);
            } else {
                drawable = cancelAll.getMin(getContext(), R.drawable.bg_circle_transparent);
            }
            imageView.setBackground(drawable);
            this.ivFlash.setImageResource(this.setMax ? R.drawable.ic_flash_pay_active : R.drawable.ic_flash_pay);
        }
    }
}
