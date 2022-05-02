package o;

import java.lang.reflect.Field;

public final class setLogUploadRpcClient extends setLogConfigHost {
    private final Field length;

    public setLogUploadRpcClient(Field field) {
        super(field.getName(), field.getType(), field.getGenericType());
        this.length = field;
        field.setAccessible(true);
    }

    public final void length(Object obj, Object obj2) throws Exception {
        this.length.set(obj, obj2);
    }
}
