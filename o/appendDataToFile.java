package o;

import java.util.ArrayList;

public class appendDataToFile extends ArrayList<MdapFileLogAppender> {
    private static final int INITIAL_CAPACITY = 16;
    private final int maxSize;

    appendDataToFile(int i, int i2) {
        super(i);
        this.maxSize = i2;
    }

    /* access modifiers changed from: package-private */
    public boolean canAddError() {
        return size() < this.maxSize;
    }

    /* access modifiers changed from: package-private */
    public int getMaxSize() {
        return this.maxSize;
    }

    public static appendDataToFile noTracking() {
        return new appendDataToFile(0, 0);
    }

    public static appendDataToFile tracking(int i) {
        return new appendDataToFile(16, i);
    }
}
