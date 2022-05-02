package o;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class getLogConfigHost extends setLogHost {
    private static final Logger getMax = Logger.getLogger(getLogConfigHost.class.getPackage().getName());
    private setLogHost equals;
    private transient Method getMin;
    protected Class<?>[] length;
    private final String setMax;
    protected Class<?> setMin;
    private boolean toFloatRange;
    private Field toIntRange;

    public final Class<?>[] setMin() {
        setLogHost setloghost;
        if (this.length != null || (setloghost = this.equals) == null) {
            return this.length;
        }
        return setloghost.setMin();
    }

    public final void length(Object obj, Object obj2) throws Exception {
        Method method = this.getMin;
        if (method == null) {
            Field field = this.toIntRange;
            if (field != null) {
                field.set(obj, obj2);
                return;
            }
            setLogHost setloghost = this.equals;
            if (setloghost != null) {
                setloghost.length(obj, obj2);
                return;
            }
            Logger logger = getMax;
            StringBuilder sb = new StringBuilder("No setter/delegate for '");
            String length2 = super.length();
            if (length2 == null) {
                setLogHost setloghost2 = this.equals;
                length2 = setloghost2 != null ? setloghost2.length() : null;
            }
            sb.append(length2);
            sb.append("' on object ");
            sb.append(obj);
            logger.warning(sb.toString());
        } else if (!this.toFloatRange) {
            method.invoke(obj, new Object[]{obj2});
        } else if (obj2 == null) {
        } else {
            if (obj2 instanceof Collection) {
                for (Object obj3 : (Collection) obj2) {
                    this.getMin.invoke(obj, new Object[]{obj3});
                }
            } else if (obj2 instanceof Map) {
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    this.getMin.invoke(obj, new Object[]{entry.getKey(), entry.getValue()});
                }
            } else if (obj2.getClass().isArray()) {
                int length3 = Array.getLength(obj2);
                for (int i = 0; i < length3; i++) {
                    this.getMin.invoke(obj, new Object[]{Array.get(obj2, i)});
                }
            }
        }
    }

    public final String length() {
        String length2 = super.length();
        if (length2 != null) {
            return length2;
        }
        setLogHost setloghost = this.equals;
        if (setloghost != null) {
            return setloghost.length();
        }
        return null;
    }

    public final Class<?> getMax() {
        Class<?> max = super.getMax();
        if (max != null) {
            return max;
        }
        setLogHost setloghost = this.equals;
        if (setloghost != null) {
            return setloghost.getMax();
        }
        return null;
    }

    public final boolean setMax() {
        if (this.getMin != null || this.toIntRange != null) {
            return true;
        }
        setLogHost setloghost = this.equals;
        return setloghost != null && setloghost.setMax();
    }

    public final void setMax(setLogHost setloghost) {
        Class<?>[] clsArr;
        Method method;
        this.equals = setloghost;
        String str = this.setMax;
        if (str != null && this.getMin == null && !this.toFloatRange) {
            this.toFloatRange = true;
            Class cls = this.setMin;
            if (this.length != null || setloghost == null) {
                clsArr = this.length;
            } else {
                clsArr = setloghost.setMin();
            }
            loop0:
            while (true) {
                method = null;
                if (cls != null) {
                    for (Method method2 : cls.getDeclaredMethods()) {
                        if (str.equals(method2.getName())) {
                            Class[] parameterTypes = method2.getParameterTypes();
                            if (parameterTypes.length == clsArr.length) {
                                boolean z = true;
                                for (int i = 0; i < parameterTypes.length; i++) {
                                    if (!parameterTypes[i].isAssignableFrom(clsArr[i])) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    method2.setAccessible(true);
                                    method = method2;
                                    break loop0;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    cls = cls.getSuperclass();
                } else if (getMax.isLoggable(Level.FINE)) {
                    Logger logger = getMax;
                    Object[] objArr = new Object[4];
                    objArr[0] = str;
                    objArr[1] = Integer.valueOf(clsArr.length);
                    objArr[2] = this.setMin.getName();
                    String length2 = super.length();
                    if (length2 == null) {
                        setLogHost setloghost2 = this.equals;
                        length2 = setloghost2 != null ? setloghost2.length() : null;
                    }
                    objArr[3] = length2;
                    logger.fine(String.format("Failed to find [%s(%d args)] for %s.%s", objArr));
                }
            }
            this.getMin = method;
        }
    }
}
