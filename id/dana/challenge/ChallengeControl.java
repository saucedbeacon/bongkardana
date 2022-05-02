package id.dana.challenge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import o.FtsOptions$Order;
import o.PopupWindowToast;
import o.assertNotSuspendingTransaction;
import o.checkOp;
import o.dispatchOnCancelled;
import o.internalEndTransaction;
import o.isNotifyAllowed;
import o.isOpen;
import o.onCancelLoad;
import o.onCanceled;
import o.unwrapOpenHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 $2\u00020\u0001:\u0005\"#$%&B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\u0012\u001a\u00020\u000bJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/challenge/ChallengeControl;", "", "builder", "Lid/dana/challenge/ChallengeControl$Builder;", "(Lid/dana/challenge/ChallengeControl$Builder;)V", "facade", "Lid/dana/challenge/ChallengeControlFacade;", "appendUnbindMerchantData", "Landroid/os/Bundle;", "data", "doWhenScenarioAutoRoute", "", "doWhenScenarioFaceActivation", "doWhenScenarioLogin", "doWhenScenarioOtpRegister", "doWhenScenarioPaymentAuth", "doWhenScenarioTrustRiskLogin", "doWhenScenarioTwilio", "launch", "onActivityResult", "", "requestCode", "", "resultCode", "intent", "Landroid/content/Intent;", "setAuthData", "setDataAutoRoute", "setDataFaceActivation", "setDataOtpRegister", "setDataPaymentAuth", "setDataTrustRiskLogin", "startAuthScenario", "startUnbindMerchantScenario", "Builder", "CancelReason", "Companion", "Key", "Listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChallengeControl {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    private final length length;
    private final assertNotSuspendingTransaction setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/challenge/ChallengeControl$Listener;", "", "onChallengeCanceled", "", "challengeScenario", "", "cancelReason", "data", "Landroid/os/Bundle;", "onChallengeCompleted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMax();

        void getMin(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle);
    }

    private ChallengeControl(length length2) {
        this.length = length2;
        this.setMin = length2.length;
    }

    public /* synthetic */ ChallengeControl(length length2, byte b) {
        this(length2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0142, code lost:
        r0.putString(id.dana.challenge.ChallengeControl.Key.SECURITY_ID, r7.length.IsOverlapping);
        r1 = r7.setMin.setMax(id.dana.challenge.ChallengeActivity.class);
        r1.putExtras(r0);
        r1.setFlags(67108864);
        r7.setMin.length(r1, 1005);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0170, code lost:
        setMin(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0173, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin() {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.getMin
            java.lang.String r2 = "key_scenario"
            r0.putString(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.getMax
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0023
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.getMax
            java.lang.String r2 = "phone_number"
            r0.putString(r2, r1)
        L_0x0023:
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            int r1 = r1.equals
            if (r1 > 0) goto L_0x0035
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            int r1 = r1.isInside
            if (r1 > 0) goto L_0x0035
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            int r1 = r1.FastBitmap$CoordinateSystem
            if (r1 <= 0) goto L_0x0059
        L_0x0035:
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            int r1 = r1.equals
            java.lang.String r2 = "expiry_seconds"
            r0.putInt(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            int r1 = r1.isInside
            java.lang.String r2 = "retry_send_seconds"
            r0.putInt(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            int r1 = r1.FastBitmap$CoordinateSystem
            java.lang.String r2 = "otp_code_length"
            r0.putInt(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.toIntRange
            java.lang.String r2 = "otp_channel"
            r0.putString(r2, r1)
        L_0x0059:
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.setMax
            java.lang.String r2 = "registration_source"
            r0.putString(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.getMin
            if (r1 != 0) goto L_0x0069
            return
        L_0x0069:
            int r2 = r1.hashCode()
            java.lang.String r3 = "with_mobile_data"
            java.lang.String r4 = "pub_key"
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            java.lang.String r6 = "security_id"
            switch(r2) {
                case -1999183539: goto L_0x0248;
                case -497502143: goto L_0x0208;
                case -489325167: goto L_0x01c1;
                case -41045063: goto L_0x0189;
                case 103149417: goto L_0x0174;
                case 703631723: goto L_0x0168;
                case 1090898198: goto L_0x015f;
                case 1124674296: goto L_0x013a;
                case 1124674914: goto L_0x0131;
                case 1573803584: goto L_0x00d7;
                case 1656771640: goto L_0x00a0;
                case 1908226099: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x026c
        L_0x007b:
            java.lang.String r2 = "auth_agreement"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1004(0x3ec, float:1.407E-42)
            r0.length(r1, r2)
            return
        L_0x00a0:
            java.lang.String r2 = "face_activation"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.setMin
            r0.putString(r4, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.getMin()
            java.lang.String r2 = "face_auth_new"
            r0.putBoolean(r2, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1002(0x3ea, float:1.404E-42)
            r0.length(r1, r2)
            return
        L_0x00d7:
            java.lang.String r2 = "trust_risk_login"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.getMax()
            java.lang.String r2 = "face_only_login"
            r0.putBoolean(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.length()
            java.lang.String r2 = "face_login_enrolled"
            r0.putBoolean(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.setMin()
            java.lang.String r2 = "kyc_flag"
            r0.putBoolean(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.isInside()
            java.lang.String r2 = "risk_flag"
            r0.putBoolean(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.toIntRange()
            r0.putBoolean(r3, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengePinWithFaceActivity> r2 = id.dana.challenge.ChallengePinWithFaceActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 999(0x3e7, float:1.4E-42)
            r0.length(r1, r2)
            return
        L_0x0131:
            java.lang.String r2 = "twilio_pin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            goto L_0x0142
        L_0x013a:
            java.lang.String r2 = "twilio_otp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
        L_0x0142:
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1005(0x3ed, float:1.408E-42)
            r0.length(r1, r2)
            return
        L_0x015f:
            java.lang.String r2 = "relogin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            goto L_0x0170
        L_0x0168:
            java.lang.String r2 = "trust_risk_login_twilio"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
        L_0x0170:
            r7.setMin(r0)
            return
        L_0x0174:
            java.lang.String r2 = "login"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.toIntRange()
            r0.putBoolean(r3, r1)
            r7.setMin(r0)
            return
        L_0x0189:
            java.lang.String r2 = "auto_route"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.setMin
            r0.putString(r4, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.IsOverlapping()
            java.lang.String r2 = "auto_route_status"
            r0.putBoolean(r2, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1006(0x3ee, float:1.41E-42)
            r0.length(r1, r2)
            goto L_0x026c
        L_0x01c1:
            java.lang.String r2 = "unbind_merchant"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.setMin
            r0.putString(r4, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.Grayscale$Algorithm
            java.lang.String r2 = "merchant_id"
            r0.putString(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.invoke
            java.lang.String r2 = "client_id"
            r0.putString(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.invokeSuspend
            java.lang.String r2 = "division_id"
            r0.putString(r2, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1003(0x3eb, float:1.406E-42)
            r0.length(r1, r2)
            return
        L_0x0208:
            java.lang.String r2 = "payment_auth"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.setMin
            r0.putString(r4, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.toFloatRange
            java.lang.String r2 = "auth_type"
            r0.putString(r2, r1)
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            boolean r1 = r1.setMax()
            java.lang.String r2 = "auth_status"
            r0.putBoolean(r2, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1001(0x3e9, float:1.403E-42)
            r0.length(r1, r2)
            return
        L_0x0248:
            java.lang.String r2 = "otp_registration"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026c
            id.dana.challenge.ChallengeControl$length r1 = r7.length
            java.lang.String r1 = r1.IsOverlapping
            r0.putString(r6, r1)
            o.assertNotSuspendingTransaction r1 = r7.setMin
            java.lang.Class<id.dana.challenge.ChallengeActivity> r2 = id.dana.challenge.ChallengeActivity.class
            android.content.Intent r1 = r1.setMax(r2)
            r1.putExtras(r0)
            r1.setFlags(r5)
            o.assertNotSuspendingTransaction r0 = r7.setMin
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.length(r1, r2)
        L_0x026c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.challenge.ChallengeControl.getMin():void");
    }

    private final void setMin(Bundle bundle) {
        Intent max = this.setMin.setMax(ChallengePinWithFaceActivity.class);
        max.putExtras(bundle);
        max.setFlags(67108864);
        this.setMin.length(max, 998);
    }

    public final boolean setMax(int i, int i2, @Nullable Intent intent) {
        Bundle bundle;
        getMin getmin;
        if (23623 != i && 1005 != i && 998 != i) {
            return false;
        }
        if (-1 == i2 && (getmin = this.length.toString) != null) {
            getmin.getMax();
        }
        if (i2 != 0) {
            return true;
        }
        String str = null;
        if (intent == null || intent.getExtras() == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
            if (bundle != null) {
                str = bundle.getString(Key.CANCEL_REASON);
            }
        }
        getMin getmin2 = this.length.toString;
        if (getmin2 == null) {
            return true;
        }
        getmin2.getMin(this.length.getMin, str, bundle);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/challenge/ChallengeControl$Key;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Key {
        @NotNull
        public static final String AUTH_AGREEMENT = "auth_agreement";
        @NotNull
        public static final String AUTH_STATUS = "auth_status";
        @NotNull
        public static final String AUTH_TYPE = "auth_type";
        @NotNull
        public static final String AUTO_ROUTE = "auto_route";
        @NotNull
        public static final String AUTO_ROUTE_STATUS = "auto_route_status";
        @NotNull
        public static final String CANCEL_REASON = "cancel_reason";
        @NotNull
        public static final String CLIENT_ID = "client_id";
        @NotNull
        public static final getMin Companion = getMin.setMin;
        @NotNull
        public static final String DIVISION_ID = "division_id";
        @NotNull
        public static final String EXPIRY_SECONDS = "expiry_seconds";
        @NotNull
        public static final String FACE_ACTIVATION = "face_activation";
        @NotNull
        public static final String FACE_AUTH_NEW = "face_auth_new";
        @NotNull
        public static final String FACE_LOGIN_ENROLLED = "face_login_enrolled";
        @NotNull
        public static final String FACE_ONLY_LOGIN = "face_only_login";
        @NotNull
        public static final String KYC_FLAG = "kyc_flag";
        @NotNull
        public static final String MERCHANT_ID = "merchant_id";
        @NotNull
        public static final String OTP_CHANNEL = "otp_channel";
        @NotNull
        public static final String OTP_CODE_LENGTH = "otp_code_length";
        @NotNull
        public static final String PAYMENT_AUTH = "payment_auth";
        @NotNull
        public static final String PHONE_NUMBER = "phone_number";
        @NotNull
        public static final String PUB_KEY = "pub_key";
        @NotNull
        public static final String REGISTRATION_SOURCE = "registration_source";
        @NotNull
        public static final String RETRY_SEND_SECONDS = "retry_send_seconds";
        @NotNull
        public static final String RISK_FLAG = "risk_flag";
        @NotNull
        public static final String SCENARIO = "key_scenario";
        @NotNull
        public static final String SECURITY_ID = "security_id";
        @NotNull
        public static final String TWILIO_OTP = "twilio_otp";
        @NotNull
        public static final String TWILIO_PIN = "twilio_pin";
        @NotNull
        public static final String UNBIND_MERCHANT = "unbind_merchant";
        @NotNull
        public static final String WITH_MOBILE_DATA = "with_mobile_data";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/challenge/ChallengeControl$Key$Companion;", "", "()V", "AUTH_AGREEMENT", "", "AUTH_STATUS", "AUTH_TYPE", "AUTO_ROUTE", "AUTO_ROUTE_STATUS", "CANCEL_REASON", "CLIENT_ID", "DIVISION_ID", "EXPIRY_SECONDS", "FACE_ACTIVATION", "FACE_AUTH_NEW", "FACE_LOGIN_ENROLLED", "FACE_ONLY_LOGIN", "KYC_FLAG", "MERCHANT_ID", "OTP_CHANNEL", "OTP_CODE_LENGTH", "PAYMENT_AUTH", "PHONE_NUMBER", "PUB_KEY", "REGISTRATION_SOURCE", "RETRY_SEND_SECONDS", "RISK_FLAG", "SCENARIO", "SECURITY_ID", "TWILIO_OTP", "TWILIO_PIN", "UNBIND_MERCHANT", "WITH_MOBILE_DATA", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            static final /* synthetic */ getMin setMin = new getMin();

            private getMin() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/challenge/ChallengeControl$CancelReason;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface CancelReason {
        @NotNull
        public static final String ACCOUNT_FROZEN = "account_frozen";
        @NotNull
        public static final String BACK = "back";
        @NotNull
        public static final String CLOSE = "close";
        @NotNull
        public static final getMax Companion = getMax.setMin;
        @NotNull
        public static final String ERROR = "error";
        @NotNull
        public static final String FALLBACK_CHALLENGE = "fallback_challenge";
        @NotNull
        public static final String FORGOT_PIN = "forgot_pin";
        @NotNull
        public static final String PIN_TEMPORARY_LOCKED = "pin_temporary_locked";
        @NotNull
        public static final String SESSION_EXPIRED = "sessionExpired";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/challenge/ChallengeControl$CancelReason$Companion;", "", "()V", "ACCOUNT_FROZEN", "", "BACK", "CLOSE", "ERROR", "FALLBACK_CHALLENGE", "FORGOT_PIN", "PIN_TEMPORARY_LOCKED", "SESSION_EXPIRED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            static final /* synthetic */ getMax setMin = new getMax();

            private getMax() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0011\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010a\u001a\u00020bJ\u0010\u0010c\u001a\u00020\u00002\b\u0010d\u001a\u0004\u0018\u00010\u0012J\"\u0010e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\b\u0010d\u001a\u0004\u0018\u00010\u00122\b\u0010f\u001a\u0004\u0018\u00010\u0012J\u0010\u0010g\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u0012J*\u0010i\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\f2\b\u0010d\u001a\u0004\u0018\u00010\u00122\b\u0010f\u001a\u0004\u0018\u00010\u00122\u0006\u00101\u001a\u00020\fJ \u0010k\u001a\u00020\u00002\u0006\u00107\u001a\u00020\f2\b\u0010d\u001a\u0004\u0018\u00010\u00122\u0006\u0010l\u001a\u00020mJ\u0010\u0010n\u001a\u00020\u00002\b\u0010o\u001a\u0004\u0018\u00010>J(\u0010p\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010U\u001a\u00020&2\u0006\u0010I\u001a\u00020&2\b\u0010q\u001a\u0004\u0018\u00010\u0012J\u0016\u0010r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010s\u001a\u00020tJ\u0010\u0010u\u001a\u00020\u00002\b\u0010v\u001a\u0004\u0018\u00010\u0012J\u0010\u0010w\u001a\u00020\u00002\b\u0010x\u001a\u0004\u0018\u00010\u0012J\u000e\u0010y\u001a\u00020\u00002\u0006\u0010z\u001a\u00020{J\u000e\u0010|\u001a\u00020\u00002\u0006\u0010}\u001a\u00020\fR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\"\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\u001a\u00104\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000e\"\u0004\b6\u0010\u0010R\u001a\u00107\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000e\"\u0004\b9\u0010\u0010R\u001a\u0010:\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000e\"\u0004\b<\u0010\u0010R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0014\"\u0004\bE\u0010\u0016R\u001c\u0010F\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0014\"\u0004\bH\u0010\u0016R\u001a\u0010I\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R\u001c\u0010L\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0014\"\u0004\bN\u0010\u0016R\u001c\u0010O\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0014\"\u0004\bQ\u0010\u0016R\u001c\u0010R\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0014\"\u0004\bT\u0010\u0016R\u001a\u0010U\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010(\"\u0004\bW\u0010*R\u001a\u0010X\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000e\"\u0004\bZ\u0010\u0010R\u001c\u0010[\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0014\"\u0004\b]\u0010\u0016R\u001a\u0010^\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000e\"\u0004\b`\u0010\u0010¨\u0006~"}, d2 = {"Lid/dana/challenge/ChallengeControl$Builder;", "", "baseActivity", "Lid/dana/base/BaseActivity;", "(Lid/dana/base/BaseActivity;)V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "baseFragment", "Lid/dana/base/BaseFragment;", "(Lid/dana/base/BaseFragment;)V", "authStatus", "", "getAuthStatus", "()Z", "setAuthStatus", "(Z)V", "authTypeValue", "", "getAuthTypeValue", "()Ljava/lang/String;", "setAuthTypeValue", "(Ljava/lang/String;)V", "autoRouteStatus", "getAutoRouteStatus", "setAutoRouteStatus", "challengeScenarioValue", "getChallengeScenarioValue$annotations", "()V", "getChallengeScenarioValue", "setChallengeScenarioValue", "clientId", "getClientId", "setClientId", "divisionId", "getDivisionId", "setDivisionId", "expirySeconds", "", "getExpirySeconds", "()I", "setExpirySeconds", "(I)V", "facade", "Lid/dana/challenge/ChallengeControlFacade;", "getFacade", "()Lid/dana/challenge/ChallengeControlFacade;", "setFacade", "(Lid/dana/challenge/ChallengeControlFacade;)V", "faceAuthNew", "getFaceAuthNew", "setFaceAuthNew", "faceLoginEnrolled", "getFaceLoginEnrolled", "setFaceLoginEnrolled", "faceOnlyLogin", "getFaceOnlyLogin", "setFaceOnlyLogin", "kycStatus", "getKycStatus", "setKycStatus", "listenerValue", "Lid/dana/challenge/ChallengeControl$Listener;", "getListenerValue", "()Lid/dana/challenge/ChallengeControl$Listener;", "setListenerValue", "(Lid/dana/challenge/ChallengeControl$Listener;)V", "merchantId", "getMerchantId", "setMerchantId", "otpChannelValue", "getOtpChannelValue", "setOtpChannelValue", "otpCodeLength", "getOtpCodeLength", "setOtpCodeLength", "phoneNumberValue", "getPhoneNumberValue", "setPhoneNumberValue", "pubKeyValue", "getPubKeyValue", "setPubKeyValue", "registrationSourceValue", "getRegistrationSourceValue", "setRegistrationSourceValue", "retrySendSeconds", "getRetrySendSeconds", "setRetrySendSeconds", "riskFlag", "getRiskFlag", "setRiskFlag", "securityIdValue", "getSecurityIdValue", "setSecurityIdValue", "withMobileDataValue", "getWithMobileDataValue", "setWithMobileDataValue", "build", "Lid/dana/challenge/ChallengeControl;", "setAuthParams", "securityId", "setAutoRouteParams", "pubKey", "setChallengeScenario", "challengeScenario", "setFaceActivationParams", "status", "setFaceAuthParams", "faceLoginAuthMethod", "Lid/dana/model/LoginAuthenticationMethod;", "setListener", "listener", "setOtpParams", "otpChannel", "setPaymentAuthParams", "paymentSecuritySwitchModel", "Lid/dana/myprofile/model/PaymentSecuritySwitchModel;", "setPhoneNumber", "phoneNumber", "setRegistrationSource", "registrationSource", "setUnbindMerchantParams", "unbindConsultModel", "Lid/dana/merchantmanagement/model/UnbindConsultModel;", "setWithMobileData", "withMobileData", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        public int FastBitmap$CoordinateSystem;
        @Nullable
        public String Grayscale$Algorithm;
        private boolean ICustomTabsCallback;
        @Nullable
        public String IsOverlapping;
        public boolean Mean$Arithmetic;
        public int equals;
        private boolean getCause;
        @Nullable
        String getMax;
        @Nullable
        public String getMin;
        public boolean hashCode;
        @Nullable
        public String invoke;
        @Nullable
        public String invokeSuspend;
        public int isInside;
        @NotNull
        assertNotSuspendingTransaction length;
        private boolean onNavigationEvent;
        @Nullable
        public String setMax;
        @Nullable
        public String setMin;
        public boolean toDoubleRange;
        @Nullable
        String toFloatRange;
        @Nullable
        public String toIntRange;
        @Nullable
        public getMin toString;
        public boolean valueOf;
        public boolean values;

        public final boolean setMax() {
            return this.ICustomTabsCallback;
        }

        public final boolean getMax() {
            return this.hashCode;
        }

        public final boolean length() {
            return this.values;
        }

        public final boolean setMin() {
            return this.toDoubleRange;
        }

        public final boolean getMin() {
            return this.getCause;
        }

        public final boolean isInside() {
            return this.valueOf;
        }

        public final boolean IsOverlapping() {
            return this.onNavigationEvent;
        }

        public final boolean toIntRange() {
            return this.Mean$Arithmetic;
        }

        public length(@NotNull BaseActivity baseActivity) {
            Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
            this.length = new unwrapOpenHelper(baseActivity);
        }

        public length(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            this.length = new isOpen(activity);
        }

        public length(@Nullable FtsOptions$Order ftsOptions$Order) {
            this.length = new internalEndTransaction(ftsOptions$Order);
        }

        @NotNull
        public final length setMin(@Nullable String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(-133597276, oncanceled);
                onCancelLoad.getMin(-133597276, oncanceled);
            }
            length length3 = this;
            if (str == null) {
                str = "";
            }
            length3.getMax = str;
            return length3;
        }

        @NotNull
        public final length getMax(boolean z, @NotNull PopupWindowToast popupWindowToast) {
            Intrinsics.checkNotNullParameter(popupWindowToast, "paymentSecuritySwitchModel");
            length length2 = this;
            length2.ICustomTabsCallback = z;
            checkOp checkop = popupWindowToast.length;
            Intrinsics.checkNotNullExpressionValue(checkop, "paymentSecuritySwitchModel.securityContextModel");
            length2.setMin = checkop.length;
            isNotifyAllowed isnotifyallowed = popupWindowToast.setMax;
            Intrinsics.checkNotNullExpressionValue(isnotifyallowed, "paymentSecuritySwitchModel.riskResultModel");
            length2.IsOverlapping = isnotifyallowed.getMin;
            isNotifyAllowed isnotifyallowed2 = popupWindowToast.setMax;
            Intrinsics.checkNotNullExpressionValue(isnotifyallowed2, "paymentSecuritySwitchModel.riskResultModel");
            length2.toFloatRange = isnotifyallowed2.setMin;
            return length2;
        }

        @NotNull
        public final length getMin(boolean z, @Nullable String str, @Nullable String str2, boolean z2) {
            length length2 = this;
            length2.ICustomTabsCallback = z;
            if (str == null) {
                str = "";
            }
            length2.IsOverlapping = str;
            if (str2 == null) {
                str2 = "";
            }
            length2.setMin = str2;
            length2.getCause = z2;
            return length2;
        }

        @NotNull
        public final length getMax(boolean z, @Nullable String str, @Nullable String str2) {
            length length2 = this;
            length2.onNavigationEvent = z;
            if (str == null) {
                str = "";
            }
            length2.IsOverlapping = str;
            if (str2 == null) {
                str2 = "";
            }
            length2.setMin = str2;
            return length2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/challenge/ChallengeControl$Companion;", "", "()V", "REQUEST_CODE", "", "REQUEST_CODE_ACCOUNT_DEACTIVATION", "REQUEST_CODE_AUTO_ROUTE", "REQUEST_CODE_FACE_AUTH", "REQUEST_CODE_LOGIN", "REQUEST_CODE_OAUTH_AGREEMENT", "REQUEST_CODE_PAYMENT_AUTH", "REQUEST_CODE_REGISTRATION", "REQUEST_CODE_TRUST_RISK_LOGIN", "REQUEST_CODE_TWILIO", "REQUEST_CODE_UNBIND_MERCHANT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
