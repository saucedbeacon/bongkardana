package o;

import java.io.File;
import java.io.IOException;

public interface getContentPaddingBottom {
    public static final getContentPaddingBottom length = new getContentPaddingBottom() {
        public final void getMax(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }
    };

    void getMax(File file);
}
