package id.dana.myprofile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.myprofile.ShareQrDialog;
import id.dana.richview.QRView;
import java.io.File;
import o.BottomPopup;
import o.ConfirmPopup;
import o.RedDotManager;
import o.SubPackageBridgeExtension;
import o.dispatchOnCancelled;
import o.getLineColor;
import o.onCancelLoad;
import o.onCanceled;
import o.setContentViewBefore;
import o.setStateOn;

public class ShareQrDialog extends BaseActivity {
    public static final String AVATAR_URL = "AVATAR_URI";
    public static final String KYC_STATUS = "KYC_STATUS";
    public static final String QR_CODE = "QR_CODE";
    public static final String USER_ID = "USER_ID";
    @BindView(2131362184)
    Button buttonShare;
    private setStateOn getMax;
    @BindView(2131362670)
    ImageView ivDanaLogo;
    @BindView(2131364718)
    LinearLayout layoutFooter;
    @BindView(2131363753)
    QRView layoutQr;
    @BindView(2131364181)
    NestedScrollView nsvStaticQr;
    @BindView(2131364363)
    TextView tvNote;
    @BindView(2131365974)
    TextView tvQrTitle;
    @BindView(2131365657)
    TextView tvUserIDStatic;

    public void configToolbar() {
    }

    public int getLayout() {
        return R.layout.activity_share_static_qr;
    }

    static /* synthetic */ void access$000(ShareQrDialog shareQrDialog) {
        int length;
        Context baseContext = shareQrDialog.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1401715592, oncanceled);
            onCancelLoad.getMin(-1401715592, oncanceled);
        }
        try {
            Intent max = getLineColor.setMax(FileProvider.getUriForFile(shareQrDialog.getApplicationContext(), "id.dana.provider", shareQrDialog.getStaticQrCode()));
            Intent createChooser = Intent.createChooser(max, shareQrDialog.getString(R.string.share_via));
            if (max.resolveActivity(shareQrDialog.getPackageManager()) != null) {
                shareQrDialog.startActivity(createChooser);
            } else {
                shareQrDialog.getMin();
            }
        } catch (IllegalArgumentException unused) {
            shareQrDialog.getMin();
        } catch (Exception unused2) {
            shareQrDialog.getMin();
        }
    }

    public File getStaticQrCode() {
        this.layoutFooter.setVisibility(0);
        this.buttonShare.setVisibility(8);
        this.ivDanaLogo.setImageResource(R.drawable.ic_info);
        View childAt = this.nsvStaticQr.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int height = childAt.getHeight() + layoutParams.bottomMargin + layoutParams.topMargin;
        NestedScrollView nestedScrollView = this.nsvStaticQr;
        Bitmap max = ConfirmPopup.AnonymousClass2.getMax(nestedScrollView, nestedScrollView.getWidth(), height);
        this.buttonShare.setVisibility(0);
        this.layoutFooter.setVisibility(8);
        this.ivDanaLogo.setImageResource(R.drawable.dana_logo_blue);
        return ConfirmPopup.AnonymousClass2.getMin(getApplicationContext(), "shareqr", max);
    }

    private void getMin() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-262409514, oncanceled);
            onCancelLoad.getMin(-262409514, oncanceled);
        }
        Toast.makeText(this, getString(R.string.share_qr_failed), 0).show();
    }

    @OnClick({2131362184})
    public void onShareButtonClick(View view) {
        this.getMax.setMin();
    }

    @OnClick({2131362454})
    public void onParentClick(View view) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1067889902 == (max = dispatchOnCancelled.getMax(applicationContext, 1067889902)))) {
            onCanceled oncanceled = new onCanceled(1067889902, max, 512);
            onCancelLoad.setMax(1067889902, oncanceled);
            onCancelLoad.getMin(1067889902, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1067889902, oncanceled2);
            onCancelLoad.getMin(1067889902, oncanceled2);
        }
        finish();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.getMax;
        if (setstateon == null || !setstateon.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void init() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1263432299, oncanceled);
            onCancelLoad.getMin(1263432299, oncanceled);
        }
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) this);
        getmin.length.add("android.permission.WRITE_EXTERNAL_STORAGE");
        getmin.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                ShareQrDialog.access$000(ShareQrDialog.this);
            }
        };
        this.getMax = new setStateOn(getmin, (byte) 0);
        setContentViewBefore.setMin(this);
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-494726682, oncanceled2);
            onCancelLoad.getMin(-494726682, oncanceled2);
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("USER_ID");
            String stringExtra2 = intent.getStringExtra("QR_CODE");
            String stringExtra3 = intent.getStringExtra(KYC_STATUS);
            String stringExtra4 = intent.getStringExtra(AVATAR_URL);
            this.tvUserIDStatic.setText(stringExtra);
            this.layoutQr.setKycView(stringExtra3);
            this.layoutQr.displayUserAvatar(stringExtra4);
            int max3 = dispatchOnCancelled.getMax(0);
            if (max3 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max3, 16);
                onCancelLoad.setMax(-335102476, oncanceled3);
                onCancelLoad.getMin(-335102476, oncanceled3);
            }
            this.layoutQr.showSkeleton();
            addDisposable(BottomPopup.getMin(stringExtra2).subscribe(new RedDotManager(this) {
                private final ShareQrDialog length;

                {
                    this.length = r1;
                }

                public final void accept(Object obj) {
                    ShareQrDialog.setMax(this.length, (Bitmap) obj);
                }
            }, new SubPackageBridgeExtension.ResultDispatchFuture(this)));
        }
    }

    public static /* synthetic */ void setMax(ShareQrDialog shareQrDialog, Bitmap bitmap) {
        shareQrDialog.layoutQr.hideSkeleton();
        shareQrDialog.layoutQr.getQrImageView().setImageBitmap(bitmap);
    }

    public static /* synthetic */ void getMin(ShareQrDialog shareQrDialog) {
        shareQrDialog.layoutQr.hideSkeleton();
        shareQrDialog.layoutQr.getQrImageView().setImageBitmap((Bitmap) null);
    }
}
