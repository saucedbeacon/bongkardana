package id.dana.playstorereview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.playstorereview.PlayStoreReviewActionKey;
import java.util.Random;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.MainResourcePackage;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.openDocument;
import o.registerOnLoadCanceledListener;
import o.setActionOn;
import o.startBeaconDiscovery;
import o.stopIgnoring;

public class PlayStoreReviewActivity extends BaseActivity {
    public static final int getMax = 39;
    public static final byte[] getMin = {8, Ascii.SUB, 22, -122, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private static final long setMax = System.currentTimeMillis();
    @BindView(2131362420)
    ConstraintLayout clDialog;
    @BindView(2131363988)
    ConstraintLayout clMainRoot;
    @Inject
    public PdfImageSource.setMin presenter;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 175
            int r6 = 178 - r6
            int r8 = r8 * 165
            int r8 = r8 + 11
            int r7 = r7 * 45
            int r7 = r7 + 56
            byte[] r0 = getMin
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0035
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0029:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L_0x0035:
            int r8 = r8 + r6
            int r6 = r8 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.playstorereview.PlayStoreReviewActivity.length(byte, int, byte):java.lang.String");
    }

    public void configToolbar() {
    }

    public int getLayout() {
        return R.layout.activity_play_store_review;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte b = (byte) getMin[85];
        byte b2 = (byte) b;
        String length3 = length(b, b2, (byte) b2);
        byte b3 = (byte) getMin[8];
        byte b4 = (byte) b3;
        String length4 = length(b3, b4, (byte) b4);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(1649495390, oncanceled);
            onCancelLoad.getMin(1649495390, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1649495390, oncanceled2);
            onCancelLoad.getMin(1649495390, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1649495390, oncanceled3);
            onCancelLoad.getMin(1649495390, oncanceled3);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (!CornerMarkingDataProvider.length() || !setMax()) {
            this.clMainRoot.setVisibility(0);
        } else {
            openDocument opendocument = new openDocument(this, new openDocument.setMin() {
            });
            opendocument.getMin.requestReviewFlow().addOnCompleteListener(new openDocument.getMin(opendocument));
            this.presenter.length(PlayStoreReviewActionKey.OPEN, System.currentTimeMillis(), setMax);
        }
        startBeaconDiscovery.length(this);
    }

    public void onPause() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1123908248, oncanceled);
            onCancelLoad.getMin(1123908248, oncanceled);
        }
        overridePendingTransition(0, 0);
        super.onPause();
    }

    public void onBackPressed() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-863003205, oncanceled);
            onCancelLoad.getMin(-863003205, oncanceled);
        }
        btnPlayStoreReviewNoClicked();
    }

    private boolean setMax() {
        return getIntent().getBooleanExtra("in_app_review", false);
    }

    public void init() {
        MainResourcePackage.AnonymousClass3.getMin getmin = new MainResourcePackage.AnonymousClass3.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.getMax = applicationComponent;
            getmin.getMin = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(this));
            stopIgnoring.setMin(getmin.getMin, PlayStoreReviewModules.class);
            stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
            new MainResourcePackage.AnonymousClass3(getmin.getMin, getmin.getMax, (byte) 0).setMax(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362111})
    public void btnPlayStoreReviewYesClicked() {
        Intent intent;
        if (setActionOn.getMax(this)) {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(getPackageName());
            intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder("http://play.google.com/store/apps/details?id=");
            sb2.append(getApplicationContext().getPackageName());
            intent = new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString()));
        }
        startActivity(intent);
        this.presenter.length(PlayStoreReviewActionKey.OPEN, System.currentTimeMillis(), setMax);
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362110})
    public void btnPlayStoreReviewNoClicked() {
        this.presenter.length(PlayStoreReviewActionKey.SKIP, System.currentTimeMillis(), setMax);
    }
}
