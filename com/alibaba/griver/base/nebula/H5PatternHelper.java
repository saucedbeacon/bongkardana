package com.alibaba.griver.base.nebula;

import android.util.LruCache;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class H5PatternHelper {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f10232a = GriverEnv.isDebuggable();
    private static LruCache<String, Pattern> b = new LruCache<>(20);

    public static boolean matchRegex(String str, String str2) {
        Pattern compile;
        if (str == null || str2 == null || (compile = compile(str)) == null) {
            return false;
        }
        return compile.matcher(str2).matches();
    }

    @Nullable
    public static Pattern compile(String str) {
        if (str == null) {
            return null;
        }
        Pattern pattern = b.get(str);
        if (pattern != null) {
            if (f10232a) {
                RVLogger.d("H5PatternHelper", "pattern cache hit: ".concat(String.valueOf(str)));
            }
            return pattern;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Pattern compile = Pattern.compile(str);
            b.put(str, compile);
            if (f10232a) {
                StringBuilder sb = new StringBuilder("pattern cache miss, use time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append(" ");
                sb.append(str);
                RVLogger.d("H5PatternHelper", sb.toString());
            }
            return compile;
        } catch (PatternSyntaxException e) {
            StringBuilder sb2 = new StringBuilder("pattern ");
            sb2.append(str);
            sb2.append(" compile error!");
            RVLogger.e("H5PatternHelper", sb2.toString(), e);
            return null;
        }
    }
}
