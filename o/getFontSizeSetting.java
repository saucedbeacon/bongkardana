package o;

public final class getFontSizeSetting implements getAdapterPosition<FontSizeSetting> {

    static final class length {
        /* access modifiers changed from: private */
        public static final getFontSizeSetting getMin = new getFontSizeSetting();
    }

    public final FontSizeSetting get() {
        return newInstance();
    }

    public static getFontSizeSetting create() {
        return length.getMin;
    }

    public static FontSizeSetting newInstance() {
        return new FontSizeSetting();
    }
}
