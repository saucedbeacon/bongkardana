package com.alipay.iap.android.matamata.plugins.file.descriptor;

import com.facebook.flipper.core.FlipperObject;
import java.util.List;

public interface NodeDescriptor<T> {
    Object[] getChildren(T t);

    List<Named<FlipperObject>> getData(T t) throws Exception;

    String getId(T t);

    String getName(T t);
}
