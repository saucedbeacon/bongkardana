package com.alibaba.ariver.kernel.common.utils;

public class RVTracePhase {
    public static int cookieSeed = 500;
    public int cookie;
    public String phaseName;

    public RVTracePhase(String str) {
        this.phaseName = str;
        int i = cookieSeed;
        cookieSeed = i + 1;
        this.cookie = i;
    }
}
