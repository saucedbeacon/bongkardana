package com.uc.crashsdk;

import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.b;
import com.uc.crashsdk.f;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class g extends f.C0040f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ File f9890a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(String str, f.e eVar, File file) {
        super(str, eVar);
        this.f9890a = file;
    }

    public final boolean a() {
        String a2 = b.a(this.f9890a, 64, true);
        if (a2 == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(a2);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    this.c.b = Long.parseLong(matcher.group(2));
                    this.c.c = Integer.parseInt(matcher.group(3));
                    this.c.d = Integer.parseInt(matcher.group(4));
                    this.c.f9889a = parseLong;
                }
            }
        } catch (Throwable th) {
            a.a(th, false);
        }
        return true;
    }
}
