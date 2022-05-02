package com.alipay.mobile.rome.syncsdk.util;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static volatile TraceLogger f9459a;

    public static void a(String str, String str2) {
        if (f9459a == null) {
            f9459a = LoggerFactory.getTraceLogger();
        }
        f9459a.debug("sync_".concat(String.valueOf(str)), str2);
    }

    public static void b(String str, String str2) {
        if (f9459a == null) {
            f9459a = LoggerFactory.getTraceLogger();
        }
        f9459a.info("sync_".concat(String.valueOf(str)), str2);
    }

    public static void c(String str, String str2) {
        if (f9459a == null) {
            f9459a = LoggerFactory.getTraceLogger();
        }
        f9459a.warn("sync_".concat(String.valueOf(str)), str2);
    }

    public static void d(String str, String str2) {
        if (f9459a == null) {
            f9459a = LoggerFactory.getTraceLogger();
        }
        f9459a.error("sync_".concat(String.valueOf(str)), str2);
    }

    public static void a(String str, String str2, Throwable th) {
        if (f9459a == null) {
            f9459a = LoggerFactory.getTraceLogger();
        }
        f9459a.error("sync_".concat(String.valueOf(str)), str2, th);
    }
}
