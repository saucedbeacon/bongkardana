package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/savings/parser/SavingErrorParser;", "", "()V", "ERROR_MSG_DEFAULT", "", "ERROR_MSG_PREFIX", "getErrorCode", "msg", "getErrorMessage", "context", "Landroid/content/Context;", "getErrorMessageFromErrorCode", "errorCode", "getStringResourceByName", "key", "pareseJsonStr", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSurfaceTextureDestroyed {
    @NotNull
    public static final onSurfaceTextureDestroyed getMax = new onSurfaceTextureDestroyed();

    private onSurfaceTextureDestroyed() {
    }

    @NotNull
    public static String setMax(@NotNull Context context, @Nullable String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-850970765, oncanceled);
                onCancelLoad.getMin(-850970765, oncanceled);
            }
        }
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            String min2 = getMin(str);
            StringBuilder sb = new StringBuilder();
            sb.append("error_saving_");
            sb.append(min2);
            String length2 = length(context, sb.toString());
            if (length2 == null) {
                return "System is Busy";
            }
            return length2;
        } catch (Exception unused) {
            return "System is Busy";
        }
    }

    @Nullable
    public static String getMax(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "errorCode");
        StringBuilder sb = new StringBuilder();
        sb.append("error_saving_");
        sb.append(str);
        return length(context, sb.toString());
    }

    private static String length(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-308780447, oncanceled);
                onCancelLoad.getMin(-308780447, oncanceled);
            }
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return context.getString(context.getResources().getIdentifier(str, "string", packageName));
    }

    @NotNull
    public static String getMin(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append((String) StringsKt.split$default((CharSequence) StringsKt.split$default((CharSequence) str, new String[]{"}:"}, false, 0, 6, (Object) null).get(0), new String[]{"{"}, false, 0, 6, (Object) null).get(1));
            sb.append("}");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{");
            sb2.append(obj);
            String string = new JSONObject(sb2.toString()).getString("errorCode");
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject(jsonStr).getString(\"errorCode\")");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }
}
