package o;

import java.beans.FeatureDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.BeanAccess;

public final class refreshSessionID {
    public final Map<Class<?>, Set<setLogHost>> getMax;
    public BeanAccess getMin;
    private asyncUploadCoreByCategoryDirectly isInside;
    private boolean length;
    public boolean setMax;
    private final Map<Class<?>, Map<String, setLogHost>> setMin;

    public refreshSessionID() {
        this(new asyncUploadCoreByCategoryDirectly());
    }

    private refreshSessionID(asyncUploadCoreByCategoryDirectly asyncuploadcorebycategorydirectly) {
        this.setMin = new HashMap();
        this.getMax = new HashMap();
        this.getMin = BeanAccess.DEFAULT;
        this.setMax = false;
        this.length = false;
        this.isInside = asyncuploadcorebycategorydirectly;
        if (asyncuploadcorebycategorydirectly.getMin()) {
            this.getMin = BeanAccess.FIELD;
        }
    }

    private Map<String, setLogHost> getMin(Class<?> cls, BeanAccess beanAccess) {
        if (this.setMin.containsKey(cls)) {
            return this.setMin.get(cls);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        if (AnonymousClass3.getMin[beanAccess.ordinal()] != 1) {
            try {
                for (PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(cls).getPropertyDescriptors()) {
                    Method readMethod = propertyDescriptor.getReadMethod();
                    if ((readMethod == null || !readMethod.getName().equals("getClass")) && !getMin(propertyDescriptor)) {
                        linkedHashMap.put(propertyDescriptor.getName(), new getLogHost(propertyDescriptor));
                    }
                }
                boolean z2 = false;
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    for (Field field : cls2.getDeclaredFields()) {
                        int modifiers = field.getModifiers();
                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                            if (Modifier.isPublic(modifiers)) {
                                linkedHashMap.put(field.getName(), new setLogUploadRpcClient(field));
                            } else {
                                z2 = true;
                            }
                        }
                    }
                }
                z = z2;
            } catch (IntrospectionException e) {
                throw new YAMLException((Throwable) e);
            }
        } else {
            for (Class<?> cls3 = cls; cls3 != null; cls3 = cls3.getSuperclass()) {
                for (Field field2 : cls3.getDeclaredFields()) {
                    int modifiers2 = field2.getModifiers();
                    if (!Modifier.isStatic(modifiers2) && !Modifier.isTransient(modifiers2) && !linkedHashMap.containsKey(field2.getName())) {
                        linkedHashMap.put(field2.getName(), new setLogUploadRpcClient(field2));
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty() || !z) {
            this.setMin.put(cls, linkedHashMap);
            return linkedHashMap;
        }
        StringBuilder sb = new StringBuilder("No JavaBean properties found in ");
        sb.append(cls.getName());
        throw new YAMLException(sb.toString());
    }

    /* renamed from: o.refreshSessionID$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMin;

        static {
            int[] iArr = new int[BeanAccess.values().length];
            getMin = iArr;
            try {
                iArr[BeanAccess.FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static boolean getMin(FeatureDescriptor featureDescriptor) {
        return Boolean.TRUE.equals(featureDescriptor.getValue("transient"));
    }

    public final setLogHost setMax(Class<? extends Object> cls, String str, BeanAccess beanAccess) {
        setLogHost setloghost = getMin(cls, beanAccess).get(str);
        if (setloghost == null && this.length) {
            setloghost = new updateLogStrategy(str);
        }
        if (setloghost != null) {
            return setloghost;
        }
        StringBuilder sb = new StringBuilder("Unable to find property '");
        sb.append(str);
        sb.append("' on class: ");
        sb.append(cls.getName());
        throw new YAMLException(sb.toString());
    }
}
