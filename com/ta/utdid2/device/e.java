package com.ta.utdid2.device;

import com.ta.utdid2.a.a.a;
import com.ta.utdid2.a.a.b;

public class e {
    public String n(String str) {
        return a.k(str);
    }

    public String o(String str) {
        String k = a.k(str);
        if (!com.ta.utdid2.a.a.e.isEmpty(k)) {
            try {
                return new String(b.decode(k, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
