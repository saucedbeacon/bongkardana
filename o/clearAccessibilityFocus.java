package o;

import com.facebook.litho.displaylist.DisplayListException;
import java.lang.reflect.Method;

final class clearAccessibilityFocus {
    clearAccessibilityFocus() {
    }

    static Object setMin(Method method, Object obj, Object... objArr) throws DisplayListException {
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            throw new DisplayListException(e);
        }
    }
}
