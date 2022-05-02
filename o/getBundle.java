package o;

import androidx.annotation.NonNull;
import java.io.IOException;

abstract class getBundle {
    /* access modifiers changed from: package-private */
    public abstract <T extends Appendable & CharSequence> void length(@NonNull T t, @NonNull String str);

    getBundle() {
    }

    static class setMin extends getBundle {
        setMin() {
        }

        /* access modifiers changed from: package-private */
        public final <T extends Appendable & CharSequence> void length(@NonNull T t, @NonNull String str) {
            int length;
            CharSequence charSequence = (CharSequence) t;
            int length2 = charSequence.length();
            int length3 = str.length();
            boolean z = false;
            for (int i = 0; i < length3; i++) {
                char charAt = str.charAt(i);
                if (Character.isWhitespace(charAt)) {
                    z = true;
                } else {
                    if (z && (length = charSequence.length()) > 0 && !Character.isWhitespace(charSequence.charAt(length - 1))) {
                        try {
                            t.append(' ');
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    try {
                        t.append(charAt);
                        z = false;
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            if (z && length2 < charSequence.length()) {
                try {
                    t.append(' ');
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
    }
}
