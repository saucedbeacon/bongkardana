package o;

import android.annotation.SuppressLint;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048F@BX\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\f¨\u0006\u001a"}, d2 = {"Lid/dana/lib/gcontainer/util/UserAgentFactory;", "", "()V", "DANA_KIT", "", "DEFAULT_IDENTITY_SOURCE", "KIT_VERSION", "LOCAL_KIT", "SKYWALKER_PLATFORM_NAME", "TAG", "defaultUserAgent", "getDefaultUserAgent", "()Ljava/lang/String;", "language", "getLanguage", "<set-?>", "userAgent", "getUserAgent$annotations", "getUserAgent", "create", "", "platformName", "platformVersion", "kitVersion", "apiPackVersion", "identitySource", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class sendStartMsg {
    @NotNull
    private static String getMax = "";
    @NotNull
    public static final sendStartMsg getMin = new sendStartMsg();
    private static final String length;

    static {
        String simpleName = sendStartMsg.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "UserAgentFactory::class.java.simpleName");
        length = simpleName;
    }

    private sendStartMsg() {
    }

    @NotNull
    public static final String setMax() {
        if (getMax.length() > 0) {
            return getMax;
        }
        throw new IllegalStateException("Please init User Agent with UserAgentFactory.create()");
    }

    private static String getMax() {
        try {
            return System.getProperty("http.agent");
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    @SuppressLint({"DefaultLocale"})
    @JvmOverloads
    public static final void getMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "platformName");
        Intrinsics.checkNotNullParameter(str2, RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION);
        Intrinsics.checkNotNullParameter("1.5.1.3", "kitVersion");
        String str3 = "";
        Intrinsics.checkNotNullParameter(str3, "apiPackVersion");
        Intrinsics.checkNotNullParameter("EDIK/1.0.0", "identitySource");
        String str4 = Intrinsics.areEqual((Object) str, (Object) "Skywalker") ? "LocalKit" : "DanaKit";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append('/');
        sb.append("1.5.1.3");
        String obj = sb.toString();
        if (!Intrinsics.areEqual((Object) str, (Object) "Skywalker")) {
            str3 = "DanaApiPack/".concat(str3);
        }
        if (!Intrinsics.areEqual((Object) str, (Object) "Skywalker")) {
            str = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toUpperCase()");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('/');
        sb2.append(str2);
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(' ');
        sb3.append("EDIK/1.0.0");
        sb3.append(' ');
        sb3.append(getMax());
        sb3.append(" Ariver/2.25.2");
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(' ');
        sb4.append(obj);
        sb4.append(' ');
        sb4.append(str3);
        sb4.append(" Lang/");
        String obj4 = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(obj4, "Locale.getDefault().toString()");
        sb4.append(StringsKt.endsWith$default(obj4, "ID", false, 2, (Object) null) ? "id-ID" : "en-US");
        getMax = sb4.toString();
        String str5 = length;
        StringBuilder sb5 = new StringBuilder("User-Agent=");
        sb5.append(setMax());
        LocationBridgeExtension.setMin(str5, sb5.toString());
    }
}
