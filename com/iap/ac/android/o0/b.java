package com.iap.ac.android.o0;

import com.iap.ac.android.mpm.base.model.hook.HookConstants;
import com.iap.ac.android.mpm.base.model.hook.PreCreateOrderConfig;
import com.iap.ac.android.mpm.node.base.NodeType;

public class b extends com.iap.ac.android.m0.b {
    public final String b;
    public PreCreateOrderConfig c;
    public String d;

    public b(PreCreateOrderConfig preCreateOrderConfig) {
        super(NodeType.CommonHook);
        this.b = HookConstants.HookCategory.HOOK_CATEGORY_TRADEPAY;
        this.c = preCreateOrderConfig;
    }

    public b(String str) {
        super(NodeType.CommonHook);
        this.b = "URL";
        this.d = str;
    }
}
