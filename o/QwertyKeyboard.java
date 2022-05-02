package o;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class QwertyKeyboard<T> extends initializeTips {
    private static final List<ShiftType> getMin = Arrays.asList(new ShiftType[]{new SecureFrameLayout(), new SecureAccessbilityDelegate()});

    public final class QwertType {
        public static final Comparator<Method> setMax = new Comparator<Method>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                Method method = (Method) obj;
                Method method2 = (Method) obj2;
                int hashCode = method.getName().hashCode();
                int hashCode2 = method2.getName().hashCode();
                if (hashCode != hashCode2) {
                    return hashCode < hashCode2 ? -1 : 1;
                }
                return QwertType.setMin.compare(method, method2);
            }
        };
        public static final Comparator<Method> setMin = new Comparator<Method>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                Method method = (Method) obj;
                Method method2 = (Method) obj2;
                int compareTo = method.getName().compareTo(method2.getName());
                if (compareTo != 0) {
                    return compareTo;
                }
                return method.toString().compareTo(method2.toString());
            }
        };
    }

    public interface ShiftType {
    }
}
