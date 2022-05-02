package o;

public interface CountValue {
    public static final CountValue setMin = new getMin();

    public static final class getMin implements CountValue {
        public final CountValue getMax(Object obj) {
            return this;
        }

        public final CountValue getMin(String str) {
            return this;
        }

        public final CountValue getMin(KeyboardManager keyboardManager) {
            return this;
        }

        public final String toString() {
            return "";
        }
    }

    CountValue getMax(Object obj);

    CountValue getMin(String str);

    CountValue getMin(KeyboardManager keyboardManager);
}
