package o;

import android.content.Context;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AccelerometerForH5SensorService;
import o.CompassSensorService;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IBg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0011H\u0016J\u0018\u0010/\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016J\u0010\u00100\u001a\u00020*2\u0006\u0010%\u001a\u00020&H\u0016J(\u00100\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0016J\u0018\u00104\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002J\b\u00105\u001a\u00020*H\u0002J\u0018\u00106\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002J\b\u00107\u001a\u00020*H\u0002J&\u00108\u001a\u00020*2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020&J\b\u00109\u001a\u00020*H\u0002J\b\u0010:\u001a\u00020*H\u0016J\b\u0010;\u001a\u00020*H\u0002J\b\u0010<\u001a\u00020*H\u0002J\b\u0010=\u001a\u00020*H\u0016J\b\u0010\u0012\u001a\u00020*H\u0016J\b\u0010>\u001a\u00020*H\u0016J,\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020&2\b\u0010A\u001a\u0004\u0018\u00010&2\b\u0010B\u001a\u0004\u0018\u00010&2\u0006\u0010C\u001a\u00020,H\u0007J\u001a\u0010D\u001a\u00020*2\b\u0010B\u001a\u0004\u0018\u00010&2\u0006\u0010E\u001a\u00020FH\u0007J \u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lid/dana/onboarding/verify/VerifyPresenter;", "Lid/dana/onboarding/verify/VerifyNumberContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/onboarding/verify/VerifyNumberContract$View;", "checkRegister", "Lid/dana/domain/registration/interactor/CheckRegisteredPhoneNumber;", "checkShowReferralCodeFeature", "Lid/dana/domain/featureconfig/interactor/CheckShowReferralCodeFeature;", "faceAuthManager", "Lid/dana/onboarding/verify/FaceAuthManager;", "faceAuthenticationModelMapper", "Lid/dana/mapper/FaceAuthenticationModelMapper;", "removeDeepLinkPayload", "Lid/dana/domain/deeplink/interactor/RemoveDeepLinkPayload;", "isVerifyingToResetPin", "", "resendOtp", "Lid/dana/domain/registration/interactor/ResendOtp;", "bokuVerification", "Lid/dana/domain/bokuverification/BokuVerification;", "checkMobileDataPermissionAccepted", "Lid/dana/domain/bokuverification/CheckMobileDataPermissionAccepted;", "setMobileDataPermissionAccepted", "Lid/dana/domain/bokuverification/SetMobileDataPermissionAccepted;", "(Landroid/content/Context;Lid/dana/onboarding/verify/VerifyNumberContract$View;Lid/dana/domain/registration/interactor/CheckRegisteredPhoneNumber;Lid/dana/domain/featureconfig/interactor/CheckShowReferralCodeFeature;Lid/dana/onboarding/verify/FaceAuthManager;Lid/dana/mapper/FaceAuthenticationModelMapper;Lid/dana/domain/deeplink/interactor/RemoveDeepLinkPayload;ZLid/dana/domain/registration/interactor/ResendOtp;Lid/dana/domain/bokuverification/BokuVerification;Lid/dana/domain/bokuverification/CheckMobileDataPermissionAccepted;Lid/dana/domain/bokuverification/SetMobileDataPermissionAccepted;)V", "checkRegistrationResponse", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "getCheckRegistrationResponse$app_productionRelease$annotations", "()V", "getCheckRegistrationResponse$app_productionRelease", "()Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "setCheckRegistrationResponse$app_productionRelease", "(Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;)V", "otpCodeLength", "", "phoneNumber", "", "retrySendSeconds", "securityId", "checkErrorCode", "", "error", "", "checkLuckyMoneyReferralCodeEnabled", "fromBoku", "checkMobileDataPermission", "checkPhoneNumber", "clientId", "merchantId", "merchantName", "checkVerificationMethod", "handleMobileDataPermissionAlreadyAccepted", "handleMobileDataPermissionNotAccepted", "handleResetPinFromOutside", "handleResponseBasedOnAction", "initFaceAuthManager", "onDestroy", "performNormalLoginFlow", "performResetPin", "removeDeeplinkPayload", "setMobileDataPermission", "trackDisplayedErrorVerifyPhone", "operationType", "errorMessage", "displayedMessage", "exception", "trackNetworkErrorVerifyPhone", "networkException", "Lid/dana/data/base/NetworkException;", "trackOnboardingPhoneNumberInputEvent", "checkResult", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class sendSensorResult implements CompassSensorService.length {
    private static int ICustomTabsCallback;
    private static int b = 1;
    @NotNull
    public static final getMax length;
    private static final String onNavigationEvent;
    public static final int setMax = 93;
    public static final byte[] setMin;
    private final AccelerometerForH5SensorService FastBitmap$CoordinateSystem;
    private final APHitTestResult Grayscale$Algorithm;
    private int IsOverlapping;
    private final calculateDistance Mean$Arithmetic;
    private final CompassSensorService.getMin equals;
    @NotNull
    private setEncryptProxy getMax;
    private String getMin;
    private final setWebMessageCallback hashCode;
    private final boolean invoke;
    private final onPageError invokeSuspend;
    private String isInside;
    private final fromScanData toDoubleRange;
    private int toFloatRange;
    private final Context toIntRange;
    private final setPageCacheCapacity toString;
    private final APDownloadListener valueOf;
    private final onLocationResult values;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.String IsOverlapping(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r3 = r0 | 2310(0x906, float:3.237E-42)
            short r3 = (short) r3
            r4 = 7041(0x1b81, float:9.867E-42)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0229 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x0229 }
            byte[] r3 = setMin     // Catch:{ all -> 0x0229 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x0229 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0229 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0229 }
            int r10 = setMax     // Catch:{ all -> 0x0229 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x0229 }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x0229 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0229 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0229 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0229 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0229 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0229 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0229 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x0229 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0229 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0229 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0229 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0229 }
            int r13 = setMax     // Catch:{ all -> 0x0229 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0229 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x0229 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0229 }
            r11[r7] = r12     // Catch:{ all -> 0x0229 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x0229 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x0229 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0229 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0110
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r11[r7] = r10     // Catch:{ all -> 0x0107 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0107 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0107 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0107 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0107 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0107 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0107 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0107 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0107 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0107 }
            int r2 = setMax     // Catch:{ all -> 0x0107 }
            r2 = r2 | 11522(0x2d02, float:1.6146E-41)
            short r2 = (short) r2     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = length(r15, r9, r2)     // Catch:{ all -> 0x0107 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0107 }
            r14[r7] = r2     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r2 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0107 }
            r10 = 0
            java.lang.Object r2 = r2.invoke(r10, r11)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fe }
            byte r11 = r11[r8]     // Catch:{ all -> 0x00fe }
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fe }
            int r13 = setMax     // Catch:{ all -> 0x00fe }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x00fe }
            byte[] r12 = setMin     // Catch:{ all -> 0x00fe }
            byte r12 = r12[r8]     // Catch:{ all -> 0x00fe }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x00fe }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x00fe }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r2 = r11.invoke(r2, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00fe }
            int r2 = r2.intValue()     // Catch:{ all -> 0x00fe }
            r3[r6] = r2
            int r6 = r6 + 1
            r2 = 33
            goto L_0x007c
        L_0x00fe:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0106
            throw r1
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r2 = 30
            r6 = 7
        L_0x0113:
            int r9 = r7 + 1
            r10 = 3
            r11 = 8
            r12 = 4
            r0 = r3[r7]     // Catch:{ all -> 0x0196 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0196 }
            switch(r0) {
                case -13: goto L_0x0191;
                case -12: goto L_0x018e;
                case -11: goto L_0x017c;
                case -10: goto L_0x0174;
                case -9: goto L_0x0171;
                case -8: goto L_0x016e;
                case -7: goto L_0x0160;
                case -6: goto L_0x0151;
                case -5: goto L_0x0147;
                case -4: goto L_0x0144;
                case -3: goto L_0x012f;
                case -2: goto L_0x0127;
                case -1: goto L_0x0124;
                default: goto L_0x0122;
            }     // Catch:{ all -> 0x0196 }
        L_0x0122:
            goto L_0x0193
        L_0x0124:
            r7 = 42
            goto L_0x0113
        L_0x0127:
            r1.length(r11)     // Catch:{ all -> 0x0196 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0196 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0196 }
            throw r0     // Catch:{ all -> 0x0196 }
        L_0x012f:
            r1.setMin = r5     // Catch:{ all -> 0x0196 }
            r1.length(r10)     // Catch:{ all -> 0x0196 }
            r1.length(r12)     // Catch:{ all -> 0x0196 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0196 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = r0.getMin     // Catch:{ all -> 0x0196 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0196 }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x0196 }
            goto L_0x0193
        L_0x0144:
            r7 = 30
            goto L_0x0113
        L_0x0147:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0196 }
            r1.setMin = r0     // Catch:{ all -> 0x0196 }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x0196 }
            goto L_0x0193
        L_0x0151:
            r1.setMin = r5     // Catch:{ all -> 0x0196 }
            r1.length(r10)     // Catch:{ all -> 0x0196 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x0196 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0196 }
            b = r0     // Catch:{ all -> 0x0196 }
            goto L_0x0193
        L_0x0160:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x0196 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x0193
            r0 = 29
            r7 = 29
            goto L_0x0113
        L_0x016e:
            r7 = 40
            goto L_0x0113
        L_0x0171:
            r7 = 37
            goto L_0x0113
        L_0x0174:
            r1.length(r11)     // Catch:{ all -> 0x0196 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0196 }
            return r0
        L_0x017c:
            r1.length(r5)     // Catch:{ all -> 0x0196 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0196 }
            if (r0 == r4) goto L_0x018b
            r7 = 90
            if (r0 == r7) goto L_0x0188
            goto L_0x018b
        L_0x0188:
            r0 = 2
            r7 = 2
            goto L_0x0113
        L_0x018b:
            r7 = 33
            goto L_0x0113
        L_0x018e:
            r7 = 32
            goto L_0x0113
        L_0x0191:
            r7 = 7
            goto L_0x0113
        L_0x0193:
            r7 = r9
            goto L_0x0113
        L_0x0196:
            r0 = move-exception
            if (r9 < r12) goto L_0x019f
            if (r9 > r6) goto L_0x019f
            r7 = 36
            goto L_0x021f
        L_0x019f:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r13 = 2419(0x973, float:3.39E-42)
            short r13 = (short) r13
            r14 = 13371(0x343b, float:1.8737E-41)
            short r14 = (short) r14
            java.lang.String r7 = length(r7, r13, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x01be
            if (r9 < r10) goto L_0x01be
            if (r9 > r12) goto L_0x01be
        L_0x01bc:
            r7 = 1
            goto L_0x021f
        L_0x01be:
            byte[] r7 = setMin
            byte r10 = r7[r8]
            byte r10 = (byte) r10
            r12 = 2427(0x97b, float:3.401E-42)
            short r12 = (short) r12
            byte r7 = r7[r4]
            short r7 = (short) r7
            java.lang.String r7 = length(r10, r12, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x01dc
            if (r9 < r6) goto L_0x01dc
            if (r9 > r11) goto L_0x01dc
            goto L_0x01bc
        L_0x01dc:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r10 = 2424(0x978, float:3.397E-42)
            short r10 = (short) r10
            r11 = 14181(0x3765, float:1.9872E-41)
            short r11 = (short) r11
            java.lang.String r7 = length(r7, r10, r11)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x01fc
            r7 = 25
            if (r9 < r7) goto L_0x01fc
            if (r9 > r2) goto L_0x01fc
            goto L_0x01bc
        L_0x01fc:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r10 = 2432(0x980, float:3.408E-42)
            short r10 = (short) r10
            r11 = 14148(0x3744, float:1.9826E-41)
            short r11 = (short) r11
            java.lang.String r7 = length(r7, r10, r11)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0228
            r7 = 34
            if (r9 < r7) goto L_0x0228
            r7 = 35
            if (r9 > r7) goto L_0x0228
            r7 = 39
        L_0x021f:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            goto L_0x0113
        L_0x0228:
            throw r0
        L_0x0229:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0231
            throw r1
        L_0x0231:
            goto L_0x0233
        L_0x0232:
            throw r0
        L_0x0233:
            goto L_0x0232
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.IsOverlapping(o.sendSensorResult):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0617, code lost:
        if (r12 <= 305) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013b, code lost:
        if (r1.setMax != 0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013d, code lost:
        r8 = 119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0140, code lost:
        r8 = 240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0156, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0170, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0538  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void IsOverlapping() {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = r0 | 1022(0x3fe, float:1.432E-42)
            short r4 = (short) r4
            r5 = 11937(0x2ea1, float:1.6727E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x064c }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x064c }
            byte[] r4 = setMin     // Catch:{ all -> 0x064c }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x064c }
            byte r4 = (byte) r4     // Catch:{ all -> 0x064c }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x064c }
            int r11 = setMax     // Catch:{ all -> 0x064c }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x064c }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x064c }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x064c }
            byte[] r11 = setMin     // Catch:{ all -> 0x064c }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x064c }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x064c }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x064c }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x064c }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x064c }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x064c }
            byte[] r13 = setMin     // Catch:{ all -> 0x064c }
            byte r13 = r13[r9]     // Catch:{ all -> 0x064c }
            byte r13 = (byte) r13     // Catch:{ all -> 0x064c }
            int r14 = setMax     // Catch:{ all -> 0x064c }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x064c }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x064c }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x064c }
            r12[r8] = r13     // Catch:{ all -> 0x064c }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x064c }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x064c }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x064c }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x007c:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0112
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0109 }
            r12[r8] = r11     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0109 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0109 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0109 }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0109 }
            int r14 = setMax     // Catch:{ all -> 0x0109 }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0109 }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x0109 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0109 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0109 }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0109 }
            r5 = 13879(0x3637, float:1.9449E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = length(r14, r15, r5)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x0109 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0109 }
            byte r15 = r15[r9]     // Catch:{ all -> 0x0109 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0109 }
            int r3 = setMax     // Catch:{ all -> 0x0109 }
            r3 = r3 | 11522(0x2d02, float:1.6146E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = length(r15, r10, r3)     // Catch:{ all -> 0x0109 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0109 }
            r14[r8] = r3     // Catch:{ all -> 0x0109 }
            java.lang.reflect.Method r3 = r11.getMethod(r5, r14)     // Catch:{ all -> 0x0109 }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0100 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0100 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0100 }
            int r12 = setMax     // Catch:{ all -> 0x0100 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0100 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0100 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0100 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0100 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0100 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0100 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0100 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0100 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0100 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x007c
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0108
            throw r1
        L_0x0108:
            throw r0
        L_0x0109:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0111
            throw r1
        L_0x0111:
            throw r0
        L_0x0112:
            r5 = 11
            r7 = 34
            r10 = 59
        L_0x0118:
            int r12 = r8 + 1
            r0 = r4[r8]     // Catch:{ all -> 0x04b9 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x04b9 }
            r14 = 22
            r15 = 14
            r8 = 5
            r11 = 48
            r3 = 3
            r13 = 4
            switch(r0) {
                case -90: goto L_0x04b0;
                case -89: goto L_0x049f;
                case -88: goto L_0x049b;
                case -87: goto L_0x0497;
                case -86: goto L_0x0491;
                case -85: goto L_0x0482;
                case -84: goto L_0x046a;
                case -83: goto L_0x0466;
                case -82: goto L_0x0460;
                case -81: goto L_0x045c;
                case -80: goto L_0x0456;
                case -79: goto L_0x0450;
                case -78: goto L_0x0441;
                case -77: goto L_0x043b;
                case -76: goto L_0x042c;
                case -75: goto L_0x0426;
                case -74: goto L_0x0405;
                case -73: goto L_0x03f1;
                case -72: goto L_0x03dd;
                case -71: goto L_0x03d7;
                case -70: goto L_0x03d1;
                case -69: goto L_0x03c2;
                case -68: goto L_0x03bc;
                case -67: goto L_0x0390;
                case -66: goto L_0x037c;
                case -65: goto L_0x0376;
                case -64: goto L_0x0370;
                case -63: goto L_0x035f;
                case -62: goto L_0x0359;
                case -61: goto L_0x034d;
                case -60: goto L_0x0337;
                case -59: goto L_0x0333;
                case -58: goto L_0x032d;
                case -57: goto L_0x031e;
                case -56: goto L_0x0316;
                case -55: goto L_0x0310;
                case -54: goto L_0x0301;
                case -53: goto L_0x02ec;
                case -52: goto L_0x02d2;
                case -51: goto L_0x02ce;
                case -50: goto L_0x02ca;
                case -49: goto L_0x02b1;
                case -48: goto L_0x02ab;
                case -47: goto L_0x0299;
                case -46: goto L_0x0295;
                case -45: goto L_0x0291;
                case -44: goto L_0x0282;
                case -43: goto L_0x026e;
                case -42: goto L_0x025c;
                case -41: goto L_0x024a;
                case -40: goto L_0x0241;
                case -39: goto L_0x023d;
                case -38: goto L_0x0239;
                case -37: goto L_0x022c;
                case -36: goto L_0x0228;
                case -35: goto L_0x0224;
                case -34: goto L_0x0217;
                case -33: goto L_0x0213;
                case -32: goto L_0x020f;
                case -31: goto L_0x020b;
                case -30: goto L_0x0207;
                case -29: goto L_0x0203;
                case -28: goto L_0x01f6;
                case -27: goto L_0x01e6;
                case -26: goto L_0x01e1;
                case -25: goto L_0x01de;
                case -24: goto L_0x01da;
                case -23: goto L_0x01cd;
                case -22: goto L_0x01b5;
                case -21: goto L_0x01b1;
                case -20: goto L_0x01ad;
                case -19: goto L_0x01a0;
                case -18: goto L_0x0191;
                case -17: goto L_0x018c;
                case -16: goto L_0x0189;
                case -15: goto L_0x0186;
                case -14: goto L_0x0183;
                case -13: goto L_0x0180;
                case -12: goto L_0x0174;
                case -11: goto L_0x015a;
                case -10: goto L_0x0152;
                case -9: goto L_0x014f;
                case -8: goto L_0x014c;
                case -7: goto L_0x0149;
                case -6: goto L_0x0146;
                case -5: goto L_0x0144;
                case -4: goto L_0x0143;
                case -3: goto L_0x0136;
                case -2: goto L_0x0133;
                case -1: goto L_0x0130;
                default: goto L_0x012c;
            }     // Catch:{ all -> 0x04b9 }
        L_0x012c:
            r3 = 33
            goto L_0x04b6
        L_0x0130:
            r8 = 326(0x146, float:4.57E-43)
            goto L_0x0118
        L_0x0133:
            r8 = 90
            goto L_0x0118
        L_0x0136:
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 == 0) goto L_0x0140
        L_0x013d:
            r8 = 119(0x77, float:1.67E-43)
            goto L_0x0118
        L_0x0140:
            r8 = 240(0xf0, float:3.36E-43)
            goto L_0x0118
        L_0x0143:
            return
        L_0x0144:
            r8 = 6
            goto L_0x0118
        L_0x0146:
            r8 = 207(0xcf, float:2.9E-43)
            goto L_0x0118
        L_0x0149:
            r8 = 340(0x154, float:4.76E-43)
            goto L_0x0118
        L_0x014c:
            r8 = 60
            goto L_0x0118
        L_0x014f:
            r8 = 375(0x177, float:5.25E-43)
            goto L_0x0118
        L_0x0152:
            java.lang.String r0 = "PAGE_MAIN_APP_REG_OTP_VERIFY"
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
        L_0x0156:
            r1.length(r8)     // Catch:{ all -> 0x04b9 }
            goto L_0x012c
        L_0x015a:
            r0 = 2
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r3 = r1.equals     // Catch:{ all -> 0x04b9 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x04b9 }
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
        L_0x0170:
            r1.length(r15)     // Catch:{ all -> 0x04b9 }
            goto L_0x012c
        L_0x0174:
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 29
            r8 = 29
            goto L_0x0118
        L_0x0180:
            r8 = 229(0xe5, float:3.21E-43)
            goto L_0x0118
        L_0x0183:
            r8 = 196(0xc4, float:2.75E-43)
            goto L_0x0118
        L_0x0186:
            r8 = 206(0xce, float:2.89E-43)
            goto L_0x0118
        L_0x0189:
            r8 = 245(0xf5, float:3.43E-43)
            goto L_0x0118
        L_0x018c:
            int r0 = b     // Catch:{ all -> 0x04b9 }
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0170
        L_0x0191:
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x012c
        L_0x01a0:
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 58
            r8 = 58
            goto L_0x0118
        L_0x01ad:
            r8 = 341(0x155, float:4.78E-43)
            goto L_0x0118
        L_0x01b1:
            r8 = 13
            goto L_0x0118
        L_0x01b5:
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 == r5) goto L_0x01c7
            r3 = 41
            if (r0 == r3) goto L_0x01c1
            goto L_0x01c7
        L_0x01c1:
            r0 = 121(0x79, float:1.7E-43)
            r8 = 121(0x79, float:1.7E-43)
            goto L_0x0118
        L_0x01c7:
            r0 = 114(0x72, float:1.6E-43)
            r8 = 114(0x72, float:1.6E-43)
            goto L_0x0118
        L_0x01cd:
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 89
            r8 = 89
            goto L_0x0118
        L_0x01da:
            r8 = 182(0xb6, float:2.55E-43)
            goto L_0x0118
        L_0x01de:
            r8 = 7
            goto L_0x0118
        L_0x01e1:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x04b9 }
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0170
        L_0x01e6:
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            b = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x012c
        L_0x01f6:
            r1.length(r14)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 113(0x71, float:1.58E-43)
            r8 = 113(0x71, float:1.58E-43)
            goto L_0x0118
        L_0x0203:
            r8 = 30
            goto L_0x0118
        L_0x0207:
            r8 = 266(0x10a, float:3.73E-43)
            goto L_0x0118
        L_0x020b:
            r8 = 59
            goto L_0x0118
        L_0x020f:
            r8 = 384(0x180, float:5.38E-43)
            goto L_0x0118
        L_0x0213:
            r8 = 223(0xdf, float:3.12E-43)
            goto L_0x0118
        L_0x0217:
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 158(0x9e, float:2.21E-43)
            r8 = 158(0x9e, float:2.21E-43)
            goto L_0x0118
        L_0x0224:
            r8 = 380(0x17c, float:5.32E-43)
            goto L_0x0118
        L_0x0228:
            r8 = 117(0x75, float:1.64E-43)
            goto L_0x0118
        L_0x022c:
            r1.length(r14)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 181(0xb5, float:2.54E-43)
            r8 = 181(0xb5, float:2.54E-43)
            goto L_0x0118
        L_0x0239:
            r8 = 227(0xe3, float:3.18E-43)
            goto L_0x0118
        L_0x023d:
            r8 = 125(0x7d, float:1.75E-43)
            goto L_0x0118
        L_0x0241:
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 == 0) goto L_0x013d
            goto L_0x0140
        L_0x024a:
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x04b9 }
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0170
        L_0x025c:
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x04b9 }
            o.setEncryptProxy r0 = r0.getMax     // Catch:{ all -> 0x04b9 }
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x026e:
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.setEncryptProxy r0 = (o.setEncryptProxy) r0     // Catch:{ all -> 0x04b9 }
            java.lang.String r0 = r0.getAction()     // Catch:{ all -> 0x04b9 }
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x0282:
            r0 = 256(0x100, float:3.59E-43)
            r1.length(r0)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 195(0xc3, float:2.73E-43)
            r8 = 195(0xc3, float:2.73E-43)
            goto L_0x0118
        L_0x0291:
            r8 = 214(0xd6, float:3.0E-43)
            goto L_0x0118
        L_0x0295:
            r8 = 9
            goto L_0x0118
        L_0x0299:
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x04b9 }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x04b9 }
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x02ab:
            java.lang.String r0 = "PAGE_NORMAL_LOGIN"
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x02b1:
            r0 = 2
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r3 = r1.equals     // Catch:{ all -> 0x04b9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04b9 }
            r0.setMin(r3)     // Catch:{ all -> 0x04b9 }
            goto L_0x012c
        L_0x02ca:
            r8 = 62
            goto L_0x0118
        L_0x02ce:
            r8 = 159(0x9f, float:2.23E-43)
            goto L_0x0118
        L_0x02d2:
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            r3 = 17
            r14 = 33
            if (r0 == r3) goto L_0x02e6
            if (r0 == r14) goto L_0x02e0
            goto L_0x02e6
        L_0x02e0:
            r0 = 20
            r8 = 20
            goto L_0x0118
        L_0x02e6:
            r0 = 331(0x14b, float:4.64E-43)
            r8 = 331(0x14b, float:4.64E-43)
            goto L_0x0118
        L_0x02ec:
            r14 = 33
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 == 0) goto L_0x02fb
            r0 = 184(0xb8, float:2.58E-43)
            r8 = 184(0xb8, float:2.58E-43)
            goto L_0x0118
        L_0x02fb:
            r0 = 416(0x1a0, float:5.83E-43)
            r8 = 416(0x1a0, float:5.83E-43)
            goto L_0x0118
        L_0x0301:
            r14 = 33
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 213(0xd5, float:2.98E-43)
            r8 = 213(0xd5, float:2.98E-43)
            goto L_0x0118
        L_0x0310:
            r14 = 33
            r8 = 201(0xc9, float:2.82E-43)
            goto L_0x0118
        L_0x0316:
            r14 = 33
            java.lang.String r0 = "PAGE_RISK_TRUST_LOGIN"
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x031e:
            r14 = 33
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 221(0xdd, float:3.1E-43)
            r8 = 221(0xdd, float:3.1E-43)
            goto L_0x0118
        L_0x032d:
            r14 = 33
            r8 = 33
            goto L_0x0118
        L_0x0333:
            r8 = 15
            goto L_0x0118
        L_0x0337:
            r14 = 33
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            r3 = 43
            if (r0 == r3) goto L_0x034a
            r3 = 68
            r0 = 202(0xca, float:2.83E-43)
            r8 = 202(0xca, float:2.83E-43)
            goto L_0x0118
        L_0x034a:
            r8 = 1
            goto L_0x0118
        L_0x034d:
            r14 = 33
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x04b9 }
            throw r0     // Catch:{ all -> 0x04b9 }
        L_0x0359:
            r14 = 33
            r8 = 127(0x7f, float:1.78E-43)
            goto L_0x0118
        L_0x035f:
            r14 = 33
            r0 = 256(0x100, float:3.59E-43)
            r1.length(r0)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 239(0xef, float:3.35E-43)
            r8 = 239(0xef, float:3.35E-43)
            goto L_0x0118
        L_0x0370:
            r14 = 33
            r8 = 338(0x152, float:4.74E-43)
            goto L_0x0118
        L_0x0376:
            r14 = 33
            r8 = 243(0xf3, float:3.4E-43)
            goto L_0x0118
        L_0x037c:
            r14 = 33
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x04b9 }
            r1.setMin = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0170
        L_0x0390:
            r14 = 33
            r1.length(r6)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            r3 = -1874218814(0xffffffff9049b0c2, float:-3.977643E-29)
            if (r0 == r3) goto L_0x03b6
            r3 = -1473941087(0xffffffffa82571a1, float:-9.183979E-15)
            if (r0 == r3) goto L_0x03b0
            r3 = 520970604(0x1f0d616c, float:2.9938497E-20)
            if (r0 == r3) goto L_0x03aa
            r0 = 340(0x154, float:4.76E-43)
            goto L_0x0149
        L_0x03aa:
            r0 = 24
            r8 = 24
            goto L_0x0118
        L_0x03b0:
            r0 = 208(0xd0, float:2.91E-43)
            r8 = 208(0xd0, float:2.91E-43)
            goto L_0x0118
        L_0x03b6:
            r0 = 216(0xd8, float:3.03E-43)
            r8 = 216(0xd8, float:3.03E-43)
            goto L_0x0118
        L_0x03bc:
            r14 = 33
            r8 = 183(0xb7, float:2.56E-43)
            goto L_0x0118
        L_0x03c2:
            r14 = 33
            r1.length(r11)     // Catch:{ all -> 0x04b9 }
            int r0 = r1.setMax     // Catch:{ all -> 0x04b9 }
            if (r0 != 0) goto L_0x04b6
            r0 = 265(0x109, float:3.71E-43)
            r8 = 265(0x109, float:3.71E-43)
            goto L_0x0118
        L_0x03d1:
            r14 = 33
            r8 = 225(0xe1, float:3.15E-43)
            goto L_0x0118
        L_0x03d7:
            r14 = 33
            r8 = 31
            goto L_0x0118
        L_0x03dd:
            r14 = 33
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x04b9 }
            java.lang.String r0 = r0.isInside     // Catch:{ all -> 0x04b9 }
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x03f1:
            r14 = 33
            r1.setMin = r6     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x04b9 }
            java.lang.String r0 = r0.getMin     // Catch:{ all -> 0x04b9 }
            r1.toIntRange = r0     // Catch:{ all -> 0x04b9 }
            goto L_0x0156
        L_0x0405:
            r14 = 33
            r1.setMin = r3     // Catch:{ all -> 0x04b9 }
            r1.length(r3)     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x04b9 }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r3 = r1.equals     // Catch:{ all -> 0x04b9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04b9 }
            r1.length(r13)     // Catch:{ all -> 0x04b9 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x04b9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x04b9 }
            r0.getMax(r3, r8)     // Catch:{ all -> 0x04b9 }
            goto L_0x012c
        L_0x0426:
            r14 = 33
            r8 = 346(0x15a, float:4.85E-43)
            goto L_0x0118
        L_0x042c:
            r3 = 33
            r1.length(r14)     // Catch:{ all -> 0x04ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x04b6
            r0 = 304(0x130, float:4.26E-43)
            r8 = 304(0x130, float:4.26E-43)
            goto L_0x0118
        L_0x043b:
            r3 = 33
            r8 = 19
            goto L_0x0118
        L_0x0441:
            r3 = 33
            r1.length(r11)     // Catch:{ all -> 0x04ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x04b6
            r0 = 325(0x145, float:4.55E-43)
            r8 = 325(0x145, float:4.55E-43)
            goto L_0x0118
        L_0x0450:
            r3 = 33
            r8 = 344(0x158, float:4.82E-43)
            goto L_0x0118
        L_0x0456:
            r3 = 33
            r8 = 336(0x150, float:4.71E-43)
            goto L_0x0118
        L_0x045c:
            r8 = 305(0x131, float:4.27E-43)
            goto L_0x0118
        L_0x0460:
            r3 = 33
            r8 = 343(0x157, float:4.8E-43)
            goto L_0x0118
        L_0x0466:
            r8 = 34
            goto L_0x0118
        L_0x046a:
            r3 = 33
            r1.length(r6)     // Catch:{ all -> 0x04ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x047c
            if (r0 == r6) goto L_0x0476
            goto L_0x047c
        L_0x0476:
            r0 = 189(0xbd, float:2.65E-43)
            r8 = 189(0xbd, float:2.65E-43)
            goto L_0x0118
        L_0x047c:
            r0 = 230(0xe6, float:3.22E-43)
            r8 = 230(0xe6, float:3.22E-43)
            goto L_0x0118
        L_0x0482:
            r3 = 33
            r1.length(r11)     // Catch:{ all -> 0x04ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x04b6
            r0 = 374(0x176, float:5.24E-43)
            r8 = 374(0x176, float:5.24E-43)
            goto L_0x0118
        L_0x0491:
            r3 = 33
            r8 = 222(0xde, float:3.11E-43)
            goto L_0x0118
        L_0x0497:
            r8 = 274(0x112, float:3.84E-43)
            goto L_0x0118
        L_0x049b:
            r8 = 11
            goto L_0x0118
        L_0x049f:
            r3 = 33
            r1.length(r11)     // Catch:{ all -> 0x04ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x04b6
            r0 = 413(0x19d, float:5.79E-43)
            r8 = 413(0x19d, float:5.79E-43)
            goto L_0x0118
        L_0x04ae:
            r0 = move-exception
            goto L_0x04bc
        L_0x04b0:
            r3 = 33
            r8 = 382(0x17e, float:5.35E-43)
            goto L_0x0118
        L_0x04b6:
            r8 = r12
            goto L_0x0118
        L_0x04b9:
            r0 = move-exception
            r3 = 33
        L_0x04bc:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r11 = r8 | 2368(0x940, float:3.318E-42)
            short r11 = (short) r11
            r13 = 11228(0x2bdc, float:1.5734E-41)
            short r13 = (short) r13
            java.lang.String r8 = length(r8, r11, r13)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            r11 = 414(0x19e, float:5.8E-43)
            r13 = 415(0x19f, float:5.82E-43)
            if (r8 == 0) goto L_0x04e7
            if (r12 < r7) goto L_0x04e7
            if (r12 > r10) goto L_0x04e7
        L_0x04dd:
            r3 = 274(0x112, float:3.84E-43)
            r5 = 305(0x131, float:4.27E-43)
            r8 = 415(0x19f, float:5.82E-43)
        L_0x04e3:
            r16 = 15
            goto L_0x0640
        L_0x04e7:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r14 = 2432(0x980, float:3.408E-42)
            short r14 = (short) r14
            r15 = 14148(0x3744, float:1.9826E-41)
            short r15 = (short) r15
            java.lang.String r8 = length(r8, r14, r15)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x050d
            r8 = 54
            if (r12 < r8) goto L_0x050d
            if (r12 > r10) goto L_0x050d
        L_0x0506:
            r3 = 274(0x112, float:3.84E-43)
            r5 = 305(0x131, float:4.27E-43)
            r8 = 414(0x19e, float:5.8E-43)
            goto L_0x04e3
        L_0x050d:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            java.lang.String r8 = length(r8, r14, r15)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0529
            r8 = 90
            if (r12 < r8) goto L_0x0529
            r8 = 91
            if (r12 > r8) goto L_0x0529
            goto L_0x04dd
        L_0x0529:
            r8 = 185(0xb9, float:2.59E-43)
            if (r12 < r8) goto L_0x0538
            r8 = 189(0xbd, float:2.65E-43)
            if (r12 > r8) goto L_0x0538
            r8 = 224(0xe0, float:3.14E-43)
        L_0x0533:
            r3 = 274(0x112, float:3.84E-43)
            r5 = 305(0x131, float:4.27E-43)
            goto L_0x04e3
        L_0x0538:
            r8 = 234(0xea, float:3.28E-43)
            if (r12 < r8) goto L_0x0543
            r8 = 240(0xf0, float:3.36E-43)
            if (r12 > r8) goto L_0x0543
            r8 = 383(0x17f, float:5.37E-43)
            goto L_0x0533
        L_0x0543:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            int r14 = setMax
            r14 = r14 | 2336(0x920, float:3.273E-42)
            short r14 = (short) r14
            r15 = 8656(0x21d0, float:1.213E-41)
            short r15 = (short) r15
            java.lang.String r8 = length(r8, r14, r15)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0567
            r8 = 231(0xe7, float:3.24E-43)
            if (r12 < r8) goto L_0x0567
            r8 = 240(0xf0, float:3.36E-43)
            if (r12 > r8) goto L_0x0567
            goto L_0x0506
        L_0x0567:
            byte[] r8 = setMin
            byte r14 = r8[r9]
            byte r14 = (byte) r14
            r3 = 2427(0x97b, float:3.401E-42)
            short r3 = (short) r3
            r16 = 15
            byte r8 = r8[r16]
            short r8 = (short) r8
            java.lang.String r3 = length(r14, r3, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0592
            r3 = 232(0xe8, float:3.25E-43)
            if (r12 < r3) goto L_0x0592
            r3 = 233(0xe9, float:3.27E-43)
            if (r12 > r3) goto L_0x0592
        L_0x058a:
            r3 = 274(0x112, float:3.84E-43)
            r5 = 305(0x131, float:4.27E-43)
        L_0x058e:
            r8 = 415(0x19f, float:5.82E-43)
            goto L_0x0640
        L_0x0592:
            byte[] r3 = setMin
            byte r3 = r3[r9]
            byte r3 = (byte) r3
            r8 = 2424(0x978, float:3.397E-42)
            short r8 = (short) r8
            r14 = 14181(0x3765, float:1.9872E-41)
            short r14 = (short) r14
            java.lang.String r3 = length(r3, r8, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x05bb
            r3 = 241(0xf1, float:3.38E-43)
            if (r12 < r3) goto L_0x05bb
            r3 = 242(0xf2, float:3.39E-43)
            if (r12 > r3) goto L_0x05bb
        L_0x05b3:
            r3 = 274(0x112, float:3.84E-43)
            r5 = 305(0x131, float:4.27E-43)
        L_0x05b7:
            r8 = 414(0x19e, float:5.8E-43)
            goto L_0x0640
        L_0x05bb:
            byte[] r3 = setMin
            byte r3 = r3[r9]
            byte r3 = (byte) r3
            int r5 = setMax
            r5 = r5 | 2336(0x920, float:3.273E-42)
            short r5 = (short) r5
            java.lang.String r3 = length(r3, r5, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x05dc
            r3 = 245(0xf5, float:3.43E-43)
            if (r12 < r3) goto L_0x05dc
            r3 = 246(0xf6, float:3.45E-43)
            if (r12 > r3) goto L_0x05dc
            goto L_0x05b3
        L_0x05dc:
            byte[] r3 = setMin
            byte r3 = r3[r9]
            byte r3 = (byte) r3
            java.lang.String r3 = length(r3, r8, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x05f8
            r3 = 261(0x105, float:3.66E-43)
            if (r12 < r3) goto L_0x05f8
            r3 = 266(0x10a, float:3.73E-43)
            if (r12 > r3) goto L_0x05f8
            goto L_0x058a
        L_0x05f8:
            byte[] r3 = setMin
            byte r3 = r3[r9]
            byte r3 = (byte) r3
            r5 = 2439(0x987, float:3.418E-42)
            short r5 = (short) r5
            r8 = 7187(0x1c13, float:1.0071E-41)
            short r8 = (short) r8
            java.lang.String r3 = length(r3, r5, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x061b
            r3 = 274(0x112, float:3.84E-43)
            if (r12 < r3) goto L_0x061d
            r5 = 305(0x131, float:4.27E-43)
            if (r12 > r5) goto L_0x061d
            goto L_0x058e
        L_0x061b:
            r3 = 274(0x112, float:3.84E-43)
        L_0x061d:
            byte[] r5 = setMin
            byte r5 = r5[r9]
            byte r5 = (byte) r5
            r8 = 2428(0x97c, float:3.402E-42)
            short r8 = (short) r8
            r13 = r8 & 208(0xd0, float:2.91E-43)
            short r13 = (short) r13
            java.lang.String r5 = length(r5, r8, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x064b
            r5 = 299(0x12b, float:4.19E-43)
            if (r12 < r5) goto L_0x064b
            r5 = 305(0x131, float:4.27E-43)
            if (r12 > r5) goto L_0x064b
            goto L_0x05b7
        L_0x0640:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r5 = 11
            goto L_0x0118
        L_0x064b:
            throw r0
        L_0x064c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0654
            throw r1
        L_0x0654:
            goto L_0x0656
        L_0x0655:
            throw r0
        L_0x0656:
            goto L_0x0655
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.IsOverlapping():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ int equals(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = r0 | 2226(0x8b2, float:3.119E-42)
            short r2 = (short) r2
            r3 = 15181(0x3b4d, float:2.1273E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r3 = r2 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x028e }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x028e }
            byte[] r2 = setMin     // Catch:{ all -> 0x028e }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r6]     // Catch:{ all -> 0x028e }
            byte r2 = (byte) r2     // Catch:{ all -> 0x028e }
            r7 = 2442(0x98a, float:3.422E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x028e }
            int r8 = setMax     // Catch:{ all -> 0x028e }
            r8 = r8 | 11522(0x2d02, float:1.6146E-41)
            short r8 = (short) r8     // Catch:{ all -> 0x028e }
            java.lang.String r2 = length(r2, r7, r8)     // Catch:{ all -> 0x028e }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x028e }
            byte[] r8 = setMin     // Catch:{ all -> 0x028e }
            r9 = 7213(0x1c2d, float:1.0108E-41)
            byte r8 = r8[r9]     // Catch:{ all -> 0x028e }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x028e }
            r9 = 2453(0x995, float:3.437E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x028e }
            r10 = 1053(0x41d, float:1.476E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x028e }
            java.lang.String r8 = length(r8, r9, r10)     // Catch:{ all -> 0x028e }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x028e }
            byte[] r10 = setMin     // Catch:{ all -> 0x028e }
            byte r10 = r10[r6]     // Catch:{ all -> 0x028e }
            byte r10 = (byte) r10     // Catch:{ all -> 0x028e }
            int r11 = setMax     // Catch:{ all -> 0x028e }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x028e }
            java.lang.String r10 = length(r10, r7, r11)     // Catch:{ all -> 0x028e }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x028e }
            r9[r5] = r10     // Catch:{ all -> 0x028e }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r9)     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch:{ all -> 0x028e }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x028e }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x007c:
            int r8 = r0.length
            if (r4 >= r8) goto L_0x010d
            r8 = r0[r4]
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0104 }
            r9[r5] = r8     // Catch:{ all -> 0x0104 }
            byte[] r8 = setMin     // Catch:{ all -> 0x0104 }
            byte r8 = r8[r6]     // Catch:{ all -> 0x0104 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0104 }
            r10 = 2441(0x989, float:3.42E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0104 }
            int r11 = setMax     // Catch:{ all -> 0x0104 }
            r11 = r11 & 480(0x1e0, float:6.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            java.lang.String r8 = length(r8, r10, r11)     // Catch:{ all -> 0x0104 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0104 }
            r11 = 74
            byte r11 = (byte) r11     // Catch:{ all -> 0x0104 }
            r12 = 2451(0x993, float:3.435E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            r13 = 13879(0x3637, float:1.9449E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0104 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0104 }
            byte r13 = r13[r6]     // Catch:{ all -> 0x0104 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0104 }
            int r14 = setMax     // Catch:{ all -> 0x0104 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r13 = length(r13, r7, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0104 }
            r12[r5] = r13     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x0104 }
            r11 = 0
            java.lang.Object r8 = r8.invoke(r11, r9)     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x00fb }
            byte r9 = r9[r6]     // Catch:{ all -> 0x00fb }
            byte r9 = (byte) r9     // Catch:{ all -> 0x00fb }
            int r12 = setMax     // Catch:{ all -> 0x00fb }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = length(r9, r10, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x00fb }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r6]     // Catch:{ all -> 0x00fb }
            int r10 = r10 - r3
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x00fb }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x00fb }
            java.lang.Object r8 = r9.invoke(r8, r11)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00fb }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00fb }
            r2[r4] = r8
            int r4 = r4 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r4 = 69
            r7 = 29
            r8 = 21
            r9 = 3
        L_0x0114:
            int r10 = r5 + 1
            r0 = r2[r5]     // Catch:{ all -> 0x01b8 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01b8 }
            r5 = 14
            switch(r0) {
                case -18: goto L_0x01a4;
                case -17: goto L_0x01a0;
                case -16: goto L_0x0198;
                case -15: goto L_0x0194;
                case -14: goto L_0x0191;
                case -13: goto L_0x0183;
                case -12: goto L_0x0176;
                case -11: goto L_0x0171;
                case -10: goto L_0x016f;
                case -9: goto L_0x015d;
                case -8: goto L_0x015a;
                case -7: goto L_0x0158;
                case -6: goto L_0x014a;
                case -5: goto L_0x013c;
                case -4: goto L_0x0133;
                case -3: goto L_0x0130;
                case -2: goto L_0x0126;
                case -1: goto L_0x0123;
                default: goto L_0x0121;
            }     // Catch:{ all -> 0x01b8 }
        L_0x0121:
            goto L_0x01b5
        L_0x0123:
            r5 = 63
            goto L_0x0114
        L_0x0126:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01b8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01b8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01b8 }
            throw r0     // Catch:{ all -> 0x01b8 }
        L_0x0130:
            r5 = 61
            goto L_0x0114
        L_0x0133:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01b8 }
            r1.setMin = r0     // Catch:{ all -> 0x01b8 }
        L_0x0137:
            r1.length(r5)     // Catch:{ all -> 0x01b8 }
            goto L_0x01b5
        L_0x013c:
            r1.setMin = r3     // Catch:{ all -> 0x01b8 }
            r1.length(r9)     // Catch:{ all -> 0x01b8 }
            r1.length(r8)     // Catch:{ all -> 0x01b8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01b8 }
            b = r0     // Catch:{ all -> 0x01b8 }
            goto L_0x01b5
        L_0x014a:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x01b8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01b8 }
            if (r0 != 0) goto L_0x01b5
            r0 = 20
            r5 = 20
            goto L_0x0114
        L_0x0158:
            r5 = 2
            goto L_0x0114
        L_0x015a:
            r5 = 69
            goto L_0x0114
        L_0x015d:
            r1.setMin = r3     // Catch:{ all -> 0x01b8 }
            r1.length(r9)     // Catch:{ all -> 0x01b8 }
            r0 = 4
            r1.length(r0)     // Catch:{ all -> 0x01b8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01b8 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01b8 }
            int r0 = r0.toFloatRange     // Catch:{ all -> 0x01b8 }
            r1.setMin = r0     // Catch:{ all -> 0x01b8 }
            goto L_0x0137
        L_0x016f:
            r5 = 3
            goto L_0x0114
        L_0x0171:
            int r0 = b     // Catch:{ all -> 0x01b8 }
            r1.setMin = r0     // Catch:{ all -> 0x01b8 }
            goto L_0x0137
        L_0x0176:
            r1.setMin = r3     // Catch:{ all -> 0x01b8 }
            r1.length(r9)     // Catch:{ all -> 0x01b8 }
            r1.length(r8)     // Catch:{ all -> 0x01b8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01b8 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01b8 }
            goto L_0x01b5
        L_0x0183:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01b8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01b8 }
            if (r0 != 0) goto L_0x01b5
            r0 = 58
            r5 = 58
            goto L_0x0114
        L_0x0191:
            r5 = 59
            goto L_0x0114
        L_0x0194:
            r5 = 21
            goto L_0x0114
        L_0x0198:
            r0 = 363(0x16b, float:5.09E-43)
            r1.length(r0)     // Catch:{ all -> 0x01b8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01b8 }
            return r0
        L_0x01a0:
            r5 = 29
            goto L_0x0114
        L_0x01a4:
            r1.length(r3)     // Catch:{ all -> 0x01b8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01b8 }
            r5 = 66
            if (r0 == 0) goto L_0x01af
            goto L_0x0114
        L_0x01af:
            r0 = 23
            r5 = 23
            goto L_0x0114
        L_0x01b5:
            r5 = r10
            goto L_0x0114
        L_0x01b8:
            r0 = move-exception
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r11 = 2439(0x987, float:3.418E-42)
            short r11 = (short) r11
            r12 = 7187(0x1c13, float:1.0071E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r11, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r11 = 70
            r12 = 24
            r13 = 28
            if (r5 == 0) goto L_0x01e0
            if (r10 < r9) goto L_0x01e0
            if (r10 > r8) goto L_0x01e0
        L_0x01dc:
            r5 = 28
            goto L_0x0283
        L_0x01e0:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r14 = 2432(0x980, float:3.408E-42)
            short r14 = (short) r14
            r15 = 14148(0x3744, float:1.9826E-41)
            short r15 = (short) r15
            java.lang.String r5 = length(r5, r14, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0200
            r5 = 16
            if (r10 < r5) goto L_0x0200
            if (r10 > r8) goto L_0x0200
            goto L_0x01dc
        L_0x0200:
            r5 = 25
            if (r10 < r5) goto L_0x0209
            if (r10 > r13) goto L_0x0209
            r5 = 1
            goto L_0x0283
        L_0x0209:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r3 = 2424(0x978, float:3.397E-42)
            short r3 = (short) r3
            r8 = 14181(0x3765, float:1.9872E-41)
            short r8 = (short) r8
            java.lang.String r3 = length(r5, r3, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0227
            if (r10 < r12) goto L_0x0227
            if (r10 > r13) goto L_0x0227
            goto L_0x01dc
        L_0x0227:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            java.lang.String r3 = length(r3, r14, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0243
            if (r10 < r7) goto L_0x0243
            r3 = 30
            if (r10 > r3) goto L_0x0243
        L_0x0240:
            r5 = 70
            goto L_0x0283
        L_0x0243:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            r5 = r3 | 2368(0x940, float:3.318E-42)
            short r5 = (short) r5
            r8 = 11228(0x2bdc, float:1.5734E-41)
            short r8 = (short) r8
            java.lang.String r3 = length(r3, r5, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0265
            r3 = 54
            if (r10 < r3) goto L_0x0265
            r3 = 55
            if (r10 > r3) goto L_0x0265
            goto L_0x0240
        L_0x0265:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            r5 = r3 | 2368(0x940, float:3.318E-42)
            short r5 = (short) r5
            java.lang.String r3 = length(r3, r5, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x028d
            r3 = 67
            if (r10 < r3) goto L_0x028d
            if (r10 > r4) goto L_0x028d
            goto L_0x01dc
        L_0x0283:
            r1.toIntRange = r0
            r1.length(r12)
            r3 = 1
            r8 = 21
            goto L_0x0114
        L_0x028d:
            throw r0
        L_0x028e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0296
            throw r1
        L_0x0296:
            goto L_0x0298
        L_0x0297:
            throw r0
        L_0x0298:
            goto L_0x0297
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.equals(o.sendSensorResult):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c9, code lost:
        if (r10 <= 85) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0133, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ed, code lost:
        r1.length(5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void equals() {
        /*
            r16 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r16
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 2062(0x80e, float:2.89E-42)
            short r3 = (short) r3
            r4 = 109(0x6d, float:1.53E-43)
            short r5 = (short) r4
            java.lang.String r0 = length(r0, r3, r5)
            byte[] r3 = setMin
            r5 = 15
            byte r3 = r3[r5]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x03c5 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x03c5 }
            byte[] r3 = setMin     // Catch:{ all -> 0x03c5 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x03c5 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x03c5 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x03c5 }
            int r10 = setMax     // Catch:{ all -> 0x03c5 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x03c5 }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x03c5 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x03c5 }
            byte[] r10 = setMin     // Catch:{ all -> 0x03c5 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x03c5 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x03c5 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x03c5 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x03c5 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x03c5 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x03c5 }
            byte[] r12 = setMin     // Catch:{ all -> 0x03c5 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x03c5 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x03c5 }
            int r13 = setMax     // Catch:{ all -> 0x03c5 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x03c5 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x03c5 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03c5 }
            r11[r7] = r12     // Catch:{ all -> 0x03c5 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x03c5 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x03c5 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x03c5 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0110
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r11[r7] = r10     // Catch:{ all -> 0x0107 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0107 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0107 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0107 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0107 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0107 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0107 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0107 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0107 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0107 }
            int r4 = setMax     // Catch:{ all -> 0x0107 }
            r4 = r4 | 11522(0x2d02, float:1.6146E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = length(r15, r9, r4)     // Catch:{ all -> 0x0107 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0107 }
            r14[r7] = r4     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r4 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0107 }
            r10 = 0
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fe }
            byte r11 = r11[r8]     // Catch:{ all -> 0x00fe }
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fe }
            int r13 = setMax     // Catch:{ all -> 0x00fe }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x00fe }
            byte[] r12 = setMin     // Catch:{ all -> 0x00fe }
            byte r12 = r12[r8]     // Catch:{ all -> 0x00fe }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x00fe }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x00fe }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r4 = r11.invoke(r4, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00fe }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00fe }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 109(0x6d, float:1.53E-43)
            goto L_0x007c
        L_0x00fe:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0106
            throw r1
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r6 = 63
        L_0x0112:
            r9 = 25
        L_0x0114:
            int r10 = r7 + 1
            r12 = 79
            r0 = r3[r7]     // Catch:{ all -> 0x025c }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x025c }
            r7 = 14
            r14 = 21
            r15 = 48
            r11 = 5
            r13 = 4
            r4 = 3
            switch(r0) {
                case -30: goto L_0x0255;
                case -29: goto L_0x023d;
                case -28: goto L_0x023a;
                case -27: goto L_0x0227;
                case -26: goto L_0x0216;
                case -25: goto L_0x0205;
                case -24: goto L_0x0201;
                case -23: goto L_0x01f1;
                case -22: goto L_0x01dd;
                case -21: goto L_0x01d9;
                case -20: goto L_0x01d5;
                case -19: goto L_0x01c8;
                case -18: goto L_0x01c4;
                case -17: goto L_0x01c0;
                case -16: goto L_0x01a1;
                case -15: goto L_0x018b;
                case -14: goto L_0x0188;
                case -13: goto L_0x0187;
                case -12: goto L_0x017d;
                case -11: goto L_0x017a;
                case -10: goto L_0x0177;
                case -9: goto L_0x0169;
                case -8: goto L_0x015b;
                case -7: goto L_0x0156;
                case -6: goto L_0x0153;
                case -5: goto L_0x0150;
                case -4: goto L_0x0146;
                case -3: goto L_0x0138;
                case -2: goto L_0x012f;
                case -1: goto L_0x012c;
                default: goto L_0x012a;
            }     // Catch:{ all -> 0x025c }
        L_0x012a:
            goto L_0x0259
        L_0x012c:
            r7 = 68
            goto L_0x0114
        L_0x012f:
            int r0 = b     // Catch:{ all -> 0x025c }
            r1.setMin = r0     // Catch:{ all -> 0x025c }
        L_0x0133:
            r1.length(r7)     // Catch:{ all -> 0x025c }
            goto L_0x0259
        L_0x0138:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r14)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x025c }
            goto L_0x0259
        L_0x0146:
            r1.length(r15)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            if (r0 != 0) goto L_0x0259
            r7 = 24
            goto L_0x0114
        L_0x0150:
            r7 = 108(0x6c, float:1.51E-43)
            goto L_0x0114
        L_0x0153:
            r7 = 66
            goto L_0x0114
        L_0x0156:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x025c }
            r1.setMin = r0     // Catch:{ all -> 0x025c }
            goto L_0x0133
        L_0x015b:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r14)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            b = r0     // Catch:{ all -> 0x025c }
            goto L_0x0259
        L_0x0169:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            if (r0 != 0) goto L_0x0259
            r0 = 56
            r7 = 56
            goto L_0x0114
        L_0x0177:
            r7 = 111(0x6f, float:1.56E-43)
            goto L_0x0114
        L_0x017a:
            r7 = 116(0x74, float:1.63E-43)
            goto L_0x0114
        L_0x017d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x025c }
            throw r0     // Catch:{ all -> 0x025c }
        L_0x0187:
            return
        L_0x0188:
            r7 = 65
            goto L_0x0114
        L_0x018b:
            r1.length(r5)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            r4 = 34
            if (r0 == r4) goto L_0x019d
            if (r0 == r12) goto L_0x0197
            goto L_0x019d
        L_0x0197:
            r0 = 58
            r7 = 58
            goto L_0x0114
        L_0x019d:
            r7 = 109(0x6d, float:1.53E-43)
            goto L_0x0114
        L_0x01a1:
            r1.setMin = r4     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x025c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x025c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x025c }
            r0.getMin(r4, r7)     // Catch:{ all -> 0x025c }
            goto L_0x0259
        L_0x01c0:
            r7 = 72
            goto L_0x0114
        L_0x01c4:
            r7 = 25
            goto L_0x0114
        L_0x01c8:
            r1.length(r15)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            if (r0 != 0) goto L_0x0259
            r0 = 84
            r7 = 84
            goto L_0x0114
        L_0x01d5:
            r7 = 113(0x71, float:1.58E-43)
            goto L_0x0114
        L_0x01d9:
            r7 = 63
            goto L_0x0114
        L_0x01dd:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x025c }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x025c }
            r1.toIntRange = r0     // Catch:{ all -> 0x025c }
        L_0x01ed:
            r1.length(r11)     // Catch:{ all -> 0x025c }
            goto L_0x0259
        L_0x01f1:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x025c }
            r0.dismissProgress()     // Catch:{ all -> 0x025c }
            goto L_0x0259
        L_0x0201:
            r7 = 92
            goto L_0x0114
        L_0x0205:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x025c }
            java.lang.String r0 = r0.getMin     // Catch:{ all -> 0x025c }
            r1.toIntRange = r0     // Catch:{ all -> 0x025c }
            goto L_0x01ed
        L_0x0216:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x025c }
            o.setEncryptProxy r0 = r0.getMax     // Catch:{ all -> 0x025c }
            r1.toIntRange = r0     // Catch:{ all -> 0x025c }
            goto L_0x01ed
        L_0x0227:
            r1.setMin = r5     // Catch:{ all -> 0x025c }
            r1.length(r4)     // Catch:{ all -> 0x025c }
            r1.length(r13)     // Catch:{ all -> 0x025c }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x025c }
            o.setEncryptProxy r0 = (o.setEncryptProxy) r0     // Catch:{ all -> 0x025c }
            java.lang.String r0 = r0.getRegistrationSource()     // Catch:{ all -> 0x025c }
            r1.toIntRange = r0     // Catch:{ all -> 0x025c }
            goto L_0x01ed
        L_0x023a:
            r7 = 1
            goto L_0x0114
        L_0x023d:
            r1.length(r5)     // Catch:{ all -> 0x025c }
            int r0 = r1.setMax     // Catch:{ all -> 0x025c }
            r4 = 44
            if (r0 == r4) goto L_0x0251
            r4 = 86
            if (r0 == r4) goto L_0x024b
            goto L_0x0251
        L_0x024b:
            r0 = 98
            r7 = 98
            goto L_0x0114
        L_0x0251:
            r7 = 85
            goto L_0x0114
        L_0x0255:
            r7 = 107(0x6b, float:1.5E-43)
            goto L_0x0114
        L_0x0259:
            r7 = r10
            goto L_0x0114
        L_0x025c:
            r0 = move-exception
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2419(0x973, float:3.39E-42)
            short r7 = (short) r7
            r11 = 13371(0x343b, float:1.8737E-41)
            short r11 = (short) r11
            java.lang.String r4 = length(r4, r7, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r13 = 106(0x6a, float:1.49E-43)
            r14 = 57
            r15 = 115(0x73, float:1.61E-43)
            if (r4 == 0) goto L_0x0286
            if (r10 < r9) goto L_0x0286
            r4 = 26
            if (r10 > r4) goto L_0x0286
        L_0x0282:
            r7 = 115(0x73, float:1.61E-43)
            goto L_0x03ba
        L_0x0286:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r5 = 2428(0x97c, float:3.402E-42)
            short r5 = (short) r5
            r9 = r5 & 208(0xd0, float:2.91E-43)
            short r9 = (short) r9
            java.lang.String r4 = length(r4, r5, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02a6
            r4 = 51
            if (r10 < r4) goto L_0x02a6
            if (r10 > r14) goto L_0x02a6
            goto L_0x0282
        L_0x02a6:
            r4 = 59
            if (r10 < r4) goto L_0x02b0
            if (r10 > r6) goto L_0x02b0
            r7 = 106(0x6a, float:1.49E-43)
            goto L_0x03ba
        L_0x02b0:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r7, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02cc
            r4 = 72
            if (r10 < r4) goto L_0x02ce
            r5 = 85
            if (r10 > r5) goto L_0x02ce
            goto L_0x0282
        L_0x02cc:
            r4 = 72
        L_0x02ce:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r7, r11)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02e8
            if (r10 < r12) goto L_0x02e8
            r5 = 80
            if (r10 > r5) goto L_0x02e8
            goto L_0x0282
        L_0x02e8:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            int r7 = setMax
            r7 = r7 | 2336(0x920, float:3.273E-42)
            short r7 = (short) r7
            r9 = 8656(0x21d0, float:1.213E-41)
            short r9 = (short) r9
            java.lang.String r5 = length(r5, r7, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x030f
            r5 = 93
            if (r10 < r5) goto L_0x030f
            r5 = 94
            if (r10 > r5) goto L_0x030f
        L_0x030b:
            r7 = 57
            goto L_0x03ba
        L_0x030f:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            r7 = 2432(0x980, float:3.408E-42)
            short r7 = (short) r7
            r11 = 14148(0x3744, float:1.9826E-41)
            short r11 = (short) r11
            java.lang.String r5 = length(r5, r7, r11)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0331
            r5 = 95
            if (r10 < r5) goto L_0x0331
            r5 = 96
            if (r10 > r5) goto L_0x0331
        L_0x0330:
            goto L_0x030b
        L_0x0331:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            r12 = 2439(0x987, float:3.418E-42)
            short r12 = (short) r12
            r4 = 7187(0x1c13, float:1.0071E-41)
            short r4 = (short) r4
            java.lang.String r5 = length(r5, r12, r4)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0354
            r5 = 96
            if (r10 < r5) goto L_0x0354
            r5 = 98
            if (r10 > r5) goto L_0x0354
            goto L_0x0282
        L_0x0354:
            r5 = 103(0x67, float:1.44E-43)
            if (r10 < r5) goto L_0x035f
            if (r10 > r13) goto L_0x035f
            r4 = 91
            r7 = 91
            goto L_0x03ba
        L_0x035f:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r7, r11)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x037b
            r5 = 99
            if (r10 < r5) goto L_0x037b
            r5 = 100
            if (r10 > r5) goto L_0x037b
            goto L_0x0330
        L_0x037b:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            int r7 = setMax
            r7 = r7 | 2336(0x920, float:3.273E-42)
            short r7 = (short) r7
            java.lang.String r5 = length(r5, r7, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x039d
            r5 = 100
            if (r10 < r5) goto L_0x039d
            r5 = 101(0x65, float:1.42E-43)
            if (r10 > r5) goto L_0x039d
            goto L_0x0282
        L_0x039d:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r4 = length(r5, r12, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x03c4
            r4 = 102(0x66, float:1.43E-43)
            if (r10 < r4) goto L_0x03c4
            r4 = 103(0x67, float:1.44E-43)
            if (r10 > r4) goto L_0x03c4
            goto L_0x0282
        L_0x03ba:
            r1.toIntRange = r0
            r4 = 24
            r1.length(r4)
            r5 = 1
            goto L_0x0112
        L_0x03c4:
            throw r0
        L_0x03c5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03cd
            throw r1
        L_0x03cd:
            goto L_0x03cf
        L_0x03ce:
            throw r0
        L_0x03cf:
            goto L_0x03ce
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.equals():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void getMax(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r16
            r0 = r17
            r3 = r18
            r1.<init>(r2, r0, r3)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = r0 | 2130(0x852, float:2.985E-42)
            short r3 = (short) r3
            r4 = 11273(0x2c09, float:1.5797E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0394 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x0394 }
            byte[] r3 = setMin     // Catch:{ all -> 0x0394 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x0394 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0394 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0394 }
            int r10 = setMax     // Catch:{ all -> 0x0394 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x0394 }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x0394 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0394 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0394 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0394 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0394 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0394 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0394 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x0394 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0394 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0394 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0394 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0394 }
            int r13 = setMax     // Catch:{ all -> 0x0394 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0394 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x0394 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0394 }
            r11[r7] = r12     // Catch:{ all -> 0x0394 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x0394 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x0394 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0394 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x0080:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0114
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x010b }
            r11[r7] = r10     // Catch:{ all -> 0x010b }
            byte[] r10 = setMin     // Catch:{ all -> 0x010b }
            byte r10 = r10[r8]     // Catch:{ all -> 0x010b }
            byte r10 = (byte) r10     // Catch:{ all -> 0x010b }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x010b }
            int r13 = setMax     // Catch:{ all -> 0x010b }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x010b }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x010b }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x010b }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x010b }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x010b }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            byte[] r15 = setMin     // Catch:{ all -> 0x010b }
            byte r15 = r15[r8]     // Catch:{ all -> 0x010b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010b }
            int r4 = setMax     // Catch:{ all -> 0x010b }
            r4 = r4 | 11522(0x2d02, float:1.6146E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x010b }
            java.lang.String r4 = length(r15, r9, r4)     // Catch:{ all -> 0x010b }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x010b }
            r14[r7] = r4     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r4 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x010b }
            r10 = 0
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x0102 }
            byte r11 = r11[r8]     // Catch:{ all -> 0x0102 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0102 }
            int r13 = setMax     // Catch:{ all -> 0x0102 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0102 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0102 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0102 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0102 }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0102 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Object r4 = r11.invoke(r4, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0102 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0102 }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 15
            goto L_0x0080
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010a
            throw r1
        L_0x010a:
            throw r0
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r4 = 37
            r6 = 22
            r9 = 81
        L_0x011a:
            int r10 = r7 + 1
            r11 = 64
            r12 = 21
            r0 = r3[r7]     // Catch:{ all -> 0x022e }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x022e }
            r7 = 14
            r13 = 48
            r14 = 4
            r15 = 3
            switch(r0) {
                case -28: goto L_0x021a;
                case -27: goto L_0x0216;
                case -26: goto L_0x0206;
                case -25: goto L_0x0202;
                case -24: goto L_0x01fe;
                case -23: goto L_0x01fa;
                case -22: goto L_0x01f9;
                case -21: goto L_0x01eb;
                case -20: goto L_0x01e7;
                case -19: goto L_0x01c9;
                case -18: goto L_0x01c5;
                case -17: goto L_0x01c1;
                case -16: goto L_0x01b4;
                case -15: goto L_0x01a1;
                case -14: goto L_0x018b;
                case -13: goto L_0x0188;
                case -12: goto L_0x0185;
                case -11: goto L_0x0179;
                case -10: goto L_0x0176;
                case -9: goto L_0x0173;
                case -8: goto L_0x0167;
                case -7: goto L_0x015d;
                case -6: goto L_0x015a;
                case -5: goto L_0x0157;
                case -4: goto L_0x014b;
                case -3: goto L_0x013d;
                case -2: goto L_0x0134;
                case -1: goto L_0x0131;
                default: goto L_0x012f;
            }     // Catch:{ all -> 0x022e }
        L_0x012f:
            goto L_0x022b
        L_0x0131:
            r7 = 85
            goto L_0x011a
        L_0x0134:
            int r0 = b     // Catch:{ all -> 0x022e }
            r1.setMin = r0     // Catch:{ all -> 0x022e }
        L_0x0138:
            r1.length(r7)     // Catch:{ all -> 0x022e }
            goto L_0x022b
        L_0x013d:
            r1.setMin = r5     // Catch:{ all -> 0x022e }
            r1.length(r15)     // Catch:{ all -> 0x022e }
            r1.length(r12)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x022e }
            goto L_0x022b
        L_0x014b:
            r1.length(r13)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            if (r0 != 0) goto L_0x022b
            r0 = 20
            r7 = 20
            goto L_0x011a
        L_0x0157:
            r7 = 88
            goto L_0x011a
        L_0x015a:
            r7 = 73
            goto L_0x011a
        L_0x015d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x022e }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x022e }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x022e }
            throw r0     // Catch:{ all -> 0x022e }
        L_0x0167:
            r1.length(r13)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            if (r0 != 0) goto L_0x022b
            r0 = 36
            r7 = 36
            goto L_0x011a
        L_0x0173:
            r7 = 69
            goto L_0x011a
        L_0x0176:
            r7 = 81
            goto L_0x011a
        L_0x0179:
            r1.length(r13)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            if (r0 != 0) goto L_0x022b
            r0 = 56
            r7 = 56
            goto L_0x011a
        L_0x0185:
            r7 = 68
            goto L_0x011a
        L_0x0188:
            r7 = 58
            goto L_0x011a
        L_0x018b:
            r1.setMin = r5     // Catch:{ all -> 0x022e }
            r1.length(r15)     // Catch:{ all -> 0x022e }
            r1.length(r14)     // Catch:{ all -> 0x022e }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x022e }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x022e }
            o.setEncryptProxy r0 = r0.getMax     // Catch:{ all -> 0x022e }
            r1.toIntRange = r0     // Catch:{ all -> 0x022e }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x022e }
            goto L_0x022b
        L_0x01a1:
            r1.setMin = r5     // Catch:{ all -> 0x022e }
            r1.length(r15)     // Catch:{ all -> 0x022e }
            r1.length(r14)     // Catch:{ all -> 0x022e }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x022e }
            o.setEncryptProxy r0 = (o.setEncryptProxy) r0     // Catch:{ all -> 0x022e }
            boolean r0 = r0.isVerificationMethodBoku()     // Catch:{ all -> 0x022e }
            r1.setMin = r0     // Catch:{ all -> 0x022e }
            goto L_0x0138
        L_0x01b4:
            r1.length(r13)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            if (r0 != 0) goto L_0x022b
            r0 = 63
            r7 = 63
            goto L_0x011a
        L_0x01c1:
            r7 = 83
            goto L_0x011a
        L_0x01c5:
            r7 = 95
            goto L_0x011a
        L_0x01c9:
            r1.setMin = r15     // Catch:{ all -> 0x022e }
            r1.length(r15)     // Catch:{ all -> 0x022e }
            r1.length(r14)     // Catch:{ all -> 0x022e }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x022e }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x022e }
            r1.length(r14)     // Catch:{ all -> 0x022e }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x022e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x022e }
            r1.length(r14)     // Catch:{ all -> 0x022e }
            java.lang.Object r13 = r1.equals     // Catch:{ all -> 0x022e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x022e }
            r0.getMin((java.lang.String) r7, (java.lang.String) r13)     // Catch:{ all -> 0x022e }
            goto L_0x022b
        L_0x01e7:
            r7 = 71
            goto L_0x011a
        L_0x01eb:
            r1.length(r5)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            r7 = 91
            if (r0 == 0) goto L_0x01f6
            goto L_0x011a
        L_0x01f6:
            r7 = 1
            goto L_0x011a
        L_0x01f9:
            return
        L_0x01fa:
            r7 = 94
            goto L_0x011a
        L_0x01fe:
            r7 = 70
            goto L_0x011a
        L_0x0202:
            r7 = 37
            goto L_0x011a
        L_0x0206:
            r1.setMin = r5     // Catch:{ all -> 0x022e }
            r1.length(r15)     // Catch:{ all -> 0x022e }
            r1.length(r14)     // Catch:{ all -> 0x022e }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x022e }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x022e }
            r0.setMin()     // Catch:{ all -> 0x022e }
            goto L_0x022b
        L_0x0216:
            r7 = 22
            goto L_0x011a
        L_0x021a:
            r1.length(r5)     // Catch:{ all -> 0x022e }
            int r0 = r1.setMax     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x0225
            r7 = 64
            goto L_0x011a
        L_0x0225:
            r0 = 75
            r7 = 75
            goto L_0x011a
        L_0x022b:
            r7 = r10
            goto L_0x011a
        L_0x022e:
            r0 = move-exception
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r13 = r7 | 2368(0x940, float:3.318E-42)
            short r13 = (short) r13
            r14 = 11228(0x2bdc, float:1.5734E-41)
            short r14 = (short) r14
            java.lang.String r7 = length(r7, r13, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            r13 = 57
            if (r7 == 0) goto L_0x0254
            if (r10 < r5) goto L_0x0254
            if (r10 > r12) goto L_0x0254
        L_0x024e:
            r6 = 15
        L_0x0250:
            r7 = 21
            goto L_0x0385
        L_0x0254:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            int r14 = setMax
            r14 = r14 | 2336(0x920, float:3.273E-42)
            short r14 = (short) r14
            r15 = 8656(0x21d0, float:1.213E-41)
            short r15 = (short) r15
            java.lang.String r7 = length(r7, r14, r15)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x027b
            r7 = 16
            if (r10 < r7) goto L_0x027b
            if (r10 > r12) goto L_0x027b
        L_0x0275:
            r6 = 15
            r7 = 57
            goto L_0x0385
        L_0x027b:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r14 = 2424(0x978, float:3.397E-42)
            short r14 = (short) r14
            r5 = 14181(0x3765, float:1.9872E-41)
            short r5 = (short) r5
            java.lang.String r7 = length(r7, r14, r5)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x029b
            if (r10 < r6) goto L_0x029b
            r7 = 23
            if (r10 > r7) goto L_0x029b
            goto L_0x024e
        L_0x029b:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            int r6 = setMax
            r6 = r6 | 2336(0x920, float:3.273E-42)
            short r6 = (short) r6
            java.lang.String r6 = length(r7, r6, r15)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02bc
            r6 = 31
            if (r10 < r6) goto L_0x02bc
            r6 = 32
            if (r10 > r6) goto L_0x02bc
            goto L_0x024e
        L_0x02bc:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            r7 = 2427(0x97b, float:3.401E-42)
            short r7 = (short) r7
            r12 = 14097(0x3711, float:1.9754E-41)
            short r12 = (short) r12
            java.lang.String r6 = length(r6, r7, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02db
            if (r10 < r4) goto L_0x02db
            if (r10 > r13) goto L_0x02db
            goto L_0x024e
        L_0x02db:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            r12 = 2419(0x973, float:3.39E-42)
            short r12 = (short) r12
            r4 = 13371(0x343b, float:1.8737E-41)
            short r4 = (short) r4
            java.lang.String r6 = length(r6, r12, r4)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02fe
            r6 = 51
            if (r10 < r6) goto L_0x02fe
            r6 = 52
            if (r10 > r6) goto L_0x02fe
            goto L_0x0275
        L_0x02fe:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            java.lang.String r5 = length(r6, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0319
            r5 = 59
            if (r10 < r5) goto L_0x0319
            if (r10 > r11) goto L_0x0319
            goto L_0x024e
        L_0x0319:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            int r6 = setMax
            r6 = r6 | 2336(0x920, float:3.273E-42)
            short r6 = (short) r6
            java.lang.String r5 = length(r5, r6, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x033b
            r5 = 66
            if (r10 < r5) goto L_0x033b
            r5 = 67
            if (r10 > r5) goto L_0x033b
            goto L_0x0275
        L_0x033b:
            r5 = 77
            if (r10 < r5) goto L_0x0348
            if (r10 > r9) goto L_0x0348
            r4 = 90
            r6 = 15
            r7 = 90
            goto L_0x0385
        L_0x0348:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r4 = length(r5, r12, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0363
            r4 = 76
            if (r10 < r4) goto L_0x0363
            if (r10 > r9) goto L_0x0363
            goto L_0x0275
        L_0x0363:
            byte[] r4 = setMin
            byte r5 = r4[r8]
            byte r5 = (byte) r5
            r6 = 15
            byte r4 = r4[r6]
            short r4 = (short) r4
            java.lang.String r4 = length(r5, r7, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0393
            r4 = 92
            if (r10 < r4) goto L_0x0393
            r4 = 93
            if (r10 > r4) goto L_0x0393
            goto L_0x0250
        L_0x0385:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r4 = 37
            r5 = 1
            r6 = 22
            goto L_0x011a
        L_0x0393:
            throw r0
        L_0x0394:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x039c
            throw r1
        L_0x039c:
            goto L_0x039e
        L_0x039d:
            throw r0
        L_0x039e:
            goto L_0x039d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMax(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0472, code lost:
        r0 = 103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0631, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013a, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x066c, code lost:
        if (r9 <= 92) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0169, code lost:
        r1.length(14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void getMax(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r0 = r18
            r3 = r19
            r4 = r20
            r1.<init>(r2, r0, r3, r4)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 1006(0x3ee, float:1.41E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r5 = 15
            byte r3 = r3[r5]
            byte r3 = (byte) r3
            r6 = r3 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r6, r4)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x07bd }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x07bd }
            byte[] r3 = setMin     // Catch:{ all -> 0x07bd }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x07bd }
            byte r3 = (byte) r3     // Catch:{ all -> 0x07bd }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x07bd }
            int r10 = setMax     // Catch:{ all -> 0x07bd }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x07bd }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x07bd }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x07bd }
            byte[] r10 = setMin     // Catch:{ all -> 0x07bd }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x07bd }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x07bd }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x07bd }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x07bd }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x07bd }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ all -> 0x07bd }
            byte[] r12 = setMin     // Catch:{ all -> 0x07bd }
            byte r12 = r12[r8]     // Catch:{ all -> 0x07bd }
            byte r12 = (byte) r12     // Catch:{ all -> 0x07bd }
            int r13 = setMax     // Catch:{ all -> 0x07bd }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x07bd }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x07bd }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x07bd }
            r11[r7] = r12     // Catch:{ all -> 0x07bd }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x07bd }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x07bd }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x07bd }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007f:
            int r10 = r0.length
            r11 = 0
            if (r6 >= r10) goto L_0x0115
            r10 = r0[r6]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x010c }
            r12[r7] = r10     // Catch:{ all -> 0x010c }
            byte[] r10 = setMin     // Catch:{ all -> 0x010c }
            byte r10 = r10[r8]     // Catch:{ all -> 0x010c }
            byte r10 = (byte) r10     // Catch:{ all -> 0x010c }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x010c }
            int r14 = setMax     // Catch:{ all -> 0x010c }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x010c }
            java.lang.String r10 = length(r10, r13, r14)     // Catch:{ all -> 0x010c }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x010c }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x010c }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x010c }
            r5 = 13879(0x3637, float:1.9449E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x010c }
            java.lang.String r5 = length(r14, r15, r5)     // Catch:{ all -> 0x010c }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x010c }
            byte[] r15 = setMin     // Catch:{ all -> 0x010c }
            byte r15 = r15[r8]     // Catch:{ all -> 0x010c }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010c }
            int r4 = setMax     // Catch:{ all -> 0x010c }
            r4 = r4 | 11522(0x2d02, float:1.6146E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x010c }
            java.lang.String r4 = length(r15, r9, r4)     // Catch:{ all -> 0x010c }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x010c }
            r14[r7] = r4     // Catch:{ all -> 0x010c }
            java.lang.reflect.Method r4 = r10.getMethod(r5, r14)     // Catch:{ all -> 0x010c }
            java.lang.Object r4 = r4.invoke(r11, r12)     // Catch:{ all -> 0x010c }
            byte[] r5 = setMin     // Catch:{ all -> 0x0103 }
            byte r5 = r5[r8]     // Catch:{ all -> 0x0103 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0103 }
            int r10 = setMax     // Catch:{ all -> 0x0103 }
            r10 = r10 & 480(0x1e0, float:6.73E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0103 }
            java.lang.String r5 = length(r5, r13, r10)     // Catch:{ all -> 0x0103 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0103 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0103 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0103 }
            r12 = 1
            int r10 = r10 - r12
            byte r10 = (byte) r10     // Catch:{ all -> 0x0103 }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0103 }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r5 = r5.getMethod(r10, r11)     // Catch:{ all -> 0x0103 }
            java.lang.Object r4 = r5.invoke(r4, r11)     // Catch:{ all -> 0x0103 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0103 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0103 }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 1
            r5 = 15
            goto L_0x007f
        L_0x0103:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010b
            throw r1
        L_0x010b:
            throw r0
        L_0x010c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0114
            throw r1
        L_0x0114:
            throw r0
        L_0x0115:
            r6 = 3
            r0 = 0
        L_0x0117:
            int r9 = r0 + 1
            r0 = r3[r0]     // Catch:{ all -> 0x0635 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0635 }
            r14 = 48
            r4 = 21
            r15 = 2
            r10 = 14
            r13 = 22
            r5 = 5
            r12 = 4
            switch(r0) {
                case -107: goto L_0x062d;
                case -106: goto L_0x0629;
                case -105: goto L_0x061a;
                case -104: goto L_0x0619;
                case -103: goto L_0x0608;
                case -102: goto L_0x0605;
                case -101: goto L_0x05ac;
                case -100: goto L_0x05a5;
                case -99: goto L_0x05a1;
                case -98: goto L_0x059b;
                case -97: goto L_0x0585;
                case -96: goto L_0x0572;
                case -95: goto L_0x056e;
                case -94: goto L_0x0563;
                case -93: goto L_0x055f;
                case -92: goto L_0x04fa;
                case -91: goto L_0x04e9;
                case -90: goto L_0x049e;
                case -89: goto L_0x049a;
                case -88: goto L_0x0496;
                case -87: goto L_0x048b;
                case -86: goto L_0x0487;
                case -85: goto L_0x0483;
                case -84: goto L_0x0476;
                case -83: goto L_0x0472;
                case -82: goto L_0x046e;
                case -81: goto L_0x0463;
                case -80: goto L_0x045f;
                case -79: goto L_0x0437;
                case -78: goto L_0x0433;
                case -77: goto L_0x042f;
                case -76: goto L_0x0418;
                case -75: goto L_0x0414;
                case -74: goto L_0x0410;
                case -73: goto L_0x040c;
                case -72: goto L_0x0408;
                case -71: goto L_0x0402;
                case -70: goto L_0x03f2;
                case -69: goto L_0x03ee;
                case -68: goto L_0x03ea;
                case -67: goto L_0x03df;
                case -66: goto L_0x03cf;
                case -65: goto L_0x03cb;
                case -64: goto L_0x03c0;
                case -63: goto L_0x03bc;
                case -62: goto L_0x03b8;
                case -61: goto L_0x03ad;
                case -60: goto L_0x03a9;
                case -59: goto L_0x0394;
                case -58: goto L_0x0381;
                case -57: goto L_0x037d;
                case -56: goto L_0x036d;
                case -55: goto L_0x0369;
                case -54: goto L_0x0363;
                case -53: goto L_0x034c;
                case -52: goto L_0x0348;
                case -51: goto L_0x0344;
                case -50: goto L_0x0341;
                case -49: goto L_0x033d;
                case -48: goto L_0x0332;
                case -47: goto L_0x032f;
                case -46: goto L_0x032b;
                case -45: goto L_0x0320;
                case -44: goto L_0x031c;
                case -43: goto L_0x0318;
                case -42: goto L_0x030d;
                case -41: goto L_0x02fe;
                case -40: goto L_0x02f8;
                case -39: goto L_0x02f4;
                case -38: goto L_0x02f0;
                case -37: goto L_0x02e5;
                case -36: goto L_0x02db;
                case -35: goto L_0x02c4;
                case -34: goto L_0x02b4;
                case -33: goto L_0x02b0;
                case -32: goto L_0x02ac;
                case -31: goto L_0x02a1;
                case -30: goto L_0x023c;
                case -29: goto L_0x022d;
                case -28: goto L_0x0229;
                case -27: goto L_0x020e;
                case -26: goto L_0x01fc;
                case -25: goto L_0x01f8;
                case -24: goto L_0x01f4;
                case -23: goto L_0x01f0;
                case -22: goto L_0x01dd;
                case -21: goto L_0x01cb;
                case -20: goto L_0x01ba;
                case -19: goto L_0x01b6;
                case -18: goto L_0x01b2;
                case -17: goto L_0x01a7;
                case -16: goto L_0x01a3;
                case -15: goto L_0x019f;
                case -14: goto L_0x019b;
                case -13: goto L_0x0190;
                case -12: goto L_0x018d;
                case -11: goto L_0x018a;
                case -10: goto L_0x0187;
                case -9: goto L_0x017b;
                case -8: goto L_0x016d;
                case -7: goto L_0x0165;
                case -6: goto L_0x0162;
                case -5: goto L_0x015f;
                case -4: goto L_0x013e;
                case -3: goto L_0x0136;
                case -2: goto L_0x0133;
                case -1: goto L_0x0130;
                default: goto L_0x012d;
            }     // Catch:{ all -> 0x0635 }
        L_0x012d:
            r4 = 1
            goto L_0x0631
        L_0x0130:
            r0 = 310(0x136, float:4.34E-43)
            goto L_0x0117
        L_0x0133:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x0117
        L_0x0136:
            java.lang.String r0 = "Merchant ID"
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
        L_0x013a:
            r1.length(r5)     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x013e:
            r1.setMin = r6     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r0 = (o.convertDipToPx.length) r0     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x0635 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r10 = r1.equals     // Catch:{ all -> 0x0635 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r0 = r0.setMax(r4, r10)     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x015f:
            r0 = 46
            goto L_0x0117
        L_0x0162:
            r0 = 408(0x198, float:5.72E-43)
            goto L_0x0117
        L_0x0165:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0635 }
            r1.setMin = r0     // Catch:{ all -> 0x0635 }
        L_0x0169:
            r1.length(r10)     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x016d:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r4)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            b = r0     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x017b:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 41
            goto L_0x0117
        L_0x0185:
            r0 = r9
            goto L_0x0117
        L_0x0187:
            r0 = 392(0x188, float:5.5E-43)
            goto L_0x0117
        L_0x018a:
            r0 = 321(0x141, float:4.5E-43)
            goto L_0x0117
        L_0x018d:
            r0 = 362(0x16a, float:5.07E-43)
            goto L_0x0117
        L_0x0190:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 73
            goto L_0x0117
        L_0x019b:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x0117
        L_0x019f:
            r0 = 344(0x158, float:4.82E-43)
            goto L_0x0117
        L_0x01a3:
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0117
        L_0x01a7:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 85
            goto L_0x0117
        L_0x01b2:
            r0 = 95
            goto L_0x0117
        L_0x01b6:
            r0 = 206(0xce, float:2.89E-43)
            goto L_0x0117
        L_0x01ba:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertSpToPx[] r0 = (o.convertSpToPx[]) r0     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x01cb:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertSpToPx[] r0 = (o.convertSpToPx[]) r0     // Catch:{ all -> 0x0635 }
            o.genTextSelector.setMax(r0)     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x01dd:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x0635 }
            r1.setMin = r0     // Catch:{ all -> 0x0635 }
            goto L_0x0169
        L_0x01f0:
            r0 = 414(0x19e, float:5.8E-43)
            goto L_0x0117
        L_0x01f4:
            r0 = 76
            goto L_0x0117
        L_0x01f8:
            r0 = 92
            goto L_0x0117
        L_0x01fc:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r0 = (o.convertDipToPx.length) r0     // Catch:{ all -> 0x0635 }
            r0.setMin()     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x020e:
            o.convertDipToPx r0 = new o.convertDipToPx     // Catch:{ all -> 0x0635 }
            r1.setMin = r15     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r10 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r10 = (o.convertDipToPx.length) r10     // Catch:{ all -> 0x0635 }
            r1.length(r4)     // Catch:{ all -> 0x0635 }
            int r4 = r1.setMax     // Catch:{ all -> 0x0635 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0635 }
            r0.<init>(r10, r4)     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0229:
            r0 = 183(0xb7, float:2.56E-43)
            goto L_0x0117
        L_0x022d:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x023c:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0627 }
            r1.length(r12)     // Catch:{ all -> 0x0627 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0627 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0298 }
            r5[r7] = r0     // Catch:{ all -> 0x0298 }
            byte[] r0 = setMin     // Catch:{ all -> 0x0298 }
            r4 = 10264(0x2818, float:1.4383E-41)
            byte r0 = r0[r4]     // Catch:{ all -> 0x0298 }
            int r0 = -r0
            byte r0 = (byte) r0     // Catch:{ all -> 0x0298 }
            r4 = 2436(0x984, float:3.414E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0298 }
            r12 = 14127(0x372f, float:1.9796E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = length(r0, r4, r12)     // Catch:{ all -> 0x0298 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0298 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0298 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0298 }
            r13 = 1
            int r12 = r12 - r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x0298 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0298 }
            r15 = 14082(0x3702, float:1.9733E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0298 }
            java.lang.String r12 = length(r12, r14, r15)     // Catch:{ all -> 0x0298 }
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0298 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0298 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x0298 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0298 }
            int r15 = r4 + -2
            short r15 = (short) r15     // Catch:{ all -> 0x0298 }
            java.lang.String r4 = length(r13, r4, r15)     // Catch:{ all -> 0x0298 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0298 }
            r14[r7] = r4     // Catch:{ all -> 0x0298 }
            java.lang.reflect.Method r0 = r0.getMethod(r12, r14)     // Catch:{ all -> 0x0298 }
            java.lang.Object r0 = r0.invoke(r11, r5)     // Catch:{ all -> 0x0298 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0298 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0298 }
            r1.setMin = r0     // Catch:{ all -> 0x0635 }
            goto L_0x0169
        L_0x0298:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0635 }
            if (r4 == 0) goto L_0x02a0
            throw r4     // Catch:{ all -> 0x0635 }
        L_0x02a0:
            throw r0     // Catch:{ all -> 0x0635 }
        L_0x02a1:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x0117
        L_0x02ac:
            r0 = 316(0x13c, float:4.43E-43)
            goto L_0x0117
        L_0x02b0:
            r0 = 306(0x132, float:4.29E-43)
            goto L_0x0117
        L_0x02b4:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0627 }
            if (r0 == 0) goto L_0x02c0
            r0 = 416(0x1a0, float:5.83E-43)
            goto L_0x0117
        L_0x02c0:
            r0 = 350(0x15e, float:4.9E-43)
            goto L_0x0117
        L_0x02c4:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            r4 = 49
            if (r0 == r4) goto L_0x02d7
            r4 = 93
            if (r0 == r4) goto L_0x02d3
            goto L_0x02d7
        L_0x02d3:
            r0 = 228(0xe4, float:3.2E-43)
            goto L_0x0117
        L_0x02d7:
            r0 = 219(0xdb, float:3.07E-43)
            goto L_0x0117
        L_0x02db:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0635 }
            throw r0     // Catch:{ all -> 0x0635 }
        L_0x02e5:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 143(0x8f, float:2.0E-43)
            goto L_0x0117
        L_0x02f0:
            r0 = 391(0x187, float:5.48E-43)
            goto L_0x0117
        L_0x02f4:
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x0117
        L_0x02f8:
            int r0 = b     // Catch:{ all -> 0x0635 }
            r1.setMin = r0     // Catch:{ all -> 0x0635 }
            goto L_0x0169
        L_0x02fe:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r4)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x030d:
            r1.length(r14)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x0117
        L_0x0318:
            r0 = 396(0x18c, float:5.55E-43)
            goto L_0x0117
        L_0x031c:
            r0 = 356(0x164, float:4.99E-43)
            goto L_0x0117
        L_0x0320:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 182(0xb6, float:2.55E-43)
            goto L_0x0117
        L_0x032b:
            r0 = 349(0x15d, float:4.89E-43)
            goto L_0x0117
        L_0x032f:
            r0 = 3
            goto L_0x0117
        L_0x0332:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 204(0xcc, float:2.86E-43)
            goto L_0x0117
        L_0x033d:
            r0 = 394(0x18a, float:5.52E-43)
            goto L_0x0117
        L_0x0341:
            r0 = 1
            goto L_0x0117
        L_0x0344:
            r0 = 300(0x12c, float:4.2E-43)
            goto L_0x0117
        L_0x0348:
            r0 = 97
            goto L_0x0117
        L_0x034c:
            r1.setMin = r15     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r0 = (o.convertDipToPx.length) r0     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x0635 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0635 }
            r0.getMax = r4     // Catch:{ all -> 0x0635 }
            goto L_0x012d
        L_0x0363:
            java.lang.String r0 = "Onboarding Phone Number Check Result"
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0369:
            r0 = 144(0x90, float:2.02E-43)
            goto L_0x0117
        L_0x036d:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0627 }
            if (r0 == 0) goto L_0x0379
            r0 = 232(0xe8, float:3.25E-43)
            goto L_0x0117
        L_0x0379:
            r0 = 324(0x144, float:4.54E-43)
            goto L_0x0117
        L_0x037d:
            r0 = 42
            goto L_0x0117
        L_0x0381:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertDipToPx r0 = (o.convertDipToPx) r0     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r0 = r0.length     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0394:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.convertDipToPx$length r0 = (o.convertDipToPx.length) r0     // Catch:{ all -> 0x0635 }
            java.util.List r0 = r0.length     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x03a9:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x0117
        L_0x03ad:
            r1.length(r14)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0117
        L_0x03b8:
            r0 = 320(0x140, float:4.48E-43)
            goto L_0x0117
        L_0x03bc:
            r0 = 211(0xd3, float:2.96E-43)
            goto L_0x0117
        L_0x03c0:
            r1.length(r14)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 269(0x10d, float:3.77E-43)
            goto L_0x0117
        L_0x03cb:
            r0 = 96
            goto L_0x0117
        L_0x03cf:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0627 }
            if (r0 == 0) goto L_0x03db
            r0 = 86
            goto L_0x0117
        L_0x03db:
            r0 = 225(0xe1, float:3.15E-43)
            goto L_0x0117
        L_0x03df:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 298(0x12a, float:4.18E-43)
            goto L_0x0117
        L_0x03ea:
            r0 = 74
            goto L_0x0117
        L_0x03ee:
            r0 = 410(0x19a, float:5.75E-43)
            goto L_0x0117
        L_0x03f2:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0627 }
            if (r0 == 0) goto L_0x0472
            if (r0 == r4) goto L_0x03fe
            goto L_0x0472
        L_0x03fe:
            r0 = 164(0xa4, float:2.3E-43)
            goto L_0x0117
        L_0x0402:
            java.lang.String r0 = "Merchant Name"
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0408:
            r0 = 11
            goto L_0x0117
        L_0x040c:
            r0 = 314(0x13a, float:4.4E-43)
            goto L_0x0117
        L_0x0410:
            r0 = 299(0x12b, float:4.19E-43)
            goto L_0x0117
        L_0x0414:
            r0 = 385(0x181, float:5.4E-43)
            goto L_0x0117
        L_0x0418:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            r4 = 35
            if (r0 == r4) goto L_0x042b
            r4 = 73
            if (r0 == r4) goto L_0x0427
            goto L_0x042b
        L_0x0427:
            r0 = 326(0x146, float:4.57E-43)
            goto L_0x0117
        L_0x042b:
            r0 = 397(0x18d, float:5.56E-43)
            goto L_0x0117
        L_0x042f:
            r0 = 223(0xdf, float:3.12E-43)
            goto L_0x0117
        L_0x0433:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0117
        L_0x0437:
            byte[] r0 = setMin     // Catch:{ all -> 0x0456 }
            byte r0 = r0[r8]     // Catch:{ all -> 0x0456 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0456 }
            r4 = 2439(0x987, float:3.418E-42)
            short r10 = (short) r4     // Catch:{ all -> 0x0456 }
            r4 = r10 | 8816(0x2270, float:1.2354E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = length(r0, r10, r4)     // Catch:{ all -> 0x0456 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0456 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r11)     // Catch:{ all -> 0x0456 }
            java.lang.Object r0 = r0.newInstance(r11)     // Catch:{ all -> 0x0456 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0456:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0635 }
            if (r4 == 0) goto L_0x045e
            throw r4     // Catch:{ all -> 0x0635 }
        L_0x045e:
            throw r0     // Catch:{ all -> 0x0635 }
        L_0x045f:
            r0 = 367(0x16f, float:5.14E-43)
            goto L_0x0117
        L_0x0463:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 341(0x155, float:4.78E-43)
            goto L_0x0117
        L_0x046e:
            r0 = 205(0xcd, float:2.87E-43)
            goto L_0x0117
        L_0x0472:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0117
        L_0x0476:
            r0 = 335(0x14f, float:4.7E-43)
            r1.length(r0)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 355(0x163, float:4.97E-43)
            goto L_0x0117
        L_0x0483:
            r0 = 347(0x15b, float:4.86E-43)
            goto L_0x0117
        L_0x0487:
            r0 = 9
            goto L_0x0117
        L_0x048b:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0185
            r0 = 361(0x169, float:5.06E-43)
            goto L_0x0117
        L_0x0496:
            r0 = 308(0x134, float:4.32E-43)
            goto L_0x0117
        L_0x049a:
            r0 = 412(0x19c, float:5.77E-43)
            goto L_0x0117
        L_0x049e:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            byte[] r4 = setMin     // Catch:{ all -> 0x04e0 }
            byte r4 = r4[r8]     // Catch:{ all -> 0x04e0 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x04e0 }
            r5 = 2444(0x98c, float:3.425E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x04e0 }
            r12 = 7205(0x1c25, float:1.0096E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x04e0 }
            java.lang.String r4 = length(r4, r5, r12)     // Catch:{ all -> 0x04e0 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x04e0 }
            byte[] r5 = setMin     // Catch:{ all -> 0x04e0 }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r5 = r5[r12]     // Catch:{ all -> 0x04e0 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x04e0 }
            r12 = 2454(0x996, float:3.439E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x04e0 }
            r13 = 7848(0x1ea8, float:1.0997E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x04e0 }
            java.lang.String r5 = length(r5, r12, r13)     // Catch:{ all -> 0x04e0 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r11)     // Catch:{ all -> 0x04e0 }
            java.lang.Object r0 = r4.invoke(r0, r11)     // Catch:{ all -> 0x04e0 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x04e0 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x04e0 }
            r1.setMin = r0     // Catch:{ all -> 0x0635 }
            goto L_0x0169
        L_0x04e0:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0635 }
            if (r4 == 0) goto L_0x04e8
            throw r4     // Catch:{ all -> 0x0635 }
        L_0x04e8:
            throw r0     // Catch:{ all -> 0x0635 }
        L_0x04e9:
            r10 = 1
            r1.setMin = r10     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r4)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            o.convertSpToPx[] r0 = new o.convertSpToPx[r0]     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x04fa:
            r1.setMin = r15     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x0635 }
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x0556 }
            r12[r7] = r4     // Catch:{ all -> 0x0556 }
            byte[] r4 = setMin     // Catch:{ all -> 0x0556 }
            byte r4 = r4[r8]     // Catch:{ all -> 0x0556 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0556 }
            r10 = 2444(0x98c, float:3.425E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0556 }
            r13 = 7205(0x1c25, float:1.0096E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0556 }
            java.lang.String r4 = length(r4, r10, r13)     // Catch:{ all -> 0x0556 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0556 }
            int r10 = setMax     // Catch:{ all -> 0x0556 }
            r10 = r10 & 490(0x1ea, float:6.87E-43)
            byte r10 = (byte) r10     // Catch:{ all -> 0x0556 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0556 }
            r14 = 1057(0x421, float:1.481E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0556 }
            java.lang.String r10 = length(r10, r13, r14)     // Catch:{ all -> 0x0556 }
            r13 = 1
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0556 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0556 }
            r15 = 11250(0x2bf2, float:1.5765E-41)
            byte r13 = r13[r15]     // Catch:{ all -> 0x0556 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0556 }
            r15 = 2439(0x987, float:3.418E-42)
            short r11 = (short) r15     // Catch:{ all -> 0x0556 }
            r15 = 14686(0x395e, float:2.058E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0556 }
            java.lang.String r11 = length(r13, r11, r15)     // Catch:{ all -> 0x0556 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0556 }
            r14[r7] = r11     // Catch:{ all -> 0x0556 }
            java.lang.reflect.Method r4 = r4.getMethod(r10, r14)     // Catch:{ all -> 0x0556 }
            java.lang.Object r0 = r4.invoke(r0, r12)     // Catch:{ all -> 0x0556 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0556:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0635 }
            if (r4 == 0) goto L_0x055e
            throw r4     // Catch:{ all -> 0x0635 }
        L_0x055e:
            throw r0     // Catch:{ all -> 0x0635 }
        L_0x055f:
            r0 = 271(0x10f, float:3.8E-43)
            goto L_0x0632
        L_0x0563:
            r1.length(r13)     // Catch:{ all -> 0x0635 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0635 }
            if (r0 != 0) goto L_0x0631
            r0 = 384(0x180, float:5.38E-43)
            goto L_0x0632
        L_0x056e:
            r0 = 224(0xe0, float:3.14E-43)
            goto L_0x0632
        L_0x0572:
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0635 }
            android.content.Context r0 = r0.toIntRange     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x0585:
            o.convertDipToPx$length r0 = new o.convertDipToPx$length     // Catch:{ all -> 0x0635 }
            r4 = 1
            r1.setMin = r4     // Catch:{ all -> 0x0627 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x0635 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x0635 }
            r0.<init>(r4)     // Catch:{ all -> 0x0635 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x059b:
            java.lang.String r0 = "Onboarding Phone Number Input"
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x05a1:
            r0 = 236(0xec, float:3.31E-43)
            goto L_0x0632
        L_0x05a5:
            r0 = 2131886760(0x7f1202a8, float:1.9408108E38)
            r1.setMin = r0     // Catch:{ all -> 0x0635 }
            goto L_0x0169
        L_0x05ac:
            r1.setMin = r15     // Catch:{ all -> 0x0635 }
            r1.length(r6)     // Catch:{ all -> 0x0635 }
            r1.length(r12)     // Catch:{ all -> 0x0635 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0635 }
            r1.length(r4)     // Catch:{ all -> 0x0635 }
            int r4 = r1.setMax     // Catch:{ all -> 0x0635 }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x05fc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x05fc }
            r11[r7] = r4     // Catch:{ all -> 0x05fc }
            byte[] r4 = setMin     // Catch:{ all -> 0x05fc }
            r10 = 10264(0x2818, float:1.4383E-41)
            byte r4 = r4[r10]     // Catch:{ all -> 0x05fc }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x05fc }
            r10 = 2435(0x983, float:3.412E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x05fc }
            r12 = 10253(0x280d, float:1.4368E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x05fc }
            java.lang.String r4 = length(r4, r10, r12)     // Catch:{ all -> 0x05fc }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x05fc }
            r10 = 59
            byte r10 = (byte) r10     // Catch:{ all -> 0x05fc }
            r12 = 2449(0x991, float:3.432E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x05fc }
            int r13 = setMax     // Catch:{ all -> 0x05fc }
            r13 = r13 | 14080(0x3700, float:1.973E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x05fc }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x05fc }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ all -> 0x05fc }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x05fc }
            r13[r7] = r12     // Catch:{ all -> 0x05fc }
            java.lang.reflect.Method r4 = r4.getMethod(r10, r13)     // Catch:{ all -> 0x05fc }
            java.lang.Object r0 = r4.invoke(r0, r11)     // Catch:{ all -> 0x05fc }
            r1.toIntRange = r0     // Catch:{ all -> 0x0635 }
            goto L_0x013a
        L_0x05fc:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0635 }
            if (r4 == 0) goto L_0x0604
            throw r4     // Catch:{ all -> 0x0635 }
        L_0x0604:
            throw r0     // Catch:{ all -> 0x0635 }
        L_0x0605:
            r0 = 257(0x101, float:3.6E-43)
            goto L_0x0632
        L_0x0608:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0627 }
            if (r0 == 0) goto L_0x0616
            if (r0 == r4) goto L_0x0613
            goto L_0x0616
        L_0x0613:
            r0 = 324(0x144, float:4.54E-43)
            goto L_0x0632
        L_0x0616:
            r0 = 232(0xe8, float:3.25E-43)
            goto L_0x0632
        L_0x0619:
            return
        L_0x061a:
            r4 = 1
            r0 = 335(0x14f, float:4.7E-43)
            r1.length(r0)     // Catch:{ all -> 0x0627 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0627 }
            if (r0 != 0) goto L_0x0631
            r0 = 422(0x1a6, float:5.91E-43)
            goto L_0x0632
        L_0x0627:
            r0 = move-exception
            goto L_0x0637
        L_0x0629:
            r4 = 1
            r0 = 342(0x156, float:4.79E-43)
            goto L_0x0632
        L_0x062d:
            r4 = 1
            r0 = 318(0x13e, float:4.46E-43)
            goto L_0x0632
        L_0x0631:
            r0 = r9
        L_0x0632:
            r11 = 0
            goto L_0x0117
        L_0x0635:
            r0 = move-exception
            r4 = 1
        L_0x0637:
            r5 = 88
            r10 = 409(0x199, float:5.73E-43)
            r11 = 111(0x6f, float:1.56E-43)
            if (r9 < r5) goto L_0x064d
            r5 = 92
            if (r9 > r5) goto L_0x064d
            r5 = 315(0x13b, float:4.41E-43)
            r5 = 92
            r11 = 315(0x13b, float:4.41E-43)
        L_0x0649:
            r15 = 15
            goto L_0x07b2
        L_0x064d:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            r12 = 2427(0x97b, float:3.401E-42)
            short r12 = (short) r12
            r13 = 14097(0x3711, float:1.9754E-41)
            short r13 = (short) r13
            java.lang.String r5 = length(r5, r12, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x066f
            r5 = 86
            if (r9 < r5) goto L_0x066f
            r5 = 92
            if (r9 > r5) goto L_0x0671
        L_0x066e:
            goto L_0x0649
        L_0x066f:
            r5 = 92
        L_0x0671:
            byte[] r13 = setMin
            byte r13 = r13[r8]
            byte r13 = (byte) r13
            r14 = 2428(0x97c, float:3.402E-42)
            short r14 = (short) r14
            r15 = r14 & 208(0xd0, float:2.91E-43)
            short r15 = (short) r15
            java.lang.String r13 = length(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x0695
            r13 = 87
            if (r9 < r13) goto L_0x0695
            r13 = 88
            if (r9 > r13) goto L_0x0695
        L_0x0692:
            r11 = 409(0x199, float:5.73E-43)
            goto L_0x0649
        L_0x0695:
            byte[] r13 = setMin
            byte r13 = r13[r8]
            byte r13 = (byte) r13
            r14 = 2439(0x987, float:3.418E-42)
            short r14 = (short) r14
            r15 = 7187(0x1c13, float:1.0071E-41)
            short r15 = (short) r15
            java.lang.String r13 = length(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x06b7
            r13 = 213(0xd5, float:2.98E-43)
            if (r9 < r13) goto L_0x06b7
            r13 = 219(0xdb, float:3.07E-43)
            if (r9 > r13) goto L_0x06b7
            goto L_0x0692
        L_0x06b7:
            byte[] r13 = setMin
            byte r13 = r13[r8]
            byte r13 = (byte) r13
            java.lang.String r13 = length(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x06d3
            r13 = 233(0xe9, float:3.27E-43)
            if (r9 < r13) goto L_0x06d3
            r13 = 234(0xea, float:3.28E-43)
            if (r9 > r13) goto L_0x06d3
            goto L_0x066e
        L_0x06d3:
            byte[] r13 = setMin
            byte r14 = r13[r8]
            byte r14 = (byte) r14
            r15 = 15
            byte r13 = r13[r15]
            short r13 = (short) r13
            java.lang.String r13 = length(r14, r12, r13)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x06f5
            r13 = 234(0xea, float:3.28E-43)
            if (r9 < r13) goto L_0x06f5
            r13 = 235(0xeb, float:3.3E-43)
            if (r9 > r13) goto L_0x06f5
            goto L_0x066e
        L_0x06f5:
            byte[] r13 = setMin
            byte r14 = r13[r8]
            byte r14 = (byte) r14
            r15 = 2423(0x977, float:3.395E-42)
            short r15 = (short) r15
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r13 = r13[r16]
            short r13 = (short) r13
            java.lang.String r13 = length(r14, r15, r13)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x071a
            r13 = 236(0xec, float:3.31E-43)
            if (r9 < r13) goto L_0x071a
            r13 = 237(0xed, float:3.32E-43)
            if (r9 > r13) goto L_0x071a
            goto L_0x066e
        L_0x071a:
            byte[] r13 = setMin
            byte r13 = r13[r8]
            byte r13 = (byte) r13
            r14 = 2424(0x978, float:3.397E-42)
            short r14 = (short) r14
            r15 = 14181(0x3765, float:1.9872E-41)
            short r15 = (short) r15
            java.lang.String r13 = length(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x073d
            r13 = 251(0xfb, float:3.52E-43)
            if (r9 < r13) goto L_0x073d
            r13 = 257(0x101, float:3.6E-43)
            if (r9 > r13) goto L_0x073d
            goto L_0x066e
        L_0x073d:
            byte[] r13 = setMin
            byte r14 = r13[r8]
            byte r14 = (byte) r14
            r15 = 15
            byte r13 = r13[r15]
            short r13 = (short) r13
            java.lang.String r13 = length(r14, r12, r13)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x075f
            r13 = 363(0x16b, float:5.09E-43)
            if (r9 < r13) goto L_0x075f
            r13 = 367(0x16f, float:5.14E-43)
            if (r9 > r13) goto L_0x075f
            goto L_0x066e
        L_0x075f:
            byte[] r13 = setMin
            byte r14 = r13[r8]
            byte r14 = (byte) r14
            r15 = 15
            byte r13 = r13[r15]
            short r13 = (short) r13
            java.lang.String r12 = length(r14, r12, r13)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x0780
            r12 = 364(0x16c, float:5.1E-43)
            if (r9 < r12) goto L_0x0780
            r12 = 365(0x16d, float:5.11E-43)
            if (r9 > r12) goto L_0x0780
            goto L_0x07b2
        L_0x0780:
            byte[] r11 = setMin
            byte r11 = r11[r8]
            byte r11 = (byte) r11
            int r12 = setMax
            r12 = r12 | 2336(0x920, float:3.273E-42)
            short r12 = (short) r12
            r13 = 8656(0x21d0, float:1.213E-41)
            short r13 = (short) r13
            java.lang.String r11 = length(r11, r12, r13)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x07a6
            r11 = 365(0x16d, float:5.11E-43)
            if (r9 < r11) goto L_0x07a6
            r11 = 366(0x16e, float:5.13E-43)
            if (r9 > r11) goto L_0x07a6
            r11 = 409(0x199, float:5.73E-43)
            goto L_0x07b2
        L_0x07a6:
            r10 = 418(0x1a2, float:5.86E-43)
            if (r9 < r10) goto L_0x07bc
            r10 = 423(0x1a7, float:5.93E-43)
            if (r9 > r10) goto L_0x07bc
            r9 = 323(0x143, float:4.53E-43)
            r11 = 323(0x143, float:4.53E-43)
        L_0x07b2:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r0 = r11
            goto L_0x0632
        L_0x07bc:
            throw r0
        L_0x07bd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x07c5
            throw r1
        L_0x07c5:
            goto L_0x07c7
        L_0x07c6:
            throw r0
        L_0x07c7:
            goto L_0x07c6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMax(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMax(o.sendSensorResult r14) {
        /*
            o.GyroscopeSensorService r0 = new o.GyroscopeSensorService
            r0.<init>(r14)
            byte[] r14 = setMin
            r1 = 33
            byte r14 = r14[r1]
            byte r14 = (byte) r14
            r1 = 2236(0x8bc, float:3.133E-42)
            short r1 = (short) r1
            r2 = 7218(0x1c32, float:1.0115E-41)
            short r2 = (short) r2
            java.lang.String r14 = length(r14, r1, r2)
            byte[] r1 = setMin
            r2 = 15
            byte r1 = r1[r2]
            byte r1 = (byte) r1
            r2 = r1 | 2457(0x999, float:3.443E-42)
            short r2 = (short) r2
            r3 = 5590(0x15d6, float:7.833E-42)
            short r3 = (short) r3
            java.lang.String r1 = length(r1, r2, r3)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x0234 }
            byte[] r1 = setMin     // Catch:{ all -> 0x0234 }
            r5 = 7217(0x1c31, float:1.0113E-41)
            byte r1 = r1[r5]     // Catch:{ all -> 0x0234 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x0234 }
            r6 = 2442(0x98a, float:3.422E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0234 }
            int r7 = setMax     // Catch:{ all -> 0x0234 }
            r7 = r7 | 11522(0x2d02, float:1.6146E-41)
            short r7 = (short) r7     // Catch:{ all -> 0x0234 }
            java.lang.String r1 = length(r1, r6, r7)     // Catch:{ all -> 0x0234 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0234 }
            byte[] r7 = setMin     // Catch:{ all -> 0x0234 }
            r8 = 7213(0x1c2d, float:1.0108E-41)
            byte r7 = r7[r8]     // Catch:{ all -> 0x0234 }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x0234 }
            r8 = 2453(0x995, float:3.437E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0234 }
            r9 = 1053(0x41d, float:1.476E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0234 }
            java.lang.String r7 = length(r7, r8, r9)     // Catch:{ all -> 0x0234 }
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0234 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0234 }
            byte r9 = r9[r5]     // Catch:{ all -> 0x0234 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0234 }
            int r10 = setMax     // Catch:{ all -> 0x0234 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x0234 }
            java.lang.String r9 = length(r9, r6, r10)     // Catch:{ all -> 0x0234 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0234 }
            r8[r4] = r9     // Catch:{ all -> 0x0234 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ all -> 0x0234 }
            java.lang.Object r14 = r1.invoke(r14, r3)     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ all -> 0x0234 }
            int r1 = r14.length
            int[] r1 = new int[r1]
            r3 = 0
        L_0x007a:
            int r7 = r14.length
            if (r3 >= r7) goto L_0x010b
            r7 = r14[r3]
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0102 }
            r8[r4] = r7     // Catch:{ all -> 0x0102 }
            byte[] r7 = setMin     // Catch:{ all -> 0x0102 }
            byte r7 = r7[r5]     // Catch:{ all -> 0x0102 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0102 }
            r9 = 2441(0x989, float:3.42E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0102 }
            int r10 = setMax     // Catch:{ all -> 0x0102 }
            r10 = r10 & 480(0x1e0, float:6.73E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0102 }
            java.lang.String r7 = length(r7, r9, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0102 }
            r10 = 74
            byte r10 = (byte) r10     // Catch:{ all -> 0x0102 }
            r11 = 2451(0x993, float:3.435E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0102 }
            r12 = 13879(0x3637, float:1.9449E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0102 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ all -> 0x0102 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0102 }
            byte r12 = r12[r5]     // Catch:{ all -> 0x0102 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0102 }
            int r13 = setMax     // Catch:{ all -> 0x0102 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = length(r12, r6, r13)     // Catch:{ all -> 0x0102 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0102 }
            r11[r4] = r12     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r7 = r7.getMethod(r10, r11)     // Catch:{ all -> 0x0102 }
            r10 = 0
            java.lang.Object r7 = r7.invoke(r10, r8)     // Catch:{ all -> 0x0102 }
            byte[] r8 = setMin     // Catch:{ all -> 0x00f9 }
            byte r8 = r8[r5]     // Catch:{ all -> 0x00f9 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x00f9 }
            int r11 = setMax     // Catch:{ all -> 0x00f9 }
            r11 = r11 & 480(0x1e0, float:6.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x00f9 }
            java.lang.String r8 = length(r8, r9, r11)     // Catch:{ all -> 0x00f9 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x00f9 }
            byte[] r9 = setMin     // Catch:{ all -> 0x00f9 }
            byte r9 = r9[r5]     // Catch:{ all -> 0x00f9 }
            int r9 = r9 - r2
            byte r9 = (byte) r9     // Catch:{ all -> 0x00f9 }
            r11 = 2450(0x992, float:3.433E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x00f9 }
            r12 = 13885(0x363d, float:1.9457E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x00f9 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x00f9 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ all -> 0x00f9 }
            java.lang.Object r7 = r8.invoke(r7, r10)     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x00f9 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x00f9 }
            r1[r3] = r7
            int r3 = r3 + 1
            goto L_0x007a
        L_0x00f9:
            r14 = move-exception
            java.lang.Throwable r0 = r14.getCause()
            if (r0 == 0) goto L_0x0101
            throw r0
        L_0x0101:
            throw r14
        L_0x0102:
            r14 = move-exception
            java.lang.Throwable r0 = r14.getCause()
            if (r0 == 0) goto L_0x010a
            throw r0
        L_0x010a:
            throw r14
        L_0x010b:
            r14 = 26
        L_0x010d:
            int r3 = r4 + 1
            r4 = r1[r4]     // Catch:{ all -> 0x0195 }
            int r4 = r0.length(r4)     // Catch:{ all -> 0x0195 }
            r6 = 3
            r7 = 22
            switch(r4) {
                case -16: goto L_0x018e;
                case -15: goto L_0x018d;
                case -14: goto L_0x018a;
                case -13: goto L_0x0187;
                case -12: goto L_0x0184;
                case -11: goto L_0x0178;
                case -10: goto L_0x016e;
                case -9: goto L_0x016c;
                case -8: goto L_0x015b;
                case -7: goto L_0x014c;
                case -6: goto L_0x0149;
                case -5: goto L_0x0146;
                case -4: goto L_0x013a;
                case -3: goto L_0x012b;
                case -2: goto L_0x0120;
                case -1: goto L_0x011d;
                default: goto L_0x011b;
            }     // Catch:{ all -> 0x0195 }
        L_0x011b:
            goto L_0x0192
        L_0x011d:
            r4 = 61
            goto L_0x010d
        L_0x0120:
            int r4 = ICustomTabsCallback     // Catch:{ all -> 0x0195 }
            r0.setMin = r4     // Catch:{ all -> 0x0195 }
            r4 = 14
            r0.length(r4)     // Catch:{ all -> 0x0195 }
            goto L_0x0192
        L_0x012b:
            r0.setMin = r2     // Catch:{ all -> 0x0195 }
            r0.length(r6)     // Catch:{ all -> 0x0195 }
            r4 = 21
            r0.length(r4)     // Catch:{ all -> 0x0195 }
            int r4 = r0.setMax     // Catch:{ all -> 0x0195 }
            b = r4     // Catch:{ all -> 0x0195 }
            goto L_0x0192
        L_0x013a:
            r0.length(r7)     // Catch:{ all -> 0x0195 }
            int r4 = r0.setMax     // Catch:{ all -> 0x0195 }
            if (r4 != 0) goto L_0x0192
            r3 = 16
            r4 = 16
            goto L_0x010d
        L_0x0146:
            r4 = 65
            goto L_0x010d
        L_0x0149:
            r4 = 59
            goto L_0x010d
        L_0x014c:
            r0.length(r2)     // Catch:{ all -> 0x0195 }
            int r3 = r0.setMax     // Catch:{ all -> 0x0195 }
            r4 = 18
            if (r3 == 0) goto L_0x0156
            goto L_0x010d
        L_0x0156:
            r3 = 52
            r4 = 52
            goto L_0x010d
        L_0x015b:
            r0.setMin = r2     // Catch:{ all -> 0x0195 }
            r0.length(r6)     // Catch:{ all -> 0x0195 }
            r4 = 4
            r0.length(r4)     // Catch:{ all -> 0x0195 }
            java.lang.Object r4 = r0.equals     // Catch:{ all -> 0x0195 }
            o.sendSensorResult r4 = (o.sendSensorResult) r4     // Catch:{ all -> 0x0195 }
            r4.isInside()     // Catch:{ all -> 0x0195 }
            goto L_0x0192
        L_0x016c:
            r4 = 1
            goto L_0x010d
        L_0x016e:
            r4 = 8
            r0.length(r4)     // Catch:{ all -> 0x0195 }
            java.lang.Object r4 = r0.equals     // Catch:{ all -> 0x0195 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0195 }
            throw r4     // Catch:{ all -> 0x0195 }
        L_0x0178:
            r0.length(r7)     // Catch:{ all -> 0x0195 }
            int r4 = r0.setMax     // Catch:{ all -> 0x0195 }
            if (r4 != 0) goto L_0x0192
            r3 = 50
            r4 = 50
            goto L_0x010d
        L_0x0184:
            r4 = 55
            goto L_0x010d
        L_0x0187:
            r4 = 57
            goto L_0x010d
        L_0x018a:
            r4 = 17
            goto L_0x010d
        L_0x018d:
            return
        L_0x018e:
            r4 = 26
            goto L_0x010d
        L_0x0192:
            r4 = r3
            goto L_0x010d
        L_0x0195:
            r4 = move-exception
            byte[] r6 = setMin
            byte r6 = r6[r5]
            byte r6 = (byte) r6
            r7 = 2424(0x978, float:3.397E-42)
            short r7 = (short) r7
            r8 = 14181(0x3765, float:1.9872E-41)
            short r8 = (short) r8
            java.lang.String r6 = length(r6, r7, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r4)
            r7 = 51
            r8 = 25
            if (r6 == 0) goto L_0x01bc
            if (r3 < r2) goto L_0x01bc
            r6 = 2
            if (r3 > r6) goto L_0x01bc
        L_0x01b8:
            r7 = 25
            goto L_0x0229
        L_0x01bc:
            byte[] r6 = setMin
            byte r6 = r6[r5]
            byte r6 = (byte) r6
            int r9 = setMax
            r9 = r9 | 2336(0x920, float:3.273E-42)
            short r9 = (short) r9
            r10 = 8656(0x21d0, float:1.213E-41)
            short r10 = (short) r10
            java.lang.String r6 = length(r6, r9, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r4)
            if (r6 == 0) goto L_0x01e0
            r6 = 12
            if (r3 < r6) goto L_0x01e0
            r6 = 13
            if (r3 > r6) goto L_0x01e0
            goto L_0x01b8
        L_0x01e0:
            r6 = 20
            if (r3 < r6) goto L_0x01eb
            if (r3 > r8) goto L_0x01eb
            r3 = 64
            r7 = 64
            goto L_0x0229
        L_0x01eb:
            byte[] r6 = setMin
            byte r6 = r6[r5]
            byte r6 = (byte) r6
            int r8 = setMax
            r8 = r8 | 2336(0x920, float:3.273E-42)
            short r8 = (short) r8
            java.lang.String r6 = length(r6, r8, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r4)
            if (r6 == 0) goto L_0x020a
            if (r3 < r14) goto L_0x020a
            r6 = 27
            if (r3 > r6) goto L_0x020a
            goto L_0x0229
        L_0x020a:
            byte[] r6 = setMin
            byte r6 = r6[r5]
            byte r6 = (byte) r6
            r8 = r6 | 2368(0x940, float:3.318E-42)
            short r8 = (short) r8
            r9 = 11228(0x2bdc, float:1.5734E-41)
            short r9 = (short) r9
            java.lang.String r6 = length(r6, r8, r9)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r4)
            if (r6 == 0) goto L_0x0233
            r6 = 45
            if (r3 < r6) goto L_0x0233
            if (r3 > r7) goto L_0x0233
        L_0x0229:
            r0.toIntRange = r4
            r3 = 24
            r0.length(r3)
            r4 = r7
            goto L_0x010d
        L_0x0233:
            throw r4
        L_0x0234:
            r14 = move-exception
            java.lang.Throwable r0 = r14.getCause()
            if (r0 == 0) goto L_0x023c
            throw r0
        L_0x023c:
            goto L_0x023e
        L_0x023d:
            throw r14
        L_0x023e:
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMax(o.sendSensorResult):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMax(o.sendSensorResult r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r1.<init>(r0, r2, r3, r4)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = r0 | 2246(0x8c6, float:3.147E-42)
            short r2 = (short) r2
            r3 = 8898(0x22c2, float:1.2469E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r3 = r2 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0288 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x0288 }
            byte[] r2 = setMin     // Catch:{ all -> 0x0288 }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r6]     // Catch:{ all -> 0x0288 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0288 }
            r7 = 2442(0x98a, float:3.422E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0288 }
            int r8 = setMax     // Catch:{ all -> 0x0288 }
            r8 = r8 | 11522(0x2d02, float:1.6146E-41)
            short r8 = (short) r8     // Catch:{ all -> 0x0288 }
            java.lang.String r2 = length(r2, r7, r8)     // Catch:{ all -> 0x0288 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0288 }
            byte[] r8 = setMin     // Catch:{ all -> 0x0288 }
            r9 = 7213(0x1c2d, float:1.0108E-41)
            byte r8 = r8[r9]     // Catch:{ all -> 0x0288 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0288 }
            r9 = 2453(0x995, float:3.437E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0288 }
            r10 = 1053(0x41d, float:1.476E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0288 }
            java.lang.String r8 = length(r8, r9, r10)     // Catch:{ all -> 0x0288 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0288 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0288 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x0288 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0288 }
            int r11 = setMax     // Catch:{ all -> 0x0288 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0288 }
            java.lang.String r10 = length(r10, r7, r11)     // Catch:{ all -> 0x0288 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0288 }
            r9[r5] = r10     // Catch:{ all -> 0x0288 }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r9)     // Catch:{ all -> 0x0288 }
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch:{ all -> 0x0288 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0288 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x0082:
            int r8 = r0.length
            if (r4 >= r8) goto L_0x0113
            r8 = r0[r4]
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x010a }
            r9[r5] = r8     // Catch:{ all -> 0x010a }
            byte[] r8 = setMin     // Catch:{ all -> 0x010a }
            byte r8 = r8[r6]     // Catch:{ all -> 0x010a }
            byte r8 = (byte) r8     // Catch:{ all -> 0x010a }
            r10 = 2441(0x989, float:3.42E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x010a }
            int r11 = setMax     // Catch:{ all -> 0x010a }
            r11 = r11 & 480(0x1e0, float:6.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            java.lang.String r8 = length(r8, r10, r11)     // Catch:{ all -> 0x010a }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010a }
            r11 = 74
            byte r11 = (byte) r11     // Catch:{ all -> 0x010a }
            r12 = 2451(0x993, float:3.435E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x010a }
            r13 = 13879(0x3637, float:1.9449E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x010a }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x010a }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x010a }
            byte[] r13 = setMin     // Catch:{ all -> 0x010a }
            byte r13 = r13[r6]     // Catch:{ all -> 0x010a }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010a }
            int r14 = setMax     // Catch:{ all -> 0x010a }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x010a }
            java.lang.String r13 = length(r13, r7, r14)     // Catch:{ all -> 0x010a }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x010a }
            r12[r5] = r13     // Catch:{ all -> 0x010a }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x010a }
            r11 = 0
            java.lang.Object r8 = r8.invoke(r11, r9)     // Catch:{ all -> 0x010a }
            byte[] r9 = setMin     // Catch:{ all -> 0x0101 }
            byte r9 = r9[r6]     // Catch:{ all -> 0x0101 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0101 }
            int r12 = setMax     // Catch:{ all -> 0x0101 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0101 }
            java.lang.String r9 = length(r9, r10, r12)     // Catch:{ all -> 0x0101 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0101 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0101 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x0101 }
            int r10 = r10 - r3
            byte r10 = (byte) r10     // Catch:{ all -> 0x0101 }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0101 }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0101 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0101 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x0101 }
            java.lang.Object r8 = r9.invoke(r8, r11)     // Catch:{ all -> 0x0101 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0101 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0101 }
            r2[r4] = r8
            int r4 = r4 + 1
            goto L_0x0082
        L_0x0101:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0109
            throw r1
        L_0x0109:
            throw r0
        L_0x010a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0112
            throw r1
        L_0x0112:
            throw r0
        L_0x0113:
            r4 = 20
            r7 = 26
            r8 = 43
            r9 = 24
            r10 = 11
        L_0x011d:
            int r11 = r5 + 1
            r12 = 44
            r13 = 3
            r0 = r2[r5]     // Catch:{ all -> 0x01e8 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01e8 }
            r5 = 14
            r14 = 22
            r15 = 4
            switch(r0) {
                case -19: goto L_0x01d2;
                case -18: goto L_0x01ce;
                case -17: goto L_0x01ca;
                case -16: goto L_0x01bd;
                case -15: goto L_0x01ba;
                case -14: goto L_0x01b6;
                case -13: goto L_0x01a9;
                case -12: goto L_0x019a;
                case -11: goto L_0x0195;
                case -10: goto L_0x0187;
                case -9: goto L_0x0184;
                case -8: goto L_0x0181;
                case -7: goto L_0x015b;
                case -6: goto L_0x0158;
                case -5: goto L_0x0143;
                case -4: goto L_0x0142;
                case -3: goto L_0x0138;
                case -2: goto L_0x0135;
                case -1: goto L_0x0132;
                default: goto L_0x0130;
            }     // Catch:{ all -> 0x01e8 }
        L_0x0130:
            goto L_0x01e5
        L_0x0132:
            r5 = 20
            goto L_0x011d
        L_0x0135:
            r5 = 23
            goto L_0x011d
        L_0x0138:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e8 }
            throw r0     // Catch:{ all -> 0x01e8 }
        L_0x0142:
            return
        L_0x0143:
            r1.setMin = r3     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            r1.length(r15)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01e8 }
            r1.setMin = r0     // Catch:{ all -> 0x01e8 }
        L_0x0153:
            r1.length(r5)     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x0158:
            r5 = 61
            goto L_0x011d
        L_0x015b:
            r1.setMin = r15     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            r1.length(r15)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01e8 }
            r1.length(r15)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r5 = r1.equals     // Catch:{ all -> 0x01e8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01e8 }
            r1.length(r15)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r14 = r1.equals     // Catch:{ all -> 0x01e8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x01e8 }
            r1.length(r15)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r15 = r1.equals     // Catch:{ all -> 0x01e8 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x01e8 }
            r0.getMax(r5, r14, r15)     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x0181:
            r5 = 26
            goto L_0x011d
        L_0x0184:
            r5 = 43
            goto L_0x011d
        L_0x0187:
            r1.length(r3)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            r5 = 30
            if (r0 == r5) goto L_0x0192
            r5 = 4
            goto L_0x011d
        L_0x0192:
            r0 = 6
            r5 = 6
            goto L_0x011d
        L_0x0195:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01e8 }
            r1.setMin = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x0153
        L_0x019a:
            r1.setMin = r3     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            b = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x01a9:
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e5
            r0 = 35
            r5 = 35
            goto L_0x011d
        L_0x01b6:
            r5 = 24
            goto L_0x011d
        L_0x01ba:
            r5 = 1
            goto L_0x011d
        L_0x01bd:
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e5
            r0 = 60
            r5 = 60
            goto L_0x011d
        L_0x01ca:
            r5 = 11
            goto L_0x011d
        L_0x01ce:
            r5 = 37
            goto L_0x011d
        L_0x01d2:
            r1.length(r3)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            r5 = 13
            if (r0 == 0) goto L_0x011d
            if (r0 == r3) goto L_0x01df
            goto L_0x011d
        L_0x01df:
            r0 = 39
            r5 = 39
            goto L_0x011d
        L_0x01e5:
            r5 = r11
            goto L_0x011d
        L_0x01e8:
            r0 = move-exception
            r5 = 7
            r14 = 36
            if (r11 < r5) goto L_0x01f4
            if (r11 > r10) goto L_0x01f4
            r5 = 36
            goto L_0x027f
        L_0x01f4:
            r5 = 17
            if (r11 < r5) goto L_0x01fe
            if (r11 > r4) goto L_0x01fe
            r5 = 63
            goto L_0x027f
        L_0x01fe:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r15 = 2424(0x978, float:3.397E-42)
            short r15 = (short) r15
            r3 = 14181(0x3765, float:1.9872E-41)
            short r3 = (short) r3
            java.lang.String r3 = length(r5, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x021f
            if (r11 < r7) goto L_0x021f
            r3 = 27
            if (r11 > r3) goto L_0x021f
        L_0x021d:
            r5 = 3
            goto L_0x027f
        L_0x021f:
            byte[] r3 = setMin
            byte r5 = r3[r6]
            byte r5 = (byte) r5
            r15 = 2423(0x977, float:3.395E-42)
            short r15 = (short) r15
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r3 = r3[r16]
            short r3 = (short) r3
            java.lang.String r3 = length(r5, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0241
            r3 = 31
            if (r11 < r3) goto L_0x0241
            if (r11 > r14) goto L_0x0241
            goto L_0x021d
        L_0x0241:
            byte[] r3 = setMin
            byte r5 = r3[r6]
            byte r5 = (byte) r5
            byte r3 = r3[r16]
            short r3 = (short) r3
            java.lang.String r3 = length(r5, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0260
            if (r11 < r8) goto L_0x0260
            if (r11 > r12) goto L_0x0260
            r3 = 62
            r5 = 62
            goto L_0x027f
        L_0x0260:
            byte[] r3 = setMin
            byte r5 = r3[r6]
            byte r5 = (byte) r5
            byte r3 = r3[r16]
            short r3 = (short) r3
            java.lang.String r3 = length(r5, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0287
            r3 = 56
            if (r11 < r3) goto L_0x0287
            r3 = 57
            if (r11 > r3) goto L_0x0287
            goto L_0x021d
        L_0x027f:
            r1.toIntRange = r0
            r1.length(r9)
            r3 = 1
            goto L_0x011d
        L_0x0287:
            throw r0
        L_0x0288:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0290
            throw r1
        L_0x0290:
            goto L_0x0292
        L_0x0291:
            throw r0
        L_0x0292:
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMax(o.sendSensorResult, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.String getMin(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = r0 | 2188(0x88c, float:3.066E-42)
            short r2 = (short) r2
            r3 = 2166(0x876, float:3.035E-42)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r4 = r2 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02a2 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x02a2 }
            byte[] r2 = setMin     // Catch:{ all -> 0x02a2 }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r7]     // Catch:{ all -> 0x02a2 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x02a2 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x02a2 }
            int r9 = setMax     // Catch:{ all -> 0x02a2 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x02a2 }
            java.lang.String r2 = length(r2, r8, r9)     // Catch:{ all -> 0x02a2 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x02a2 }
            byte[] r9 = setMin     // Catch:{ all -> 0x02a2 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x02a2 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x02a2 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x02a2 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x02a2 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x02a2 }
            byte[] r11 = setMin     // Catch:{ all -> 0x02a2 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x02a2 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x02a2 }
            int r12 = setMax     // Catch:{ all -> 0x02a2 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x02a2 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x02a2 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x02a2 }
            r10[r6] = r11     // Catch:{ all -> 0x02a2 }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r10)     // Catch:{ all -> 0x02a2 }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x02a2 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02a2 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = 0
        L_0x007c:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010d
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0104 }
            r10[r6] = r9     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0104 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0104 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0104 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0104 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0104 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0104 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0104 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0104 }
            int r15 = setMax     // Catch:{ all -> 0x0104 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0104 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0104 }
            r13[r6] = r14     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0104 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0104 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            int r13 = setMax     // Catch:{ all -> 0x00fb }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fb }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fb }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fb }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fb }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fb }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fb }
            r2[r5] = r9
            int r5 = r5 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r5 = 30
            r8 = 50
            r10 = 11
            r11 = 48
        L_0x0115:
            int r12 = r6 + 1
            r13 = 14
            r14 = 21
            r0 = r2[r6]     // Catch:{ all -> 0x01c4 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01c4 }
            r6 = 3
            r15 = 8
            r9 = 22
            switch(r0) {
                case -18: goto L_0x01bd;
                case -17: goto L_0x01b9;
                case -16: goto L_0x01ac;
                case -15: goto L_0x01a9;
                case -14: goto L_0x01a5;
                case -13: goto L_0x01a1;
                case -12: goto L_0x0194;
                case -11: goto L_0x0187;
                case -10: goto L_0x017f;
                case -9: goto L_0x017c;
                case -8: goto L_0x0179;
                case -7: goto L_0x0163;
                case -6: goto L_0x015b;
                case -5: goto L_0x0145;
                case -4: goto L_0x013d;
                case -3: goto L_0x013a;
                case -2: goto L_0x012d;
                case -1: goto L_0x012b;
                default: goto L_0x0129;
            }     // Catch:{ all -> 0x01c4 }
        L_0x0129:
            goto L_0x01c1
        L_0x012b:
            r6 = 2
            goto L_0x0115
        L_0x012d:
            r1.length(r4)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c4 }
            r6 = 13
            if (r0 == 0) goto L_0x0137
            goto L_0x0115
        L_0x0137:
            r6 = 22
            goto L_0x0115
        L_0x013a:
            r6 = 30
            goto L_0x0115
        L_0x013d:
            r1.length(r15)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c4 }
            return r0
        L_0x0145:
            r1.length(r4)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c4 }
            r6 = 66
            r9 = 25
            if (r0 == r6) goto L_0x0158
            r6 = 77
            if (r0 == r6) goto L_0x0155
            goto L_0x0158
        L_0x0155:
            r0 = 6
            r6 = 6
            goto L_0x0115
        L_0x0158:
            r6 = 25
            goto L_0x0115
        L_0x015b:
            r1.length(r15)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01c4 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x0163:
            r1.setMin = r4     // Catch:{ all -> 0x01c4 }
            r1.length(r6)     // Catch:{ all -> 0x01c4 }
            r0 = 4
            r1.length(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01c4 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r0.isInside     // Catch:{ all -> 0x01c4 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01c4 }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0179:
            r6 = 50
            goto L_0x0115
        L_0x017c:
            r6 = 11
            goto L_0x0115
        L_0x017f:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01c4 }
            r1.setMin = r0     // Catch:{ all -> 0x01c4 }
            r1.length(r13)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0187:
            r1.setMin = r4     // Catch:{ all -> 0x01c4 }
            r1.length(r6)     // Catch:{ all -> 0x01c4 }
            r1.length(r14)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c4 }
            b = r0     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0194:
            r1.length(r9)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01c1
            r0 = 47
            r6 = 47
            goto L_0x0115
        L_0x01a1:
            r6 = 48
            goto L_0x0115
        L_0x01a5:
            r6 = 82
            goto L_0x0115
        L_0x01a9:
            r6 = 1
            goto L_0x0115
        L_0x01ac:
            r1.length(r9)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01c1
            r0 = 81
            r6 = 81
            goto L_0x0115
        L_0x01b9:
            r6 = 19
            goto L_0x0115
        L_0x01bd:
            r6 = 27
            goto L_0x0115
        L_0x01c1:
            r6 = r12
            goto L_0x0115
        L_0x01c4:
            r0 = move-exception
            r6 = 7
            r9 = 24
            r15 = 18
            if (r12 < r6) goto L_0x01d4
            if (r12 > r10) goto L_0x01d4
            r6 = 12
        L_0x01d0:
            r4 = 82
            goto L_0x0297
        L_0x01d4:
            if (r12 < r3) goto L_0x01db
            if (r12 > r15) goto L_0x01db
            r6 = 29
            goto L_0x01d0
        L_0x01db:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r4 = 2439(0x987, float:3.418E-42)
            short r4 = (short) r4
            r10 = 7187(0x1c13, float:1.0071E-41)
            short r10 = (short) r10
            java.lang.String r6 = length(r6, r4, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x01fe
            if (r12 < r13) goto L_0x01fe
            if (r12 > r3) goto L_0x01fe
        L_0x01f8:
            r4 = 82
            r6 = 21
            goto L_0x0297
        L_0x01fe:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            java.lang.String r6 = length(r6, r4, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x021d
            r6 = 23
            if (r12 < r6) goto L_0x021d
            if (r12 > r9) goto L_0x021d
        L_0x0217:
            r4 = 82
        L_0x0219:
            r6 = 18
            goto L_0x0297
        L_0x021d:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            java.lang.String r4 = length(r6, r4, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0235
            if (r12 < r5) goto L_0x0235
            if (r12 > r11) goto L_0x0235
            goto L_0x0217
        L_0x0235:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r6 = r4 | 2368(0x940, float:3.318E-42)
            short r6 = (short) r6
            r10 = 11228(0x2bdc, float:1.5734E-41)
            short r10 = (short) r10
            java.lang.String r4 = length(r4, r6, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0255
            r4 = 42
            if (r12 < r4) goto L_0x0255
            if (r12 > r11) goto L_0x0255
            goto L_0x0217
        L_0x0255:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r6 = 2428(0x97c, float:3.402E-42)
            short r6 = (short) r6
            r10 = r6 & 208(0xd0, float:2.91E-43)
            short r10 = (short) r10
            java.lang.String r4 = length(r4, r6, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0275
            if (r12 < r8) goto L_0x0275
            r4 = 51
            if (r12 > r4) goto L_0x0275
            goto L_0x01f8
        L_0x0275:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r6 = 2427(0x97b, float:3.401E-42)
            short r6 = (short) r6
            r10 = 14097(0x3711, float:1.9754E-41)
            short r10 = (short) r10
            java.lang.String r4 = length(r4, r6, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02a1
            r4 = 76
            if (r12 < r4) goto L_0x02a1
            r4 = 82
            if (r12 > r4) goto L_0x02a1
            goto L_0x0219
        L_0x0297:
            r1.toIntRange = r0
            r1.length(r9)
            r4 = 1
            r10 = 11
            goto L_0x0115
        L_0x02a1:
            throw r0
        L_0x02a2:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02aa
            throw r1
        L_0x02aa:
            goto L_0x02ac
        L_0x02ab:
            throw r0
        L_0x02ac:
            goto L_0x02ab
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin(o.sendSensorResult):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMin(o.sendSensorResult r16, int r17) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r2 = r17
            r1.<init>((java.lang.Object) r0, (int) r2)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = 2268(0x8dc, float:3.178E-42)
            short r2 = (short) r2
            r3 = 10696(0x29c8, float:1.4988E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r4 = r2 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0260 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0260 }
            byte[] r2 = setMin     // Catch:{ all -> 0x0260 }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r7]     // Catch:{ all -> 0x0260 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0260 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0260 }
            int r9 = setMax     // Catch:{ all -> 0x0260 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x0260 }
            java.lang.String r2 = length(r2, r8, r9)     // Catch:{ all -> 0x0260 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0260 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0260 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x0260 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0260 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0260 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0260 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x0260 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0260 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0260 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0260 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0260 }
            int r12 = setMax     // Catch:{ all -> 0x0260 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0260 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x0260 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0260 }
            r10[r6] = r11     // Catch:{ all -> 0x0260 }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r10)     // Catch:{ all -> 0x0260 }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x0260 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0260 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = 0
        L_0x007e:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010f
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0106 }
            r10[r6] = r9     // Catch:{ all -> 0x0106 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0106 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0106 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0106 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0106 }
            int r12 = setMax     // Catch:{ all -> 0x0106 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0106 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0106 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0106 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0106 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0106 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0106 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0106 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0106 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0106 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0106 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0106 }
            int r15 = setMax     // Catch:{ all -> 0x0106 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0106 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0106 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0106 }
            r13[r6] = r14     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0106 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0106 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fd }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fd }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fd }
            int r13 = setMax     // Catch:{ all -> 0x00fd }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fd }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fd }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fd }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fd }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fd }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fd }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fd }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fd }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fd }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fd }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fd }
            r2[r5] = r9
            int r5 = r5 + 1
            goto L_0x007e
        L_0x00fd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0105
            throw r1
        L_0x0105:
            throw r0
        L_0x0106:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010e
            throw r1
        L_0x010e:
            throw r0
        L_0x010f:
            r5 = 34
            r8 = 2
        L_0x0112:
            int r9 = r6 + 1
            r10 = 21
            r11 = 3
            r0 = r2[r6]     // Catch:{ all -> 0x01a6 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01a6 }
            r6 = 4
            r12 = 48
            switch(r0) {
                case -16: goto L_0x018b;
                case -15: goto L_0x0188;
                case -14: goto L_0x0187;
                case -13: goto L_0x0184;
                case -12: goto L_0x0178;
                case -11: goto L_0x0176;
                case -10: goto L_0x0162;
                case -9: goto L_0x015f;
                case -8: goto L_0x015c;
                case -7: goto L_0x0159;
                case -6: goto L_0x0156;
                case -5: goto L_0x014a;
                case -4: goto L_0x013d;
                case -3: goto L_0x0132;
                case -2: goto L_0x0128;
                case -1: goto L_0x0125;
                default: goto L_0x0123;
            }     // Catch:{ all -> 0x01a6 }
        L_0x0123:
            goto L_0x01a3
        L_0x0125:
            r6 = 53
            goto L_0x0112
        L_0x0128:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01a6 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x0132:
            int r0 = b     // Catch:{ all -> 0x01a6 }
            r1.setMin = r0     // Catch:{ all -> 0x01a6 }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x013d:
            r1.setMin = r4     // Catch:{ all -> 0x01a6 }
            r1.length(r11)     // Catch:{ all -> 0x01a6 }
            r1.length(r10)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x014a:
            r1.length(r12)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            if (r0 != 0) goto L_0x01a3
            r0 = 25
            r6 = 25
            goto L_0x0112
        L_0x0156:
            r6 = 26
            goto L_0x0112
        L_0x0159:
            r6 = 32
            goto L_0x0112
        L_0x015c:
            r6 = 57
            goto L_0x0112
        L_0x015f:
            r6 = 29
            goto L_0x0112
        L_0x0162:
            r1.setMin = r8     // Catch:{ all -> 0x01a6 }
            r1.length(r11)     // Catch:{ all -> 0x01a6 }
            r1.length(r6)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01a6 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01a6 }
            r1.length(r10)     // Catch:{ all -> 0x01a6 }
            int r6 = r1.setMax     // Catch:{ all -> 0x01a6 }
            r0.IsOverlapping = r6     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0176:
            r6 = 2
            goto L_0x0112
        L_0x0178:
            r1.length(r12)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            if (r0 != 0) goto L_0x01a3
            r0 = 43
            r6 = 43
            goto L_0x0112
        L_0x0184:
            r6 = 28
            goto L_0x0112
        L_0x0187:
            return
        L_0x0188:
            r6 = 34
            goto L_0x0112
        L_0x018b:
            r1.length(r4)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            r9 = 44
            if (r0 == r6) goto L_0x019f
            r6 = 58
            if (r0 == r6) goto L_0x0199
            goto L_0x019f
        L_0x0199:
            r0 = 46
            r6 = 46
            goto L_0x0112
        L_0x019f:
            r6 = 44
            goto L_0x0112
        L_0x01a3:
            r6 = r9
            goto L_0x0112
        L_0x01a6:
            r0 = move-exception
            byte[] r6 = setMin
            byte r12 = r6[r7]
            byte r12 = (byte) r12
            r13 = 2423(0x977, float:3.395E-42)
            short r13 = (short) r13
            r14 = 13891(0x3643, float:1.9465E-41)
            byte r6 = r6[r14]
            short r6 = (short) r6
            java.lang.String r6 = length(r12, r13, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r12 = 52
            r15 = 56
            if (r6 == 0) goto L_0x01cd
            if (r9 < r8) goto L_0x01cd
            if (r9 > r11) goto L_0x01cd
        L_0x01ca:
            r6 = 1
            goto L_0x0255
        L_0x01cd:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r11 = 2432(0x980, float:3.408E-42)
            short r11 = (short) r11
            r4 = 14148(0x3744, float:1.9826E-41)
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r11, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x01ed
            r4 = 20
            if (r9 < r4) goto L_0x01ed
            if (r9 > r10) goto L_0x01ed
            goto L_0x01ca
        L_0x01ed:
            byte[] r4 = setMin
            byte r6 = r4[r7]
            byte r6 = (byte) r6
            r10 = 2427(0x97b, float:3.401E-42)
            short r10 = (short) r10
            byte r4 = r4[r3]
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r10, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0211
            r4 = 30
            if (r9 < r4) goto L_0x0211
            r4 = 31
            if (r9 > r4) goto L_0x0211
        L_0x020e:
            r6 = 56
            goto L_0x0255
        L_0x0211:
            byte[] r4 = setMin
            byte r6 = r4[r7]
            byte r6 = (byte) r6
            byte r4 = r4[r14]
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x022e
            if (r9 < r5) goto L_0x022e
            r4 = 35
            if (r9 > r4) goto L_0x022e
        L_0x022d:
            goto L_0x020e
        L_0x022e:
            byte[] r4 = setMin
            byte r6 = r4[r7]
            byte r6 = (byte) r6
            byte r4 = r4[r3]
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r10, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x024d
            r4 = 38
            if (r9 < r4) goto L_0x024d
            r4 = 39
            if (r9 > r4) goto L_0x024d
            goto L_0x022d
        L_0x024d:
            r4 = 47
            if (r9 < r4) goto L_0x025f
            if (r9 > r12) goto L_0x025f
            r6 = 52
        L_0x0255:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r4 = 1
            goto L_0x0112
        L_0x025f:
            throw r0
        L_0x0260:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0268
            throw r1
        L_0x0268:
            goto L_0x026a
        L_0x0269:
            throw r0
        L_0x026a:
            goto L_0x0269
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin(o.sendSensorResult, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021f, code lost:
        if (r12 <= 33) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMin(o.sendSensorResult r16, java.lang.String r17) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r2 = r17
            r1.<init>((java.lang.Object) r0, (java.lang.Object) r2)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r3 = 2238(0x8be, float:3.136E-42)
            short r3 = (short) r3
            r4 = 13409(0x3461, float:1.879E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x028d }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x028d }
            byte[] r3 = setMin     // Catch:{ all -> 0x028d }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x028d }
            byte r3 = (byte) r3     // Catch:{ all -> 0x028d }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x028d }
            int r10 = setMax     // Catch:{ all -> 0x028d }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x028d }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x028d }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x028d }
            byte[] r10 = setMin     // Catch:{ all -> 0x028d }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x028d }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x028d }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x028d }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x028d }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x028d }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x028d }
            byte[] r12 = setMin     // Catch:{ all -> 0x028d }
            byte r12 = r12[r8]     // Catch:{ all -> 0x028d }
            byte r12 = (byte) r12     // Catch:{ all -> 0x028d }
            int r13 = setMax     // Catch:{ all -> 0x028d }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x028d }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x028d }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x028d }
            r11[r7] = r12     // Catch:{ all -> 0x028d }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x028d }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x028d }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x028d }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007e:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0112
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0109 }
            r11[r7] = r10     // Catch:{ all -> 0x0109 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0109 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0109 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0109 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0109 }
            int r13 = setMax     // Catch:{ all -> 0x0109 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0109 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0109 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0109 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0109 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0109 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0109 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0109 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0109 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0109 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0109 }
            int r2 = setMax     // Catch:{ all -> 0x0109 }
            r2 = r2 | 11522(0x2d02, float:1.6146E-41)
            short r2 = (short) r2     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = length(r15, r9, r2)     // Catch:{ all -> 0x0109 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0109 }
            r14[r7] = r2     // Catch:{ all -> 0x0109 }
            java.lang.reflect.Method r2 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0109 }
            r10 = 0
            java.lang.Object r2 = r2.invoke(r10, r11)     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0100 }
            byte r11 = r11[r8]     // Catch:{ all -> 0x0100 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0100 }
            int r13 = setMax     // Catch:{ all -> 0x0100 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0100 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0100 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0100 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0100 }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0100 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0100 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x0100 }
            java.lang.Object r2 = r11.invoke(r2, r10)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0100 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0100 }
            r3[r6] = r2
            int r6 = r6 + 1
            r2 = 33
            goto L_0x007e
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0108
            throw r1
        L_0x0108:
            throw r0
        L_0x0109:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0111
            throw r1
        L_0x0111:
            throw r0
        L_0x0112:
            r2 = 10
            r6 = 61
            r9 = 37
            r10 = 3
            r11 = 14
        L_0x011b:
            int r12 = r7 + 1
            r13 = 2
            r0 = r3[r7]     // Catch:{ all -> 0x01d3 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01d3 }
            r7 = 21
            r14 = 4
            switch(r0) {
                case -19: goto L_0x01cc;
                case -18: goto L_0x01b6;
                case -17: goto L_0x01a3;
                case -16: goto L_0x019f;
                case -15: goto L_0x0190;
                case -14: goto L_0x0183;
                case -13: goto L_0x017e;
                case -12: goto L_0x017b;
                case -11: goto L_0x0179;
                case -10: goto L_0x0176;
                case -9: goto L_0x0168;
                case -8: goto L_0x015a;
                case -7: goto L_0x0155;
                case -6: goto L_0x0152;
                case -5: goto L_0x0151;
                case -4: goto L_0x013c;
                case -3: goto L_0x0139;
                case -2: goto L_0x012f;
                case -1: goto L_0x012c;
                default: goto L_0x012a;
            }     // Catch:{ all -> 0x01d3 }
        L_0x012a:
            goto L_0x01d0
        L_0x012c:
            r7 = 10
            goto L_0x011b
        L_0x012f:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d3 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x0139:
            r7 = 61
            goto L_0x011b
        L_0x013c:
            r1.setMin = r5     // Catch:{ all -> 0x01d3 }
            r1.length(r10)     // Catch:{ all -> 0x01d3 }
            r1.length(r14)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d3 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01d3 }
            r1.setMin = r0     // Catch:{ all -> 0x01d3 }
        L_0x014c:
            r1.length(r11)     // Catch:{ all -> 0x01d3 }
            goto L_0x01d0
        L_0x0151:
            return
        L_0x0152:
            r7 = 37
            goto L_0x011b
        L_0x0155:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01d3 }
            r1.setMin = r0     // Catch:{ all -> 0x01d3 }
            goto L_0x014c
        L_0x015a:
            r1.setMin = r5     // Catch:{ all -> 0x01d3 }
            r1.length(r10)     // Catch:{ all -> 0x01d3 }
            r1.length(r7)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d3 }
            b = r0     // Catch:{ all -> 0x01d3 }
            goto L_0x01d0
        L_0x0168:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d3 }
            if (r0 != 0) goto L_0x01d0
            r0 = 32
            r7 = 32
            goto L_0x011b
        L_0x0176:
            r7 = 35
            goto L_0x011b
        L_0x0179:
            r7 = 3
            goto L_0x011b
        L_0x017b:
            r7 = 64
            goto L_0x011b
        L_0x017e:
            int r0 = b     // Catch:{ all -> 0x01d3 }
            r1.setMin = r0     // Catch:{ all -> 0x01d3 }
            goto L_0x014c
        L_0x0183:
            r1.setMin = r5     // Catch:{ all -> 0x01d3 }
            r1.length(r10)     // Catch:{ all -> 0x01d3 }
            r1.length(r7)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d3 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01d3 }
            goto L_0x01d0
        L_0x0190:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d3 }
            if (r0 != 0) goto L_0x01d0
            r0 = 60
            r7 = 60
            goto L_0x011b
        L_0x019f:
            r7 = 34
            goto L_0x011b
        L_0x01a3:
            r1.length(r5)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d3 }
            r7 = 62
            if (r0 == r9) goto L_0x011b
            r12 = 92
            if (r0 == r12) goto L_0x01b2
            goto L_0x011b
        L_0x01b2:
            r0 = 5
            r7 = 5
            goto L_0x011b
        L_0x01b6:
            r1.setMin = r13     // Catch:{ all -> 0x01d3 }
            r1.length(r10)     // Catch:{ all -> 0x01d3 }
            r1.length(r14)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d3 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01d3 }
            r1.length(r14)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x01d3 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01d3 }
            r0.isInside = r7     // Catch:{ all -> 0x01d3 }
            goto L_0x01d0
        L_0x01cc:
            r7 = 14
            goto L_0x011b
        L_0x01d0:
            r7 = r12
            goto L_0x011b
        L_0x01d3:
            r0 = move-exception
            r7 = 6
            if (r12 < r7) goto L_0x01dd
            if (r12 > r2) goto L_0x01dd
            r7 = 33
            goto L_0x0280
        L_0x01dd:
            byte[] r7 = setMin
            byte r13 = r7[r8]
            byte r13 = (byte) r13
            r14 = 2427(0x97b, float:3.401E-42)
            short r14 = (short) r14
            byte r7 = r7[r4]
            short r7 = (short) r7
            java.lang.String r7 = length(r13, r14, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0200
            if (r12 < r11) goto L_0x0200
            if (r12 > r4) goto L_0x0200
            r7 = 33
        L_0x01fc:
            r13 = 33
            goto L_0x0280
        L_0x0200:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r13 = 2432(0x980, float:3.408E-42)
            short r13 = (short) r13
            r15 = 14148(0x3744, float:1.9826E-41)
            short r15 = (short) r15
            java.lang.String r7 = length(r7, r13, r15)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0223
            r7 = 28
            if (r12 < r7) goto L_0x0223
            r7 = 33
            if (r12 > r7) goto L_0x0225
        L_0x0221:
            r13 = 1
            goto L_0x0280
        L_0x0223:
            r7 = 33
        L_0x0225:
            byte[] r13 = setMin
            byte r13 = r13[r8]
            byte r13 = (byte) r13
            r15 = 2424(0x978, float:3.397E-42)
            short r15 = (short) r15
            r2 = 14181(0x3765, float:1.9872E-41)
            short r2 = (short) r2
            java.lang.String r2 = length(r13, r15, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0243
            if (r12 < r9) goto L_0x0243
            if (r12 > r6) goto L_0x0243
            goto L_0x0221
        L_0x0243:
            byte[] r2 = setMin
            byte r13 = r2[r8]
            byte r13 = (byte) r13
            byte r2 = r2[r4]
            short r2 = (short) r2
            java.lang.String r2 = length(r13, r14, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0260
            r2 = 55
            if (r12 < r2) goto L_0x0260
            if (r12 > r6) goto L_0x0260
            goto L_0x0221
        L_0x0260:
            byte[] r2 = setMin
            byte r13 = r2[r8]
            byte r13 = (byte) r13
            byte r2 = r2[r4]
            short r2 = (short) r2
            java.lang.String r2 = length(r13, r14, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x028c
            r2 = 66
            if (r12 < r2) goto L_0x028c
            r2 = 67
            if (r12 > r2) goto L_0x028c
            goto L_0x01fc
        L_0x0280:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r7 = r13
            r2 = 10
            goto L_0x011b
        L_0x028c:
            throw r0
        L_0x028d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0295
            throw r1
        L_0x0295:
            goto L_0x0297
        L_0x0296:
            throw r0
        L_0x0297:
            goto L_0x0296
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin(o.sendSensorResult, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMin(o.sendSensorResult r12, java.lang.String r13, java.lang.String r14) {
        /*
            o.GyroscopeSensorService r0 = new o.GyroscopeSensorService
            r0.<init>(r12, r13, r14)
            byte[] r12 = setMin
            r13 = 33
            byte r12 = r12[r13]
            byte r12 = (byte) r12
            r13 = r12 | 2206(0x89e, float:3.091E-42)
            short r13 = (short) r13
            r14 = 10275(0x2823, float:1.4398E-41)
            short r14 = (short) r14
            java.lang.String r12 = length(r12, r13, r14)
            byte[] r13 = setMin
            r14 = 15
            byte r13 = r13[r14]
            byte r13 = (byte) r13
            r14 = r13 | 2457(0x999, float:3.443E-42)
            short r14 = (short) r14
            r1 = 5590(0x15d6, float:7.833E-42)
            short r1 = (short) r1
            java.lang.String r13 = length(r13, r14, r1)
            r14 = 1
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x023f }
            r2 = 0
            r1[r2] = r13     // Catch:{ all -> 0x023f }
            byte[] r13 = setMin     // Catch:{ all -> 0x023f }
            r3 = 7217(0x1c31, float:1.0113E-41)
            byte r13 = r13[r3]     // Catch:{ all -> 0x023f }
            byte r13 = (byte) r13     // Catch:{ all -> 0x023f }
            r4 = 2442(0x98a, float:3.422E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x023f }
            int r5 = setMax     // Catch:{ all -> 0x023f }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x023f }
            java.lang.String r13 = length(r13, r4, r5)     // Catch:{ all -> 0x023f }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x023f }
            byte[] r5 = setMin     // Catch:{ all -> 0x023f }
            r6 = 7213(0x1c2d, float:1.0108E-41)
            byte r5 = r5[r6]     // Catch:{ all -> 0x023f }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x023f }
            r6 = 2453(0x995, float:3.437E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x023f }
            r7 = 1053(0x41d, float:1.476E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x023f }
            java.lang.String r5 = length(r5, r6, r7)     // Catch:{ all -> 0x023f }
            java.lang.Class[] r6 = new java.lang.Class[r14]     // Catch:{ all -> 0x023f }
            byte[] r7 = setMin     // Catch:{ all -> 0x023f }
            byte r7 = r7[r3]     // Catch:{ all -> 0x023f }
            byte r7 = (byte) r7     // Catch:{ all -> 0x023f }
            int r8 = setMax     // Catch:{ all -> 0x023f }
            r8 = r8 | 11522(0x2d02, float:1.6146E-41)
            short r8 = (short) r8     // Catch:{ all -> 0x023f }
            java.lang.String r7 = length(r7, r4, r8)     // Catch:{ all -> 0x023f }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x023f }
            r6[r2] = r7     // Catch:{ all -> 0x023f }
            java.lang.reflect.Method r13 = r13.getMethod(r5, r6)     // Catch:{ all -> 0x023f }
            java.lang.Object r12 = r13.invoke(r12, r1)     // Catch:{ all -> 0x023f }
            java.lang.Object[] r12 = (java.lang.Object[]) r12     // Catch:{ all -> 0x023f }
            int r13 = r12.length
            int[] r13 = new int[r13]
            r1 = 0
        L_0x007a:
            int r5 = r12.length
            if (r1 >= r5) goto L_0x010b
            r5 = r12[r1]
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x0102 }
            r6[r2] = r5     // Catch:{ all -> 0x0102 }
            byte[] r5 = setMin     // Catch:{ all -> 0x0102 }
            byte r5 = r5[r3]     // Catch:{ all -> 0x0102 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0102 }
            r7 = 2441(0x989, float:3.42E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0102 }
            int r8 = setMax     // Catch:{ all -> 0x0102 }
            r8 = r8 & 480(0x1e0, float:6.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0102 }
            java.lang.String r5 = length(r5, r7, r8)     // Catch:{ all -> 0x0102 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0102 }
            r8 = 74
            byte r8 = (byte) r8     // Catch:{ all -> 0x0102 }
            r9 = 2451(0x993, float:3.435E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0102 }
            r10 = 13879(0x3637, float:1.9449E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = length(r8, r9, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r14]     // Catch:{ all -> 0x0102 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0102 }
            byte r10 = r10[r3]     // Catch:{ all -> 0x0102 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0102 }
            int r11 = setMax     // Catch:{ all -> 0x0102 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0102 }
            java.lang.String r10 = length(r10, r4, r11)     // Catch:{ all -> 0x0102 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0102 }
            r9[r2] = r10     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r5 = r5.getMethod(r8, r9)     // Catch:{ all -> 0x0102 }
            r8 = 0
            java.lang.Object r5 = r5.invoke(r8, r6)     // Catch:{ all -> 0x0102 }
            byte[] r6 = setMin     // Catch:{ all -> 0x00f9 }
            byte r6 = r6[r3]     // Catch:{ all -> 0x00f9 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x00f9 }
            int r9 = setMax     // Catch:{ all -> 0x00f9 }
            r9 = r9 & 480(0x1e0, float:6.73E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = length(r6, r7, r9)     // Catch:{ all -> 0x00f9 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x00f9 }
            byte[] r7 = setMin     // Catch:{ all -> 0x00f9 }
            byte r7 = r7[r3]     // Catch:{ all -> 0x00f9 }
            int r7 = r7 - r14
            byte r7 = (byte) r7     // Catch:{ all -> 0x00f9 }
            r9 = 2450(0x992, float:3.433E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x00f9 }
            r10 = 13885(0x363d, float:1.9457E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x00f9 }
            java.lang.String r7 = length(r7, r9, r10)     // Catch:{ all -> 0x00f9 }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch:{ all -> 0x00f9 }
            java.lang.Object r5 = r6.invoke(r5, r8)     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x00f9 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x00f9 }
            r13[r1] = r5
            int r1 = r1 + 1
            goto L_0x007a
        L_0x00f9:
            r12 = move-exception
            java.lang.Throwable r13 = r12.getCause()
            if (r13 == 0) goto L_0x0101
            throw r13
        L_0x0101:
            throw r12
        L_0x0102:
            r12 = move-exception
            java.lang.Throwable r13 = r12.getCause()
            if (r13 == 0) goto L_0x010a
            throw r13
        L_0x010a:
            throw r12
        L_0x010b:
            r12 = 76
            r1 = 42
            r4 = 9
            r5 = 39
            r6 = 3
        L_0x0114:
            int r7 = r2 + 1
            r2 = r13[r2]     // Catch:{ all -> 0x01a6 }
            int r2 = r0.length(r2)     // Catch:{ all -> 0x01a6 }
            r8 = 22
            switch(r2) {
                case -16: goto L_0x01a2;
                case -15: goto L_0x018f;
                case -14: goto L_0x018d;
                case -13: goto L_0x0183;
                case -12: goto L_0x0180;
                case -11: goto L_0x017d;
                case -10: goto L_0x017b;
                case -9: goto L_0x0171;
                case -8: goto L_0x0162;
                case -7: goto L_0x0158;
                case -6: goto L_0x0155;
                case -5: goto L_0x0136;
                case -4: goto L_0x0133;
                case -3: goto L_0x0129;
                case -2: goto L_0x0126;
                case -1: goto L_0x0123;
                default: goto L_0x0121;
            }     // Catch:{ all -> 0x01a6 }
        L_0x0121:
            goto L_0x01a3
        L_0x0123:
            r2 = 39
            goto L_0x0114
        L_0x0126:
            r2 = 76
            goto L_0x0114
        L_0x0129:
            r2 = 8
            r0.length(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r2 = r0.equals     // Catch:{ all -> 0x01a6 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x01a6 }
            throw r2     // Catch:{ all -> 0x01a6 }
        L_0x0133:
            r2 = 65
            goto L_0x0114
        L_0x0136:
            r0.setMin = r6     // Catch:{ all -> 0x01a6 }
            r0.length(r6)     // Catch:{ all -> 0x01a6 }
            r2 = 4
            r0.length(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r8 = r0.equals     // Catch:{ all -> 0x01a6 }
            o.sendSensorResult r8 = (o.sendSensorResult) r8     // Catch:{ all -> 0x01a6 }
            r0.length(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r9 = r0.equals     // Catch:{ all -> 0x01a6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01a6 }
            r0.length(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r2 = r0.equals     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01a6 }
            r8.setMax((java.lang.String) r9, (java.lang.String) r2)     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0155:
            r2 = 42
            goto L_0x0114
        L_0x0158:
            int r2 = ICustomTabsCallback     // Catch:{ all -> 0x01a6 }
            r0.setMin = r2     // Catch:{ all -> 0x01a6 }
            r2 = 14
            r0.length(r2)     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0162:
            r0.setMin = r14     // Catch:{ all -> 0x01a6 }
            r0.length(r6)     // Catch:{ all -> 0x01a6 }
            r2 = 21
            r0.length(r2)     // Catch:{ all -> 0x01a6 }
            int r2 = r0.setMax     // Catch:{ all -> 0x01a6 }
            b = r2     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0171:
            r0.length(r8)     // Catch:{ all -> 0x01a6 }
            int r2 = r0.setMax     // Catch:{ all -> 0x01a6 }
            if (r2 != 0) goto L_0x01a3
            r2 = 38
            goto L_0x0114
        L_0x017b:
            r2 = 3
            goto L_0x0114
        L_0x017d:
            r2 = 67
            goto L_0x0114
        L_0x0180:
            r2 = 9
            goto L_0x0114
        L_0x0183:
            r0.length(r8)     // Catch:{ all -> 0x01a6 }
            int r2 = r0.setMax     // Catch:{ all -> 0x01a6 }
            if (r2 != 0) goto L_0x01a3
            r2 = 63
            goto L_0x0114
        L_0x018d:
            r2 = 1
            goto L_0x0114
        L_0x018f:
            r0.length(r14)     // Catch:{ all -> 0x01a6 }
            int r2 = r0.setMax     // Catch:{ all -> 0x01a6 }
            r7 = 19
            r8 = 5
            if (r2 == r7) goto L_0x019e
            r7 = 91
            r2 = 5
            goto L_0x0114
        L_0x019e:
            r2 = 69
            goto L_0x0114
        L_0x01a2:
            return
        L_0x01a3:
            r2 = r7
            goto L_0x0114
        L_0x01a6:
            r2 = move-exception
            byte[] r8 = setMin
            byte r8 = r8[r3]
            byte r8 = (byte) r8
            r9 = 2427(0x97b, float:3.401E-42)
            short r9 = (short) r9
            r10 = 14097(0x3711, float:1.9754E-41)
            short r10 = (short) r10
            java.lang.String r8 = length(r8, r9, r10)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r2)
            r9 = 64
            if (r8 == 0) goto L_0x01c8
            if (r7 < r4) goto L_0x01c8
            if (r7 > r5) goto L_0x01c8
            goto L_0x0234
        L_0x01c8:
            byte[] r8 = setMin
            byte r8 = r8[r3]
            byte r8 = (byte) r8
            r10 = r8 | 2368(0x940, float:3.318E-42)
            short r10 = (short) r10
            r11 = 11228(0x2bdc, float:1.5734E-41)
            short r11 = (short) r11
            java.lang.String r8 = length(r8, r10, r11)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r2)
            if (r8 == 0) goto L_0x01e8
            r8 = 34
            if (r7 < r8) goto L_0x01e8
            if (r7 > r5) goto L_0x01e8
            goto L_0x0234
        L_0x01e8:
            byte[] r8 = setMin
            byte r8 = r8[r3]
            byte r8 = (byte) r8
            int r10 = setMax
            r10 = r10 | 2336(0x920, float:3.273E-42)
            short r10 = (short) r10
            r11 = 8656(0x21d0, float:1.213E-41)
            short r11 = (short) r11
            java.lang.String r8 = length(r8, r10, r11)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r2)
            if (r8 == 0) goto L_0x020c
            if (r7 < r1) goto L_0x020c
            if (r7 > r9) goto L_0x020c
            r7 = 66
            r9 = 66
            goto L_0x0234
        L_0x020c:
            byte[] r8 = setMin
            byte r8 = r8[r3]
            byte r8 = (byte) r8
            r10 = 2424(0x978, float:3.397E-42)
            short r10 = (short) r10
            r11 = 14181(0x3765, float:1.9872E-41)
            short r11 = (short) r11
            java.lang.String r8 = length(r8, r10, r11)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r2)
            if (r8 == 0) goto L_0x022c
            r8 = 59
            if (r7 < r8) goto L_0x022c
            if (r7 > r9) goto L_0x022c
            goto L_0x0234
        L_0x022c:
            r8 = 72
            if (r7 < r8) goto L_0x023e
            if (r7 > r12) goto L_0x023e
            r7 = 2
            r9 = 2
        L_0x0234:
            r0.toIntRange = r2
            r2 = 24
            r0.length(r2)
            r2 = r9
            goto L_0x0114
        L_0x023e:
            throw r2
        L_0x023f:
            r12 = move-exception
            java.lang.Throwable r13 = r12.getCause()
            if (r13 == 0) goto L_0x0247
            throw r13
        L_0x0247:
            goto L_0x0249
        L_0x0248:
            throw r12
        L_0x0249:
            goto L_0x0248
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin(o.sendSensorResult, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02fe, code lost:
        if (r14 <= 63) goto L_0x01fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void isInside() {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 2204(0x89c, float:3.088E-42)
            short r3 = (short) r3
            r4 = 7851(0x1eab, float:1.1002E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r4 = r3 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r3 = length(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x031a }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x031a }
            byte[] r3 = setMin     // Catch:{ all -> 0x031a }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r7]     // Catch:{ all -> 0x031a }
            byte r3 = (byte) r3     // Catch:{ all -> 0x031a }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x031a }
            int r9 = setMax     // Catch:{ all -> 0x031a }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x031a }
            java.lang.String r3 = length(r3, r8, r9)     // Catch:{ all -> 0x031a }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x031a }
            byte[] r9 = setMin     // Catch:{ all -> 0x031a }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x031a }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x031a }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x031a }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x031a }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x031a }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x031a }
            byte[] r11 = setMin     // Catch:{ all -> 0x031a }
            byte r11 = r11[r7]     // Catch:{ all -> 0x031a }
            byte r11 = (byte) r11     // Catch:{ all -> 0x031a }
            int r12 = setMax     // Catch:{ all -> 0x031a }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x031a }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x031a }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x031a }
            r10[r6] = r11     // Catch:{ all -> 0x031a }
            java.lang.reflect.Method r3 = r3.getMethod(r9, r10)     // Catch:{ all -> 0x031a }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x031a }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x031a }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007c:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010d
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0104 }
            r10[r6] = r9     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0104 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0104 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0104 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0104 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0104 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0104 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0104 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0104 }
            int r15 = setMax     // Catch:{ all -> 0x0104 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0104 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0104 }
            r13[r6] = r14     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0104 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0104 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            int r13 = setMax     // Catch:{ all -> 0x00fb }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fb }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fb }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fb }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fb }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fb }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fb }
            r3[r5] = r9
            int r5 = r5 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r5 = 56
            r8 = 36
            r10 = 6
            r12 = 34
            r13 = 3
        L_0x0115:
            int r14 = r6 + 1
            r15 = 37
            r9 = 24
            r0 = r3[r6]     // Catch:{ all -> 0x01de }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01de }
            r6 = 48
            r11 = 4
            switch(r0) {
                case -20: goto L_0x01cc;
                case -19: goto L_0x01b9;
                case -18: goto L_0x01b5;
                case -17: goto L_0x01b1;
                case -16: goto L_0x01a4;
                case -15: goto L_0x01a0;
                case -14: goto L_0x019c;
                case -13: goto L_0x018c;
                case -12: goto L_0x017c;
                case -11: goto L_0x0167;
                case -10: goto L_0x015d;
                case -9: goto L_0x015c;
                case -8: goto L_0x0159;
                case -7: goto L_0x0157;
                case -6: goto L_0x014b;
                case -5: goto L_0x013b;
                case -4: goto L_0x0130;
                case -3: goto L_0x012e;
                case -2: goto L_0x012b;
                case -1: goto L_0x0129;
                default: goto L_0x0127;
            }     // Catch:{ all -> 0x01de }
        L_0x0127:
            goto L_0x01db
        L_0x0129:
            r6 = 3
            goto L_0x0115
        L_0x012b:
            r6 = 56
            goto L_0x0115
        L_0x012e:
            r6 = 6
            goto L_0x0115
        L_0x0130:
            int r0 = b     // Catch:{ all -> 0x01de }
            r1.setMin = r0     // Catch:{ all -> 0x01de }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x01de }
            goto L_0x01db
        L_0x013b:
            r1.setMin = r4     // Catch:{ all -> 0x01de }
            r1.length(r13)     // Catch:{ all -> 0x01de }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x01de }
            int r0 = r1.setMax     // Catch:{ all -> 0x01de }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01de }
            goto L_0x01db
        L_0x014b:
            r1.length(r6)     // Catch:{ all -> 0x01de }
            int r0 = r1.setMax     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01db
            r0 = 23
            r6 = 23
            goto L_0x0115
        L_0x0157:
            r6 = 1
            goto L_0x0115
        L_0x0159:
            r6 = 73
            goto L_0x0115
        L_0x015c:
            return
        L_0x015d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01de }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01de }
            throw r0     // Catch:{ all -> 0x01de }
        L_0x0167:
            r1.setMin = r4     // Catch:{ all -> 0x01de }
            r1.length(r13)     // Catch:{ all -> 0x01de }
            r1.length(r11)     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01de }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01de }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x01de }
            r1.toIntRange = r0     // Catch:{ all -> 0x01de }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x01de }
            goto L_0x01db
        L_0x017c:
            r1.setMin = r4     // Catch:{ all -> 0x01de }
            r1.length(r13)     // Catch:{ all -> 0x01de }
            r1.length(r11)     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01de }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x01de }
            r0.dismissProgress()     // Catch:{ all -> 0x01de }
            goto L_0x01db
        L_0x018c:
            r1.setMin = r4     // Catch:{ all -> 0x01de }
            r1.length(r13)     // Catch:{ all -> 0x01de }
            r1.length(r11)     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01de }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01de }
            r0.toFloatRange()     // Catch:{ all -> 0x01de }
            goto L_0x01db
        L_0x019c:
            r6 = 36
            goto L_0x0115
        L_0x01a0:
            r6 = 72
            goto L_0x0115
        L_0x01a4:
            r1.length(r6)     // Catch:{ all -> 0x01de }
            int r0 = r1.setMax     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01db
            r0 = 54
            r6 = 54
            goto L_0x0115
        L_0x01b1:
            r6 = 34
            goto L_0x0115
        L_0x01b5:
            r6 = 63
            goto L_0x0115
        L_0x01b9:
            r1.length(r4)     // Catch:{ all -> 0x01de }
            int r0 = r1.setMax     // Catch:{ all -> 0x01de }
            r6 = 27
            if (r0 == 0) goto L_0x0115
            if (r0 == r4) goto L_0x01c6
            goto L_0x0115
        L_0x01c6:
            r0 = 57
            r6 = 57
            goto L_0x0115
        L_0x01cc:
            r1.length(r4)     // Catch:{ all -> 0x01de }
            int r0 = r1.setMax     // Catch:{ all -> 0x01de }
            r6 = 67
            if (r0 == r15) goto L_0x01d7
            goto L_0x0115
        L_0x01d7:
            r6 = 24
            goto L_0x0115
        L_0x01db:
            r6 = r14
            goto L_0x0115
        L_0x01de:
            r0 = move-exception
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r11 = 2428(0x97c, float:3.402E-42)
            short r11 = (short) r11
            r4 = r11 & 208(0xd0, float:2.91E-43)
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r11, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0204
            if (r14 < r10) goto L_0x0204
            if (r14 > r9) goto L_0x0204
        L_0x01fc:
            r4 = 63
        L_0x01fe:
            r5 = 72
            r6 = 66
            goto L_0x030e
        L_0x0204:
            byte[] r4 = setMin
            byte r5 = r4[r7]
            byte r5 = (byte) r5
            r6 = 2423(0x977, float:3.395E-42)
            short r6 = (short) r6
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r4 = r4[r16]
            short r4 = (short) r4
            java.lang.String r4 = length(r5, r6, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0226
            r4 = 19
            if (r14 < r4) goto L_0x0226
            if (r14 > r9) goto L_0x0226
            goto L_0x01fc
        L_0x0226:
            r4 = 32
            if (r14 < r4) goto L_0x0236
            if (r14 > r12) goto L_0x0236
            r4 = 55
            r4 = 63
            r5 = 72
            r6 = 55
            goto L_0x030e
        L_0x0236:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r5 = 2432(0x980, float:3.408E-42)
            short r5 = (short) r5
            r6 = 14148(0x3744, float:1.9826E-41)
            short r6 = (short) r6
            java.lang.String r4 = length(r4, r5, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x025d
            r4 = 28
            if (r14 < r4) goto L_0x025d
            if (r14 > r12) goto L_0x025d
            r4 = 63
        L_0x0257:
            r5 = 72
            r6 = 26
            goto L_0x030e
        L_0x025d:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r10 = r4 | 2368(0x940, float:3.318E-42)
            short r10 = (short) r10
            r11 = 11228(0x2bdc, float:1.5734E-41)
            short r11 = (short) r11
            java.lang.String r4 = length(r4, r10, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x027e
            r4 = 29
            if (r14 < r4) goto L_0x027e
            if (r14 > r12) goto L_0x027e
            goto L_0x01fc
        L_0x027e:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r5, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0297
            if (r14 < r8) goto L_0x0297
            if (r14 > r15) goto L_0x0297
            goto L_0x01fc
        L_0x0297:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            int r5 = setMax
            r5 = r5 | 2336(0x920, float:3.273E-42)
            short r5 = (short) r5
            r6 = 8656(0x21d0, float:1.213E-41)
            short r6 = (short) r6
            java.lang.String r4 = length(r4, r5, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02bc
            r4 = 49
            if (r14 < r4) goto L_0x02bc
            r4 = 50
            if (r14 > r4) goto L_0x02bc
            goto L_0x01fc
        L_0x02bc:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r5 = 2424(0x978, float:3.397E-42)
            short r5 = (short) r5
            r6 = 14181(0x3765, float:1.9872E-41)
            short r6 = (short) r6
            java.lang.String r4 = length(r4, r5, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02df
            r4 = 58
            if (r14 < r4) goto L_0x02df
            r4 = 63
            if (r14 > r4) goto L_0x02df
            goto L_0x0257
        L_0x02df:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r5 = 2419(0x973, float:3.39E-42)
            short r5 = (short) r5
            r6 = 13371(0x343b, float:1.8737E-41)
            short r6 = (short) r6
            java.lang.String r4 = length(r4, r5, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0302
            r4 = 59
            if (r14 < r4) goto L_0x0302
            r4 = 63
            if (r14 > r4) goto L_0x0304
            goto L_0x01fe
        L_0x0302:
            r4 = 63
        L_0x0304:
            r5 = 68
            if (r14 < r5) goto L_0x0319
            r5 = 72
            if (r14 > r5) goto L_0x0319
            r6 = 65
        L_0x030e:
            r1.toIntRange = r0
            r1.length(r9)
            r4 = 1
            r5 = 56
            r10 = 6
            goto L_0x0115
        L_0x0319:
            throw r0
        L_0x031a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0322
            throw r1
        L_0x0322:
            goto L_0x0324
        L_0x0323:
            throw r0
        L_0x0324:
            goto L_0x0323
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.isInside():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void isInside(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = 2286(0x8ee, float:3.203E-42)
            short r2 = (short) r2
            r3 = 10525(0x291d, float:1.4749E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r4 = r2 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0227 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0227 }
            byte[] r2 = setMin     // Catch:{ all -> 0x0227 }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r7]     // Catch:{ all -> 0x0227 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0227 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0227 }
            int r9 = setMax     // Catch:{ all -> 0x0227 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x0227 }
            java.lang.String r2 = length(r2, r8, r9)     // Catch:{ all -> 0x0227 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0227 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0227 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x0227 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0227 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0227 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0227 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x0227 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0227 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0227 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0227 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0227 }
            int r12 = setMax     // Catch:{ all -> 0x0227 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0227 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x0227 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0227 }
            r10[r6] = r11     // Catch:{ all -> 0x0227 }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r10)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x0227 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0227 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = 0
        L_0x007c:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010d
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0104 }
            r10[r6] = r9     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0104 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0104 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0104 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0104 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0104 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0104 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0104 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0104 }
            int r15 = setMax     // Catch:{ all -> 0x0104 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0104 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0104 }
            r13[r6] = r14     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0104 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0104 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            int r13 = setMax     // Catch:{ all -> 0x00fb }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fb }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fb }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fb }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fb }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fb }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fb }
            r2[r5] = r9
            int r5 = r5 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r5 = 27
            r8 = 48
            r9 = 47
            r10 = 32
            r11 = 4
        L_0x0116:
            int r12 = r6 + 1
            r13 = 22
            r0 = r2[r6]     // Catch:{ all -> 0x019b }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x019b }
            r6 = 14
            r14 = 21
            r15 = 3
            switch(r0) {
                case -16: goto L_0x0194;
                case -15: goto L_0x0184;
                case -14: goto L_0x0182;
                case -13: goto L_0x017f;
                case -12: goto L_0x0173;
                case -11: goto L_0x0166;
                case -10: goto L_0x0161;
                case -9: goto L_0x015f;
                case -8: goto L_0x015c;
                case -7: goto L_0x0159;
                case -6: goto L_0x014d;
                case -5: goto L_0x0140;
                case -4: goto L_0x0138;
                case -3: goto L_0x0137;
                case -2: goto L_0x012d;
                case -1: goto L_0x012a;
                default: goto L_0x0128;
            }     // Catch:{ all -> 0x019b }
        L_0x0128:
            goto L_0x0198
        L_0x012a:
            r6 = 28
            goto L_0x0116
        L_0x012d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x019b }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x0137:
            return
        L_0x0138:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x019b }
            r1.setMin = r0     // Catch:{ all -> 0x019b }
        L_0x013c:
            r1.length(r6)     // Catch:{ all -> 0x019b }
            goto L_0x0198
        L_0x0140:
            r1.setMin = r4     // Catch:{ all -> 0x019b }
            r1.length(r15)     // Catch:{ all -> 0x019b }
            r1.length(r14)     // Catch:{ all -> 0x019b }
            int r0 = r1.setMax     // Catch:{ all -> 0x019b }
            b = r0     // Catch:{ all -> 0x019b }
            goto L_0x0198
        L_0x014d:
            r1.length(r13)     // Catch:{ all -> 0x019b }
            int r0 = r1.setMax     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x0198
            r0 = 26
            r6 = 26
            goto L_0x0116
        L_0x0159:
            r6 = 27
            goto L_0x0116
        L_0x015c:
            r6 = 48
            goto L_0x0116
        L_0x015f:
            r6 = 4
            goto L_0x0116
        L_0x0161:
            int r0 = b     // Catch:{ all -> 0x019b }
            r1.setMin = r0     // Catch:{ all -> 0x019b }
            goto L_0x013c
        L_0x0166:
            r1.setMin = r4     // Catch:{ all -> 0x019b }
            r1.length(r15)     // Catch:{ all -> 0x019b }
            r1.length(r14)     // Catch:{ all -> 0x019b }
            int r0 = r1.setMax     // Catch:{ all -> 0x019b }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x019b }
            goto L_0x0198
        L_0x0173:
            r1.length(r8)     // Catch:{ all -> 0x019b }
            int r0 = r1.setMax     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x0198
            r0 = 46
            r6 = 46
            goto L_0x0116
        L_0x017f:
            r6 = 47
            goto L_0x0116
        L_0x0182:
            r6 = 2
            goto L_0x0116
        L_0x0184:
            r1.setMin = r4     // Catch:{ all -> 0x019b }
            r1.length(r15)     // Catch:{ all -> 0x019b }
            r1.length(r11)     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x019b }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x019b }
            r0.equals()     // Catch:{ all -> 0x019b }
            goto L_0x0198
        L_0x0194:
            r6 = 32
            goto L_0x0116
        L_0x0198:
            r6 = r12
            goto L_0x0116
        L_0x019b:
            r0 = move-exception
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r14 = 2427(0x97b, float:3.401E-42)
            short r14 = (short) r14
            r15 = 14097(0x3711, float:1.9754E-41)
            short r15 = (short) r15
            java.lang.String r6 = length(r6, r14, r15)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x01bb
            if (r12 < r11) goto L_0x01bb
            if (r12 > r5) goto L_0x01bb
        L_0x01b9:
            r6 = 1
            goto L_0x021c
        L_0x01bb:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r15 = 2439(0x987, float:3.418E-42)
            short r15 = (short) r15
            r4 = 7187(0x1c13, float:1.0071E-41)
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r15, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x01df
            if (r12 < r13) goto L_0x01df
            r4 = 23
            if (r12 > r4) goto L_0x01df
            r4 = 51
            r6 = 51
            goto L_0x021c
        L_0x01df:
            byte[] r4 = setMin
            byte r4 = r4[r7]
            byte r4 = (byte) r4
            r6 = 2432(0x980, float:3.408E-42)
            short r6 = (short) r6
            r13 = 14148(0x3744, float:1.9826E-41)
            short r13 = (short) r13
            java.lang.String r4 = length(r4, r6, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x01fd
            if (r12 < r10) goto L_0x01fd
            if (r12 > r9) goto L_0x01fd
            goto L_0x01b9
        L_0x01fd:
            byte[] r4 = setMin
            byte r6 = r4[r7]
            byte r6 = (byte) r6
            byte r4 = r4[r3]
            short r4 = (short) r4
            java.lang.String r4 = length(r6, r14, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0226
            r4 = 41
            if (r12 < r4) goto L_0x0226
            r4 = 42
            if (r12 > r4) goto L_0x0226
            goto L_0x01b9
        L_0x021c:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r4 = 1
            goto L_0x0116
        L_0x0226:
            throw r0
        L_0x0227:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x022f
            throw r1
        L_0x022f:
            goto L_0x0231
        L_0x0230:
            throw r0
        L_0x0231:
            goto L_0x0230
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.isInside(o.sendSensorResult):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ android.content.Context length(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r3 = r0 | 2244(0x8c4, float:3.145E-42)
            short r3 = (short) r3
            r4 = 7636(0x1dd4, float:1.07E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x028a }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x028a }
            byte[] r3 = setMin     // Catch:{ all -> 0x028a }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x028a }
            byte r3 = (byte) r3     // Catch:{ all -> 0x028a }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x028a }
            int r10 = setMax     // Catch:{ all -> 0x028a }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x028a }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x028a }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x028a }
            byte[] r10 = setMin     // Catch:{ all -> 0x028a }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x028a }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x028a }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x028a }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x028a }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x028a }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x028a }
            byte[] r12 = setMin     // Catch:{ all -> 0x028a }
            byte r12 = r12[r8]     // Catch:{ all -> 0x028a }
            byte r12 = (byte) r12     // Catch:{ all -> 0x028a }
            int r13 = setMax     // Catch:{ all -> 0x028a }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x028a }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x028a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x028a }
            r11[r7] = r12     // Catch:{ all -> 0x028a }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x028a }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x028a }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x028a }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0110
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r11[r7] = r10     // Catch:{ all -> 0x0107 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0107 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0107 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0107 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0107 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0107 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0107 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0107 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0107 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0107 }
            int r2 = setMax     // Catch:{ all -> 0x0107 }
            r2 = r2 | 11522(0x2d02, float:1.6146E-41)
            short r2 = (short) r2     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = length(r15, r9, r2)     // Catch:{ all -> 0x0107 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0107 }
            r14[r7] = r2     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r2 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0107 }
            r10 = 0
            java.lang.Object r2 = r2.invoke(r10, r11)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fe }
            byte r11 = r11[r8]     // Catch:{ all -> 0x00fe }
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fe }
            int r13 = setMax     // Catch:{ all -> 0x00fe }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x00fe }
            byte[] r12 = setMin     // Catch:{ all -> 0x00fe }
            byte r12 = r12[r8]     // Catch:{ all -> 0x00fe }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x00fe }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x00fe }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r2 = r11.invoke(r2, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00fe }
            int r2 = r2.intValue()     // Catch:{ all -> 0x00fe }
            r3[r6] = r2
            int r6 = r6 + 1
            r2 = 33
            goto L_0x007c
        L_0x00fe:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0106
            throw r1
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r2 = 7
            r6 = 34
        L_0x0113:
            int r9 = r7 + 1
            r10 = 3
            r11 = 4
            r0 = r3[r7]     // Catch:{ all -> 0x01ae }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01ae }
            r7 = 8
            r12 = 48
            switch(r0) {
                case -16: goto L_0x01a7;
                case -15: goto L_0x01a4;
                case -14: goto L_0x0197;
                case -13: goto L_0x0193;
                case -12: goto L_0x0191;
                case -11: goto L_0x0187;
                case -10: goto L_0x0178;
                case -9: goto L_0x016e;
                case -8: goto L_0x0166;
                case -7: goto L_0x015e;
                case -6: goto L_0x0148;
                case -5: goto L_0x0145;
                case -4: goto L_0x0142;
                case -3: goto L_0x012c;
                case -2: goto L_0x0129;
                case -1: goto L_0x0126;
                default: goto L_0x0124;
            }     // Catch:{ all -> 0x01ae }
        L_0x0124:
            goto L_0x01ab
        L_0x0126:
            r7 = 58
            goto L_0x0113
        L_0x0129:
            r7 = 10
            goto L_0x0113
        L_0x012c:
            r1.setMin = r5     // Catch:{ all -> 0x01ae }
            r1.length(r10)     // Catch:{ all -> 0x01ae }
            r1.length(r11)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01ae }
            android.content.Context r0 = r0.toIntRange     // Catch:{ all -> 0x01ae }
            r1.toIntRange = r0     // Catch:{ all -> 0x01ae }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x0142:
            r7 = 34
            goto L_0x0113
        L_0x0145:
            r7 = 9
            goto L_0x0113
        L_0x0148:
            r1.length(r5)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            r7 = 19
            r9 = 2
            if (r0 == r7) goto L_0x015c
            r7 = 86
            if (r0 == r7) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            r0 = 61
            r7 = 61
            goto L_0x0113
        L_0x015c:
            r7 = 2
            goto L_0x0113
        L_0x015e:
            r1.length(r7)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x01ae }
            return r0
        L_0x0166:
            r1.length(r7)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x016e:
            int r0 = b     // Catch:{ all -> 0x01ae }
            r1.setMin = r0     // Catch:{ all -> 0x01ae }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x0178:
            r1.setMin = r5     // Catch:{ all -> 0x01ae }
            r1.length(r10)     // Catch:{ all -> 0x01ae }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x0187:
            r1.length(r12)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x01ab
            r7 = 33
            goto L_0x0113
        L_0x0191:
            r7 = 7
            goto L_0x0113
        L_0x0193:
            r7 = 13
            goto L_0x0113
        L_0x0197:
            r1.length(r12)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x01ab
            r0 = 56
            r7 = 56
            goto L_0x0113
        L_0x01a4:
            r7 = 1
            goto L_0x0113
        L_0x01a7:
            r7 = 15
            goto L_0x0113
        L_0x01ab:
            r7 = r9
            goto L_0x0113
        L_0x01ae:
            r0 = move-exception
            r7 = 12
            r12 = 57
            r13 = 64
            if (r9 < r11) goto L_0x01bd
            if (r9 > r2) goto L_0x01bd
            r7 = 57
            goto L_0x027f
        L_0x01bd:
            byte[] r14 = setMin
            byte r14 = r14[r8]
            byte r14 = (byte) r14
            r15 = 2428(0x97c, float:3.402E-42)
            short r15 = (short) r15
            r2 = r15 & 208(0xd0, float:2.91E-43)
            short r2 = (short) r2
            java.lang.String r2 = length(r14, r15, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x01dc
            if (r9 < r10) goto L_0x01dc
            if (r9 > r11) goto L_0x01dc
            goto L_0x027f
        L_0x01dc:
            byte[] r2 = setMin
            byte r2 = r2[r8]
            byte r2 = (byte) r2
            r10 = 2419(0x973, float:3.39E-42)
            short r10 = (short) r10
            r11 = 13371(0x343b, float:1.8737E-41)
            short r11 = (short) r11
            java.lang.String r2 = length(r2, r10, r11)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x01fd
            if (r9 < r4) goto L_0x01fd
            if (r9 > r6) goto L_0x01fd
        L_0x01f9:
            r7 = 64
            goto L_0x027f
        L_0x01fd:
            byte[] r2 = setMin
            byte r2 = r2[r8]
            byte r2 = (byte) r2
            r10 = 2439(0x987, float:3.418E-42)
            short r10 = (short) r10
            r11 = 7187(0x1c13, float:1.0071E-41)
            short r11 = (short) r11
            java.lang.String r2 = length(r2, r10, r11)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x021d
            r2 = 29
            if (r9 < r2) goto L_0x021d
            if (r9 > r6) goto L_0x021d
            goto L_0x01f9
        L_0x021d:
            byte[] r2 = setMin
            byte r2 = r2[r8]
            byte r2 = (byte) r2
            int r10 = setMax
            r10 = r10 | 2336(0x920, float:3.273E-42)
            short r10 = (short) r10
            r11 = 8656(0x21d0, float:1.213E-41)
            short r11 = (short) r11
            java.lang.String r2 = length(r2, r10, r11)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x023d
            if (r9 < r6) goto L_0x023d
            if (r9 > r12) goto L_0x023d
            goto L_0x01f9
        L_0x023d:
            byte[] r2 = setMin
            byte r2 = r2[r8]
            byte r2 = (byte) r2
            int r10 = setMax
            r10 = r10 | 2336(0x920, float:3.273E-42)
            short r10 = (short) r10
            java.lang.String r2 = length(r2, r10, r11)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x025c
            r2 = 51
            if (r9 < r2) goto L_0x025c
            if (r9 > r12) goto L_0x025c
            goto L_0x027f
        L_0x025c:
            byte[] r2 = setMin
            byte r2 = r2[r8]
            byte r2 = (byte) r2
            r7 = 2427(0x97b, float:3.401E-42)
            short r7 = (short) r7
            r10 = 14097(0x3711, float:1.9754E-41)
            short r10 = (short) r10
            java.lang.String r2 = length(r2, r7, r10)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0289
            r2 = 62
            if (r9 < r2) goto L_0x0289
            r2 = 63
            if (r9 > r2) goto L_0x0289
            goto L_0x01f9
        L_0x027f:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r2 = 7
            goto L_0x0113
        L_0x0289:
            throw r0
        L_0x028a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0292
            throw r1
        L_0x0292:
            goto L_0x0294
        L_0x0293:
            throw r0
        L_0x0294:
            goto L_0x0293
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.length(o.sendSensorResult):android.content.Context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(int r6, int r7, short r8) {
        /*
            int r7 = 2458 - r7
            int r8 = r8 + 4
            int r6 = r6 + 44
            byte[] r0 = setMin
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0030
        L_0x0015:
            r3 = 0
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0019:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x0024
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0024:
            byte r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0030:
            int r8 = r8 + 1
            int r7 = -r7
            int r7 = r7 + r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.length(int, int, short):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void length(o.sendSensorResult r16, int r17) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r2 = r17
            r1.<init>((java.lang.Object) r0, (int) r2)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = r0 | 2196(0x894, float:3.077E-42)
            short r2 = (short) r2
            r3 = 14214(0x3786, float:1.9918E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r3 = r2 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x02c1 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x02c1 }
            byte[] r2 = setMin     // Catch:{ all -> 0x02c1 }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r6]     // Catch:{ all -> 0x02c1 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x02c1 }
            r7 = 2442(0x98a, float:3.422E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x02c1 }
            int r8 = setMax     // Catch:{ all -> 0x02c1 }
            r8 = r8 | 11522(0x2d02, float:1.6146E-41)
            short r8 = (short) r8     // Catch:{ all -> 0x02c1 }
            java.lang.String r2 = length(r2, r7, r8)     // Catch:{ all -> 0x02c1 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x02c1 }
            byte[] r8 = setMin     // Catch:{ all -> 0x02c1 }
            r9 = 7213(0x1c2d, float:1.0108E-41)
            byte r8 = r8[r9]     // Catch:{ all -> 0x02c1 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x02c1 }
            r9 = 2453(0x995, float:3.437E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02c1 }
            r10 = 1053(0x41d, float:1.476E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x02c1 }
            java.lang.String r8 = length(r8, r9, r10)     // Catch:{ all -> 0x02c1 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x02c1 }
            byte[] r10 = setMin     // Catch:{ all -> 0x02c1 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x02c1 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02c1 }
            int r11 = setMax     // Catch:{ all -> 0x02c1 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x02c1 }
            java.lang.String r10 = length(r10, r7, r11)     // Catch:{ all -> 0x02c1 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x02c1 }
            r9[r5] = r10     // Catch:{ all -> 0x02c1 }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r9)     // Catch:{ all -> 0x02c1 }
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch:{ all -> 0x02c1 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02c1 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x007e:
            int r8 = r0.length
            if (r4 >= r8) goto L_0x010f
            r8 = r0[r4]
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0106 }
            r9[r5] = r8     // Catch:{ all -> 0x0106 }
            byte[] r8 = setMin     // Catch:{ all -> 0x0106 }
            byte r8 = r8[r6]     // Catch:{ all -> 0x0106 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0106 }
            r10 = 2441(0x989, float:3.42E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0106 }
            int r11 = setMax     // Catch:{ all -> 0x0106 }
            r11 = r11 & 480(0x1e0, float:6.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = length(r8, r10, r11)     // Catch:{ all -> 0x0106 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0106 }
            r11 = 74
            byte r11 = (byte) r11     // Catch:{ all -> 0x0106 }
            r12 = 2451(0x993, float:3.435E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0106 }
            r13 = 13879(0x3637, float:1.9449E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0106 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0106 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0106 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0106 }
            byte r13 = r13[r6]     // Catch:{ all -> 0x0106 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0106 }
            int r14 = setMax     // Catch:{ all -> 0x0106 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0106 }
            java.lang.String r13 = length(r13, r7, r14)     // Catch:{ all -> 0x0106 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0106 }
            r12[r5] = r13     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x0106 }
            r11 = 0
            java.lang.Object r8 = r8.invoke(r11, r9)     // Catch:{ all -> 0x0106 }
            byte[] r9 = setMin     // Catch:{ all -> 0x00fd }
            byte r9 = r9[r6]     // Catch:{ all -> 0x00fd }
            byte r9 = (byte) r9     // Catch:{ all -> 0x00fd }
            int r12 = setMax     // Catch:{ all -> 0x00fd }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x00fd }
            java.lang.String r9 = length(r9, r10, r12)     // Catch:{ all -> 0x00fd }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x00fd }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fd }
            byte r10 = r10[r6]     // Catch:{ all -> 0x00fd }
            int r10 = r10 - r3
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fd }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x00fd }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x00fd }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x00fd }
            java.lang.Object r8 = r9.invoke(r8, r11)     // Catch:{ all -> 0x00fd }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00fd }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00fd }
            r2[r4] = r8
            int r4 = r4 + 1
            goto L_0x007e
        L_0x00fd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0105
            throw r1
        L_0x0105:
            throw r0
        L_0x0106:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010e
            throw r1
        L_0x010e:
            throw r0
        L_0x010f:
            r4 = 25
            r7 = 62
            r8 = 55
            r9 = 77
            r10 = 14
            r11 = 21
        L_0x011b:
            int r12 = r5 + 1
            r13 = 4
            r0 = r2[r5]     // Catch:{ all -> 0x01e5 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01e5 }
            r5 = 2
            r14 = 3
            switch(r0) {
                case -21: goto L_0x01de;
                case -20: goto L_0x01da;
                case -19: goto L_0x01cb;
                case -18: goto L_0x01be;
                case -17: goto L_0x01b9;
                case -16: goto L_0x01a6;
                case -15: goto L_0x01a2;
                case -14: goto L_0x019e;
                case -13: goto L_0x018f;
                case -12: goto L_0x0182;
                case -11: goto L_0x017d;
                case -10: goto L_0x017b;
                case -9: goto L_0x0178;
                case -8: goto L_0x0175;
                case -7: goto L_0x0174;
                case -6: goto L_0x016a;
                case -5: goto L_0x0167;
                case -4: goto L_0x0152;
                case -3: goto L_0x013d;
                case -2: goto L_0x012e;
                case -1: goto L_0x012b;
                default: goto L_0x0129;
            }     // Catch:{ all -> 0x01e5 }
        L_0x0129:
            goto L_0x01e2
        L_0x012b:
            r5 = 14
            goto L_0x011b
        L_0x012e:
            r1.length(r3)     // Catch:{ all -> 0x01e5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e5 }
            r5 = 59
            if (r0 == 0) goto L_0x0138
            goto L_0x011b
        L_0x0138:
            r0 = 10
            r5 = 10
            goto L_0x011b
        L_0x013d:
            r1.setMin = r5     // Catch:{ all -> 0x01e5 }
            r1.length(r14)     // Catch:{ all -> 0x01e5 }
            r1.length(r13)     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01e5 }
            r1.length(r11)     // Catch:{ all -> 0x01e5 }
            int r5 = r1.setMax     // Catch:{ all -> 0x01e5 }
            r0.toFloatRange = r5     // Catch:{ all -> 0x01e5 }
            goto L_0x01e2
        L_0x0152:
            r1.setMin = r3     // Catch:{ all -> 0x01e5 }
            r1.length(r14)     // Catch:{ all -> 0x01e5 }
            r1.length(r13)     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e5 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01e5 }
            r1.setMin = r0     // Catch:{ all -> 0x01e5 }
        L_0x0162:
            r1.length(r10)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e2
        L_0x0167:
            r5 = 25
            goto L_0x011b
        L_0x016a:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e5 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e5 }
            throw r0     // Catch:{ all -> 0x01e5 }
        L_0x0174:
            return
        L_0x0175:
            r5 = 62
            goto L_0x011b
        L_0x0178:
            r5 = 55
            goto L_0x011b
        L_0x017b:
            r5 = 1
            goto L_0x011b
        L_0x017d:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01e5 }
            r1.setMin = r0     // Catch:{ all -> 0x01e5 }
            goto L_0x0162
        L_0x0182:
            r1.setMin = r3     // Catch:{ all -> 0x01e5 }
            r1.length(r14)     // Catch:{ all -> 0x01e5 }
            r1.length(r11)     // Catch:{ all -> 0x01e5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e5 }
            b = r0     // Catch:{ all -> 0x01e5 }
            goto L_0x01e2
        L_0x018f:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x01e5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01e2
            r0 = 54
            r5 = 54
            goto L_0x011b
        L_0x019e:
            r5 = 57
            goto L_0x011b
        L_0x01a2:
            r5 = 23
            goto L_0x011b
        L_0x01a6:
            r1.length(r3)     // Catch:{ all -> 0x01e5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e5 }
            r12 = 71
            if (r0 == r12) goto L_0x01b3
            r12 = 86
            goto L_0x011b
        L_0x01b3:
            r0 = 17
            r5 = 17
            goto L_0x011b
        L_0x01b9:
            int r0 = b     // Catch:{ all -> 0x01e5 }
            r1.setMin = r0     // Catch:{ all -> 0x01e5 }
            goto L_0x0162
        L_0x01be:
            r1.setMin = r3     // Catch:{ all -> 0x01e5 }
            r1.length(r14)     // Catch:{ all -> 0x01e5 }
            r1.length(r11)     // Catch:{ all -> 0x01e5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e5 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01e5 }
            goto L_0x01e2
        L_0x01cb:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01e5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01e2
            r0 = 76
            r5 = 76
            goto L_0x011b
        L_0x01da:
            r5 = 21
            goto L_0x011b
        L_0x01de:
            r5 = 77
            goto L_0x011b
        L_0x01e2:
            r5 = r12
            goto L_0x011b
        L_0x01e5:
            r0 = move-exception
            r5 = 5
            r15 = 9
            if (r12 < r5) goto L_0x01f1
            if (r12 > r15) goto L_0x01f1
            r5 = 61
            goto L_0x02b6
        L_0x01f1:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r3 = 2428(0x97c, float:3.402E-42)
            short r3 = (short) r3
            r14 = r3 & 208(0xd0, float:2.91E-43)
            short r14 = (short) r14
            java.lang.String r3 = length(r5, r3, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0212
            if (r12 < r13) goto L_0x0212
            if (r12 > r15) goto L_0x0212
        L_0x020e:
            r5 = 56
            goto L_0x02b6
        L_0x0212:
            r3 = 11
            if (r12 < r3) goto L_0x021e
            if (r12 > r10) goto L_0x021e
            r3 = 79
            r5 = 79
            goto L_0x02b6
        L_0x021e:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            r5 = r3 | 2368(0x940, float:3.318E-42)
            short r5 = (short) r5
            r13 = 11228(0x2bdc, float:1.5734E-41)
            short r13 = (short) r13
            java.lang.String r3 = length(r3, r5, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x023e
            r3 = 19
            if (r12 < r3) goto L_0x023e
            if (r12 > r11) goto L_0x023e
            goto L_0x020e
        L_0x023e:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            int r5 = setMax
            r5 = r5 | 2336(0x920, float:3.273E-42)
            short r5 = (short) r5
            r13 = 8656(0x21d0, float:1.213E-41)
            short r13 = (short) r13
            java.lang.String r3 = length(r3, r5, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x025e
            if (r12 < r4) goto L_0x025e
            if (r12 > r8) goto L_0x025e
            goto L_0x020e
        L_0x025e:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            r5 = 2439(0x987, float:3.418E-42)
            short r5 = (short) r5
            r13 = 7187(0x1c13, float:1.0071E-41)
            short r13 = (short) r13
            java.lang.String r3 = length(r3, r5, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0282
            r3 = 50
            if (r12 < r3) goto L_0x0282
            r3 = 51
            if (r12 > r3) goto L_0x0282
        L_0x027f:
            r5 = 9
            goto L_0x02b6
        L_0x0282:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            java.lang.String r3 = length(r3, r5, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x029c
            if (r12 < r7) goto L_0x029c
            r3 = 63
            if (r12 > r3) goto L_0x029c
            goto L_0x027f
        L_0x029c:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            java.lang.String r3 = length(r3, r5, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02c0
            r3 = 72
            if (r12 < r3) goto L_0x02c0
            if (r12 > r9) goto L_0x02c0
            goto L_0x027f
        L_0x02b6:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r3 = 1
            goto L_0x011b
        L_0x02c0:
            throw r0
        L_0x02c1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02c9
            throw r1
        L_0x02c9:
            goto L_0x02cb
        L_0x02ca:
            throw r0
        L_0x02cb:
            goto L_0x02ca
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.length(o.sendSensorResult, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ o.CompassSensorService.getMin setMax(o.sendSensorResult r17) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r17
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = r0 | 2242(0x8c2, float:3.142E-42)
            short r2 = (short) r2
            r3 = 8684(0x21ec, float:1.2169E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r4 = r2 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0280 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0280 }
            byte[] r2 = setMin     // Catch:{ all -> 0x0280 }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r7]     // Catch:{ all -> 0x0280 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0280 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0280 }
            int r9 = setMax     // Catch:{ all -> 0x0280 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x0280 }
            java.lang.String r2 = length(r2, r8, r9)     // Catch:{ all -> 0x0280 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0280 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0280 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x0280 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0280 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0280 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0280 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x0280 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0280 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0280 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0280 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0280 }
            int r12 = setMax     // Catch:{ all -> 0x0280 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0280 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x0280 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0280 }
            r10[r6] = r11     // Catch:{ all -> 0x0280 }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r10)     // Catch:{ all -> 0x0280 }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x0280 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0280 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = 0
        L_0x007c:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010d
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0104 }
            r10[r6] = r9     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0104 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0104 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0104 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0104 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0104 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0104 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0104 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0104 }
            int r15 = setMax     // Catch:{ all -> 0x0104 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0104 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0104 }
            r13[r6] = r14     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0104 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0104 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            int r13 = setMax     // Catch:{ all -> 0x00fb }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fb }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fb }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fb }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fb }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fb }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fb }
            r2[r5] = r9
            int r5 = r5 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r5 = 6
            r8 = 42
            r9 = 8
            r10 = 14
        L_0x0114:
            int r11 = r6 + 1
            r12 = 4
            r0 = r2[r6]     // Catch:{ all -> 0x01a6 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01a6 }
            r6 = 48
            r13 = 3
            switch(r0) {
                case -16: goto L_0x019f;
                case -15: goto L_0x0197;
                case -14: goto L_0x0194;
                case -13: goto L_0x0188;
                case -12: goto L_0x0185;
                case -11: goto L_0x0182;
                case -10: goto L_0x0176;
                case -9: goto L_0x0167;
                case -8: goto L_0x015f;
                case -7: goto L_0x015d;
                case -6: goto L_0x015a;
                case -5: goto L_0x0157;
                case -4: goto L_0x0142;
                case -3: goto L_0x0130;
                case -2: goto L_0x0128;
                case -1: goto L_0x0125;
                default: goto L_0x0123;
            }     // Catch:{ all -> 0x01a6 }
        L_0x0123:
            goto L_0x01a3
        L_0x0125:
            r6 = 63
            goto L_0x0114
        L_0x0128:
            r1.length(r9)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01a6 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x0130:
            r1.length(r4)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            r6 = 30
            r11 = 10
            if (r0 == r6) goto L_0x0140
            r6 = 68
            r6 = 10
            goto L_0x0114
        L_0x0140:
            r6 = 3
            goto L_0x0114
        L_0x0142:
            r1.setMin = r4     // Catch:{ all -> 0x01a6 }
            r1.length(r13)     // Catch:{ all -> 0x01a6 }
            r1.length(r12)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01a6 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01a6 }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x01a6 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01a6 }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0157:
            r6 = 42
            goto L_0x0114
        L_0x015a:
            r6 = 59
            goto L_0x0114
        L_0x015d:
            r6 = 2
            goto L_0x0114
        L_0x015f:
            int r0 = b     // Catch:{ all -> 0x01a6 }
            r1.setMin = r0     // Catch:{ all -> 0x01a6 }
            r1.length(r10)     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0167:
            r1.setMin = r4     // Catch:{ all -> 0x01a6 }
            r1.length(r13)     // Catch:{ all -> 0x01a6 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01a6 }
            goto L_0x01a3
        L_0x0176:
            r1.length(r6)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            if (r0 != 0) goto L_0x01a3
            r0 = 41
            r6 = 41
            goto L_0x0114
        L_0x0182:
            r6 = 8
            goto L_0x0114
        L_0x0185:
            r6 = 61
            goto L_0x0114
        L_0x0188:
            r1.length(r6)     // Catch:{ all -> 0x01a6 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01a6 }
            if (r0 != 0) goto L_0x01a3
            r0 = 57
            r6 = 57
            goto L_0x0114
        L_0x0194:
            r6 = 6
            goto L_0x0114
        L_0x0197:
            r1.length(r9)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01a6 }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x01a6 }
            return r0
        L_0x019f:
            r6 = 14
            goto L_0x0114
        L_0x01a3:
            r6 = r11
            goto L_0x0114
        L_0x01a6:
            r0 = move-exception
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r13 = 2428(0x97c, float:3.402E-42)
            short r13 = (short) r13
            r14 = r13 & 208(0xd0, float:2.91E-43)
            short r14 = (short) r14
            java.lang.String r6 = length(r6, r13, r14)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r15 = 7
            r4 = 58
            if (r6 == 0) goto L_0x01cb
            if (r11 < r12) goto L_0x01cb
            if (r11 > r5) goto L_0x01cb
        L_0x01c7:
            r6 = 58
            goto L_0x0274
        L_0x01cb:
            r6 = 12
            if (r11 < r6) goto L_0x01d4
            if (r11 > r10) goto L_0x01d4
            r6 = 1
            goto L_0x0274
        L_0x01d4:
            byte[] r6 = setMin
            byte r12 = r6[r7]
            byte r12 = (byte) r12
            r5 = 2423(0x977, float:3.395E-42)
            short r5 = (short) r5
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r6 = r6[r16]
            short r6 = (short) r6
            java.lang.String r5 = length(r12, r5, r6)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x01f8
            r5 = 11
            if (r11 < r5) goto L_0x01f8
            if (r11 > r10) goto L_0x01f8
        L_0x01f5:
            r6 = 7
            goto L_0x0274
        L_0x01f8:
            byte[] r5 = setMin
            byte r6 = r5[r7]
            byte r6 = (byte) r6
            r12 = 2427(0x97b, float:3.401E-42)
            short r12 = (short) r12
            byte r5 = r5[r3]
            short r5 = (short) r5
            java.lang.String r5 = length(r6, r12, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0216
            if (r11 < r10) goto L_0x0216
            if (r11 > r8) goto L_0x0216
            goto L_0x01c7
        L_0x0216:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r13, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0232
            r5 = 36
            if (r11 < r5) goto L_0x0232
            r5 = 37
            if (r11 > r5) goto L_0x0232
            goto L_0x01c7
        L_0x0232:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r6 = 2432(0x980, float:3.408E-42)
            short r6 = (short) r6
            r12 = 14148(0x3744, float:1.9826E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r6, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0252
            if (r11 < r8) goto L_0x0252
            r5 = 43
            if (r11 > r5) goto L_0x0252
            goto L_0x01f5
        L_0x0252:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            int r6 = setMax
            r6 = r6 | 2336(0x920, float:3.273E-42)
            short r6 = (short) r6
            r12 = 8656(0x21d0, float:1.213E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r6, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x027f
            r5 = 52
            if (r11 < r5) goto L_0x027f
            if (r11 > r4) goto L_0x027f
            goto L_0x01f5
        L_0x0274:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r4 = 1
            r5 = 6
            goto L_0x0114
        L_0x027f:
            throw r0
        L_0x0280:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0288
            throw r1
        L_0x0288:
            goto L_0x028a
        L_0x0289:
            throw r0
        L_0x028a:
            goto L_0x0289
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax(o.sendSensorResult):o.CompassSensorService$getMin");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setMax(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r18
            r0 = r19
            r3 = r20
            r1.<init>(r2, r0, r3)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 2260(0x8d4, float:3.167E-42)
            short r3 = (short) r3
            r4 = 7439(0x1d0f, float:1.0424E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0339 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x0339 }
            byte[] r3 = setMin     // Catch:{ all -> 0x0339 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x0339 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0339 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0339 }
            int r10 = setMax     // Catch:{ all -> 0x0339 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x0339 }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x0339 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0339 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0339 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0339 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0339 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0339 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0339 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x0339 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0339 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0339 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0339 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0339 }
            int r13 = setMax     // Catch:{ all -> 0x0339 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0339 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x0339 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0339 }
            r11[r7] = r12     // Catch:{ all -> 0x0339 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x0339 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x0339 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0339 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x0080:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0114
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x010b }
            r11[r7] = r10     // Catch:{ all -> 0x010b }
            byte[] r10 = setMin     // Catch:{ all -> 0x010b }
            byte r10 = r10[r8]     // Catch:{ all -> 0x010b }
            byte r10 = (byte) r10     // Catch:{ all -> 0x010b }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x010b }
            int r13 = setMax     // Catch:{ all -> 0x010b }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x010b }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x010b }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x010b }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x010b }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x010b }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            byte[] r15 = setMin     // Catch:{ all -> 0x010b }
            byte r15 = r15[r8]     // Catch:{ all -> 0x010b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010b }
            int r4 = setMax     // Catch:{ all -> 0x010b }
            r4 = r4 | 11522(0x2d02, float:1.6146E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x010b }
            java.lang.String r4 = length(r15, r9, r4)     // Catch:{ all -> 0x010b }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x010b }
            r14[r7] = r4     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r4 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x010b }
            r10 = 0
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x0102 }
            byte r11 = r11[r8]     // Catch:{ all -> 0x0102 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0102 }
            int r13 = setMax     // Catch:{ all -> 0x0102 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0102 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0102 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0102 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0102 }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0102 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Object r4 = r11.invoke(r4, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0102 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0102 }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 15
            goto L_0x0080
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010a
            throw r1
        L_0x010a:
            throw r0
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r4 = 12
            r6 = 5
            r9 = 49
            r10 = 3
        L_0x011a:
            int r11 = r7 + 1
            r12 = 37
            r0 = r3[r7]     // Catch:{ all -> 0x01e1 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01e1 }
            r7 = 4
            switch(r0) {
                case -16: goto L_0x01dd;
                case -15: goto L_0x01d9;
                case -14: goto L_0x01b4;
                case -13: goto L_0x01a1;
                case -12: goto L_0x0190;
                case -11: goto L_0x017c;
                case -10: goto L_0x017a;
                case -9: goto L_0x0178;
                case -8: goto L_0x016a;
                case -7: goto L_0x015a;
                case -6: goto L_0x014f;
                case -5: goto L_0x013c;
                case -4: goto L_0x0139;
                case -3: goto L_0x0136;
                case -2: goto L_0x012c;
                case -1: goto L_0x012a;
                default: goto L_0x0128;
            }     // Catch:{ all -> 0x01e1 }
        L_0x0128:
            goto L_0x01de
        L_0x012a:
            r7 = 7
            goto L_0x011a
        L_0x012c:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e1 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x0136:
            r7 = 11
            goto L_0x011a
        L_0x0139:
            r7 = 12
            goto L_0x011a
        L_0x013c:
            r1.length(r5)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e1 }
            r7 = 10
            r11 = 51
            if (r0 == r7) goto L_0x014c
            r7 = 60
            r7 = 51
            goto L_0x011a
        L_0x014c:
            r7 = 37
            goto L_0x011a
        L_0x014f:
            int r0 = b     // Catch:{ all -> 0x01e1 }
            r1.setMin = r0     // Catch:{ all -> 0x01e1 }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x015a:
            r1.setMin = r5     // Catch:{ all -> 0x01e1 }
            r1.length(r10)     // Catch:{ all -> 0x01e1 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e1 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x016a:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01de
            r0 = 36
            r7 = 36
            goto L_0x011a
        L_0x0178:
            r7 = 5
            goto L_0x011a
        L_0x017a:
            r7 = 3
            goto L_0x011a
        L_0x017c:
            r1.setMin = r5     // Catch:{ all -> 0x01e1 }
            r1.length(r10)     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e1 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01e1 }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x01e1 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01e1 }
        L_0x018c:
            r1.length(r6)     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x0190:
            r1.setMin = r5     // Catch:{ all -> 0x01e1 }
            r1.length(r10)     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e1 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01e1 }
            o.setEncryptProxy r0 = r0.getMax     // Catch:{ all -> 0x01e1 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01e1 }
            goto L_0x018c
        L_0x01a1:
            r1.setMin = r5     // Catch:{ all -> 0x01e1 }
            r1.length(r10)     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e1 }
            o.setEncryptProxy r0 = (o.setEncryptProxy) r0     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.getAction()     // Catch:{ all -> 0x01e1 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01e1 }
            goto L_0x018c
        L_0x01b4:
            r1.setMin = r7     // Catch:{ all -> 0x01e1 }
            r1.length(r10)     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e1 }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r13 = r1.equals     // Catch:{ all -> 0x01e1 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r14 = r1.equals     // Catch:{ all -> 0x01e1 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x01e1 }
            r1.length(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01e1 }
            r0.setMax(r13, r14, r7)     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x01d9:
            r7 = 49
            goto L_0x011a
        L_0x01dd:
            return
        L_0x01de:
            r7 = r11
            goto L_0x011a
        L_0x01e1:
            r0 = move-exception
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r13 = 2424(0x978, float:3.397E-42)
            short r13 = (short) r13
            r14 = 14181(0x3765, float:1.9872E-41)
            short r14 = (short) r14
            java.lang.String r7 = length(r7, r13, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            r13 = 59
            r14 = 2
            if (r7 == 0) goto L_0x0207
            if (r11 < r4) goto L_0x0207
            if (r11 > r12) goto L_0x0207
        L_0x0202:
            r7 = 2
        L_0x0203:
            r15 = 15
            goto L_0x032c
        L_0x0207:
            byte[] r7 = setMin
            byte r15 = r7[r8]
            byte r15 = (byte) r15
            r4 = 2427(0x97b, float:3.401E-42)
            short r4 = (short) r4
            r16 = 15
            byte r7 = r7[r16]
            short r7 = (short) r7
            java.lang.String r7 = length(r15, r4, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0229
            r7 = 31
            if (r11 < r7) goto L_0x0229
            if (r11 > r12) goto L_0x0229
            goto L_0x0202
        L_0x0229:
            r7 = 45
            if (r11 < r7) goto L_0x0232
            if (r11 > r9) goto L_0x0232
            r7 = 59
            goto L_0x0203
        L_0x0232:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r12 = 2419(0x973, float:3.39E-42)
            short r12 = (short) r12
            r15 = 13371(0x343b, float:1.8737E-41)
            short r15 = (short) r15
            java.lang.String r7 = length(r7, r12, r15)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0252
            r7 = 38
            if (r11 < r7) goto L_0x0252
            if (r11 > r9) goto L_0x0252
            goto L_0x0202
        L_0x0252:
            byte[] r7 = setMin
            byte r5 = r7[r8]
            byte r5 = (byte) r5
            r17 = 15
            byte r7 = r7[r17]
            short r7 = (short) r7
            java.lang.String r5 = length(r5, r4, r7)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r7 = 42
            if (r5 == 0) goto L_0x0273
            r5 = 41
            if (r11 < r5) goto L_0x0273
            if (r11 > r7) goto L_0x0273
            goto L_0x0202
        L_0x0273:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r12, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x028e
            if (r11 < r7) goto L_0x028e
            r5 = 43
            if (r11 > r5) goto L_0x028e
            goto L_0x0202
        L_0x028e:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            r7 = 2432(0x980, float:3.408E-42)
            short r7 = (short) r7
            r12 = 14148(0x3744, float:1.9826E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r7, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02b0
            r5 = 44
            if (r11 < r5) goto L_0x02b0
            if (r11 > r9) goto L_0x02b0
        L_0x02ad:
            r7 = 1
            goto L_0x0203
        L_0x02b0:
            byte[] r5 = setMin
            byte r15 = r5[r8]
            byte r15 = (byte) r15
            r17 = 15
            byte r5 = r5[r17]
            short r5 = (short) r5
            java.lang.String r5 = length(r15, r4, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02cf
            r5 = 52
            if (r11 < r5) goto L_0x02cf
            if (r11 > r13) goto L_0x02cf
            goto L_0x02ad
        L_0x02cf:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r7, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r7 = 55
            if (r5 == 0) goto L_0x02ec
            r5 = 54
            if (r11 < r5) goto L_0x02ec
            if (r11 > r7) goto L_0x02ec
            goto L_0x0202
        L_0x02ec:
            byte[] r5 = setMin
            byte r12 = r5[r8]
            byte r12 = (byte) r12
            r15 = 15
            byte r5 = r5[r15]
            short r5 = (short) r5
            java.lang.String r4 = length(r12, r4, r5)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x030c
            if (r11 < r7) goto L_0x030c
            r4 = 56
            if (r11 > r4) goto L_0x030c
        L_0x030a:
            r7 = 2
            goto L_0x032c
        L_0x030c:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r5 = 2439(0x987, float:3.418E-42)
            short r5 = (short) r5
            r7 = 7187(0x1c13, float:1.0071E-41)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r5, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0338
            r4 = 57
            if (r11 < r4) goto L_0x0338
            if (r11 > r13) goto L_0x0338
            goto L_0x030a
        L_0x032c:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r4 = 12
            r5 = 1
            goto L_0x011a
        L_0x0338:
            throw r0
        L_0x0339:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0341
            throw r1
        L_0x0341:
            goto L_0x0343
        L_0x0342:
            throw r0
        L_0x0343:
            goto L_0x0342
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0370, code lost:
        if (r13 <= 27) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0423, code lost:
        if (r13 <= 89) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0441, code lost:
        if (r13 <= 89) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0145, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a7, code lost:
        r1.length(14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setMax(java.lang.Throwable r18) {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r0 = r18
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r0)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 1782(0x6f6, float:2.497E-42)
            short r3 = (short) r3
            r4 = 4912(0x1330, float:6.883E-42)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x04b8 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x04b8 }
            byte[] r3 = setMin     // Catch:{ all -> 0x04b8 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x04b8 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x04b8 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x04b8 }
            int r10 = setMax     // Catch:{ all -> 0x04b8 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x04b8 }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x04b8 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x04b8 }
            byte[] r10 = setMin     // Catch:{ all -> 0x04b8 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x04b8 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x04b8 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x04b8 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x04b8 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x04b8 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x04b8 }
            byte[] r12 = setMin     // Catch:{ all -> 0x04b8 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x04b8 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x04b8 }
            int r13 = setMax     // Catch:{ all -> 0x04b8 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x04b8 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x04b8 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x04b8 }
            r11[r7] = r12     // Catch:{ all -> 0x04b8 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x04b8 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x04b8 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x04b8 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007e:
            int r10 = r0.length
            r11 = 74
            r12 = 0
            if (r6 >= r10) goto L_0x0114
            r10 = r0[r6]
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x010b }
            r13[r7] = r10     // Catch:{ all -> 0x010b }
            byte[] r10 = setMin     // Catch:{ all -> 0x010b }
            byte r10 = r10[r8]     // Catch:{ all -> 0x010b }
            byte r10 = (byte) r10     // Catch:{ all -> 0x010b }
            r14 = 2441(0x989, float:3.42E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x010b }
            int r15 = setMax     // Catch:{ all -> 0x010b }
            r15 = r15 & 480(0x1e0, float:6.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            java.lang.String r10 = length(r10, r14, r15)     // Catch:{ all -> 0x010b }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x010b }
            byte r11 = (byte) r11     // Catch:{ all -> 0x010b }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            r4 = 13879(0x3637, float:1.9449E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x010b }
            java.lang.String r4 = length(r11, r15, r4)     // Catch:{ all -> 0x010b }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            byte[] r15 = setMin     // Catch:{ all -> 0x010b }
            byte r15 = r15[r8]     // Catch:{ all -> 0x010b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010b }
            int r5 = setMax     // Catch:{ all -> 0x010b }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x010b }
            java.lang.String r5 = length(r15, r9, r5)     // Catch:{ all -> 0x010b }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x010b }
            r11[r7] = r5     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r4 = r10.getMethod(r4, r11)     // Catch:{ all -> 0x010b }
            java.lang.Object r4 = r4.invoke(r12, r13)     // Catch:{ all -> 0x010b }
            byte[] r5 = setMin     // Catch:{ all -> 0x0102 }
            byte r5 = r5[r8]     // Catch:{ all -> 0x0102 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0102 }
            int r10 = setMax     // Catch:{ all -> 0x0102 }
            r10 = r10 & 480(0x1e0, float:6.73E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0102 }
            java.lang.String r5 = length(r5, r14, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0102 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0102 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0102 }
            r11 = 1
            int r10 = r10 - r11
            byte r10 = (byte) r10     // Catch:{ all -> 0x0102 }
            r11 = 2450(0x992, float:3.433E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0102 }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r5 = r5.getMethod(r10, r12)     // Catch:{ all -> 0x0102 }
            java.lang.Object r4 = r5.invoke(r4, r12)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0102 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0102 }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 15
            r5 = 1
            goto L_0x007e
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010a
            throw r1
        L_0x010a:
            throw r0
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r6 = 7
            r0 = 0
        L_0x0116:
            int r13 = r0 + 1
            r14 = 28
            r0 = r3[r0]     // Catch:{ all -> 0x034f }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x034f }
            r15 = 21
            r5 = 2
            r7 = 14
            r9 = 5
            r10 = 48
            r11 = 4
            r4 = 3
            switch(r0) {
                case -53: goto L_0x0345;
                case -52: goto L_0x0338;
                case -51: goto L_0x0335;
                case -50: goto L_0x0332;
                case -49: goto L_0x032e;
                case -48: goto L_0x032c;
                case -47: goto L_0x0329;
                case -46: goto L_0x031e;
                case -45: goto L_0x031a;
                case -44: goto L_0x0316;
                case -43: goto L_0x030b;
                case -42: goto L_0x02f8;
                case -41: goto L_0x02e4;
                case -40: goto L_0x02e0;
                case -39: goto L_0x02dc;
                case -38: goto L_0x02cf;
                case -37: goto L_0x02c0;
                case -36: goto L_0x02ba;
                case -35: goto L_0x02a3;
                case -34: goto L_0x029f;
                case -33: goto L_0x029b;
                case -32: goto L_0x0297;
                case -31: goto L_0x028c;
                case -30: goto L_0x0275;
                case -29: goto L_0x026f;
                case -28: goto L_0x025a;
                case -27: goto L_0x0249;
                case -26: goto L_0x0245;
                case -25: goto L_0x0241;
                case -24: goto L_0x0236;
                case -23: goto L_0x0232;
                case -22: goto L_0x0226;
                case -21: goto L_0x0222;
                case -20: goto L_0x0207;
                case -19: goto L_0x0203;
                case -18: goto L_0x01ff;
                case -17: goto L_0x01f4;
                case -16: goto L_0x01e4;
                case -15: goto L_0x01e3;
                case -14: goto L_0x01df;
                case -13: goto L_0x01db;
                case -12: goto L_0x01d1;
                case -11: goto L_0x01cd;
                case -10: goto L_0x01c9;
                case -9: goto L_0x01c5;
                case -8: goto L_0x01ba;
                case -7: goto L_0x01ab;
                case -6: goto L_0x01a3;
                case -5: goto L_0x019f;
                case -4: goto L_0x0188;
                case -3: goto L_0x0149;
                case -2: goto L_0x0134;
                case -1: goto L_0x0130;
                default: goto L_0x012d;
            }
        L_0x012d:
            r5 = 1
            goto L_0x0349
        L_0x0130:
            r0 = 151(0x97, float:2.12E-43)
            goto L_0x034a
        L_0x0134:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x034f }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x034f }
            r1.toIntRange = r0     // Catch:{ all -> 0x034f }
        L_0x0145:
            r1.length(r9)     // Catch:{ all -> 0x034f }
            goto L_0x012d
        L_0x0149:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            byte[] r4 = setMin     // Catch:{ all -> 0x017f }
            byte r4 = r4[r8]     // Catch:{ all -> 0x017f }
            byte r4 = (byte) r4     // Catch:{ all -> 0x017f }
            r5 = 2439(0x987, float:3.418E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x017f }
            r7 = 9868(0x268c, float:1.3828E-41)
            short r7 = (short) r7     // Catch:{ all -> 0x017f }
            java.lang.String r4 = length(r4, r5, r7)     // Catch:{ all -> 0x017f }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x017f }
            r5 = 59
            byte r5 = (byte) r5     // Catch:{ all -> 0x017f }
            r7 = 2448(0x990, float:3.43E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x017f }
            r10 = 14088(0x3708, float:1.9741E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x017f }
            java.lang.String r5 = length(r5, r7, r10)     // Catch:{ all -> 0x017f }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r12)     // Catch:{ all -> 0x017f }
            java.lang.Object r0 = r4.invoke(r0, r12)     // Catch:{ all -> 0x017f }
            r1.toIntRange = r0     // Catch:{ all -> 0x034f }
            goto L_0x0145
        L_0x017f:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x034f }
            if (r4 == 0) goto L_0x0187
            throw r4     // Catch:{ all -> 0x034f }
        L_0x0187:
            throw r0     // Catch:{ all -> 0x034f }
        L_0x0188:
            r1.setMin = r5     // Catch:{ all -> 0x034f }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x034f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x034f }
            r0.onError(r4)     // Catch:{ all -> 0x034f }
            goto L_0x012d
        L_0x019f:
            r0 = 100
            goto L_0x034a
        L_0x01a3:
            int r0 = b     // Catch:{ all -> 0x034f }
            r1.setMin = r0     // Catch:{ all -> 0x034f }
        L_0x01a7:
            r1.length(r7)     // Catch:{ all -> 0x034f }
            goto L_0x012d
        L_0x01ab:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r15)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x034f }
            goto L_0x012d
        L_0x01ba:
            r1.length(r10)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 != 0) goto L_0x0349
            r0 = 26
            goto L_0x034a
        L_0x01c5:
            r0 = 164(0xa4, float:2.3E-43)
            goto L_0x034a
        L_0x01c9:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x034a
        L_0x01cd:
            r0 = 194(0xc2, float:2.72E-43)
            goto L_0x034a
        L_0x01d1:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x034f }
            throw r0     // Catch:{ all -> 0x034f }
        L_0x01db:
            r0 = 72
            goto L_0x034a
        L_0x01df:
            r0 = 36
            goto L_0x034a
        L_0x01e3:
            return
        L_0x01e4:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 == 0) goto L_0x01f0
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x034a
        L_0x01f0:
            r0 = 66
            goto L_0x034a
        L_0x01f4:
            r1.length(r10)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 != 0) goto L_0x0349
            r0 = 65
            goto L_0x034a
        L_0x01ff:
            r0 = 156(0x9c, float:2.19E-43)
            goto L_0x034a
        L_0x0203:
            r0 = 34
            goto L_0x034a
        L_0x0207:
            r1.setMin = r5     // Catch:{ all -> 0x034f }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x034f }
            r1.length(r15)     // Catch:{ all -> 0x034f }
            int r4 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r4 == 0) goto L_0x021c
            r4 = 1
            goto L_0x021d
        L_0x021c:
            r4 = 0
        L_0x021d:
            r0.length((boolean) r4)     // Catch:{ all -> 0x034f }
            goto L_0x012d
        L_0x0222:
            r0 = 39
            goto L_0x034a
        L_0x0226:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 == 0) goto L_0x0332
            r0 = 74
            goto L_0x034a
        L_0x0232:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x034a
        L_0x0236:
            r1.length(r10)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 != 0) goto L_0x0349
            r0 = 88
            goto L_0x034a
        L_0x0241:
            r0 = 32
            goto L_0x034a
        L_0x0245:
            r0 = 37
            goto L_0x034a
        L_0x0249:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            id.dana.data.base.NetworkException r0 = (id.dana.data.base.NetworkException) r0     // Catch:{ all -> 0x034f }
            r1.toIntRange = r0     // Catch:{ all -> 0x034f }
            goto L_0x0145
        L_0x025a:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            id.dana.data.base.NetworkException r0 = (id.dana.data.base.NetworkException) r0     // Catch:{ all -> 0x034f }
            java.lang.String r0 = r0.getErrorCode()     // Catch:{ all -> 0x034f }
            r1.toIntRange = r0     // Catch:{ all -> 0x034f }
            goto L_0x0145
        L_0x026f:
            java.lang.String r0 = "AE15002058020037"
            r1.toIntRange = r0     // Catch:{ all -> 0x034f }
            goto L_0x0145
        L_0x0275:
            r1.setMin = r5     // Catch:{ all -> 0x034f }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x034f }
            r1.length(r11)     // Catch:{ all -> 0x034f }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x034f }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x034f }
            r1.setMin = r0     // Catch:{ all -> 0x034f }
            goto L_0x01a7
        L_0x028c:
            r1.length(r10)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 != 0) goto L_0x0349
            r0 = 96
            goto L_0x034a
        L_0x0297:
            r0 = 70
            goto L_0x034a
        L_0x029b:
            r0 = 29
            goto L_0x034a
        L_0x029f:
            r0 = 99
            goto L_0x034a
        L_0x02a3:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            r4 = 50
            if (r0 == r4) goto L_0x02b6
            r4 = 83
            if (r0 == r4) goto L_0x02b2
            goto L_0x02b6
        L_0x02b2:
            r0 = 159(0x9f, float:2.23E-43)
            goto L_0x034a
        L_0x02b6:
            r0 = 167(0xa7, float:2.34E-43)
            goto L_0x034a
        L_0x02ba:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x034f }
            r1.setMin = r0     // Catch:{ all -> 0x034f }
            goto L_0x01a7
        L_0x02c0:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x034f }
            r1.length(r15)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            b = r0     // Catch:{ all -> 0x034f }
            goto L_0x012d
        L_0x02cf:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            if (r0 != 0) goto L_0x0349
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x034a
        L_0x02dc:
            r0 = 97
            goto L_0x034a
        L_0x02e0:
            r0 = 162(0xa2, float:2.27E-43)
            goto L_0x034a
        L_0x02e4:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x034f }
            int r0 = r1.setMax     // Catch:{ all -> 0x034f }
            r4 = 24
            if (r0 == r4) goto L_0x02f6
            if (r0 == r14) goto L_0x02f1
            goto L_0x02f6
        L_0x02f1:
            r11 = 171(0xab, float:2.4E-43)
            r0 = 171(0xab, float:2.4E-43)
            goto L_0x034a
        L_0x02f6:
            r0 = 1
            goto L_0x034a
        L_0x02f8:
            r5 = 1
            r1.setMin = r5     // Catch:{ all -> 0x0343 }
            r1.length(r4)     // Catch:{ all -> 0x0343 }
            r1.length(r11)     // Catch:{ all -> 0x0343 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0343 }
            boolean r0 = r0 instanceof id.dana.data.base.NetworkException     // Catch:{ all -> 0x0343 }
            r1.setMin = r0     // Catch:{ all -> 0x0343 }
            r1.length(r7)     // Catch:{ all -> 0x0343 }
            goto L_0x0349
        L_0x030b:
            r5 = 1
            r1.length(r10)     // Catch:{ all -> 0x0343 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0343 }
            if (r0 != 0) goto L_0x0349
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x034a
        L_0x0316:
            r5 = 1
            r0 = 165(0xa5, float:2.31E-43)
            goto L_0x034a
        L_0x031a:
            r5 = 1
            r0 = 157(0x9d, float:2.2E-43)
            goto L_0x034a
        L_0x031e:
            r5 = 1
            r1.length(r10)     // Catch:{ all -> 0x0343 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0343 }
            if (r0 != 0) goto L_0x0349
            r0 = 150(0x96, float:2.1E-43)
            goto L_0x034a
        L_0x0329:
            r0 = 27
            goto L_0x034a
        L_0x032c:
            r0 = 7
            goto L_0x034a
        L_0x032e:
            r5 = 1
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x034a
        L_0x0332:
            r0 = 73
            goto L_0x034a
        L_0x0335:
            r0 = 89
            goto L_0x034a
        L_0x0338:
            r5 = 1
            r1.length(r10)     // Catch:{ all -> 0x0343 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0343 }
            if (r0 != 0) goto L_0x0349
            r0 = 193(0xc1, float:2.7E-43)
            goto L_0x034a
        L_0x0343:
            r0 = move-exception
            goto L_0x0351
        L_0x0345:
            r5 = 1
            r0 = 170(0xaa, float:2.38E-43)
            goto L_0x034a
        L_0x0349:
            r0 = r13
        L_0x034a:
            r7 = 0
            r11 = 74
            goto L_0x0116
        L_0x034f:
            r0 = move-exception
            r5 = 1
        L_0x0351:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2427(0x97b, float:3.401E-42)
            short r7 = (short) r7
            r9 = 14097(0x3711, float:1.9754E-41)
            short r9 = (short) r9
            java.lang.String r4 = length(r4, r7, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r10 = 31
            if (r4 == 0) goto L_0x037c
            if (r13 < r6) goto L_0x037c
            r4 = 27
            if (r13 > r4) goto L_0x037e
        L_0x0372:
            r4 = 74
            r5 = 89
        L_0x0376:
            r6 = 151(0x97, float:2.12E-43)
        L_0x0378:
            r11 = 15
            goto L_0x04ac
        L_0x037c:
            r4 = 27
        L_0x037e:
            byte[] r11 = setMin
            byte r15 = r11[r8]
            byte r15 = (byte) r15
            r4 = 2423(0x977, float:3.395E-42)
            short r4 = (short) r4
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r11 = r11[r16]
            short r11 = (short) r11
            java.lang.String r11 = length(r15, r4, r11)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x03a2
            r11 = 22
            if (r13 < r11) goto L_0x03a2
            r11 = 23
            if (r13 > r11) goto L_0x03a2
            goto L_0x0372
        L_0x03a2:
            byte[] r11 = setMin
            byte r11 = r11[r8]
            byte r11 = (byte) r11
            r15 = 2424(0x978, float:3.397E-42)
            short r15 = (short) r15
            r5 = 14181(0x3765, float:1.9872E-41)
            short r5 = (short) r5
            java.lang.String r11 = length(r11, r15, r5)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x03cc
            r11 = 39
            if (r13 < r11) goto L_0x03cc
            r11 = 66
            if (r13 > r11) goto L_0x03cc
        L_0x03c3:
            r4 = 74
        L_0x03c5:
            r5 = 89
            r6 = 151(0x97, float:2.12E-43)
            r10 = 28
            goto L_0x0378
        L_0x03cc:
            byte[] r11 = setMin
            byte r6 = r11[r8]
            byte r6 = (byte) r6
            byte r11 = r11[r16]
            short r11 = (short) r11
            java.lang.String r6 = length(r6, r4, r11)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x03eb
            r6 = 61
            if (r13 < r6) goto L_0x03eb
            r6 = 62
            if (r13 > r6) goto L_0x03eb
        L_0x03ea:
            goto L_0x03c3
        L_0x03eb:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            java.lang.String r6 = length(r6, r7, r9)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0407
            r6 = 68
            if (r13 < r6) goto L_0x0407
            r6 = 69
            if (r13 > r6) goto L_0x0407
            goto L_0x03ea
        L_0x0407:
            byte[] r6 = setMin
            byte r9 = r6[r8]
            byte r9 = (byte) r9
            byte r6 = r6[r16]
            short r6 = (short) r6
            java.lang.String r4 = length(r9, r4, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0426
            r4 = 74
            if (r13 < r4) goto L_0x0428
            r6 = 89
            if (r13 > r6) goto L_0x0428
            goto L_0x03c5
        L_0x0426:
            r4 = 74
        L_0x0428:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            java.lang.String r5 = length(r6, r15, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0445
            r5 = 83
            if (r13 < r5) goto L_0x0445
            r5 = 89
            if (r13 > r5) goto L_0x0447
        L_0x0443:
            goto L_0x0376
        L_0x0445:
            r5 = 89
        L_0x0447:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            r9 = r6 | 2368(0x940, float:3.318E-42)
            short r9 = (short) r9
            r11 = 11228(0x2bdc, float:1.5734E-41)
            short r11 = (short) r11
            java.lang.String r6 = length(r6, r9, r11)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0469
            r6 = 100
            if (r13 < r6) goto L_0x0469
            r6 = 101(0x65, float:1.42E-43)
            if (r13 > r6) goto L_0x0469
            goto L_0x0443
        L_0x0469:
            byte[] r6 = setMin
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            r9 = 2432(0x980, float:3.408E-42)
            short r9 = (short) r9
            r11 = 14148(0x3744, float:1.9826E-41)
            short r11 = (short) r11
            java.lang.String r6 = length(r6, r9, r11)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x048c
            r6 = 134(0x86, float:1.88E-43)
            if (r13 < r6) goto L_0x048c
            r6 = 151(0x97, float:2.12E-43)
            if (r13 > r6) goto L_0x048c
            goto L_0x0378
        L_0x048c:
            byte[] r6 = setMin
            byte r9 = r6[r8]
            byte r9 = (byte) r9
            r11 = 15
            byte r6 = r6[r11]
            short r6 = (short) r6
            java.lang.String r6 = length(r9, r7, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x04b7
            r6 = 146(0x92, float:2.05E-43)
            if (r13 < r6) goto L_0x04b7
            r6 = 151(0x97, float:2.12E-43)
            if (r13 > r6) goto L_0x04b7
        L_0x04ac:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r0 = r10
            r6 = 7
            goto L_0x034a
        L_0x04b7:
            throw r0
        L_0x04b8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x04c0
            throw r1
        L_0x04c0:
            goto L_0x04c2
        L_0x04c1:
            throw r0
        L_0x04c2:
            goto L_0x04c1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax(java.lang.Throwable):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void setMin(o.sendSensorResult r16, java.lang.Throwable r17) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r2 = r17
            r1.<init>((java.lang.Object) r0, (java.lang.Object) r2)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = 2190(0x88e, float:3.069E-42)
            short r2 = (short) r2
            r3 = 15411(0x3c33, float:2.1595E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r3 = r2 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0278 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x0278 }
            byte[] r2 = setMin     // Catch:{ all -> 0x0278 }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r6]     // Catch:{ all -> 0x0278 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0278 }
            r7 = 2442(0x98a, float:3.422E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0278 }
            int r8 = setMax     // Catch:{ all -> 0x0278 }
            r8 = r8 | 11522(0x2d02, float:1.6146E-41)
            short r8 = (short) r8     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = length(r2, r7, r8)     // Catch:{ all -> 0x0278 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0278 }
            byte[] r8 = setMin     // Catch:{ all -> 0x0278 }
            r9 = 7213(0x1c2d, float:1.0108E-41)
            byte r8 = r8[r9]     // Catch:{ all -> 0x0278 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0278 }
            r9 = 2453(0x995, float:3.437E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0278 }
            r10 = 1053(0x41d, float:1.476E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0278 }
            java.lang.String r8 = length(r8, r9, r10)     // Catch:{ all -> 0x0278 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0278 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0278 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x0278 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0278 }
            int r11 = setMax     // Catch:{ all -> 0x0278 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0278 }
            java.lang.String r10 = length(r10, r7, r11)     // Catch:{ all -> 0x0278 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0278 }
            r9[r5] = r10     // Catch:{ all -> 0x0278 }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r9)     // Catch:{ all -> 0x0278 }
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch:{ all -> 0x0278 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0278 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x007e:
            int r8 = r0.length
            if (r4 >= r8) goto L_0x010f
            r8 = r0[r4]
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0106 }
            r9[r5] = r8     // Catch:{ all -> 0x0106 }
            byte[] r8 = setMin     // Catch:{ all -> 0x0106 }
            byte r8 = r8[r6]     // Catch:{ all -> 0x0106 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0106 }
            r10 = 2441(0x989, float:3.42E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0106 }
            int r11 = setMax     // Catch:{ all -> 0x0106 }
            r11 = r11 & 480(0x1e0, float:6.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = length(r8, r10, r11)     // Catch:{ all -> 0x0106 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0106 }
            r11 = 74
            byte r11 = (byte) r11     // Catch:{ all -> 0x0106 }
            r12 = 2451(0x993, float:3.435E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0106 }
            r13 = 13879(0x3637, float:1.9449E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0106 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0106 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0106 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0106 }
            byte r13 = r13[r6]     // Catch:{ all -> 0x0106 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0106 }
            int r14 = setMax     // Catch:{ all -> 0x0106 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0106 }
            java.lang.String r13 = length(r13, r7, r14)     // Catch:{ all -> 0x0106 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0106 }
            r12[r5] = r13     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x0106 }
            r11 = 0
            java.lang.Object r8 = r8.invoke(r11, r9)     // Catch:{ all -> 0x0106 }
            byte[] r9 = setMin     // Catch:{ all -> 0x00fd }
            byte r9 = r9[r6]     // Catch:{ all -> 0x00fd }
            byte r9 = (byte) r9     // Catch:{ all -> 0x00fd }
            int r12 = setMax     // Catch:{ all -> 0x00fd }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x00fd }
            java.lang.String r9 = length(r9, r10, r12)     // Catch:{ all -> 0x00fd }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x00fd }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fd }
            byte r10 = r10[r6]     // Catch:{ all -> 0x00fd }
            int r10 = r10 - r3
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fd }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x00fd }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x00fd }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x00fd }
            java.lang.Object r8 = r9.invoke(r8, r11)     // Catch:{ all -> 0x00fd }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00fd }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00fd }
            r2[r4] = r8
            int r4 = r4 + 1
            goto L_0x007e
        L_0x00fd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0105
            throw r1
        L_0x0105:
            throw r0
        L_0x0106:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010e
            throw r1
        L_0x010e:
            throw r0
        L_0x010f:
            r4 = 52
            r7 = 30
            r8 = 22
            r9 = 19
        L_0x0117:
            int r10 = r5 + 1
            r11 = 14
            r0 = r2[r5]     // Catch:{ all -> 0x01d7 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01d7 }
            r5 = 21
            r12 = 3
            switch(r0) {
                case -20: goto L_0x01d0;
                case -19: goto L_0x01cc;
                case -18: goto L_0x01bf;
                case -17: goto L_0x01b2;
                case -16: goto L_0x01ac;
                case -15: goto L_0x01ab;
                case -14: goto L_0x01a7;
                case -13: goto L_0x019d;
                case -12: goto L_0x0187;
                case -11: goto L_0x0185;
                case -10: goto L_0x016c;
                case -9: goto L_0x0169;
                case -8: goto L_0x0166;
                case -7: goto L_0x0157;
                case -6: goto L_0x0154;
                case -5: goto L_0x0151;
                case -4: goto L_0x0143;
                case -3: goto L_0x0135;
                case -2: goto L_0x012c;
                case -1: goto L_0x0129;
                default: goto L_0x0127;
            }     // Catch:{ all -> 0x01d7 }
        L_0x0127:
            goto L_0x01d4
        L_0x0129:
            r5 = 22
            goto L_0x0117
        L_0x012c:
            int r0 = b     // Catch:{ all -> 0x01d7 }
            r1.setMin = r0     // Catch:{ all -> 0x01d7 }
        L_0x0130:
            r1.length(r11)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d4
        L_0x0135:
            r1.setMin = r3     // Catch:{ all -> 0x01d7 }
            r1.length(r12)     // Catch:{ all -> 0x01d7 }
            r1.length(r5)     // Catch:{ all -> 0x01d7 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d7 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01d7 }
            goto L_0x01d4
        L_0x0143:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01d7 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x01d4
            r0 = 18
            r5 = 18
            goto L_0x0117
        L_0x0151:
            r5 = 47
            goto L_0x0117
        L_0x0154:
            r5 = 20
            goto L_0x0117
        L_0x0157:
            r1.length(r3)     // Catch:{ all -> 0x01d7 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d7 }
            r5 = 41
            if (r0 == 0) goto L_0x0161
            goto L_0x0117
        L_0x0161:
            r0 = 34
            r5 = 34
            goto L_0x0117
        L_0x0166:
            r5 = 19
            goto L_0x0117
        L_0x0169:
            r5 = 52
            goto L_0x0117
        L_0x016c:
            r0 = 2
            r1.setMin = r0     // Catch:{ all -> 0x01d7 }
            r1.length(r12)     // Catch:{ all -> 0x01d7 }
            r0 = 4
            r1.length(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.Object r5 = r1.equals     // Catch:{ all -> 0x01d7 }
            o.sendSensorResult r5 = (o.sendSensorResult) r5     // Catch:{ all -> 0x01d7 }
            r1.length(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d7 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d7 }
            r5.setMax((java.lang.Throwable) r0)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d4
        L_0x0185:
            r5 = 1
            goto L_0x0117
        L_0x0187:
            r1.length(r3)     // Catch:{ all -> 0x01d7 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d7 }
            r5 = 26
            r10 = 43
            if (r0 == r5) goto L_0x0197
            r5 = 99
            r5 = 43
            goto L_0x0117
        L_0x0197:
            r0 = 25
            r5 = 25
            goto L_0x0117
        L_0x019d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d7 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d7 }
            throw r0     // Catch:{ all -> 0x01d7 }
        L_0x01a7:
            r5 = 30
            goto L_0x0117
        L_0x01ab:
            return
        L_0x01ac:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01d7 }
            r1.setMin = r0     // Catch:{ all -> 0x01d7 }
            goto L_0x0130
        L_0x01b2:
            r1.setMin = r3     // Catch:{ all -> 0x01d7 }
            r1.length(r12)     // Catch:{ all -> 0x01d7 }
            r1.length(r5)     // Catch:{ all -> 0x01d7 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d7 }
            b = r0     // Catch:{ all -> 0x01d7 }
            goto L_0x01d4
        L_0x01bf:
            r1.length(r8)     // Catch:{ all -> 0x01d7 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x01d4
            r0 = 76
            r5 = 76
            goto L_0x0117
        L_0x01cc:
            r5 = 49
            goto L_0x0117
        L_0x01d0:
            r5 = 32
            goto L_0x0117
        L_0x01d4:
            r5 = r10
            goto L_0x0117
        L_0x01d7:
            r0 = move-exception
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r12 = r5 | 2368(0x940, float:3.318E-42)
            short r12 = (short) r12
            r13 = 11228(0x2bdc, float:1.5734E-41)
            short r13 = (short) r13
            java.lang.String r5 = length(r5, r12, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r12 = 51
            r13 = 77
            r14 = 40
            if (r5 == 0) goto L_0x01ff
            if (r10 < r3) goto L_0x01ff
            if (r10 > r9) goto L_0x01ff
        L_0x01fb:
            r5 = 40
            goto L_0x026d
        L_0x01ff:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r15 = 2439(0x987, float:3.418E-42)
            short r15 = (short) r15
            r3 = 7187(0x1c13, float:1.0071E-41)
            short r3 = (short) r3
            java.lang.String r5 = length(r5, r15, r3)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x021d
            if (r10 < r11) goto L_0x021d
            if (r10 > r9) goto L_0x021d
            goto L_0x01fb
        L_0x021d:
            r5 = 28
            if (r10 < r5) goto L_0x0228
            if (r10 > r7) goto L_0x0228
            r3 = 31
            r5 = 31
            goto L_0x026d
        L_0x0228:
            r5 = 35
            if (r10 < r5) goto L_0x0231
            if (r10 > r14) goto L_0x0231
            r5 = 77
            goto L_0x026d
        L_0x0231:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r11 = 2432(0x980, float:3.408E-42)
            short r11 = (short) r11
            r14 = 14148(0x3744, float:1.9826E-41)
            short r14 = (short) r14
            java.lang.String r5 = length(r5, r11, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0253
            if (r10 < r4) goto L_0x0253
            r5 = 53
            if (r10 > r5) goto L_0x0253
        L_0x0250:
            r5 = 51
            goto L_0x026d
        L_0x0253:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            java.lang.String r3 = length(r5, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0277
            r3 = 71
            if (r10 < r3) goto L_0x0277
            if (r10 > r13) goto L_0x0277
            goto L_0x0250
        L_0x026d:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r3 = 1
            goto L_0x0117
        L_0x0277:
            throw r0
        L_0x0278:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0280
            throw r1
        L_0x0280:
            goto L_0x0282
        L_0x0281:
            throw r0
        L_0x0282:
            goto L_0x0281
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMin(o.sendSensorResult, java.lang.Throwable):void");
    }

    /* JADX WARNING: type inference failed for: r15v9, types: [int, boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ boolean setMin(o.sendSensorResult r15) {
        /*
            o.GyroscopeSensorService r0 = new o.GyroscopeSensorService
            r0.<init>(r15)
            byte[] r15 = setMin
            r1 = 33
            byte r15 = r15[r1]
            byte r15 = (byte) r15
            r2 = 2248(0x8c8, float:3.15E-42)
            short r2 = (short) r2
            r3 = 14704(0x3970, float:2.0605E-41)
            short r3 = (short) r3
            java.lang.String r15 = length(r15, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r3 = r2 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x027f }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x027f }
            byte[] r2 = setMin     // Catch:{ all -> 0x027f }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r6]     // Catch:{ all -> 0x027f }
            byte r2 = (byte) r2     // Catch:{ all -> 0x027f }
            r7 = 2442(0x98a, float:3.422E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x027f }
            int r8 = setMax     // Catch:{ all -> 0x027f }
            r8 = r8 | 11522(0x2d02, float:1.6146E-41)
            short r8 = (short) r8     // Catch:{ all -> 0x027f }
            java.lang.String r2 = length(r2, r7, r8)     // Catch:{ all -> 0x027f }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x027f }
            byte[] r8 = setMin     // Catch:{ all -> 0x027f }
            r9 = 7213(0x1c2d, float:1.0108E-41)
            byte r8 = r8[r9]     // Catch:{ all -> 0x027f }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x027f }
            r9 = 2453(0x995, float:3.437E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x027f }
            r10 = 1053(0x41d, float:1.476E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x027f }
            java.lang.String r8 = length(r8, r9, r10)     // Catch:{ all -> 0x027f }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x027f }
            byte[] r10 = setMin     // Catch:{ all -> 0x027f }
            byte r10 = r10[r6]     // Catch:{ all -> 0x027f }
            byte r10 = (byte) r10     // Catch:{ all -> 0x027f }
            int r11 = setMax     // Catch:{ all -> 0x027f }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x027f }
            java.lang.String r10 = length(r10, r7, r11)     // Catch:{ all -> 0x027f }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x027f }
            r9[r5] = r10     // Catch:{ all -> 0x027f }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r9)     // Catch:{ all -> 0x027f }
            java.lang.Object r15 = r2.invoke(r15, r4)     // Catch:{ all -> 0x027f }
            java.lang.Object[] r15 = (java.lang.Object[]) r15     // Catch:{ all -> 0x027f }
            int r2 = r15.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x007a:
            int r8 = r15.length
            if (r4 >= r8) goto L_0x010b
            r8 = r15[r4]
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0102 }
            r9[r5] = r8     // Catch:{ all -> 0x0102 }
            byte[] r8 = setMin     // Catch:{ all -> 0x0102 }
            byte r8 = r8[r6]     // Catch:{ all -> 0x0102 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0102 }
            r10 = 2441(0x989, float:3.42E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0102 }
            int r11 = setMax     // Catch:{ all -> 0x0102 }
            r11 = r11 & 480(0x1e0, float:6.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = length(r8, r10, r11)     // Catch:{ all -> 0x0102 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0102 }
            r11 = 74
            byte r11 = (byte) r11     // Catch:{ all -> 0x0102 }
            r12 = 2451(0x993, float:3.435E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0102 }
            r13 = 13879(0x3637, float:1.9449E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0102 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0102 }
            byte r13 = r13[r6]     // Catch:{ all -> 0x0102 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0102 }
            int r14 = setMax     // Catch:{ all -> 0x0102 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r13 = length(r13, r7, r14)     // Catch:{ all -> 0x0102 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0102 }
            r12[r5] = r13     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x0102 }
            r11 = 0
            java.lang.Object r8 = r8.invoke(r11, r9)     // Catch:{ all -> 0x0102 }
            byte[] r9 = setMin     // Catch:{ all -> 0x00f9 }
            byte r9 = r9[r6]     // Catch:{ all -> 0x00f9 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x00f9 }
            int r12 = setMax     // Catch:{ all -> 0x00f9 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x00f9 }
            java.lang.String r9 = length(r9, r10, r12)     // Catch:{ all -> 0x00f9 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x00f9 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00f9 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x00f9 }
            int r10 = r10 - r3
            byte r10 = (byte) r10     // Catch:{ all -> 0x00f9 }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x00f9 }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x00f9 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x00f9 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x00f9 }
            java.lang.Object r8 = r9.invoke(r8, r11)     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00f9 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00f9 }
            r2[r4] = r8
            int r4 = r4 + 1
            goto L_0x007a
        L_0x00f9:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0101
            throw r0
        L_0x0101:
            throw r15
        L_0x0102:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x010a
            throw r0
        L_0x010a:
            throw r15
        L_0x010b:
            r15 = 24
            r4 = 6
            r7 = 40
        L_0x0110:
            int r8 = r5 + 1
            r9 = 3
            r5 = r2[r5]     // Catch:{ all -> 0x01c3 }
            int r5 = r0.length(r5)     // Catch:{ all -> 0x01c3 }
            r10 = 21
            r11 = 4
            r12 = 14
            switch(r5) {
                case -19: goto L_0x01bc;
                case -18: goto L_0x01af;
                case -17: goto L_0x01a2;
                case -16: goto L_0x019d;
                case -15: goto L_0x018c;
                case -14: goto L_0x0189;
                case -13: goto L_0x0179;
                case -12: goto L_0x0177;
                case -11: goto L_0x0166;
                case -10: goto L_0x0163;
                case -9: goto L_0x0160;
                case -8: goto L_0x015e;
                case -7: goto L_0x0152;
                case -6: goto L_0x0144;
                case -5: goto L_0x013b;
                case -4: goto L_0x0133;
                case -3: goto L_0x0129;
                case -2: goto L_0x0126;
                case -1: goto L_0x0123;
                default: goto L_0x0121;
            }     // Catch:{ all -> 0x01c3 }
        L_0x0121:
            goto L_0x01c0
        L_0x0123:
            r5 = 24
            goto L_0x0110
        L_0x0126:
            r5 = 33
            goto L_0x0110
        L_0x0129:
            r5 = 8
            r0.length(r5)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r0.equals     // Catch:{ all -> 0x01c3 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x01c3 }
            throw r5     // Catch:{ all -> 0x01c3 }
        L_0x0133:
            r5 = 363(0x16b, float:5.09E-43)
            r0.length(r5)     // Catch:{ all -> 0x01c3 }
            int r15 = r0.setMax     // Catch:{ all -> 0x01c3 }
            return r15
        L_0x013b:
            int r5 = ICustomTabsCallback     // Catch:{ all -> 0x01c3 }
            r0.setMin = r5     // Catch:{ all -> 0x01c3 }
        L_0x013f:
            r0.length(r12)     // Catch:{ all -> 0x01c3 }
            goto L_0x01c0
        L_0x0144:
            r0.setMin = r3     // Catch:{ all -> 0x01c3 }
            r0.length(r9)     // Catch:{ all -> 0x01c3 }
            r0.length(r10)     // Catch:{ all -> 0x01c3 }
            int r5 = r0.setMax     // Catch:{ all -> 0x01c3 }
            b = r5     // Catch:{ all -> 0x01c3 }
            goto L_0x01c0
        L_0x0152:
            r5 = 22
            r0.length(r5)     // Catch:{ all -> 0x01c3 }
            int r5 = r0.setMax     // Catch:{ all -> 0x01c3 }
            if (r5 != 0) goto L_0x01c0
            r5 = 23
            goto L_0x0110
        L_0x015e:
            r5 = 1
            goto L_0x0110
        L_0x0160:
            r5 = 63
            goto L_0x0110
        L_0x0163:
            r5 = 40
            goto L_0x0110
        L_0x0166:
            r0.setMin = r3     // Catch:{ all -> 0x01c3 }
            r0.length(r9)     // Catch:{ all -> 0x01c3 }
            r0.length(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r0.equals     // Catch:{ all -> 0x01c3 }
            o.sendSensorResult r5 = (o.sendSensorResult) r5     // Catch:{ all -> 0x01c3 }
            boolean r5 = r5.invoke     // Catch:{ all -> 0x01c3 }
            r0.setMin = r5     // Catch:{ all -> 0x01c3 }
            goto L_0x013f
        L_0x0177:
            r5 = 6
            goto L_0x0110
        L_0x0179:
            r0.length(r3)     // Catch:{ all -> 0x01c3 }
            int r5 = r0.setMax     // Catch:{ all -> 0x01c3 }
            r8 = 69
            if (r5 == r8) goto L_0x0186
            r8 = 81
            r5 = 4
            goto L_0x0110
        L_0x0186:
            r5 = 35
            goto L_0x0110
        L_0x0189:
            r5 = 30
            goto L_0x0110
        L_0x018c:
            r0.setMin = r3     // Catch:{ all -> 0x01c3 }
            r0.length(r9)     // Catch:{ all -> 0x01c3 }
            r0.length(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r0.equals     // Catch:{ all -> 0x01c3 }
            int r5 = super.hashCode()     // Catch:{ all -> 0x01c3 }
            r0.setMin = r5     // Catch:{ all -> 0x01c3 }
            goto L_0x013f
        L_0x019d:
            int r5 = b     // Catch:{ all -> 0x01c3 }
            r0.setMin = r5     // Catch:{ all -> 0x01c3 }
            goto L_0x013f
        L_0x01a2:
            r0.setMin = r3     // Catch:{ all -> 0x01c3 }
            r0.length(r9)     // Catch:{ all -> 0x01c3 }
            r0.length(r10)     // Catch:{ all -> 0x01c3 }
            int r5 = r0.setMax     // Catch:{ all -> 0x01c3 }
            ICustomTabsCallback = r5     // Catch:{ all -> 0x01c3 }
            goto L_0x01c0
        L_0x01af:
            r5 = 48
            r0.length(r5)     // Catch:{ all -> 0x01c3 }
            int r5 = r0.setMax     // Catch:{ all -> 0x01c3 }
            if (r5 != 0) goto L_0x01c0
            r5 = 61
            goto L_0x0110
        L_0x01bc:
            r5 = 34
            goto L_0x0110
        L_0x01c0:
            r5 = r8
            goto L_0x0110
        L_0x01c3:
            r5 = move-exception
            byte[] r10 = setMin
            byte r10 = r10[r6]
            byte r10 = (byte) r10
            r11 = 2428(0x97c, float:3.402E-42)
            short r11 = (short) r11
            r12 = r11 & 208(0xd0, float:2.91E-43)
            short r12 = (short) r12
            java.lang.String r10 = length(r10, r11, r12)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r5)
            r11 = 62
            if (r10 == 0) goto L_0x01e6
            if (r8 < r4) goto L_0x01e6
            r10 = 7
            if (r8 > r10) goto L_0x01e6
            goto L_0x0276
        L_0x01e6:
            byte[] r10 = setMin
            byte r10 = r10[r6]
            byte r10 = (byte) r10
            r12 = 2439(0x987, float:3.418E-42)
            short r12 = (short) r12
            r13 = 7187(0x1c13, float:1.0071E-41)
            short r13 = (short) r13
            java.lang.String r10 = length(r10, r12, r13)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r5)
            if (r10 == 0) goto L_0x0209
            r10 = 19
            if (r8 < r10) goto L_0x0209
            r10 = 20
            if (r8 > r10) goto L_0x0209
            goto L_0x0276
        L_0x0209:
            byte[] r10 = setMin
            byte r10 = r10[r6]
            byte r10 = (byte) r10
            r12 = 2432(0x980, float:3.408E-42)
            short r12 = (short) r12
            r13 = 14148(0x3744, float:1.9826E-41)
            short r13 = (short) r13
            java.lang.String r10 = length(r10, r12, r13)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r5)
            if (r10 == 0) goto L_0x0229
            r10 = 31
            if (r8 < r10) goto L_0x0229
            if (r8 > r1) goto L_0x0229
            goto L_0x0276
        L_0x0229:
            r10 = 36
            if (r8 < r10) goto L_0x0234
            if (r8 > r7) goto L_0x0234
            r8 = 29
            r11 = 29
            goto L_0x0276
        L_0x0234:
            byte[] r10 = setMin
            byte r10 = r10[r6]
            byte r10 = (byte) r10
            int r12 = setMax
            r12 = r12 | 2336(0x920, float:3.273E-42)
            short r12 = (short) r12
            r13 = 8656(0x21d0, float:1.213E-41)
            short r13 = (short) r13
            java.lang.String r10 = length(r10, r12, r13)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r5)
            if (r10 == 0) goto L_0x0254
            if (r8 < r7) goto L_0x0254
            if (r8 > r11) goto L_0x0254
            goto L_0x0276
        L_0x0254:
            byte[] r10 = setMin
            byte r10 = r10[r6]
            byte r10 = (byte) r10
            r11 = r10 | 2368(0x940, float:3.318E-42)
            short r11 = (short) r11
            r12 = 11228(0x2bdc, float:1.5734E-41)
            short r12 = (short) r12
            java.lang.String r10 = length(r10, r11, r12)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r5)
            if (r10 == 0) goto L_0x027e
            r10 = 56
            if (r8 < r10) goto L_0x027e
            r10 = 57
            if (r8 > r10) goto L_0x027e
            r11 = 3
        L_0x0276:
            r0.toIntRange = r5
            r0.length(r15)
            r5 = r11
            goto L_0x0110
        L_0x027e:
            throw r5
        L_0x027f:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0287
            throw r0
        L_0x0287:
            goto L_0x0289
        L_0x0288:
            throw r15
        L_0x0289:
            goto L_0x0288
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMin(o.sendSensorResult):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void toFloatRange() {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = 2314(0x90a, float:3.243E-42)
            short r4 = (short) r4
            r5 = 11085(0x2b4d, float:1.5533E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r5 = r4 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r4 = length(r4, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0289 }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x0289 }
            byte[] r4 = setMin     // Catch:{ all -> 0x0289 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r8]     // Catch:{ all -> 0x0289 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0289 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0289 }
            int r10 = setMax     // Catch:{ all -> 0x0289 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x0289 }
            java.lang.String r4 = length(r4, r9, r10)     // Catch:{ all -> 0x0289 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0289 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0289 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0289 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0289 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0289 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0289 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x0289 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0289 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0289 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0289 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0289 }
            int r13 = setMax     // Catch:{ all -> 0x0289 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0289 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x0289 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0289 }
            r11[r7] = r12     // Catch:{ all -> 0x0289 }
            java.lang.reflect.Method r4 = r4.getMethod(r10, r11)     // Catch:{ all -> 0x0289 }
            java.lang.Object r0 = r4.invoke(r0, r6)     // Catch:{ all -> 0x0289 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0289 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0110
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r11[r7] = r10     // Catch:{ all -> 0x0107 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0107 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0107 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0107 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0107 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0107 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0107 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0107 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0107 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0107 }
            int r3 = setMax     // Catch:{ all -> 0x0107 }
            r3 = r3 | 11522(0x2d02, float:1.6146E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = length(r15, r9, r3)     // Catch:{ all -> 0x0107 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0107 }
            r14[r7] = r3     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r3 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0107 }
            r10 = 0
            java.lang.Object r3 = r3.invoke(r10, r11)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fe }
            byte r11 = r11[r8]     // Catch:{ all -> 0x00fe }
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fe }
            int r13 = setMax     // Catch:{ all -> 0x00fe }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x00fe }
            byte[] r12 = setMin     // Catch:{ all -> 0x00fe }
            byte r12 = r12[r8]     // Catch:{ all -> 0x00fe }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x00fe }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x00fe }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r11.invoke(r3, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00fe }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00fe }
            r4[r6] = r3
            int r6 = r6 + 1
            r3 = 33
            goto L_0x007c
        L_0x00fe:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0106
            throw r1
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r3 = 27
            r6 = 8
            r9 = 3
        L_0x0115:
            int r10 = r7 + 1
            r11 = 41
            r12 = 5
            r0 = r4[r7]     // Catch:{ all -> 0x01ae }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01ae }
            r7 = 14
            r13 = 4
            switch(r0) {
                case -15: goto L_0x01a8;
                case -14: goto L_0x0197;
                case -13: goto L_0x0187;
                case -12: goto L_0x0173;
                case -11: goto L_0x0170;
                case -10: goto L_0x0161;
                case -9: goto L_0x015f;
                case -8: goto L_0x015d;
                case -7: goto L_0x014f;
                case -6: goto L_0x0140;
                case -5: goto L_0x0137;
                case -4: goto L_0x012f;
                case -3: goto L_0x012c;
                case -2: goto L_0x012b;
                case -1: goto L_0x0128;
                default: goto L_0x0126;
            }     // Catch:{ all -> 0x01ae }
        L_0x0126:
            goto L_0x01ab
        L_0x0128:
            r7 = 29
            goto L_0x0115
        L_0x012b:
            return
        L_0x012c:
            r7 = 27
            goto L_0x0115
        L_0x012f:
            r1.length(r6)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x0137:
            int r0 = b     // Catch:{ all -> 0x01ae }
            r1.setMin = r0     // Catch:{ all -> 0x01ae }
        L_0x013b:
            r1.length(r7)     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x0140:
            r1.setMin = r5     // Catch:{ all -> 0x01ae }
            r1.length(r9)     // Catch:{ all -> 0x01ae }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x014f:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x01ab
            r0 = 26
            r7 = 26
            goto L_0x0115
        L_0x015d:
            r7 = 3
            goto L_0x0115
        L_0x015f:
            r7 = 6
            goto L_0x0115
        L_0x0161:
            r1.length(r5)     // Catch:{ all -> 0x01ae }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ae }
            r7 = 34
            if (r0 == 0) goto L_0x0115
            if (r0 == r5) goto L_0x016d
            goto L_0x0115
        L_0x016d:
            r7 = 41
            goto L_0x0115
        L_0x0170:
            r7 = 8
            goto L_0x0115
        L_0x0173:
            r1.setMin = r5     // Catch:{ all -> 0x01ae }
            r1.length(r9)     // Catch:{ all -> 0x01ae }
            r1.length(r13)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01ae }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x01ae }
            r1.toIntRange = r0     // Catch:{ all -> 0x01ae }
            r1.length(r12)     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x0187:
            r1.setMin = r5     // Catch:{ all -> 0x01ae }
            r1.length(r9)     // Catch:{ all -> 0x01ae }
            r1.length(r13)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x01ae }
            r0.length()     // Catch:{ all -> 0x01ae }
            goto L_0x01ab
        L_0x0197:
            r1.setMin = r5     // Catch:{ all -> 0x01ae }
            r1.length(r9)     // Catch:{ all -> 0x01ae }
            r1.length(r13)     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ae }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01ae }
            r1.setMin = r0     // Catch:{ all -> 0x01ae }
            goto L_0x013b
        L_0x01a8:
            r7 = 1
            goto L_0x0115
        L_0x01ab:
            r7 = r10
            goto L_0x0115
        L_0x01ae:
            r0 = move-exception
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r13 = 2424(0x978, float:3.397E-42)
            short r13 = (short) r13
            r14 = 14181(0x3765, float:1.9872E-41)
            short r14 = (short) r14
            java.lang.String r7 = length(r7, r13, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x01cf
            if (r10 < r6) goto L_0x01cf
            if (r10 > r3) goto L_0x01cf
        L_0x01cc:
            r7 = 5
            goto L_0x027d
        L_0x01cf:
            byte[] r7 = setMin
            byte r15 = r7[r8]
            byte r15 = (byte) r15
            r3 = 2423(0x977, float:3.395E-42)
            short r3 = (short) r3
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r7 = r7[r16]
            short r7 = (short) r7
            java.lang.String r3 = length(r15, r3, r7)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x01f3
            r3 = 22
            if (r10 < r3) goto L_0x01f3
            r3 = 23
            if (r10 > r3) goto L_0x01f3
            goto L_0x01cc
        L_0x01f3:
            r3 = 37
            if (r10 < r3) goto L_0x01ff
            if (r10 > r11) goto L_0x01ff
            r3 = 28
            r7 = 28
            goto L_0x027d
        L_0x01ff:
            byte[] r3 = setMin
            byte r3 = r3[r8]
            byte r3 = (byte) r3
            java.lang.String r3 = length(r3, r13, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            r7 = 36
            if (r3 == 0) goto L_0x021b
            r3 = 35
            if (r10 < r3) goto L_0x021b
            if (r10 > r7) goto L_0x021b
            goto L_0x01cc
        L_0x021b:
            byte[] r3 = setMin
            byte r3 = r3[r8]
            byte r3 = (byte) r3
            r12 = 2439(0x987, float:3.418E-42)
            short r12 = (short) r12
            r13 = 7187(0x1c13, float:1.0071E-41)
            short r13 = (short) r13
            java.lang.String r3 = length(r3, r12, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x023b
            if (r10 < r7) goto L_0x023b
            if (r10 > r11) goto L_0x023b
        L_0x0238:
            r7 = 33
            goto L_0x027d
        L_0x023b:
            byte[] r3 = setMin
            byte r3 = r3[r8]
            byte r3 = (byte) r3
            r7 = 2427(0x97b, float:3.401E-42)
            short r7 = (short) r7
            r11 = 14097(0x3711, float:1.9754E-41)
            short r11 = (short) r11
            java.lang.String r3 = length(r3, r7, r11)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            r7 = 43
            if (r3 == 0) goto L_0x025d
            r3 = 42
            if (r10 < r3) goto L_0x025d
            if (r10 > r7) goto L_0x025d
            goto L_0x0238
        L_0x025d:
            byte[] r3 = setMin
            byte r3 = r3[r8]
            byte r3 = (byte) r3
            r11 = 2428(0x97c, float:3.402E-42)
            short r11 = (short) r11
            r12 = r11 & 208(0xd0, float:2.91E-43)
            short r12 = (short) r12
            java.lang.String r3 = length(r3, r11, r12)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0288
            if (r10 < r7) goto L_0x0288
            r3 = 45
            if (r10 > r3) goto L_0x0288
            goto L_0x0238
        L_0x027d:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r3 = 27
            goto L_0x0115
        L_0x0288:
            throw r0
        L_0x0289:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0291
            throw r1
        L_0x0291:
            goto L_0x0293
        L_0x0292:
            throw r0
        L_0x0293:
            goto L_0x0292
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.toFloatRange():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void toFloatRange(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r2 = r0 | 2250(0x8ca, float:3.153E-42)
            short r2 = (short) r2
            r3 = 11630(0x2d6e, float:1.6297E-41)
            short r3 = (short) r3
            java.lang.String r0 = length(r0, r2, r3)
            byte[] r2 = setMin
            r3 = 15
            byte r2 = r2[r3]
            byte r2 = (byte) r2
            r4 = r2 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x025f }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x025f }
            byte[] r2 = setMin     // Catch:{ all -> 0x025f }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r2 = r2[r7]     // Catch:{ all -> 0x025f }
            byte r2 = (byte) r2     // Catch:{ all -> 0x025f }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x025f }
            int r9 = setMax     // Catch:{ all -> 0x025f }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x025f }
            java.lang.String r2 = length(r2, r8, r9)     // Catch:{ all -> 0x025f }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x025f }
            byte[] r9 = setMin     // Catch:{ all -> 0x025f }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x025f }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x025f }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x025f }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x025f }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x025f }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x025f }
            byte[] r11 = setMin     // Catch:{ all -> 0x025f }
            byte r11 = r11[r7]     // Catch:{ all -> 0x025f }
            byte r11 = (byte) r11     // Catch:{ all -> 0x025f }
            int r12 = setMax     // Catch:{ all -> 0x025f }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x025f }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x025f }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x025f }
            r10[r6] = r11     // Catch:{ all -> 0x025f }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r10)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x025f }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x025f }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = 0
        L_0x007c:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010d
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0104 }
            r10[r6] = r9     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0104 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0104 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0104 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0104 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0104 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0104 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0104 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0104 }
            int r15 = setMax     // Catch:{ all -> 0x0104 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0104 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0104 }
            r13[r6] = r14     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0104 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0104 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            int r13 = setMax     // Catch:{ all -> 0x00fb }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fb }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fb }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fb }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fb }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fb }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fb }
            r2[r5] = r9
            int r5 = r5 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r5 = 26
            r8 = 39
            r9 = 36
            r10 = 9
            r11 = 3
        L_0x0116:
            int r12 = r6 + 1
            r13 = 40
            r14 = 21
            r0 = r2[r6]     // Catch:{ all -> 0x01c8 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01c8 }
            r6 = 4
            r15 = 14
            switch(r0) {
                case -19: goto L_0x01c1;
                case -18: goto L_0x01bd;
                case -17: goto L_0x01ae;
                case -16: goto L_0x01a1;
                case -15: goto L_0x019c;
                case -14: goto L_0x0199;
                case -13: goto L_0x0188;
                case -12: goto L_0x0185;
                case -11: goto L_0x0183;
                case -10: goto L_0x0180;
                case -9: goto L_0x0172;
                case -8: goto L_0x0165;
                case -7: goto L_0x015d;
                case -6: goto L_0x015c;
                case -5: goto L_0x0159;
                case -4: goto L_0x0148;
                case -3: goto L_0x0137;
                case -2: goto L_0x012d;
                case -1: goto L_0x012a;
                default: goto L_0x0128;
            }     // Catch:{ all -> 0x01c8 }
        L_0x0128:
            goto L_0x01c5
        L_0x012a:
            r6 = 26
            goto L_0x0116
        L_0x012d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01c8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01c8 }
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x0137:
            r1.length(r4)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c8 }
            r6 = 31
            if (r0 == r13) goto L_0x0116
            r12 = 65
            if (r0 == r12) goto L_0x0145
            goto L_0x0116
        L_0x0145:
            r0 = 7
            r6 = 7
            goto L_0x0116
        L_0x0148:
            r1.setMin = r4     // Catch:{ all -> 0x01c8 }
            r1.length(r11)     // Catch:{ all -> 0x01c8 }
            r1.length(r6)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01c8 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01c8 }
            r0.IsOverlapping()     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x0159:
            r6 = 39
            goto L_0x0116
        L_0x015c:
            return
        L_0x015d:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01c8 }
            r1.setMin = r0     // Catch:{ all -> 0x01c8 }
        L_0x0161:
            r1.length(r15)     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x0165:
            r1.setMin = r4     // Catch:{ all -> 0x01c8 }
            r1.length(r11)     // Catch:{ all -> 0x01c8 }
            r1.length(r14)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c8 }
            b = r0     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x0172:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x01c5
            r0 = 25
            r6 = 25
            goto L_0x0116
        L_0x0180:
            r6 = 38
            goto L_0x0116
        L_0x0183:
            r6 = 3
            goto L_0x0116
        L_0x0185:
            r6 = 9
            goto L_0x0116
        L_0x0188:
            r1.setMin = r4     // Catch:{ all -> 0x01c8 }
            r1.length(r11)     // Catch:{ all -> 0x01c8 }
            r1.length(r6)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01c8 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01c8 }
            r1.setMin = r0     // Catch:{ all -> 0x01c8 }
            goto L_0x0161
        L_0x0199:
            r6 = 2
            goto L_0x0116
        L_0x019c:
            int r0 = b     // Catch:{ all -> 0x01c8 }
            r1.setMin = r0     // Catch:{ all -> 0x01c8 }
            goto L_0x0161
        L_0x01a1:
            r1.setMin = r4     // Catch:{ all -> 0x01c8 }
            r1.length(r11)     // Catch:{ all -> 0x01c8 }
            r1.length(r14)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c8 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x01ae:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x01c5
            r0 = 59
            r6 = 59
            goto L_0x0116
        L_0x01bd:
            r6 = 61
            goto L_0x0116
        L_0x01c1:
            r6 = 36
            goto L_0x0116
        L_0x01c5:
            r6 = r12
            goto L_0x0116
        L_0x01c8:
            r0 = move-exception
            byte[] r6 = setMin
            byte r15 = r6[r7]
            byte r15 = (byte) r15
            r4 = 2427(0x97b, float:3.401E-42)
            short r4 = (short) r4
            byte r6 = r6[r3]
            short r6 = (short) r6
            java.lang.String r6 = length(r15, r4, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r15 = 6
            if (r6 == 0) goto L_0x01e9
            if (r12 < r10) goto L_0x01e9
            if (r12 > r5) goto L_0x01e9
        L_0x01e7:
            r6 = 6
            goto L_0x0252
        L_0x01e9:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r3 = 14097(0x3711, float:1.9754E-41)
            short r3 = (short) r3
            java.lang.String r3 = length(r6, r4, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0206
            r3 = 20
            if (r12 < r3) goto L_0x0206
            if (r12 > r14) goto L_0x0206
            goto L_0x01e7
        L_0x0206:
            r3 = 32
            if (r12 < r3) goto L_0x0211
            if (r12 > r9) goto L_0x0211
            r3 = 60
            r6 = 60
            goto L_0x0252
        L_0x0211:
            byte[] r3 = setMin
            byte r3 = r3[r7]
            byte r3 = (byte) r3
            r4 = 2424(0x978, float:3.397E-42)
            short r4 = (short) r4
            r6 = 14181(0x3765, float:1.9872E-41)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r4, r6)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0230
            if (r12 < r8) goto L_0x0230
            if (r12 > r13) goto L_0x0230
            r6 = 1
            goto L_0x0252
        L_0x0230:
            byte[] r3 = setMin
            byte r3 = r3[r7]
            byte r3 = (byte) r3
            r4 = 2428(0x97c, float:3.402E-42)
            short r4 = (short) r4
            r6 = r4 & 208(0xd0, float:2.91E-43)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r4, r6)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x025e
            r3 = 55
            if (r12 < r3) goto L_0x025e
            r3 = 56
            if (r12 > r3) goto L_0x025e
            goto L_0x01e7
        L_0x0252:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r3 = 15
            r4 = 1
            goto L_0x0116
        L_0x025e:
            throw r0
        L_0x025f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0267
            throw r1
        L_0x0267:
            goto L_0x0269
        L_0x0268:
            throw r0
        L_0x0269:
            goto L_0x0268
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.toFloatRange(o.sendSensorResult):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0216, code lost:
        if (r10 <= 33) goto L_0x027d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ int toIntRange(o.sendSensorResult r16) {
        /*
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r0 = r16
            r1.<init>(r0)
            byte[] r0 = setMin
            r2 = 33
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r3 = 2230(0x8b6, float:3.125E-42)
            short r3 = (short) r3
            r4 = 8429(0x20ed, float:1.1812E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x028a }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x028a }
            byte[] r3 = setMin     // Catch:{ all -> 0x028a }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x028a }
            byte r3 = (byte) r3     // Catch:{ all -> 0x028a }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x028a }
            int r10 = setMax     // Catch:{ all -> 0x028a }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x028a }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x028a }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x028a }
            byte[] r10 = setMin     // Catch:{ all -> 0x028a }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x028a }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x028a }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x028a }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x028a }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x028a }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x028a }
            byte[] r12 = setMin     // Catch:{ all -> 0x028a }
            byte r12 = r12[r8]     // Catch:{ all -> 0x028a }
            byte r12 = (byte) r12     // Catch:{ all -> 0x028a }
            int r13 = setMax     // Catch:{ all -> 0x028a }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x028a }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x028a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x028a }
            r11[r7] = r12     // Catch:{ all -> 0x028a }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x028a }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x028a }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x028a }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0110
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r11[r7] = r10     // Catch:{ all -> 0x0107 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0107 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0107 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0107 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0107 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0107 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0107 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0107 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0107 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0107 }
            int r2 = setMax     // Catch:{ all -> 0x0107 }
            r2 = r2 | 11522(0x2d02, float:1.6146E-41)
            short r2 = (short) r2     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = length(r15, r9, r2)     // Catch:{ all -> 0x0107 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0107 }
            r14[r7] = r2     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r2 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0107 }
            r10 = 0
            java.lang.Object r2 = r2.invoke(r10, r11)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fe }
            byte r11 = r11[r8]     // Catch:{ all -> 0x00fe }
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fe }
            int r13 = setMax     // Catch:{ all -> 0x00fe }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x00fe }
            byte[] r12 = setMin     // Catch:{ all -> 0x00fe }
            byte r12 = r12[r8]     // Catch:{ all -> 0x00fe }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x00fe }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x00fe }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r2 = r11.invoke(r2, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00fe }
            int r2 = r2.intValue()     // Catch:{ all -> 0x00fe }
            r3[r6] = r2
            int r6 = r6 + 1
            r2 = 33
            goto L_0x007c
        L_0x00fe:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0106
            throw r1
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r2 = 49
            r6 = 62
            r9 = 3
        L_0x0115:
            int r10 = r7 + 1
            r11 = 48
            r12 = 37
            r0 = r3[r7]     // Catch:{ all -> 0x01d1 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01d1 }
            r7 = 21
            r13 = 4
            r14 = 14
            switch(r0) {
                case -19: goto L_0x01bd;
                case -18: goto L_0x01b9;
                case -17: goto L_0x01b5;
                case -16: goto L_0x01a6;
                case -15: goto L_0x0199;
                case -14: goto L_0x0194;
                case -13: goto L_0x0192;
                case -12: goto L_0x0181;
                case -11: goto L_0x017e;
                case -10: goto L_0x0176;
                case -9: goto L_0x0174;
                case -8: goto L_0x0171;
                case -7: goto L_0x016e;
                case -6: goto L_0x0162;
                case -5: goto L_0x0154;
                case -4: goto L_0x014b;
                case -3: goto L_0x0141;
                case -2: goto L_0x012e;
                case -1: goto L_0x012b;
                default: goto L_0x0129;
            }     // Catch:{ all -> 0x01d1 }
        L_0x0129:
            goto L_0x01ce
        L_0x012b:
            r7 = 62
            goto L_0x0115
        L_0x012e:
            r1.length(r5)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d1 }
            r7 = 42
            if (r0 == r12) goto L_0x0115
            r10 = 90
            if (r0 == r10) goto L_0x013c
            goto L_0x0115
        L_0x013c:
            r0 = 66
            r7 = 66
            goto L_0x0115
        L_0x0141:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d1 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d1 }
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x014b:
            int r0 = b     // Catch:{ all -> 0x01d1 }
            r1.setMin = r0     // Catch:{ all -> 0x01d1 }
        L_0x014f:
            r1.length(r14)     // Catch:{ all -> 0x01d1 }
            goto L_0x01ce
        L_0x0154:
            r1.setMin = r5     // Catch:{ all -> 0x01d1 }
            r1.length(r9)     // Catch:{ all -> 0x01d1 }
            r1.length(r7)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d1 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01d1 }
            goto L_0x01ce
        L_0x0162:
            r1.length(r11)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x01ce
            r0 = 36
            r7 = 36
            goto L_0x0115
        L_0x016e:
            r7 = 38
            goto L_0x0115
        L_0x0171:
            r7 = 40
            goto L_0x0115
        L_0x0174:
            r7 = 1
            goto L_0x0115
        L_0x0176:
            r0 = 363(0x16b, float:5.09E-43)
            r1.length(r0)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d1 }
            return r0
        L_0x017e:
            r7 = 46
            goto L_0x0115
        L_0x0181:
            r1.setMin = r5     // Catch:{ all -> 0x01d1 }
            r1.length(r9)     // Catch:{ all -> 0x01d1 }
            r1.length(r13)     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d1 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01d1 }
            int r0 = r0.IsOverlapping     // Catch:{ all -> 0x01d1 }
            r1.setMin = r0     // Catch:{ all -> 0x01d1 }
            goto L_0x014f
        L_0x0192:
            r7 = 3
            goto L_0x0115
        L_0x0194:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01d1 }
            r1.setMin = r0     // Catch:{ all -> 0x01d1 }
            goto L_0x014f
        L_0x0199:
            r1.setMin = r5     // Catch:{ all -> 0x01d1 }
            r1.length(r9)     // Catch:{ all -> 0x01d1 }
            r1.length(r7)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d1 }
            b = r0     // Catch:{ all -> 0x01d1 }
            goto L_0x01ce
        L_0x01a6:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x01ce
            r0 = 61
            r7 = 61
            goto L_0x0115
        L_0x01b5:
            r7 = 44
            goto L_0x0115
        L_0x01b9:
            r7 = 49
            goto L_0x0115
        L_0x01bd:
            r1.setMin = r5     // Catch:{ all -> 0x01d1 }
            r1.length(r9)     // Catch:{ all -> 0x01d1 }
            r1.length(r13)     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01d1 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01d1 }
            r1.setMin = r0     // Catch:{ all -> 0x01d1 }
            goto L_0x014f
        L_0x01ce:
            r7 = r10
            goto L_0x0115
        L_0x01d1:
            r0 = move-exception
            byte[] r7 = setMin
            byte r13 = r7[r8]
            byte r13 = (byte) r13
            r14 = 2427(0x97b, float:3.401E-42)
            short r14 = (short) r14
            byte r7 = r7[r4]
            short r7 = (short) r7
            java.lang.String r7 = length(r13, r14, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            r13 = 45
            if (r7 == 0) goto L_0x01f7
            if (r10 < r9) goto L_0x01f7
            if (r10 > r12) goto L_0x01f7
            r7 = 33
        L_0x01f3:
            r12 = 45
            goto L_0x027d
        L_0x01f7:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r14 = 2428(0x97c, float:3.402E-42)
            short r14 = (short) r14
            r15 = r14 & 208(0xd0, float:2.91E-43)
            short r15 = (short) r15
            java.lang.String r7 = length(r7, r14, r15)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0219
            r7 = 32
            if (r10 < r7) goto L_0x0219
            r7 = 33
            if (r10 > r7) goto L_0x021b
            goto L_0x027d
        L_0x0219:
            r7 = 33
        L_0x021b:
            byte[] r14 = setMin
            byte r14 = r14[r8]
            byte r14 = (byte) r14
            r15 = r14 | 2368(0x940, float:3.318E-42)
            short r15 = (short) r15
            r4 = 11228(0x2bdc, float:1.5734E-41)
            short r4 = (short) r4
            java.lang.String r4 = length(r14, r15, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x023b
            r4 = 47
            if (r10 < r4) goto L_0x023b
            if (r10 > r11) goto L_0x023b
            goto L_0x027d
        L_0x023b:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r11 = 2424(0x978, float:3.397E-42)
            short r11 = (short) r11
            r14 = 14181(0x3765, float:1.9872E-41)
            short r14 = (short) r14
            java.lang.String r4 = length(r4, r11, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0259
            if (r10 < r2) goto L_0x0259
            if (r10 > r6) goto L_0x0259
            goto L_0x027d
        L_0x0259:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r11, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0273
            r4 = 56
            if (r10 < r4) goto L_0x0273
            if (r10 > r6) goto L_0x0273
            goto L_0x01f3
        L_0x0273:
            r4 = 67
            if (r10 < r4) goto L_0x0289
            r4 = 71
            if (r10 > r4) goto L_0x0289
            r4 = 2
            r12 = 2
        L_0x027d:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r7 = r12
            r4 = 15
            goto L_0x0115
        L_0x0289:
            throw r0
        L_0x028a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0292
            throw r1
        L_0x0292:
            goto L_0x0294
        L_0x0293:
            throw r0
        L_0x0294:
            goto L_0x0293
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.toIntRange(o.sendSensorResult):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0135, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016c, code lost:
        r1.length(5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void toIntRange() {
        /*
            r16 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r16
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = r0 | 2226(0x8b2, float:3.119E-42)
            short r4 = (short) r4
            r5 = 1063(0x427, float:1.49E-42)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x02e7 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x02e7 }
            byte[] r4 = setMin     // Catch:{ all -> 0x02e7 }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x02e7 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x02e7 }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x02e7 }
            int r11 = setMax     // Catch:{ all -> 0x02e7 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x02e7 }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x02e7 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x02e7 }
            byte[] r11 = setMin     // Catch:{ all -> 0x02e7 }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x02e7 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x02e7 }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02e7 }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x02e7 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x02e7 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x02e7 }
            byte[] r13 = setMin     // Catch:{ all -> 0x02e7 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x02e7 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x02e7 }
            int r14 = setMax     // Catch:{ all -> 0x02e7 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x02e7 }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x02e7 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x02e7 }
            r12[r8] = r13     // Catch:{ all -> 0x02e7 }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x02e7 }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x02e7 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02e7 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x007c:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0112
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0109 }
            r12[r8] = r11     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0109 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0109 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0109 }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0109 }
            int r14 = setMax     // Catch:{ all -> 0x0109 }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0109 }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x0109 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0109 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0109 }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0109 }
            r3 = 13879(0x3637, float:1.9449E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = length(r14, r15, r3)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x0109 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0109 }
            byte r15 = r15[r9]     // Catch:{ all -> 0x0109 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0109 }
            int r5 = setMax     // Catch:{ all -> 0x0109 }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = length(r15, r10, r5)     // Catch:{ all -> 0x0109 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0109 }
            r14[r8] = r5     // Catch:{ all -> 0x0109 }
            java.lang.reflect.Method r3 = r11.getMethod(r3, r14)     // Catch:{ all -> 0x0109 }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0100 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0100 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0100 }
            int r12 = setMax     // Catch:{ all -> 0x0100 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0100 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0100 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0100 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0100 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0100 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0100 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0100 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0100 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0100 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x007c
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0108
            throw r1
        L_0x0108:
            throw r0
        L_0x0109:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0111
            throw r1
        L_0x0111:
            throw r0
        L_0x0112:
            r3 = 66
            r5 = 40
            r7 = 32
            r10 = 5
        L_0x0119:
            int r11 = r8 + 1
            r0 = r4[r8]     // Catch:{ all -> 0x01e8 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01e8 }
            r8 = 14
            r12 = 21
            r13 = 4
            r14 = 3
            switch(r0) {
                case -20: goto L_0x01e1;
                case -19: goto L_0x01ca;
                case -18: goto L_0x01c9;
                case -17: goto L_0x01c5;
                case -16: goto L_0x01c1;
                case -15: goto L_0x01b2;
                case -14: goto L_0x01a5;
                case -13: goto L_0x01a0;
                case -12: goto L_0x0196;
                case -11: goto L_0x0194;
                case -10: goto L_0x0185;
                case -9: goto L_0x0171;
                case -8: goto L_0x015c;
                case -7: goto L_0x0159;
                case -6: goto L_0x0156;
                case -5: goto L_0x0148;
                case -4: goto L_0x013a;
                case -3: goto L_0x0131;
                case -2: goto L_0x012e;
                case -1: goto L_0x012c;
                default: goto L_0x012a;
            }     // Catch:{ all -> 0x01e8 }
        L_0x012a:
            goto L_0x01e5
        L_0x012c:
            r8 = 1
            goto L_0x0119
        L_0x012e:
            r8 = 33
            goto L_0x0119
        L_0x0131:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x01e8 }
            r1.setMin = r0     // Catch:{ all -> 0x01e8 }
        L_0x0135:
            r1.length(r8)     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x013a:
            r1.setMin = r6     // Catch:{ all -> 0x01e8 }
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            r1.length(r12)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            b = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x0148:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e5
            r0 = 31
            r8 = 31
            goto L_0x0119
        L_0x0156:
            r8 = 32
            goto L_0x0119
        L_0x0159:
            r8 = 66
            goto L_0x0119
        L_0x015c:
            r1.setMin = r6     // Catch:{ all -> 0x01e8 }
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01e8 }
            o.AccelerometerForH5SensorService r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x01e8 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01e8 }
        L_0x016c:
            r1.length(r10)     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x0171:
            o.sendSensorResult$IsOverlapping r0 = new o.sendSensorResult$IsOverlapping     // Catch:{ all -> 0x01e8 }
            r1.setMin = r6     // Catch:{ all -> 0x01e8 }
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x01e8 }
            o.sendSensorResult r8 = (o.sendSensorResult) r8     // Catch:{ all -> 0x01e8 }
            r0.<init>(r8)     // Catch:{ all -> 0x01e8 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x016c
        L_0x0185:
            r1.setMin = r6     // Catch:{ all -> 0x01e8 }
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            o.AccelerometerForH5SensorService$1 r0 = (o.AccelerometerForH5SensorService.AnonymousClass1) r0     // Catch:{ all -> 0x01e8 }
            r1.toIntRange = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x016c
        L_0x0194:
            r8 = 5
            goto L_0x0119
        L_0x0196:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e8 }
            throw r0     // Catch:{ all -> 0x01e8 }
        L_0x01a0:
            int r0 = b     // Catch:{ all -> 0x01e8 }
            r1.setMin = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x0135
        L_0x01a5:
            r1.setMin = r6     // Catch:{ all -> 0x01e8 }
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            r1.length(r12)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x01b2:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x01e8 }
            int r0 = r1.setMax     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e5
            r0 = 62
            r8 = 62
            goto L_0x0119
        L_0x01c1:
            r8 = 63
            goto L_0x0119
        L_0x01c5:
            r8 = 64
            goto L_0x0119
        L_0x01c9:
            return
        L_0x01ca:
            r0 = 2
            r1.setMin = r0     // Catch:{ all -> 0x01e8 }
            r1.length(r14)     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01e8 }
            o.AccelerometerForH5SensorService r0 = (o.AccelerometerForH5SensorService) r0     // Catch:{ all -> 0x01e8 }
            r1.length(r13)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x01e8 }
            o.AccelerometerForH5SensorService$1 r8 = (o.AccelerometerForH5SensorService.AnonymousClass1) r8     // Catch:{ all -> 0x01e8 }
            r0.setMax = r8     // Catch:{ all -> 0x01e8 }
            goto L_0x01e5
        L_0x01e1:
            r8 = 40
            goto L_0x0119
        L_0x01e5:
            r8 = r11
            goto L_0x0119
        L_0x01e8:
            r0 = move-exception
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r12 = 2427(0x97b, float:3.401E-42)
            short r12 = (short) r12
            r13 = 14097(0x3711, float:1.9754E-41)
            short r13 = (short) r13
            java.lang.String r8 = length(r8, r12, r13)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            r13 = 68
            r14 = 39
            if (r8 == 0) goto L_0x0210
            if (r11 < r10) goto L_0x0210
            if (r11 > r7) goto L_0x0210
        L_0x020a:
            r8 = 39
        L_0x020c:
            r15 = 15
            goto L_0x02dc
        L_0x0210:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r15 = 2439(0x987, float:3.418E-42)
            short r15 = (short) r15
            r6 = 7187(0x1c13, float:1.0071E-41)
            short r6 = (short) r6
            java.lang.String r6 = length(r8, r15, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0232
            r6 = 26
            if (r11 < r6) goto L_0x0232
            if (r11 > r7) goto L_0x0232
        L_0x022f:
            r8 = 68
            goto L_0x020c
        L_0x0232:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            r8 = 2419(0x973, float:3.39E-42)
            short r8 = (short) r8
            r15 = 13371(0x343b, float:1.8737E-41)
            short r15 = (short) r15
            java.lang.String r6 = length(r6, r8, r15)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0254
            r6 = 34
            if (r11 < r6) goto L_0x0254
            r6 = 35
            if (r11 > r6) goto L_0x0254
            goto L_0x020a
        L_0x0254:
            byte[] r6 = setMin
            byte r8 = r6[r9]
            byte r8 = (byte) r8
            r15 = 15
            byte r6 = r6[r15]
            short r6 = (short) r6
            java.lang.String r6 = length(r8, r12, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0275
            r6 = 37
            if (r11 < r6) goto L_0x0275
            r6 = 38
            if (r11 > r6) goto L_0x0275
            goto L_0x022f
        L_0x0275:
            byte[] r6 = setMin
            byte r8 = r6[r9]
            byte r8 = (byte) r8
            r15 = 15
            byte r6 = r6[r15]
            short r6 = (short) r6
            java.lang.String r6 = length(r8, r12, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0296
            if (r11 < r5) goto L_0x0296
            r6 = 41
            if (r11 > r6) goto L_0x0296
            r8 = 68
            goto L_0x02dc
        L_0x0296:
            byte[] r6 = setMin
            byte r8 = r6[r9]
            byte r8 = (byte) r8
            r12 = 2423(0x977, float:3.395E-42)
            short r12 = (short) r12
            r13 = 13891(0x3643, float:1.9465E-41)
            byte r6 = r6[r13]
            short r6 = (short) r6
            java.lang.String r6 = length(r8, r12, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02bc
            r6 = 58
            if (r11 < r6) goto L_0x02bc
            r6 = 59
            if (r11 > r6) goto L_0x02bc
        L_0x02b9:
            r8 = 39
            goto L_0x02dc
        L_0x02bc:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            r8 = 2424(0x978, float:3.397E-42)
            short r8 = (short) r8
            r12 = 14181(0x3765, float:1.9872E-41)
            short r12 = (short) r12
            java.lang.String r6 = length(r6, r8, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02e6
            if (r11 < r3) goto L_0x02e6
            r6 = 67
            if (r11 > r6) goto L_0x02e6
            goto L_0x02b9
        L_0x02dc:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r6 = 1
            goto L_0x0119
        L_0x02e6:
            throw r0
        L_0x02e7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02ef
            throw r1
        L_0x02ef:
            goto L_0x02f1
        L_0x02f0:
            throw r0
        L_0x02f1:
            goto L_0x02f0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.toIntRange():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x039e, code lost:
        if (r9 <= 2) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x057b, code lost:
        if (r9 <= 209) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0134, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0169, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d2, code lost:
        if (r1.setMax != 0) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d4, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d7, code lost:
        r7 = 90;
     */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x055d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax() {
        /*
            r18 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r18
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = r0 | 1696(0x6a0, float:2.377E-42)
            short r3 = (short) r3
            r4 = 9108(0x2394, float:1.2763E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x05eb }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x05eb }
            byte[] r3 = setMin     // Catch:{ all -> 0x05eb }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x05eb }
            byte r3 = (byte) r3     // Catch:{ all -> 0x05eb }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x05eb }
            int r10 = setMax     // Catch:{ all -> 0x05eb }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x05eb }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x05eb }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x05eb }
            byte[] r10 = setMin     // Catch:{ all -> 0x05eb }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x05eb }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x05eb }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x05eb }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x05eb }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x05eb }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x05eb }
            byte[] r12 = setMin     // Catch:{ all -> 0x05eb }
            byte r12 = r12[r8]     // Catch:{ all -> 0x05eb }
            byte r12 = (byte) r12     // Catch:{ all -> 0x05eb }
            int r13 = setMax     // Catch:{ all -> 0x05eb }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x05eb }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x05eb }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x05eb }
            r11[r7] = r12     // Catch:{ all -> 0x05eb }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x05eb }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x05eb }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05eb }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            r11 = 0
            if (r6 >= r10) goto L_0x0112
            r10 = r0[r6]
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0109 }
            r12[r7] = r10     // Catch:{ all -> 0x0109 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0109 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0109 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0109 }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0109 }
            int r14 = setMax     // Catch:{ all -> 0x0109 }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0109 }
            java.lang.String r10 = length(r10, r13, r14)     // Catch:{ all -> 0x0109 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0109 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0109 }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0109 }
            r4 = 13879(0x3637, float:1.9449E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = length(r14, r15, r4)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0109 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0109 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0109 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0109 }
            int r5 = setMax     // Catch:{ all -> 0x0109 }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = length(r15, r9, r5)     // Catch:{ all -> 0x0109 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0109 }
            r14[r7] = r5     // Catch:{ all -> 0x0109 }
            java.lang.reflect.Method r4 = r10.getMethod(r4, r14)     // Catch:{ all -> 0x0109 }
            java.lang.Object r4 = r4.invoke(r11, r12)     // Catch:{ all -> 0x0109 }
            byte[] r5 = setMin     // Catch:{ all -> 0x0100 }
            byte r5 = r5[r8]     // Catch:{ all -> 0x0100 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0100 }
            int r10 = setMax     // Catch:{ all -> 0x0100 }
            r10 = r10 & 480(0x1e0, float:6.73E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = length(r5, r13, r10)     // Catch:{ all -> 0x0100 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0100 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0100 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0100 }
            r12 = 1
            int r10 = r10 - r12
            byte r10 = (byte) r10     // Catch:{ all -> 0x0100 }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0100 }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r5 = r5.getMethod(r10, r11)     // Catch:{ all -> 0x0100 }
            java.lang.Object r4 = r5.invoke(r4, r11)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0100 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0100 }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 15
            r5 = 1
            goto L_0x007c
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0108
            throw r1
        L_0x0108:
            throw r0
        L_0x0109:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0111
            throw r1
        L_0x0111:
            throw r0
        L_0x0112:
            r5 = 37
            r6 = 52
        L_0x0116:
            int r9 = r7 + 1
            r12 = 29
            r13 = 2
            r0 = r3[r7]     // Catch:{ all -> 0x037b }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x037b }
            r7 = 14
            r15 = 5
            r10 = 48
            r4 = 3
            r14 = 4
            switch(r0) {
                case -57: goto L_0x0374;
                case -56: goto L_0x0370;
                case -55: goto L_0x0363;
                case -54: goto L_0x035f;
                case -53: goto L_0x0359;
                case -52: goto L_0x0355;
                case -51: goto L_0x0351;
                case -50: goto L_0x0344;
                case -49: goto L_0x0340;
                case -48: goto L_0x0333;
                case -47: goto L_0x031a;
                case -46: goto L_0x030a;
                case -45: goto L_0x0306;
                case -44: goto L_0x02ed;
                case -43: goto L_0x02e9;
                case -42: goto L_0x02e5;
                case -41: goto L_0x02d8;
                case -40: goto L_0x02d4;
                case -39: goto L_0x02d0;
                case -38: goto L_0x02c3;
                case -37: goto L_0x02bf;
                case -36: goto L_0x02bb;
                case -35: goto L_0x02b7;
                case -34: goto L_0x02b3;
                case -33: goto L_0x029b;
                case -32: goto L_0x0297;
                case -31: goto L_0x0296;
                case -30: goto L_0x0277;
                case -29: goto L_0x0268;
                case -28: goto L_0x0262;
                case -27: goto L_0x025e;
                case -26: goto L_0x025a;
                case -25: goto L_0x024d;
                case -24: goto L_0x0249;
                case -23: goto L_0x0245;
                case -22: goto L_0x0241;
                case -21: goto L_0x023d;
                case -20: goto L_0x0239;
                case -19: goto L_0x0224;
                case -18: goto L_0x0211;
                case -17: goto L_0x01e0;
                case -16: goto L_0x01db;
                case -15: goto L_0x01cc;
                case -14: goto L_0x01b5;
                case -13: goto L_0x01ab;
                case -12: goto L_0x01a7;
                case -11: goto L_0x01a3;
                case -10: goto L_0x0196;
                case -9: goto L_0x0184;
                case -8: goto L_0x016e;
                case -7: goto L_0x015c;
                case -6: goto L_0x0159;
                case -5: goto L_0x0156;
                case -4: goto L_0x014a;
                case -3: goto L_0x0139;
                case -2: goto L_0x0130;
                case -1: goto L_0x012d;
                default: goto L_0x012b;
            }     // Catch:{ all -> 0x037b }
        L_0x012b:
            goto L_0x0378
        L_0x012d:
            r7 = 40
            goto L_0x0116
        L_0x0130:
            int r0 = b     // Catch:{ all -> 0x037b }
            r1.setMin = r0     // Catch:{ all -> 0x037b }
        L_0x0134:
            r1.length(r7)     // Catch:{ all -> 0x037b }
            goto L_0x0378
        L_0x0139:
            r7 = 1
            r1.setMin = r7     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x037b }
            goto L_0x0378
        L_0x014a:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 16
            r7 = 16
            goto L_0x0116
        L_0x0156:
            r7 = 27
            goto L_0x0116
        L_0x0159:
            r7 = 210(0xd2, float:2.94E-43)
            goto L_0x0116
        L_0x015c:
            r7 = 1
            r1.setMin = r7     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
        L_0x0169:
            r1.length(r15)     // Catch:{ all -> 0x037b }
            goto L_0x0378
        L_0x016e:
            r1.setMin = r13     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x037b }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x037b }
            r1.setMin = r0     // Catch:{ all -> 0x037b }
            goto L_0x0134
        L_0x0184:
            r10 = 1
            r1.setMin = r10     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            int r0 = super.hashCode()     // Catch:{ all -> 0x037b }
            r1.setMin = r0     // Catch:{ all -> 0x037b }
            goto L_0x0134
        L_0x0196:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 24
            r7 = 24
            goto L_0x0116
        L_0x01a3:
            r7 = 212(0xd4, float:2.97E-43)
            goto L_0x0116
        L_0x01a7:
            r7 = 86
            goto L_0x0116
        L_0x01ab:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x037b }
            throw r0     // Catch:{ all -> 0x037b }
        L_0x01b5:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 == 0) goto L_0x01c6
            if (r0 == r4) goto L_0x01c0
            goto L_0x01c6
        L_0x01c0:
            r0 = 153(0x99, float:2.14E-43)
            r7 = 153(0x99, float:2.14E-43)
            goto L_0x0116
        L_0x01c6:
            r0 = 188(0xbc, float:2.63E-43)
            r7 = 188(0xbc, float:2.63E-43)
            goto L_0x0116
        L_0x01cc:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 == 0) goto L_0x01d7
        L_0x01d4:
            r7 = 1
            goto L_0x0116
        L_0x01d7:
            r7 = 90
            goto L_0x0116
        L_0x01db:
            java.lang.String r0 = onNavigationEvent     // Catch:{ all -> 0x037b }
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x01e0:
            byte[] r0 = setMin     // Catch:{ all -> 0x037b }
            byte r0 = r0[r8]     // Catch:{ all -> 0x037b }
            byte r0 = (byte) r0     // Catch:{ all -> 0x037b }
            r4 = 2441(0x989, float:3.42E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x037b }
            r7 = 11599(0x2d4f, float:1.6254E-41)
            short r7 = (short) r7     // Catch:{ all -> 0x037b }
            java.lang.String r0 = length(r0, r4, r7)     // Catch:{ all -> 0x037b }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x037b }
            byte[] r4 = setMin     // Catch:{ all -> 0x037b }
            r7 = 14088(0x3708, float:1.9741E-41)
            byte r4 = r4[r7]     // Catch:{ all -> 0x037b }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x037b }
            r7 = 2454(0x996, float:3.439E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x037b }
            r10 = 5587(0x15d3, float:7.829E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x037b }
            java.lang.String r4 = length(r4, r7, r10)     // Catch:{ all -> 0x037b }
            java.lang.reflect.Field r0 = r0.getField(r4)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x037b }
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x0211:
            r7 = 1
            r1.setMin = r7     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x037b }
            o.setWebMessageCallback r0 = r0.hashCode     // Catch:{ all -> 0x037b }
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x0224:
            r7 = 1
            r1.setMin = r7     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            o.GriverAppxLoadFailedPoint r0 = (o.GriverAppxLoadFailedPoint) r0     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r0.execute()     // Catch:{ all -> 0x037b }
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x0239:
            r7 = 193(0xc1, float:2.7E-43)
            goto L_0x0116
        L_0x023d:
            r7 = 26
            goto L_0x0116
        L_0x0241:
            r7 = 158(0x9e, float:2.21E-43)
            goto L_0x0116
        L_0x0245:
            r7 = 125(0x7d, float:1.75E-43)
            goto L_0x0116
        L_0x0249:
            r7 = 96
            goto L_0x0116
        L_0x024d:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 78
            r7 = 78
            goto L_0x0116
        L_0x025a:
            r7 = 37
            goto L_0x0116
        L_0x025e:
            r7 = 94
            goto L_0x0116
        L_0x0262:
            java.lang.String r0 = "Deeplink Payload already removed"
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x0268:
            r7 = 1
            r1.setMin = r7     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x0277:
            r1.setMin = r4     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x037b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x037b }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x037b }
            o.updateActionSheetContent.e(r0, r4, r7)     // Catch:{ all -> 0x037b }
            goto L_0x0378
        L_0x0296:
            return
        L_0x0297:
            r7 = 28
            goto L_0x0116
        L_0x029b:
            r1.setMin = r13     // Catch:{ all -> 0x037b }
            r1.length(r4)     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x037b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x037b }
            r1.length(r14)     // Catch:{ all -> 0x037b }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x037b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x037b }
            o.updateActionSheetContent.i(r0, r4)     // Catch:{ all -> 0x037b }
            goto L_0x0378
        L_0x02b3:
            r7 = 52
            goto L_0x0116
        L_0x02b7:
            r7 = 100
            goto L_0x0116
        L_0x02bb:
            r7 = 157(0x9d, float:2.2E-43)
            goto L_0x0116
        L_0x02bf:
            r7 = 88
            goto L_0x0116
        L_0x02c3:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 121(0x79, float:1.7E-43)
            r7 = 121(0x79, float:1.7E-43)
            goto L_0x0116
        L_0x02d0:
            r7 = 45
            goto L_0x0116
        L_0x02d4:
            r7 = 150(0x96, float:2.1E-43)
            goto L_0x0116
        L_0x02d8:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 144(0x90, float:2.02E-43)
            r7 = 144(0x90, float:2.02E-43)
            goto L_0x0116
        L_0x02e5:
            r7 = 155(0x9b, float:2.17E-43)
            goto L_0x0116
        L_0x02e9:
            r7 = 92
            goto L_0x0116
        L_0x02ed:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            r4 = 49
            if (r0 == r4) goto L_0x0302
            r4 = 93
            if (r0 == r4) goto L_0x02fc
            goto L_0x0302
        L_0x02fc:
            r0 = 17
            r7 = 17
            goto L_0x0116
        L_0x0302:
            r7 = 214(0xd6, float:3.0E-43)
            goto L_0x0116
        L_0x0306:
            r7 = 145(0x91, float:2.03E-43)
            goto L_0x0116
        L_0x030a:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            r4 = 9
            if (r0 == r4) goto L_0x01d4
            r4 = 27
            if (r0 == r4) goto L_0x01d7
            goto L_0x01d4
        L_0x031a:
            r4 = 1
            r1.length(r4)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            r4 = 13
            if (r0 == r4) goto L_0x032f
            r4 = 75
            if (r0 == r4) goto L_0x0329
            goto L_0x032f
        L_0x0329:
            r0 = 46
            r7 = 46
            goto L_0x0116
        L_0x032f:
            r7 = 29
            goto L_0x0116
        L_0x0333:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 187(0xbb, float:2.62E-43)
            r7 = 187(0xbb, float:2.62E-43)
            goto L_0x0116
        L_0x0340:
            r7 = 39
            goto L_0x0116
        L_0x0344:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 208(0xd0, float:2.91E-43)
            r7 = 208(0xd0, float:2.91E-43)
            goto L_0x0116
        L_0x0351:
            r7 = 148(0x94, float:2.07E-43)
            goto L_0x0116
        L_0x0355:
            r7 = 151(0x97, float:2.12E-43)
            goto L_0x0116
        L_0x0359:
            java.lang.String r0 = "Deeplink Payload removed"
            r1.toIntRange = r0     // Catch:{ all -> 0x037b }
            goto L_0x0169
        L_0x035f:
            r7 = 162(0xa2, float:2.27E-43)
            goto L_0x0116
        L_0x0363:
            r1.length(r10)     // Catch:{ all -> 0x037b }
            int r0 = r1.setMax     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0378
            r0 = 218(0xda, float:3.05E-43)
            r7 = 218(0xda, float:3.05E-43)
            goto L_0x0116
        L_0x0370:
            r7 = 123(0x7b, float:1.72E-43)
            goto L_0x0116
        L_0x0374:
            r7 = 146(0x92, float:2.05E-43)
            goto L_0x0116
        L_0x0378:
            r7 = r9
            goto L_0x0116
        L_0x037b:
            r0 = move-exception
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2432(0x980, float:3.408E-42)
            short r7 = (short) r7
            r10 = 14148(0x3744, float:1.9826E-41)
            short r10 = (short) r10
            java.lang.String r4 = length(r4, r7, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r7 = 25
            r14 = 99
            r15 = 79
            if (r4 == 0) goto L_0x03a8
            r4 = 1
            if (r9 < r4) goto L_0x03a9
            if (r9 > r13) goto L_0x03a9
        L_0x03a0:
            r4 = 193(0xc1, float:2.7E-43)
            r7 = 15
        L_0x03a4:
            r15 = 99
            goto L_0x05dd
        L_0x03a8:
            r4 = 1
        L_0x03a9:
            byte[] r13 = setMin
            byte r4 = r13[r8]
            byte r4 = (byte) r4
            r10 = 2427(0x97b, float:3.401E-42)
            short r10 = (short) r10
            r16 = 15
            byte r13 = r13[r16]
            short r13 = (short) r13
            java.lang.String r4 = length(r4, r10, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x03cd
            r4 = 12
            if (r9 < r4) goto L_0x03cd
            r4 = 13
            if (r9 > r4) goto L_0x03cd
            goto L_0x03a0
        L_0x03cd:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r13 = 2439(0x987, float:3.418E-42)
            short r13 = (short) r13
            r11 = 7187(0x1c13, float:1.0071E-41)
            short r11 = (short) r11
            java.lang.String r4 = length(r4, r13, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x03f2
            r4 = 17
            if (r9 < r4) goto L_0x03f2
            if (r9 > r7) goto L_0x03f2
        L_0x03ec:
            r4 = 193(0xc1, float:2.7E-43)
            r7 = 15
            goto L_0x05dd
        L_0x03f2:
            r4 = 19
            if (r9 < r4) goto L_0x0400
            if (r9 > r7) goto L_0x0400
            r4 = 193(0xc1, float:2.7E-43)
            r7 = 15
            r15 = 25
            goto L_0x05dd
        L_0x0400:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r13, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0418
            if (r9 < r12) goto L_0x0418
            if (r9 > r5) goto L_0x0418
            goto L_0x03ec
        L_0x0418:
            r4 = 34
            if (r9 < r4) goto L_0x0428
            if (r9 > r5) goto L_0x0428
            r4 = 209(0xd1, float:2.93E-43)
            r4 = 193(0xc1, float:2.7E-43)
            r7 = 15
            r15 = 209(0xd1, float:2.93E-43)
            goto L_0x05dd
        L_0x0428:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r13, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0442
            r4 = 46
            if (r9 < r4) goto L_0x0442
            if (r9 > r6) goto L_0x0442
            goto L_0x03ec
        L_0x0442:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2424(0x978, float:3.397E-42)
            short r7 = (short) r7
            r12 = 14181(0x3765, float:1.9872E-41)
            short r12 = (short) r12
            java.lang.String r4 = length(r4, r7, r12)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0461
            if (r9 < r6) goto L_0x0461
            if (r9 > r15) goto L_0x0461
            goto L_0x03a0
        L_0x0461:
            byte[] r4 = setMin
            byte r7 = r4[r8]
            byte r7 = (byte) r7
            r12 = 2423(0x977, float:3.395E-42)
            short r12 = (short) r12
            r17 = 13891(0x3643, float:1.9465E-41)
            byte r4 = r4[r17]
            short r4 = (short) r4
            java.lang.String r4 = length(r7, r12, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0484
            r4 = 74
            if (r9 < r4) goto L_0x0484
            if (r9 > r15) goto L_0x0484
            goto L_0x03a0
        L_0x0484:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r13, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x04a1
            r4 = 88
            if (r9 < r4) goto L_0x04a1
            r4 = 90
            if (r9 > r4) goto L_0x04a1
            goto L_0x03ec
        L_0x04a1:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r13, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x04be
            r4 = 90
            if (r9 < r4) goto L_0x04be
            r4 = 92
            if (r9 > r4) goto L_0x04be
            goto L_0x03ec
        L_0x04be:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2428(0x97c, float:3.402E-42)
            short r7 = (short) r7
            r5 = r7 & 208(0xd0, float:2.91E-43)
            short r5 = (short) r5
            java.lang.String r4 = length(r4, r7, r5)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x04e7
            r4 = 100
            if (r9 < r4) goto L_0x04e7
            r4 = 122(0x7a, float:1.71E-43)
            if (r9 > r4) goto L_0x04e7
        L_0x04df:
            r4 = 193(0xc1, float:2.7E-43)
            r7 = 15
        L_0x04e3:
            r15 = 161(0xa1, float:2.26E-43)
            goto L_0x05dd
        L_0x04e7:
            byte[] r4 = setMin
            byte r5 = r4[r8]
            byte r5 = (byte) r5
            r7 = 13891(0x3643, float:1.9465E-41)
            byte r4 = r4[r7]
            short r4 = (short) r4
            java.lang.String r4 = length(r5, r12, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0508
            r4 = 117(0x75, float:1.64E-43)
            if (r9 < r4) goto L_0x0508
            r4 = 122(0x7a, float:1.71E-43)
            if (r9 > r4) goto L_0x0508
            goto L_0x04df
        L_0x0508:
            byte[] r4 = setMin
            byte r5 = r4[r8]
            byte r5 = (byte) r5
            r7 = 15
            byte r4 = r4[r7]
            short r4 = (short) r4
            java.lang.String r4 = length(r5, r10, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x052a
            r4 = 162(0xa2, float:2.27E-43)
            if (r9 < r4) goto L_0x052a
            r4 = 163(0xa3, float:2.28E-43)
            if (r9 > r4) goto L_0x052a
            goto L_0x03a0
        L_0x052a:
            byte[] r4 = setMin
            byte r5 = r4[r8]
            byte r5 = (byte) r5
            r7 = 15
            byte r4 = r4[r7]
            short r4 = (short) r4
            java.lang.String r4 = length(r5, r10, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x054b
            r4 = 183(0xb7, float:2.56E-43)
            if (r9 < r4) goto L_0x054b
            r4 = 188(0xbc, float:2.63E-43)
            if (r9 > r4) goto L_0x054b
            goto L_0x04df
        L_0x054b:
            r4 = 189(0xbd, float:2.65E-43)
            if (r9 < r4) goto L_0x055d
            r4 = 193(0xc1, float:2.7E-43)
            if (r9 > r4) goto L_0x055d
            r4 = 122(0x7a, float:1.71E-43)
            r4 = 193(0xc1, float:2.7E-43)
            r7 = 15
            r15 = 122(0x7a, float:1.71E-43)
            goto L_0x05dd
        L_0x055d:
            byte[] r4 = setMin
            byte r5 = r4[r8]
            byte r5 = (byte) r5
            r7 = 15
            byte r4 = r4[r7]
            short r4 = (short) r4
            java.lang.String r4 = length(r5, r10, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x057f
            r4 = 193(0xc1, float:2.7E-43)
            if (r9 < r4) goto L_0x0581
            r5 = 209(0xd1, float:2.93E-43)
            if (r9 > r5) goto L_0x0581
            goto L_0x03a4
        L_0x057f:
            r4 = 193(0xc1, float:2.7E-43)
        L_0x0581:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            int r10 = setMax
            r10 = r10 | 2336(0x920, float:3.273E-42)
            short r10 = (short) r10
            r12 = 8656(0x21d0, float:1.213E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r10, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x05a6
            r5 = 204(0xcc, float:2.86E-43)
            if (r9 < r5) goto L_0x05a6
            r5 = 209(0xd1, float:2.93E-43)
            if (r9 > r5) goto L_0x05a6
            goto L_0x04e3
        L_0x05a6:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r13, r11)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x05c2
            r5 = 210(0xd2, float:2.94E-43)
            if (r9 < r5) goto L_0x05c2
            r5 = 212(0xd4, float:2.97E-43)
            if (r9 > r5) goto L_0x05c2
            goto L_0x05dd
        L_0x05c2:
            byte[] r5 = setMin
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r13, r11)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x05ea
            r5 = 214(0xd6, float:3.0E-43)
            if (r9 < r5) goto L_0x05ea
            r5 = 219(0xdb, float:3.07E-43)
            if (r9 > r5) goto L_0x05ea
        L_0x05dd:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r7 = r15
            r5 = 37
            r11 = 0
            goto L_0x0116
        L_0x05ea:
            throw r0
        L_0x05eb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x05f3
            throw r1
        L_0x05f3:
            goto L_0x05f5
        L_0x05f4:
            throw r0
        L_0x05f5:
            goto L_0x05f4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMax():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x031b, code lost:
        if (r12 <= 59) goto L_0x021d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin() {
        /*
            r18 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r18
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = r0 | 2256(0x8d0, float:3.161E-42)
            short r3 = (short) r3
            r4 = 10885(0x2a85, float:1.5253E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x034a }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x034a }
            byte[] r3 = setMin     // Catch:{ all -> 0x034a }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x034a }
            byte r3 = (byte) r3     // Catch:{ all -> 0x034a }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x034a }
            int r10 = setMax     // Catch:{ all -> 0x034a }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x034a }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x034a }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x034a }
            byte[] r10 = setMin     // Catch:{ all -> 0x034a }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x034a }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x034a }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x034a }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x034a }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x034a }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x034a }
            byte[] r12 = setMin     // Catch:{ all -> 0x034a }
            byte r12 = r12[r8]     // Catch:{ all -> 0x034a }
            byte r12 = (byte) r12     // Catch:{ all -> 0x034a }
            int r13 = setMax     // Catch:{ all -> 0x034a }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x034a }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x034a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x034a }
            r11[r7] = r12     // Catch:{ all -> 0x034a }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x034a }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x034a }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x034a }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x007c:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0110
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r11[r7] = r10     // Catch:{ all -> 0x0107 }
            byte[] r10 = setMin     // Catch:{ all -> 0x0107 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0107 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0107 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0107 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0107 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0107 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0107 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0107 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0107 }
            int r4 = setMax     // Catch:{ all -> 0x0107 }
            r4 = r4 | 11522(0x2d02, float:1.6146E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = length(r15, r9, r4)     // Catch:{ all -> 0x0107 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0107 }
            r14[r7] = r4     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r4 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0107 }
            r10 = 0
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fe }
            byte r11 = r11[r8]     // Catch:{ all -> 0x00fe }
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fe }
            int r13 = setMax     // Catch:{ all -> 0x00fe }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x00fe }
            byte[] r12 = setMin     // Catch:{ all -> 0x00fe }
            byte r12 = r12[r8]     // Catch:{ all -> 0x00fe }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x00fe }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fe }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x00fe }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r4 = r11.invoke(r4, r10)     // Catch:{ all -> 0x00fe }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00fe }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00fe }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 15
            goto L_0x007c
        L_0x00fe:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0106
            throw r1
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r4 = 21
            r6 = 14
            r11 = 24
        L_0x0116:
            int r12 = r7 + 1
            r13 = 8
            r14 = 5
            r15 = 3
            r10 = 4
            r0 = r3[r7]     // Catch:{ all -> 0x01ef }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x01ef }
            r7 = 48
            switch(r0) {
                case -21: goto L_0x01eb;
                case -20: goto L_0x01e7;
                case -19: goto L_0x01da;
                case -18: goto L_0x01d6;
                case -17: goto L_0x01cd;
                case -16: goto L_0x01bb;
                case -15: goto L_0x01b7;
                case -14: goto L_0x01b3;
                case -13: goto L_0x01a6;
                case -12: goto L_0x0199;
                case -11: goto L_0x0191;
                case -10: goto L_0x0182;
                case -9: goto L_0x017f;
                case -8: goto L_0x017c;
                case -7: goto L_0x0179;
                case -6: goto L_0x0171;
                case -5: goto L_0x016e;
                case -4: goto L_0x0151;
                case -3: goto L_0x0140;
                case -2: goto L_0x012d;
                case -1: goto L_0x012a;
                default: goto L_0x0128;
            }     // Catch:{ all -> 0x01ef }
        L_0x0128:
            goto L_0x01ec
        L_0x012a:
            r7 = 15
            goto L_0x0116
        L_0x012d:
            r1.setMin = r5     // Catch:{ all -> 0x01ef }
            r1.length(r15)     // Catch:{ all -> 0x01ef }
            r1.length(r10)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ef }
            o.setGlobalUserData r0 = (o.setGlobalUserData) r0     // Catch:{ all -> 0x01ef }
            r1.toIntRange = r0     // Catch:{ all -> 0x01ef }
        L_0x013b:
            r1.length(r14)     // Catch:{ all -> 0x01ef }
            goto L_0x01ec
        L_0x0140:
            r1.setMin = r5     // Catch:{ all -> 0x01ef }
            r1.length(r15)     // Catch:{ all -> 0x01ef }
            r1.length(r10)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ef }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = r0.getMin     // Catch:{ all -> 0x01ef }
            r1.toIntRange = r0     // Catch:{ all -> 0x01ef }
            goto L_0x013b
        L_0x0151:
            r1.setMin = r15     // Catch:{ all -> 0x01ef }
            r1.length(r15)     // Catch:{ all -> 0x01ef }
            r1.length(r10)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ef }
            o.parseFailed r0 = (o.parseFailed) r0     // Catch:{ all -> 0x01ef }
            r1.length(r10)     // Catch:{ all -> 0x01ef }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x01ef }
            o.setGlobalUserData r7 = (o.setGlobalUserData) r7     // Catch:{ all -> 0x01ef }
            r1.length(r10)     // Catch:{ all -> 0x01ef }
            java.lang.Object r9 = r1.equals     // Catch:{ all -> 0x01ef }
            r0.execute(r7, r9)     // Catch:{ all -> 0x01ef }
            goto L_0x01ec
        L_0x016e:
            r7 = 44
            goto L_0x0116
        L_0x0171:
            r1.length(r13)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ef }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ef }
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x0179:
            r7 = 59
            goto L_0x0116
        L_0x017c:
            r7 = 40
            goto L_0x0116
        L_0x017f:
            r7 = 23
            goto L_0x0116
        L_0x0182:
            r1.length(r5)     // Catch:{ all -> 0x01ef }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ef }
            r7 = 7
            if (r0 == r7) goto L_0x018f
            r7 = 42
            r7 = 8
            goto L_0x0116
        L_0x018f:
            r7 = 1
            goto L_0x0116
        L_0x0191:
            int r0 = b     // Catch:{ all -> 0x01ef }
            r1.setMin = r0     // Catch:{ all -> 0x01ef }
            r1.length(r6)     // Catch:{ all -> 0x01ef }
            goto L_0x01ec
        L_0x0199:
            r1.setMin = r5     // Catch:{ all -> 0x01ef }
            r1.length(r15)     // Catch:{ all -> 0x01ef }
            r1.length(r4)     // Catch:{ all -> 0x01ef }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ef }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x01ef }
            goto L_0x01ec
        L_0x01a6:
            r1.length(r7)     // Catch:{ all -> 0x01ef }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ef }
            if (r0 != 0) goto L_0x01ec
            r0 = 37
            r7 = 37
            goto L_0x0116
        L_0x01b3:
            r7 = 21
            goto L_0x0116
        L_0x01b7:
            r7 = 19
            goto L_0x0116
        L_0x01bb:
            r1.setMin = r5     // Catch:{ all -> 0x01ef }
            r1.length(r15)     // Catch:{ all -> 0x01ef }
            r1.length(r10)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x01ef }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x01ef }
            o.APHitTestResult r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x01ef }
            r1.toIntRange = r0     // Catch:{ all -> 0x01ef }
            goto L_0x013b
        L_0x01cd:
            o.sendSensorResult$toFloatRange r0 = new o.sendSensorResult$toFloatRange     // Catch:{ all -> 0x01ef }
            r0.<init>()     // Catch:{ all -> 0x01ef }
            r1.toIntRange = r0     // Catch:{ all -> 0x01ef }
            goto L_0x013b
        L_0x01d6:
            r7 = 24
            goto L_0x0116
        L_0x01da:
            r1.length(r7)     // Catch:{ all -> 0x01ef }
            int r0 = r1.setMax     // Catch:{ all -> 0x01ef }
            if (r0 != 0) goto L_0x01ec
            r0 = 58
            r7 = 58
            goto L_0x0116
        L_0x01e7:
            r7 = 14
            goto L_0x0116
        L_0x01eb:
            return
        L_0x01ec:
            r7 = r12
            goto L_0x0116
        L_0x01ef:
            r0 = move-exception
            r7 = 13
            r16 = 39
            if (r12 < r14) goto L_0x01fe
            if (r12 > r13) goto L_0x01fe
            r4 = 44
            r6 = 59
            goto L_0x033e
        L_0x01fe:
            byte[] r17 = setMin
            byte r4 = r17[r8]
            byte r4 = (byte) r4
            r6 = 2427(0x97b, float:3.401E-42)
            short r6 = (short) r6
            r9 = 14097(0x3711, float:1.9754E-41)
            short r9 = (short) r9
            java.lang.String r4 = length(r4, r6, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0223
            if (r12 < r5) goto L_0x0223
            if (r12 > r13) goto L_0x0223
        L_0x021b:
            r4 = 44
        L_0x021d:
            r6 = 59
        L_0x021f:
            r7 = 39
            goto L_0x033e
        L_0x0223:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r6 = 2432(0x980, float:3.408E-42)
            short r6 = (short) r6
            r9 = 14148(0x3744, float:1.9826E-41)
            short r9 = (short) r9
            java.lang.String r4 = length(r4, r6, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0248
            if (r12 < r15) goto L_0x0248
            if (r12 > r10) goto L_0x0248
        L_0x0240:
            r4 = 44
        L_0x0242:
            r6 = 59
            r7 = 38
            goto L_0x033e
        L_0x0248:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r6 = 2428(0x97c, float:3.402E-42)
            short r6 = (short) r6
            r9 = r6 & 208(0xd0, float:2.91E-43)
            short r9 = (short) r9
            java.lang.String r4 = length(r4, r6, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0266
            if (r12 < r10) goto L_0x0266
            if (r12 > r14) goto L_0x0266
            goto L_0x0240
        L_0x0266:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r10 = 2424(0x978, float:3.397E-42)
            short r10 = (short) r10
            r14 = 14181(0x3765, float:1.9872E-41)
            short r14 = (short) r14
            java.lang.String r4 = length(r4, r10, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0284
            if (r12 < r13) goto L_0x0284
            if (r12 > r7) goto L_0x0284
            goto L_0x021b
        L_0x0284:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r10, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x029e
            r4 = 10
            if (r12 < r4) goto L_0x029e
            if (r12 > r7) goto L_0x029e
            goto L_0x0240
        L_0x029e:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r13 = 2419(0x973, float:3.39E-42)
            short r13 = (short) r13
            r15 = 13371(0x343b, float:1.8737E-41)
            short r15 = (short) r15
            java.lang.String r4 = length(r4, r13, r15)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02be
            r4 = 11
            if (r12 < r4) goto L_0x02be
            if (r12 > r7) goto L_0x02be
            goto L_0x0240
        L_0x02be:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2439(0x987, float:3.418E-42)
            short r7 = (short) r7
            r13 = 7187(0x1c13, float:1.0071E-41)
            short r13 = (short) r13
            java.lang.String r4 = length(r4, r7, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02df
            if (r12 < r11) goto L_0x02df
            r4 = 25
            if (r12 > r4) goto L_0x02df
            goto L_0x021b
        L_0x02df:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = r4 | 2368(0x940, float:3.318E-42)
            short r7 = (short) r7
            r13 = 11228(0x2bdc, float:1.5734E-41)
            short r13 = (short) r13
            java.lang.String r4 = length(r4, r7, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0302
            r4 = 41
            if (r12 < r4) goto L_0x0302
            r4 = 44
            if (r12 > r4) goto L_0x0302
            goto L_0x0242
        L_0x0302:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r10, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x031f
            r4 = 44
            if (r12 < r4) goto L_0x0321
            r7 = 59
            if (r12 > r7) goto L_0x0321
            goto L_0x021d
        L_0x031f:
            r4 = 44
        L_0x0321:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            java.lang.String r6 = length(r7, r6, r9)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0349
            r6 = 53
            if (r12 < r6) goto L_0x0349
            r6 = 59
            if (r12 > r6) goto L_0x0349
            goto L_0x021f
        L_0x033e:
            r1.toIntRange = r0
            r1.length(r11)
            r4 = 21
            r6 = 14
            goto L_0x0116
        L_0x0349:
            throw r0
        L_0x034a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0352
            throw r1
        L_0x0352:
            goto L_0x0354
        L_0x0353:
            throw r0
        L_0x0354:
            goto L_0x0353
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018a, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025f, code lost:
        if (r10 <= 33) goto L_0x0261;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19) {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r0 = r18
            r3 = r19
            r1.<init>(r2, r0, r3)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = 2090(0x82a, float:2.929E-42)
            short r4 = (short) r4
            r5 = 9886(0x269e, float:1.3853E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0392 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0392 }
            byte[] r4 = setMin     // Catch:{ all -> 0x0392 }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x0392 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0392 }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0392 }
            int r11 = setMax     // Catch:{ all -> 0x0392 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0392 }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x0392 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0392 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0392 }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x0392 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0392 }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0392 }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0392 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0392 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x0392 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0392 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0392 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0392 }
            int r14 = setMax     // Catch:{ all -> 0x0392 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0392 }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x0392 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0392 }
            r12[r8] = r13     // Catch:{ all -> 0x0392 }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x0392 }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x0392 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0392 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x0080:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0116
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x010d }
            r12[r8] = r11     // Catch:{ all -> 0x010d }
            byte[] r11 = setMin     // Catch:{ all -> 0x010d }
            byte r11 = r11[r9]     // Catch:{ all -> 0x010d }
            byte r11 = (byte) r11     // Catch:{ all -> 0x010d }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x010d }
            int r14 = setMax     // Catch:{ all -> 0x010d }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x010d }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x010d }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x010d }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x010d }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x010d }
            r3 = 13879(0x3637, float:1.9449E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x010d }
            java.lang.String r3 = length(r14, r15, r3)     // Catch:{ all -> 0x010d }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x010d }
            byte[] r15 = setMin     // Catch:{ all -> 0x010d }
            byte r15 = r15[r9]     // Catch:{ all -> 0x010d }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010d }
            int r5 = setMax     // Catch:{ all -> 0x010d }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x010d }
            java.lang.String r5 = length(r15, r10, r5)     // Catch:{ all -> 0x010d }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x010d }
            r14[r8] = r5     // Catch:{ all -> 0x010d }
            java.lang.reflect.Method r3 = r11.getMethod(r3, r14)     // Catch:{ all -> 0x010d }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x010d }
            byte[] r11 = setMin     // Catch:{ all -> 0x0104 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0104 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0104 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0104 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0104 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0104 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0104 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0104 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0104 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x0080
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0115
            throw r1
        L_0x0115:
            throw r0
        L_0x0116:
            r3 = 86
            r5 = 51
        L_0x011a:
            r7 = 37
        L_0x011c:
            int r10 = r8 + 1
            r0 = r4[r8]     // Catch:{ all -> 0x0239 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0239 }
            r8 = 22
            r11 = 5
            r12 = 3
            r13 = 4
            switch(r0) {
                case -27: goto L_0x0235;
                case -26: goto L_0x0231;
                case -25: goto L_0x022d;
                case -24: goto L_0x0220;
                case -23: goto L_0x021c;
                case -22: goto L_0x0218;
                case -21: goto L_0x020b;
                case -20: goto L_0x0207;
                case -19: goto L_0x0202;
                case -18: goto L_0x01ec;
                case -17: goto L_0x01e7;
                case -16: goto L_0x01e3;
                case -15: goto L_0x01e0;
                case -14: goto L_0x01c4;
                case -13: goto L_0x01b5;
                case -12: goto L_0x01b1;
                case -11: goto L_0x018f;
                case -10: goto L_0x017a;
                case -9: goto L_0x0177;
                case -8: goto L_0x016d;
                case -7: goto L_0x015a;
                case -6: goto L_0x0157;
                case -5: goto L_0x0154;
                case -4: goto L_0x014c;
                case -3: goto L_0x013c;
                case -2: goto L_0x0131;
                case -1: goto L_0x012e;
                default: goto L_0x012c;
            }     // Catch:{ all -> 0x0239 }
        L_0x012c:
            goto L_0x0236
        L_0x012e:
            r8 = 86
            goto L_0x011c
        L_0x0131:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0239 }
            r1.setMin = r0     // Catch:{ all -> 0x0239 }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x0239 }
            goto L_0x0236
        L_0x013c:
            r1.setMin = r6     // Catch:{ all -> 0x0239 }
            r1.length(r12)     // Catch:{ all -> 0x0239 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x0239 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0239 }
            b = r0     // Catch:{ all -> 0x0239 }
            goto L_0x0236
        L_0x014c:
            r1.length(r8)     // Catch:{ all -> 0x0239 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0239 }
            if (r0 != 0) goto L_0x0236
            goto L_0x011c
        L_0x0154:
            r8 = 39
            goto L_0x011c
        L_0x0157:
            r8 = 106(0x6a, float:1.49E-43)
            goto L_0x011c
        L_0x015a:
            r1.length(r6)     // Catch:{ all -> 0x0239 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0239 }
            r8 = 19
            r10 = 41
            if (r0 == r8) goto L_0x0168
            r8 = 41
            goto L_0x011c
        L_0x0168:
            r0 = 79
            r8 = 79
            goto L_0x011c
        L_0x016d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x0239 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0239 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0239 }
            throw r0     // Catch:{ all -> 0x0239 }
        L_0x0177:
            r8 = 33
            goto L_0x011c
        L_0x017a:
            r1.setMin = r6     // Catch:{ all -> 0x0239 }
            r1.length(r12)     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0239 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0239 }
            o.APDownloadListener r0 = r0.valueOf     // Catch:{ all -> 0x0239 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0239 }
        L_0x018a:
            r1.length(r11)     // Catch:{ all -> 0x0239 }
            goto L_0x0236
        L_0x018f:
            o.sendSensorResult$setMax r0 = new o.sendSensorResult$setMax     // Catch:{ all -> 0x0239 }
            r1.setMin = r12     // Catch:{ all -> 0x0239 }
            r1.length(r12)     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x0239 }
            o.sendSensorResult r8 = (o.sendSensorResult) r8     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r12 = r1.equals     // Catch:{ all -> 0x0239 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r13 = r1.equals     // Catch:{ all -> 0x0239 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0239 }
            r0.<init>(r8, r12, r13)     // Catch:{ all -> 0x0239 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0239 }
            goto L_0x018a
        L_0x01b1:
            r8 = 51
            goto L_0x011c
        L_0x01b5:
            r1.setMin = r6     // Catch:{ all -> 0x0239 }
            r1.length(r12)     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0239 }
            o.setGlobalUserData r0 = (o.setGlobalUserData) r0     // Catch:{ all -> 0x0239 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0239 }
            goto L_0x018a
        L_0x01c4:
            r1.setMin = r12     // Catch:{ all -> 0x0239 }
            r1.length(r12)     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0239 }
            o.parseFailed r0 = (o.parseFailed) r0     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x0239 }
            o.setGlobalUserData r8 = (o.setGlobalUserData) r8     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r11 = r1.equals     // Catch:{ all -> 0x0239 }
            r0.execute(r8, r11)     // Catch:{ all -> 0x0239 }
            goto L_0x0236
        L_0x01e0:
            r8 = 1
            goto L_0x011c
        L_0x01e3:
            r8 = 23
            goto L_0x011c
        L_0x01e7:
            java.lang.String r0 = "phoneNumber"
            r1.toIntRange = r0     // Catch:{ all -> 0x0239 }
            goto L_0x018a
        L_0x01ec:
            r0 = 2
            r1.setMin = r0     // Catch:{ all -> 0x0239 }
            r1.length(r12)     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0239 }
            r1.length(r13)     // Catch:{ all -> 0x0239 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x0239 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0239 }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)     // Catch:{ all -> 0x0239 }
            goto L_0x0236
        L_0x0202:
            java.lang.String r0 = "securityId"
            r1.toIntRange = r0     // Catch:{ all -> 0x0239 }
            goto L_0x018a
        L_0x0207:
            r8 = 26
            goto L_0x011c
        L_0x020b:
            r1.length(r8)     // Catch:{ all -> 0x0239 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0239 }
            if (r0 != 0) goto L_0x0236
            r0 = 78
            r8 = 78
            goto L_0x011c
        L_0x0218:
            r8 = 25
            goto L_0x011c
        L_0x021c:
            r8 = 91
            goto L_0x011c
        L_0x0220:
            r1.length(r8)     // Catch:{ all -> 0x0239 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0239 }
            if (r0 != 0) goto L_0x0236
            r0 = 105(0x69, float:1.47E-43)
            r8 = 105(0x69, float:1.47E-43)
            goto L_0x011c
        L_0x022d:
            r8 = 37
            goto L_0x011c
        L_0x0231:
            r8 = 108(0x6c, float:1.51E-43)
            goto L_0x011c
        L_0x0235:
            return
        L_0x0236:
            r8 = r10
            goto L_0x011c
        L_0x0239:
            r0 = move-exception
            byte[] r8 = setMin
            byte r11 = r8[r9]
            byte r11 = (byte) r11
            r12 = 2427(0x97b, float:3.401E-42)
            short r12 = (short) r12
            r13 = 15
            byte r8 = r8[r13]
            short r8 = (short) r8
            java.lang.String r8 = length(r11, r12, r8)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            r11 = 50
            r14 = 24
            if (r8 == 0) goto L_0x0265
            r8 = 27
            if (r10 < r8) goto L_0x0265
            r8 = 33
            if (r10 > r8) goto L_0x0267
        L_0x0261:
            r8 = 40
            goto L_0x0389
        L_0x0265:
            r8 = 33
        L_0x0267:
            r6 = 47
            if (r10 < r6) goto L_0x0271
            if (r10 > r11) goto L_0x0271
            r8 = 50
            goto L_0x0389
        L_0x0271:
            byte[] r16 = setMin
            byte r7 = r16[r9]
            byte r7 = (byte) r7
            int r8 = setMax
            r8 = r8 | 2336(0x920, float:3.273E-42)
            short r8 = (short) r8
            r13 = 8656(0x21d0, float:1.213E-41)
            short r13 = (short) r13
            java.lang.String r7 = length(r7, r8, r13)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            r8 = 43
            if (r7 == 0) goto L_0x0295
            r7 = 42
            if (r10 < r7) goto L_0x0295
            if (r10 > r8) goto L_0x0295
            goto L_0x0261
        L_0x0295:
            byte[] r7 = setMin
            byte r7 = r7[r9]
            byte r7 = (byte) r7
            r13 = 2439(0x987, float:3.418E-42)
            short r13 = (short) r13
            r15 = 7187(0x1c13, float:1.0071E-41)
            short r15 = (short) r15
            java.lang.String r7 = length(r7, r13, r15)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02b8
            if (r10 < r8) goto L_0x02b8
            r7 = 44
            if (r10 > r7) goto L_0x02b8
        L_0x02b4:
            r8 = 24
            goto L_0x0389
        L_0x02b8:
            byte[] r7 = setMin
            byte r7 = r7[r9]
            byte r7 = (byte) r7
            r8 = 14097(0x3711, float:1.9754E-41)
            short r8 = (short) r8
            java.lang.String r7 = length(r7, r12, r8)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02d5
            r7 = 45
            if (r10 < r7) goto L_0x02d5
            if (r10 > r11) goto L_0x02d5
            goto L_0x02b4
        L_0x02d5:
            byte[] r7 = setMin
            byte r7 = r7[r9]
            byte r7 = (byte) r7
            java.lang.String r7 = length(r7, r13, r15)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02f0
            r7 = 46
            if (r10 < r7) goto L_0x02f0
            if (r10 > r6) goto L_0x02f0
            goto L_0x0261
        L_0x02f0:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            java.lang.String r6 = length(r6, r12, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x030b
            if (r10 < r5) goto L_0x030b
            r6 = 52
            if (r10 > r6) goto L_0x030b
            goto L_0x0261
        L_0x030b:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            r7 = 2432(0x980, float:3.408E-42)
            short r7 = (short) r7
            r11 = 14148(0x3744, float:1.9826E-41)
            short r11 = (short) r11
            java.lang.String r6 = length(r6, r7, r11)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r7 = 81
            if (r6 == 0) goto L_0x032e
            r6 = 80
            if (r10 < r6) goto L_0x032e
            if (r10 > r7) goto L_0x032e
            goto L_0x0261
        L_0x032e:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            java.lang.String r6 = length(r6, r12, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0349
            if (r10 < r7) goto L_0x0349
            r6 = 82
            if (r10 > r6) goto L_0x0349
            goto L_0x02b4
        L_0x0349:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            java.lang.String r6 = length(r6, r12, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0364
            r6 = 83
            if (r10 < r6) goto L_0x0364
            if (r10 > r3) goto L_0x0364
            goto L_0x0261
        L_0x0364:
            byte[] r6 = setMin
            byte r7 = r6[r9]
            byte r7 = (byte) r7
            r8 = 2423(0x977, float:3.395E-42)
            short r8 = (short) r8
            r11 = 13891(0x3643, float:1.9465E-41)
            byte r6 = r6[r11]
            short r6 = (short) r6
            java.lang.String r6 = length(r7, r8, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0391
            r6 = 84
            if (r10 < r6) goto L_0x0391
            r6 = 85
            if (r10 > r6) goto L_0x0391
            goto L_0x02b4
        L_0x0389:
            r1.toIntRange = r0
            r1.length(r14)
            r6 = 1
            goto L_0x011a
        L_0x0391:
            throw r0
        L_0x0392:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x039a
            throw r1
        L_0x039a:
            goto L_0x039c
        L_0x039b:
            throw r0
        L_0x039c:
            goto L_0x039b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ee, code lost:
        if (r12 <= 58) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x031a, code lost:
        if (r12 <= 75) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015b, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0183, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ff, code lost:
        r5 = r12;
     */
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.Throwable r22) {
        /*
            r18 = this;
            o.GyroscopeSensorService r7 = new o.GyroscopeSensorService
            r1 = r7
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            byte[] r0 = setMin
            r1 = 33
            byte r0 = r0[r1]
            byte r0 = (byte) r0
            r1 = r0 | 2176(0x880, float:3.049E-42)
            short r1 = (short) r1
            r2 = 1293(0x50d, float:1.812E-42)
            short r2 = (short) r2
            java.lang.String r0 = length(r0, r1, r2)
            byte[] r1 = setMin
            r2 = 15
            byte r1 = r1[r2]
            byte r1 = (byte) r1
            r3 = r1 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r1 = length(r1, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x036b }
            r5 = 0
            r4[r5] = r1     // Catch:{ all -> 0x036b }
            byte[] r1 = setMin     // Catch:{ all -> 0x036b }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r1 = r1[r6]     // Catch:{ all -> 0x036b }
            byte r1 = (byte) r1     // Catch:{ all -> 0x036b }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x036b }
            int r9 = setMax     // Catch:{ all -> 0x036b }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x036b }
            java.lang.String r1 = length(r1, r8, r9)     // Catch:{ all -> 0x036b }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x036b }
            byte[] r9 = setMin     // Catch:{ all -> 0x036b }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x036b }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x036b }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x036b }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x036b }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x036b }
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ all -> 0x036b }
            byte[] r11 = setMin     // Catch:{ all -> 0x036b }
            byte r11 = r11[r6]     // Catch:{ all -> 0x036b }
            byte r11 = (byte) r11     // Catch:{ all -> 0x036b }
            int r12 = setMax     // Catch:{ all -> 0x036b }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x036b }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x036b }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x036b }
            r10[r5] = r11     // Catch:{ all -> 0x036b }
            java.lang.reflect.Method r1 = r1.getMethod(r9, r10)     // Catch:{ all -> 0x036b }
            java.lang.Object r0 = r1.invoke(r0, r4)     // Catch:{ all -> 0x036b }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x036b }
            int r1 = r0.length
            int[] r1 = new int[r1]
            r4 = 0
        L_0x0085:
            int r9 = r0.length
            r10 = 74
            if (r4 >= r9) goto L_0x0116
            r9 = r0[r4]
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x010d }
            r11[r5] = r9     // Catch:{ all -> 0x010d }
            byte[] r9 = setMin     // Catch:{ all -> 0x010d }
            byte r9 = r9[r6]     // Catch:{ all -> 0x010d }
            byte r9 = (byte) r9     // Catch:{ all -> 0x010d }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x010d }
            int r13 = setMax     // Catch:{ all -> 0x010d }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010d }
            java.lang.String r9 = length(r9, r12, r13)     // Catch:{ all -> 0x010d }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010d }
            byte r10 = (byte) r10     // Catch:{ all -> 0x010d }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x010d }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x010d }
            java.lang.String r10 = length(r10, r13, r14)     // Catch:{ all -> 0x010d }
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x010d }
            byte[] r14 = setMin     // Catch:{ all -> 0x010d }
            byte r14 = r14[r6]     // Catch:{ all -> 0x010d }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010d }
            int r15 = setMax     // Catch:{ all -> 0x010d }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x010d }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x010d }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x010d }
            r13[r5] = r14     // Catch:{ all -> 0x010d }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r13)     // Catch:{ all -> 0x010d }
            r10 = 0
            java.lang.Object r9 = r9.invoke(r10, r11)     // Catch:{ all -> 0x010d }
            byte[] r11 = setMin     // Catch:{ all -> 0x0104 }
            byte r11 = r11[r6]     // Catch:{ all -> 0x0104 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0104 }
            int r13 = setMax     // Catch:{ all -> 0x0104 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0104 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0104 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0104 }
            byte r12 = r12[r6]     // Catch:{ all -> 0x0104 }
            int r12 = r12 - r3
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x0104 }
            java.lang.Object r9 = r11.invoke(r9, r10)     // Catch:{ all -> 0x0104 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0104 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0104 }
            r1[r4] = r9
            int r4 = r4 + 1
            goto L_0x0085
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0115
            throw r1
        L_0x0115:
            throw r0
        L_0x0116:
            r8 = 30
            r9 = 3
            r11 = 5
        L_0x011a:
            int r12 = r5 + 1
            r13 = 52
            r14 = 81
            r0 = r1[r5]     // Catch:{ all -> 0x0204 }
            int r0 = r7.length(r0)     // Catch:{ all -> 0x0204 }
            r5 = 48
            r15 = 4
            switch(r0) {
                case -22: goto L_0x01ee;
                case -21: goto L_0x01e4;
                case -20: goto L_0x01e1;
                case -19: goto L_0x01e0;
                case -18: goto L_0x01dc;
                case -17: goto L_0x01d7;
                case -16: goto L_0x01c1;
                case -15: goto L_0x01bc;
                case -14: goto L_0x01b9;
                case -13: goto L_0x018d;
                case -12: goto L_0x0188;
                case -11: goto L_0x0173;
                case -10: goto L_0x0171;
                case -9: goto L_0x016f;
                case -8: goto L_0x0163;
                case -7: goto L_0x0160;
                case -6: goto L_0x015d;
                case -5: goto L_0x014f;
                case -4: goto L_0x013f;
                case -3: goto L_0x0134;
                case -2: goto L_0x0131;
                case -1: goto L_0x012e;
                default: goto L_0x012c;
            }     // Catch:{ all -> 0x0204 }
        L_0x012c:
            goto L_0x01ff
        L_0x012e:
            r5 = 67
            goto L_0x011a
        L_0x0131:
            r5 = 82
            goto L_0x011a
        L_0x0134:
            int r0 = b     // Catch:{ all -> 0x0204 }
            r7.setMin = r0     // Catch:{ all -> 0x0204 }
            r0 = 14
            r7.length(r0)     // Catch:{ all -> 0x0204 }
            goto L_0x01ff
        L_0x013f:
            r7.setMin = r3     // Catch:{ all -> 0x0204 }
            r7.length(r9)     // Catch:{ all -> 0x0204 }
            r0 = 21
            r7.length(r0)     // Catch:{ all -> 0x0204 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0204 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x0204 }
            goto L_0x01ff
        L_0x014f:
            r7.length(r5)     // Catch:{ all -> 0x0204 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x015b
            r0 = 28
            r5 = 28
            goto L_0x011a
        L_0x015b:
            r5 = r12
            goto L_0x011a
        L_0x015d:
            r5 = 29
            goto L_0x011a
        L_0x0160:
            r5 = 58
            goto L_0x011a
        L_0x0163:
            r7.length(r5)     // Catch:{ all -> 0x0204 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x015b
            r0 = 51
            r5 = 51
            goto L_0x011a
        L_0x016f:
            r5 = 3
            goto L_0x011a
        L_0x0171:
            r5 = 1
            goto L_0x011a
        L_0x0173:
            r7.setMin = r3     // Catch:{ all -> 0x0204 }
            r7.length(r9)     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0204 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0204 }
            android.content.Context r0 = r0.toIntRange     // Catch:{ all -> 0x0204 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0204 }
        L_0x0183:
            r7.length(r11)     // Catch:{ all -> 0x0204 }
            goto L_0x01ff
        L_0x0188:
            java.lang.String r0 = "Onboarding Input Phone"
            r7.toIntRange = r0     // Catch:{ all -> 0x0204 }
            goto L_0x0183
        L_0x018d:
            r7.setMin = r11     // Catch:{ all -> 0x0204 }
            r7.length(r9)     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0204 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x0204 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r10 = r7.equals     // Catch:{ all -> 0x0204 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r4 = r7.equals     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r15 = r7.equals     // Catch:{ all -> 0x0204 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0204 }
            o.BlurProcess.getMin(r0, r5, r10, r4, r15)     // Catch:{ all -> 0x0204 }
            goto L_0x01ff
        L_0x01b9:
            r5 = 65
            goto L_0x0200
        L_0x01bc:
            java.lang.String r0 = "operationType"
            r7.toIntRange = r0     // Catch:{ all -> 0x0204 }
            goto L_0x0183
        L_0x01c1:
            r0 = 2
            r7.setMin = r0     // Catch:{ all -> 0x0204 }
            r7.length(r9)     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0204 }
            r7.length(r15)     // Catch:{ all -> 0x0204 }
            java.lang.Object r4 = r7.equals     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0204 }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)     // Catch:{ all -> 0x0204 }
            goto L_0x01ff
        L_0x01d7:
            java.lang.String r0 = "exception"
            r7.toIntRange = r0     // Catch:{ all -> 0x0204 }
            goto L_0x0183
        L_0x01dc:
            r5 = 30
            goto L_0x011a
        L_0x01e0:
            return
        L_0x01e1:
            r5 = 5
            goto L_0x011a
        L_0x01e4:
            r0 = 8
            r7.length(r0)     // Catch:{ all -> 0x0204 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0204 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0204 }
            throw r0     // Catch:{ all -> 0x0204 }
        L_0x01ee:
            r7.length(r3)     // Catch:{ all -> 0x0204 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0204 }
            r4 = 70
            r5 = 73
            if (r0 == r4) goto L_0x0200
            if (r0 == r14) goto L_0x01fc
            goto L_0x0200
        L_0x01fc:
            r5 = 52
            goto L_0x0200
        L_0x01ff:
            r5 = r12
        L_0x0200:
            r10 = 74
            goto L_0x011a
        L_0x0204:
            r0 = move-exception
            byte[] r4 = setMin
            byte r4 = r4[r6]
            byte r4 = (byte) r4
            r5 = 2424(0x978, float:3.397E-42)
            short r5 = (short) r5
            r10 = 14181(0x3765, float:1.9872E-41)
            short r10 = (short) r10
            java.lang.String r4 = length(r4, r5, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r15 = 24
            r16 = 71
            if (r4 == 0) goto L_0x022f
            if (r12 < r11) goto L_0x022f
            r4 = 6
            if (r12 > r4) goto L_0x022f
        L_0x0227:
            r2 = 58
        L_0x0229:
            r4 = 74
        L_0x022b:
            r5 = 71
            goto L_0x035d
        L_0x022f:
            byte[] r4 = setMin
            byte r4 = r4[r6]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r5, r10)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0250
            r4 = 23
            if (r12 < r4) goto L_0x0250
            if (r12 > r15) goto L_0x0250
        L_0x0248:
            r2 = 58
            r4 = 74
        L_0x024c:
            r5 = 81
            goto L_0x035d
        L_0x0250:
            byte[] r4 = setMin
            byte r4 = r4[r6]
            byte r4 = (byte) r4
            r3 = 2427(0x97b, float:3.401E-42)
            short r3 = (short) r3
            r9 = 14097(0x3711, float:1.9754E-41)
            short r9 = (short) r9
            java.lang.String r4 = length(r4, r3, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0270
            if (r12 < r8) goto L_0x0270
            r4 = 31
            if (r12 > r4) goto L_0x0270
            goto L_0x0227
        L_0x0270:
            byte[] r4 = setMin
            byte r9 = r4[r6]
            byte r9 = (byte) r9
            byte r4 = r4[r2]
            short r4 = (short) r4
            java.lang.String r3 = length(r9, r3, r4)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x028d
            r3 = 47
            if (r12 < r3) goto L_0x028d
            if (r12 > r13) goto L_0x028d
            goto L_0x0248
        L_0x028d:
            byte[] r3 = setMin
            byte r3 = r3[r6]
            byte r3 = (byte) r3
            r4 = 2428(0x97c, float:3.402E-42)
            short r4 = (short) r4
            r9 = r4 & 208(0xd0, float:2.91E-43)
            short r9 = (short) r9
            java.lang.String r3 = length(r3, r4, r9)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02af
            r3 = 53
            if (r12 < r3) goto L_0x02af
            r3 = 54
            if (r12 > r3) goto L_0x02af
            goto L_0x0248
        L_0x02af:
            byte[] r3 = setMin
            byte r13 = r3[r6]
            byte r13 = (byte) r13
            r2 = 2423(0x977, float:3.395E-42)
            short r2 = (short) r2
            r17 = 13891(0x3643, float:1.9465E-41)
            byte r3 = r3[r17]
            short r3 = (short) r3
            java.lang.String r3 = length(r13, r2, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            r13 = 56
            if (r3 == 0) goto L_0x02d4
            r3 = 55
            if (r12 < r3) goto L_0x02d4
            if (r12 > r13) goto L_0x02d4
            goto L_0x0227
        L_0x02d4:
            byte[] r3 = setMin
            byte r8 = r3[r6]
            byte r8 = (byte) r8
            byte r3 = r3[r17]
            short r3 = (short) r3
            java.lang.String r2 = length(r8, r2, r3)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x02f2
            if (r12 < r13) goto L_0x02f2
            r2 = 58
            if (r12 > r2) goto L_0x02f4
            goto L_0x0229
        L_0x02f2:
            r2 = 58
        L_0x02f4:
            r3 = 78
            if (r12 < r3) goto L_0x0301
            if (r12 > r14) goto L_0x0301
            r3 = 72
            r4 = 74
            r5 = 72
            goto L_0x035d
        L_0x0301:
            byte[] r8 = setMin
            byte r8 = r8[r6]
            byte r8 = (byte) r8
            java.lang.String r4 = length(r8, r4, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x031e
            r4 = 74
            if (r12 < r4) goto L_0x0320
            r8 = 75
            if (r12 > r8) goto L_0x0320
        L_0x031c:
            goto L_0x022b
        L_0x031e:
            r4 = 74
        L_0x0320:
            byte[] r8 = setMin
            byte r8 = r8[r6]
            byte r8 = (byte) r8
            r9 = 2432(0x980, float:3.408E-42)
            short r9 = (short) r9
            r13 = 14148(0x3744, float:1.9826E-41)
            short r13 = (short) r13
            java.lang.String r8 = length(r8, r9, r13)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0343
            r8 = 76
            if (r12 < r8) goto L_0x0343
            r8 = 77
            if (r12 > r8) goto L_0x0343
            goto L_0x024c
        L_0x0343:
            byte[] r8 = setMin
            byte r8 = r8[r6]
            byte r8 = (byte) r8
            java.lang.String r5 = length(r8, r5, r10)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x036a
            r5 = 77
            if (r12 < r5) goto L_0x036a
            if (r12 > r3) goto L_0x036a
            goto L_0x031c
        L_0x035d:
            r7.toIntRange = r0
            r7.length(r15)
            r2 = 15
            r3 = 1
            r8 = 30
            r9 = 3
            goto L_0x0200
        L_0x036a:
            throw r0
        L_0x036b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0373
            throw r1
        L_0x0373:
            goto L_0x0375
        L_0x0374:
            throw r0
        L_0x0375:
            goto L_0x0374
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.getMin(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.setEncryptProxy length() {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = 2356(0x934, float:3.301E-42)
            short r4 = (short) r4
            r5 = 11836(0x2e3c, float:1.6586E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x023b }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x023b }
            byte[] r4 = setMin     // Catch:{ all -> 0x023b }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x023b }
            byte r4 = (byte) r4     // Catch:{ all -> 0x023b }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x023b }
            int r11 = setMax     // Catch:{ all -> 0x023b }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x023b }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x023b }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x023b }
            byte[] r11 = setMin     // Catch:{ all -> 0x023b }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x023b }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x023b }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x023b }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x023b }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x023b }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x023b }
            byte[] r13 = setMin     // Catch:{ all -> 0x023b }
            byte r13 = r13[r9]     // Catch:{ all -> 0x023b }
            byte r13 = (byte) r13     // Catch:{ all -> 0x023b }
            int r14 = setMax     // Catch:{ all -> 0x023b }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x023b }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x023b }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x023b }
            r12[r8] = r13     // Catch:{ all -> 0x023b }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x023b }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x023b }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x023b }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x007c:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0112
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0109 }
            r12[r8] = r11     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0109 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0109 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0109 }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0109 }
            int r14 = setMax     // Catch:{ all -> 0x0109 }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0109 }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x0109 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0109 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0109 }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0109 }
            r3 = 13879(0x3637, float:1.9449E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = length(r14, r15, r3)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x0109 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0109 }
            byte r15 = r15[r9]     // Catch:{ all -> 0x0109 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0109 }
            int r5 = setMax     // Catch:{ all -> 0x0109 }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = length(r15, r10, r5)     // Catch:{ all -> 0x0109 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0109 }
            r14[r8] = r5     // Catch:{ all -> 0x0109 }
            java.lang.reflect.Method r3 = r11.getMethod(r3, r14)     // Catch:{ all -> 0x0109 }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0100 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0100 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0100 }
            int r12 = setMax     // Catch:{ all -> 0x0100 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0100 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0100 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0100 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0100 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0100 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0100 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0100 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0100 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0100 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x007c
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0108
            throw r1
        L_0x0108:
            throw r0
        L_0x0109:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0111
            throw r1
        L_0x0111:
            throw r0
        L_0x0112:
            r3 = 20
            r5 = 8
        L_0x0116:
            int r7 = r8 + 1
            r10 = 14
            r11 = 32
            r12 = 3
            r13 = 4
            r0 = r4[r8]     // Catch:{ all -> 0x0195 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0195 }
            switch(r0) {
                case -13: goto L_0x0190;
                case -12: goto L_0x018d;
                case -11: goto L_0x017f;
                case -10: goto L_0x0170;
                case -9: goto L_0x0168;
                case -8: goto L_0x0166;
                case -7: goto L_0x015e;
                case -6: goto L_0x015b;
                case -5: goto L_0x0153;
                case -4: goto L_0x0150;
                case -3: goto L_0x013b;
                case -2: goto L_0x012c;
                case -1: goto L_0x0129;
                default: goto L_0x0127;
            }     // Catch:{ all -> 0x0195 }
        L_0x0127:
            goto L_0x0193
        L_0x0129:
            r8 = 8
            goto L_0x0116
        L_0x012c:
            r1.length(r6)     // Catch:{ all -> 0x0195 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0195 }
            if (r0 == r13) goto L_0x0138
            r7 = 41
            r8 = 32
            goto L_0x0116
        L_0x0138:
            r0 = 2
            r8 = 2
            goto L_0x0116
        L_0x013b:
            r1.setMin = r6     // Catch:{ all -> 0x0195 }
            r1.length(r12)     // Catch:{ all -> 0x0195 }
            r1.length(r13)     // Catch:{ all -> 0x0195 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0195 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0195 }
            o.setEncryptProxy r0 = r0.getMax     // Catch:{ all -> 0x0195 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0195 }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x0193
        L_0x0150:
            r8 = 12
            goto L_0x0116
        L_0x0153:
            r1.length(r5)     // Catch:{ all -> 0x0195 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0195 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x015b:
            r8 = 20
            goto L_0x0116
        L_0x015e:
            r1.length(r5)     // Catch:{ all -> 0x0195 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0195 }
            o.setEncryptProxy r0 = (o.setEncryptProxy) r0     // Catch:{ all -> 0x0195 }
            return r0
        L_0x0166:
            r8 = 1
            goto L_0x0116
        L_0x0168:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0195 }
            r1.setMin = r0     // Catch:{ all -> 0x0195 }
            r1.length(r10)     // Catch:{ all -> 0x0195 }
            goto L_0x0193
        L_0x0170:
            r1.setMin = r6     // Catch:{ all -> 0x0195 }
            r1.length(r12)     // Catch:{ all -> 0x0195 }
            r0 = 21
            r1.length(r0)     // Catch:{ all -> 0x0195 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0195 }
            b = r0     // Catch:{ all -> 0x0195 }
            goto L_0x0193
        L_0x017f:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x0195 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0193
            r0 = 31
            r8 = 31
            goto L_0x0116
        L_0x018d:
            r8 = 16
            goto L_0x0116
        L_0x0190:
            r8 = 18
            goto L_0x0116
        L_0x0193:
            r8 = r7
            goto L_0x0116
        L_0x0195:
            r0 = move-exception
            r8 = 7
            if (r7 < r13) goto L_0x01a3
            if (r7 > r8) goto L_0x01a3
            r8 = 33
            r14 = 15
            r16 = 7
            goto L_0x022f
        L_0x01a3:
            byte[] r13 = setMin
            byte r13 = r13[r9]
            byte r13 = (byte) r13
            r14 = 2439(0x987, float:3.418E-42)
            short r14 = (short) r14
            r15 = 7187(0x1c13, float:1.0071E-41)
            short r15 = (short) r15
            java.lang.String r13 = length(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x01c7
            if (r7 < r12) goto L_0x01c7
            if (r7 > r8) goto L_0x01c7
        L_0x01c0:
            r8 = 33
            r14 = 15
        L_0x01c4:
            r16 = 15
            goto L_0x022f
        L_0x01c7:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            int r12 = setMax
            r12 = r12 | 2336(0x920, float:3.273E-42)
            short r12 = (short) r12
            r13 = 8656(0x21d0, float:1.213E-41)
            short r13 = (short) r13
            java.lang.String r8 = length(r8, r12, r13)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x01e7
            if (r7 < r3) goto L_0x01e7
            if (r7 > r11) goto L_0x01e7
            goto L_0x01c0
        L_0x01e7:
            byte[] r8 = setMin
            byte r11 = r8[r9]
            byte r11 = (byte) r11
            r12 = 2427(0x97b, float:3.401E-42)
            short r12 = (short) r12
            r14 = 15
            byte r8 = r8[r14]
            short r8 = (short) r8
            java.lang.String r8 = length(r11, r12, r8)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x020d
            r8 = 27
            if (r7 < r8) goto L_0x020d
            r8 = 28
            if (r7 > r8) goto L_0x020d
            r8 = 33
            goto L_0x01c4
        L_0x020d:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            int r11 = setMax
            r11 = r11 | 2336(0x920, float:3.273E-42)
            short r11 = (short) r11
            java.lang.String r8 = length(r8, r11, r13)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x023a
            r8 = 33
            if (r7 < r8) goto L_0x023a
            r11 = 35
            if (r7 > r11) goto L_0x023a
            r16 = 14
        L_0x022f:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r8 = r16
            goto L_0x0116
        L_0x023a:
            throw r0
        L_0x023b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0243
            throw r1
        L_0x0243:
            goto L_0x0245
        L_0x0244:
            throw r0
        L_0x0245:
            goto L_0x0244
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.length():o.setEncryptProxy");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03f1, code lost:
        if (r14 <= 118) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0159, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x023c, code lost:
        r1.length(14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21) {
        /*
            r17 = this;
            o.GyroscopeSensorService r7 = new o.GyroscopeSensorService
            r1 = r7
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r1.<init>(r2, r3, r4, r5, r6)
            byte[] r0 = setMin
            r1 = 33
            byte r0 = r0[r1]
            byte r0 = (byte) r0
            r1 = 1908(0x774, float:2.674E-42)
            short r1 = (short) r1
            r2 = 504(0x1f8, float:7.06E-43)
            short r2 = (short) r2
            java.lang.String r0 = length(r0, r1, r2)
            byte[] r1 = setMin
            r2 = 15
            byte r1 = r1[r2]
            byte r1 = (byte) r1
            r3 = r1 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r1 = length(r1, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x04aa }
            r5 = 0
            r4[r5] = r1     // Catch:{ all -> 0x04aa }
            byte[] r1 = setMin     // Catch:{ all -> 0x04aa }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r1 = r1[r6]     // Catch:{ all -> 0x04aa }
            byte r1 = (byte) r1     // Catch:{ all -> 0x04aa }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x04aa }
            int r9 = setMax     // Catch:{ all -> 0x04aa }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x04aa }
            java.lang.String r1 = length(r1, r8, r9)     // Catch:{ all -> 0x04aa }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x04aa }
            byte[] r9 = setMin     // Catch:{ all -> 0x04aa }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x04aa }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x04aa }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x04aa }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x04aa }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x04aa }
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ all -> 0x04aa }
            byte[] r11 = setMin     // Catch:{ all -> 0x04aa }
            byte r11 = r11[r6]     // Catch:{ all -> 0x04aa }
            byte r11 = (byte) r11     // Catch:{ all -> 0x04aa }
            int r12 = setMax     // Catch:{ all -> 0x04aa }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x04aa }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x04aa }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x04aa }
            r10[r5] = r11     // Catch:{ all -> 0x04aa }
            java.lang.reflect.Method r1 = r1.getMethod(r9, r10)     // Catch:{ all -> 0x04aa }
            java.lang.Object r0 = r1.invoke(r0, r4)     // Catch:{ all -> 0x04aa }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x04aa }
            int r1 = r0.length
            int[] r1 = new int[r1]
            r4 = 0
        L_0x0085:
            int r9 = r0.length
            if (r4 >= r9) goto L_0x0116
            r9 = r0[r4]
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x010d }
            r10[r5] = r9     // Catch:{ all -> 0x010d }
            byte[] r9 = setMin     // Catch:{ all -> 0x010d }
            byte r9 = r9[r6]     // Catch:{ all -> 0x010d }
            byte r9 = (byte) r9     // Catch:{ all -> 0x010d }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x010d }
            int r12 = setMax     // Catch:{ all -> 0x010d }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010d }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x010d }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010d }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x010d }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x010d }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x010d }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x010d }
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x010d }
            byte[] r14 = setMin     // Catch:{ all -> 0x010d }
            byte r14 = r14[r6]     // Catch:{ all -> 0x010d }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010d }
            int r15 = setMax     // Catch:{ all -> 0x010d }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x010d }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x010d }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x010d }
            r13[r5] = r14     // Catch:{ all -> 0x010d }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x010d }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x010d }
            byte[] r10 = setMin     // Catch:{ all -> 0x0104 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x0104 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0104 }
            int r13 = setMax     // Catch:{ all -> 0x0104 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x0104 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0104 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0104 }
            byte r11 = r11[r6]     // Catch:{ all -> 0x0104 }
            int r11 = r11 - r3
            byte r11 = (byte) r11     // Catch:{ all -> 0x0104 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0104 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0104 }
            r1[r4] = r9
            int r4 = r4 + 1
            goto L_0x0085
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0115
            throw r1
        L_0x0115:
            throw r0
        L_0x0116:
            r8 = 49
            r10 = 22
            r11 = 85
            r13 = 3
        L_0x011d:
            int r14 = r5 + 1
            r15 = 75
            r0 = r1[r5]     // Catch:{ all -> 0x0334 }
            int r0 = r7.length(r0)     // Catch:{ all -> 0x0334 }
            r5 = 14
            r12 = 21
            r4 = 2
            r9 = 5
            r2 = 4
            switch(r0) {
                case -41: goto L_0x0329;
                case -40: goto L_0x02ff;
                case -39: goto L_0x02f9;
                case -38: goto L_0x02e7;
                case -37: goto L_0x02d7;
                case -36: goto L_0x02c5;
                case -35: goto L_0x02c2;
                case -34: goto L_0x02bc;
                case -33: goto L_0x02af;
                case -32: goto L_0x02ab;
                case -31: goto L_0x029e;
                case -30: goto L_0x0290;
                case -29: goto L_0x028b;
                case -28: goto L_0x0285;
                case -27: goto L_0x026e;
                case -26: goto L_0x0268;
                case -25: goto L_0x0264;
                case -24: goto L_0x025e;
                case -23: goto L_0x024f;
                case -22: goto L_0x0241;
                case -21: goto L_0x0238;
                case -20: goto L_0x0221;
                case -19: goto L_0x021b;
                case -18: goto L_0x0215;
                case -17: goto L_0x020f;
                case -16: goto L_0x01f9;
                case -15: goto L_0x01f3;
                case -14: goto L_0x01e1;
                case -13: goto L_0x01db;
                case -12: goto L_0x01d7;
                case -11: goto L_0x01d2;
                case -10: goto L_0x01a9;
                case -9: goto L_0x01a5;
                case -8: goto L_0x01a0;
                case -7: goto L_0x0196;
                case -6: goto L_0x0191;
                case -5: goto L_0x016d;
                case -4: goto L_0x015e;
                case -3: goto L_0x0138;
                case -2: goto L_0x0137;
                case -1: goto L_0x0133;
                default: goto L_0x0131;
            }     // Catch:{ all -> 0x0334 }
        L_0x0131:
            goto L_0x032f
        L_0x0133:
            r5 = 11
            goto L_0x0330
        L_0x0137:
            return
        L_0x0138:
            o.sendSensorResult$toIntRange r0 = new o.sendSensorResult$toIntRange     // Catch:{ all -> 0x0334 }
            r7.setMin = r13     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r4 = r7.equals     // Catch:{ all -> 0x0334 }
            o.sendSensorResult r4 = (o.sendSensorResult) r4     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r2 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0334 }
            r0.<init>(r4, r5, r2)     // Catch:{ all -> 0x0334 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
        L_0x0159:
            r7.length(r9)     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x015e:
            r7.setMin = r3     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch:{ all -> 0x0334 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x016d:
            r7.setMin = r2     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            o.APWebChromeClient r0 = (o.APWebChromeClient) r0     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r4 = r7.equals     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x0334 }
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r2 = r7.equals     // Catch:{ all -> 0x0334 }
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch:{ all -> 0x0334 }
            r0.execute(r4, r5, r2)     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x0191:
            r2 = 15
            r5 = 85
            goto L_0x011d
        L_0x0196:
            r0 = 8
            r7.length(r0)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0334 }
            throw r0     // Catch:{ all -> 0x0334 }
        L_0x01a0:
            r2 = 15
            r5 = 1
            goto L_0x011d
        L_0x01a5:
            r5 = 51
            goto L_0x0330
        L_0x01a9:
            o.sendSensorResult$getMin r0 = new o.sendSensorResult$getMin     // Catch:{ all -> 0x0334 }
            r7.setMin = r2     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r4 = r7.equals     // Catch:{ all -> 0x0334 }
            o.sendSensorResult r4 = (o.sendSensorResult) r4     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r12 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r2 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0334 }
            r0.<init>(r4, r5, r12, r2)     // Catch:{ all -> 0x0334 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x01d2:
            r2 = 15
            r5 = 3
            goto L_0x011d
        L_0x01d7:
            r5 = 37
            goto L_0x0330
        L_0x01db:
            r2 = 15
            r5 = 24
            goto L_0x011d
        L_0x01e1:
            r7.length(r3)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x01ef
            if (r0 == r3) goto L_0x01eb
            goto L_0x01ef
        L_0x01eb:
            r5 = 75
            goto L_0x0330
        L_0x01ef:
            r5 = 145(0x91, float:2.03E-43)
            goto L_0x0330
        L_0x01f3:
            java.lang.String r0 = "phoneNumber"
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x01f9:
            r7.setMin = r4     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r2 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0334 }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x020f:
            java.lang.String r0 = "clientId"
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x0215:
            java.lang.String r0 = "merchantId"
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x021b:
            r2 = 15
            r5 = 117(0x75, float:1.64E-43)
            goto L_0x011d
        L_0x0221:
            r7.length(r3)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            r2 = 44
            if (r0 == r2) goto L_0x0232
            r2 = 66
            r0 = 38
            r5 = 38
            goto L_0x0330
        L_0x0232:
            r0 = 28
            r5 = 28
            goto L_0x0330
        L_0x0238:
            int r0 = b     // Catch:{ all -> 0x0334 }
            r7.setMin = r0     // Catch:{ all -> 0x0334 }
        L_0x023c:
            r7.length(r5)     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x0241:
            r7.setMin = r3     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r12)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x024f:
            r0 = 48
            r7.length(r0)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x032f
            r0 = 74
            r5 = 74
            goto L_0x0330
        L_0x025e:
            r2 = 15
            r5 = 49
            goto L_0x011d
        L_0x0264:
            r5 = 20
            goto L_0x0330
        L_0x0268:
            java.lang.String r0 = "merchantName"
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x026e:
            r7.setMin = r4     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r2 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0334 }
            r0.getMin = r2     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x0285:
            r2 = 15
            r5 = 152(0x98, float:2.13E-43)
            goto L_0x011d
        L_0x028b:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0334 }
            r7.setMin = r0     // Catch:{ all -> 0x0334 }
            goto L_0x023c
        L_0x0290:
            r7.setMin = r3     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r12)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            b = r0     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x029e:
            r7.length(r10)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x032f
            r0 = 116(0x74, float:1.63E-43)
            r5 = 116(0x74, float:1.63E-43)
            goto L_0x0330
        L_0x02ab:
            r5 = 10
            goto L_0x0330
        L_0x02af:
            r7.length(r10)     // Catch:{ all -> 0x0334 }
            int r0 = r7.setMax     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x032f
            r0 = 143(0x8f, float:2.0E-43)
            r5 = 143(0x8f, float:2.0E-43)
            goto L_0x0330
        L_0x02bc:
            r2 = 15
            r5 = 22
            goto L_0x011d
        L_0x02c2:
            r5 = 25
            goto L_0x0330
        L_0x02c5:
            r7.setMin = r3     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0334 }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x0334 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x02d7:
            r7.setMin = r3     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x0334 }
            r0.showProgress()     // Catch:{ all -> 0x0334 }
            goto L_0x032f
        L_0x02e7:
            r7.setMin = r3     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x0334 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0334 }
            o.fromScanData r0 = r0.toDoubleRange     // Catch:{ all -> 0x0334 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x02f9:
            java.lang.String r0 = ""
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x02ff:
            o.fromScanData$getMax r0 = new o.fromScanData$getMax     // Catch:{ all -> 0x0334 }
            r7.setMin = r2     // Catch:{ all -> 0x0334 }
            r7.length(r13)     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r4 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r12 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0334 }
            r7.length(r2)     // Catch:{ all -> 0x0334 }
            java.lang.Object r2 = r7.equals     // Catch:{ all -> 0x0334 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0334 }
            r0.<init>(r4, r5, r12, r2)     // Catch:{ all -> 0x0334 }
            r7.toIntRange = r0     // Catch:{ all -> 0x0334 }
            goto L_0x0159
        L_0x0329:
            r2 = 15
            r5 = 15
            goto L_0x011d
        L_0x032f:
            r5 = r14
        L_0x0330:
            r2 = 15
            goto L_0x011d
        L_0x0334:
            r0 = move-exception
            r2 = 46
            if (r14 < r2) goto L_0x0345
            if (r14 > r8) goto L_0x0345
            r2 = 144(0x90, float:2.02E-43)
            r2 = 152(0x98, float:2.13E-43)
            r5 = 144(0x90, float:2.02E-43)
        L_0x0341:
            r16 = 15
            goto L_0x049d
        L_0x0345:
            r2 = 81
            if (r14 < r2) goto L_0x0352
            if (r14 > r11) goto L_0x0352
            r2 = 162(0xa2, float:2.27E-43)
            r2 = 152(0x98, float:2.13E-43)
            r5 = 162(0xa2, float:2.27E-43)
            goto L_0x0341
        L_0x0352:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            r9 = 2428(0x97c, float:3.402E-42)
            short r9 = (short) r9
            r12 = r9 & 208(0xd0, float:2.91E-43)
            short r12 = (short) r12
            java.lang.String r2 = length(r2, r9, r12)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0374
            if (r14 < r15) goto L_0x0374
            if (r14 > r11) goto L_0x0374
        L_0x036f:
            r2 = 152(0x98, float:2.13E-43)
            r5 = 9
            goto L_0x0341
        L_0x0374:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            r15 = 2424(0x978, float:3.397E-42)
            short r15 = (short) r15
            r3 = 14181(0x3765, float:1.9872E-41)
            short r3 = (short) r3
            java.lang.String r2 = length(r2, r15, r3)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x039a
            r2 = 77
            if (r14 < r2) goto L_0x039a
            r2 = 78
            if (r14 > r2) goto L_0x039a
        L_0x0395:
            r2 = 152(0x98, float:2.13E-43)
            r5 = 27
            goto L_0x0341
        L_0x039a:
            byte[] r2 = setMin
            byte r4 = r2[r6]
            byte r4 = (byte) r4
            r5 = 2427(0x97b, float:3.401E-42)
            short r5 = (short) r5
            r16 = 15
            byte r2 = r2[r16]
            short r2 = (short) r2
            java.lang.String r2 = length(r4, r5, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x03bc
            if (r14 < r11) goto L_0x03bc
            r2 = 117(0x75, float:1.64E-43)
            if (r14 > r2) goto L_0x03bc
            goto L_0x0395
        L_0x03bc:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            java.lang.String r2 = length(r2, r15, r3)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x03d8
            r2 = 111(0x6f, float:1.56E-43)
            if (r14 < r2) goto L_0x03d8
            r2 = 112(0x70, float:1.57E-43)
            if (r14 > r2) goto L_0x03d8
            goto L_0x036f
        L_0x03d8:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            java.lang.String r2 = length(r2, r9, r12)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x03f5
            r2 = 117(0x75, float:1.64E-43)
            if (r14 < r2) goto L_0x03f7
            r4 = 118(0x76, float:1.65E-43)
            if (r14 > r4) goto L_0x03f7
            goto L_0x036f
        L_0x03f5:
            r2 = 117(0x75, float:1.64E-43)
        L_0x03f7:
            byte[] r4 = setMin
            byte r2 = r4[r6]
            byte r2 = (byte) r2
            r16 = 15
            byte r4 = r4[r16]
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r5, r4)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x041d
            r2 = 138(0x8a, float:1.93E-43)
            if (r14 < r2) goto L_0x041d
            r2 = 139(0x8b, float:1.95E-43)
            if (r14 > r2) goto L_0x041d
        L_0x0417:
            r2 = 152(0x98, float:2.13E-43)
        L_0x0419:
            r5 = 27
            goto L_0x049d
        L_0x041d:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            java.lang.String r2 = length(r2, r9, r12)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0439
            r2 = 145(0x91, float:2.03E-43)
            if (r14 < r2) goto L_0x0439
            r2 = 146(0x92, float:2.05E-43)
            if (r14 > r2) goto L_0x0439
            goto L_0x0417
        L_0x0439:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            int r4 = setMax
            r4 = r4 | 2336(0x920, float:3.273E-42)
            short r4 = (short) r4
            r5 = 8656(0x21d0, float:1.213E-41)
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r4, r5)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x045d
            r2 = 147(0x93, float:2.06E-43)
            if (r14 < r2) goto L_0x045d
            r2 = 152(0x98, float:2.13E-43)
            if (r14 > r2) goto L_0x045d
            goto L_0x0419
        L_0x045d:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            java.lang.String r2 = length(r2, r15, r3)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x047b
            r2 = 148(0x94, float:2.07E-43)
            if (r14 < r2) goto L_0x047b
            r2 = 152(0x98, float:2.13E-43)
            if (r14 > r2) goto L_0x047b
        L_0x0478:
            r5 = 9
            goto L_0x049d
        L_0x047b:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            r3 = r2 | 2368(0x940, float:3.318E-42)
            short r3 = (short) r3
            r4 = 11228(0x2bdc, float:1.5734E-41)
            short r4 = (short) r4
            java.lang.String r2 = length(r2, r3, r4)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x04a9
            r2 = 150(0x96, float:2.1E-43)
            if (r14 < r2) goto L_0x04a9
            r2 = 152(0x98, float:2.13E-43)
            if (r14 > r2) goto L_0x04a9
            goto L_0x0478
        L_0x049d:
            r7.toIntRange = r0
            r3 = 24
            r7.length(r3)
            r2 = 15
            r3 = 1
            goto L_0x011d
        L_0x04a9:
            throw r0
        L_0x04aa:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x04b2
            throw r1
        L_0x04b2:
            goto L_0x04b4
        L_0x04b3:
            throw r0
        L_0x04b4:
            goto L_0x04b3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.length(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0293, code lost:
        if (r10 <= 33) goto L_0x0252;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(boolean r18) {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r0 = r18
            r1.<init>((java.lang.Object) r2, (int) r0)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = r0 | 2266(0x8da, float:3.175E-42)
            short r4 = (short) r4
            r5 = 13892(0x3644, float:1.9467E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0341 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0341 }
            byte[] r4 = setMin     // Catch:{ all -> 0x0341 }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x0341 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0341 }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0341 }
            int r11 = setMax     // Catch:{ all -> 0x0341 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0341 }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x0341 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0341 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0341 }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x0341 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0341 }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0341 }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0341 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0341 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x0341 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0341 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0341 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0341 }
            int r14 = setMax     // Catch:{ all -> 0x0341 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0341 }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x0341 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0341 }
            r12[r8] = r13     // Catch:{ all -> 0x0341 }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x0341 }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x0341 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0341 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x007e:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0114
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x010b }
            r12[r8] = r11     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x010b }
            byte r11 = r11[r9]     // Catch:{ all -> 0x010b }
            byte r11 = (byte) r11     // Catch:{ all -> 0x010b }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            int r14 = setMax     // Catch:{ all -> 0x010b }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x010b }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x010b }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x010b }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x010b }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            r5 = 13879(0x3637, float:1.9449E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x010b }
            java.lang.String r5 = length(r14, r15, r5)     // Catch:{ all -> 0x010b }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x010b }
            byte[] r15 = setMin     // Catch:{ all -> 0x010b }
            byte r15 = r15[r9]     // Catch:{ all -> 0x010b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010b }
            int r3 = setMax     // Catch:{ all -> 0x010b }
            r3 = r3 | 11522(0x2d02, float:1.6146E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x010b }
            java.lang.String r3 = length(r15, r10, r3)     // Catch:{ all -> 0x010b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x010b }
            r14[r8] = r3     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r3 = r11.getMethod(r5, r14)     // Catch:{ all -> 0x010b }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x0102 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0102 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0102 }
            int r12 = setMax     // Catch:{ all -> 0x0102 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0102 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0102 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0102 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0102 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0102 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0102 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0102 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0102 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x007e
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010a
            throw r1
        L_0x010a:
            throw r0
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r3 = 34
            r5 = 9
            r7 = 43
            r0 = 0
        L_0x011b:
            int r10 = r0 + 1
            r11 = 2
            r12 = 5
            r13 = 4
            r0 = r4[r0]     // Catch:{ all -> 0x020b }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x020b }
            r14 = 21
            r15 = 48
            r8 = 3
            switch(r0) {
                case -21: goto L_0x0204;
                case -20: goto L_0x01fa;
                case -19: goto L_0x01f7;
                case -18: goto L_0x01ed;
                case -17: goto L_0x01eb;
                case -16: goto L_0x01cc;
                case -15: goto L_0x01c6;
                case -14: goto L_0x01b4;
                case -13: goto L_0x01b1;
                case -12: goto L_0x018e;
                case -11: goto L_0x018a;
                case -10: goto L_0x0187;
                case -9: goto L_0x017c;
                case -8: goto L_0x016e;
                case -7: goto L_0x0163;
                case -6: goto L_0x0162;
                case -5: goto L_0x015f;
                case -4: goto L_0x015b;
                case -3: goto L_0x0147;
                case -2: goto L_0x0134;
                case -1: goto L_0x0130;
                default: goto L_0x012e;
            }     // Catch:{ all -> 0x020b }
        L_0x012e:
            goto L_0x0207
        L_0x0130:
            r0 = 54
            goto L_0x0208
        L_0x0134:
            r1.setMin = r6     // Catch:{ all -> 0x020b }
            r1.length(r8)     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x020b }
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch:{ all -> 0x020b }
            r1.toIntRange = r0     // Catch:{ all -> 0x020b }
        L_0x0142:
            r1.length(r12)     // Catch:{ all -> 0x020b }
            goto L_0x0207
        L_0x0147:
            o.sendSensorResult$setMin r0 = new o.sendSensorResult$setMin     // Catch:{ all -> 0x020b }
            r1.setMin = r6     // Catch:{ all -> 0x020b }
            r1.length(r8)     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x020b }
            o.sendSensorResult r8 = (o.sendSensorResult) r8     // Catch:{ all -> 0x020b }
            r0.<init>(r8)     // Catch:{ all -> 0x020b }
            r1.toIntRange = r0     // Catch:{ all -> 0x020b }
            goto L_0x0142
        L_0x015b:
            r0 = 43
            goto L_0x0208
        L_0x015f:
            r0 = 7
            goto L_0x0208
        L_0x0162:
            return
        L_0x0163:
            int r0 = b     // Catch:{ all -> 0x020b }
            r1.setMin = r0     // Catch:{ all -> 0x020b }
            r0 = 14
            r1.length(r0)     // Catch:{ all -> 0x020b }
            goto L_0x0207
        L_0x016e:
            r1.setMin = r6     // Catch:{ all -> 0x020b }
            r1.length(r8)     // Catch:{ all -> 0x020b }
            r1.length(r14)     // Catch:{ all -> 0x020b }
            int r0 = r1.setMax     // Catch:{ all -> 0x020b }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x020b }
            goto L_0x0207
        L_0x017c:
            r1.length(r15)     // Catch:{ all -> 0x020b }
            int r0 = r1.setMax     // Catch:{ all -> 0x020b }
            if (r0 != 0) goto L_0x0207
            r0 = 32
            goto L_0x0208
        L_0x0187:
            r0 = 6
            goto L_0x0208
        L_0x018a:
            r0 = 34
            goto L_0x0208
        L_0x018e:
            r1.setMin = r13     // Catch:{ all -> 0x020b }
            r1.length(r8)     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x020b }
            o.APWebChromeClient r0 = (o.APWebChromeClient) r0     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r14 = r1.equals     // Catch:{ all -> 0x020b }
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r15 = r1.equals     // Catch:{ all -> 0x020b }
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15     // Catch:{ all -> 0x020b }
            r0.execute(r8, r14, r15)     // Catch:{ all -> 0x020b }
            goto L_0x0207
        L_0x01b1:
            r0 = 9
            goto L_0x0208
        L_0x01b4:
            r1.setMin = r6     // Catch:{ all -> 0x020b }
            r1.length(r8)     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x020b }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x020b }
            o.setPageCacheCapacity r0 = r0.toString     // Catch:{ all -> 0x020b }
            r1.toIntRange = r0     // Catch:{ all -> 0x020b }
            goto L_0x0142
        L_0x01c6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x020b }
            r1.toIntRange = r0     // Catch:{ all -> 0x020b }
            goto L_0x0142
        L_0x01cc:
            o.sendSensorResult$length r0 = new o.sendSensorResult$length     // Catch:{ all -> 0x020b }
            r1.setMin = r11     // Catch:{ all -> 0x020b }
            r1.length(r8)     // Catch:{ all -> 0x020b }
            r1.length(r13)     // Catch:{ all -> 0x020b }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x020b }
            o.sendSensorResult r8 = (o.sendSensorResult) r8     // Catch:{ all -> 0x020b }
            r1.length(r14)     // Catch:{ all -> 0x020b }
            int r14 = r1.setMax     // Catch:{ all -> 0x020b }
            if (r14 == 0) goto L_0x01e3
            r14 = 1
            goto L_0x01e4
        L_0x01e3:
            r14 = 0
        L_0x01e4:
            r0.<init>(r8, r14)     // Catch:{ all -> 0x020b }
            r1.toIntRange = r0     // Catch:{ all -> 0x020b }
            goto L_0x0142
        L_0x01eb:
            r0 = 1
            goto L_0x0208
        L_0x01ed:
            r1.length(r15)     // Catch:{ all -> 0x020b }
            int r0 = r1.setMax     // Catch:{ all -> 0x020b }
            if (r0 != 0) goto L_0x0207
            r0 = 51
            goto L_0x0208
        L_0x01f7:
            r0 = 33
            goto L_0x0208
        L_0x01fa:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x020b }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x020b }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x020b }
            throw r0     // Catch:{ all -> 0x020b }
        L_0x0204:
            r0 = 36
            goto L_0x0208
        L_0x0207:
            r0 = r10
        L_0x0208:
            r8 = 0
            goto L_0x011b
        L_0x020b:
            r0 = move-exception
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r14 = 2432(0x980, float:3.408E-42)
            short r14 = (short) r14
            r15 = 14148(0x3744, float:1.9826E-41)
            short r15 = (short) r15
            java.lang.String r8 = length(r8, r14, r15)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            r14 = 53
            r15 = 52
            if (r8 == 0) goto L_0x0233
            if (r10 < r6) goto L_0x0233
            if (r10 > r11) goto L_0x0233
            r8 = 33
        L_0x022f:
            r12 = 15
            goto L_0x0333
        L_0x0233:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r11 = 2439(0x987, float:3.418E-42)
            short r11 = (short) r11
            r6 = 7187(0x1c13, float:1.0071E-41)
            short r6 = (short) r6
            java.lang.String r8 = length(r8, r11, r6)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0258
            if (r10 < r13) goto L_0x0258
            if (r10 > r12) goto L_0x0258
            r8 = 33
        L_0x0252:
            r12 = 15
        L_0x0254:
            r15 = 53
            goto L_0x0333
        L_0x0258:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            java.lang.String r8 = length(r8, r11, r6)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0272
            if (r10 < r5) goto L_0x0272
            r8 = 33
            if (r10 > r8) goto L_0x0272
        L_0x0271:
            goto L_0x022f
        L_0x0272:
            byte[] r8 = setMin
            byte r12 = r8[r9]
            byte r12 = (byte) r12
            r13 = 2423(0x977, float:3.395E-42)
            short r13 = (short) r13
            r16 = 13891(0x3643, float:1.9465E-41)
            byte r8 = r8[r16]
            short r8 = (short) r8
            java.lang.String r8 = length(r12, r13, r8)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0296
            r8 = 27
            if (r10 < r8) goto L_0x0296
            r8 = 33
            if (r10 > r8) goto L_0x0298
        L_0x0295:
            goto L_0x0252
        L_0x0296:
            r8 = 33
        L_0x0298:
            byte[] r12 = setMin
            byte r12 = r12[r9]
            byte r12 = (byte) r12
            java.lang.String r6 = length(r12, r11, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02b2
            if (r10 < r3) goto L_0x02b2
            r6 = 35
            if (r10 > r6) goto L_0x02b2
            goto L_0x0271
        L_0x02b2:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            r11 = 2428(0x97c, float:3.402E-42)
            short r11 = (short) r11
            r12 = r11 & 208(0xd0, float:2.91E-43)
            short r12 = (short) r12
            java.lang.String r6 = length(r6, r11, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x02d2
            r6 = 37
            if (r10 < r6) goto L_0x02d2
            if (r10 > r7) goto L_0x02d2
            goto L_0x0295
        L_0x02d2:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            r13 = 2419(0x973, float:3.39E-42)
            short r13 = (short) r13
            r3 = 13371(0x343b, float:1.8737E-41)
            short r3 = (short) r3
            java.lang.String r3 = length(r6, r13, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02f5
            r3 = 38
            if (r10 < r3) goto L_0x02f5
            r3 = 39
            if (r10 > r3) goto L_0x02f5
            goto L_0x0271
        L_0x02f5:
            byte[] r3 = setMin
            byte r3 = r3[r9]
            byte r3 = (byte) r3
            java.lang.String r3 = length(r3, r11, r12)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0310
            if (r10 < r7) goto L_0x0310
            r3 = 44
            if (r10 > r3) goto L_0x0310
            goto L_0x0271
        L_0x0310:
            byte[] r3 = setMin
            byte r6 = r3[r9]
            byte r6 = (byte) r6
            r11 = 2427(0x97b, float:3.401E-42)
            short r11 = (short) r11
            r12 = 15
            byte r3 = r3[r12]
            short r3 = (short) r3
            java.lang.String r3 = length(r6, r11, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0340
            r3 = 47
            if (r10 < r3) goto L_0x0340
            if (r10 > r15) goto L_0x0340
            goto L_0x0254
        L_0x0333:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r0 = r15
            r3 = 34
            r6 = 1
            goto L_0x0208
        L_0x0340:
            throw r0
        L_0x0341:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0349
            throw r1
        L_0x0349:
            goto L_0x034b
        L_0x034a:
            throw r0
        L_0x034b:
            goto L_0x034a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.length(boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x034f, code lost:
        if (r14 <= 77) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0402, code lost:
        if (r14 <= 132) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015c, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ec, code lost:
        r1.length(14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r19 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r19
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 1864(0x748, float:2.612E-42)
            short r3 = (short) r3
            r4 = 1573(0x625, float:2.204E-42)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r4 = r3 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r3 = length(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0434 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0434 }
            byte[] r3 = setMin     // Catch:{ all -> 0x0434 }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r7]     // Catch:{ all -> 0x0434 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0434 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0434 }
            int r9 = setMax     // Catch:{ all -> 0x0434 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x0434 }
            java.lang.String r3 = length(r3, r8, r9)     // Catch:{ all -> 0x0434 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0434 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0434 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x0434 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0434 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0434 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0434 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x0434 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0434 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0434 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0434 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0434 }
            int r12 = setMax     // Catch:{ all -> 0x0434 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0434 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x0434 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0434 }
            r10[r6] = r11     // Catch:{ all -> 0x0434 }
            java.lang.reflect.Method r3 = r3.getMethod(r9, r10)     // Catch:{ all -> 0x0434 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x0434 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0434 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007c:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010d
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0104 }
            r10[r6] = r9     // Catch:{ all -> 0x0104 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0104 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0104 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0104 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0104 }
            int r12 = setMax     // Catch:{ all -> 0x0104 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0104 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0104 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0104 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0104 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0104 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0104 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0104 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0104 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0104 }
            int r15 = setMax     // Catch:{ all -> 0x0104 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0104 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0104 }
            r13[r6] = r14     // Catch:{ all -> 0x0104 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0104 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0104 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fb }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fb }
            int r13 = setMax     // Catch:{ all -> 0x00fb }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fb }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fb }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fb }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fb }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fb }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fb }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fb }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fb }
            r3[r5] = r9
            int r5 = r5 + 1
            goto L_0x007c
        L_0x00fb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0103
            throw r1
        L_0x0103:
            throw r0
        L_0x0104:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010c
            throw r1
        L_0x010c:
            throw r0
        L_0x010d:
            r10 = 27
            r11 = 42
            r12 = 48
            r13 = 3
        L_0x0114:
            int r14 = r6 + 1
            r5 = 19
            r15 = 14
            r0 = r3[r6]     // Catch:{ all -> 0x02c5 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x02c5 }
            r6 = 21
            r8 = 5
            r9 = 4
            switch(r0) {
                case -42: goto L_0x02be;
                case -41: goto L_0x02b1;
                case -40: goto L_0x02ad;
                case -39: goto L_0x02a9;
                case -38: goto L_0x029c;
                case -37: goto L_0x029b;
                case -36: goto L_0x0297;
                case -35: goto L_0x0293;
                case -34: goto L_0x0286;
                case -33: goto L_0x0283;
                case -32: goto L_0x0271;
                case -31: goto L_0x026d;
                case -30: goto L_0x025b;
                case -29: goto L_0x0257;
                case -28: goto L_0x0246;
                case -27: goto L_0x0242;
                case -26: goto L_0x023e;
                case -25: goto L_0x023a;
                case -24: goto L_0x022d;
                case -23: goto L_0x021f;
                case -22: goto L_0x021a;
                case -21: goto L_0x0216;
                case -20: goto L_0x0212;
                case -19: goto L_0x020e;
                case -18: goto L_0x01ff;
                case -17: goto L_0x01f1;
                case -16: goto L_0x01e8;
                case -15: goto L_0x01e4;
                case -14: goto L_0x01d2;
                case -13: goto L_0x01c1;
                case -12: goto L_0x01bd;
                case -11: goto L_0x01ac;
                case -10: goto L_0x019b;
                case -9: goto L_0x0198;
                case -8: goto L_0x0194;
                case -7: goto L_0x0183;
                case -6: goto L_0x0172;
                case -5: goto L_0x0161;
                case -4: goto L_0x014c;
                case -3: goto L_0x0136;
                case -2: goto L_0x012c;
                case -1: goto L_0x0129;
                default: goto L_0x0127;
            }     // Catch:{ all -> 0x02c5 }
        L_0x0127:
            goto L_0x02c2
        L_0x0129:
            r6 = 44
            goto L_0x0114
        L_0x012c:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x02c5 }
            throw r0     // Catch:{ all -> 0x02c5 }
        L_0x0136:
            r1.length(r4)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            r6 = 43
            if (r0 == r6) goto L_0x0149
            r6 = 97
            if (r0 == r6) goto L_0x0144
            goto L_0x0149
        L_0x0144:
            r0 = 78
            r6 = 78
            goto L_0x0114
        L_0x0149:
            r6 = 19
            goto L_0x0114
        L_0x014c:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.setPageCacheCapacity r0 = r0.toString     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
        L_0x015c:
            r1.length(r8)     // Catch:{ all -> 0x02c5 }
            goto L_0x02c2
        L_0x0161:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.APWebChromeClient r0 = (o.APWebChromeClient) r0     // Catch:{ all -> 0x02c5 }
            r0.dispose()     // Catch:{ all -> 0x02c5 }
            goto L_0x02c2
        L_0x0172:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.APDownloadListener r0 = r0.valueOf     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x0183:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.parseFailed r0 = (o.parseFailed) r0     // Catch:{ all -> 0x02c5 }
            r0.dispose()     // Catch:{ all -> 0x02c5 }
            goto L_0x02c2
        L_0x0194:
            r6 = 96
            goto L_0x0114
        L_0x0198:
            r6 = 2
            goto L_0x0114
        L_0x019b:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.onPageError r0 = r0.invokeSuspend     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x01ac:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.calculateDistance r0 = r0.Mean$Arithmetic     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x01bd:
            r6 = 131(0x83, float:1.84E-43)
            goto L_0x0114
        L_0x01c1:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.APHitTestResult r0 = r0.Grayscale$Algorithm     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x01d2:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.AccelerometerForH5SensorService r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x01e4:
            r6 = 48
            goto L_0x0114
        L_0x01e8:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x02c5 }
            r1.setMin = r0     // Catch:{ all -> 0x02c5 }
        L_0x01ec:
            r1.length(r15)     // Catch:{ all -> 0x02c5 }
            goto L_0x02c2
        L_0x01f1:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r6)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            b = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x02c2
        L_0x01ff:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            if (r0 != 0) goto L_0x02c2
            r0 = 41
            r6 = 41
            goto L_0x0114
        L_0x020e:
            r6 = 177(0xb1, float:2.48E-43)
            goto L_0x0114
        L_0x0212:
            r6 = 129(0x81, float:1.81E-43)
            goto L_0x0114
        L_0x0216:
            r6 = 157(0x9d, float:2.2E-43)
            goto L_0x0114
        L_0x021a:
            int r0 = b     // Catch:{ all -> 0x02c5 }
            r1.setMin = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x01ec
        L_0x021f:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r6)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x02c2
        L_0x022d:
            r1.length(r12)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            if (r0 != 0) goto L_0x02c2
            r0 = 76
            r6 = 76
            goto L_0x0114
        L_0x023a:
            r6 = 155(0x9b, float:2.17E-43)
            goto L_0x0114
        L_0x023e:
            r6 = 87
            goto L_0x0114
        L_0x0242:
            r6 = 13
            goto L_0x0114
        L_0x0246:
            r1.length(r4)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            if (r0 == 0) goto L_0x0251
            r6 = 120(0x78, float:1.68E-43)
            goto L_0x0114
        L_0x0251:
            r0 = 90
            r6 = 90
            goto L_0x0114
        L_0x0257:
            r6 = 84
            goto L_0x0114
        L_0x025b:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.AccelerometerForH5SensorService r0 = (o.AccelerometerForH5SensorService) r0     // Catch:{ all -> 0x02c5 }
            o.setDomStorageEnabled r0 = r0.IsOverlapping     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x026d:
            r6 = 27
            goto L_0x0114
        L_0x0271:
            r1.setMin = r4     // Catch:{ all -> 0x02c5 }
            r1.length(r13)     // Catch:{ all -> 0x02c5 }
            r1.length(r9)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x02c5 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x02c5 }
            o.fromScanData r0 = r0.toDoubleRange     // Catch:{ all -> 0x02c5 }
            r1.toIntRange = r0     // Catch:{ all -> 0x02c5 }
            goto L_0x015c
        L_0x0283:
            r6 = 3
            goto L_0x0114
        L_0x0286:
            r1.length(r12)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            if (r0 != 0) goto L_0x02c2
            r0 = 119(0x77, float:1.67E-43)
            r6 = 119(0x77, float:1.67E-43)
            goto L_0x0114
        L_0x0293:
            r6 = 42
            goto L_0x0114
        L_0x0297:
            r6 = 9
            goto L_0x0114
        L_0x029b:
            return
        L_0x029c:
            r1.length(r12)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            if (r0 != 0) goto L_0x02c2
            r0 = 152(0x98, float:2.13E-43)
            r6 = 152(0x98, float:2.13E-43)
            goto L_0x0114
        L_0x02a9:
            r6 = 153(0x99, float:2.14E-43)
            goto L_0x0114
        L_0x02ad:
            r6 = 85
            goto L_0x0114
        L_0x02b1:
            r1.length(r12)     // Catch:{ all -> 0x02c5 }
            int r0 = r1.setMax     // Catch:{ all -> 0x02c5 }
            if (r0 != 0) goto L_0x02c2
            r0 = 176(0xb0, float:2.47E-43)
            r6 = 176(0xb0, float:2.47E-43)
            goto L_0x0114
        L_0x02be:
            r6 = 77
            goto L_0x0114
        L_0x02c2:
            r6 = r14
            goto L_0x0114
        L_0x02c5:
            r0 = move-exception
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r8 = 2427(0x97b, float:3.401E-42)
            short r8 = (short) r8
            r9 = 14097(0x3711, float:1.9754E-41)
            short r9 = (short) r9
            java.lang.String r6 = length(r6, r8, r9)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r4 = 24
            r16 = 12
            r17 = 156(0x9c, float:2.19E-43)
            if (r6 == 0) goto L_0x02ef
            if (r14 < r15) goto L_0x02ef
            if (r14 > r5) goto L_0x02ef
        L_0x02e9:
            r5 = 131(0x83, float:1.84E-43)
        L_0x02eb:
            r6 = 156(0x9c, float:2.19E-43)
            goto L_0x042b
        L_0x02ef:
            if (r14 < r4) goto L_0x02fb
            if (r14 > r10) goto L_0x02fb
            r5 = 11
            r5 = 131(0x83, float:1.84E-43)
            r6 = 11
            goto L_0x042b
        L_0x02fb:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r8, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0313
            if (r14 < r10) goto L_0x0313
            if (r14 > r11) goto L_0x0313
            goto L_0x02e9
        L_0x0313:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r6 = 2424(0x978, float:3.397E-42)
            short r6 = (short) r6
            r15 = 14181(0x3765, float:1.9872E-41)
            short r15 = (short) r15
            java.lang.String r5 = length(r5, r6, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0338
            r5 = 37
            if (r14 < r5) goto L_0x0338
            if (r14 > r11) goto L_0x0338
        L_0x0332:
            r5 = 131(0x83, float:1.84E-43)
        L_0x0334:
            r6 = 12
            goto L_0x042b
        L_0x0338:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r8, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0352
            if (r14 < r12) goto L_0x0352
            r5 = 77
            if (r14 > r5) goto L_0x0354
        L_0x0351:
            goto L_0x0332
        L_0x0352:
            r5 = 77
        L_0x0354:
            byte[] r8 = setMin
            byte r8 = r8[r7]
            byte r8 = (byte) r8
            r9 = 2432(0x980, float:3.408E-42)
            short r9 = (short) r9
            r5 = 14148(0x3744, float:1.9826E-41)
            short r5 = (short) r5
            java.lang.String r5 = length(r8, r9, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0376
            r5 = 72
            if (r14 < r5) goto L_0x0376
            r5 = 73
            if (r14 > r5) goto L_0x0376
            goto L_0x0351
        L_0x0376:
            r5 = 125(0x7d, float:1.75E-43)
            if (r14 < r5) goto L_0x0383
            r5 = 129(0x81, float:1.81E-43)
            if (r14 > r5) goto L_0x0385
            r5 = 131(0x83, float:1.84E-43)
            r6 = 1
            goto L_0x042b
        L_0x0383:
            r5 = 129(0x81, float:1.81E-43)
        L_0x0385:
            byte[] r8 = setMin
            byte r9 = r8[r7]
            byte r9 = (byte) r9
            r5 = 2423(0x977, float:3.395E-42)
            short r5 = (short) r5
            r18 = 13891(0x3643, float:1.9465E-41)
            byte r8 = r8[r18]
            short r8 = (short) r8
            java.lang.String r5 = length(r9, r5, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03a9
            r5 = 120(0x78, float:1.68E-43)
            if (r14 < r5) goto L_0x03a9
            r5 = 121(0x79, float:1.7E-43)
            if (r14 > r5) goto L_0x03a9
            goto L_0x0332
        L_0x03a9:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r6, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03c6
            r5 = 122(0x7a, float:1.71E-43)
            if (r14 < r5) goto L_0x03c6
            r5 = 123(0x7b, float:1.72E-43)
            if (r14 > r5) goto L_0x03c6
            goto L_0x02e9
        L_0x03c6:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r6, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03e3
            r5 = 123(0x7b, float:1.72E-43)
            if (r14 < r5) goto L_0x03e3
            r5 = 124(0x7c, float:1.74E-43)
            if (r14 > r5) goto L_0x03e3
            goto L_0x02e9
        L_0x03e3:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r6 = r5 | 2368(0x940, float:3.318E-42)
            short r6 = (short) r6
            r8 = 11228(0x2bdc, float:1.5734E-41)
            short r8 = (short) r8
            java.lang.String r5 = length(r5, r6, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0406
            r5 = 131(0x83, float:1.84E-43)
            if (r14 < r5) goto L_0x0408
            r6 = 132(0x84, float:1.85E-43)
            if (r14 > r6) goto L_0x0408
            goto L_0x02eb
        L_0x0406:
            r5 = 131(0x83, float:1.84E-43)
        L_0x0408:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            r8 = 2439(0x987, float:3.418E-42)
            short r8 = (short) r8
            r9 = 7187(0x1c13, float:1.0071E-41)
            short r9 = (short) r9
            java.lang.String r6 = length(r6, r8, r9)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0433
            r6 = 147(0x93, float:2.06E-43)
            if (r14 < r6) goto L_0x0433
            r6 = 148(0x94, float:2.07E-43)
            if (r14 > r6) goto L_0x0433
            goto L_0x0334
        L_0x042b:
            r1.toIntRange = r0
            r1.length(r4)
            r4 = 1
            goto L_0x0114
        L_0x0433:
            throw r0
        L_0x0434:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x043c
            throw r1
        L_0x043c:
            goto L_0x043e
        L_0x043d:
            throw r0
        L_0x043e:
            goto L_0x043d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d9, code lost:
        if (r10 <= 35) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0135, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x016e, code lost:
        r1.length(14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(@org.jetbrains.annotations.NotNull java.lang.String r18) {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r0 = r18
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r0)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = r0 | 2244(0x8c4, float:3.145E-42)
            short r4 = (short) r4
            r5 = 14474(0x388a, float:2.0282E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0377 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0377 }
            byte[] r4 = setMin     // Catch:{ all -> 0x0377 }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x0377 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0377 }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0377 }
            int r11 = setMax     // Catch:{ all -> 0x0377 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0377 }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x0377 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0377 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0377 }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x0377 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0377 }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0377 }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0377 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0377 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x0377 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0377 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0377 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0377 }
            int r14 = setMax     // Catch:{ all -> 0x0377 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0377 }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x0377 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0377 }
            r12[r8] = r13     // Catch:{ all -> 0x0377 }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x0377 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0377 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x007e:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0114
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x010b }
            r12[r8] = r11     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x010b }
            byte r11 = r11[r9]     // Catch:{ all -> 0x010b }
            byte r11 = (byte) r11     // Catch:{ all -> 0x010b }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            int r14 = setMax     // Catch:{ all -> 0x010b }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x010b }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x010b }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x010b }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x010b }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            r5 = 13879(0x3637, float:1.9449E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x010b }
            java.lang.String r5 = length(r14, r15, r5)     // Catch:{ all -> 0x010b }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x010b }
            byte[] r15 = setMin     // Catch:{ all -> 0x010b }
            byte r15 = r15[r9]     // Catch:{ all -> 0x010b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010b }
            int r3 = setMax     // Catch:{ all -> 0x010b }
            r3 = r3 | 11522(0x2d02, float:1.6146E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x010b }
            java.lang.String r3 = length(r15, r10, r3)     // Catch:{ all -> 0x010b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x010b }
            r14[r8] = r3     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r3 = r11.getMethod(r5, r14)     // Catch:{ all -> 0x010b }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x0102 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0102 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0102 }
            int r12 = setMax     // Catch:{ all -> 0x0102 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0102 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0102 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0102 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0102 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0102 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0102 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0102 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0102 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x007e
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010a
            throw r1
        L_0x010a:
            throw r0
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r3 = 6
            r5 = 31
        L_0x0117:
            int r10 = r8 + 1
            r12 = 48
            r13 = 2
            r14 = 3
            r0 = r4[r8]     // Catch:{ all -> 0x0202 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0202 }
            r8 = 14
            r15 = 21
            r7 = 5
            r11 = 4
            switch(r0) {
                case -22: goto L_0x01fe;
                case -21: goto L_0x01fa;
                case -20: goto L_0x01f6;
                case -19: goto L_0x01e9;
                case -18: goto L_0x01dc;
                case -17: goto L_0x01d7;
                case -16: goto L_0x01c4;
                case -15: goto L_0x01c0;
                case -14: goto L_0x01ab;
                case -13: goto L_0x01a6;
                case -12: goto L_0x01a3;
                case -11: goto L_0x019f;
                case -10: goto L_0x0195;
                case -9: goto L_0x0192;
                case -8: goto L_0x018f;
                case -7: goto L_0x0181;
                case -6: goto L_0x0173;
                case -5: goto L_0x016a;
                case -4: goto L_0x0167;
                case -3: goto L_0x013a;
                case -2: goto L_0x0131;
                case -1: goto L_0x012e;
                default: goto L_0x012c;
            }     // Catch:{ all -> 0x0202 }
        L_0x012c:
            goto L_0x01ff
        L_0x012e:
            r8 = 38
            goto L_0x0117
        L_0x0131:
            java.lang.String r0 = ""
            r1.toIntRange = r0     // Catch:{ all -> 0x0202 }
        L_0x0135:
            r1.length(r7)     // Catch:{ all -> 0x0202 }
            goto L_0x01ff
        L_0x013a:
            r1.setMin = r7     // Catch:{ all -> 0x0202 }
            r1.length(r14)     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0202 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x0202 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x0202 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r15 = r1.equals     // Catch:{ all -> 0x0202 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r11 = r1.equals     // Catch:{ all -> 0x0202 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0202 }
            r0.length(r7, r8, r15, r11)     // Catch:{ all -> 0x0202 }
            goto L_0x01ff
        L_0x0167:
            r8 = 63
            goto L_0x0117
        L_0x016a:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0202 }
            r1.setMin = r0     // Catch:{ all -> 0x0202 }
        L_0x016e:
            r1.length(r8)     // Catch:{ all -> 0x0202 }
            goto L_0x01ff
        L_0x0173:
            r1.setMin = r6     // Catch:{ all -> 0x0202 }
            r1.length(r14)     // Catch:{ all -> 0x0202 }
            r1.length(r15)     // Catch:{ all -> 0x0202 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0202 }
            b = r0     // Catch:{ all -> 0x0202 }
            goto L_0x01ff
        L_0x0181:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x0202 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01ff
            r0 = 30
            r8 = 30
            goto L_0x0117
        L_0x018f:
            r8 = 31
            goto L_0x0117
        L_0x0192:
            r8 = 42
            goto L_0x0117
        L_0x0195:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0202 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0202 }
            throw r0     // Catch:{ all -> 0x0202 }
        L_0x019f:
            r8 = 50
            goto L_0x0117
        L_0x01a3:
            r8 = 6
            goto L_0x0117
        L_0x01a6:
            java.lang.String r0 = "phoneNumber"
            r1.toIntRange = r0     // Catch:{ all -> 0x0202 }
            goto L_0x0135
        L_0x01ab:
            r1.setMin = r13     // Catch:{ all -> 0x0202 }
            r1.length(r14)     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0202 }
            r1.length(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x0202 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0202 }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)     // Catch:{ all -> 0x0202 }
            goto L_0x01ff
        L_0x01c0:
            r8 = 51
            goto L_0x0117
        L_0x01c4:
            r1.length(r6)     // Catch:{ all -> 0x0202 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0202 }
            if (r0 == r5) goto L_0x01d4
            r7 = 94
            if (r0 == r7) goto L_0x01d0
            goto L_0x01d4
        L_0x01d0:
            r8 = 32
            goto L_0x0117
        L_0x01d4:
            r8 = 1
            goto L_0x0117
        L_0x01d7:
            int r0 = b     // Catch:{ all -> 0x0202 }
            r1.setMin = r0     // Catch:{ all -> 0x0202 }
            goto L_0x016e
        L_0x01dc:
            r1.setMin = r6     // Catch:{ all -> 0x0202 }
            r1.length(r14)     // Catch:{ all -> 0x0202 }
            r1.length(r15)     // Catch:{ all -> 0x0202 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0202 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x0202 }
            goto L_0x01ff
        L_0x01e9:
            r1.length(r12)     // Catch:{ all -> 0x0202 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01ff
            r0 = 60
            r8 = 60
            goto L_0x0117
        L_0x01f6:
            r8 = 36
            goto L_0x0117
        L_0x01fa:
            r8 = 61
            goto L_0x0117
        L_0x01fe:
            return
        L_0x01ff:
            r8 = r10
            goto L_0x0117
        L_0x0202:
            r0 = move-exception
            r7 = 35
            if (r10 < r14) goto L_0x0213
            if (r10 > r3) goto L_0x0213
            r7 = 50
            r8 = 33
            r14 = 15
            r16 = 35
            goto L_0x036b
        L_0x0213:
            byte[] r15 = setMin
            byte r15 = r15[r9]
            byte r15 = (byte) r15
            r8 = 2424(0x978, float:3.397E-42)
            short r8 = (short) r8
            r11 = 14181(0x3765, float:1.9872E-41)
            short r11 = (short) r11
            java.lang.String r8 = length(r15, r8, r11)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x023a
            if (r10 < r6) goto L_0x023a
            if (r10 > r13) goto L_0x023a
        L_0x0230:
            r7 = 50
            r8 = 33
        L_0x0234:
            r14 = 15
            r16 = 65
            goto L_0x036b
        L_0x023a:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r11 = 2427(0x97b, float:3.401E-42)
            short r11 = (short) r11
            r15 = 14097(0x3711, float:1.9754E-41)
            short r15 = (short) r15
            java.lang.String r8 = length(r8, r11, r15)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0258
            if (r10 < r13) goto L_0x0258
            if (r10 > r14) goto L_0x0258
            goto L_0x0230
        L_0x0258:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r13 = 2432(0x980, float:3.408E-42)
            short r13 = (short) r13
            r14 = 14148(0x3744, float:1.9826E-41)
            short r14 = (short) r14
            java.lang.String r8 = length(r8, r13, r14)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0276
            if (r10 < r3) goto L_0x0276
            if (r10 > r5) goto L_0x0276
            goto L_0x0230
        L_0x0276:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r13 = 2428(0x97c, float:3.402E-42)
            short r13 = (short) r13
            r14 = r13 & 208(0xd0, float:2.91E-43)
            short r14 = (short) r14
            java.lang.String r8 = length(r8, r13, r14)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x029f
            r8 = 25
            if (r10 < r8) goto L_0x029f
            if (r10 > r5) goto L_0x029f
            r7 = 50
            r8 = 33
        L_0x0299:
            r14 = 15
        L_0x029b:
            r16 = 66
            goto L_0x036b
        L_0x029f:
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            java.lang.String r8 = length(r8, r11, r15)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x02bd
            r8 = 32
            if (r10 < r8) goto L_0x02bd
            r8 = 33
            if (r10 > r8) goto L_0x02bd
            r7 = 50
            goto L_0x0299
        L_0x02bd:
            byte[] r8 = setMin
            byte r13 = r8[r9]
            byte r13 = (byte) r13
            r14 = 15
            byte r8 = r8[r14]
            short r8 = (short) r8
            java.lang.String r8 = length(r13, r11, r8)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x02df
            r8 = 33
            if (r10 < r8) goto L_0x02e1
            if (r10 > r7) goto L_0x02e1
        L_0x02db:
            r7 = 50
            goto L_0x0234
        L_0x02df:
            r8 = 33
        L_0x02e1:
            byte[] r7 = setMin
            byte r7 = r7[r9]
            byte r7 = (byte) r7
            int r13 = setMax
            r13 = r13 | 2336(0x920, float:3.273E-42)
            short r13 = (short) r13
            r14 = 8656(0x21d0, float:1.213E-41)
            short r14 = (short) r14
            java.lang.String r7 = length(r7, r13, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0305
            r7 = 43
            if (r10 < r7) goto L_0x0305
            r7 = 44
            if (r10 > r7) goto L_0x0305
            goto L_0x02db
        L_0x0305:
            byte[] r7 = setMin
            byte r13 = r7[r9]
            byte r13 = (byte) r13
            r14 = 15
            byte r7 = r7[r14]
            short r7 = (short) r7
            java.lang.String r7 = length(r13, r11, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0327
            r7 = 44
            if (r10 < r7) goto L_0x0327
            r7 = 50
            if (r10 > r7) goto L_0x0327
        L_0x0325:
            goto L_0x029b
        L_0x0327:
            byte[] r7 = setMin
            byte r11 = r7[r9]
            byte r11 = (byte) r11
            r13 = 2423(0x977, float:3.395E-42)
            short r13 = (short) r13
            r15 = 13891(0x3643, float:1.9465E-41)
            byte r7 = r7[r15]
            short r7 = (short) r7
            java.lang.String r7 = length(r11, r13, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x034b
            r7 = 47
            if (r10 < r7) goto L_0x034b
            r7 = 50
            if (r10 > r7) goto L_0x034b
        L_0x034a:
            goto L_0x0325
        L_0x034b:
            byte[] r7 = setMin
            byte r7 = r7[r9]
            byte r7 = (byte) r7
            r11 = 2439(0x987, float:3.418E-42)
            short r11 = (short) r11
            r13 = 7187(0x1c13, float:1.0071E-41)
            short r13 = (short) r13
            java.lang.String r7 = length(r7, r11, r13)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0376
            if (r10 < r12) goto L_0x0376
            r7 = 50
            if (r10 > r7) goto L_0x0376
            goto L_0x034a
        L_0x036b:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r8 = r16
            goto L_0x0117
        L_0x0376:
            throw r0
        L_0x0377:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x037f
            throw r1
        L_0x037f:
            goto L_0x0381
        L_0x0380:
            throw r0
        L_0x0381:
            goto L_0x0380
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031e, code lost:
        if (r10 <= 63) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013e, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0169, code lost:
        r1.length(5);
     */
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(@org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.NotNull id.dana.data.base.NetworkException r18) {
        /*
            r16 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r16
            r0 = r17
            r3 = r18
            r1.<init>(r2, r0, r3)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = 2132(0x854, float:2.988E-42)
            short r3 = (short) r3
            r4 = 8104(0x1fa8, float:1.1356E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r5 = r3 | 2457(0x999, float:3.443E-42)
            short r5 = (short) r5
            r6 = 5590(0x15d6, float:7.833E-42)
            short r6 = (short) r6
            java.lang.String r3 = length(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x03b0 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x03b0 }
            byte[] r3 = setMin     // Catch:{ all -> 0x03b0 }
            r8 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r8]     // Catch:{ all -> 0x03b0 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x03b0 }
            r9 = 2442(0x98a, float:3.422E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x03b0 }
            int r10 = setMax     // Catch:{ all -> 0x03b0 }
            r10 = r10 | 11522(0x2d02, float:1.6146E-41)
            short r10 = (short) r10     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = length(r3, r9, r10)     // Catch:{ all -> 0x03b0 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x03b0 }
            byte[] r10 = setMin     // Catch:{ all -> 0x03b0 }
            r11 = 7213(0x1c2d, float:1.0108E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x03b0 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x03b0 }
            r11 = 2453(0x995, float:3.437E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x03b0 }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x03b0 }
            java.lang.String r10 = length(r10, r11, r12)     // Catch:{ all -> 0x03b0 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x03b0 }
            byte[] r12 = setMin     // Catch:{ all -> 0x03b0 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x03b0 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x03b0 }
            int r13 = setMax     // Catch:{ all -> 0x03b0 }
            r13 = r13 | 11522(0x2d02, float:1.6146E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x03b0 }
            java.lang.String r12 = length(r12, r9, r13)     // Catch:{ all -> 0x03b0 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03b0 }
            r11[r7] = r12     // Catch:{ all -> 0x03b0 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x03b0 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x03b0 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x03b0 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r6 = 0
        L_0x0080:
            int r10 = r0.length
            if (r6 >= r10) goto L_0x0114
            r10 = r0[r6]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x010b }
            r11[r7] = r10     // Catch:{ all -> 0x010b }
            byte[] r10 = setMin     // Catch:{ all -> 0x010b }
            byte r10 = r10[r8]     // Catch:{ all -> 0x010b }
            byte r10 = (byte) r10     // Catch:{ all -> 0x010b }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x010b }
            int r13 = setMax     // Catch:{ all -> 0x010b }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            java.lang.String r10 = length(r10, r12, r13)     // Catch:{ all -> 0x010b }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x010b }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x010b }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x010b }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x010b }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x010b }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x010b }
            byte[] r15 = setMin     // Catch:{ all -> 0x010b }
            byte r15 = r15[r8]     // Catch:{ all -> 0x010b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x010b }
            int r4 = setMax     // Catch:{ all -> 0x010b }
            r4 = r4 | 11522(0x2d02, float:1.6146E-41)
            short r4 = (short) r4     // Catch:{ all -> 0x010b }
            java.lang.String r4 = length(r15, r9, r4)     // Catch:{ all -> 0x010b }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x010b }
            r14[r7] = r4     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r4 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x010b }
            r10 = 0
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x010b }
            byte[] r11 = setMin     // Catch:{ all -> 0x0102 }
            byte r11 = r11[r8]     // Catch:{ all -> 0x0102 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0102 }
            int r13 = setMax     // Catch:{ all -> 0x0102 }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0102 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0102 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0102 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0102 }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0102 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0102 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Object r4 = r11.invoke(r4, r10)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0102 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0102 }
            r3[r6] = r4
            int r6 = r6 + 1
            r4 = 15
            goto L_0x0080
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010a
            throw r1
        L_0x010a:
            throw r0
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r6 = 49
            r9 = 2
        L_0x0117:
            int r10 = r7 + 1
            r12 = 26
            r13 = 21
            r14 = 3
            r0 = r3[r7]     // Catch:{ all -> 0x024a }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x024a }
            r7 = 14
            r15 = 5
            r11 = 4
            switch(r0) {
                case -27: goto L_0x0243;
                case -26: goto L_0x023f;
                case -25: goto L_0x0230;
                case -24: goto L_0x0223;
                case -23: goto L_0x021d;
                case -22: goto L_0x020b;
                case -21: goto L_0x0208;
                case -20: goto L_0x01dc;
                case -19: goto L_0x01d7;
                case -18: goto L_0x01d2;
                case -17: goto L_0x01d1;
                case -16: goto L_0x01bf;
                case -15: goto L_0x01a5;
                case -14: goto L_0x01a1;
                case -13: goto L_0x019d;
                case -12: goto L_0x0199;
                case -11: goto L_0x0195;
                case -10: goto L_0x0184;
                case -9: goto L_0x016e;
                case -8: goto L_0x0165;
                case -7: goto L_0x0162;
                case -6: goto L_0x015f;
                case -5: goto L_0x0151;
                case -4: goto L_0x0143;
                case -3: goto L_0x013a;
                case -2: goto L_0x0130;
                case -1: goto L_0x012d;
                default: goto L_0x012b;
            }     // Catch:{ all -> 0x024a }
        L_0x012b:
            goto L_0x0247
        L_0x012d:
            r7 = 38
            goto L_0x0117
        L_0x0130:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x024a }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x024a }
            throw r0     // Catch:{ all -> 0x024a }
        L_0x013a:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x024a }
            r1.setMin = r0     // Catch:{ all -> 0x024a }
        L_0x013e:
            r1.length(r7)     // Catch:{ all -> 0x024a }
            goto L_0x0247
        L_0x0143:
            r1.setMin = r5     // Catch:{ all -> 0x024a }
            r1.length(r14)     // Catch:{ all -> 0x024a }
            r1.length(r13)     // Catch:{ all -> 0x024a }
            int r0 = r1.setMax     // Catch:{ all -> 0x024a }
            b = r0     // Catch:{ all -> 0x024a }
            goto L_0x0247
        L_0x0151:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x024a }
            int r0 = r1.setMax     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x0247
            r0 = 25
            r7 = 25
            goto L_0x0117
        L_0x015f:
            r7 = 57
            goto L_0x0117
        L_0x0162:
            r7 = 41
            goto L_0x0117
        L_0x0165:
            java.lang.String r0 = "networkException"
            r1.toIntRange = r0     // Catch:{ all -> 0x024a }
        L_0x0169:
            r1.length(r15)     // Catch:{ all -> 0x024a }
            goto L_0x0247
        L_0x016e:
            r1.setMin = r9     // Catch:{ all -> 0x024a }
            r1.length(r14)     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x024a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x024a }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)     // Catch:{ all -> 0x024a }
            goto L_0x0247
        L_0x0184:
            r1.setMin = r5     // Catch:{ all -> 0x024a }
            r1.length(r14)     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x024a }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x024a }
            android.content.Context r0 = r0.toIntRange     // Catch:{ all -> 0x024a }
            r1.toIntRange = r0     // Catch:{ all -> 0x024a }
            goto L_0x0169
        L_0x0195:
            r7 = 51
            goto L_0x0117
        L_0x0199:
            r7 = 59
            goto L_0x0117
        L_0x019d:
            r7 = 62
            goto L_0x0117
        L_0x01a1:
            r7 = 43
            goto L_0x0117
        L_0x01a5:
            r1.length(r5)     // Catch:{ all -> 0x024a }
            int r0 = r1.setMax     // Catch:{ all -> 0x024a }
            r7 = 17
            r10 = 60
            if (r0 == r7) goto L_0x01bb
            r7 = 56
            if (r0 == r7) goto L_0x01b5
            goto L_0x01bb
        L_0x01b5:
            r0 = 44
            r7 = 44
            goto L_0x0117
        L_0x01bb:
            r7 = 60
            goto L_0x0117
        L_0x01bf:
            r1.setMin = r5     // Catch:{ all -> 0x024a }
            r1.length(r14)     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x024a }
            int r0 = super.hashCode()     // Catch:{ all -> 0x024a }
            r1.setMin = r0     // Catch:{ all -> 0x024a }
            goto L_0x013e
        L_0x01d1:
            return
        L_0x01d2:
            java.lang.String r0 = "alipayplus.mobilewallet.user.checkRegisteredUserAndSendOTP"
            r1.toIntRange = r0     // Catch:{ all -> 0x024a }
            goto L_0x0169
        L_0x01d7:
            java.lang.String r0 = "Onboarding Input Phone"
            r1.toIntRange = r0     // Catch:{ all -> 0x024a }
            goto L_0x0169
        L_0x01dc:
            r1.setMin = r15     // Catch:{ all -> 0x024a }
            r1.length(r14)     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x024a }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r7 = r1.equals     // Catch:{ all -> 0x024a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r15 = r1.equals     // Catch:{ all -> 0x024a }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r4 = r1.equals     // Catch:{ all -> 0x024a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x024a }
            r1.length(r11)     // Catch:{ all -> 0x024a }
            java.lang.Object r11 = r1.equals     // Catch:{ all -> 0x024a }
            id.dana.data.base.NetworkException r11 = (id.dana.data.base.NetworkException) r11     // Catch:{ all -> 0x024a }
            o.BlurProcess.length(r0, r7, r15, r4, r11)     // Catch:{ all -> 0x024a }
            goto L_0x0247
        L_0x0208:
            r7 = 2
            goto L_0x0117
        L_0x020b:
            r1.length(r5)     // Catch:{ all -> 0x024a }
            int r0 = r1.setMax     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x0219
            if (r0 == r5) goto L_0x0215
            goto L_0x0219
        L_0x0215:
            r7 = 90
            goto L_0x0117
        L_0x0219:
            r7 = 26
            goto L_0x0117
        L_0x021d:
            int r0 = b     // Catch:{ all -> 0x024a }
            r1.setMin = r0     // Catch:{ all -> 0x024a }
            goto L_0x013e
        L_0x0223:
            r1.setMin = r5     // Catch:{ all -> 0x024a }
            r1.length(r14)     // Catch:{ all -> 0x024a }
            r1.length(r13)     // Catch:{ all -> 0x024a }
            int r0 = r1.setMax     // Catch:{ all -> 0x024a }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x024a }
            goto L_0x0247
        L_0x0230:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x024a }
            int r0 = r1.setMax     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x0247
            r0 = 89
            r7 = 89
            goto L_0x0117
        L_0x023f:
            r7 = 49
            goto L_0x0117
        L_0x0243:
            r7 = 36
            goto L_0x0117
        L_0x0247:
            r7 = r10
            goto L_0x0117
        L_0x024a:
            r0 = move-exception
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = r4 | 2368(0x940, float:3.318E-42)
            short r7 = (short) r7
            r11 = 11228(0x2bdc, float:1.5734E-41)
            short r11 = (short) r11
            java.lang.String r4 = length(r4, r7, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x026d
            if (r10 < r9) goto L_0x026d
            if (r10 > r14) goto L_0x026d
        L_0x0268:
            r7 = 1
        L_0x0269:
            r15 = 15
            goto L_0x03a6
        L_0x026d:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = r4 | 2368(0x940, float:3.318E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r7, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0288
            if (r10 < r13) goto L_0x0288
            if (r10 > r12) goto L_0x0288
            goto L_0x0268
        L_0x0288:
            r4 = 35
            r7 = 31
            if (r10 < r7) goto L_0x0295
            if (r10 > r4) goto L_0x0295
            r4 = 97
            r7 = 97
            goto L_0x0269
        L_0x0295:
            byte[] r12 = setMin
            byte r12 = r12[r8]
            byte r12 = (byte) r12
            r13 = r12 | 2368(0x940, float:3.318E-42)
            short r13 = (short) r13
            java.lang.String r11 = length(r12, r13, r11)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            r12 = 28
            if (r11 == 0) goto L_0x02b4
            r11 = 27
            if (r10 < r11) goto L_0x02b4
            if (r10 > r12) goto L_0x02b4
            goto L_0x0268
        L_0x02b4:
            byte[] r11 = setMin
            byte r11 = r11[r8]
            byte r11 = (byte) r11
            r13 = 2432(0x980, float:3.408E-42)
            short r13 = (short) r13
            r14 = 14148(0x3744, float:1.9826E-41)
            short r14 = (short) r14
            java.lang.String r11 = length(r11, r13, r14)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x02d2
            if (r10 < r12) goto L_0x02d2
            if (r10 > r4) goto L_0x02d2
            goto L_0x0268
        L_0x02d2:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r11 = 2439(0x987, float:3.418E-42)
            short r11 = (short) r11
            r12 = 7187(0x1c13, float:1.0071E-41)
            short r12 = (short) r12
            java.lang.String r4 = length(r4, r11, r12)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02f3
            r4 = 30
            if (r10 < r4) goto L_0x02f3
            if (r10 > r7) goto L_0x02f3
            goto L_0x0268
        L_0x02f3:
            r4 = 45
            if (r10 < r4) goto L_0x02ff
            if (r10 > r6) goto L_0x02ff
            r4 = 96
            r7 = 96
            goto L_0x0269
        L_0x02ff:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 2428(0x97c, float:3.402E-42)
            short r7 = (short) r7
            r13 = r7 & 208(0xd0, float:2.91E-43)
            short r13 = (short) r13
            java.lang.String r4 = length(r4, r7, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0322
            r4 = 62
            if (r10 < r4) goto L_0x0324
            r7 = 63
            if (r10 > r7) goto L_0x0324
            goto L_0x0268
        L_0x0322:
            r4 = 62
        L_0x0324:
            byte[] r7 = setMin
            byte r13 = r7[r8]
            byte r13 = (byte) r13
            r14 = 2427(0x97b, float:3.401E-42)
            short r14 = (short) r14
            r15 = 15
            byte r7 = r7[r15]
            short r7 = (short) r7
            java.lang.String r7 = length(r13, r14, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0349
            r7 = 85
            if (r10 < r7) goto L_0x0349
            r7 = 90
            if (r10 > r7) goto L_0x0349
        L_0x0347:
            r7 = 1
            goto L_0x03a6
        L_0x0349:
            byte[] r7 = setMin
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r13 = 2419(0x973, float:3.39E-42)
            short r13 = (short) r13
            r4 = 13371(0x343b, float:1.8737E-41)
            short r4 = (short) r4
            java.lang.String r4 = length(r7, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x036b
            r4 = 91
            if (r10 < r4) goto L_0x036b
            r4 = 96
            if (r10 > r4) goto L_0x036b
            goto L_0x0347
        L_0x036b:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r7 = 14097(0x3711, float:1.9754E-41)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r14, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x038a
            r4 = 92
            if (r10 < r4) goto L_0x038a
            r4 = 93
            if (r10 > r4) goto L_0x038a
            goto L_0x0347
        L_0x038a:
            byte[] r4 = setMin
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            java.lang.String r4 = length(r4, r11, r12)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x03af
            r4 = 94
            if (r10 < r4) goto L_0x03af
            r4 = 95
            if (r10 > r4) goto L_0x03af
            goto L_0x0347
        L_0x03a6:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            goto L_0x0117
        L_0x03af:
            throw r0
        L_0x03b0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03b8
            throw r1
        L_0x03b8:
            goto L_0x03ba
        L_0x03b9:
            throw r0
        L_0x03ba:
            goto L_0x03b9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax(java.lang.String, id.dana.data.base.NetworkException):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016d, code lost:
        r1.length(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a0, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01cf, code lost:
        if (r1.setMax != 0) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d1, code lost:
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01d4, code lost:
        r5 = 574;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21) {
        /*
            r17 = this;
            o.GyroscopeSensorService r7 = new o.GyroscopeSensorService
            r1 = r7
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r1.<init>(r2, r3, r4, r5, r6)
            byte[] r0 = setMin
            r1 = 33
            byte r1 = r0[r1]
            byte r1 = (byte) r1
            r2 = 15
            byte r0 = r0[r2]
            short r0 = (short) r0
            r3 = r0 | 2455(0x997, float:3.44E-42)
            short r3 = (short) r3
            java.lang.String r0 = length(r1, r0, r3)
            byte[] r1 = setMin
            byte r1 = r1[r2]
            byte r1 = (byte) r1
            r3 = r1 | 2457(0x999, float:3.443E-42)
            short r3 = (short) r3
            r4 = 5590(0x15d6, float:7.833E-42)
            short r4 = (short) r4
            java.lang.String r1 = length(r1, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x08d7 }
            r5 = 0
            r4[r5] = r1     // Catch:{ all -> 0x08d7 }
            byte[] r1 = setMin     // Catch:{ all -> 0x08d7 }
            r6 = 7217(0x1c31, float:1.0113E-41)
            byte r1 = r1[r6]     // Catch:{ all -> 0x08d7 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x08d7 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x08d7 }
            int r9 = setMax     // Catch:{ all -> 0x08d7 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x08d7 }
            java.lang.String r1 = length(r1, r8, r9)     // Catch:{ all -> 0x08d7 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x08d7 }
            byte[] r9 = setMin     // Catch:{ all -> 0x08d7 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x08d7 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x08d7 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x08d7 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x08d7 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x08d7 }
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ all -> 0x08d7 }
            byte[] r11 = setMin     // Catch:{ all -> 0x08d7 }
            byte r11 = r11[r6]     // Catch:{ all -> 0x08d7 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x08d7 }
            int r12 = setMax     // Catch:{ all -> 0x08d7 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x08d7 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x08d7 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x08d7 }
            r10[r5] = r11     // Catch:{ all -> 0x08d7 }
            java.lang.reflect.Method r1 = r1.getMethod(r9, r10)     // Catch:{ all -> 0x08d7 }
            java.lang.Object r0 = r1.invoke(r0, r4)     // Catch:{ all -> 0x08d7 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x08d7 }
            int r1 = r0.length
            int[] r1 = new int[r1]
            r4 = 0
        L_0x0085:
            int r9 = r0.length
            r10 = 480(0x1e0, float:6.73E-43)
            if (r4 >= r9) goto L_0x0119
            r9 = r0[r4]
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x0110 }
            r11[r5] = r9     // Catch:{ all -> 0x0110 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0110 }
            byte r9 = r9[r6]     // Catch:{ all -> 0x0110 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0110 }
            r12 = 2441(0x989, float:3.42E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0110 }
            int r13 = setMax     // Catch:{ all -> 0x0110 }
            r13 = r13 & r10
            short r13 = (short) r13     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = length(r9, r12, r13)     // Catch:{ all -> 0x0110 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0110 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0110 }
            r14 = 2451(0x993, float:3.435E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0110 }
            r15 = 13879(0x3637, float:1.9449E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0110 }
            java.lang.String r13 = length(r13, r14, r15)     // Catch:{ all -> 0x0110 }
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ all -> 0x0110 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0110 }
            byte r15 = r15[r6]     // Catch:{ all -> 0x0110 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0110 }
            int r2 = setMax     // Catch:{ all -> 0x0110 }
            r2 = r2 | 11522(0x2d02, float:1.6146E-41)
            short r2 = (short) r2     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = length(r15, r8, r2)     // Catch:{ all -> 0x0110 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0110 }
            r14[r5] = r2     // Catch:{ all -> 0x0110 }
            java.lang.reflect.Method r2 = r9.getMethod(r13, r14)     // Catch:{ all -> 0x0110 }
            r9 = 0
            java.lang.Object r2 = r2.invoke(r9, r11)     // Catch:{ all -> 0x0110 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0107 }
            byte r11 = r11[r6]     // Catch:{ all -> 0x0107 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0107 }
            int r13 = setMax     // Catch:{ all -> 0x0107 }
            r10 = r10 & r13
            short r10 = (short) r10     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = length(r11, r12, r10)     // Catch:{ all -> 0x0107 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0107 }
            byte r11 = r11[r6]     // Catch:{ all -> 0x0107 }
            int r11 = r11 - r3
            byte r11 = (byte) r11     // Catch:{ all -> 0x0107 }
            r12 = 2450(0x992, float:3.433E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0107 }
            r13 = 13885(0x363d, float:1.9457E-41)
            short r13 = (short) r13     // Catch:{ all -> 0x0107 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r9)     // Catch:{ all -> 0x0107 }
            java.lang.Object r2 = r10.invoke(r2, r9)     // Catch:{ all -> 0x0107 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0107 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0107 }
            r1[r4] = r2
            int r4 = r4 + 1
            r2 = 15
            goto L_0x0085
        L_0x0107:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010f
            throw r1
        L_0x010f:
            throw r0
        L_0x0110:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0118
            throw r1
        L_0x0118:
            throw r0
        L_0x0119:
            r2 = 436(0x1b4, float:6.11E-43)
            r4 = 198(0xc6, float:2.77E-43)
            r8 = 2
        L_0x011e:
            int r9 = r5 + 1
            r11 = 256(0x100, float:3.59E-43)
            r0 = r1[r5]     // Catch:{ all -> 0x072f }
            int r0 = r7.length(r0)     // Catch:{ all -> 0x072f }
            r15 = 14
            r5 = 22
            r10 = 48
            r14 = 5
            r13 = 3
            r12 = 4
            switch(r0) {
                case -159: goto L_0x0714;
                case -158: goto L_0x0711;
                case -157: goto L_0x070e;
                case -156: goto L_0x06f5;
                case -155: goto L_0x06e3;
                case -154: goto L_0x06bc;
                case -153: goto L_0x06aa;
                case -152: goto L_0x06a6;
                case -151: goto L_0x06a2;
                case -150: goto L_0x0695;
                case -149: goto L_0x067f;
                case -148: goto L_0x067b;
                case -147: goto L_0x0666;
                case -146: goto L_0x0651;
                case -145: goto L_0x064b;
                case -144: goto L_0x0647;
                case -143: goto L_0x0643;
                case -142: goto L_0x063f;
                case -141: goto L_0x063b;
                case -140: goto L_0x062e;
                case -139: goto L_0x061a;
                case -138: goto L_0x0608;
                case -137: goto L_0x0602;
                case -136: goto L_0x05ec;
                case -135: goto L_0x05e3;
                case -134: goto L_0x05df;
                case -133: goto L_0x05db;
                case -132: goto L_0x05ce;
                case -131: goto L_0x05c8;
                case -130: goto L_0x05c4;
                case -129: goto L_0x05be;
                case -128: goto L_0x05b8;
                case -127: goto L_0x05b2;
                case -126: goto L_0x05ae;
                case -125: goto L_0x059d;
                case -124: goto L_0x058b;
                case -123: goto L_0x0587;
                case -122: goto L_0x0575;
                case -121: goto L_0x0563;
                case -120: goto L_0x054c;
                case -119: goto L_0x0536;
                case -118: goto L_0x0532;
                case -117: goto L_0x052e;
                case -116: goto L_0x0521;
                case -115: goto L_0x0507;
                case -114: goto L_0x04f3;
                case -113: goto L_0x04ef;
                case -112: goto L_0x04eb;
                case -111: goto L_0x04de;
                case -110: goto L_0x04d6;
                case -109: goto L_0x04d0;
                case -108: goto L_0x04b9;
                case -107: goto L_0x04b5;
                case -106: goto L_0x04b1;
                case -105: goto L_0x04ad;
                case -104: goto L_0x04a0;
                case -103: goto L_0x049c;
                case -102: goto L_0x0498;
                case -101: goto L_0x048b;
                case -100: goto L_0x0485;
                case -99: goto L_0x0481;
                case -98: goto L_0x047d;
                case -97: goto L_0x0470;
                case -96: goto L_0x046c;
                case -95: goto L_0x045a;
                case -94: goto L_0x0454;
                case -93: goto L_0x0444;
                case -92: goto L_0x042e;
                case -91: goto L_0x0428;
                case -90: goto L_0x0411;
                case -89: goto L_0x040d;
                case -88: goto L_0x0400;
                case -87: goto L_0x03fc;
                case -86: goto L_0x03e7;
                case -85: goto L_0x03e3;
                case -84: goto L_0x03bf;
                case -83: goto L_0x03af;
                case -82: goto L_0x03ab;
                case -81: goto L_0x03a7;
                case -80: goto L_0x039a;
                case -79: goto L_0x0396;
                case -78: goto L_0x0392;
                case -77: goto L_0x038e;
                case -76: goto L_0x0381;
                case -75: goto L_0x037d;
                case -74: goto L_0x0379;
                case -73: goto L_0x0375;
                case -72: goto L_0x0368;
                case -71: goto L_0x0364;
                case -70: goto L_0x0360;
                case -69: goto L_0x035c;
                case -68: goto L_0x034f;
                case -67: goto L_0x034b;
                case -66: goto L_0x0347;
                case -65: goto L_0x033a;
                case -64: goto L_0x0336;
                case -63: goto L_0x0332;
                case -62: goto L_0x031c;
                case -61: goto L_0x0318;
                case -60: goto L_0x0314;
                case -59: goto L_0x0310;
                case -58: goto L_0x0303;
                case -57: goto L_0x02ec;
                case -56: goto L_0x02e6;
                case -55: goto L_0x02e2;
                case -54: goto L_0x02de;
                case -53: goto L_0x02d1;
                case -52: goto L_0x02d0;
                case -51: goto L_0x02cc;
                case -50: goto L_0x02c6;
                case -49: goto L_0x02b5;
                case -48: goto L_0x02b1;
                case -47: goto L_0x02a4;
                case -46: goto L_0x02a0;
                case -45: goto L_0x029c;
                case -44: goto L_0x0298;
                case -43: goto L_0x028b;
                case -42: goto L_0x0287;
                case -41: goto L_0x0283;
                case -40: goto L_0x027f;
                case -39: goto L_0x027b;
                case -38: goto L_0x0277;
                case -37: goto L_0x0273;
                case -36: goto L_0x0266;
                case -35: goto L_0x0262;
                case -34: goto L_0x025e;
                case -33: goto L_0x025b;
                case -32: goto L_0x0257;
                case -31: goto L_0x024a;
                case -30: goto L_0x0246;
                case -29: goto L_0x023c;
                case -28: goto L_0x0238;
                case -27: goto L_0x0234;
                case -26: goto L_0x0227;
                case -25: goto L_0x0223;
                case -24: goto L_0x021f;
                case -23: goto L_0x0212;
                case -22: goto L_0x020e;
                case -21: goto L_0x020a;
                case -20: goto L_0x01fd;
                case -19: goto L_0x01fa;
                case -18: goto L_0x01ed;
                case -17: goto L_0x01dd;
                case -16: goto L_0x01d8;
                case -15: goto L_0x01ca;
                case -14: goto L_0x01c6;
                case -13: goto L_0x01c2;
                case -12: goto L_0x01b5;
                case -11: goto L_0x01a5;
                case -10: goto L_0x019c;
                case -9: goto L_0x0198;
                case -8: goto L_0x0172;
                case -7: goto L_0x0169;
                case -6: goto L_0x0165;
                case -5: goto L_0x0161;
                case -4: goto L_0x0142;
                case -3: goto L_0x013e;
                case -2: goto L_0x013a;
                case -1: goto L_0x0136;
                default: goto L_0x0134;
            }     // Catch:{ all -> 0x072f }
        L_0x0134:
            goto L_0x072a
        L_0x0136:
            r5 = 668(0x29c, float:9.36E-43)
            goto L_0x072b
        L_0x013a:
            r5 = 521(0x209, float:7.3E-43)
            goto L_0x072b
        L_0x013e:
            r5 = 491(0x1eb, float:6.88E-43)
            goto L_0x072b
        L_0x0142:
            r7.setMin = r13     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r10 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x072f }
            r0.getMax(r5, r10)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0161:
            r5 = 115(0x73, float:1.61E-43)
            goto L_0x072b
        L_0x0165:
            r5 = 600(0x258, float:8.41E-43)
            goto L_0x072b
        L_0x0169:
            java.lang.String r0 = "Register"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
        L_0x016d:
            r7.length(r14)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0172:
            r7.setMin = r12     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r10 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r12 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x072f }
            r0.getMax(r5, r10, r12)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0198:
            r5 = 98
            goto L_0x072b
        L_0x019c:
            int r0 = b     // Catch:{ all -> 0x072f }
            r7.setMin = r0     // Catch:{ all -> 0x072f }
        L_0x01a0:
            r7.length(r15)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x01a5:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r0 = 21
            r7.length(r0)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x01b5:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 44
            r5 = 44
            goto L_0x072b
        L_0x01c2:
            r5 = 664(0x298, float:9.3E-43)
            goto L_0x072b
        L_0x01c6:
            r5 = 170(0xaa, float:2.38E-43)
            goto L_0x072b
        L_0x01ca:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x01d4
        L_0x01d1:
            r5 = 6
            goto L_0x072b
        L_0x01d4:
            r5 = 574(0x23e, float:8.04E-43)
            goto L_0x072b
        L_0x01d8:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x072f }
            r7.setMin = r0     // Catch:{ all -> 0x072f }
            goto L_0x01a0
        L_0x01dd:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r0 = 21
            r7.length(r0)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            b = r0     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x01ed:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 67
            r5 = 67
            goto L_0x072b
        L_0x01fa:
            r5 = 1
            goto L_0x072b
        L_0x01fd:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 97
            r5 = 97
            goto L_0x072b
        L_0x020a:
            r5 = 426(0x1aa, float:5.97E-43)
            goto L_0x072b
        L_0x020e:
            r5 = 579(0x243, float:8.11E-43)
            goto L_0x072b
        L_0x0212:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 114(0x72, float:1.6E-43)
            r5 = 114(0x72, float:1.6E-43)
            goto L_0x072b
        L_0x021f:
            r5 = 622(0x26e, float:8.72E-43)
            goto L_0x072b
        L_0x0223:
            r5 = 338(0x152, float:4.74E-43)
            goto L_0x072b
        L_0x0227:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 138(0x8a, float:1.93E-43)
            r5 = 138(0x8a, float:1.93E-43)
            goto L_0x072b
        L_0x0234:
            r5 = 219(0xdb, float:3.07E-43)
            goto L_0x072b
        L_0x0238:
            r5 = 140(0x8c, float:1.96E-43)
            goto L_0x072b
        L_0x023c:
            r0 = 8
            r7.length(r0)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x072f }
            throw r0     // Catch:{ all -> 0x072f }
        L_0x0246:
            r5 = 12
            goto L_0x072b
        L_0x024a:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 152(0x98, float:2.13E-43)
            r5 = 152(0x98, float:2.13E-43)
            goto L_0x072b
        L_0x0257:
            r5 = 520(0x208, float:7.29E-43)
            goto L_0x072b
        L_0x025b:
            r5 = 2
            goto L_0x072b
        L_0x025e:
            r5 = 257(0x101, float:3.6E-43)
            goto L_0x072b
        L_0x0262:
            r5 = 384(0x180, float:5.38E-43)
            goto L_0x072b
        L_0x0266:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 166(0xa6, float:2.33E-43)
            r5 = 166(0xa6, float:2.33E-43)
            goto L_0x072b
        L_0x0273:
            r5 = 595(0x253, float:8.34E-43)
            goto L_0x072b
        L_0x0277:
            r5 = 315(0x13b, float:4.41E-43)
            goto L_0x072b
        L_0x027b:
            r5 = 604(0x25c, float:8.46E-43)
            goto L_0x072b
        L_0x027f:
            r5 = 677(0x2a5, float:9.49E-43)
            goto L_0x072b
        L_0x0283:
            r5 = 519(0x207, float:7.27E-43)
            goto L_0x072b
        L_0x0287:
            r5 = 641(0x281, float:8.98E-43)
            goto L_0x072b
        L_0x028b:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 195(0xc3, float:2.73E-43)
            r5 = 195(0xc3, float:2.73E-43)
            goto L_0x072b
        L_0x0298:
            r5 = 653(0x28d, float:9.15E-43)
            goto L_0x072b
        L_0x029c:
            r5 = 168(0xa8, float:2.35E-43)
            goto L_0x072b
        L_0x02a0:
            r5 = 537(0x219, float:7.52E-43)
            goto L_0x072b
        L_0x02a4:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 209(0xd1, float:2.93E-43)
            r5 = 209(0xd1, float:2.93E-43)
            goto L_0x072b
        L_0x02b1:
            r5 = 167(0xa7, float:2.34E-43)
            goto L_0x072b
        L_0x02b5:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            r0.equals()     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x02c6:
            java.lang.String r0 = "Login"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x02cc:
            r5 = 46
            goto L_0x072b
        L_0x02d0:
            return
        L_0x02d1:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 244(0xf4, float:3.42E-43)
            r5 = 244(0xf4, float:3.42E-43)
            goto L_0x072b
        L_0x02de:
            r5 = 649(0x289, float:9.1E-43)
            goto L_0x072b
        L_0x02e2:
            r5 = 196(0xc4, float:2.75E-43)
            goto L_0x072b
        L_0x02e6:
            java.lang.String r0 = "PAGE_NORMAL_LOGIN"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x02ec:
            r7.setMin = r8     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x072f }
            r7.setMin = r0     // Catch:{ all -> 0x072f }
            goto L_0x01a0
        L_0x0303:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 250(0xfa, float:3.5E-43)
            r5 = 250(0xfa, float:3.5E-43)
            goto L_0x072b
        L_0x0310:
            r5 = 598(0x256, float:8.38E-43)
            goto L_0x072b
        L_0x0314:
            r5 = 516(0x204, float:7.23E-43)
            goto L_0x072b
        L_0x0318:
            r5 = 17
            goto L_0x072b
        L_0x031c:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x032c
            if (r0 == r3) goto L_0x0326
            goto L_0x032c
        L_0x0326:
            r0 = 481(0x1e1, float:6.74E-43)
            r5 = 481(0x1e1, float:6.74E-43)
            goto L_0x072b
        L_0x032c:
            r0 = 427(0x1ab, float:5.98E-43)
            r5 = 427(0x1ab, float:5.98E-43)
            goto L_0x072b
        L_0x0332:
            r5 = 603(0x25b, float:8.45E-43)
            goto L_0x072b
        L_0x0336:
            r5 = 317(0x13d, float:4.44E-43)
            goto L_0x072b
        L_0x033a:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 285(0x11d, float:4.0E-43)
            r5 = 285(0x11d, float:4.0E-43)
            goto L_0x072b
        L_0x0347:
            r5 = 597(0x255, float:8.37E-43)
            goto L_0x072b
        L_0x034b:
            r5 = 655(0x28f, float:9.18E-43)
            goto L_0x072b
        L_0x034f:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 314(0x13a, float:4.4E-43)
            r5 = 314(0x13a, float:4.4E-43)
            goto L_0x072b
        L_0x035c:
            r5 = 261(0x105, float:3.66E-43)
            goto L_0x072b
        L_0x0360:
            r5 = 572(0x23c, float:8.02E-43)
            goto L_0x072b
        L_0x0364:
            r5 = 533(0x215, float:7.47E-43)
            goto L_0x072b
        L_0x0368:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 337(0x151, float:4.72E-43)
            r5 = 337(0x151, float:4.72E-43)
            goto L_0x072b
        L_0x0375:
            r5 = 480(0x1e0, float:6.73E-43)
            goto L_0x072b
        L_0x0379:
            r5 = 618(0x26a, float:8.66E-43)
            goto L_0x072b
        L_0x037d:
            r5 = 423(0x1a7, float:5.93E-43)
            goto L_0x072b
        L_0x0381:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 358(0x166, float:5.02E-43)
            r5 = 358(0x166, float:5.02E-43)
            goto L_0x072b
        L_0x038e:
            r5 = 532(0x214, float:7.45E-43)
            goto L_0x072b
        L_0x0392:
            r5 = 561(0x231, float:7.86E-43)
            goto L_0x072b
        L_0x0396:
            r5 = 536(0x218, float:7.51E-43)
            goto L_0x072b
        L_0x039a:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 383(0x17f, float:5.37E-43)
            r5 = 383(0x17f, float:5.37E-43)
            goto L_0x072b
        L_0x03a7:
            r5 = 599(0x257, float:8.4E-43)
            goto L_0x072b
        L_0x03ab:
            r5 = 608(0x260, float:8.52E-43)
            goto L_0x072b
        L_0x03af:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x03bf:
            r7.setMin = r12     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.APWebChromeClient r0 = (o.APWebChromeClient) r0     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r10 = r7.equals     // Catch:{ all -> 0x072f }
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r12 = r7.equals     // Catch:{ all -> 0x072f }
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12     // Catch:{ all -> 0x072f }
            r0.execute(r5, r10, r12)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x03e3:
            r5 = 198(0xc6, float:2.77E-43)
            goto L_0x072b
        L_0x03e7:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            r5 = 13
            if (r0 == r5) goto L_0x03f6
            r5 = 97
            r5 = 570(0x23a, float:7.99E-43)
            goto L_0x072b
        L_0x03f6:
            r0 = 340(0x154, float:4.76E-43)
            r5 = 340(0x154, float:4.76E-43)
            goto L_0x072b
        L_0x03fc:
            r5 = 45
            goto L_0x072b
        L_0x0400:
            r7.length(r5)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 422(0x1a6, float:5.91E-43)
            r5 = 422(0x1a6, float:5.91E-43)
            goto L_0x072b
        L_0x040d:
            r5 = 155(0x9b, float:2.17E-43)
            goto L_0x072b
        L_0x0411:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            r5 = 26
            if (r0 == r5) goto L_0x0422
            r5 = 37
            r0 = 517(0x205, float:7.24E-43)
            r5 = 517(0x205, float:7.24E-43)
            goto L_0x072b
        L_0x0422:
            r0 = 671(0x29f, float:9.4E-43)
            r5 = 671(0x29f, float:9.4E-43)
            goto L_0x072b
        L_0x0428:
            java.lang.String r0 = "faceAuthenticationModelM…heckRegistrationResponse)"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x042e:
            r7.setMin = r8     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x072f }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0444:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.inputFocus4Android r0 = (o.inputFocus4Android) r0     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x0454:
            java.lang.String r0 = "faceAuthenticationModel"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x045a:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            int r0 = super.hashCode()     // Catch:{ all -> 0x072f }
            r7.setMin = r0     // Catch:{ all -> 0x072f }
            goto L_0x01a0
        L_0x046c:
            r5 = 344(0x158, float:4.82E-43)
            goto L_0x072b
        L_0x0470:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 461(0x1cd, float:6.46E-43)
            r5 = 461(0x1cd, float:6.46E-43)
            goto L_0x072b
        L_0x047d:
            r5 = 153(0x99, float:2.14E-43)
            goto L_0x072b
        L_0x0481:
            r5 = 639(0x27f, float:8.95E-43)
            goto L_0x072b
        L_0x0485:
            java.lang.String r0 = "PAGE_MAIN_APP_REG_OTP_VERIFY"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x048b:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 467(0x1d3, float:6.54E-43)
            r5 = 467(0x1d3, float:6.54E-43)
            goto L_0x072b
        L_0x0498:
            r5 = 621(0x26d, float:8.7E-43)
            goto L_0x072b
        L_0x049c:
            r5 = 393(0x189, float:5.51E-43)
            goto L_0x072b
        L_0x04a0:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 515(0x203, float:7.22E-43)
            r5 = 515(0x203, float:7.22E-43)
            goto L_0x072b
        L_0x04ad:
            r5 = 172(0xac, float:2.41E-43)
            goto L_0x072b
        L_0x04b1:
            r5 = 424(0x1a8, float:5.94E-43)
            goto L_0x072b
        L_0x04b5:
            r5 = 287(0x11f, float:4.02E-43)
            goto L_0x072b
        L_0x04b9:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            r5 = 76
            if (r0 == r5) goto L_0x04ca
            r5 = 77
            r0 = 523(0x20b, float:7.33E-43)
            r5 = 523(0x20b, float:7.33E-43)
            goto L_0x072b
        L_0x04ca:
            r0 = 642(0x282, float:9.0E-43)
            r5 = 642(0x282, float:9.0E-43)
            goto L_0x072b
        L_0x04d0:
            o.ScreenBrightnessBridgeExtension r0 = o.ScreenBrightnessBridgeExtension.getMin     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x04d6:
            boolean r0 = o.ScreenBrightnessBridgeExtension.setMin()     // Catch:{ all -> 0x072f }
            r7.setMin = r0     // Catch:{ all -> 0x072f }
            goto L_0x01a0
        L_0x04de:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 530(0x212, float:7.43E-43)
            r5 = 530(0x212, float:7.43E-43)
            goto L_0x072b
        L_0x04eb:
            r5 = 10
            goto L_0x072b
        L_0x04ef:
            r5 = 666(0x29a, float:9.33E-43)
            goto L_0x072b
        L_0x04f3:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x0501
            if (r0 == r3) goto L_0x04fd
            goto L_0x0501
        L_0x04fd:
            r5 = 468(0x1d4, float:6.56E-43)
            goto L_0x072b
        L_0x0501:
            r0 = 258(0x102, float:3.62E-43)
            r5 = 258(0x102, float:3.62E-43)
            goto L_0x072b
        L_0x0507:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            r5 = 42
            if (r0 == r5) goto L_0x051b
            r5 = 86
            if (r0 == r5) goto L_0x0515
            goto L_0x051b
        L_0x0515:
            r0 = 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            goto L_0x072b
        L_0x051b:
            r0 = 650(0x28a, float:9.11E-43)
            r5 = 650(0x28a, float:9.11E-43)
            goto L_0x072b
        L_0x0521:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 560(0x230, float:7.85E-43)
            r5 = 560(0x230, float:7.85E-43)
            goto L_0x072b
        L_0x052e:
            r5 = 489(0x1e9, float:6.85E-43)
            goto L_0x072b
        L_0x0532:
            r5 = 675(0x2a3, float:9.46E-43)
            goto L_0x072b
        L_0x0536:
            r7.setMin = r8     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x072f }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x054c:
            r7.setMin = r8     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.AccelerometerForH5SensorService r0 = (o.AccelerometerForH5SensorService) r0     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            o.inputFocus4Android r5 = (o.inputFocus4Android) r5     // Catch:{ all -> 0x072f }
            r0.setMin = r5     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0563:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            o.AccelerometerForH5SensorService r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x0575:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.AccelerometerForH5SensorService r0 = (o.AccelerometerForH5SensorService) r0     // Catch:{ all -> 0x072f }
            o.setDomStorageEnabled r0 = r0.IsOverlapping     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x0587:
            r5 = 624(0x270, float:8.74E-43)
            goto L_0x072b
        L_0x058b:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            o.CompassSensorService$getMin r0 = r0.equals     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x059d:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.CompassSensorService$getMin r0 = (o.CompassSensorService.getMin) r0     // Catch:{ all -> 0x072f }
            r0.setMin()     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x05ae:
            r5 = 156(0x9c, float:2.19E-43)
            goto L_0x072b
        L_0x05b2:
            java.lang.String r0 = "merchantId"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x05b8:
            java.lang.String r0 = "merchantName"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x05be:
            java.lang.String r0 = "phoneNumber"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x05c4:
            r5 = 361(0x169, float:5.06E-43)
            goto L_0x072b
        L_0x05c8:
            java.lang.String r0 = "PAGE_RISK_TRUST_LOGIN"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x05ce:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 594(0x252, float:8.32E-43)
            r5 = 594(0x252, float:8.32E-43)
            goto L_0x072b
        L_0x05db:
            r5 = 263(0x107, float:3.69E-43)
            goto L_0x072b
        L_0x05df:
            r5 = 143(0x8f, float:2.0E-43)
            goto L_0x072b
        L_0x05e3:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x01d1
            goto L_0x01d4
        L_0x05ec:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x05fc
            if (r0 == r3) goto L_0x05f6
            goto L_0x05fc
        L_0x05f6:
            r0 = 264(0x108, float:3.7E-43)
            r5 = 264(0x108, float:3.7E-43)
            goto L_0x072b
        L_0x05fc:
            r0 = 220(0xdc, float:3.08E-43)
            r5 = 220(0xdc, float:3.08E-43)
            goto L_0x072b
        L_0x0602:
            java.lang.String r0 = "securityId"
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x0608:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            o.setEncryptProxy r0 = r0.getMax     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x061a:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.setEncryptProxy r0 = (o.setEncryptProxy) r0     // Catch:{ all -> 0x072f }
            java.lang.String r0 = r0.getAction()     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x062e:
            r7.length(r11)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 617(0x269, float:8.65E-43)
            r5 = 617(0x269, float:8.65E-43)
            goto L_0x072b
        L_0x063b:
            r5 = 359(0x167, float:5.03E-43)
            goto L_0x072b
        L_0x063f:
            r5 = 601(0x259, float:8.42E-43)
            goto L_0x072b
        L_0x0643:
            r5 = 266(0x10a, float:3.73E-43)
            goto L_0x072b
        L_0x0647:
            r5 = 174(0xae, float:2.44E-43)
            goto L_0x072b
        L_0x064b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x0651:
            o.AccelerometerForH5SensorService$setMax r0 = new o.AccelerometerForH5SensorService$setMax     // Catch:{ all -> 0x072f }
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            o.AccelerometerForH5SensorService r5 = (o.AccelerometerForH5SensorService) r5     // Catch:{ all -> 0x072f }
            r0.<init>(r5)     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x0666:
            o.AccelerometerForH5SensorService$setMin r0 = new o.AccelerometerForH5SensorService$setMin     // Catch:{ all -> 0x072f }
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            o.AccelerometerForH5SensorService r5 = (o.AccelerometerForH5SensorService) r5     // Catch:{ all -> 0x072f }
            r0.<init>(r5)     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x067b:
            r5 = 400(0x190, float:5.6E-43)
            goto L_0x072b
        L_0x067f:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == 0) goto L_0x068f
            if (r0 == r3) goto L_0x0689
            goto L_0x068f
        L_0x0689:
            r0 = 210(0xd2, float:2.94E-43)
            r5 = 210(0xd2, float:2.94E-43)
            goto L_0x072b
        L_0x068f:
            r0 = 631(0x277, float:8.84E-43)
            r5 = 631(0x277, float:8.84E-43)
            goto L_0x072b
        L_0x0695:
            r7.length(r10)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 != 0) goto L_0x072a
            r0 = 647(0x287, float:9.07E-43)
            r5 = 647(0x287, float:9.07E-43)
            goto L_0x072b
        L_0x06a2:
            r5 = 394(0x18a, float:5.52E-43)
            goto L_0x072b
        L_0x06a6:
            r5 = 534(0x216, float:7.48E-43)
            goto L_0x072b
        L_0x06aa:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x072f }
            r7.setMin = r0     // Catch:{ all -> 0x072f }
            goto L_0x01a0
        L_0x06bc:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            r5 = -1874218814(0xffffffff9049b0c2, float:-3.977643E-29)
            if (r0 == r5) goto L_0x06de
            r5 = -1473941087(0xffffffffa82571a1, float:-9.183979E-15)
            if (r0 == r5) goto L_0x06d9
            r5 = 520970604(0x1f0d616c, float:2.9938497E-20)
            if (r0 == r5) goto L_0x06d4
            r0 = 516(0x204, float:7.23E-43)
            goto L_0x0314
        L_0x06d4:
            r0 = 462(0x1ce, float:6.47E-43)
            r5 = 462(0x1ce, float:6.47E-43)
            goto L_0x072b
        L_0x06d9:
            r0 = 245(0xf5, float:3.43E-43)
            r5 = 245(0xf5, float:3.43E-43)
            goto L_0x072b
        L_0x06de:
            r0 = 589(0x24d, float:8.25E-43)
            r5 = 589(0x24d, float:8.25E-43)
            goto L_0x072b
        L_0x06e3:
            r7.setMin = r3     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x072f }
            o.onLocationResult r0 = r0.values     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x06f5:
            r7.setMin = r8     // Catch:{ all -> 0x072f }
            r7.length(r13)     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r7.equals     // Catch:{ all -> 0x072f }
            o.setSpeed r0 = (o.setSpeed) r0     // Catch:{ all -> 0x072f }
            r7.length(r12)     // Catch:{ all -> 0x072f }
            java.lang.Object r5 = r7.equals     // Catch:{ all -> 0x072f }
            java.lang.Object r0 = r0.apply(r5)     // Catch:{ all -> 0x072f }
            r7.toIntRange = r0     // Catch:{ all -> 0x072f }
            goto L_0x016d
        L_0x070e:
            r5 = 436(0x1b4, float:6.11E-43)
            goto L_0x072b
        L_0x0711:
            r5 = 68
            goto L_0x072b
        L_0x0714:
            r7.length(r3)     // Catch:{ all -> 0x072f }
            int r0 = r7.setMax     // Catch:{ all -> 0x072f }
            if (r0 == r12) goto L_0x0725
            r5 = 40
            if (r0 == r5) goto L_0x0720
            goto L_0x0725
        L_0x0720:
            r0 = 251(0xfb, float:3.52E-43)
            r5 = 251(0xfb, float:3.52E-43)
            goto L_0x072b
        L_0x0725:
            r0 = 396(0x18c, float:5.55E-43)
            r5 = 396(0x18c, float:5.55E-43)
            goto L_0x072b
        L_0x072a:
            r5 = r9
        L_0x072b:
            r10 = 480(0x1e0, float:6.73E-43)
            goto L_0x011e
        L_0x072f:
            r0 = move-exception
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r10 = 2419(0x973, float:3.39E-42)
            short r10 = (short) r10
            r12 = 13371(0x343b, float:1.8737E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r10, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r10 = 392(0x188, float:5.5E-43)
            if (r5 == 0) goto L_0x0757
            if (r9 < r4) goto L_0x0757
            r5 = 210(0xd2, float:2.94E-43)
            if (r9 > r5) goto L_0x0757
        L_0x0751:
            r5 = 392(0x188, float:5.5E-43)
        L_0x0753:
            r16 = 15
            goto L_0x08cb
        L_0x0757:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r12 = 2432(0x980, float:3.408E-42)
            short r12 = (short) r12
            r13 = 14148(0x3744, float:1.9826E-41)
            short r13 = (short) r13
            java.lang.String r5 = length(r5, r12, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0779
            r5 = 205(0xcd, float:2.87E-43)
            if (r9 < r5) goto L_0x0779
            r5 = 206(0xce, float:2.89E-43)
            if (r9 > r5) goto L_0x0779
            goto L_0x0751
        L_0x0779:
            r5 = 216(0xd8, float:3.03E-43)
            if (r9 < r5) goto L_0x0784
            r5 = 219(0xdb, float:3.07E-43)
            if (r9 > r5) goto L_0x0784
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0753
        L_0x0784:
            r5 = 221(0xdd, float:3.1E-43)
            if (r9 < r5) goto L_0x078f
            r5 = 224(0xe0, float:3.14E-43)
            if (r9 > r5) goto L_0x078f
            r5 = 578(0x242, float:8.1E-43)
            goto L_0x0753
        L_0x078f:
            r5 = 341(0x155, float:4.78E-43)
            if (r9 < r5) goto L_0x079a
            r5 = 344(0x158, float:4.82E-43)
            if (r9 > r5) goto L_0x079a
            r5 = 531(0x213, float:7.44E-43)
            goto L_0x0753
        L_0x079a:
            r5 = 432(0x1b0, float:6.05E-43)
            if (r9 < r5) goto L_0x07a3
            if (r9 > r2) goto L_0x07a3
            r5 = 391(0x187, float:5.48E-43)
            goto L_0x0753
        L_0x07a3:
            byte[] r5 = setMin
            byte r11 = r5[r6]
            byte r11 = (byte) r11
            r14 = 2427(0x97b, float:3.401E-42)
            short r14 = (short) r14
            r15 = 15
            byte r5 = r5[r15]
            short r5 = (short) r5
            java.lang.String r5 = length(r11, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x07c7
            r5 = 463(0x1cf, float:6.49E-43)
            if (r9 < r5) goto L_0x07c7
            r5 = 468(0x1d4, float:6.56E-43)
            if (r9 > r5) goto L_0x07c7
            goto L_0x0751
        L_0x07c7:
            byte[] r5 = setMin
            byte r5 = r5[r6]
            byte r5 = (byte) r5
            r11 = 2439(0x987, float:3.418E-42)
            short r11 = (short) r11
            r15 = 7187(0x1c13, float:1.0071E-41)
            short r15 = (short) r15
            java.lang.String r5 = length(r5, r11, r15)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x07ea
            r5 = 464(0x1d0, float:6.5E-43)
            if (r9 < r5) goto L_0x07ea
            r5 = 468(0x1d4, float:6.56E-43)
            if (r9 > r5) goto L_0x07ea
            goto L_0x0751
        L_0x07ea:
            r5 = 526(0x20e, float:7.37E-43)
            if (r9 < r5) goto L_0x07f6
            r5 = 531(0x213, float:7.44E-43)
            if (r9 > r5) goto L_0x07f6
            r5 = 648(0x288, float:9.08E-43)
            goto L_0x0753
        L_0x07f6:
            byte[] r5 = setMin
            byte r2 = r5[r6]
            byte r2 = (byte) r2
            r16 = 15
            byte r5 = r5[r16]
            short r5 = (short) r5
            java.lang.String r2 = length(r2, r14, r5)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x081c
            r2 = 561(0x231, float:7.86E-43)
            if (r9 < r2) goto L_0x081c
            r2 = 570(0x23a, float:7.99E-43)
            if (r9 > r2) goto L_0x081c
            r2 = 286(0x11e, float:4.01E-43)
            r5 = 286(0x11e, float:4.01E-43)
            goto L_0x0753
        L_0x081c:
            byte[] r2 = setMin
            byte r5 = r2[r6]
            byte r5 = (byte) r5
            r16 = 15
            byte r2 = r2[r16]
            short r2 = (short) r2
            java.lang.String r2 = length(r5, r14, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0840
            r2 = 564(0x234, float:7.9E-43)
            if (r9 < r2) goto L_0x0840
            r2 = 570(0x23a, float:7.99E-43)
            if (r9 > r2) goto L_0x0840
        L_0x083c:
            r5 = 392(0x188, float:5.5E-43)
            goto L_0x08cb
        L_0x0840:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            java.lang.String r2 = length(r2, r12, r13)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x085c
            r2 = 566(0x236, float:7.93E-43)
            if (r9 < r2) goto L_0x085c
            r2 = 570(0x23a, float:7.99E-43)
            if (r9 > r2) goto L_0x085c
            goto L_0x083c
        L_0x085c:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            r5 = 2428(0x97c, float:3.402E-42)
            short r5 = (short) r5
            r12 = r5 & 208(0xd0, float:2.91E-43)
            short r12 = (short) r12
            java.lang.String r2 = length(r2, r5, r12)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x087e
            r2 = 568(0x238, float:7.96E-43)
            if (r9 < r2) goto L_0x087e
            r2 = 569(0x239, float:7.97E-43)
            if (r9 > r2) goto L_0x087e
            goto L_0x083c
        L_0x087e:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            java.lang.String r2 = length(r2, r11, r15)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x089a
            r2 = 580(0x244, float:8.13E-43)
            if (r9 < r2) goto L_0x089a
            r2 = 589(0x24d, float:8.25E-43)
            if (r9 > r2) goto L_0x089a
            goto L_0x083c
        L_0x089a:
            byte[] r2 = setMin
            byte r2 = r2[r6]
            byte r2 = (byte) r2
            int r5 = setMax
            r5 = r5 | 2336(0x920, float:3.273E-42)
            short r5 = (short) r5
            r11 = 8656(0x21d0, float:1.213E-41)
            short r11 = (short) r11
            java.lang.String r2 = length(r2, r5, r11)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x08bf
            r2 = 581(0x245, float:8.14E-43)
            if (r9 < r2) goto L_0x08bf
            r2 = 582(0x246, float:8.16E-43)
            if (r9 > r2) goto L_0x08bf
            goto L_0x083c
        L_0x08bf:
            r2 = 672(0x2a0, float:9.42E-43)
            if (r9 < r2) goto L_0x08d6
            r2 = 675(0x2a3, float:9.46E-43)
            if (r9 > r2) goto L_0x08d6
            r2 = 139(0x8b, float:1.95E-43)
            r5 = 139(0x8b, float:1.95E-43)
        L_0x08cb:
            r7.toIntRange = r0
            r0 = 24
            r7.length(r0)
            r2 = 436(0x1b4, float:6.11E-43)
            goto L_0x072b
        L_0x08d6:
            throw r0
        L_0x08d7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x08df
            throw r1
        L_0x08df:
            goto L_0x08e1
        L_0x08e0:
            throw r0
        L_0x08e1:
            goto L_0x08e0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMax(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0135, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0160, code lost:
        r1.length(5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin() {
        /*
            r18 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r18
            r1.<init>(r2)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r4 = 2206(0x89e, float:3.091E-42)
            short r4 = (short) r4
            r5 = 13628(0x353c, float:1.9097E-41)
            short r5 = (short) r5
            java.lang.String r0 = length(r0, r4, r5)
            byte[] r4 = setMin
            r5 = 15
            byte r4 = r4[r5]
            byte r4 = (byte) r4
            r6 = r4 | 2457(0x999, float:3.443E-42)
            short r6 = (short) r6
            r7 = 5590(0x15d6, float:7.833E-42)
            short r7 = (short) r7
            java.lang.String r4 = length(r4, r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0360 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0360 }
            byte[] r4 = setMin     // Catch:{ all -> 0x0360 }
            r9 = 7217(0x1c31, float:1.0113E-41)
            byte r4 = r4[r9]     // Catch:{ all -> 0x0360 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0360 }
            r10 = 2442(0x98a, float:3.422E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0360 }
            int r11 = setMax     // Catch:{ all -> 0x0360 }
            r11 = r11 | 11522(0x2d02, float:1.6146E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0360 }
            java.lang.String r4 = length(r4, r10, r11)     // Catch:{ all -> 0x0360 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0360 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0360 }
            r12 = 7213(0x1c2d, float:1.0108E-41)
            byte r11 = r11[r12]     // Catch:{ all -> 0x0360 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0360 }
            r12 = 2453(0x995, float:3.437E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0360 }
            r13 = 1053(0x41d, float:1.476E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0360 }
            java.lang.String r11 = length(r11, r12, r13)     // Catch:{ all -> 0x0360 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x0360 }
            byte[] r13 = setMin     // Catch:{ all -> 0x0360 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0360 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0360 }
            int r14 = setMax     // Catch:{ all -> 0x0360 }
            r14 = r14 | 11522(0x2d02, float:1.6146E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0360 }
            java.lang.String r13 = length(r13, r10, r14)     // Catch:{ all -> 0x0360 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0360 }
            r12[r8] = r13     // Catch:{ all -> 0x0360 }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch:{ all -> 0x0360 }
            java.lang.Object r0 = r4.invoke(r0, r7)     // Catch:{ all -> 0x0360 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0360 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x007c:
            int r11 = r0.length
            if (r7 >= r11) goto L_0x0112
            r11 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0109 }
            r12[r8] = r11     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0109 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0109 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0109 }
            r13 = 2441(0x989, float:3.42E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0109 }
            int r14 = setMax     // Catch:{ all -> 0x0109 }
            r14 = r14 & 480(0x1e0, float:6.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0109 }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x0109 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0109 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0109 }
            r15 = 2451(0x993, float:3.435E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0109 }
            r3 = 13879(0x3637, float:1.9449E-41)
            short r3 = (short) r3     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = length(r14, r15, r3)     // Catch:{ all -> 0x0109 }
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ all -> 0x0109 }
            byte[] r15 = setMin     // Catch:{ all -> 0x0109 }
            byte r15 = r15[r9]     // Catch:{ all -> 0x0109 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0109 }
            int r5 = setMax     // Catch:{ all -> 0x0109 }
            r5 = r5 | 11522(0x2d02, float:1.6146E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x0109 }
            java.lang.String r5 = length(r15, r10, r5)     // Catch:{ all -> 0x0109 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0109 }
            r14[r8] = r5     // Catch:{ all -> 0x0109 }
            java.lang.reflect.Method r3 = r11.getMethod(r3, r14)     // Catch:{ all -> 0x0109 }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r12)     // Catch:{ all -> 0x0109 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0100 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0100 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0100 }
            int r12 = setMax     // Catch:{ all -> 0x0100 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0100 }
            java.lang.String r11 = length(r11, r13, r12)     // Catch:{ all -> 0x0100 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0100 }
            byte[] r12 = setMin     // Catch:{ all -> 0x0100 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0100 }
            int r12 = r12 - r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0100 }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0100 }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0100 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r3 = r11.invoke(r3, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0100 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0100 }
            r4[r7] = r3
            int r7 = r7 + 1
            r3 = 33
            r5 = 15
            goto L_0x007c
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0108
            throw r1
        L_0x0108:
            throw r0
        L_0x0109:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0111
            throw r1
        L_0x0111:
            throw r0
        L_0x0112:
            r3 = 60
            r5 = 28
            r7 = 42
        L_0x0118:
            int r10 = r8 + 1
            r11 = 71
            r0 = r4[r8]     // Catch:{ all -> 0x0227 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0227 }
            r8 = 14
            r12 = 21
            r13 = 5
            r14 = 4
            r15 = 3
            switch(r0) {
                case -24: goto L_0x0220;
                case -23: goto L_0x0210;
                case -22: goto L_0x01fb;
                case -21: goto L_0x01e9;
                case -20: goto L_0x01e5;
                case -19: goto L_0x01e1;
                case -18: goto L_0x01dd;
                case -17: goto L_0x01ce;
                case -16: goto L_0x01c1;
                case -15: goto L_0x01bb;
                case -14: goto L_0x01ba;
                case -13: goto L_0x01b6;
                case -12: goto L_0x01a1;
                case -11: goto L_0x0197;
                case -10: goto L_0x0195;
                case -9: goto L_0x0178;
                case -8: goto L_0x0165;
                case -7: goto L_0x015c;
                case -6: goto L_0x0159;
                case -5: goto L_0x0156;
                case -4: goto L_0x0148;
                case -3: goto L_0x013a;
                case -2: goto L_0x0131;
                case -1: goto L_0x012e;
                default: goto L_0x012c;
            }     // Catch:{ all -> 0x0227 }
        L_0x012c:
            goto L_0x0224
        L_0x012e:
            r8 = 60
            goto L_0x0118
        L_0x0131:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0227 }
            r1.setMin = r0     // Catch:{ all -> 0x0227 }
        L_0x0135:
            r1.length(r8)     // Catch:{ all -> 0x0227 }
            goto L_0x0224
        L_0x013a:
            r1.setMin = r6     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r12)     // Catch:{ all -> 0x0227 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0227 }
            b = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0224
        L_0x0148:
            r0 = 22
            r1.length(r0)     // Catch:{ all -> 0x0227 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0227 }
            if (r0 != 0) goto L_0x0224
            r0 = 27
            r8 = 27
            goto L_0x0118
        L_0x0156:
            r8 = 36
            goto L_0x0118
        L_0x0159:
            r8 = 34
            goto L_0x0118
        L_0x015c:
            java.lang.String r0 = "SMS_CODE"
            r1.toIntRange = r0     // Catch:{ all -> 0x0227 }
        L_0x0160:
            r1.length(r13)     // Catch:{ all -> 0x0227 }
            goto L_0x0224
        L_0x0165:
            r1.setMin = r6     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0227 }
            o.calculateDistance$getMin r0 = o.calculateDistance.getMin.forResendOtp(r0)     // Catch:{ all -> 0x0227 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0160
        L_0x0178:
            r1.setMin = r15     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0227 }
            o.parseFailed r0 = (o.parseFailed) r0     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x0227 }
            o.setGlobalUserData r8 = (o.setGlobalUserData) r8     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r12 = r1.equals     // Catch:{ all -> 0x0227 }
            r0.execute(r8, r12)     // Catch:{ all -> 0x0227 }
            goto L_0x0224
        L_0x0195:
            r8 = 1
            goto L_0x0118
        L_0x0197:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0227 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0227 }
            throw r0     // Catch:{ all -> 0x0227 }
        L_0x01a1:
            r1.length(r6)     // Catch:{ all -> 0x0227 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0227 }
            r8 = 20
            if (r0 == r8) goto L_0x01b2
            r8 = 62
            r0 = 38
            r8 = 38
            goto L_0x0118
        L_0x01b2:
            r8 = 71
            goto L_0x0118
        L_0x01b6:
            r8 = 33
            goto L_0x0118
        L_0x01ba:
            return
        L_0x01bb:
            int r0 = b     // Catch:{ all -> 0x0227 }
            r1.setMin = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0135
        L_0x01c1:
            r1.setMin = r6     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r12)     // Catch:{ all -> 0x0227 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0227 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0224
        L_0x01ce:
            r0 = 48
            r1.length(r0)     // Catch:{ all -> 0x0227 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0227 }
            if (r0 != 0) goto L_0x0224
            r0 = 59
            r8 = 59
            goto L_0x0118
        L_0x01dd:
            r8 = 73
            goto L_0x0118
        L_0x01e1:
            r8 = 28
            goto L_0x0118
        L_0x01e5:
            r8 = 65
            goto L_0x0118
        L_0x01e9:
            r1.setMin = r6     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0227 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0227 }
            o.calculateDistance r0 = r0.Mean$Arithmetic     // Catch:{ all -> 0x0227 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0160
        L_0x01fb:
            o.sendSensorResult$equals r0 = new o.sendSensorResult$equals     // Catch:{ all -> 0x0227 }
            r1.setMin = r6     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r8 = r1.equals     // Catch:{ all -> 0x0227 }
            o.sendSensorResult r8 = (o.sendSensorResult) r8     // Catch:{ all -> 0x0227 }
            r0.<init>(r8)     // Catch:{ all -> 0x0227 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0160
        L_0x0210:
            r1.setMin = r6     // Catch:{ all -> 0x0227 }
            r1.length(r15)     // Catch:{ all -> 0x0227 }
            r1.length(r14)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0227 }
            o.setGlobalUserData r0 = (o.setGlobalUserData) r0     // Catch:{ all -> 0x0227 }
            r1.toIntRange = r0     // Catch:{ all -> 0x0227 }
            goto L_0x0160
        L_0x0220:
            r8 = 42
            goto L_0x0118
        L_0x0224:
            r8 = r10
            goto L_0x0118
        L_0x0227:
            r0 = move-exception
            byte[] r8 = setMin
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            int r12 = setMax
            r12 = r12 | 2336(0x920, float:3.273E-42)
            short r12 = (short) r12
            r13 = 8656(0x21d0, float:1.213E-41)
            short r13 = (short) r13
            java.lang.String r8 = length(r8, r12, r13)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            r12 = 24
            r15 = 32
            if (r8 == 0) goto L_0x0252
            if (r10 < r6) goto L_0x0252
            r8 = 2
            if (r10 > r8) goto L_0x0252
        L_0x024c:
            r8 = 32
        L_0x024e:
            r16 = 15
            goto L_0x0353
        L_0x0252:
            byte[] r8 = setMin
            byte r6 = r8[r9]
            byte r6 = (byte) r6
            r14 = 2423(0x977, float:3.395E-42)
            short r14 = (short) r14
            r17 = 13891(0x3643, float:1.9465E-41)
            byte r8 = r8[r17]
            short r8 = (short) r8
            java.lang.String r6 = length(r6, r14, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0276
            r6 = 23
            if (r10 < r6) goto L_0x0276
            if (r10 > r12) goto L_0x0276
        L_0x0273:
            r8 = 64
            goto L_0x024e
        L_0x0276:
            byte[] r6 = setMin
            byte r6 = r6[r9]
            byte r6 = (byte) r6
            r8 = 2428(0x97c, float:3.402E-42)
            short r8 = (short) r8
            r12 = r8 & 208(0xd0, float:2.91E-43)
            short r12 = (short) r12
            java.lang.String r6 = length(r6, r8, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0296
            if (r10 < r5) goto L_0x0296
            r6 = 29
            if (r10 > r6) goto L_0x0296
            goto L_0x024c
        L_0x0296:
            byte[] r6 = setMin
            byte r5 = r6[r9]
            byte r5 = (byte) r5
            byte r6 = r6[r17]
            short r6 = (short) r6
            java.lang.String r5 = length(r5, r14, r6)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02b3
            r5 = 29
            if (r10 < r5) goto L_0x02b3
            if (r10 > r15) goto L_0x02b3
            goto L_0x0273
        L_0x02b3:
            byte[] r5 = setMin
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r14 = 2427(0x97b, float:3.401E-42)
            short r14 = (short) r14
            r16 = 15
            byte r5 = r5[r16]
            short r5 = (short) r5
            java.lang.String r5 = length(r6, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02d8
            r5 = 30
            if (r10 < r5) goto L_0x02d8
            if (r10 > r15) goto L_0x02d8
        L_0x02d4:
            r8 = 64
            goto L_0x0353
        L_0x02d8:
            r5 = 39
            if (r10 < r5) goto L_0x02e4
            if (r10 > r7) goto L_0x02e4
            r5 = 74
            r8 = 74
            goto L_0x0353
        L_0x02e4:
            byte[] r5 = setMin
            byte r5 = r5[r9]
            byte r5 = (byte) r5
            int r6 = setMax
            r6 = r6 | 2336(0x920, float:3.273E-42)
            short r6 = (short) r6
            java.lang.String r5 = length(r5, r6, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0303
            if (r10 < r7) goto L_0x0303
            if (r10 > r3) goto L_0x0303
        L_0x0300:
            r8 = 32
            goto L_0x0353
        L_0x0303:
            byte[] r5 = setMin
            byte r5 = r5[r9]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r8, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x031f
            r5 = 55
            if (r10 < r5) goto L_0x031f
            r5 = 56
            if (r10 > r5) goto L_0x031f
            goto L_0x02d4
        L_0x031f:
            byte[] r5 = setMin
            byte r5 = r5[r9]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r8, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0339
            r5 = 66
            if (r10 < r5) goto L_0x0339
            if (r10 > r11) goto L_0x0339
            goto L_0x02d4
        L_0x0339:
            byte[] r5 = setMin
            byte r5 = r5[r9]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r8, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x035f
            r5 = 69
            if (r10 < r5) goto L_0x035f
            if (r10 > r11) goto L_0x035f
            goto L_0x0300
        L_0x0353:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r5 = 28
            r6 = 1
            goto L_0x0118
        L_0x035f:
            throw r0
        L_0x0360:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0368
            throw r1
        L_0x0368:
            goto L_0x036a
        L_0x0369:
            throw r0
        L_0x036a:
            goto L_0x0369
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMin():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x030c, code lost:
        if (r11 <= 53) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x032d, code lost:
        if (r11 <= 53) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x034b, code lost:
        if (r11 <= 61) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0197, code lost:
        r1.length(14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x034f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(@org.jetbrains.annotations.NotNull o.setEncryptProxy r18) {
        /*
            r17 = this;
            o.GyroscopeSensorService r1 = new o.GyroscopeSensorService
            r2 = r17
            r0 = r18
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r0)
            byte[] r0 = setMin
            r3 = 33
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            r3 = r0 | 2188(0x88c, float:3.066E-42)
            short r3 = (short) r3
            r4 = 14913(0x3a41, float:2.0898E-41)
            short r4 = (short) r4
            java.lang.String r0 = length(r0, r3, r4)
            byte[] r3 = setMin
            r4 = 15
            byte r3 = r3[r4]
            byte r3 = (byte) r3
            r4 = r3 | 2457(0x999, float:3.443E-42)
            short r4 = (short) r4
            r5 = 5590(0x15d6, float:7.833E-42)
            short r5 = (short) r5
            java.lang.String r3 = length(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0381 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0381 }
            byte[] r3 = setMin     // Catch:{ all -> 0x0381 }
            r7 = 7217(0x1c31, float:1.0113E-41)
            byte r3 = r3[r7]     // Catch:{ all -> 0x0381 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0381 }
            r8 = 2442(0x98a, float:3.422E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0381 }
            int r9 = setMax     // Catch:{ all -> 0x0381 }
            r9 = r9 | 11522(0x2d02, float:1.6146E-41)
            short r9 = (short) r9     // Catch:{ all -> 0x0381 }
            java.lang.String r3 = length(r3, r8, r9)     // Catch:{ all -> 0x0381 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0381 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0381 }
            r10 = 7213(0x1c2d, float:1.0108E-41)
            byte r9 = r9[r10]     // Catch:{ all -> 0x0381 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0381 }
            r10 = 2453(0x995, float:3.437E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0381 }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0381 }
            java.lang.String r9 = length(r9, r10, r11)     // Catch:{ all -> 0x0381 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0381 }
            byte[] r11 = setMin     // Catch:{ all -> 0x0381 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0381 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0381 }
            int r12 = setMax     // Catch:{ all -> 0x0381 }
            r12 = r12 | 11522(0x2d02, float:1.6146E-41)
            short r12 = (short) r12     // Catch:{ all -> 0x0381 }
            java.lang.String r11 = length(r11, r8, r12)     // Catch:{ all -> 0x0381 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0381 }
            r10[r6] = r11     // Catch:{ all -> 0x0381 }
            java.lang.reflect.Method r3 = r3.getMethod(r9, r10)     // Catch:{ all -> 0x0381 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x0381 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0381 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007e:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x010f
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0106 }
            r10[r6] = r9     // Catch:{ all -> 0x0106 }
            byte[] r9 = setMin     // Catch:{ all -> 0x0106 }
            byte r9 = r9[r7]     // Catch:{ all -> 0x0106 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0106 }
            r11 = 2441(0x989, float:3.42E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0106 }
            int r12 = setMax     // Catch:{ all -> 0x0106 }
            r12 = r12 & 480(0x1e0, float:6.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0106 }
            java.lang.String r9 = length(r9, r11, r12)     // Catch:{ all -> 0x0106 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0106 }
            r12 = 74
            byte r12 = (byte) r12     // Catch:{ all -> 0x0106 }
            r13 = 2451(0x993, float:3.435E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0106 }
            r14 = 13879(0x3637, float:1.9449E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x0106 }
            java.lang.String r12 = length(r12, r13, r14)     // Catch:{ all -> 0x0106 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0106 }
            byte[] r14 = setMin     // Catch:{ all -> 0x0106 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0106 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0106 }
            int r15 = setMax     // Catch:{ all -> 0x0106 }
            r15 = r15 | 11522(0x2d02, float:1.6146E-41)
            short r15 = (short) r15     // Catch:{ all -> 0x0106 }
            java.lang.String r14 = length(r14, r8, r15)     // Catch:{ all -> 0x0106 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0106 }
            r13[r6] = r14     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x0106 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0106 }
            byte[] r10 = setMin     // Catch:{ all -> 0x00fd }
            byte r10 = r10[r7]     // Catch:{ all -> 0x00fd }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00fd }
            int r13 = setMax     // Catch:{ all -> 0x00fd }
            r13 = r13 & 480(0x1e0, float:6.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = length(r10, r11, r13)     // Catch:{ all -> 0x00fd }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00fd }
            byte[] r11 = setMin     // Catch:{ all -> 0x00fd }
            byte r11 = r11[r7]     // Catch:{ all -> 0x00fd }
            int r11 = r11 - r4
            byte r11 = (byte) r11     // Catch:{ all -> 0x00fd }
            r13 = 2450(0x992, float:3.433E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x00fd }
            r14 = 13885(0x363d, float:1.9457E-41)
            short r14 = (short) r14     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = length(r11, r13, r14)     // Catch:{ all -> 0x00fd }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x00fd }
            java.lang.Object r9 = r10.invoke(r9, r12)     // Catch:{ all -> 0x00fd }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00fd }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00fd }
            r3[r5] = r9
            int r5 = r5 + 1
            goto L_0x007e
        L_0x00fd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0105
            throw r1
        L_0x0105:
            throw r0
        L_0x0106:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x010e
            throw r1
        L_0x010e:
            throw r0
        L_0x010f:
            r9 = 7
        L_0x0110:
            int r11 = r6 + 1
            r12 = 19
            r13 = 48
            r14 = 22
            r15 = 21
            r10 = 14
            r5 = 3
            r0 = r3[r6]     // Catch:{ all -> 0x0201 }
            int r0 = r1.length(r0)     // Catch:{ all -> 0x0201 }
            r6 = 2
            r8 = 4
            switch(r0) {
                case -23: goto L_0x01ec;
                case -22: goto L_0x01e8;
                case -21: goto L_0x01e5;
                case -20: goto L_0x01d8;
                case -19: goto L_0x01cb;
                case -18: goto L_0x01c6;
                case -17: goto L_0x01c2;
                case -16: goto L_0x01be;
                case -15: goto L_0x01ba;
                case -14: goto L_0x01ad;
                case -13: goto L_0x01a0;
                case -12: goto L_0x019b;
                case -11: goto L_0x0187;
                case -10: goto L_0x0184;
                case -9: goto L_0x016d;
                case -8: goto L_0x0157;
                case -7: goto L_0x014d;
                case -6: goto L_0x013e;
                case -5: goto L_0x013b;
                case -4: goto L_0x0138;
                case -3: goto L_0x0137;
                case -2: goto L_0x012d;
                case -1: goto L_0x012a;
                default: goto L_0x0128;
            }     // Catch:{ all -> 0x0201 }
        L_0x0128:
            goto L_0x01fe
        L_0x012a:
            r6 = 55
            goto L_0x0110
        L_0x012d:
            r0 = 8
            r1.length(r0)     // Catch:{ all -> 0x0201 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0201 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0201 }
            throw r0     // Catch:{ all -> 0x0201 }
        L_0x0137:
            return
        L_0x0138:
            r6 = 84
            goto L_0x0110
        L_0x013b:
            r6 = 11
            goto L_0x0110
        L_0x013e:
            r1.length(r4)     // Catch:{ all -> 0x0201 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0201 }
            if (r0 == r12) goto L_0x0148
            r5 = 36
            goto L_0x0110
        L_0x0148:
            r0 = 58
            r6 = 58
            goto L_0x0110
        L_0x014d:
            java.lang.String r0 = "<set-?>"
            r1.toIntRange = r0     // Catch:{ all -> 0x0201 }
            r0 = 5
            r1.length(r0)     // Catch:{ all -> 0x0201 }
            goto L_0x01fe
        L_0x0157:
            r1.setMin = r6     // Catch:{ all -> 0x0201 }
            r1.length(r5)     // Catch:{ all -> 0x0201 }
            r1.length(r8)     // Catch:{ all -> 0x0201 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0201 }
            r1.length(r8)     // Catch:{ all -> 0x0201 }
            java.lang.Object r6 = r1.equals     // Catch:{ all -> 0x0201 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0201 }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch:{ all -> 0x0201 }
            goto L_0x01fe
        L_0x016d:
            r1.setMin = r6     // Catch:{ all -> 0x0201 }
            r1.length(r5)     // Catch:{ all -> 0x0201 }
            r1.length(r8)     // Catch:{ all -> 0x0201 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0201 }
            o.sendSensorResult r0 = (o.sendSensorResult) r0     // Catch:{ all -> 0x0201 }
            r1.length(r8)     // Catch:{ all -> 0x0201 }
            java.lang.Object r6 = r1.equals     // Catch:{ all -> 0x0201 }
            o.setEncryptProxy r6 = (o.setEncryptProxy) r6     // Catch:{ all -> 0x0201 }
            r0.getMax = r6     // Catch:{ all -> 0x0201 }
            goto L_0x01fe
        L_0x0184:
            r6 = 29
            goto L_0x0110
        L_0x0187:
            r1.setMin = r4     // Catch:{ all -> 0x0201 }
            r1.length(r5)     // Catch:{ all -> 0x0201 }
            r1.length(r8)     // Catch:{ all -> 0x0201 }
            java.lang.Object r0 = r1.equals     // Catch:{ all -> 0x0201 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x0201 }
            r1.setMin = r0     // Catch:{ all -> 0x0201 }
        L_0x0197:
            r1.length(r10)     // Catch:{ all -> 0x0201 }
            goto L_0x01fe
        L_0x019b:
            int r0 = b     // Catch:{ all -> 0x0201 }
            r1.setMin = r0     // Catch:{ all -> 0x0201 }
            goto L_0x0197
        L_0x01a0:
            r1.setMin = r4     // Catch:{ all -> 0x0201 }
            r1.length(r5)     // Catch:{ all -> 0x0201 }
            r1.length(r15)     // Catch:{ all -> 0x0201 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0201 }
            ICustomTabsCallback = r0     // Catch:{ all -> 0x0201 }
            goto L_0x01fe
        L_0x01ad:
            r1.length(r13)     // Catch:{ all -> 0x0201 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0201 }
            if (r0 != 0) goto L_0x01fe
            r0 = 52
            r6 = 52
            goto L_0x0110
        L_0x01ba:
            r6 = 9
            goto L_0x0110
        L_0x01be:
            r6 = 53
            goto L_0x0110
        L_0x01c2:
            r6 = 60
            goto L_0x0110
        L_0x01c6:
            int r0 = ICustomTabsCallback     // Catch:{ all -> 0x0201 }
            r1.setMin = r0     // Catch:{ all -> 0x0201 }
            goto L_0x0197
        L_0x01cb:
            r1.setMin = r4     // Catch:{ all -> 0x0201 }
            r1.length(r5)     // Catch:{ all -> 0x0201 }
            r1.length(r15)     // Catch:{ all -> 0x0201 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0201 }
            b = r0     // Catch:{ all -> 0x0201 }
            goto L_0x01fe
        L_0x01d8:
            r1.length(r14)     // Catch:{ all -> 0x0201 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0201 }
            if (r0 != 0) goto L_0x01fe
            r0 = 81
            r6 = 81
            goto L_0x0110
        L_0x01e5:
            r6 = 7
            goto L_0x0110
        L_0x01e8:
            r6 = 82
            goto L_0x0110
        L_0x01ec:
            r1.length(r4)     // Catch:{ all -> 0x0201 }
            int r0 = r1.setMax     // Catch:{ all -> 0x0201 }
            if (r0 == r5) goto L_0x01f8
            r5 = 6
            r6 = 18
            goto L_0x0110
        L_0x01f8:
            r0 = 12
            r6 = 12
            goto L_0x0110
        L_0x01fe:
            r6 = r11
            goto L_0x0110
        L_0x0201:
            r0 = move-exception
            r6 = 27
            if (r11 < r5) goto L_0x0214
            if (r11 > r9) goto L_0x0214
            r5 = 85
            r4 = 60
            r5 = 29
            r6 = 53
            r16 = 85
            goto L_0x0374
        L_0x0214:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r4 = 2428(0x97c, float:3.402E-42)
            short r4 = (short) r4
            r8 = r4 & 208(0xd0, float:2.91E-43)
            short r8 = (short) r8
            java.lang.String r5 = length(r5, r4, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x023d
            r5 = 13
            if (r11 < r5) goto L_0x023d
            if (r11 > r10) goto L_0x023d
        L_0x0233:
            r4 = 60
            r5 = 29
            r6 = 53
        L_0x0239:
            r16 = 28
            goto L_0x0374
        L_0x023d:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r9 = 2439(0x987, float:3.418E-42)
            short r9 = (short) r9
            r13 = 7187(0x1c13, float:1.0071E-41)
            short r13 = (short) r13
            java.lang.String r5 = length(r5, r9, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0266
            if (r11 < r10) goto L_0x0266
            r5 = 18
            if (r11 > r5) goto L_0x0266
        L_0x025c:
            r4 = 60
            r5 = 29
            r6 = 53
        L_0x0262:
            r16 = 1
            goto L_0x0374
        L_0x0266:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r10 = 2432(0x980, float:3.408E-42)
            short r10 = (short) r10
            r14 = 14148(0x3744, float:1.9826E-41)
            short r14 = (short) r14
            java.lang.String r5 = length(r5, r10, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0288
            r5 = 16
            if (r11 < r5) goto L_0x0288
            r5 = 18
            if (r11 > r5) goto L_0x0288
            goto L_0x0233
        L_0x0288:
            r5 = 23
            if (r11 < r5) goto L_0x0298
            if (r11 > r6) goto L_0x0298
            r4 = 60
            r5 = 29
            r6 = 53
            r16 = 27
            goto L_0x0374
        L_0x0298:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r9, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02b0
            if (r11 < r12) goto L_0x02b0
            if (r11 > r6) goto L_0x02b0
            goto L_0x025c
        L_0x02b0:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            int r10 = setMax
            r10 = r10 | 2336(0x920, float:3.273E-42)
            short r10 = (short) r10
            r12 = 8656(0x21d0, float:1.213E-41)
            short r12 = (short) r12
            java.lang.String r5 = length(r5, r10, r12)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02d2
            r5 = 20
            if (r11 < r5) goto L_0x02d2
            if (r11 > r15) goto L_0x02d2
            goto L_0x025c
        L_0x02d2:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            java.lang.String r5 = length(r5, r4, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02ed
            r5 = 22
            if (r11 < r5) goto L_0x02ed
            if (r11 > r6) goto L_0x02ed
            goto L_0x025c
        L_0x02ed:
            byte[] r5 = setMin
            byte r5 = r5[r7]
            byte r5 = (byte) r5
            r6 = 2427(0x97b, float:3.401E-42)
            short r6 = (short) r6
            r10 = 14097(0x3711, float:1.9754E-41)
            short r10 = (short) r10
            java.lang.String r5 = length(r5, r6, r10)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0312
            r5 = 29
            if (r11 < r5) goto L_0x0314
            r6 = 53
            if (r11 > r6) goto L_0x0314
        L_0x030e:
            r4 = 60
            goto L_0x0239
        L_0x0312:
            r5 = 29
        L_0x0314:
            byte[] r6 = setMin
            byte r6 = r6[r7]
            byte r6 = (byte) r6
            java.lang.String r6 = length(r6, r9, r13)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0330
            r6 = 48
            if (r11 < r6) goto L_0x0330
            r6 = 53
            if (r11 > r6) goto L_0x0332
            goto L_0x030e
        L_0x0330:
            r6 = 53
        L_0x0332:
            byte[] r9 = setMin
            byte r9 = r9[r7]
            byte r9 = (byte) r9
            java.lang.String r4 = length(r9, r4, r8)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x034f
            r4 = 60
            if (r11 < r4) goto L_0x0351
            r8 = 61
            if (r11 > r8) goto L_0x0351
            goto L_0x0262
        L_0x034f:
            r4 = 60
        L_0x0351:
            byte[] r8 = setMin
            byte r8 = r8[r7]
            byte r8 = (byte) r8
            r9 = r8 | 2368(0x940, float:3.318E-42)
            short r9 = (short) r9
            r10 = 11228(0x2bdc, float:1.5734E-41)
            short r10 = (short) r10
            java.lang.String r8 = length(r8, r9, r10)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0380
            r8 = 76
            if (r11 < r8) goto L_0x0380
            r8 = 77
            if (r11 > r8) goto L_0x0380
            goto L_0x0239
        L_0x0374:
            r1.toIntRange = r0
            r0 = 24
            r1.length(r0)
            r6 = r16
            r4 = 1
            goto L_0x010f
        L_0x0380:
            throw r0
        L_0x0381:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0389
            throw r1
        L_0x0389:
            goto L_0x038b
        L_0x038a:
            throw r0
        L_0x038b:
            goto L_0x038a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.setMin(o.setEncryptProxy):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<setEncryptProxy, Unit> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ String $merchantName;
        final /* synthetic */ String $phoneNumber;
        final /* synthetic */ sendSensorResult this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(sendSensorResult sendsensorresult, String str, String str2, String str3) {
            super(1);
            this.this$0 = sendsensorresult;
            this.$merchantId = str;
            this.$merchantName = str2;
            this.$phoneNumber = str3;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setEncryptProxy) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setEncryptProxy setencryptproxy) {
            Intrinsics.checkNotNullParameter(setencryptproxy, "it");
            sendSensorResult.setMax(this.this$0).dismissProgress();
            this.this$0.setMin(setencryptproxy);
            sendSensorResult sendsensorresult = this.this$0;
            String securityId = sendsensorresult.length().getSecurityId();
            if (securityId == null) {
                securityId = "";
            }
            sendSensorResult.getMin(sendsensorresult, securityId);
            if (sendSensorResult.setMin(this.this$0)) {
                sendSensorResult.getMax(this.this$0);
                return;
            }
            sendSensorResult sendsensorresult2 = this.this$0;
            sendsensorresult2.setMax(this.$merchantId, this.$merchantName, this.$phoneNumber, sendSensorResult.getMin(sendsensorresult2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ boolean $fromBoku;
        final /* synthetic */ sendSensorResult this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(sendSensorResult sendsensorresult, boolean z) {
            super(1);
            this.this$0 = sendsensorresult;
            this.$fromBoku = z;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.$fromBoku) {
                sendSensorResult.setMax(this.this$0).length(z, this.this$0.length().getLocalPhoneNumber());
                return;
            }
            sendSensorResult.setMax(this.this$0).getMin(this.this$0.length(), z, sendSensorResult.getMin(this.this$0), sendSensorResult.toIntRange(this.this$0), sendSensorResult.equals(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ sendSensorResult this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(sendSensorResult sendsensorresult) {
            super(1);
            this.this$0 = sendsensorresult;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            sendSensorResult.setMax(this.this$0).dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ String $merchantName;
        final /* synthetic */ sendSensorResult this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(sendSensorResult sendsensorresult, String str, String str2) {
            super(1);
            this.this$0 = sendsensorresult;
            this.$merchantId = str;
            this.$merchantName = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.NOT_INDONESIA_NUMBER) != false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.RISK_CONSULT_REJECT) != false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.ACCESS_TOKEN_NOT_ACTIVE) != false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
            o.sendSensorResult.setMax(r5.this$0).onError(r6.getMessage());
            r5.this$0.setMax(r6.getMessage(), r0);
            r5.this$0.getMin(id.dana.data.tracker.TrackerDataKey.NetworkErrorOperationTypeProperty.CHECK_PHONE_NUMBER_AND_SEND_OTP, r6.getMessage(), r6.getMessage(), r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f5, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.PHONE_NUMBER_HAS_BEEN_USED) != false) goto L_0x0100;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fe, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.ACCESS_TOKEN_ALIAS_HISTORY_EXIST) != false) goto L_0x0100;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0100, code lost:
            o.sendSensorResult.setMax(r5.this$0).onError(o.sendSensorResult.length(r5.this$0).getString(id.dana.R.string.error_number_used));
            r1 = r5.this$0;
            r1.setMax(o.sendSensorResult.length(r1).getString(id.dana.R.string.error_number_used), r0);
            r5.this$0.getMin(id.dana.data.tracker.TrackerDataKey.NetworkErrorOperationTypeProperty.CHECK_PHONE_NUMBER_AND_SEND_OTP, r6.getMessage(), o.sendSensorResult.length(r5.this$0).getString(id.dana.R.string.error_number_used), r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.TOO_MANY_REQUEST_VERIFICATION) != false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
            if (r3.equals(id.dana.constants.ErrorCode.PHONE_NUMBER_RISK_REJECTED) != false) goto L_0x008d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull java.lang.Throwable r6) {
            /*
                r5 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                o.sendSensorResult r0 = r5.this$0
                o.CompassSensorService$getMin r0 = o.sendSensorResult.setMax((o.sendSensorResult) r0)
                r0.dismissProgress()
                boolean r0 = r6 instanceof id.dana.data.base.NetworkException
                r1 = 2131887533(0x7f1205ad, float:1.9409676E38)
                java.lang.String r2 = "alipayplus.mobilewallet.user.checkRegisteredUserAndSendOTP"
                if (r0 == 0) goto L_0x016b
                r0 = r6
                id.dana.data.base.NetworkException r0 = (id.dana.data.base.NetworkException) r0
                java.lang.String r3 = r0.getErrorCode()
                if (r3 != 0) goto L_0x0022
                goto L_0x0137
            L_0x0022:
                int r4 = r3.hashCode()
                switch(r4) {
                    case -2024170142: goto L_0x00f8;
                    case -1818721359: goto L_0x00ef;
                    case -1814081712: goto L_0x00b2;
                    case -1814073964: goto L_0x0085;
                    case 279506027: goto L_0x004f;
                    case 408588712: goto L_0x0046;
                    case 408588739: goto L_0x003d;
                    case 408594416: goto L_0x0034;
                    case 1658411343: goto L_0x002b;
                    default: goto L_0x0029;
                }
            L_0x0029:
                goto L_0x0137
            L_0x002b:
                java.lang.String r4 = "AE15002058020037"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                goto L_0x008d
            L_0x0034:
                java.lang.String r4 = "AE15101858018666"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                goto L_0x008d
            L_0x003d:
                java.lang.String r4 = "AE15101858018092"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                goto L_0x008d
            L_0x0046:
                java.lang.String r4 = "AE15101858018086"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                goto L_0x008d
            L_0x004f:
                java.lang.String r4 = "AE15001858018099"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                o.sendSensorResult r1 = r5.this$0
                o.CompassSensorService$getMin r1 = o.sendSensorResult.setMax((o.sendSensorResult) r1)
                r1.getMin()
                o.sendSensorResult r1 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r1)
                r4 = 2131888307(0x7f1208b3, float:1.9411246E38)
                java.lang.String r3 = r3.getString(r4)
                r1.setMax((java.lang.String) r3, (id.dana.data.base.NetworkException) r0)
                o.sendSensorResult r0 = r5.this$0
                java.lang.String r1 = r6.getMessage()
                o.sendSensorResult r3 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r3)
                java.lang.String r3 = r3.getString(r4)
                r0.getMin(r2, r1, r3, r6)
                goto L_0x0191
            L_0x0085:
                java.lang.String r4 = "AE15112158052821"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
            L_0x008d:
                o.sendSensorResult r1 = r5.this$0
                o.CompassSensorService$getMin r1 = o.sendSensorResult.setMax((o.sendSensorResult) r1)
                java.lang.String r3 = r6.getMessage()
                r1.onError(r3)
                o.sendSensorResult r1 = r5.this$0
                java.lang.String r3 = r6.getMessage()
                r1.setMax((java.lang.String) r3, (id.dana.data.base.NetworkException) r0)
                o.sendSensorResult r0 = r5.this$0
                java.lang.String r1 = r6.getMessage()
                java.lang.String r3 = r6.getMessage()
                r0.getMin(r2, r1, r3, r6)
                goto L_0x0191
            L_0x00b2:
                java.lang.String r4 = "AE15112158052003"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                o.sendSensorResult r1 = r5.this$0
                o.CompassSensorService$getMin r1 = o.sendSensorResult.setMax((o.sendSensorResult) r1)
                r1.getMax()
                o.sendSensorResult r1 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r1)
                java.lang.Throwable r4 = new java.lang.Throwable
                r4.<init>()
                java.lang.String r3 = o.makeCenterView.length(r3, r4)
                r1.setMax((java.lang.String) r3, (id.dana.data.base.NetworkException) r0)
                o.sendSensorResult r0 = r5.this$0
                java.lang.String r1 = r6.getMessage()
                o.sendSensorResult r3 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r3)
                java.lang.Throwable r4 = new java.lang.Throwable
                r4.<init>()
                java.lang.String r3 = o.makeCenterView.length(r3, r4)
                r0.getMin(r2, r1, r3, r6)
                goto L_0x0191
            L_0x00ef:
                java.lang.String r4 = "AE15112158001822"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
                goto L_0x0100
            L_0x00f8:
                java.lang.String r4 = "AE15112001106211"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0137
            L_0x0100:
                o.sendSensorResult r1 = r5.this$0
                o.CompassSensorService$getMin r1 = o.sendSensorResult.setMax((o.sendSensorResult) r1)
                o.sendSensorResult r3 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r3)
                r4 = 2131886910(0x7f12033e, float:1.9408412E38)
                java.lang.String r3 = r3.getString(r4)
                r1.onError(r3)
                o.sendSensorResult r1 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r1)
                java.lang.String r3 = r3.getString(r4)
                r1.setMax((java.lang.String) r3, (id.dana.data.base.NetworkException) r0)
                o.sendSensorResult r0 = r5.this$0
                java.lang.String r1 = r6.getMessage()
                o.sendSensorResult r3 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r3)
                java.lang.String r3 = r3.getString(r4)
                r0.getMin(r2, r1, r3, r6)
                goto L_0x0191
            L_0x0137:
                o.sendSensorResult r3 = r5.this$0
                o.CompassSensorService$getMin r3 = o.sendSensorResult.setMax((o.sendSensorResult) r3)
                o.sendSensorResult r4 = r5.this$0
                android.content.Context r4 = o.sendSensorResult.length((o.sendSensorResult) r4)
                java.lang.String r4 = r4.getString(r1)
                r3.onError(r4)
                o.sendSensorResult r3 = r5.this$0
                android.content.Context r4 = o.sendSensorResult.length((o.sendSensorResult) r3)
                java.lang.String r4 = r4.getString(r1)
                r3.setMax((java.lang.String) r4, (id.dana.data.base.NetworkException) r0)
                o.sendSensorResult r0 = r5.this$0
                java.lang.String r3 = r6.getMessage()
                o.sendSensorResult r4 = r5.this$0
                android.content.Context r4 = o.sendSensorResult.length((o.sendSensorResult) r4)
                java.lang.String r1 = r4.getString(r1)
                r0.getMin(r2, r3, r1, r6)
                goto L_0x0191
            L_0x016b:
                o.sendSensorResult r0 = r5.this$0
                o.CompassSensorService$getMin r0 = o.sendSensorResult.setMax((o.sendSensorResult) r0)
                o.sendSensorResult r3 = r5.this$0
                android.content.Context r3 = o.sendSensorResult.length((o.sendSensorResult) r3)
                java.lang.String r3 = r3.getString(r1)
                r0.onError(r3)
                o.sendSensorResult r0 = r5.this$0
                java.lang.String r3 = r6.getMessage()
                o.sendSensorResult r4 = r5.this$0
                android.content.Context r4 = o.sendSensorResult.length((o.sendSensorResult) r4)
                java.lang.String r1 = r4.getString(r1)
                r0.getMin(r2, r3, r1, r6)
            L_0x0191:
                java.lang.String r0 = java.lang.String.valueOf(r6)
                java.lang.String r1 = "[CheckRegisteredPhoneNumber] checkRegister error: "
                java.lang.String r0 = r1.concat(r0)
                java.lang.String r1 = "DanaRegister"
                o.setStateOff.length(r1, r0, r6)
                o.sendSensorResult r6 = r5.this$0
                java.lang.String r0 = r5.$merchantId
                java.lang.String r1 = r5.$merchantName
                java.lang.String r2 = "Network Error"
                o.sendSensorResult.getMax(r6, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.toIntRange.invoke(java.lang.Throwable):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/onboarding/verify/VerifyPresenter$checkMobileDataPermission$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "accepted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ sendSensorResult getMax;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;

        setMax(sendSensorResult sendsensorresult, String str, String str2) {
            this.getMax = sendsensorresult;
            this.setMax = str;
            this.length = str2;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                sendSensorResult.toFloatRange(this.getMax);
            } else {
                sendSensorResult.getMin(this.getMax, this.setMax, this.length);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            sendSensorResult.setMax(this.getMax).onError(th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/onboarding/verify/VerifyPresenter$setMobileDataPermission$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "success", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<Boolean> {
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        toFloatRange() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/onboarding/verify/VerifyPresenter$resendOtp$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "onError", "", "e", "", "onNext", "response", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<setEncryptProxy> {
        final /* synthetic */ sendSensorResult getMax;

        equals(sendSensorResult sendsensorresult) {
            this.getMax = sendsensorresult;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setEncryptProxy setencryptproxy = (setEncryptProxy) obj;
            Intrinsics.checkNotNullParameter(setencryptproxy, "response");
            this.getMax.setMin(setencryptproxy);
            sendSensorResult.length(this.getMax, setencryptproxy.getRetrySendSeconds());
            sendSensorResult.getMin(this.getMax, setencryptproxy.getOtpCodeLength());
            this.getMax.length(false);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            sendSensorResult.setMin(this.getMax, th);
            setStateOff.length(DanaLogConstants.TAG.REGISTER_TAG, "[OtpRegister] send OTP error: ".concat(String.valueOf(th)), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"id/dana/onboarding/verify/VerifyPresenter$initFaceAuthManager$1", "Lid/dana/onboarding/verify/FaceLoginAuthCallback;", "doTrustRiskLogin", "", "faceOnlyLogin", "", "faceAuthenticationModel", "Lid/dana/model/FaceAuthenticationModel;", "onError", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements AccelerometerForH5SensorService.AnonymousClass1 {
        final /* synthetic */ sendSensorResult setMin;

        IsOverlapping(sendSensorResult sendsensorresult) {
            this.setMin = sendsensorresult;
        }

        public final void setMin(boolean z, @NotNull inputFocus4Android inputfocus4android) {
            Intrinsics.checkNotNullParameter(inputfocus4android, "faceAuthenticationModel");
            sendSensorResult.setMax(this.setMin).dismissProgress();
            sendSensorResult.setMax(this.setMin).getMax(z, sendSensorResult.IsOverlapping(this.setMin), this.setMin.length().getRegistrationSource(), inputfocus4android);
        }

        public final void length() {
            sendSensorResult.isInside(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/onboarding/verify/VerifyPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    static {
        Class<sendSensorResult> cls = sendSensorResult.class;
        byte[] bArr = new byte[15682];
        System.arraycopy("Q,®÷\të\u00153Â\u000bó\u00079åÝ\u0000\u0007þ\u0006õ\u0019ß\u0013í\u000f Í\u0015þõü\u000bú\u0001\të\u00153Â\u000bó\u00079åÛ\nÿí)Ú\u0001%é$Óú\u0007\nñ.Í\u0015þõü\u000bú\u0001\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\të\u00153Â\u000bó\u00079àÙ\t\u0000\u001cá\u0006ûú\u000fó-Í\u0015þõü\u000bú\u0001ü\u0005ÿû\u0006ù\u0003ø\fô\u0003\tú\u0001ý\bú\u0002ü\bû\u0000\u0000\u0005ó\u0006\u0007ó\u0005\bõ\u000bûù\u0006\u0006ûú\u0003\bù\u0000\u0007ùý\nûú\u0005\u0006õ\u000búû\u0001\n÷ü\rõ\u0007\u0004û\u0001\u0004ÿú\u0007úÿ\u0007ÿù\bÿø\tÿ÷\nÿö\u000bù\u0003÷\rû\u0001ý\u0007÷\u0001\bô\u0003\tô\u0000\fø\u0003\u0005ô\u0001\u000b÷\u0000\tùý\nó\u0005\bù\u0002\u0001\u0004ô\u0003\tó\u0006\u0007ó\u0005\bõ\u000bû\u0001û\tùü\u000bûû\núû\u0001\nûù\fù\u0000\u0007ûÿù\röý\rû\u0001ý\u0007ú\u0002\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006û\u0000\u0005ûú\u0007\u0004úü\nõ\u000bÿüþ\u0007ù\u0002\u0000\u0005ÿüý\bÿüü\tÿüû\nÿüú\u000bó\rû\u0001\u0004õ\u000bÿüù\fÿû\u0006ù\u0002ÿ\u0006ø\u0000\bøÿ\tûýþ\nûû\u0006\u0004û\u0001\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ú\u0006ÿû\u0000\u0006ÿûÿ\u0007ú\u0006ÿû\u0000\u0006ÿûþ\bÿüÿ\u0006ú\u0006ÿûý\tú\u0006ÿûü\nÿûû\u000bÿûú\fú\u0006ÿû\u0000\u0006ÿûÿ\u0007ú\u0006ÿû\u0000\u0006ûýý\u000bö\u0002\bÿûþ\bÿüÿ\u0006ÿûù\rÿ÷\nû\u0000\u0005ÿüþ\u0007úÿý\nÿú\u0003\u0004ûü\u0002\u0007ÿüý\bÿüÿ\u0006õ\u0000\u000bÿú\u0003ü\u0005û\u0000\u0005ÿû\u0006ú\u0006õ\u0004\u0007ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\f÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿô\rõ\u0002\tõ\u0001\nÿü\u0001\u0004ÿù\bÿü\u0000\u0005õ\u0000\u000bÿüÿ\u0006ùü\u000bÿüþ\u0007ÿüý\bõÿ\fÿüþ\u0007ÿö\u000búù\rÿüü\tÿüû\nõþ\rÿüú\u000bÿüû\nô\b\u0004ÿüù\fÿüø\rÿû\u0002\u0004úù\rÿüü\tÿüû\nõþ\rÿüú\u000bÿüû\nô\b\u0004ÿüù\fô\u0007\u0005õ\u000bÿüø\rô\u0006\u0006ÿüÿ\u0006ÿû\u0001\u0005ô\u0005\u0007ô\u0004\bô\u0003\tô\u0002\nô\u0001\u000bô\u0003\tô\u0000\fôÿ\rù\u0000\u0007ó\t\u0004ó\b\u0005öÿ\u000bó\u0007\u0006ó\u0006\u0007ó\u0005\bó\u0004\tó\u0003\nú\u0002\u0004ÿû\u0000\u0006úÿ\u0007ÿûÿ\u0007ÿûþ\bÿûý\tÿüû\nó\u0002\u000bÿûü\nÿüû\nù\u0003\u0004ÿûû\u000bó\u0001\fúü\nõ\u000bÿûú\fÿûù\ró\u0000\r÷\u0002\u0007ù\u0000\u0007ô\u0003\tûû\nô\u0003\tô\u0002\nû\u0001\u0000\u0004ô\u0000\fùý\nû\u0001ÿ\u0005ûû\nû\u0001þ\u0006õ\u000bùý\nöý\rùü\u000bù\u0000\u0007û\u0001ý\u0007ô\u0003\tû\u0001ü\bû\u0001û\tû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0003\u0004÷\u0005\u0004û\u0001\u0004ÿú\u0002\u0005ÿú\u0001\u0006ÿõ\fÿûù\rû\u0001ù\u000bó\u0006\u0007ø\u0003\u0005õ\u000bû\u0001ø\fùü\u000bøÿ\tû\u0001÷\rûú\u000bô\u0003\tû\u0000\u0001\u0004ø\u0002\u0006ûú\u000bû\u0001ý\u0007û\u0000\u0000\u0005û\u0001ü\bû\u0001û\tû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0003\u0004÷\u0005\u0004û\u0001\u0004ÿú\u0000\u0007ÿúÿ\bÿúþ\tÿö\u000bÿüû\nó\u0002\u000bÿûü\nÿüû\nù\u0003\u0004ÿûû\u000bÿûú\fú\u0006ÿúý\nÿúü\u000bú\u0006ÿúû\fúù\rÿúú\rû\u0000ÿ\u0006ÿù\u0004\u0004ÿù\u0003\u0005ÿö\u0003\u0004\u0003õ\u0005.Ï\u0000\u0011èü\u0005÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿû\u0006ÿú\u0007ù\u0003û\tú\u0002ù\u000bûû\nø\u0004\u0004ù\u0003ú\nû\u0001þ\u0006õ\u000bù\u0000\u0007ûû\nô\u0003\tûûÿ\u000búù\u0004\tøÿ\tú\u0002ù\u000bû\u0000ý\bø\u0003\u0005úÿ\u0002\u0005ó\u0006\u0007÷ü\røý\u000bÿù\b÷\u0005\u0004û\u0001\u0004ÿø\tÿ÷\nÿö\u000bÿö\u000bú\u0006ÿõ\fú\u0006ÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ù\u0003ù\u000bûú\u000bû\u0000ú\u000bûþ\u0000\u0007ûù\fûû\n÷þ\u000bó\u0006\u0007õ\u000bûÿù\rûû\nû\u0001þ\u0006õ\u000bûÿþ\bû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿüý\búÿ\u0007ÿüü\tÿüû\nÿüú\u000bÿüú\u000bû\u0000\u0005ÿüù\fÿüø\rÿû\u0002\u0004ÿüÿü\u0005ùÿ\u0001\u0007ÿû\u0006ùÿ\u0000\bÿû\u0006ÿú\u0007ùÿÿ\tûû\n÷\u0000\tø\u0003\u0005ô\u0001\u000b÷\u0000\tùÿþ\nùú\rø\u0000\bùû\fõ\u000búÿ\u0001\u0006ö\u0006\u0004ûÿÿ\u0007ûø\rû\u0001ú\nû\u0001\u0004ÿù\b÷\u0005\u0004û\u0001\u0004ÿø\tÿ÷\nÿö\u000bÿö\u000bÿú\u0007øû\rûû\nùÿ\bûù\fúù\u0002\u000bûù\u0001\u000bûû\nùÿý\u000bû\u0000\u0001\u0004õ\u000bùý\nûú\u000bú\u0001ù\fù\u0003ú\nûþÿ\bû\u0001\u0004ÿù\búÿ\u0007ÿõ\fÿô\rÿü\u0001\u0004ú\u0006ÿü\u0000\u0005ùÿü\fÿüÿ\u0006ÿüþ\u0007ÿüý\búù\rÿüü\tÿüû\nó\u0002\u000bÿüú\u000bÿüû\nÿüù\fû\u0000\u0005ÿüø\r÷\u0005\u0004úÿ\u0007õ\u000bÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0001\u0005ú\u0006ÿü\u0000\u0005ùÿü\fÿüÿ\u0006ÿüþ\u0007ùÿû\rûý\u0002\u0006ÿüý\bÿû\u0001\u0005ÿû\u0000ü\u0005ÿû\u0006ÿú\u0007ÿù\bÿø\tú\u0006ÿ÷\nÿö\u000bÿõ\fûú\u0007\u0004ÿô\rÿû\u0006ÿû\u0006ú\u0006ÿü\u0001\u0004ÿø\tú\u0006ÿü\u0000\u0005ÿüÿ\u0006ú\u0006ÿüþ\u0007ÿö\u000bú\u0006ÿüý\bû\u0000ü\tõ\u000bÿüü\tÿüû\n÷\u0003\u0006ûû\nó\u0006\u0007ø\u0003\u0005úù\u0004\tøÿ\töý\rû\u0001ý\u0007ú\u0002\u0004ÿüú\u000búÿ\u0007ÿüù\fÿüø\rÿû\u0002\u0004ó\u0000\rÿô\ró\rû\u0001\u0004õ\u000bÿû\u0001\u0005ÿû\u0000\u0006ùþ\u0005\u0004ó\u0006\u0007ø\u0003\u0005õ\u000búù\u0002\u000bøÿ\tûù\fûû\nô\u0003\tó\u0006\u0007ûú\u000b÷ÿ\nô\u0003\tô\u0000\fùý\nù\u0000\u0007ûû\nû\u0000ý\bø\u0003\u0005ûú\u0004\u0007÷ü\rõ\u0007\u0004û\u0001\u0004ÿûÿ\u0007úÿ\u0007ÿûþ\bÿûý\tÿûü\nÿûû\u000bú\u0006ÿüþ\u0007ÿö\u000bú\u0006ÿüý\bÿüü\tÿûú\fõÿ\fÿûù\rÿú\u0003\u0004ÿø\tÿú\u0002\u0005ÿö\u000bú\u0006ÿú\u0001\u0006ÿø\tú\u0006ÿú\u0000\u0007ÿû\u0000\u0006ùþ\u0004\u0005û\u0001ý\u0007ú\u0002ý\u0007ø\u0004\u0004ø\u0003\u0005ûþ\u0000\u0007ó\u0005\búÿ\u0002\u0005ú\u0000ú\fúù\u0004\tú\u0002ø\fùü\u000bù\u0000\u0007ûþ\u0003\u0004ûù\fûø\rû\u0001ú\nû\u0001\u0004ÿûÿ\u0007úÿ\u0007ÿúÿ\bÿúþ\tÿúý\nÿö\u000bú\u0006ÿú\u0001\u0006ÿø\tú\u0006ùþ\u0003\u0006ûø\t\u0004õ\u000bÿú\u0000\u0007û\u0000\u0005ÿúü\u000bÿû\u0000\u0006ûû\u0005\u0005ûû\nùÿ\bø\u0003\u0005úü\u0000\nöÿ\u000bûù\fó\u0006\u0007ù\u0000\u0007ûû\u0004\u0006ó\u0005\bõ\u000b÷ü\rú\u0002þ\u0006ú\u0002\u0004ÿûÿ\u0007÷\u0005\u0004û\u0001\u0004ÿúû\fÿúú\rÿù\u0004\u0004ùü\u000bÿûù\rÿûü\nÿû\u0006ÿû\u0000\u0006ù\u0001ý\tûû\nô\u0003\tó\u0006\u0007ûø\u0000\rû\u0001þ\u0006ø\u0002\u0006ûû\nû\u0000\u0001\u0004ûø\u0002\u000bùü\u000bú\u0002ø\føý\u000bÿûÿ\u0007÷\u0005\u0004û\u0001\u0004ÿù\u0003\u0005ÿù\u0002\u0006ÿûû\u000bÿû\u0002ü\u0005ÿû\u0006÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿú\u0007û\u0000\u0005úû\u000búü\nõ\u000bÿù\bÿø\tÿ÷\nú\u0006ÿö\u000bùþþ\u000bõ\u000bÿõ\fÿ÷\nûü\tÿô\rÿ÷\nú\u0006ÿö\u000bÿõ\fû\u0000\u0005ÿù\bô\u0006\u0006ÿô\rÿ÷\nÿü\u0001\u0004ùþý\fû\u0001ý\u0007ù\u0000\u0007÷þ\u000bû\u0000ø\r÷ü\rùü\u000b÷ü\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿüÿ\u0006ÿüþ\u0007ÿüý\bùü\u000bÿüü\tÿü\u0001\u0004ùþ\u0004\u0005ù\u0000\u0007ûÿ\u0002\u0004ú\u0000ú\fõ\u000bûú\u000bùý\nùü\u000bûù\u0001\u000bù\u0000\u0007ûû\n÷þ\u000bûú\u000b÷ÿ\n÷\u0000\tùý\nûû\nù\u0000\u0007û\u0000\u0001\u0004õ\u000bûü\u0001\bùü\u000bøÿ\töý\røý\u000bÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿüû\nÿüú\u000bÿüù\fõÿ\fÿüü\të\u00153Â\u000bó\u00079ëÛ\u0007ï\u001fîôü\u0010÷\u000bþü\u0005ÿû\u0006÷\u0005\u0004úÿ\u0007õ\u000bÿú\u0007õ\u0002\tó\u0002\u000bÿù\bÿø\tùü\u000bÿ÷\nú\u0006ÿö\u000bûø\u0005\bÿõ\fÿô\rÿü\u0001\u0004ûø\u0004\tûü\u0005\u0004ûú\u000bû\u0000ú\u000bø\u0002\u0006ûú\u000bø\u0003\u0005õ\u000bù\u0000\u0007ûø\u0003\nó\u0006\u0007ó\u0006\u0007ûø\u0002\u000bûø\u0001\fùý\nùü\u000bøÿ\tø\u0003\u0005ûú\u0004\u0007ûû\u0006\u0004û\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿüÿ\u0006ÿüþ\u0007ÿüý\bÿüü\tÿüû\nûüý\fûü\u0005\u0004ù\u0000\u0007ûü\u0004\u0005ûû\u0000\nó\u0006\u0007ûø\u0000\rûø\u0006\u0007ú\u0002\u0000\u0004ú\u0002ÿ\u0005ó\u0006\u0007ûü\u0003\u0006ú\u0002þ\u0006û\u0001ú\nû\u0001\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿüù\fÿüø\rÿû\u0006ÿü\u0001\u0004ûüý\fû\u0001ý\u0007ú\u0002ý\u0007ûú\u000bô\u0003\tó\u0006\u0007ø\u0003\u0005õ\u000bû\u0000ù\fó\u0005\bú\u0002ü\bù\u0000\u0007÷þ\u000bûü\u0003\u0006ú\u0002û\tùü\u000bû\u0001ý\u0007ù\u0000\u0007ú\u0002ú\nûû\u0003\u0007ú\u0002û\tû\u0001ý\u0007ú\u0002\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006ÿü\u0001\u0004øû\rú\u0002ù\u000bó\u0006\u0007ûÿ\u0001\u0005ûú\u000bùü\u000bú\u0002ø\fû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿûÿ\u0007ÿûþ\bÿûý\tÿüû\nûþ\u0007ú\u0002÷\ró\u0006\u0007ûú\u000bø\u0003\u0005ô\u0001\u000bô\u0003\tô\u0000\fú\u0001\u0001\u0004õ\u000bûø\u0006\u0007ú\u0001\u0000\u0005ùý\nûú\u0005\u0006ûú\u0004\u0007ó\u0003\nú\u0002\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿûü\nÿûû\u000bÿûú\fÿûù\ró\rõ\u0003\bÿú\u0003\u0004ÿü\u0001\u0004ú\u0001ÿ\u0006õ\u0007\u0004û\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿú\u0002\u0005ÿú\u0001\u0006ÿú\u0000\u0007õÿ\fÿúÿ\bÿúþ\tÿüû\nú\u0001þ\u0007ú\u0001ý\bó\u0004\t÷ü\røý\u000bÿüú\u000búÿ\u0007ÿúý\nÿúü\u000bÿúû\fÿúú\rûÿ\u0006ÿù\u0004\u0004ú\u0001ü\tÿù\u0003\u0005ùü\u000bÿù\u0002\u0006ÿüû\nú\u0001û\nû\u0001ý\u0007ù\u0000\u0007ú\u0002ú\nõ\u000bú\u0001ú\u000bó\u0006\u0007ûü\u0003\u0006ùü\u000bûù\u0006\u0006ú\u0001ù\fø\u0003\u0005ú\u0001ø\rû\u0001ý\u0007ú\u0002\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿù\u0001\u0007ÿù\u0000\bÿùÿ\tõ\u000bÿùþ\nÿü\u0001\u0004ú\u0000\u0002\u0004ûù\b\u0004ú\u0002ú\nó\u0004\tûû\u0006\u0004û\u0001\u0004ÿü\u0000\u0005úÿ\u0007ÿùý\u000bÿùü\fÿúú\rú\u0006ÿùû\rú\u0006ÿø\u0005\u0004ûø\u0005\bÿõ\fûú\u0000\u000bö\u0002\bÿø\u0004\u0005ÿûú\fû\u0000\u0005ú\u0000\u0001\u0005ûý\u0002\u0006ÿø\u0003\u0006ÿü\u0001\u0004ûýÿ\t÷þ\u000bûø\u0000\rûÿÿ\u0007ú\u0000\u0000\u0006ù\u0000\u0007ó\u0006\u0007ø\u0003\u0005õ\u000bú\u0000ÿ\u0007øÿ\töý\rû\u0001ý\u0007ú\u0002\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿø\u0002\u0007ÿø\u0001\bÿø\u0000\tú\u0000þ\bÿøÿ\nÿøþ\u000bÿøý\fÿøü\rÿ÷\u0006\u0004ú\u0000ý\tú\u0000ý\tú\u0000ü\nõ\u000bÿ÷\u0005\u0005ÿûù\rÿ÷\u0004\u0006ûþû\fõ\u000bÿú\u0003\u0004õÿ\fÿ÷\u0003\u0007ÿ÷\u0002\bû\u0000\u0005ÿø\u0003\u0006ÿü\u0001\u0004ú\u0000û\u000bú\u0000ú\fûÿú\fó\u0006\u0007ûø\u0000\rûø\u0006\u0007øÿ\tû\u0001ý\u0007ô\u0003\tó\u0006\u0007ó\u0005\bó\u0004\tûû\u0006\u0004û\u0001\u0004ÿü\u0000\u0005úÿ\u0007ÿ÷\u0001\tÿ÷\u0000\nÿ÷ÿ\u000bÿûù\rÿüû\nú\u0000ù\rûû\nûû\nû\u0000\u0001\u0004õ\u000bûú\u000bùý\nùü\u000bûù\u0001\u000búÿ\u0003\u0004û\u0000\u0001\u0004õ\u000bùý\nûú\u000bûû\nö\u0000\nûú\u0005\u0006úÿ\u0002\u0005úÿ\u0001\u0006û\u0001ý\u0007ú\u0002\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿ÷þ\fÿ÷ý\rÿö\u0007\u0004õÿ\fÿö\u0006\u0005ÿüû\núÿ\u0000\u0007ûû\nùý\nùü\u000bùû\fúÿÿ\bûú\u000bô\u0003\tó\u0006\u0007ûù\fû\u0000ù\f÷ü\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿüú\u000búÿ\u0007ÿö\u0005\u0006ÿö\u0004\u0007ÿö\u0003\bûýý\u000bÿö\u0002\tû\u0000\u0005û\u0000ü\tõ\u000bÿø\u0003\u0006ÿü\u0001\u0004ûü\t÷\u0002\u0007úÿþ\tó\u0005\bõ\u000bû\u0001û\tõ\u0007\u0004û\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿö\u0001\nÿö\u0000\u000bÿöÿ\fúÿý\nÿöþ\rÿüû\núÿü\u000bûü\u0005\u0004ûü\u0005\u0004ô\u0003\tô\u0002\nô\u0001\u000b÷þ\u000búÿû\fúÿ\u0002\u0005ûø\u0006\u0007ú\u0001\u0000\u0005ûú\u000bûù\fùý\nö\u0005\u0005û\u0001ú\nû\u0001\u0004ÿüú\u000búÿ\u0007ÿõ\b\u0004ÿõ\u0007\u0005ÿõ\u0006\u0006ÿõ\u0005\u0007ÿõ\u0004\bú\u0006ÿø\u0005\u0004ûø\u0005\bÿõ\fÿõ\u0003\tÿûù\rÿûù\rÿõ\u0002\nõÿ\fÿõ\u0001\u000b÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿ÷\u0005\u0005ÿüû\nö\u0004\u0006úÿú\rûú\u0005\u0006úþ\u0004\u0004ô\u0003\tû\u0000\u0001\u0004õ\u000búþ\u0003\u0005úþ\u0002\u0006õ\u000bù\u0000\u0007ûú\u000bùü\u000bøÿ\tö\u0005\u0005ú\u0002\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿõ\u0000\fÿõÿ\rÿúþ\tÿô\t\u0004õÿ\fÿù\u0002\u0006ÿû\u0000\u0006ÿô\b\u0005ÿô\u0007\u0006ÿô\u0006\u0007úþ\u0001\u0007ÿô\u0005\bù\u0002\u0005ÿô\u0004\tõ\u000bÿô\u0003\nÿü\u0001\u0004úþ\u0000\bû\u0000\u0000\u0005ó\u0006\u0007ó\u0005\bõ\u000bûÿ\u0002\u0004û\u0000ý\bø\u0003\u0005úÿ\u0002\u0005ó\u0006\u0007÷ü\rúþÿ\tù\u0000\u0007ùý\nöÿ\u000bø\u0003\u0005úþþ\nó\u0003\nú\u0002\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿô\u0002\u000bÿô\u0001\fÿô\u0000\rú\u0000þ\bÿü\u0001\u0000\u0004ÿøþ\u000bÿü\u0001ÿ\u0005ÿü\u0001þ\u0006ÿ÷\u0006\u0004÷\u0005\u0004ú\u0000ý\tûû\núþý\u000bõ\u000búþü\fø\u0003\u0005ûø\u0002\u000bùý\nöý\rõ\u000bÿú\u0003\u0004ÿö\u0003\bÿô\b\u0005ÿô\u0007\u0006ÿô\u0006\u0007úþû\rúý\u0005\u0004ó\u0002\u000bÿô\u0005\bÿô\u0003\nûþü\u000bÿü\u0001ý\u0007ÿü\u0001\u0004úý\u0004\u0005ù\u0000\u0007ûû\nô\u0003\tûûÿ\u000bõ\u000bûú\u000bø\u0003\u0005õ\u000búþü\fùþ\tùý\nùÿ\bø\u0003\u0005ûø\u0002\u000bùü\u000bú\u0002ø\fõ\u0007\u0004û\u0001\u0004ÿü\u0000\u0005úÿ\u0007ÿü\u0001ü\bÿü\u0001û\tÿü\u0001ú\nÿü\u0001ù\u000bû\u0000\u0005ÿø\u0003\u0006ÿü\u0001ø\fÿú\u0000\u0007û\u0000\u0005ÿø\u0003\u0006ÿü\u0001÷\rõ\u000bÿü\u0000\u0001\u0004û\u0000ü\tõ\u000bÿü\u0000\u0000\u0005ÿü\u0000ÿ\u0006ÿü\u0000þ\u0007ÿûù\rÿöÿ\fÿü\u0000ý\bùü\u000bÿõ\u0001\u000bÿü\u0000ü\tÿü\u0001\u0004úý\u0003\u0006ô\u0004\bø\u0004\u0004ø\u0003\u0005õ\u000búý\u0002\u0007õ\u000bú\u0000ÿ\u0007ú\u0002\u0000\u0004ûÿ\u0002\u0004ûú\u000bø\u0003\u0005ûü\u0000\töý\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿü\u0000û\nÿü\u0000ú\u000bÿü\u0000ù\fÿü\u0000ø\rô\b\u0004ó\u0002\u000bÿüÿ\u0002\u0004ú\u0006ÿüÿ\u0001\u0005úý\u0001\bÿüÿ\u0000\u0006ÿüÿÿ\u0007û\u0000\u0005ÿø\u0003\u0006ùü\u000bÿ÷\u0003\u0007ú\u0006ÿüÿþ\bÿüÿý\tÿüÿü\nÿûù\rúù\rÿüÿû\u000bÿü\u0000ø\rõþ\rÿüÿú\fÿü\u0000ø\rô\b\u0004ÿüÿù\rÿü\u0000ø\rÿüþ\u0003\u0004ú\u0000þ\bÿüþ\u0002\u0005ÿøþ\u000bÿüþ\u0001\u0006ÿüþ\u0000\u0007ÿ÷\u0006\u0004ùü\u000bÿö\u0006\u0005ÿ÷ÿ\u000bÿüþÿ\bÿõ\u0006\u0006ÿüþþ\tûüþ\u000bÿöþ\rÿüþý\nó\rû\u0001\u0004õ\u000bÿ÷\u0006\u0004ó\u0002\u000bÿüþü\u000bÿü\u0000ø\rú\u0006ÿüþû\fÿüþú\rúý\u0000\tÿüý\u0004\u0004ÿüý\u0003\u0005ÿüý\u0002\u0006ûþû\fõ\u000bÿüý\u0001\u0007ÿüý\u0000\búýþ\u000bÿö\u0002\tÿüýÿ\tô\b\u0004ÿüýþ\nÿõ\u0005\u0007ô\b\u0004ÿüýý\u000bÿüýü\fú\u0006ÿùû\rú\u0006ÿø\u0005\u0004úù\rõþ\rÿõ\fÿø\u0004\u0005ùü\u000bÿúÿ\bÿüýû\rÿü\u0001÷\rõ\u000bÿü\u0000\u0001\u0004ÿüü\u0005\u0004ÿüü\u0004\u0005ÿüü\u0003\u0006ÿûù\rÿø\u0000\túýý\fÿüü\u0002\u0007ÿüü\u0001\búýü\rÿù\u0004\u0004ú\u0006ÿüÿ\u0001\u0005ú\u0006ÿüü\u0000\tú\u0006ÿüþû\fÿüüÿ\núý\u0000\tÿüüþ\u000bûü\tÿù\u0003\u0005õÿ\fÿ÷\nó\rõ\u0003\bÿüüý\fû\u0000\u0005úü\u0006\u0004õ\u000bÿø\u0003\u0006ûú\u0007\u0004ÿü\u0001ý\u0007ÿüüüü\u0005ú\u0006ÿû\u0006úù\rÿú\u0007ÿù\bÿø\tÿ÷\núù\u0007\u0006ø\u0003\u0005õ\u000bûû\n÷þ\u000bó\u0006\u0007õ\u000bûÿù\rû\u0001ý\u0007ú\u0002ú\nõ\u000bû\u0001û\tõ\u0007\u0004û\u0001\u0004ÿö\u000búÿ\u0007ÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006õÿ\fÿüþ\u0007ÿüÿ\u0006õÿ\fÿüý\bû\u0000\u0005ÿüü\tÿüû\nùü\u000bÿüý\bÿ÷\nûû\u0005\u0005ûû\núÿ\u0003\u0004ó\u0006\u0007ø\u0003\u0005ûþ\u0000\u0007ø\u0003\u0005ûÿú\fó\u0006\u0007ó\b\u0005ùü\u000bøÿ\tù\u0000\u0007ûø\u0007\u0006ø\u0003\u0005úÿ\u0002\u0005ûú\u000böÿ\u000bö\u0005\u0005û\u0001ú\nû\u0001\u0004ÿö\u000búÿ\u0007ÿüú\u000bÿüù\fÿüø\rú\u0006õÿ\fÿû\u0002\u0004ÿû\u0001\u0005ùü\u000bÿüþ\u0007ÿû\u0000\u0006ÿûÿ\u0007ÿ÷\núù\u0006\u0007úþý\u000búÿ\u0002\u0005ùý\nöý\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿö\u000b÷\u0005\u0004û\u0001\u0004ÿûþ\bÿûý\tÿûü\núù\rÿûû\u000bÿûú\fÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0001\u0006ÿú\u0000\u0007úú\u0002\nÿúÿ\bÿúþ\tÿúý\núù\u0005\bù\u0000\u0007ûû\nô\u0003\tô\u0000\fø\u0003\u0005û\u0001\u0000\u0004ó\u0006\u0007ûú\u000bôÿ\rù\u0000\u0007ûû\n÷þ\u000bó\u0006\u0007úù\u0004\tøÿ\tûþÿ\bû\u0001\u0004ÿúü\u000búÿ\u0007ÿúû\fÿúú\rÿù\u0004\u0004ÿù\u0003\u0005ú\u0006õÿ\fÿû\u0002\u0004ÿû\u0001\u0005úù\rÿù\u0002\u0006ÿù\u0001\u0007ÿù\u0000\bÿùÿ\tÿ÷\núù\u0003\núþü\fûù\fúù\u0002\u000bûù\u0001\u000bù\u0000\u0007úù\u0001\föþ\fú\u0001ø\rõ\u0007\u0004û\u0001\u0004ÿö\u000búÿ\u0007ÿùþ\nÿùý\u000bÿü\u0000\u0005÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿùü\fÿüø\rúù\u0000\rÿùû\rù\u0003\u0000\u0004õ\u000bÿø\u0005\u0004ù\u0003ÿ\u0005ÿúÿ\bÿü\u0001\u0004ù\u0003þ\u0006ÿùû\r÷\u0005\u0004÷\u0004\u0005ÿø\u0005\u0004ÿø\u0004\u0005ÿ÷\nù\u0003ý\u0007ù\u0003ü\bûø\u0002\u000bû\u0001÷\ró\u0006\u0007ùþ\tùý\nû\u0001ý\u0007ô\u0003\tú\u0001ý\bõ\u000bûù\u0006\u0006÷ü\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿö\u000b÷\u0005\u0004û\u0001\u0004ÿø\u0003\u0006ÿø\u0002\u0007ÿø\u0004\u0005û\u0000\u0005ÿüü\u0002ý\u0010ü\u0005õÿ\fÿû\u0006úù\rÿú\u0007õþ\rÿù\bõ\u000bÿø\tùü\u000bÿ÷\nÿö\u000bù\u0002þ\u0007ù\u0000\u0007ûû\nù\u0000\u0007ûû\nûü\u0004\u0005ûú\u000bùý\nùü\u000bøÿ\tø\u0003\u0005õ\u000bù\u0000\u0007ûû\nø\u0004\u0004ø\u0003\u0005ûþ\u0000\u0007ù\u0002ý\bùü\u000bøÿ\tø\u0003\u0005õ\u000bù\u0002ü\tú\u0002\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿô\rÿü\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004úÿ\u0007õ\u000bÿüÿ\u0006ÿö\u000bù\u0002û\nù\u0002ú\u000b÷þ\u000bó\u0006\u0007õ\u000bû\u0001þ\u0006õ\u000bùÿ\bø\u0003\u0005õ\u000bûú\u000bùý\nù\u0000\u0007ûû\nù\u0000\u0007ó\u0006\u0007ø\u0003\u0005õ\u000bú\u0000ÿ\u0007ù\u0002ù\fú\u0002\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿüþ\u0007ÿüý\bÿüü\tùü\u000bÿüû\nÿö\u000bù\u0002ø\rû\u0001ú\nû\u0001\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿüú\u000bÿüù\fÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ù\u0002\u0005ÿû\u0000\u0006õ\u000bÿûÿ\u0007ÿù\bõ\u000bÿûþ\bÿüø\rÿûý\túù\rù\u0001\u0002\u0004ÿûü\nù\u0001\u0001\u0005ÿûû\u000bÿûú\fô\b\u0004ÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0001\u0006ÿú\u0000\u0007ÿúÿ\bÿúþ\tÿúý\nÿüü\tÿö\u000bù\u0001\u0000\u0006ûû\n÷þ\u000bû\u0001þ\u0006ô\u0001\u000b÷þ\u000bûú\u000bùý\nø\u0003\u0005õ\u000bó\t\u0004ó\u0006\u0007õ\u000bûú\u000búûÿ\fûû\nù\u0000\u0007ùý\nùü\u000bùû\fõ\u000bù\u0000\u0007úÿ\u0001\u0006û\u0001ý\u0007ú\u0002\u0004ÿõ\fúÿ\u0007ÿúü\u000bÿúû\fÿúú\rÿù\u0004\u0004ù\u0001ÿ\u0007ú\u0002ù\u000bû\u0000ý\bø\u0003\u0005õ\u000bù\u0001þ\búþ\u0002\u0006õ\u000bûü\u0001\bùü\u000bøÿ\tûþÿ\bû\u0001\u0004ÿù\u0003\u0005÷\u0005\u0004û\u0001\u0004ÿù\u0002\u0006ÿù\u0001\u0007ÿù\u0000\bÿö\u000bù\u0001ý\tûû\nô\u0003\tó\u0006\u0007û\u0001þ\u0006õ\u000búü\u0003\u0007úÿû\fúù\u0004\tøÿ\tö\u0005\u0005û\u0001ú\nû\u0001\u0004ÿõ\fúÿ\u0007ÿùÿ\tÿùþ\nÿùý\u000bÿö\u000bù\u0001ü\nù\u0000\u0007ûû\nù\u0003ü\búú\u0001\u000búÿ\u0002\u0005ú\u0000ú\fõ\u000bù\u0001û\u000bûÿ\u0002\u0004ûü\u0004\u0005ù\u0000\u0007ûø\u0006\u0007ú\u0002ø\fû\u0001ý\u0007ú\u0002\u0004ÿõ\fúÿ\u0007ÿùü\fÿùû\rÿø\u0005\u0004ÿø\u0004\u0005÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿø\u0003\u0006úý\u0000\tù\u0001ú\fÿø\u0002\u0007ó\u0002\u000bÿø\u0001\búù\rÿù\bÿø\u0000\tó\rû\u0001\u0004õ\u000bÿø\u0003\u0006ÿøÿ\nÿøþ\u000bÿû\u0002\u0004ÿû\u0001\u0005ÿûÿ\u0007ú\u0000ý\tù\u0001ù\rõ\u000bÿø\u0003\u0006úù\rÿøý\fÿøü\rÿ÷\u0006\u0004ÿù\u0004\u0004ù\u0000\u0003\u0004ûú\u000bø\u0003\u0005õ\u000bú\u0000ú\fúü\u0000\nûû\nûú\u000bø\u0003\u0005õ\u000bûÿþ\bû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿù\u0003\u0005÷\u0005\u0004û\u0001\u0004ÿ÷\u0005\u0005ÿ÷\u0004\u0006ÿ÷\u0003\u0007ÿù\u0004\u0004ù\u0000\u0002\u0005úÿþ\tû\u0000ø\r÷ü\rú\u0002û\tøý\u000bÿù\u0003\u0005÷\u0005\u0004û\u0001\u0004ÿ÷\u0002\bÿ÷\u0001\tÿûý\tÿ÷\u0000\nÿö\u000bù\u0000\u0001\u0006û\u0000\u0001\u0004õ\u000bûú\u000bø\u0000\bùû\fõ\u000bûø\u0003\nô\u0000\fø\u0003\u0005õ\u000bó\u0005\b÷þ\u000bûú\u000búüÿ\u000bûý\u0004\u0004øÿ\tø\u0003\u0005õ\u000bù\u0002ü\tú\u0002\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿ÷ÿ\u000bÿ÷þ\fÿ÷ý\rÿö\u0007\u0004úù\rÿö\u0006\u0005ô\b\u0004ÿù\bõ\u000bÿö\u0005\u0006÷\u0003\u0006ÿö\u0004\u0007ùü\u000bÿö\u0003\bó\rû\u0001\u0004õ\u000bÿö\u0002\tÿö\u0001\nÿúý\nù\u0000\u0000\u0007ÿö\u0004\u0007õÿ\fÿö\u0000\u000bÿ÷\u0003\u0007ûþý\nÿöÿ\fÿúý\nÿöþ\rÿõ\b\u0004ÿö\u000bù\u0000ÿ\bûû\núþ\u0002\u0006õ\u000bù\u0000\u0007ûø\u0006\u0007øÿ\töý\rõ\u0007\u0004û\u0001\u0004ÿõ\fúÿ\u0007ÿõ\u0007\u0005ÿõ\u0006\u0006ÿø\u0004\u0005ùü\u000bÿö\u0000\u000b÷\u0005\u0004÷\u0004\u0005ÿõ\u0005\u0007õÿ\fÿ÷\nÿùý\u000búý\u0000\tûÿý\tÿøý\fÿõ\u0004\bÿõ\u0003\tÿõ\u0002\nù\u0000ý\nÿûù\rÿú\u0003\u0004ÿõ\u0001\u000bÿõ\u0000\fÿõÿ\rúý\u0000\tÿô\t\u0004ÿô\b\u0005ÿô\u0007\u0006ÿô\u0006\u0007ÿö\u000b÷\u0003\u0006ù\u0002ú\u000b÷þ\u000bûú\u000b÷ÿ\nô\u0003\tô\u0000\fôÿ\rûÿù\rûþÿ\bû\u0001\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿô\u0005\bÿô\u0004\tÿøþ\u000bú\u0006ÿô\u0003\nÿô\u0002\u000bÿô\u0001\fù\u0000ü\u000bÿô\u0000\rÿúú\rûþþ\tÿöÿ\fùü\u000bÿû\u0006ÿù\u0000\búù\rÿö\u0006\u0005ú\u0006ÿô\u0003\nÿü\u0001\u0000\u0004ÿü\u0001ÿ\u0005ÿü\u0001þ\u0006÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿüÿ\u0006ÿü\u0001ý\u0007ÿúý\nõÿ\fÿüû\nõÿ\fÿö\u0003\bû\u0000\u0005ÿü\u0001ü\búû\u0003\bÿøý\fû\u0000ü\tõ\u000bÿü\u0001û\tÿü\u0001ú\nÿü\u0001ùü\u0005ÿû\u0006ú\u0006ÿú\u0007û\u0000ü\tõ\u000bÿù\bÿø\túüý\rù\u0000\u0007ûû\núû\u0001\nø\u0003\u0005úÿ\u0002\u0005ûø\u0003\nó\u0006\u0007ó\u0006\u0007úù\u0004\tøÿ\tûü\u0005\u0004úþý\u000bõ\u000bù\u0000\u0007ûÿþ\bøý\u000bÿ÷\núÿ\u0007ÿö\u000bÿõ\fÿô\rû\u0000\u0005ÿü\u0001\u0004ÿü\u0000\u0005ú\u0006ÿú\u0007ÿù\bÿû\u0006ùú\u0004\tÿüÿ\u0006ÿû\u0006ùû\b\u0004ÿüÿ\u0006ó\rû\u0001\u0004õ\u000bÿüþ\të\u00153Â\u000bó\u00079éÍ\u0015þõü\u000bú\u0001\të\u00153¹\u0001\u000bý>âãöÿü\u0005ÿû\u0006ûú\u0007\u0004ù\u0000\u0007ûÿ\u0002\u0004ûÿÿ\u0007ù\u0000\u0007ú\u0000ú\fûø\u0002\u000bûø\rû\u0001ú\nû\u0001\u0004ÿú\u0007úÿ\u0007ÿù\bÿø\tÿ÷\nÿö\u000bú\u0006ÿõ\fù\u0002\u0000\u0005ûý\u0003\u0005ûø\t\u0004õ\u000bÿô\rÿü\u0001\u0004ÿû\u0006ùýÿ\u000bû\u0000\u0001\u0004õ\u000bûú\u000bùý\nûú\u0005\u0006úÿÿ\bûú\u000bû\u0000ú\u000bõ\u000bùýþ\fûû\nûü\u0004\u0005ûø\u0006\u0007ú\u0002ø\fû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿü\u0001\u0004ú\u0006ÿõ\fÿô\rùü\u000bÿüý\bõÿ\fÿüý\bû\u0000\u0005ÿüü\t÷\u0005\u0004÷\u0004\u0005ÿüû\nÿü\u0001\u0004ÿ÷ü\u0005ÿû\u0006ÿû\u0006úú\u0005\u0007ÿú\u0007úú\u0004\bÿú\u0007ó\rû\u0001\u0004õ\u000bÿù\bÿø\tÿ÷\nûú\u0000\u000bû\u0001ý\u0007ô\u0003\tú\u0001ý\bùú\rø\u0000\bøÿ\tûýþ\n÷ü\rùü\u000bú\u0001ú\u000bó\u0006\u0007ó\u0005\bó\u0004\t÷ü\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿö\u000b÷\u0005\u0004û\u0001\u0004ÿõ\fÿô\rÿü\u0001\u0004ú\u0006ÿü\u0000\u0005úù\rú\u0006ÿüÿ\u0006ÿüþ\u0007õþ\rÿüý\bøû\rûý\u0003\u0005ûý\u0002\u0006ÿüü\tû\u0000\u0005ÿüû\nú\u0006ÿü\u0000\u0005úú\u0003\tÿüÿ\u0006ÿüþ\u0007õþ\rÿüý\bÿüü\tÿûü\u0005ÿû\u0006ú\u0006ÿú\u0007û\u0000ü\tõ\u000bÿù\bøû\rÿø\tÿ÷\nû\u0000\u0005ÿö\u000bÿõ\fúÿý\nÿø\tÿô\rùýý\rúü\u0002\bø\u0003\u0005õ\u000búþü\fø\u0003\u0005úü\u0000\nûý\u0004\u0004ùû\fùü\u0007\u0004û\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿü\u0001\u0004úÿ\u0007ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿô\rûü\u0002\u0007û\u0001ý\u0007ûù\u0007\u0005ó\u0006\u0007û\u0001þ\u0006ô\u0001\u000bô\u0003\tùü\u0006\u0005ó\u0005\bùú\rùý\nöÿ\u000bûù\fó\u0006\u0007û\u0001û\tøý\u000bÿü\u0001\u0004÷\u0005\u0004û\u0001\u0004ÿüý\bÿüü\tÿû\u0006ÿõ\fó\rõ\u0003\bÿüû\nú\u0006ÿú\u0007ÿù\bÿõ\nï\u0015ü\u0005õÿ\fÿû\u0006ûþû\fõ\u000bÿú\u0007ÿù\bûúþ\rûù\b\u0004ûù\u0007\u0005ô\u0002\nõ\u000bó\u0005\b÷\u0000\t÷ý\fûù\u0006\u0006÷ü\rû\u0001ý\u0007ú\u0002\u0004ÿø\túÿ\u0007ÿ÷\nÿö\u000bÿõ\fû\u0000\u0005ÿô\rÿü\u0001\u0004ú\u0006ÿü\u0000\u0005ÿüÿ\u0006ú\u0006ÿüþ\u0007ûù\u0005\u0007ÿüý\bûù\u0004\bÿüü\tÿù\bûù\u0003\tûù\u0002\nûù\u0001\u000bûù\u0000\fû\u0001ý\u0007÷þ\u000bó\u0005\bõ\u000bû\u0001û\tû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿø\t÷\u0005\u0004û\u0001\u0004ÿüû\nÿüú\u000bÿüù\fÿü\u0001\u0004ÿüø\rú\u0006ÿü\u0000\u0005ÿüÿ\u0006ú\u0006ÿüþ\u0007ÿüý\bûýý\u000bÿüü\tÿü\u0001\u0004ÿü\u0001\u0004û\u0000\u0005ûùÿ\rûø\t\u0004õ\u000bÿô\rÿû\u0002\u0004ùü\u000bÿûü\u0005ÿû\u0006ÿú\u0007ûû\u0005\u0005÷\u0002\u0007û\u0000\u0000\u0005ó\t\u0004ûú\u000bø\u0003\u0005õ\u000bûû\u0001\tó\u0006\u0007ù\u0000û\fûúÿ\fùý\nùü\u000bøÿ\tûÿ\u0001\u0005ù\u0000ú\ró\u0003\nú\u0002\u0004ÿù\búÿ\u0007ÿø\tÿ÷\nÿö\u000bõþ\rÿõ\fÿô\rú\u0006ÿü\u0001\u0004ùÿ\u0004\u0004úü\nõ\u000bÿü\u0000\u0005ÿû\u0006ùü\u000bÿüÿ\u0006ûþû\fõ\u000bÿüþ\u0007úû\u0005\u0006ÿüý\bÿüü\tû\u0000\u0005ù\u0002\u0005ÿüû\nõ\u000bÿüú\u000bõÿ\fÿüÿ\u0006ÿüù\fúù\rÿüø\rõþ\rÿû\u0002\u0004ÿû\u0001\u0005ûù\u0004\bÿüý\bÿû\u0000\u0006û\u0000\u0005ÿüú\u000bÿûÿ\u0007ùÿ\u0003\u0005ûû\nû\u0000\u0001\u0004õ\u000búù\u0002\u000bøÿ\tø\u0003\u0005õ\u000bûû\nô\u0003\tô\u0002\nõ\u000bûû\u0001\tô\u0000\fùÿ\u0002\u0006ô\u0003\tó\u0006\u0007û\u0000ø\r÷ü\rú\u0002û\tû\u0001ý\u0007ú\u0002\u0004ÿûþ\búÿ\u0007ÿûý\tÿûü\nÿûû\u000bõþ\rÿõ\fÿô\rú\u0006ÿü\u0001\u0004ÿü\u0000\u0005ÿû\u0006ÿûü\u0005ÿû\u0006ÿú\u0007ÿù\bùüþ\rûû\nù\u0000\u0007ûû\nô\u0003\tó\u0006\u0007ûú\u000bø\u0003\u0005õ\u000bûû\u0001\tó\u0006\u0007ûú\u000bú\u0001\u0001\u0004õ\u000bûü\u0005\u0004÷þ\u000bó\u0006\u0007õ\u000bûú\u000böÿ\u000b÷\u0002\u0007ù\u0000\u0007÷þ\u000bó\u0005\bõ\u000bû\u0001û\tõ\u0007\u0004û\u0001\u0004ÿø\túÿ\u0007ÿ÷\nÿö\u000bÿõ\fÿú\u0007ùû\b\u0004ÿô\rûýý\u000bÿô\rû\u0000\u0005ÿü\u0001\u0004ÿü\u0000\u0005ÿú\u0007ú\u0006ÿüÿ\u0006ÿüþ\u0007ÿüý\bùû\u0007\u0005úÿþ\tûü\u0003\u0006ú\u0002û\tû\u0001ý\u0007ú\u0002\u0004ÿüü\t÷\u0005\u0004û\u0001\u0004ÿüû\nÿüú\u000bÿü\u0000\u0005ó\rû\u0001\u0004õ\u000bÿüù\fû\u0000\u0005ù\u0002\u0005ÿüø\rõ\u000bÿü\u0001\të\u00153Â\u000bó\u00079íÏ\u0000\u0011è&ß\u0005ý\r Í\u0015þõü\u000bú\u0001ü\u0005ÿû\u0006ÿú\u0007ú\u0006ÿù\bÿø\tÿ÷\nÿû\u0006úû\u0004\u0007ÿö\u000bú\u0006ÿù\bûù\u0005\u0007ÿø\tÿõ\fùþ\u0002\u0007ûû\nø\u0004\u0004ø\u0003\u0005ø\u0002\u0006ùþ\u0001\bõ\u000bûü\u0005\u0004ûú\u000bø\u0003\u0005õ\u000bùý\nöý\rúþÿ\túþ\u0002\u0006õ\u000bù\u0000\u0007ûú\u000böÿ\u000böý\røý\u000bÿô\r÷\u0005\u0004û\u0001\u0004ÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿõ\fûú\u0006\u0005ùþ\u0000\tô\u0003\tó\u0006\u0007ó\u0005\bó\u0004\t÷ü\rû\u0001ý\u0007ú\u0002\u0004ÿô\r÷\u0005\u0004û\u0001\u0004ÿüþ\u0007ÿüý\bÿ÷\nÿû\u0006û\u0000\u0005ÿüü\tùþÿ\nÿö\u000b÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿüûü\u0005õ\u0000\u000bÿû\u0006ÿú\u0007û\u0000\u0005ÿù\bû\u0000\u0005ù\u0002\u0005ÿø\tõ\u000bÿù\bõÿ\fÿ÷\nú\u0006úù\rû\u0000ÿ\u0006ÿö\u000bùü\u0005\u0006õ\u000bÿõ\fó\rõ\u0003\bÿô\rÿü\u0001\u0004ùþÿ\nÿû\u0006ÿü\u0000\u0005úú\u0002\nö\u0005\u0005û\u0001ú\nû\u0001\u0004ÿüÿ\u0006úÿ\u0007ÿüþ\u0007ÿüý\bÿüü\tÿú\u0007ùü\u000bÿ÷\núù\t\u0004ô\b\u0004ÿö\u000bÿõ\fÿü\u0000\u0005û\u0000þ\u0007öþ\fùü\u0004\u0007ùþ\tú\u0000\u0000\u0006úû\u0001\nø\u0003\u0005õ\u000bú\u0000ÿ\u0007ù\u0002ù\fû\u0001ú\nû\u0001\u0004ÿüÿ\u0006úÿ\u0007ÿüû\nÿüú\u000bÿüù\fÿüø\rÿú\u0007ÿúü\u0005ÿû\u0006û\u0000þ\u0007ûû\nû\u0000ý\bø\u0003\u0005õ\u000bó\u0006\u0007÷ü\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0007úÿ\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fù\u0002\u0005ÿô\rõ\u000bÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿüý\bÿ÷\nÿüü\tÿüû\nÿüú\u000bú\u0006ÿüù\fÿüø\rû\u0000ü\tõ\u000bÿû\u0002\u0004õÿ\fÿû\u0001\u0005ÿû\u0000\u0006÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿûÿ\u0007ÿûþ\bÿüû\nÿüú\u000bú\u0006ÿüù\fÿüø\rÿû\u0002\u0004ÿû\u0006øû\rû\u0001ý\u0007û\u0000û\nû\u0000ú\u000bõ\u000bû\u0000ù\fû\u0000ø\rûÿ\u0002\u0004ùý\nùü\u000bøÿ\tûÿ\u0001\u0005ó\u0006\u0007÷ü\rûÿ\u0000\u0006ûÿÿ\u0007ù\u0000\u0007ûÿþ\bû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0007úÿ\u0007ÿûý\tÿûü\nÿûû\u000bûÿý\tÿüû\nÿûú\fúù\rÿûù\rÿú\u0003\u0004ÿú\u0002\u0005õÿ\fÿú\u0001\u0006ÿú\u0000\u0007ÿúÿ\bÿûú\fÿúþ\tûÿü\nÿúý\nùü\u000bÿû\u0001\u0005ó\rõ\u0003\bÿúü\u000bÿüþ\u0007ÿû\u0006ûÿû\u000bûú\u000bû\u0000ú\u000bø\u0002\u0006û\u0001þ\u0006ûÿú\fó\u0006\u0007ó\u0006\u0007õ\u000bûÿù\rûþ\u0003\u0004ûù\fûÿþ\bû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0007úÿ\u0007ÿúû\fÿúú\rÿûþ\bÿüþ\u0007ûþ\u0002\u0005ÿù\u0004\u0004ÿû\u0006ûþ\u0001\u0006ô\u0004\bûú\u000bô\u0003\tû\u0000\u0001\u0004ûþ\u0000\u0007ûù\fù\u0000\u0007ûú\u000bùü\u000bøÿ\tûþÿ\bû\u0001\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿù\u0003\u0005ÿù\u0002\u0006ÿù\u0001\u0007ÿù\u0000\bû\u0000þ\u0007ÿù\u0004\u0004ûþþ\tÿùÿ\tÿùþ\nûþý\nÿùÿ\tû\u0000\u0005ÿú\u0002\u0005ûþü\u000bÿúý\nÿùý\u000bûþû\fõ\u000bÿúü\u000bÿüþ\u0007ÿû\u0006ûþú\rùý\nùü\u000bøÿ\tø\u0003\u0005õ\u000bó\t\u0004û\u0001þ\u0006õ\u000bó\u0005\b÷\u0000\tùý\nù\u0000\u0007ûý\u0004\u0004ùû\fõ\u000bó\u0006\u0007ó\u0003\nû\u0001ú\nû\u0001\u0004ÿú\u0007úÿ\u0007ÿùü\fÿùû\rÿû\u0000\u0006û\u0000\u0005ûþý\nûý\u0003\u0005ûý\u0002\u0006ÿú\u0002\u0005ÿû\u0006ûý\u0001\u0007ô\u0003\tûý\u0000\bûÿÿ\u0007ûû\nû\u0000\u0001\u0004õ\u000bû\u0001ø\fö\u0005\u0005ú\u0002\u0004ÿú\u0007úÿ\u0007ÿø\u0005\u0004ÿø\u0004\u0005ÿø\u0003\u0006ÿüþ\u0007ÿø\u0002\u0007ÿø\u0001\bùü\u000bÿú\u0001\u0006ÿö\u000bÿõ\fÿø\u0000\tÿøÿ\nÿøþ\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007ü\u0005ÿû\u0006ûýÿ\tó\u0006\u0007ûù\fûú\u000bùý\nùü\u000bøÿ\tûýþ\nûÿ\u0002\u0004û\u0000ý\bûù\føþ\nû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fÿô\rú\u0006ÿü\u0001\u0004ú\u0006úù\rõþ\rÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007úù\rÿüý\bÿüü\tûýý\u000bÿüû\nÿ÷\nÿõ\fúù\rÿüú\u000bÿüù\fõþ\rÿüø\rÿüù\fûýü\fö\u0002\bÿû\u0002\u0004ÿõ\fÿû\u0006ûýû\rù\u0000\u0007ûû\nù\u0000\u0007ûû\n÷þ\u000bó\u0006\u0007õ\u000bûú\u000bûù\fûü\u0005\u0004ûü\u0004\u0005û\u0001ø\f÷\u0002\u0007ù\u0000\u0007÷þ\u000bûü\u0003\u0006ùü\u000b÷ü\rû\u0001ý\u0007ú\u0002\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿû\u0001\u0005ÿû\u0000\u0006ÿô\rúù\rÿüú\u000bÿüù\fõþ\rÿüø\rÿüù\fÿû\u0002\u0004÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿûÿ\u0007ÿû\u0006ûü\u0002\u0007ù\u0000\u0007ûû\nûü\u0001\bø\u0003\u0005ûü\u0000\tûþÿ\bû\u0001\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿûþ\bÿûý\tÿûü\nû\u0000\u0005ÿûû\u000bøû\rÿüûó\nò\u0003\u0006\u00056Ëô\u0001ú\u000f÷úFëÔ\u0001ú\u000fí\u0004ü\u0005ÿû\u0006ÿú\u0007øû\rÿù\bù\u0003\u0004õþ\rÿø\tÿ÷\nÿö\u000búûþ\rûü\u0005\u0004ô\u0003\tó\u0006\u0007ûÿÿ\u0007ó\u0005\bô\u0003\tó\u0006\u0007ûú\u000bùý\nûÿ\u0001\u0005ûø\u0003\nûûÿ\u000bõ\u000bûú\u000bùü\u000bøÿ\tûû\nû\u0001þ\u0006õ\u000bùý\nöý\rû\u0001ý\u0007ú\u0002\u0004ÿõ\fúÿ\u0007ÿô\rÿü\u0001\u0004ÿü\u0000\u0005ûþû\fõ\u000bÿüÿ\u0006ÿö\u000bùü\u0002\tù\u0000\u0007ô\u0004\b÷þ\u000bó\u0006\u0007õ\u000bûú\u000bø\u0003\u0005õ\u000bùü\u0001\nûû\nù\u0000\u0007û\u0001þ\u0006ûü\u0000\tûþÿ\bû\u0001\u0004ÿõ\fúÿ\u0007ÿüþ\u0007ÿüý\bÿû\u0006ÿú\u0007ÿüü\tÿú\u0007ùü\u0000\u000bÿù\bú\u0006ûø\u0005\bÿø\tùüÿ\fûø\t\u0004õ\u000bÿ÷\nû\u0000\u0005ÿüûü\u0005ÿû\u0006û\u0000\u0005ÿú\u0007ÿù\búù\u0006\u0007ö\u0000\nùü\u000bøÿ\tûÿ\u0001\u0005ûø\u0003\nô\u0002\nû\u0001\u0000\u0004ó\u0006\u0007ûú\u000búüÿ\u000bûû\nó\u0006\u0007ûù\fûÿù\rûþÿ\bû\u0001\u0004ÿø\túÿ\u0007ÿ÷\nÿö\u000bÿõ\fÿõ\f÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿô\rÿü\u0001\u0004ùú\u0003\nó\u0006\u0007ó\u0005\bó\u0004\t÷ü\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004û\u0001\u0004ÿüÿ\u0006ÿüþ\u0007ÿüý\bÿüý\bú\u0006ÿüü\tÿüû\nÿûü\u0005ÿû\u0006ÿú\u0007ùû\u0006\u0006ûû\nù\u0000\u0007ûû\nó\u0006\u0007ø\u0003\u0005úü\u0000\nöÿ\u000bûù\fûü\u0005\u0004ûú\u000b÷þ\u000bù\u0003ú\nûú\u000b÷ü\rû\u0001ý\u0007ú\u0002\u0004ÿù\b÷\u0005\u0004û\u0001\u0004ÿø\tÿ÷\nÿö\u000bó\u0001\fÿõ\fÿô\rùû\u0005\u0007ÿü\u0001\u0004ÿü\u0000\u0005ûÿ\u0006ÿõ\fÿú\u0007ùû\u0004\bö\u0005\u0005ú\u0002\u0004ÿù\b÷\u0005\u0004û\u0001\u0004ÿüÿ\u0006ÿüþ\u0007ÿô\rû\u0000\u0005ÿüý\bû\u0000\u0005ùû\u0003\tûý\u0003\u0005ûø\t\u0004õ\u000bÿüý\bÿû\u0006ûþû\fõ\u000bÿüü\tÿû\u0006ÿüûü\u0005ÿû\u0006ú\u0006ÿú\u0007ÿù\bù\u0002\u0005ûüÿ\nÿø\tÿû\u0006ú\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000b÷\u0005\u0004úÿ\u0007õ\u000bÿõ\fûüþ\u000bÿô\rûüý\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ûüü\rùý\nöÿ\u000bûù\fó\u0006\u0007ûû\u0006\u0004û\u0001\u0004ÿüÿ\u0006÷\u0005\u0004û\u0001\u0004ÿüþ\u0007ÿüý\bÿüü\tÿ÷\nÿ÷\nú\u0006ÿüû\nÿüú\u000bÿüù\fÿü\u0000\u0005ûû\u0005\u0005ûû\u0004\u0006ó\u0005\bûû\u0003\u0007ùü\u000b÷ü\rû\u0001ý\u0007ú\u0002\u0004ÿüÿ\u0006÷\u0005\u0004û\u0001\u0004ÿüø\rÿû\u0002\u0004ÿö\u000bû\u0000\u0005ÿû\u0001ü\u0005û\u0000\u0005ÿû\u0006õÿ\fÿú\u0007ÿù\bùü\u000bÿú\u0007ÿø\tûø\b\u0005ô\u0003\tó\u0006\u0007ó\u0005\bûû\u0003\u0007ùü\u000bûø\u0007\u0006ûÿ\u0001\u0005ûø\u0006\u0007øÿ\töý\rû\u0001ý\u0007ú\u0002\u0004ÿ÷\núÿ\u0007ÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ÿù\bó\rû\u0001\u0004õ\u000bÿü\u0000\u0005ÿù\bú\u0006ÿüÿ\u0006ÿüþ\u0007ù\u0002\u0005ÿüý\bõ\u000bÿüü\tú\u0006ÿüÿ\u0006ÿüþ\u0007ÿüü\të\u00153Â\u000bó\u00079ë×\u000bî\u00000âîÿ/Í\u0015þõü\u000bú\u0001\të\u00153¹\u0001\u000bý>íÏ\u0000\u0011è-ãöÿü\u0005ÿû\u0006úú\u0002\nûû\nûû\n÷þ\u000bó\u0006\u0007úú\u0001\u000bõ\u000bú\u0000ú\fúü\u0000\nöþ\fú\u0001ø\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿú\u0007úÿ\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿû\u0006úú\u0000\fûû\núþý\u000bõ\u000bù\u0000\u0007ùý\nûþÿ\bû\u0001\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿõ\fÿô\rÿü\u0001\u0004ÿû\u0006úúÿ\rûû\nù\u0000\u0007ûø\u0003\nó\u0006\u0007ó\b\u0005ûù\fù\u0000\u0007ûû\nû\u0000\u0001\u0004ûø\u0002\u000bûø\rú\u0002\u0004ÿú\u0007÷\u0005\u0004û\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿö\u000bú\u0006ÿüý\bÿüü\tÿüû\nÿüú\u000bÿüù\fù\u0003\u0004õþ\rÿüø\rÿû\u0002\u0004ÿüþ\u0007ÿü\u0001\u0004ÿû\u0001\u0005û\u0000\u0005ÿû\u0000\u0006ùü\u000bÿûÿ\u0007úù\t\u0004ÿüø\rúù\b\u0005úü\nõ\u000bÿû\u0002\u0004û\u0000\u0005ÿû\u0000\u0006õÿ\fÿûþ\bûþû\fõ\u000bÿûý\tõÿ\fÿûÿ\u0007ÿö\u000bú\u0006ÿûü\nÿûû\u000bÿûú\fùü\u000bÿûþ\të\u00153Â\u000bó\u00079ìÓ\u0000\u0003\u0007\u0004ó\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007ü\u0005ÿû\u0006ÿú\u0007ú\u0006ÿù\bÿø\tÿû\u0006û\u0000\u0005ÿ÷\nÿö\u000bûþü\u000bù\u0002ú\u000bû\u0000\u0001\u0004úü\u0000\nùü\u000bùû\fûú\u0004\u0007ó\u0003\nû\u0001ú\nû\u0001\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿô\rÿü\u0001\u0004ÿü\u0000\u0005÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿüÿ\u0006û\u0000\u0005ù\u0002\u0005ÿüþ\u0007õ\u000bÿ÷\núüý\rÿüý\bÿü\u0000\u0005ÿüü\tó\u0000\rùü\u0003\bùþ\tùý\nùü\u000bøÿ\tûýþ\nûû\nö\u0000\nöÿ\u000bø\u0003\u0005õ\u000bù\u0000\u0007úÿ\u0001\u0006øý\u000bÿüû\núÿ\u0007ÿüú\u000bÿüù\fÿüø\rÿû\u0006úýü\rÿüýü\u0005ÿû\u0006ú\u0006ÿú\u0007ö\nõ\u000bÿù\bÿø\tó\rû\u0001\u0004õ\u000bÿ÷\nû\u0000\u0005ÿö\u000bÿø\tÿø\tûÿ\u0006ÿõ\fûþ\u0007ÿõ\fÿô\rûü\tûû\nûú\u000bûù\fûø\rú\u0002\u0004ÿü\u0001\u0004úÿ\u0007ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ú\u0006ÿú\u0007ÿùü\u0005÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿû\u0006ÿú\u0007û\u0000\u0005ÿù\bõÿ\fÿø\tû\u0000\u0005ÿù\bõÿ\fÿ÷\nó\rû\u0001\u0004õ\u000bÿö\u000bÿõ\fó\rû\u0001\u0004õ\u000bÿô\rúù\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿö\u000bÿüý\búü\u0005\u0005ÿüü\tÿüû\nÿüú\u000búü\u0004\u0006ûû\nô\u0003\tô\u0000\fûù\fúü\u0003\u0007û\u0001ø\fû\u0000ø\rúü\u0002\bûù\fù\u0000\u0007úü\u0001\tûû\nù\u0000\u0007ó\u0006\u0007ûù\fú\u0000ÿ\u0007ú\u0002ø\føý\u000bÿüù\fúÿ\u0007ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006û\u0000\u0005ÿù\bÿüú\u000bûü\tú\u0002ù\u000bú\u0000ú\fúü\u0000\nöÿ\u000bø\u0003\u0005õ\u000bûû\u0000\nó\u0006\u0007ûú\u000bûù\fó\u0005\b÷þ\u000bûú\u000búüÿ\u000bó\u0007\u0006ó\u0006\u0007ó\u0005\bó\u0004\tûû\u0006\u0004û\u0001\u0004ÿüù\f÷\u0005\u0004û\u0001\u0004ÿûÿ\u0007ÿûþ\bÿûý\tÿûü\núüþ\fûÿ\u0002\u0004ó\u0006\u0007ûù\fûü\u0005\u0004ô\u0003\tó\u0006\u0007ûø\u0000\rûú\u000böÿ\u000bù\u0000\u0007ûû\nù\u0000\u0007ûú\u000bûÿ\u0001\u0005ùý\nöý\røý\u000bÿûû\u000búÿ\u0007ÿûú\fÿûù\rÿüý\bó\rõ\u0003\bÿú\u0003\u0004ûú\u0006\u0005ÿú\u0002\u0005õ\u000bÿú\u0001\u0006ó\rûø\t\u0004õ\u000bÿú\u0003\u0004ó\u0000\rÿú\u0000\u0007ÿüú\u000búüý\rûû\nú\u0000ú\fõ\u000bûú\u000bø\u0000\bøÿ\tûù\fûû\nûú\u000b÷þ\u000bø\u0003\u0005õ\u000bùý\nûú\u000bûû\nù\u0000\u0007ó\u0006\u0007ø\u0003\u0005úÿ\u0002\u0005ûÿù\röý\rû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿüù\f÷\u0005\u0004û\u0001\u0004ÿúÿ\bÿúþ\tÿúý\nÿûü\núû\u0007\u0004ûû\nù\u0000\u0007ûû\nø\u0004\u0004ø\u0003\u0005ûþ\u0000\u0007ûÿ\u0001\u0005ûû\n÷þ\u000bûø\u0000\rûú\u000bûûþ\fû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿûû\u000b÷\u0005\u0004û\u0001\u0004ÿúü\u000bÿúû\fÿúú\rÿûý\tÿù\u0004\u0004û\u0000\u0005ù\u0002\u0005ÿù\u0003\u0005õ\u000bÿù\bú\u0006ÿù\u0002\u0006ÿù\u0001\u0007úý\u0000\tÿù\u0000\bÿùÿ\tÿùþ\nú\u0006ÿùý\u000bÿùü\fÿùû\rÿø\u0005\u0004ÿø\u0004\u0005ú\u0000ý\tú\u0000ý\túû\u0006\u0005ÿû\u0006ÿø\u0003\u0006ÿø\u0002\u0007úù\rÿùü\fÿü\u0000\u0005ÿø\u0001\bÿø\u0000\tÿö\u000bùü\u000bÿø\túù\rÿøÿ\nÿü\u0000\u0005ÿøþ\u000bÿøý\fÿö\u000bÿøü\rÿ÷\u0006\u0004ÿ÷\u0005\u0005úû\u0005\u0006ÿüü\túû\u0004\u0007ÿú\u0000\u0007ÿ÷\u0004\u0006ú\u0006ÿù\u0002\u0006ÿù\u0001\u0007úý\u0000\tù\u0002\u0005ÿù\u0003\u0005õ\u000bÿ÷\u0003\u0007ÿ÷\u0002\bÿ÷\u0001\túû\u0003\bÿ÷\u0000\nÿ÷ÿ\u000bùü\u000bÿ÷þ\fÿüú\u000búû\u0002\tùü\u000bøÿ\tûù\fúÿ\u0003\u0004ó\u0006\u0007ûù\fúþ\u0003\u0005úû\u0001\nø\u0003\u0005úû\u0000\u000bûûþ\fû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿüù\fúÿ\u0007ÿ÷ý\rÿö\u0007\u0004ÿö\u0006\u0005ú\u0006ÿùý\u000bú\u0006ÿö\u0005\u0006ú\u0006ÿö\u0004\u0007ÿö\u0003\bÿö\u0002\tÿûü\nû\u0000þ\u0007ú\u0002ù\u000bûø\u0003\nó\u0006\u0007ûú\u000bø\u0003\u0005õ\u000búü\u0003\u0007úÿû\fùú\rô\u0003\tûý\u0000\bûú\u000búûÿ\fû\u0001ý\u0007û\u0000\u0000\u0005ó\u0006\u0007ó\u0005\bõ\u000b÷ü\rú\u0002û\tû\u0001ý\u0007û\u0001ú\nû\u0001\u0004ÿûû\u000b÷\u0005\u0004û\u0001\u0004ÿö\u0001\nÿö\u0000\u000bÿõ\fÿüú\u000búûþ\rù\u0000\u0007ó\t\u0004û\u0001þ\u0006û\u0001\u0000\u0004ó\u0006\u0007úÿû\fúÿ\u0002\u0005ûÿù\rú\u0002ù\u000bûú\u000bûÿ\u0001\u0005ùý\nûþÿ\bû\u0001\u0004ÿüù\fúÿ\u0007ÿöÿ\fÿöþ\rÿõ\b\u0004÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿõ\u0007\u0005úú\b\u0004úú\u0007\u0005ú\u0000ü\nõ\u000bÿô\rùü\u000bÿõ\u0006\u0006õÿ\fÿ÷þ\fÿõ\u0005\u0007ùü\u000bÿ÷\nÿõ\u0004\bõÿ\fÿõ\u0006\u0006ÿüú\u000bú\u0000û\u000bûü\u0005\u0004ù\u0000\u0007ûû\nûü\u0004\u0005ûú\u000bùý\nûú\u0005\u0006õ\u000bù\u0000\u0007úÿ\u0003\u0004ó\u0006\u0007ø\u0003\u0005õ\u000bû\u0000ù\fûÿ\u0002\u0004û\u0001þ\u0006õ\u000bù\u0000\u0007ùý\nöý\rõ\u0007\u0004û\u0001\u0004ÿüù\fúÿ\u0007ÿõ\u0003\tÿõ\u0002\nÿøü\rú\u0006ÿùý\u000bÿøÿ\nÿùû\rÿõ\u0001\u000bûþ\u0007ÿú\u0002\u0005ÿõ\u0000\fÿ÷\u0005\u0005ÿüú\u000bú\u0000û\u000bù\u0000\u0007û\u0001ý\u0007ù\u0000\u0007ûù\u0007\u0005ô\u0000\fø\u0003\u0005ô\u0001\u000b÷\u0000\t÷ý\fûÿ\u0002\u0004ó\u0006\u0007ûù\fù\u0000\u0007ûú\u000böÿ\u000búú\u0006\u0006ûý\u0004\u0004øÿ\tûù\fó\u0006\u0007ûû\u0006\u0004û\u0001\u0004ÿüù\f÷\u0005\u0004û\u0001\u0004ÿõÿ\rÿô\t\u0004ÿõ\u0000\fÿ÷\u0005\u0005ÿ÷\u0005\u0005û\u0000\u0005ÿù\të\u00153Â\u000bó\u00079Ùçûþ\u0005\u0000\u0001ýþ\u000f\u0001\u0015ß\u000bó\u0011í\u000bú\u0001)Í\u0015þõü\u000bú\u0001ü\u0005ÿû\u0006ÿû\u0006ûýý\u000bÿú\u0007û\u0000\u0005ù\u0002\u0005ÿù\bõ\u000bÿø\t÷\u0005\u0004÷\u0005\u0004õ\u0003\bÿ÷\nÿö\u000bùþü\rø\u0003\u0005ûÿú\fûý\u0000\bûú\u000böÿ\u000bûû\nó\u0006\u0007ø\u0003\u0005õ\u000bûú\u000bûûþ\føý\u000bÿõ\fúÿ\u0007ÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿû\u0006ÿüÿ\u0006ùý\u0006\u0004ÿú\u0007ÿüþ\u0007ùý\u0005\u0005÷þ\u000bûø\u0000\rûú\u000bø\u0003\u0005õ\u000bûû\nó\u0006\u0007ø\u0003\u0005õ\u000bûú\u000bùý\nûþ\u0003\u0004ûù\fûÿþ\bû\u0001ý\u0007ú\u0002\u0004ÿüý\b÷\u0005\u0004û\u0001\u0004ÿüü\tÿüû\nÿüÿ\u0006ÿüú\u000bû\u0000\u0005ÿø\tú\u0006úù\rÿüù\fÿüøü\u0005ÿû\u0006ûú\u0006\u0005÷\u0002\u0007÷\u0001\bø\u0004\u0004ûù\fùý\nûú\u000bû\u0000ø\rù\u0000\u0007ûû\nùý\nûú\u0005\u0006ûú\u0004\u0007ûú\u0003\bù\u0000\u0007ûú\u000bø\u0003\u0005õ\u000bù\u0000\u0007ûø\rú\u0002\u0004ÿú\u0007úÿ\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ûú\u0002\tÿüþ\u0007ûú\u0001\nÿüþ\u0007û\u0000\u0005ù\u0002\u0005ûüÿ\nÿüý\bÿüü\tûú\u0000\u000bûû\u0004\u0006ó\u0005\bûúÿ\fûü\u0004\u0005ûü\u0001\böÿ\u000böý\rùü\u000b÷ü\rõ\u0007\u0004û\u0001\u0004ÿüû\núÿ\u0007ÿüú\u000bÿüù\fÿüø\ró\rû\u0001\u0004õ\u000bÿû\u0002\u0004ÿü\u0000\u0005ú\u0006ÿû\u0001\u0005ú\u0006ÿû\u0000\u0006ÿûÿ\u0007ÿûþ\bû\u0000\u0005ÿüý\bÿüø\rÿü\u0000\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ü\u0005ÿû\u0006ú\u0006ÿú\u0007ÿû\u0006ÿù\bÿø\tû\u0000\u0005ÿ÷\nÿö\u000bûû\u0002\bô\u0004\bô\u0003\tô\u0002\nõ\u000bûû\u0001\tô\u0000\fùý\nø\u0003\u0005õ\u000bûû\u0000\nûûÿ\u000bõ\u000bûú\u000bûûþ\fõ\u0007\u0004û\u0001\u0004ÿõ\f÷\u0005\u0004û\u0001\u0004ÿô\rÿü\u0001\u0004ÿø\tÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ú\u0006ÿüý\bÿüü\tú\u0006ûûý\rÿüû\nÿüú\u000bÿö\u000bûú\u0007\u0004ûþÿ\bû\u0001\u0004ÿõ\fúÿ\u0007ÿüù\fÿüø\rÿü\u0000\u0005ÿû\u0002\u0004ÿû\u0002\u0004÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿû\u0001ö.Øýüû\u0002ñ'èò\u0000\u0012ú\u0002\të\u00153Â\u000bó\u00079àÙ\b\u000býó,×ý\u0005\fí/Í\u0015þõü\u000bú\u0001ó\nò\u0003\u0006\u00056º\u000fí\u0004FÚïí\u0004\u001fá\u000býù\të\u00153Â\u000bó\u00079ÜÝ\u0007ú\u000bü\b Í\u0015þõü\u000bú\u0001\u0002ñ!ß\u0002\tû\u0007\të\u00153Â\u000bó\u00079åÝ\u0000\u0007þ\u0006õ+Ï\u000bò\b\b÷ú/Í\u0015þõü\u000bú\u0001ü\u0005ÿû\u0006ú\u0006ûûý\rÿú\u0007ù\u0002\u0005ÿù\bõ\u000bÿø\tÿ÷\nû\u0000\u0005ù\u0002\u0005ûüÿ\nÿö\u000bó\rõ\u0003\bÿõ\fú\u0006ûûý\rÿú\u0007ÿø\túÿý\nÿô\rùü\u000bÿü\u0001\u0004ÿü\u0000\u0005úû\u0007\u0004ûÿ\u0002\u0004ûû\nûú\u000bû\u0000ú\u000bø\u0002\u0006ûÿÿ\u0007ûû\u0000\nó\u0006\u0007ó\u0006\u0007õ\u000bûú\u000bùü\u000bú\u0002\u0000\u0004ûû\nù\u0000\u0007ø\u0000\bøÿ\tûù\fù\u0000\u0007ó\u0006\u0007ó\u0003\nû\u0001ú\nû\u0001\u0004ÿüÿ\u0006úÿ\u0007ÿüþ\u0007ÿüý\bÿüü\tÿüû\nÿ÷\nõÿ\fÿü\u0001\u0004û\u0000\u0005ÿö\u000bÿ÷\nÿüú\u000bùû\u0000\fû\u0001ý\u0007÷þ\u000bó\u0005\bõ\u000b÷ü\rùü\u000bûû\u0006\u0004û\u0001\u0004ÿüù\fúÿ\u0007ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ù\u0002û\nÿô\rÿ÷ü\u0005ÿû\u0006ÿú\u0007ö\u0003\u0007ö\u0002\bÿù\bÿø\tö\u0001\tö\u0000\nöÿ\u000bûù\fù\u0000\u0007ûû\nûú\u000b÷þ\u000bø\u0003\u0005õ\u000bùý\nûú\u000bù\u0000\u0007öþ\fø\u0002\u0006öý\rõ\u0007\u0004û\u0001\u0004ÿ÷\n÷\u0005\u0004û\u0001\u0004ÿö\u000bÿõ\fÿô\rÿô\rÿû\u0006ÿú\u0007ÿù\bÿü\u0001\u0004ö\u0003\u0007ÿü\u0000\u0005÷\u0005\u0004úÿ\u0007õ\u000bÿüÿ\u0006úù\rÿüþ\u0007ÿüý\bú\u0006úù\rÿû\u0006ÿû\u0006ÿüü\tÿüû\nÿüú\u000bõ\u0006\u0005õ\u0007\u0004û\u0001\u0004ÿüù\f÷\u0005\u0004û\u0001\u0004ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005õ\u0005\u0006ÿü\u0000\u0005û\u0000\u0005ÿû\u0000\u0006ÿü\u0001\u0004ÿü\u0001\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9ü\u0005ùý\u0004\u0006ÿû\u0006ÿú\u0007û\u0000\u0005ÿù\bÿø\tùý\u0002\bù\u0000\u0007ô\u0004\b÷þ\u000bó\b\u0005ûù\fúþü\fø\u0003\u0005õ\u000bùý\u0001\tõ\u0007\u0004û\u0001\u0004ÿ÷\núÿ\u0007ÿö\u000bÿõ\fÿô\r÷\u0005\u0004÷\u0005\u0004û\u0001\u0004õ\u000bÿü\u0001\u0004ÿú\u0007ú\u0006ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿüý\bû\u0000\u0005ù\u0002\u0005ÿüü\tõ\u000bÿù\bÿüû\nùý\u0000\nûû\nûú\u000b÷þ\u000bø\u0003\u0005ø\u0002\u0006ûú\u000bûü\u0003\u0006úþÿ\tö\u0000\nùü\u000bûù\u0001\u000bøþ\nõ\u0007\u0004û\u0001\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿüù\fÿüø\rÿüý\bÿú\u0007ùÿ\u0001\u0007ÿûü\u0005ÿû\u0006û\u0000\u0005úý\túü\nõ\u000bÿú\u0007úû\u000bÿù\búú\fÿø\tÿ÷\núù\rÿö\u000bÿõ\fù\u0003\u0004ÿô\rÿü\u0001\u0004úù\rÿö\u000bÿõ\fù\u0003\u0004ÿô\rù\u0002\u0005ÿü\u0000\u0005õ\u000bÿü\u0001\u0004ÿû\u0006ÿû\u0006ÿüÿ\u0006ù\u0001\u0006ù\u0000\u0007ùÿ\bùþ\tùý\nùü\u000bùû\fùú\rø\u0004\u0004ø\u0003\u0005ø\u0002\u0006ø\u0001\u0007ø\u0000\bøÿ\tø\u0003\u0005õ\u000bøþ\nøý\u000bÿüþ\u0007úÿ\u0007ÿüý\bÿüü\tÿüû\nøû\rÿø\t÷\u0005\u0004÷\u0004\u0005ÿüú\u000bû\u0000\u0005ÿú\u0007ÿüù\f÷\u0003\u0006÷\u0002\u0007÷\u0001\b÷\u0000\t÷ÿ\n÷þ\u000bûú\u000b÷ý\f÷ü\rö\u0006\u0004ûú\u000bø\u0003\u0005ø\u0002\u0006ö\u0005\u0005ú\u0002\u0004ÿüø\r÷\u0005\u0004û\u0001\u0004ÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006ö\u0004\u0006ÿù\bÿûÿ\u0007ÿûü\u0005ÿû\u0006ÿú\u0007ÿù\bûþý\nù\u0000\u0007ûû\núþý\u000bùú\rû\u0000\u0001\u0004õ\u000bùû\u0002\n÷þ\u000bûü\u0003\u0006ú\u0002þ\u0006ú\u0002\u0004ÿø\túÿ\u0007ÿ÷\nÿö\u000bÿú\u0007ùü\u000bÿõ\fú\u0006ÿô\ró\u0001\fö\u0002\bÿü\u0001\u0004ÿû\u0006ÿü\u0000\u0005ô\u0005\u0007û\u0001ý\u0007ù\u0000\u0007ô\u0003\tûû\nô\u0003\tô\u0000\f÷ÿ\n÷þ\u000bû\u0001ø\fùû\u0001\u000bù\u0000\u0007÷þ\u000bû\u0000ø\rûù\u0006\u0006ûù\u0006\u0006ù\u0000\u0007ûû\nû\u0001þ\u0006õ\u000bùý\nöý\rõ\u0007\u0004û\u0001\u0004ÿüÿ\u0006úÿ\u0007ÿüþ\u0007ÿüý\bÿüü\tõÿ\fÿõ\fû\u0000\u0005ÿüû\nûþû\fõ\u000bÿüú\u000bú\u0006ÿô\rÿü\u0001\u0004ÿüù\fÿûü\u0005ÿû\u0006ùûÿ\rù\u0003ü\bõ\u000bû\u0001þ\u0006úÿÿ\bûü\u0004\u0005ûú\u000bùú\t\u0004ûÿÿ\u0007ûÿþ\bõ\u0007\u0004û\u0001\u0004ÿú\u0007úÿ\u0007ÿù\bÿø\tÿ÷\nÿö\u000bùü\u000bÿõ\f÷\u0005\u0004÷\u0004\u0005ÿô\rú\u0006úù\rÿü\u0001\u0004ûù\u0005\u0007ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ùú\b\u0005ÿüý\bû\u0000\u0005ùú\u0007\u0006ûý\u0003\u0005ûø\t\u0004õ\u000bÿüü\tÿüþ\u0007û\u0000\u0005ÿüü\tú\u0006úù\rÿü\u0001\u0004ÿü\u0000\u0005õÿ\fÿõ\fúýþ\u000bÿüý\bÿüþ\u0007ÿüû\nùú\u0006\u0007û\u0001ý\u0007ú\u0002ý\u0007ùÿý\u000bûü\u0004\u0005ùý\nûú\u000bùú\u0005\búþ\u0002\u0006õ\u000bù\u0000\u0007ûú\u000bùü\u000bú\u0002ø\fùü\u000b÷ü\rõ\u0007\u0004û\u0001\u0004ÿüú\u000b÷\u0005\u0004û\u0001\u0004ÿüù\fÿüø\rÿû\u0002\u0004ÿüþ".getBytes("ISO-8859-1"), 0, bArr, 0, 15682);
        setMin = bArr;
        try {
            ICustomTabsCallback = 0;
            getMax getmax = new getMax((byte) 0);
            try {
                int i = b;
                int i2 = (((i ^ 75) | (i & 75)) << 1) - (((i ^ -1) & 75) | (i & -76));
                try {
                    ICustomTabsCallback = i2 % 128;
                    if ((i2 % 2 != 0 ? 'X' : 17) != 'X') {
                        try {
                            length = getmax;
                            onNavigationEvent = cls.getSimpleName();
                        } catch (NumberFormatException e) {
                            e = e;
                            throw e;
                        }
                    } else {
                        try {
                            length = getmax;
                            try {
                                try {
                                    onNavigationEvent = cls.getSimpleName();
                                    Object[] objArr = null;
                                    int length2 = objArr.length;
                                } catch (IndexOutOfBoundsException e2) {
                                    e = e2;
                                    throw e;
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                throw e;
                            }
                        } catch (ClassCastException e4) {
                            e = e4;
                            throw e;
                        }
                    }
                } catch (NullPointerException e5) {
                    e = e5;
                    throw e;
                }
            } catch (ClassCastException e6) {
                e = e6;
                throw e;
            }
        } catch (ArrayStoreException e7) {
            e = e7;
            throw e;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @javax.inject.Inject
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sendSensorResult(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull o.CompassSensorService.getMin r5, @org.jetbrains.annotations.NotNull o.fromScanData r6, @org.jetbrains.annotations.NotNull o.setPageCacheCapacity r7, @org.jetbrains.annotations.NotNull o.AccelerometerForH5SensorService r8, @org.jetbrains.annotations.NotNull o.onLocationResult r9, @org.jetbrains.annotations.NotNull o.setWebMessageCallback r10, boolean r11, @org.jetbrains.annotations.NotNull o.calculateDistance r12, @org.jetbrains.annotations.NotNull o.onPageError r13, @org.jetbrains.annotations.NotNull o.APDownloadListener r14, @org.jetbrains.annotations.NotNull o.APHitTestResult r15) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "checkRegister"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "checkShowReferralCodeFeature"
            int r1 = b     // Catch:{ ArrayStoreException -> 0x0088 }
            int r1 = r1 + 97
            int r2 = r1 % 128
            ICustomTabsCallback = r2     // Catch:{ UnsupportedOperationException -> 0x0086 }
            int r1 = r1 % 2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch:{  }
            java.lang.String r0 = "faceAuthManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)     // Catch:{ IllegalStateException -> 0x0082 }
            java.lang.String r0 = "faceAuthenticationModelMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r0 = "removeDeepLinkPayload"
            int r1 = ICustomTabsCallback     // Catch:{ IllegalStateException -> 0x007e }
            r2 = r1 | 31
            int r2 = r2 << 1
            r1 = r1 ^ 31
            int r2 = r2 - r1
            int r1 = r2 % 128
            b = r1     // Catch:{ IllegalArgumentException -> 0x007c }
            int r2 = r2 % 2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "resendOtp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "bokuVerification"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "checkMobileDataPermissionAccepted"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "setMobileDataPermissionAccepted"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r3.<init>()
            r3.toIntRange = r4
            r3.equals = r5
            r3.toDoubleRange = r6
            r3.toString = r7
            r3.FastBitmap$CoordinateSystem = r8
            r3.values = r9
            r3.hashCode = r10
            r3.invoke = r11
            r3.Mean$Arithmetic = r12
            r3.invokeSuspend = r13
            r3.valueOf = r14
            r3.Grayscale$Algorithm = r15
            o.setEncryptProxy r4 = new o.setEncryptProxy
            r4.<init>()
            r3.getMax = r4
            java.lang.String r4 = ""
            r3.getMin = r4
            r3.isInside = r4
            r3.toIntRange()
            return
        L_0x007c:
            r4 = move-exception
            goto L_0x0087
        L_0x007e:
            r4 = move-exception
            goto L_0x0087
        L_0x0080:
            r4 = move-exception
            goto L_0x0089
        L_0x0082:
            r4 = move-exception
            goto L_0x0089
        L_0x0084:
            r4 = move-exception
            goto L_0x0087
        L_0x0086:
            r4 = move-exception
        L_0x0087:
            throw r4
        L_0x0088:
            r4 = move-exception
        L_0x0089:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendSensorResult.<init>(android.content.Context, o.CompassSensorService$getMin, o.fromScanData, o.setPageCacheCapacity, o.AccelerometerForH5SensorService, o.onLocationResult, o.setWebMessageCallback, boolean, o.calculateDistance, o.onPageError, o.APDownloadListener, o.APHitTestResult):void");
    }
}
