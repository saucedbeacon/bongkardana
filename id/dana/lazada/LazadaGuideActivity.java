package id.dana.lazada;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import com.alipay.plus.android.push.fcm.UtdidDeviceIdProvider;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.LazadaModule;
import id.dana.lazada.tncagreement.LazadaTermsAndConditionActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.GriverRVExecutorServiceImpl;
import o.GriverSessionDataExtension;
import o.PluginStore;
import o.PrepareException;
import o.ResourceLoadExtension;
import o.TrackerExtension;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.setPublishStatus;
import o.startBeaconDiscovery;
import o.stopIgnoring;

public class LazadaGuideActivity extends BaseActivity {
    private static final int getMax = CornerMarkingDataProvider.AnonymousClass2.setMax();
    public static final int getMin = 246;
    public static final byte[] setMax = {Ascii.DLE, -34, -95, -3, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private GriverRVExecutorServiceImpl isInside;
    @Inject
    public GriverSessionDataExtension.setMax lazadaPresenter;
    @BindView(2131364449)
    View rootLayout;
    private ResourceLoadExtension.AnonymousClass3 toFloatRange;
    private setPublishStatus toIntRange;
    @BindView(2131365314)
    TextView tvLazadaTitle;
    @BindView(2131365631)
    TextView tvTermsAndConditions;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(short r6, byte r7, short r8) {
        /*
            byte[] r0 = setMax
            int r6 = r6 * 175
            int r6 = 178 - r6
            int r8 = r8 * 165
            int r8 = r8 + 11
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0036
        L_0x001b:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x001f:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L_0x002c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002c:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0036:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lazada.LazadaGuideActivity.getMax(short, byte, short):java.lang.String");
    }

    public void configToolbar() {
    }

    public int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_lazada;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(-1758316698, oncanceled);
        onCancelLoad.getMin(-1758316698, oncanceled);
        return R.layout.activity_lazada;
    }

    static /* synthetic */ void access$200(LazadaGuideActivity lazadaGuideActivity, String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1803461252, oncanceled);
            onCancelLoad.getMin(-1803461252, oncanceled);
        }
        lazadaGuideActivity.showWarningDialog(str, new TrackerExtension(lazadaGuideActivity));
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, LazadaGuideActivity.class);
    }

    public static PendingIntent createPendingIntent(Context context) {
        return PendingIntent.getActivity(context, 0, createIntent(context).setFlags(603979776), 268435456);
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMax;
        String max = getMax((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = setMax;
        String max2 = getMax((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1393884292, oncanceled);
            onCancelLoad.getMin(1393884292, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1393884292, oncanceled2);
            onCancelLoad.getMin(1393884292, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1393884292, oncanceled3);
            onCancelLoad.getMin(1393884292, oncanceled3);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        startBeaconDiscovery.length(this);
        View view = this.rootLayout;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onPause() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2029191686, oncanceled);
            onCancelLoad.getMin(-2029191686, oncanceled);
        }
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @OnClick({2131362122})
    public void refuseRegisterLazada() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(491761085, oncanceled);
            onCancelLoad.getMin(491761085, oncanceled);
        }
        Boolean bool = Boolean.FALSE;
        convertDipToPx.length length = new convertDipToPx.length(this);
        length.getMax = TrackerKey.Event.HOME_POP_UP_ACTION;
        convertDipToPx.length min = length.setMin(TrackerKey.Property.IS_CONFIRM, bool.booleanValue());
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        finish();
    }

    @OnClick({2131362049})
    public void agreeRegisterLazada() {
        Boolean bool = Boolean.TRUE;
        convertDipToPx.length length = new convertDipToPx.length(this);
        length.getMax = TrackerKey.Event.HOME_POP_UP_ACTION;
        convertDipToPx.length min = length.setMin(TrackerKey.Property.IS_CONFIRM, bool.booleanValue());
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        this.lazadaPresenter.length();
        GriverRVExecutorServiceImpl griverRVExecutorServiceImpl = this.isInside;
        if (griverRVExecutorServiceImpl != null) {
            DanaH5.startContainerFullUrl(griverRVExecutorServiceImpl.getRedirectUrl());
            finish();
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-345712307, oncanceled);
            onCancelLoad.getMin(-345712307, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (setMin(i, intent)) {
            this.lazadaPresenter.length();
            GriverRVExecutorServiceImpl griverRVExecutorServiceImpl = this.isInside;
            if (griverRVExecutorServiceImpl != null) {
                DanaH5.startContainerFullUrl(griverRVExecutorServiceImpl.getRedirectUrl());
                finish();
            }
        }
    }

    public void showDanaLoadingDialog() {
        setPublishStatus setpublishstatus = new setPublishStatus(this);
        this.toIntRange = setpublishstatus;
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public void dismissDanaLoadingDialog() {
        setPublishStatus setpublishstatus = this.toIntRange;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
    }

    private boolean setMin(int i, Intent intent) {
        int min;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1273506390, oncanceled);
            onCancelLoad.getMin(-1273506390, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1273506390, oncanceled2);
            onCancelLoad.getMin(-1273506390, oncanceled2);
        }
        return intent != null && getMax == i && intent.getBooleanExtra(LazadaTermsAndConditionActivity.LAZADA_TNC_ACTION_RESULT, false);
    }

    public void init() {
        int max;
        Context context = null;
        if (this.toFloatRange == null) {
            PluginStore.setMax setmax = new PluginStore.setMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                setmax.getMin = applicationComponent;
                setmax.getMax = new LazadaModule(new GriverSessionDataExtension.length() {
                    public final void onError(String str) {
                    }

                    public final void setMax(boolean z) {
                        LazadaGuideActivity.access$000(LazadaGuideActivity.this, z);
                    }

                    public final void setMax(GriverRVExecutorServiceImpl griverRVExecutorServiceImpl) {
                        LazadaGuideActivity.access$100(LazadaGuideActivity.this, griverRVExecutorServiceImpl);
                    }

                    public final void setMin(String str) {
                        LazadaGuideActivity.access$200(LazadaGuideActivity.this, str);
                    }

                    public final void showProgress() {
                        LazadaGuideActivity.this.showDanaLoadingDialog();
                    }

                    public final void dismissProgress() {
                        LazadaGuideActivity.this.dismissDanaLoadingDialog();
                    }
                });
                stopIgnoring.setMin(setmax.getMax, LazadaModule.class);
                stopIgnoring.setMin(setmax.getMin, PrepareException.AnonymousClass1.class);
                this.toFloatRange = new PluginStore(setmax.getMax, setmax.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.toFloatRange.getMax(this);
        String string = getString(R.string.lazada_desc);
        String string2 = getString(R.string.lazada_desc_item_click);
        int indexOf = string.indexOf(string2);
        if (indexOf != -1) {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                context = baseContext.getApplicationContext();
            }
            if (!(context == null || -280021383 == (max = dispatchOnCancelled.getMax(context, -280021383)))) {
                onCanceled oncanceled = new onCanceled(-280021383, max, 512);
                onCancelLoad.setMax(-280021383, oncanceled);
                onCancelLoad.getMin(-280021383, oncanceled);
            }
            AnonymousClass2 r1 = new ClickableSpan() {
                public final void onClick(@NonNull View view) {
                    LazadaGuideActivity.this.startActivityForResult(LazadaTermsAndConditionActivity.returnAgreeToTncResult(LazadaGuideActivity.this), LazadaGuideActivity.getMax);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            };
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(r1, indexOf, string2.length() + indexOf, 33);
            spannableString.setSpan(new ForegroundColorSpan(-15692055), indexOf, string2.length() + indexOf, 33);
            spannableString.setSpan(new StyleSpan(1), indexOf, string2.length() + indexOf, 33);
            this.tvTermsAndConditions.setText(spannableString);
            this.tvTermsAndConditions.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(507783170, oncanceled2);
            onCancelLoad.getMin(507783170, oncanceled2);
        }
        this.lazadaPresenter.getMax(UtdidDeviceIdProvider.getDeviceId(getApplication()), "lazada");
    }

    static /* synthetic */ void access$000(LazadaGuideActivity lazadaGuideActivity, boolean z) {
        if (z) {
            GriverRVExecutorServiceImpl griverRVExecutorServiceImpl = lazadaGuideActivity.isInside;
            if (griverRVExecutorServiceImpl != null) {
                DanaH5.startContainerFullUrl(griverRVExecutorServiceImpl.getRedirectUrl());
                lazadaGuideActivity.finish();
                return;
            }
            return;
        }
        View view = lazadaGuideActivity.rootLayout;
        if (view != null) {
            view.setVisibility(0);
            convertDipToPx.length length = new convertDipToPx.length(lazadaGuideActivity);
            length.getMax = TrackerKey.Event.HOME_POP_UP_OPEN;
            convertDipToPx.length max = length.setMax("Purpose", "Lazada Registration");
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
    }

    static /* synthetic */ void access$100(LazadaGuideActivity lazadaGuideActivity, GriverRVExecutorServiceImpl griverRVExecutorServiceImpl) {
        lazadaGuideActivity.isInside = griverRVExecutorServiceImpl;
        if (griverRVExecutorServiceImpl != null && lazadaGuideActivity.tvLazadaTitle != null) {
            if (griverRVExecutorServiceImpl != null) {
                String userConsentMessage = griverRVExecutorServiceImpl.getUserConsentMessage();
                if (!TextUtils.isEmpty(userConsentMessage)) {
                    lazadaGuideActivity.tvLazadaTitle.setText(userConsentMessage);
                }
            }
            lazadaGuideActivity.lazadaPresenter.getMin();
        }
    }
}
