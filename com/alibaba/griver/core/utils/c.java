package com.alibaba.griver.core.utils;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.griver.api.common.GriverEvent;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.core.point.GriverEventManifest;
import java.util.ArrayList;
import java.util.List;

public class c {
    public static ExtensionMetaInfo a(GriverEventManifest griverEventManifest) {
        if (griverEventManifest == null || !ReflectUtils.classExist(griverEventManifest.getHandlerClassName()) || griverEventManifest.getEventClassNames() == null || griverEventManifest.getEventClassNames().size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : griverEventManifest.getEventClassNames()) {
            if (TextUtils.isEmpty(next) || !ReflectUtils.classExist(next)) {
                GriverLogger.w("GriverCore:ExtensionRegistryUtils", "register point but filter is null");
            } else {
                try {
                    if (GriverEvent.class.isAssignableFrom(Class.forName(next))) {
                        arrayList.add(next);
                    } else {
                        GriverLogger.w("GriverCore:ExtensionRegistryUtils", "filter not extends from GriverEvent, do not register");
                    }
                } catch (Throwable th) {
                    GriverLogger.e("GriverCore:ExtensionRegistryUtils", "skip for ".concat(String.valueOf(next)), th);
                }
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        if (griverEventManifest.getScope() != null) {
            return new ExtensionMetaInfo("com-alibaba-griver", griverEventManifest.getHandlerClassName(), (List<String>) arrayList, griverEventManifest.getScope());
        }
        return new ExtensionMetaInfo("com-alibaba-griver", griverEventManifest.getHandlerClassName(), arrayList);
    }
}
