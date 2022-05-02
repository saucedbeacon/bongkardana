package com.iap.ac.android.r0;

import com.iap.ac.android.m0.b;
import com.iap.ac.android.mpm.node.base.NodeType;
import java.util.Map;

public class a extends b {
    public final Map<String, String> b;
    public final String c;
    public String d;
    public final boolean e;

    public a(Map<String, String> map, String str, boolean z) {
        super(NodeType.SwapOrder);
        this.b = map;
        this.c = str;
        this.e = z;
    }

    public a(Map<String, String> map, String str, String str2, boolean z) {
        super(NodeType.SwapOrder);
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = z;
    }
}
