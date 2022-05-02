package id.dana.ipg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.DanaH5;
import id.dana.ipg.tncagreement.IpgTermsAndConditionActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.GriverNetworkPermissionExtensionImpl;
import o.IntRange;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.onAnimationStart;
import o.onAppear;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setPublishStatus;
import o.setWorkSpaceId;
import o.startBeaconDiscovery;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0010J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\"\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020&H\u0002J\u0012\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0010H\u0014J\u0012\u00102\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u00103\u001a\u00020\u0010H\u0002J\b\u00104\u001a\u00020\u0010H\u0007J\b\u00105\u001a\u00020\u0010H\u0002J\u0012\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u00108\u001a\u00020\u0010H\u0002J\u0006\u00109\u001a\u00020\u0010J\b\u0010:\u001a\u00020\u0010H\u0002J\b\u0010;\u001a\u00020\u0010H\u0002J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020&H\u0002J\b\u0010>\u001a\u00020\u0010H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/ipg/IpgGuideActivity;", "Lid/dana/base/BaseActivity;", "()V", "INTERSTITIAL_TNC_REQUEST_CODE", "", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "ipgPresenter", "Lid/dana/ipg/IpgGuideContract$Presenter;", "getIpgPresenter", "()Lid/dana/ipg/IpgGuideContract$Presenter;", "setIpgPresenter", "(Lid/dana/ipg/IpgGuideContract$Presenter;)V", "ipgRegistrationUrl", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "agreeRegisterIpg", "", "checkIfMandatoryFieldIsNull", "configToolbar", "createNoUnderLineClickableSpan", "Landroid/text/style/ClickableSpan;", "decideTitleLocale", "", "payload", "Lid/dana/contract/deeplink/path/IpgRegistrationPayload;", "dismissDanaLoadingDialog", "getIpgRegistrationUrl", "getLayout", "goIpgRegister", "goTermsAndConditionsActivity", "hideConsentDialogView", "init", "initComponent", "initGetExtras", "initIconImage", "initTitle", "initTnc", "isUserAgreedToTnc", "", "requestCode", "data", "Landroid/content/Intent;", "onActivityResult", "resultCode", "onCheckHasAgreedBefore", "hasAgreedToTncBefore", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onSuccessGetRedirectUrl", "onUserAgreeToTnc", "refuseRegisterIpg", "setDefaultValueForOptionalField", "setTvIpgTitle", "ipgRegistrationURLResponse", "showConsentDialogView", "showDanaLoadingDialog", "showErrorToast", "showWarningDialogForFailGetRedirectUrl", "trackConsentDialogAction", "isConfirm", "trackConsentDialogOpen", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IpgGuideActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String PAYLOAD_INTENT_KEY = "ipg_payload_intent_key";
    public static final byte[] getMax = {0, Byte.MIN_VALUE, 41, 75, 52, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = 234;
    private setPublishStatus equals;
    private final int getMin = CornerMarkingDataProvider.AnonymousClass2.setMax();
    @Inject
    public GriverNetworkPermissionExtensionImpl.length ipgPresenter;
    private setWorkSpaceId toFloatRange;
    private HashMap toIntRange;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 175
            int r7 = r7 + 5
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r0 = getMax
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r8
            goto L_0x0037
        L_0x001c:
            r3 = 0
            r5 = r8
            r8 = r7
        L_0x001f:
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002b:
            int r3 = r3 + 1
            byte r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L_0x0037:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r0 + 1
            int r8 = r8 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.ipg.IpgGuideActivity.setMax(int, byte, short):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1646504098, oncanceled);
            onCancelLoad.getMin(1646504098, oncanceled);
        }
    }

    public final int getLayout() {
        return R.layout.activity_ipg;
    }

    public static final /* synthetic */ void access$showWarningDialogForFailGetRedirectUrl(IpgGuideActivity ipgGuideActivity) {
        int length2;
        int min;
        int length3;
        Context baseContext = ipgGuideActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-977324380, oncanceled);
            onCancelLoad.getMin(-977324380, oncanceled);
        }
        Context baseContext2 = ipgGuideActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-977324380, oncanceled2);
            onCancelLoad.getMin(-977324380, oncanceled2);
        }
        Toast.makeText(ipgGuideActivity, ipgGuideActivity.getString(R.string.general_error_msg), 0).show();
        ipgGuideActivity.finish();
    }

    @NotNull
    public final GriverNetworkPermissionExtensionImpl.length getIpgPresenter() {
        GriverNetworkPermissionExtensionImpl.length length2 = this.ipgPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
        }
        return length2;
    }

    public final void setIpgPresenter(@NotNull GriverNetworkPermissionExtensionImpl.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.ipgPresenter = length2;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        String max2 = setMax((byte) bArr[97], (byte) bArr[0], (byte) bArr[97]);
        byte[] bArr2 = getMax;
        String max3 = setMax((byte) bArr2[0], (byte) bArr2[97], (byte) bArr2[0]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-999202008, oncanceled);
            onCancelLoad.getMin(-999202008, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -999202008 == (max = dispatchOnCancelled.getMax(applicationContext2, -999202008)))) {
            onCanceled oncanceled2 = new onCanceled(-999202008, max, 512);
            onCancelLoad.setMax(-999202008, oncanceled2);
            onCancelLoad.getMin(-999202008, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-999202008, oncanceled3);
            onCancelLoad.getMin(-999202008, oncanceled3);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        startBeaconDiscovery.length(this);
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.dispatchPopulateAccessibilityEvent);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    private final void getMax() {
        GriverNetworkPermissionExtensionImpl.length length2 = this.ipgPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
        }
        onAnimationStart min = length2.setMin();
        GriverNetworkPermissionExtensionImpl.length length3 = this.ipgPresenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
        }
        String str = null;
        String userConsentConfigKey = min != null ? min.getUserConsentConfigKey() : null;
        String str2 = "";
        if (userConsentConfigKey == null) {
            userConsentConfigKey = str2;
        }
        if (min != null) {
            str = min.getUserConsentSyncKey();
        }
        if (str != null) {
            str2 = str;
        }
        length3.length(userConsentConfigKey, str2);
        getMin();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1332162783, oncanceled);
            onCancelLoad.getMin(-1332162783, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (length(i, intent)) {
            getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"id/dana/ipg/IpgGuideActivity$initComponent$component$1", "Lid/dana/ipg/IpgGuideContract$View;", "dismissProgress", "", "onCheckHasAgreedToTncBefore", "hasAgreedToTncBefore", "", "onError", "errorMessage", "", "onFailGetRedirectUrlForIpgRegistration", "onGetRedirectUrlForIpgRegistration", "ipgRegistrationUrl", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "onSaveAgreeToTnc", "success", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements GriverNetworkPermissionExtensionImpl.setMin {
        final /* synthetic */ IpgGuideActivity getMax;

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        getMin(IpgGuideActivity ipgGuideActivity) {
            this.getMax = ipgGuideActivity;
        }

        public final void length(boolean z) {
            IpgGuideActivity.access$onCheckHasAgreedBefore(this.getMax, z);
        }

        public final void getMin(@NotNull setWorkSpaceId setworkspaceid) {
            Intrinsics.checkNotNullParameter(setworkspaceid, "ipgRegistrationUrl");
            IpgGuideActivity.access$onSuccessGetRedirectUrl(this.getMax, setworkspaceid);
        }

        public final void getMin() {
            IpgGuideActivity.access$showWarningDialogForFailGetRedirectUrl(this.getMax);
        }

        public final void showProgress() {
            this.getMax.showDanaLoadingDialog();
        }

        public final void dismissProgress() {
            this.getMax.dismissDanaLoadingDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/ipg/IpgGuideActivity$createNoUnderLineClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends ClickableSpan {
        final /* synthetic */ IpgGuideActivity length;

        getMax(IpgGuideActivity ipgGuideActivity) {
            this.length = ipgGuideActivity;
        }

        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "widget");
            IpgGuideActivity.access$goTermsAndConditionsActivity(this.length);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }
    }

    private final void getMin() {
        String redirectUrl;
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(107179630, oncanceled);
            onCancelLoad.getMin(107179630, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(107179630, oncanceled2);
            onCancelLoad.getMin(107179630, oncanceled2);
        }
        setWorkSpaceId setworkspaceid = this.toFloatRange;
        if (setworkspaceid != null && (redirectUrl = setworkspaceid.getRedirectUrl()) != null) {
            DanaH5.startContainerFullUrl(redirectUrl);
            finish();
        }
    }

    public final void showDanaLoadingDialog() {
        setPublishStatus setpublishstatus = new setPublishStatus(this);
        this.equals = setpublishstatus;
        if (setpublishstatus != null && !setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public final void dismissDanaLoadingDialog() {
        setPublishStatus setpublishstatus = this.equals;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
    }

    private final boolean length(int i, Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-996787202, oncanceled);
            onCancelLoad.getMin(-996787202, oncanceled);
        }
        return intent != null && this.getMin == i && intent.getBooleanExtra(IpgTermsAndConditionActivity.IPG_TNC_ACTION_RESULT, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/ipg/IpgGuideActivity$Companion;", "", "()V", "DEFAULT_LANGUAGE_CODE", "", "PAYLOAD_INTENT_KEY", "PENDING_INTENT_REQUEST_CODE", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "payload", "Lid/dana/contract/deeplink/path/IpgRegistrationPayload;", "createPendingIntent", "Landroid/app/PendingIntent;", "startActivityIpg", "", "params", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        public static boolean setMin(@NotNull Context context, @NotNull Map<String, String> map) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(map, "params");
            onAppear.setMin setmin = onAppear.setMin;
            Intrinsics.checkNotNullParameter(map, "map");
            String str8 = map.get("path");
            String str9 = str8 == null ? "" : str8;
            String str10 = map.get("action");
            if (str10 == null) {
                str = "";
            } else {
                str = str10;
            }
            String str11 = map.get("bizType");
            if (str11 == null) {
                str2 = "";
            } else {
                str2 = str11;
            }
            String str12 = map.get("logo");
            if (str12 == null) {
                str3 = "";
            } else {
                str3 = str12;
            }
            String str13 = map.get("idTitle");
            if (str13 == null) {
                str4 = "";
            } else {
                str4 = str13;
            }
            String str14 = map.get("enTitle");
            if (str14 == null) {
                str5 = "";
            } else {
                str5 = str14;
            }
            String str15 = map.get("tnc");
            if (str15 == null) {
                str6 = "";
            } else {
                str6 = str15;
            }
            String str16 = map.get("userConsentConfigKey");
            if (str16 == null) {
                str7 = "";
            } else {
                str7 = str16;
            }
            String str17 = map.get("userConsentSyncKey");
            if (str17 == null) {
                str17 = "";
            }
            onAnimationStart onanimationstart = new onAnimationStart(str9, str, str2, str3, str4, str5, str6, str7, str17);
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(onanimationstart, "payload");
            Intent putExtra = new Intent(context, IpgGuideActivity.class).putExtra(IpgGuideActivity.PAYLOAD_INTENT_KEY, onanimationstart);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, IpgGuide… payload as Serializable)");
            IntRange.setMin(context, putExtra, (Bundle) null);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r13 = this;
            o.isHomePage$length r0 = new o.isHomePage$length
            r1 = 0
            r0.<init>(r1)
            o.PrepareException$1 r2 = r13.getApplicationComponent()
            r3 = 0
            if (r2 == 0) goto L_0x0352
            o.PrepareException$1 r2 = (o.PrepareException.AnonymousClass1) r2
            r0.setMax = r2
            id.dana.di.modules.IpgModule r2 = new id.dana.di.modules.IpgModule
            id.dana.ipg.IpgGuideActivity$getMin r4 = new id.dana.ipg.IpgGuideActivity$getMin
            r4.<init>(r13)
            o.GriverNetworkPermissionExtensionImpl$setMin r4 = (o.GriverNetworkPermissionExtensionImpl.setMin) r4
            r2.<init>(r4)
            id.dana.di.modules.IpgModule r2 = (id.dana.di.modules.IpgModule) r2
            r0.getMax = r2
            id.dana.di.modules.IpgModule r2 = r0.getMax
            java.lang.Class<id.dana.di.modules.IpgModule> r4 = id.dana.di.modules.IpgModule.class
            o.stopIgnoring.setMin(r2, r4)
            o.PrepareException$1 r2 = r0.setMax
            java.lang.Class<o.PrepareException$1> r4 = o.PrepareException.AnonymousClass1.class
            o.stopIgnoring.setMin(r2, r4)
            o.isHomePage r2 = new o.isHomePage
            id.dana.di.modules.IpgModule r4 = r0.getMax
            o.PrepareException$1 r0 = r0.setMax
            r2.<init>(r4, r0, r1)
            r2.setMin(r13)
            android.content.Intent r0 = r13.getIntent()
            r2 = 2131887132(0x7f12041c, float:1.9408862E38)
            java.lang.String r4 = "ipgPresenter"
            if (r0 != 0) goto L_0x0057
            r0 = r13
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r5 = r13.getString(r2)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r5, r1)
            r0.show()
            goto L_0x006f
        L_0x0057:
            o.GriverNetworkPermissionExtensionImpl$length r0 = r13.ipgPresenter
            if (r0 != 0) goto L_0x005e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x005e:
            android.content.Intent r5 = r13.getIntent()
            java.lang.String r6 = "ipg_payload_intent_key"
            java.io.Serializable r5 = r5.getSerializableExtra(r6)
            if (r5 == 0) goto L_0x034a
            o.onAnimationStart r5 = (o.onAnimationStart) r5
            r0.setMin(r5)
        L_0x006f:
            o.GriverNetworkPermissionExtensionImpl$length r0 = r13.ipgPresenter
            if (r0 != 0) goto L_0x0076
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0076:
            o.onAnimationStart r0 = r0.setMin()
            r5 = 1
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r0.getBizType()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008b
            r0 = 1
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x00a1
            r0 = r13
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r2 = r13.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            r13.finish()
        L_0x00a1:
            android.content.Context r0 = r13.getBaseContext()
            if (r0 == 0) goto L_0x00ac
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x00ad
        L_0x00ac:
            r0 = r3
        L_0x00ad:
            r2 = 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00c5
            r6 = -1340760736(0xffffffffb0159d60, float:-5.442953E-10)
            int r0 = o.dispatchOnCancelled.getMax(r0, r6)
            if (r6 == r0) goto L_0x00c5
            o.onCanceled r7 = new o.onCanceled
            r7.<init>(r6, r0, r2)
            o.onCancelLoad.setMax(r6, r7)
            o.onCancelLoad.getMin(r6, r7)
        L_0x00c5:
            o.GriverNetworkPermissionExtensionImpl$length r0 = r13.ipgPresenter
            if (r0 != 0) goto L_0x00cc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00cc:
            o.onAnimationStart r0 = r0.setMin()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r6 = r0.getIdTitle()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00e0
            r6 = 1
            goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            java.lang.String r7 = "getString(R.string.id_ti…e_default_value, bizType)"
            r8 = 2131887576(0x7f1205d8, float:1.9409763E38)
            if (r6 == 0) goto L_0x00fa
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r9 = r0.getBizType()
            r6[r1] = r9
            java.lang.String r6 = r13.getString(r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.setIdTitle(r6)
        L_0x00fa:
            java.lang.String r6 = r0.getEnTitle()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0108
            r6 = 1
            goto L_0x0109
        L_0x0108:
            r6 = 0
        L_0x0109:
            if (r6 == 0) goto L_0x011d
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r9 = r0.getBizType()
            r6[r1] = r9
            java.lang.String r6 = r13.getString(r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.setEnTitle(r6)
        L_0x011d:
            java.lang.String r6 = r0.getTncUrl()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x012b
            r6 = 1
            goto L_0x012c
        L_0x012b:
            r6 = 0
        L_0x012c:
            if (r6 == 0) goto L_0x0145
            r6 = 2131889138(0x7f120bf2, float:1.9412931E38)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = r0.getBizType()
            r7[r1] = r8
            java.lang.String r6 = r13.getString(r6, r7)
            java.lang.String r7 = "getString(R.string.tnc_url_default_value, bizType)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.setTncUrl(r6)
        L_0x0145:
            java.lang.String r6 = r0.getUserConsentConfigKey()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0153
            r6 = 1
            goto L_0x0154
        L_0x0153:
            r6 = 0
        L_0x0154:
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            if (r6 == 0) goto L_0x0176
            kotlin.jvm.internal.StringCompanionObject r6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            o.GriverShouldLoadUrlExtension$2 r6 = o.GriverShouldLoadUrlExtension.AnonymousClass2.setMax
            java.lang.String r6 = o.GriverShouldLoadUrlExtension.AnonymousClass2.setMin()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r0.getBizType()
            r8[r1] = r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            java.lang.String r6 = java.lang.String.format(r6, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.setUserConsentConfigKey(r6)
        L_0x0176:
            java.lang.String r6 = r0.getUserConsentSyncKey()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0184
            r6 = 1
            goto L_0x0185
        L_0x0184:
            r6 = 0
        L_0x0185:
            if (r6 == 0) goto L_0x01a5
            kotlin.jvm.internal.StringCompanionObject r6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            o.GriverShouldLoadUrlExtension$2 r6 = o.GriverShouldLoadUrlExtension.AnonymousClass2.setMax
            java.lang.String r6 = o.GriverShouldLoadUrlExtension.AnonymousClass2.length()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r0.getBizType()
            r8[r1] = r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            java.lang.String r6 = java.lang.String.format(r6, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.setUserConsentSyncKey(r6)
        L_0x01a5:
            if (r0 == 0) goto L_0x01b1
            o.GriverNetworkPermissionExtensionImpl$length r6 = r13.ipgPresenter
            if (r6 != 0) goto L_0x01ae
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x01ae:
            r6.setMin(r0)
        L_0x01b1:
            android.content.Context r0 = r13.getBaseContext()
            if (r0 == 0) goto L_0x01bc
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x01bd
        L_0x01bc:
            r0 = r3
        L_0x01bd:
            if (r0 == 0) goto L_0x01d3
            r6 = 340854010(0x145104fa, float:1.0552785E-26)
            int r0 = o.dispatchOnCancelled.getMax(r0, r6)
            if (r6 == r0) goto L_0x01d3
            o.onCanceled r7 = new o.onCanceled
            r7.<init>(r6, r0, r2)
            o.onCancelLoad.setMax(r6, r7)
            o.onCancelLoad.getMin(r6, r7)
        L_0x01d3:
            r0 = 2131887642(0x7f12061a, float:1.9409897E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r2 = "getString(R.string.ipg_desc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r2 = 2131887643(0x7f12061b, float:1.9409899E38)
            java.lang.String r2 = r13.getString(r2)
            java.lang.String r6 = "getString(R.string.ipg_desc_item_click)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r0
            r7 = r2
            int r6 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r6, (java.lang.String) r7, (int) r8, (boolean) r9, (int) r10, (java.lang.Object) r11)
            r7 = -1
            r8 = 16
            if (r6 == r7) goto L_0x0269
            int r7 = o.dispatchOnCancelled.getMax(r1)
            if (r7 == 0) goto L_0x0210
            o.onCanceled r9 = new o.onCanceled
            r9.<init>(r1, r7, r8)
            r7 = 300674421(0x11ebed75, float:3.7222807E-28)
            o.onCancelLoad.setMax(r7, r9)
            o.onCancelLoad.getMin(r7, r9)
        L_0x0210:
            id.dana.ipg.IpgGuideActivity$getMax r7 = new id.dana.ipg.IpgGuideActivity$getMax
            r7.<init>(r13)
            android.text.style.ClickableSpan r7 = (android.text.style.ClickableSpan) r7
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            int r0 = o.resetInternal.setMax.CustomTabsService$Relation
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r10 = "tv_tnc"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
            int r11 = r2.length()
            int r11 = r11 + r6
            r12 = 33
            r9.setSpan(r7, r6, r11, r12)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            r11 = -15692055(0xffffffffff108ee9, float:-1.9215086E38)
            r7.<init>(r11)
            int r11 = r2.length()
            int r11 = r11 + r6
            r9.setSpan(r7, r6, r11, r12)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r7.<init>(r5)
            int r2 = r2.length()
            int r2 = r2 + r6
            r9.setSpan(r7, r6, r2, r12)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r0.setText(r9)
            int r0 = o.resetInternal.setMax.CustomTabsService$Relation
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r2)
        L_0x0269:
            o.GriverNetworkPermissionExtensionImpl$length r0 = r13.ipgPresenter
            if (r0 != 0) goto L_0x0270
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0270:
            o.onAnimationStart r0 = r0.setMin()
            int r2 = o.resetInternal.setMax.setOnInflateListener
            android.view.View r2 = r13._$_findCachedViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r5 = "tv_shopping_merchant_title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            android.content.res.Resources r5 = r13.getResources()
            java.lang.String r6 = "resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r6 = "resources.configuration.locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r5 = r5.getLanguage()
            java.lang.String r6 = "in"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x02a8
            if (r0 == 0) goto L_0x02af
            java.lang.String r0 = r0.getIdTitle()
            goto L_0x02b0
        L_0x02a8:
            if (r0 == 0) goto L_0x02af
            java.lang.String r0 = r0.getEnTitle()
            goto L_0x02b0
        L_0x02af:
            r0 = r3
        L_0x02b0:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            int r0 = o.dispatchOnCancelled.getMax(r1)
            if (r0 == 0) goto L_0x02c9
            o.onCanceled r2 = new o.onCanceled
            r2.<init>(r1, r0, r8)
            r0 = -375403851(0xffffffffe99fcab5, float:-2.4147058E25)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x02c9:
            o.GriverNetworkPermissionExtensionImpl$length r0 = r13.ipgPresenter
            if (r0 != 0) goto L_0x02d0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x02d0:
            o.onAnimationStart r0 = r0.setMin()
            o.dispatchApplyWindowInsetsToBehaviors r1 = new o.dispatchApplyWindowInsetsToBehaviors
            r1.<init>()
            android.content.res.Resources r2 = r13.getResources()
            r5 = 2131165347(0x7f0700a3, float:1.7944909E38)
            float r2 = r2.getDimension(r5)
            int r2 = (int) r2
            o.getTopSortedChildren r1 = r1.getMax((int) r2)
            o.dispatchApplyWindowInsetsToBehaviors r1 = (o.dispatchApplyWindowInsetsToBehaviors) r1
            r2 = 2131232791(0x7f080817, float:1.8081701E38)
            o.getTopSortedChildren r1 = r1.length((int) r2)
            o.dispatchApplyWindowInsetsToBehaviors r1 = (o.dispatchApplyWindowInsetsToBehaviors) r1
            o.getTopSortedChildren r1 = r1.getMin((int) r2)
            java.lang.String r2 = "RequestOptions()\n       …(R.drawable.white_circle)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.dispatchApplyWindowInsetsToBehaviors r1 = (o.dispatchApplyWindowInsetsToBehaviors) r1
            r2 = r13
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            o.setHorizontalGap r2 = com.bumptech.glide.Glide.setMin((androidx.fragment.app.FragmentActivity) r2)
            if (r0 == 0) goto L_0x030c
            java.lang.String r3 = r0.getLogo()
        L_0x030c:
            o.setFirstVerticalBias r0 = r2.getMax((java.lang.String) r3)
            o.getTopSortedChildren r1 = (o.getTopSortedChildren) r1
            o.setFirstVerticalBias r0 = r0.getMin((o.getTopSortedChildren<?>) r1)
            int r1 = o.resetInternal.setMax.CascadingMenuPopup$HorizPosition
            android.view.View r1 = r13._$_findCachedViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.length((android.widget.ImageView) r1)
            o.GriverNetworkPermissionExtensionImpl$length r0 = r13.ipgPresenter
            if (r0 != 0) goto L_0x0328
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0328:
            o.onAnimationStart r0 = r0.setMin()
            if (r0 == 0) goto L_0x0349
            o.GriverNetworkPermissionExtensionImpl$length r1 = r13.ipgPresenter
            if (r1 != 0) goto L_0x0335
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0335:
            android.app.Application r2 = r13.getApplication()
            java.lang.String r2 = com.alipay.plus.android.push.fcm.UtdidDeviceIdProvider.getDeviceId(r2)
            java.lang.String r3 = "UtdidDeviceIdProvider.getDeviceId(application)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r0 = r0.getBizType()
            r1.getMax(r2, r0)
        L_0x0349:
            return
        L_0x034a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type id.dana.contract.deeplink.path.IpgRegistrationPayload"
            r0.<init>(r1)
            throw r0
        L_0x0352:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.ipg.IpgGuideActivity.init():void");
    }

    @OnClick({2131362122})
    public final void refuseRegisterIpg() {
        convertDipToPx.length length2 = new convertDipToPx.length(this);
        length2.getMax = TrackerKey.Event.HOME_POP_UP_ACTION;
        convertDipToPx.length min = length2.setMin(TrackerKey.Property.IS_CONFIRM, false);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        finish();
    }

    @OnClick({2131362049})
    public final void agreeRegisterIpg() {
        convertDipToPx.length length2 = new convertDipToPx.length(this);
        length2.getMax = TrackerKey.Event.HOME_POP_UP_ACTION;
        convertDipToPx.length min = length2.setMin(TrackerKey.Property.IS_CONFIRM, true);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        getMax();
    }

    public static final /* synthetic */ void access$onCheckHasAgreedBefore(IpgGuideActivity ipgGuideActivity, boolean z) {
        String bizType;
        int max;
        if (z) {
            ipgGuideActivity.getMin();
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ipgGuideActivity._$_findCachedViewById(resetInternal.setMax.dispatchPopulateAccessibilityEvent);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        Context baseContext = ipgGuideActivity.getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1918630096 == (max = dispatchOnCancelled.getMax(applicationContext, 1918630096)))) {
            onCanceled oncanceled = new onCanceled(1918630096, max, 512);
            onCancelLoad.setMax(1918630096, oncanceled);
            onCancelLoad.getMin(1918630096, oncanceled);
        }
        Object[] objArr = new Object[1];
        GriverNetworkPermissionExtensionImpl.length length2 = ipgGuideActivity.ipgPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
        }
        onAnimationStart min = length2.setMin();
        if (!(min == null || (bizType = min.getBizType()) == null)) {
            str = StringsKt.capitalize(bizType);
        }
        objArr[0] = str;
        String string = ipgGuideActivity.getString(R.string.purpose_property_mixpanel, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.purpo…)?.bizType?.capitalize())");
        convertDipToPx.length length3 = new convertDipToPx.length(ipgGuideActivity);
        length3.getMax = TrackerKey.Event.HOME_POP_UP_OPEN;
        convertDipToPx.length max2 = length3.setMax("Purpose", string);
        max2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max2, (byte) 0);
        List length4 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
    }

    public static final /* synthetic */ void access$onSuccessGetRedirectUrl(IpgGuideActivity ipgGuideActivity, setWorkSpaceId setworkspaceid) {
        String userConsentSyncKey;
        int length2;
        ipgGuideActivity.toFloatRange = setworkspaceid;
        if (setworkspaceid != null && ((TextView) ipgGuideActivity._$_findCachedViewById(resetInternal.setMax.setOnInflateListener)) != null) {
            GriverNetworkPermissionExtensionImpl.length length3 = ipgGuideActivity.ipgPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
            }
            onAnimationStart min = length3.setMin();
            Context baseContext = ipgGuideActivity.getBaseContext();
            String str = null;
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            boolean z = false;
            if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-1475432387, oncanceled);
                onCancelLoad.getMin(-1475432387, oncanceled);
            }
            if (!(setworkspaceid == null || (userConsentSyncKey = setworkspaceid.getUserConsentSyncKey()) == null)) {
                CharSequence charSequence = userConsentSyncKey;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (!z) {
                    TextView textView = (TextView) ipgGuideActivity._$_findCachedViewById(resetInternal.setMax.setOnInflateListener);
                    Intrinsics.checkNotNullExpressionValue(textView, "tv_shopping_merchant_title");
                    textView.setText(charSequence);
                }
            }
            GriverNetworkPermissionExtensionImpl.length length4 = ipgGuideActivity.ipgPresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
            }
            if (min != null) {
                str = min.getUserConsentConfigKey();
            }
            if (str == null) {
                str = "";
            }
            length4.setMax(str);
        }
    }

    public static final /* synthetic */ void access$goTermsAndConditionsActivity(IpgGuideActivity ipgGuideActivity) {
        GriverNetworkPermissionExtensionImpl.length length2 = ipgGuideActivity.ipgPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ipgPresenter");
        }
        onAnimationStart min = length2.setMin();
        if (min != null) {
            IpgTermsAndConditionActivity.length length3 = IpgTermsAndConditionActivity.Companion;
            ipgGuideActivity.startActivityForResult(IpgTermsAndConditionActivity.length.getMin(ipgGuideActivity, min.getTncUrl()), ipgGuideActivity.getMin);
        }
    }
}
