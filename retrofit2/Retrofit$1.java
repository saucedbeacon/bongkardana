package retrofit2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import o.UtdidDeviceIdProvider;
import o.getInnerTraceLogger;
import o.getLogContext;
import o.getProcessInfo;

public class Retrofit$1 implements InvocationHandler {
    final /* synthetic */ UtdidDeviceIdProvider getMin;
    private final getProcessInfo setMax = getProcessInfo.setMax();
    final /* synthetic */ Class setMin;

    public Retrofit$1(UtdidDeviceIdProvider utdidDeviceIdProvider, Class cls) {
        this.getMin = utdidDeviceIdProvider;
        this.setMin = cls;
    }

    public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (this.setMax.getMin(method)) {
            return this.setMax.getMin(method, this.setMin, obj, objArr);
        }
        getInnerTraceLogger<?, ?> min = this.getMin.setMin(method);
        return min.length.setMax(new getLogContext(min, objArr));
    }
}
