package com.alipay.alipaysecuritysdk.apdid.face;

import com.alipay.alipaysecuritysdk.common.c.a;
import com.alipay.alipaysecuritysdk.common.c.b;
import java.util.Map;

public class APExpansion {
    /* access modifiers changed from: private */
    public static ExpansionForEvent mExpansionForEvent;
    /* access modifiers changed from: private */
    public static ExpansionForLog mExpansionForLog;

    public interface ExpansionForEvent {
        void on(String str, String str2, String str3, Map<String, String> map);
    }

    public interface ExpansionForLog {
        void print(String str, String str2);
    }

    public static void registerLog(ExpansionForLog expansionForLog, ExpansionForEvent expansionForEvent) {
        mExpansionForLog = expansionForLog;
        b.f9271a = new b.a() {
            public final void print(String str, String str2) {
                try {
                    APExpansion.mExpansionForLog.print(str, str2);
                } catch (Throwable th) {
                    b.a("SEC_SDK-apdid", th);
                }
            }
        };
        mExpansionForEvent = expansionForEvent;
        a.f9270a = new a.C0011a() {
            public final void on(String str, String str2, String str3, Map<String, String> map) {
                try {
                    APExpansion.mExpansionForEvent.on(str, str2, str3, map);
                } catch (Throwable th) {
                    b.a("SEC_SDK-apdid", th);
                }
            }
        };
    }
}
