package com.iap.ac.android.d0;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.c0.a;
import com.iap.ac.android.c0.b;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.node.base.NodeType;

public class e extends b<d> {
    public void a(@NonNull d dVar, @NonNull com.iap.ac.android.m0.b bVar) {
        NodeType nodeType = bVar.f9747a;
        if (NodeType.DecodeOrder.equals(nodeType)) {
            a((a) dVar, (com.iap.ac.android.n0.b) bVar);
        } else {
            ACLog.w(Constants.TAG, "GofOrderCodeRoute node type is illegal".concat(String.valueOf(nodeType)));
        }
    }
}
