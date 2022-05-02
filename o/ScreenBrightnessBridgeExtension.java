package o;

import com.iap.ac.android.biz.common.model.gol.SignContractRequest;
import id.dana.oauth.model.OauthParamsModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u0004J\u0006\u0010,\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\u0006J\u0006\u0010.\u001a\u00020\u0006J\u0006\u0010/\u001a\u00020\u0006J\u0006\u00100\u001a\u00020\u0006J\u0006\u00101\u001a\u00020\u0006J\u0006\u00102\u001a\u00020\fJ\u0006\u00103\u001a\u00020*J\u0006\u00104\u001a\u00020*J\b\u00105\u001a\u00020*H\u0002J\u0010\u00106\u001a\u00020*2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010'\u001a\u00020*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00067"}, d2 = {"Lid/dana/oauth/OauthLoginManager;", "", "()V", "acSignContractRequest", "Lcom/iap/ac/android/biz/common/model/gol/SignContractRequest;", "deeplinkUrl", "", "getDeeplinkUrl", "()Ljava/lang/String;", "setDeeplinkUrl", "(Ljava/lang/String;)V", "isBindingGoogleDone", "", "()Z", "setBindingGoogleDone", "(Z)V", "isLock", "setLock", "isPauseProxySession", "setPauseProxySession", "isRequestIdGn", "setRequestIdGn", "isShouldTriggerGoogle", "setShouldTriggerGoogle", "isWhitelistSubMerchantId", "setWhitelistSubMerchantId", "oauthParamsModel", "Lid/dana/oauth/model/OauthParamsModel;", "getOauthParamsModel", "()Lid/dana/oauth/model/OauthParamsModel;", "setOauthParamsModel", "(Lid/dana/oauth/model/OauthParamsModel;)V", "originalUrl", "getOriginalUrl", "setOriginalUrl", "requestDataId", "", "getRequestDataId", "()I", "setRequestDataId", "(I)V", "clearOauthNewFlowFlag", "", "getACSignContractRequest", "getAcAuthUrl", "getClientId", "getMerchantId", "getMerchantName", "getPhoneNumber", "getPhoneNumberWithPrefix", "needGnChallenge", "resetOauthLoginManagerAutoFill", "resetRequestDataId", "setOauthLoginManagerAutoFill", "setOauthLoginManagerData", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ScreenBrightnessBridgeExtension {
    private static boolean IsOverlapping;
    private static boolean equals;
    @Nullable
    private static String getMax;
    @NotNull
    public static final ScreenBrightnessBridgeExtension getMin = new ScreenBrightnessBridgeExtension();
    private static boolean isInside = true;
    @Nullable
    private static OauthParamsModel length;
    public static final SignContractRequest setMax = new SignContractRequest();
    @Nullable
    private static String setMin;
    private static boolean toFloatRange;
    private static boolean toIntRange;
    private static boolean toString;
    private static int values;

    private ScreenBrightnessBridgeExtension() {
    }

    @Nullable
    public static OauthParamsModel setMax() {
        return length;
    }

    public static void setMin(@Nullable String str) {
        setMin = str;
    }

    @Nullable
    public static String getMax() {
        return getMax;
    }

    public static void setMax(@Nullable String str) {
        getMax = str;
    }

    public static boolean length() {
        return toFloatRange;
    }

    public static void getMax(boolean z) {
        toIntRange = z;
    }

    public static boolean setMin() {
        return toIntRange;
    }

    public static void getMin(boolean z) {
        isInside = z;
    }

    public static boolean getMin() {
        return isInside;
    }

    public static boolean IsOverlapping() {
        return equals;
    }

    public static void setMin(boolean z) {
        equals = z;
    }

    public static void equals() {
        IsOverlapping = true;
    }

    public static boolean toFloatRange() {
        return IsOverlapping;
    }

    public static void setMax(boolean z) {
        toString = z;
    }

    public static boolean toIntRange() {
        return toString;
    }

    public static int isInside() {
        return values;
    }

    @NotNull
    public static String toDoubleRange() {
        String str;
        try {
            OauthParamsModel oauthParamsModel = length;
            if (oauthParamsModel == null || (str = oauthParamsModel.setMax) == null) {
                return "";
            }
            if (str != null) {
                String substring = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                return substring == null ? "" : substring;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (StringIndexOutOfBoundsException unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getMin;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String FastBitmap$CoordinateSystem() {
        /*
            id.dana.oauth.model.OauthParamsModel r0 = length
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.getMin
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScreenBrightnessBridgeExtension.FastBitmap$CoordinateSystem():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.equals;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String values() {
        /*
            id.dana.oauth.model.OauthParamsModel r0 = length
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.equals
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScreenBrightnessBridgeExtension.values():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.toDoubleRange;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String Grayscale$Algorithm() {
        /*
            id.dana.oauth.model.OauthParamsModel r0 = length
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.toDoubleRange
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScreenBrightnessBridgeExtension.Grayscale$Algorithm():java.lang.String");
    }

    public static boolean Mean$Arithmetic() {
        String str;
        String str2;
        OauthParamsModel oauthParamsModel = length;
        if (oauthParamsModel != null) {
            if (oauthParamsModel == null || (str = oauthParamsModel.getMin) == null) {
                str = "";
            }
            if (str.length() > 0) {
                OauthParamsModel oauthParamsModel2 = length;
                if (oauthParamsModel2 == null || (str2 = oauthParamsModel2.isInside) == null || str2.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.setMax;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String invoke() {
        /*
            id.dana.oauth.model.OauthParamsModel r0 = length
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.setMax
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScreenBrightnessBridgeExtension.invoke():java.lang.String");
    }

    @NotNull
    public static String invokeSuspend() {
        String str;
        OauthParamsModel oauthParamsModel = length;
        if (oauthParamsModel == null || (str = oauthParamsModel.hashCode) == null) {
            str = setMin;
        }
        return str == null ? "" : str;
    }

    public static void valueOf() {
        values = Random.Default.nextInt();
    }

    public static void ICustomTabsCallback() {
        values = 0;
    }

    public static void b() {
        IsOverlapping = false;
        toString = false;
    }

    public static void onNavigationEvent() {
        toFloatRange = false;
        length = null;
    }

    public static void getMin(@Nullable OauthParamsModel oauthParamsModel) {
        boolean z = false;
        toFloatRange = false;
        String str = null;
        length = null;
        if (oauthParamsModel != null) {
            CharSequence charSequence = oauthParamsModel.hashCode;
            if (charSequence == null || charSequence.length() == 0) {
                oauthParamsModel.hashCode = setMin;
            }
        }
        length = oauthParamsModel;
        if (oauthParamsModel != null) {
            str = oauthParamsModel.setMax;
        }
        CharSequence charSequence2 = str;
        if (charSequence2 == null || StringsKt.isBlank(charSequence2)) {
            z = true;
        }
        toFloatRange = !z;
    }
}
