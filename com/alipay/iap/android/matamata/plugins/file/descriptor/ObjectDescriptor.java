package com.alipay.iap.android.matamata.plugins.file.descriptor;

import com.facebook.flipper.core.FlipperObject;
import java.util.List;

public class ObjectDescriptor implements NodeDescriptor<Object> {
    public Object[] getChildren(Object obj) {
        return null;
    }

    public List<Named<FlipperObject>> getData(Object obj) throws Exception {
        return null;
    }

    public String getId(Object obj) {
        return Integer.toString(System.identityHashCode(obj));
    }

    public String getName(Object obj) {
        return obj.toString();
    }
}
