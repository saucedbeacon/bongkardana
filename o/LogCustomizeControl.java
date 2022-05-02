package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class LogCustomizeControl {
    public static final List<getMin> getMax = new ArrayList();
    public static volatile getMin[] length = setMax;
    private static final getMin[] setMax = new getMin[0];
    public static final getMin setMin = new getMin() {
        public final void length(String str, Object... objArr) {
            for (getMin length : LogCustomizeControl.length) {
                length.length(str, objArr);
            }
        }

        public final void getMin(String str, Object... objArr) {
            for (getMin min : LogCustomizeControl.length) {
                min.getMin(str, objArr);
            }
        }

        public final void setMax(String str, Object... objArr) {
            for (getMin max : LogCustomizeControl.length) {
                max.setMax(str, objArr);
            }
        }

        public final void setMax(Throwable th, String str, Object... objArr) {
            for (getMin max : LogCustomizeControl.length) {
                max.setMax(th, str, objArr);
            }
        }

        public final void getMin(Throwable th) {
            for (getMin min : LogCustomizeControl.length) {
                min.getMin(th);
            }
        }

        public final void getMax(Throwable th, String str, Object... objArr) {
            for (getMin max : LogCustomizeControl.length) {
                max.getMax(th, str, objArr);
            }
        }

        public final void length(Throwable th) {
            for (getMin length : LogCustomizeControl.length) {
                length.length(th);
            }
        }

        /* access modifiers changed from: protected */
        public final void getMax(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1450636255, oncanceled);
                onCancelLoad.getMin(-1450636255, oncanceled);
            }
            throw new AssertionError("Missing override for log method.");
        }
    };

    @NotNull
    public static getMin length(String str) {
        for (getMin getmin : length) {
            getmin.length.set(str);
        }
        return setMin;
    }

    public static int getMin() {
        int size;
        synchronized (getMax) {
            size = getMax.size();
        }
        return size;
    }

    public static abstract class getMin {
        final ThreadLocal<String> length = new ThreadLocal<>();

        /* access modifiers changed from: protected */
        public abstract void getMax(int i);

        public void length(String str, Object... objArr) {
            length(3, (Throwable) null, str);
        }

        public void getMin(String str, Object... objArr) {
            length(4, (Throwable) null, str);
        }

        public void setMax(String str, Object... objArr) {
            length(5, (Throwable) null, str);
        }

        public void setMax(Throwable th, String str, Object... objArr) {
            length(5, th, str);
        }

        public void getMin(Throwable th) {
            length(5, th, (String) null);
        }

        public void getMax(Throwable th, String str, Object... objArr) {
            length(6, th, str);
        }

        public void length(Throwable th) {
            length(6, th, (String) null);
        }

        private static String getMax(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void length(int i, Throwable th, String str) {
            if (this.length.get() != null) {
                this.length.remove();
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str == null) {
                if (th != null) {
                    getMax(th);
                } else {
                    return;
                }
            } else if (th != null) {
                getMax(th);
            }
            getMax(i);
        }
    }
}
