package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.splitcompat.p;

public final /* synthetic */ class w {

    /* renamed from: a  reason: collision with root package name */
    private static y f9562a;

    static synchronized y a(Context context) {
        y yVar;
        synchronized (w.class) {
            if (f9562a == null) {
                x xVar = new x((byte[]) null);
                xVar.a(new g(p.a(context)));
                f9562a = xVar.a();
            }
            yVar = f9562a;
        }
        return yVar;
    }
}
