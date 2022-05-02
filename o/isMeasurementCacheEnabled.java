package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Base64;
import com.alipay.mobile.security.bio.api.BioError;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.common.net.HttpHeaders;
import com.twilio.verify.networking.HttpMethod;
import com.twilio.verify.networking.MediaTypeHeader;
import com.twilio.verify.networking.MediaTypeValue;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/twilio/verify/networking/RequestHelper;", "", "context", "Landroid/content/Context;", "authorization", "Lcom/twilio/verify/networking/BasicAuthorization;", "(Landroid/content/Context;Lcom/twilio/verify/networking/BasicAuthorization;)V", "authorizationHeader", "Lkotlin/Pair;", "", "userAgentHeader", "commonHeaders", "", "httpMethod", "Lcom/twilio/verify/networking/HttpMethod;", "generateUserAgent", "mediaTypeHeaders", "acceptTypeValue", "Lcom/twilio/verify/networking/MediaTypeValue;", "contentTypeValue", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class isMeasurementCacheEnabled {
    private final Pair<String, String> length;
    private final Pair<String, String> setMin;

    public isMeasurementCacheEnabled(@NotNull Context context, @NotNull getPaddingEnd getpaddingend) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(getpaddingend, "authorization");
        StringBuilder sb = new StringBuilder();
        CharSequence loadLabel = context.getApplicationInfo().loadLabel(context.getPackageManager());
        Intrinsics.checkExpressionValueIsNotNull(loadLabel, "context.applicationInfo.…l(context.packageManager)");
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            Intrinsics.checkExpressionValueIsNotNull(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
            i = (int) packageInfo.getLongVersionCode();
        } else {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        StringBuilder sb2 = new StringBuilder("Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(" (");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(')');
        String obj = sb2.toString();
        String str2 = Build.MODEL;
        sb.append(loadLabel);
        sb.append("; ");
        sb.append("Android");
        sb.append("; ");
        sb.append(str);
        sb.append("; ");
        sb.append(i);
        sb.append("; ");
        sb.append(obj);
        sb.append("; ");
        sb.append(str2);
        sb.append("; ");
        sb.append("VerifySDK");
        sb.append("; ");
        sb.append("0.2.0");
        sb.append("; ");
        sb.append(BioError.RESULT_FAIL_NOT_REALNAME);
        String obj2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(obj2, "userAgentBuilder.toString()");
        this.setMin = new Pair<>(HttpHeaders.USER_AGENT, obj2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getpaddingend.setMax);
        sb3.append(':');
        sb3.append(getpaddingend.getMax);
        String obj3 = sb3.toString();
        Charset charset = Charsets.UTF_8;
        if (obj3 != null) {
            byte[] bytes = obj3.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            Intrinsics.checkParameterIsNotNull(bytes, "input");
            byte[] encode = Base64.encode(bytes, 2);
            Intrinsics.checkExpressionValueIsNotNull(encode, "encoded");
            this.length = TuplesKt.to(HttpHeaders.AUTHORIZATION, "Basic ".concat(new String(encode, Charsets.UTF_8)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public final Map<String, String> setMax(@Nullable HttpMethod httpMethod) {
        Map<String, String> mapOf = MapsKt.mapOf(this.setMin, this.length);
        if (httpMethod != null) {
            int i = shouldMeasureChild.length[httpMethod.ordinal()];
            if (i == 1 || i == 2) {
                return MapsKt.plus(mapOf, getMin(MediaTypeValue.Json, MediaTypeValue.UrlEncoded));
            }
            if (i == 3) {
                MediaTypeValue mediaTypeValue = MediaTypeValue.UrlEncoded;
                return MapsKt.plus(mapOf, getMin(mediaTypeValue, mediaTypeValue));
            }
        }
        return mapOf;
    }

    private static Map<String, String> getMin(MediaTypeValue mediaTypeValue, MediaTypeValue mediaTypeValue2) {
        return MapsKt.mapOf(TuplesKt.to(MediaTypeHeader.Accept.getType(), mediaTypeValue.getType()), TuplesKt.to(MediaTypeHeader.ContentType.getType(), mediaTypeValue2.getType()));
    }
}
