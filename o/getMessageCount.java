package o;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.DeferredAppLinkDataHandler$1;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class getMessageCount {

    public interface getMin {
        void getMin(String str);
    }

    getMessageCount() {
    }

    public static Boolean setMax(Context context, getMin getmin) {
        boolean z = true;
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls2});
            DeferredAppLinkDataHandler$1 deferredAppLinkDataHandler$1 = new DeferredAppLinkDataHandler$1(cls, getmin);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, deferredAppLinkDataHandler$1);
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                z = false;
                return Boolean.valueOf(z);
            }
            method.invoke((Object) null, new Object[]{context, string, newProxyInstance});
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
        }
    }
}
