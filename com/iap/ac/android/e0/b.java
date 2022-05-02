package com.iap.ac.android.e0;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.c0.a;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.node.base.NodeType;

public class b extends com.iap.ac.android.c0.b<a> {
    public void a(@NonNull a aVar, @NonNull com.iap.ac.android.m0.b bVar) {
        NodeType nodeType = bVar.f9747a;
        if (NodeType.DecodeOrder.equals(nodeType)) {
            a((a) aVar, (com.iap.ac.android.n0.b) bVar);
        } else {
            ACLog.w(Constants.TAG, "GolOrderCodeRoute node type is illegal".concat(String.valueOf(nodeType)));
        }
    }
}
