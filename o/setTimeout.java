package o;

import android.text.TextUtils;
import com.alipay.mobile.framework.service.annotation.OperationType;
import java.lang.reflect.Method;

public final class setTimeout {
    private setTimeout() {
    }

    public static String getOperationType(Class cls) {
        OperationType operationType;
        if (cls == null) {
            return "unknown";
        }
        for (Method method : cls.getMethods()) {
            if (!(method == null || (operationType = (OperationType) method.getAnnotation(OperationType.class)) == null)) {
                String value = operationType.value();
                if (!TextUtils.isEmpty(value)) {
                    return value;
                }
            }
        }
        return "unknown";
    }
}
