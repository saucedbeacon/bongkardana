package o;

import java.io.IOException;

public final class getKeyboard extends bindKeyboard {
    private final Appendable setMax;

    public getKeyboard() {
        this(new StringBuilder());
    }

    private getKeyboard(Appendable appendable) {
        this.setMax = appendable;
    }

    /* access modifiers changed from: protected */
    public final void setMin(String str) {
        try {
            this.setMax.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax(char c) {
        try {
            this.setMax.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public final String toString() {
        return this.setMax.toString();
    }

    public static String getMax(KeyboardManager keyboardManager) {
        getKeyboard getkeyboard = new getKeyboard();
        keyboardManager.describeTo(getkeyboard);
        return getkeyboard.toString();
    }
}
