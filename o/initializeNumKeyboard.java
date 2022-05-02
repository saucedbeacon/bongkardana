package o;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

public class initializeNumKeyboard {
    final Class<?> eventType;
    final Method method;
    String methodString;
    final int priority;
    final boolean sticky;
    final ThreadMode threadMode;

    public initializeNumKeyboard(Method method2, Class<?> cls, ThreadMode threadMode2, int i, boolean z) {
        this.method = method2;
        this.threadMode = threadMode2;
        this.eventType = cls;
        this.priority = i;
        this.sticky = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof initializeNumKeyboard)) {
            return false;
        }
        checkMethodString();
        initializeNumKeyboard initializenumkeyboard = (initializeNumKeyboard) obj;
        initializenumkeyboard.checkMethodString();
        return this.methodString.equals(initializenumkeyboard.methodString);
    }

    private synchronized void checkMethodString() {
        if (this.methodString == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.method.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.method.getName());
            sb.append('(');
            sb.append(this.eventType.getName());
            this.methodString = sb.toString();
        }
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
