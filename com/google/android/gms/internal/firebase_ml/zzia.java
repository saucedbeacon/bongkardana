package com.google.android.gms.internal.firebase_ml;

import java.util.Comparator;

final class zzia implements Comparator<String> {
    zzia(zzib zzib) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (zzlk.equal(str, str2)) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
