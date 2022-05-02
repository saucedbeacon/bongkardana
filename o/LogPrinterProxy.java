package o;

import java.security.AccessController;
import java.security.PrivilegedAction;
import o.LogItem;
import o.SecureQwertyKeyboard;

public abstract class LogPrinterProxy {
    private static LogPrinterProxy setMin;

    public Class<?> length() {
        return null;
    }

    public abstract traceInfo length(ClassLoader classLoader, Object obj);

    public abstract Object setMin(Object obj);

    static LogPrinterProxy getMin() {
        return setMin;
    }

    public static traceInfo setMin(ClassLoader classLoader, Object obj) {
        SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
        if (classLoader == null) {
            classLoader = floatRange.equals();
        }
        LogPrinterProxy logPrinterProxy = setMin;
        if (logPrinterProxy == null) {
            logPrinterProxy = floatRange.hashCode;
        }
        if (logPrinterProxy == null) {
            return (traceInfo) AccessController.doPrivileged(new PrivilegedAction<onStatistic>(classLoader) {
                final /* synthetic */ ClassLoader setMax;

                {
                    this.setMax = r2;
                }

                public final /* synthetic */ Object run() {
                    return new onStatistic(this.setMax);
                }
            });
        }
        return logPrinterProxy.length(classLoader, logPrinterProxy.setMin(obj));
    }

    public static Class<?> getMax() {
        SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
        LogPrinterProxy logPrinterProxy = setMin;
        if (logPrinterProxy == null) {
            logPrinterProxy = floatRange.hashCode;
        }
        if (logPrinterProxy == null) {
            return null;
        }
        return logPrinterProxy.length();
    }

    public Object getMin(Object obj, SecureQwertyKeyboard.AnonymousClass1 r2, final announceSwitchKeyboard announceswitchkeyboard, final LogUtils logUtils, final Object[] objArr) {
        new LogItem.TracerInfo() {
        };
        throw new IllegalStateException("callWithDomain should be overridden");
    }
}
