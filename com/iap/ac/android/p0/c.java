package com.iap.ac.android.p0;

import com.iap.ac.android.m0.b;
import com.iap.ac.android.mpm.node.base.NodeType;
import java.util.List;

public class c extends b {
    public String b;
    public String c;
    public List<String> d;

    public c(String str, String str2, List<String> list) {
        super(NodeType.GetAuthCode);
        this.b = str;
        this.c = str2;
        this.d = list;
    }
}
