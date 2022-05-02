package o;

import id.dana.lib.gcontainer.app.bridge.subapp.CloseSubAppEvent;
import kotlin.UShort;

public final class announceTextOut {
    public static boolean getMin(int i) {
        return i == 3 || i == 4;
    }

    public static final int getMin(String str, SecureMoneyKeyboard secureMoneyKeyboard) {
        if (str.length() != 1) {
            return ((secureMoneyKeyboard.length(str) & UShort.MAX_VALUE) << 8) | 7;
        }
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return 2;
        }
        if (!(charAt == 'S' || charAt == 'Z' || charAt == 'I')) {
            if (charAt == 'J') {
                return 4;
            }
            switch (charAt) {
                case 'B':
                case 'C':
                    break;
                case 'D':
                    return 3;
                default:
                    throw new IllegalArgumentException("bad type");
            }
        }
        return 1;
    }

    static String getMax(int i, SecureMoneyKeyboard secureMoneyKeyboard) {
        int i2 = i & 255;
        switch (i2) {
            case 0:
                return CloseSubAppEvent.TOP;
            case 1:
                return "int";
            case 2:
                return "float";
            case 3:
                return "double";
            case 4:
                return "long";
            case 5:
                return "null";
            case 6:
                return "uninitialized_this";
            default:
                if (i2 == 7) {
                    return setMax(i, secureMoneyKeyboard);
                }
                if (i2 == 8) {
                    return "uninitialized";
                }
                throw new IllegalArgumentException("bad type");
        }
    }

    static Class<?> length(String str) {
        try {
            return Class.forName(str.replace('/', '.'));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static String setMax(int i, SecureMoneyKeyboard secureMoneyKeyboard) {
        if ((i & 255) == 7) {
            return (String) secureMoneyKeyboard.length.getObject(i >>> 8);
        }
        throw new IllegalArgumentException("expecting object type");
    }
}
