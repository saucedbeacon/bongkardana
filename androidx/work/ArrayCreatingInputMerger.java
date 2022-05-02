package androidx.work;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.getSupportBackgroundTintList;
import o.updateAppearance;

public final class ArrayCreatingInputMerger extends getSupportBackgroundTintList {
    @NonNull
    public final updateAppearance getMax(@NonNull List<updateAppearance> list) {
        Object newInstance;
        Object newInstance2;
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        HashMap hashMap = new HashMap();
        loop0:
        for (updateAppearance updateappearance : list) {
            Iterator<Map.Entry<String, Object>> it = Collections.unmodifiableMap(updateappearance.setMin).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (!cls2.equals(cls)) {
                            if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                                int length = Array.getLength(obj);
                                newInstance = Array.newInstance(value.getClass(), length + 1);
                                System.arraycopy(obj, 0, newInstance, 0, length);
                                Array.set(newInstance, length, value);
                            } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                                int length2 = Array.getLength(value);
                                newInstance = Array.newInstance(obj.getClass(), length2 + 1);
                                System.arraycopy(value, 0, newInstance, 0, length2);
                                Array.set(newInstance, length2, obj);
                            }
                            value = newInstance;
                        } else if (cls2.isArray()) {
                            int length3 = Array.getLength(obj);
                            int length4 = Array.getLength(value);
                            Object newInstance3 = Array.newInstance(obj.getClass().getComponentType(), length3 + length4);
                            System.arraycopy(obj, 0, newInstance3, 0, length3);
                            System.arraycopy(value, 0, newInstance3, length3, length4);
                            value = newInstance3;
                        } else {
                            newInstance2 = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance2, 0, obj);
                            Array.set(newInstance2, 1, value);
                        }
                        hashMap.put(str, value);
                    } else if (!cls.isArray()) {
                        newInstance2 = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance2, 0, value);
                    } else {
                        hashMap.put(str, value);
                    }
                    value = newInstance2;
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        getmin.setMin(hashMap);
        updateAppearance updateappearance2 = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance2);
        return updateappearance2;
    }
}
