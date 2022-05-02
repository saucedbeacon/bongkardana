package io.branch.referral;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import o.getMessageCount;

public class DeferredAppLinkDataHandler$1 implements InvocationHandler {
    final /* synthetic */ getMessageCount.getMin getMin;
    final /* synthetic */ Class setMin;

    public DeferredAppLinkDataHandler$1(Class cls, getMessageCount.getMin getmin) {
        this.setMin = cls;
        this.getMin = getmin;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onDeferredAppLinkDataFetched") || objArr[0] == null) {
            getMessageCount.getMin getmin = this.getMin;
            if (getmin != null) {
                getmin.getMin((String) null);
            }
        } else {
            Bundle cast = Bundle.class.cast(this.setMin.getMethod("getArgumentBundle", new Class[0]).invoke(this.setMin.cast(objArr[0]), new Object[0]));
            String string = cast != null ? cast.getString("com.facebook.platform.APPLINK_NATIVE_URL") : null;
            getMessageCount.getMin getmin2 = this.getMin;
            if (getmin2 != null) {
                getmin2.getMin(string);
            }
        }
        return null;
    }
}
