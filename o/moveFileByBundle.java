package o;

import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

public abstract class moveFileByBundle {
    private static final Map<String, String> length;

    public static boolean length(@NonNull String str) {
        return length.containsKey(str);
    }

    public static int length(@NonNull String str, @NonNull int[] iArr) {
        String str2 = length.get(str);
        if (str2 == null) {
            return 0;
        }
        int length2 = str2.length();
        if (length2 == 1) {
            iArr[0] = str2.charAt(0);
        } else {
            iArr[0] = str2.charAt(0);
            iArr[1] = str2.charAt(1);
        }
        return length2;
    }

    static {
        Map<String, String> map;
        try {
            Field declaredField = SSLExtensionsFactory.class.getDeclaredField("getMax");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get((Object) null);
        } catch (Throwable unused) {
            map = Collections.emptyMap();
        }
        length = map;
    }
}
