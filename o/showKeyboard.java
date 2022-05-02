package o;

import java.util.logging.Level;

public final class showKeyboard implements AliKeyboardType {
    private static final boolean ANDROID_LOG_AVAILABLE;
    private final String tag;

    static {
        boolean z = false;
        try {
            if (Class.forName("android.util.Log") != null) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        }
        ANDROID_LOG_AVAILABLE = z;
    }

    public static boolean isAndroidLogAvailable() {
        return ANDROID_LOG_AVAILABLE;
    }

    public showKeyboard(String str) {
        this.tag = str;
    }

    public final void log(Level level, String str) {
        if (level != Level.OFF) {
            mapLevel(level);
        }
    }

    public final void log(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            mapLevel(level);
        }
    }

    private int mapLevel(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }
}
