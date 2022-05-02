package o;

import android.os.Looper;
import java.io.PrintStream;
import java.util.logging.Level;

public interface AliKeyboardType {
    void log(Level level, String str);

    void log(Level level, String str, Throwable th);

    public static class getMin implements AliKeyboardType {
        public final void log(Level level, String str) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
        }

        public final void log(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
            th.printStackTrace(System.out);
        }
    }

    public static class setMin {
        public static AliKeyboardType get() {
            if (!showKeyboard.isAndroidLogAvailable() || getAndroidMainLooperOrNull() == null) {
                return new getMin();
            }
            return new showKeyboard("EventBus");
        }

        static Object getAndroidMainLooperOrNull() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }
}
