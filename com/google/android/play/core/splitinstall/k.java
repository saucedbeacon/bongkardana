package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitcompat.p;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static m f9620a;

    private k() {
    }

    public static synchronized m a(Context context) {
        m mVar;
        synchronized (k.class) {
            if (f9620a == null) {
                b bVar = new b((byte[]) null);
                bVar.a(new y(p.a(context)));
                f9620a = bVar.a();
            }
            mVar = f9620a;
        }
        return mVar;
    }
}
