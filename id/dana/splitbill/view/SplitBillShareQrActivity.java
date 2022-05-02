package id.dana.splitbill.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.SplitBillShareQRModule;
import id.dana.richview.QRView;
import id.dana.sendmoney.model.ShareQRSplitBillModel;
import javax.inject.Inject;
import o.AUTextView;
import o.BottomPopup;
import o.InputBridgeExtension;
import o.PopManager;
import o.PrepareException;
import o.Timer;
import o.WheelView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setApTextSize;
import o.setContentDescription;
import o.setContentViewBefore;
import o.startStructure;
import o.stopIgnoring;

public class SplitBillShareQrActivity extends BaseActivity implements PopManager.length {
    private String getMax;
    private String getMin;
    @BindView(2131363403)
    ImageView ivDanaLogo;
    @Inject
    public PopManager.getMax presenter;
    @BindView(2131364307)
    QRView qrView;
    private startStructure setMax;
    @BindView(2131365372)
    TextView tvNickname;
    @BindView(2131365442)
    TextView tvPhoneNumber;
    @BindView(2131365513)
    TextView tvRemarks;

    public void configToolbar() {
    }

    public int getLayout() {
        return R.layout.activity_share_qr_split_bill;
    }

    public static Intent createIntent(BaseActivity baseActivity, ShareQRSplitBillModel shareQRSplitBillModel) {
        Intent intent = new Intent(baseActivity, SplitBillShareQrActivity.class);
        intent.putExtra("data", shareQRSplitBillModel);
        return intent;
    }

    public void init() {
        ShareQRSplitBillModel shareQRSplitBillModel;
        setContentViewBefore.setMin(this);
        QRView qRView = this.qrView;
        if (!(qRView == null || this.ivDanaLogo == null)) {
            qRView.showSkeleton();
            this.ivDanaLogo.setVisibility(8);
        }
        if (this.setMax == null) {
            Timer.getMin getmin = new Timer.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.setMin = applicationComponent;
                getmin.length = new SplitBillShareQRModule(this);
                stopIgnoring.setMin(getmin.length, SplitBillShareQRModule.class);
                stopIgnoring.setMin(getmin.setMin, PrepareException.AnonymousClass1.class);
                this.setMax = new Timer(getmin.length, getmin.setMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMax.getMax(this);
        Intent intent = getIntent();
        if (!(intent == null || (shareQRSplitBillModel = (ShareQRSplitBillModel) intent.getParcelableExtra("data")) == null)) {
            this.getMin = shareQRSplitBillModel.getMax;
            this.getMax = shareQRSplitBillModel.setMin;
        }
        if (TextUtils.isEmpty(this.getMax)) {
            setMax();
        }
        this.presenter.setMin();
    }

    public void onFinishGetHomeInfo(InputBridgeExtension inputBridgeExtension) {
        String str;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(278291657, oncanceled);
            onCancelLoad.getMin(278291657, oncanceled);
        }
        if (inputBridgeExtension == null) {
            setMax();
            return;
        }
        QRView qRView = this.qrView;
        if (!(qRView == null || this.ivDanaLogo == null)) {
            qRView.hideSkeleton();
            this.ivDanaLogo.setVisibility(0);
        }
        String str2 = inputBridgeExtension.setMin;
        if (this.tvNickname != null && !TextUtils.isEmpty(str2)) {
            this.tvNickname.setText(str2);
        }
        String min = WheelView.ScrollerTask.AnonymousClass2.getMin(inputBridgeExtension.getMax, false);
        if (this.tvPhoneNumber != null && !TextUtils.isEmpty(min)) {
            this.tvPhoneNumber.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(min, false));
        }
        this.qrView.displayUserAvatar(inputBridgeExtension.getMin);
        this.qrView.setKycView(inputBridgeExtension.toIntRange.getMax);
        addDisposable(BottomPopup.getMin(this.getMax).subscribe(new AUTextView(this), new setContentDescription(this)));
        String str3 = this.getMin;
        TextView textView = this.tvRemarks;
        if (textView != null) {
            if (TextUtils.isEmpty(str3)) {
                str = "";
            } else {
                str = String.format("\"%s\"", new Object[]{str3});
            }
            textView.setText(str);
        }
    }

    @OnClick({2131363900})
    public void onClose() {
        finish();
    }

    private void setMax() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1022975269, oncanceled);
            onCancelLoad.getMin(-1022975269, oncanceled);
        }
        showWarningDialog(getString(R.string.general_error_msg), new setApTextSize(this));
    }
}
