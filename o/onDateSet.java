package o;

import android.telephony.PhoneNumberUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u0010\u001a\u00020\u0004*\u00020\u0004H\u0002¨\u0006\u0011"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/launchothersapp/WhatsAppConversation;", "", "()V", "generateChatWhatsAppUrl", "", "targetPhoneNumber", "message", "getWhatsAppChatIntent", "Landroid/content/Intent;", "openApp", "", "context", "Landroid/content/Context;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "formatPhoneNumber", "getIndoPhoneNumber", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class onDateSet {
    @NotNull
    public static final onDateSet setMin = new onDateSet();

    private onDateSet() {
    }

    public static String setMax(String str) {
        String stripSeparators = PhoneNumberUtils.stripSeparators(StringsKt.replace$default(StringsKt.replace$default(str, " ", "", false, 4, (Object) null), "+", "", false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(stripSeparators, "PhoneNumberUtils.stripSe… \", \"\").replace(\"+\", \"\"))");
        return stripSeparators;
    }

    public static String length(String str) {
        if (str.charAt(0) != '0') {
            return str;
        }
        return new Regex("0").replaceFirst(str, "62");
    }
}
