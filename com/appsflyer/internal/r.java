package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.d;
import com.google.firebase.iid.ServiceStarter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class r {

    public interface c {
        /* renamed from: ॱ  reason: contains not printable characters */
        void m1284(String str, Exception exc);

        /* renamed from: ॱ  reason: contains not printable characters */
        void m1285(@NonNull String str, @NonNull String str2);
    }

    r() {
    }

    /* renamed from: com.appsflyer.internal.r$3  reason: invalid class name */
    public static class AnonymousClass3 implements InvocationHandler {

        /* renamed from: ॱ  reason: contains not printable characters */
        private /* synthetic */ c f8773;

        public AnonymousClass3(c cVar) {
            this.f8773 = cVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onLvlResult")) {
                String str = objArr[0] != null ? objArr[0] : null;
                String str2 = objArr[1] != null ? objArr[1] : null;
                c cVar = this.f8773;
                if (cVar == null) {
                    AFLogger.afDebugLog("onLvlResult invocation succeeded, but listener is null");
                } else if (str != null && str2 != null) {
                    cVar.m1285(str, str2);
                } else if (str2 == null) {
                    this.f8773.m1284("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                } else {
                    this.f8773.m1284("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                }
            } else if (method.getName().equals("onLvlFailure")) {
                c cVar2 = this.f8773;
                if (cVar2 == null) {
                    AFLogger.afDebugLog("onLvlFailure: listener is null");
                } else if (objArr[0] != null) {
                    cVar2.m1284("onLvlFailure with exception", objArr[0]);
                } else {
                    cVar2.m1284("onLvlFailure", new Exception("unknown"));
                }
            } else {
                c cVar3 = this.f8773;
                if (cVar3 != null) {
                    cVar3.m1284("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                }
            }
            return null;
        }

        AnonymousClass3() {
        }

        /* renamed from: ˏ  reason: contains not printable characters */
        public static boolean m1283(Context context) {
            if (AppsFlyerLib.getInstance().isTrackingStopped()) {
                return false;
            }
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
                if (context.getPackageManager().queryIntentServices(new Intent(ServiceStarter.ACTION_MESSAGING_EVENT, (Uri) null, context, FirebaseMessagingServiceListener.class), 0).size() > 0) {
                    return true;
                }
                AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                return false;
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
            }
        }

        /* renamed from: ˊ  reason: contains not printable characters */
        public static void m1282(Context context, String str) {
            if (str != null) {
                AFLogger.afInfoLog("updateServerUninstallToken called with: ".concat(String.valueOf(str)));
                d.b.e r0 = d.b.e.m1268(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                SharedPreferences r2 = AppsFlyerLibCore.m1180(context);
                if (!r2.getBoolean("sentRegisterRequestToAF", false) || r0.f8738 == null || !r0.f8738.equals(str)) {
                    AppsFlyerProperties.getInstance().set("afUninstallToken", str);
                    if (AppsFlyerLibCore.m1191(r2)) {
                        AppsFlyerLibCore.getInstance().m1200(context, str);
                    }
                }
            }
        }
    }
}
